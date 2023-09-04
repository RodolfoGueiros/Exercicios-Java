package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Informe o nome: ");
        employee.name = sc.nextLine();

        System.out.println("Informe o salário: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Informe o imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

        sc.close();
    }
}