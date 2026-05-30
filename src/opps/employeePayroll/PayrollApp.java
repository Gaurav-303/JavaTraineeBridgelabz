package opps.employeePayroll;

import java.util.Scanner;

public class PayrollApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Tax: ");
        double tax = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        EmployeePayroll payroll =
                new EmployeePayroll(emp, tax, deduction);

        payroll.displayPaySlip();

        sc.close();
    }
}
