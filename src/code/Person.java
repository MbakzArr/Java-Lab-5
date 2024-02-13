/** 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga 
**/

import java.time.Year;

class Person {

    // creating instances for the Person class
    private String firstName;
    private String lastName;
    private final int birthYear;
    private String married;
    private double weightLb;
    private String highestEducationLevel;

    // Constructor for the year
    static final int CURRENT_YEAR = Year.now().getValue();

    // Grouping Person instances into a construtor
    Person(String firstName, String lastName, final int birthYear, String married, double weightLb, String highestEducationLevel) {
        if (!isValidMarriageStatus(married) || !isValidEducationLevel(highestEducationLevel)) {
            throw new IllegalArgumentException("Invalid marital status or education level.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.married = married;
        this.weightLb = weightLb;
        this.highestEducationLevel = highestEducationLevel;
    }

    Person(String firstName, String lastName, String married, double weightLb, String highestEducationLevel) {
        this(firstName, lastName, CURRENT_YEAR, married, weightLb, highestEducationLevel);
    }

    Person(String firstName, String lastName, double weightLb) {
        this(firstName, lastName, CURRENT_YEAR, "no", weightLb, "high school");
    }

    // The getters
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getBirthYear() {
        return birthYear;
    }

    String getMarried() {
        return married;
    }

    double getWeightLb() {
        return weightLb;
    }

    String getHighestEducationLevel() {
        return highestEducationLevel;
    }

    // Setter for married status
    void setMarried(String married) {
        if (!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Invalid marital status.");
        }
        this.married = married;
    }

    // Setter for weight in pounds
    void setWeightLb(double weightLb) {
        this.weightLb = weightLb;
    }

    // The helper methods
    boolean isValidMarriageStatus(String married) {
        return married.equals("yes") || married.equals("no") || married.equals("divorced");
    }

    boolean isValidEducationLevel(String educationLevelToVerify) {
        return educationLevelToVerify.equals("high school") || educationLevelToVerify.equals("undergraduate") || educationLevelToVerify.equals("graduate");
    }

    // Overloaded methods for printing details
    void printDetails() {
        printDetails(false, false);
    }

    void printDetails(boolean kilograms) {
        printDetails(kilograms, false);
    }

    void printDetails(boolean kilograms, boolean uppercase) {
        String formattedFirstName = uppercase ? firstName.toUpperCase() : firstName.toLowerCase();
        String formattedLastName = uppercase ? lastName.toUpperCase() : lastName.toLowerCase();
        String formattedMarried = uppercase ? married.toUpperCase() : married.toLowerCase();
        double weight = kilograms ? weightLb * 0.453592 : weightLb;
        String weightUnit = kilograms ? "kilograms" : "pounds";
        System.out.println(String.format("%s %s (%s) was born in %d, weighs %.1f %s, and has an %s degree!",
                formattedFirstName, formattedLastName, formattedMarried, birthYear, weight, weightUnit, highestEducationLevel));
    }

    public static void main(String[] args) {
        Person p1, p2, p3;

        p1 = new Person("Tiger", "Woods", 1975, "divorced", 200, "undergraduate");
        p1.printDetails();
        p1.printDetails(true);
        p1.printDetails(true, true);
        p1.printDetails(true, false);
        p1.printDetails(false, true);
        p1.printDetails(false, false);

        p2 = new Person("Jason", "Wilder", 2000, "no", 180, "graduate");
        p2.printDetails();
        p2.printDetails(true);
        p2.printDetails(true, true);
        p2.printDetails(true, false);
        p2.printDetails(false, true);
        p2.printDetails(false, false);

        p3 = new Person("Santa", "Claus", 1000, "yes", 280, "high school");
        p3.printDetails();
        p3.printDetails(true);
        p3.printDetails(true, true);
        p3.printDetails(true, false);
        p3.printDetails(false, true);
        p3.printDetails(false, false);
    }
}
