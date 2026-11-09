public class Main {
    static void main(String[] args) {

        // Create instances of each class
        EmployePermanent employePermanent = new EmployePermanent("John Doe", 4500);
        EmployeFreelance employeFreelance = new EmployeFreelance("Bob Johnson", 3000);

        // Test the permanent
        System.out.print("========== Permanent Employee ==========\n");
        employePermanent.showInfo();
        System.out.println("Salary Net (15% VAT): $" + employePermanent.calculateSalary());

        // Test the freelance
        System.out.print("\n========== Freelance Employee ==========\n");
        employeFreelance.showInfo();
        System.out.println("Salary Net (20% VAT): $" + employeFreelance.calculateSalary());
        employeFreelance.workOnline();

        // Polymorphism test
        System.out.print("\n========== Polymorphism ==========\n");
        Employe[] employes = {employePermanent, employeFreelance};
        for (Employe e : employes) {
            e.showInfo();
            System.out.println("Salary Net: " + e.calculateSalary());

            if (e instanceof WorkRemotely) {
                ((WorkRemotely) e).workOnline();
            }
        }
    }
}
