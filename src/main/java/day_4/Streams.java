package day_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(1,200,"Sashka","Shlyapik"),
                new Employee(2,1200, "Tolik", "Stepankovskiy"),
                new Employee(3,3000, "Petro","Sagaidachniy"),
                new Employee(4, 100, "Poor", "Man")
        ));
        System.out.println(getRichEmployeesAndForceThemToPayMoreTax(employees));
    }

    public static List<String> getRichEmployeesAndForceThemToPayMoreTax(List<Employee> employees) {
        List<String> richEmployeesNames = new ArrayList<>();
        employees.stream()
                .filter(employee -> employee.getSalary() > 1000)
                .forEach(employee -> richEmployeesNames.add(employee.getFirstName()));
        return richEmployeesNames;
    }
}
