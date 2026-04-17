import java.util.*;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Liaman", "Shakhbazova", 5000));
        list.add(new Employee("Natavan", "Rzayeva", 6000));
        list.add(new Employee("Zhasmin", "Mamedova", 4500));

        Function<Employee, String> formatCard =
                e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();
        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee e : list) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary only: " + salaryPicker.apply(e));
            System.out.println();
        }
    }
}