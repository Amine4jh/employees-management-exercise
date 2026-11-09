public abstract class Employe {
    protected String name;
    protected double salary;

    Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showInfo () {
        System.out.println("Name: " + this.name + " | Salary: $" + this.salary);
    }

    abstract void calculateSalary();
}
