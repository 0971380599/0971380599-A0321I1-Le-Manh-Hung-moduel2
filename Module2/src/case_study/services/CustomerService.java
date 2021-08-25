package case_study.services;

import case_study.models.Customer;

public interface CustomerService extends Service {
    public void displayListCustomer();
    public void addNewCustomer();
    public Customer isCustomer(int customerCode);
    public void editCustomer();
}
