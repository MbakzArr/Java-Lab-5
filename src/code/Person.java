import java.time.Year;
public class Person
{
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final String married;
    private final double weightInPounds;
    private final String highestEducationLevel;
    public Person(final String firstName,
                  final String lastName,
                  final int birthYear,
                  final String married,
                  final double weightInPounds,
                  final String highestEducationLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.married = married;
        this.weightInPounds = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;
    }

    public Person(final String firstName,
                  final String lastName,
                  final String married,
                  final double weightInPounds,
                  final String highestEducationLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.married = married;
        this.weightInPounds = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;
        public static final int CURRENT_YEAR
    }
    public Person(final String firstName,
                  final String lastName,
                  final double weightInPounds,)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weightInPounds = weightInPounds;
    }

}