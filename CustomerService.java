package service;

import dao.CustomerDao;
import java.util.List;
import model.Customer;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService() {
        customerDao = new CustomerDao();
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public void deleteCustomer(String maNV) {
        customerDao.deleteCustomer(maNV);
    }

    public Customer getCustomerById(String maNV) {
        return customerDao.getCustomerById(maNV);
    }

    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }
    
    public List<Customer> searchCustomers(String valToSearch) {
        return customerDao.searchCustomers(valToSearch);
    }
}
