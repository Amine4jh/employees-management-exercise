# Employee Management (Java)

A small object-oriented programming exercise in Java, created as part of my journey to learn the language.

The exercise covers the following concepts:

- **abstract classes**
- **inheritance**
- **method overriding** (`@Override`)
- **interfaces**
- **polymorphism**

## Problem Statement

A company wants to develop a Java application to manage its employees. Each employee has a name and a salary.

- The abstract class `Employe` (Employee) contains these two attributes, a constructor to initialize them, a concrete method `showInfo()` (display information), and an abstract method `calculateSalary()`.
- The company distinguishes between two types of employees: `EmployePermanent` and `EmployeFreelance`. Each class inherits from `Employe` and overrides `calculateSalary()`.
- Freelance employees can work remotely: they implement the `WorkRemotely` interface, which contains the method `workOnline()`.

## Tasks

1. Create the abstract class `Employe`.
2. Create the classes `EmployePermanent` and `EmployeFreelance`.
3. Create the interface `WorkRemotely`.
4. Implement all the necessary methods.
5. Create a `Main` class to instantiate both types of employees and test their methods.

## Project Structure

```
.
├── Employe.java            # Abstract class (name, salary, showInfo(), calculateSalary())
├── EmployePermanent.java   # Extends Employe
├── EmployeFreelance.java   # Extends Employe and implements WorkRemotely
├── WorkRemotely.java       # Interface (workOnline())
├── Main.java               # Test program
└── README.md
```

## Class Diagram

```
        <<abstract>>                       <<interface>>
          Employe                           WorkRemotely
   ---------------------                 ------------------
   - name : String                          + workOnline()
   - salary : double                            ^
   ---------------------                         .
   + showInfo()                                  .
   + calculateSalary()  {abstract}               .
        ^            ^                           .
        |            |                           .
EmployePermanent  EmployeFreelance - - - - - - - '
                  (implements WorkRemotely)
```

## Compiling and Running

Requirement: a **JDK** installed (Java 8 or higher).

```bash
# Compile all files
javac *.java

# Run the program
java Main
```

## Output

Expected output after running the program:

```
========== Permanent Employee ==========
Name: John Doe | Salary: $4500.0
Salary Net (15% VAT): $3825.0

========== Freelance Employee ==========
Name: Bob Johnson | Salary: $3000.0
Salary Net (20% VAT): $2400.0
I'm working online!

========== Polymorphism ==========
Name: John Doe | Salary: $4500.0
Salary Net: 3825.0
Name: Bob Johnson | Salary: $3000.0
Salary Net: 2400.0
I'm working online!
```

## What I Learned

- An abstract class cannot be instantiated directly; it serves as a common base for its subclasses.
- An abstract method must be overridden in every concrete subclass.
- A class can extend only one class (`extends`) but can implement several interfaces (`implements`).
- Polymorphism lets me handle `EmployePermanent` and `EmployeFreelance` objects through the `Employe` type.

## Author

Personal learning project. Feel free to explore the code and suggest improvements!
