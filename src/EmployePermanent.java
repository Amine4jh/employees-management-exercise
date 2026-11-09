public class EmployePermanent extends Employe {

    EmployePermanent(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return this.salary - (this.salary * 0.15); // e.g., minus 15% of VAT
    }
}
