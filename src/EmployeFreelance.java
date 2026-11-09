public class EmployeFreelance extends Employe implements WorkRemotely{

    EmployeFreelance(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return this.salary - (this.salary * 0.20); // e.g., minus 20% of VAT
    }

    public void workOnline() {
        System.out.println("I'm working online!");
    }
}
