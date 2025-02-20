import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating and adding Developers
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        Technology tech = new Technology("Java", 800);
        dev.addTechnology(tech);
        employees.add(dev);

        // Creating and adding Testers
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        employees.add(tester);

        // Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "112233445", 2019);
        Goal goal = new Goal(2010, 10, 15, "Implementing FB login", 1000);
        manager.addGoals(goal);
        employees.add(manager);

        // Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }

        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    }
    }
}