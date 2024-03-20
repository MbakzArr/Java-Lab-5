# Person Class

## Description
This Java class represents a person with attributes such as first name, last name, birth year, marital status, weight, and highest education level. It provides constructors to initialize these attributes and methods to retrieve and print details about the person.

## Usage

```java
public static void main(final String[] args)
{
    Person p1;
    Person p2;
    Person p3;
    
    // Example usage of constructors and printDetails method
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
```

## Methods

### Constructors

1. `Person(String firstName, String lastName, int birthYear, String married, double weight, String educationLevel)`: Initializes a person object with all attributes provided.
2. `Person(String firstName, String lastName, String married, double weight, String educationLevel)`: Initializes a person object with birth year set to the current year.
3. `Person(String firstName, String lastName, double weight)`: Initializes a person object with birth year set to the current year, married status set to "no", and highest education level set to "high school".

### Public Methods

- `printDetails()`: Prints the details of the person.
- `printDetails(boolean kilograms)`: Prints the details of the person, with weight converted to kilograms if `true` is passed.
- `printDetails(boolean kilograms, boolean uppercase)`: Prints the details of the person, with weight converted to kilograms if `true` is passed, and names printed in uppercase if `true` is passed.

## Example Output

```
Tiger Woods (divorced) was born in 1975, weighs 200.0 pounds, and has an undergraduate degree!
Tiger Woods (divorced) was born in 1975, weighs 90.9 kilograms, and has an undergraduate degree!
TIGER WOODS (divorced) was born in 1975, weighs 90.9 kilograms, and has an undergraduate degree!
tiger woods (divorced) was born in 1975, weighs 90.9 kilograms, and has an undergraduate degree!
TIGER WOODS (divorced) was born in 1975, weighs 200.0 pounds, and has an undergraduate degree!
tiger woods (divorced) was born in 1975, weighs 200.0 pounds, and has an undergraduate degree!

Jason Wilder (single) was born in 2000, weighs 180.0 pounds, and has a graduate degree!
Jason Wilder (single) was born in 2000, weighs 81.8 kilograms, and has a graduate degree!
JASON WILDER (single) was born in 2000, weighs 81.8 kilograms, and has a graduate degree!
jason wilder (single) was born in 2000, weighs 81.8 kilograms, and has a graduate degree!
JASON WILDER (single) was born in 2000, weighs 180.0 pounds, and has a graduate degree!
jason wilder (single) was born in 2000, weighs 180.0 pounds, and has a graduate degree!

Santa Claus (married) was born in 1000, weighs 280.0 pounds, and has a high school diploma!
Santa Claus (married) was born in 1000, weighs 127.3 kilograms, and has a high school diploma!
SANTA CLAUS (married) was born in 1000, weighs 127.3 kilograms, and has a high school diploma!
santa claus (married) was born in 1000, weighs 127.3 kilograms, and has a high school diploma!
SANTA CLAUS (married) was born in 1000, weighs 280.0 pounds, and has a high school diploma!
santa claus (married) was born in 1000, weighs 280.0 pounds, and has a high school diploma!
```
