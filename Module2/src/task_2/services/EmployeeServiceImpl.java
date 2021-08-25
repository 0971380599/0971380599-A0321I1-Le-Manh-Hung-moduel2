package task_2.services;

import bai_12_java_collection_frameword.bai_tap.luyen_tap_su_dung_array_list_va_linked_list_trong_java_collection_framework.Product;
import task_2.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static ArrayList<Employee> employeesList = new ArrayList<Employee>();
    static {
        employeesList.add(new Employee("Le Manh Hung", "1/1/1999", "Nam", 184288752, "0971645756", "lemanhhung1999@gmail.com", 106170091, 2, 5, 50000000 ));
        employeesList.add(new Employee("Pham Thi Quynh Nhu", "27/5/1999", "Nu", 184584935, "0971356478", "phamthiquynhnhu1999@gmail.com", 106170092, 2, 4, 30000000 ));
    }
    static Scanner input = new Scanner(System.in);
    public static void displayListEmployees() {
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }
    public static void addNewEmployee() {
        System.out.println("Enter name :");
        String name = input.nextLine();
        System.out.println("Enter dateOfBirth :");
        String dateOfBirth = input.nextLine();
        System.out.println("Enter sex :");
        String sex = input.nextLine();
        System.out.println("Enter identityCardNumber :");
        int identityCardNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter telephoneNumber :");
        String telephoneNumber = input.nextLine();
        System.out.println("Enter email :");
        String email = input.nextLine();
        System.out.println("Enter employeeCode :");
        int employeeCode = input.nextInt();
        System.out.println("Enter degree :");
        int degree = input.nextInt();
        System.out.println("Enter position :");
        int position = input.nextInt();
        System.out.println("Enter salary :");
        float salary = input.nextInt();
        employeesList.add(new Employee(name,dateOfBirth,sex,identityCardNumber,telephoneNumber,email,employeeCode,degree,position,salary));
    }
    public static Employee isEmployee(int employeeCode) {
        for (Employee employees : employeesList) {
            if (employees.getEmployeeCode() == employeeCode) {
                return employees;
            }
        }
        return null;
    }
    public static void editEmployee() {
        System.out.println("Enter employeeCode:");
        int employeeCode = input.nextInt();
        Employee employee = isEmployee(employeeCode);
        input.nextLine();
        if (employee != null) {
            System.out.println("Enter choice: ");
            System.out.println("1. TelephoneNumber:  ");
            System.out.println("2. Email: ");
            System.out.println("3. degree: ");
            System.out.println("4. position: ");
            System.out.println("5. salary: ");
            System.out.println("6. displayListEmployees: ");
            int choice = 1;
            String telephoneNumber;
            String email;
            int degree;
            int position;
            float salary;
            double price;
            while (choice != 0) {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new TelephoneNumber:");
                        telephoneNumber = input.nextLine();
                        employee.setTelephoneNumber(telephoneNumber);
                        displayListEmployees();
                        break;
                    case 2:
                        System.out.println("Enter new email:");
                        email = input.nextLine();
                        employee.setEmail(email);
                        displayListEmployees();
                        break;
                    case 3:
                        System.out.println("Enter new degree:");
                        degree = input.nextInt();
                        input.nextLine();
                        employee.setDegree(degree);
                        displayListEmployees();
                        break;
                    case 4:
                        System.out.println("Enter new position:");
                        position = input.nextInt();
                        input.nextLine();
                        employee.setPosition(position);
                        displayListEmployees();
                        break;
                    case 5:
                        System.out.println("Enter new salary:");
                        salary = input.nextFloat();
                        input.nextLine();
                        employee.setSalary(salary);
                        displayListEmployees();
                        break;
                    case 6:
                        displayListEmployees();
                        break;
                }
            }
        } else {
            System.out.println("id not found");
            editEmployee();
        }
    }
}
