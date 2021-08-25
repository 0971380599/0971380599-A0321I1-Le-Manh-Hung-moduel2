package case_study.services;

import case_study.models.Employee;

public interface EmployeeService extends Service{
    public void addNewEmployee();
    public void displayListEmployees();
    public Employee isEmployee(int employeeCode);
    public void editEmployee();
}
