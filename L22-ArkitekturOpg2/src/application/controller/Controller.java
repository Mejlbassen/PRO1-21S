package application.controller;

import application.model.Company;
import application.model.Customer;
import application.model.Employee;
import storage.Storage;

import java.util.ArrayList;

public class Controller {
    /**
     * Creates a new Company.<br />
     * Requires: hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.addCompany(company);
        return company;
    }

    public static Customer createCustomer(String navn){
        Customer customer = new Customer(navn);
        Storage.addCustomer(customer);
        return customer;
    }

    /**
     * Deletes the company.<br />
     * Requires: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        Storage.removeCompany(company);
    }

    /**
     * Updates the company.<br />
     * Requires: hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Get all the companies
     */
    public static ArrayList<Company> getCompanies() {
        return Storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0.
     */
    public static Employee createEmployee(String name, int wage, int employementYear) {
        Employee employee = new Employee(name, wage, employementYear);
        Storage.addEmployee(employee);
        return employee;
    }

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0, company!=null.
     */
    public static Employee createEmployee(String name, int wage, int employementYear, Company company) {
        Employee employee = createEmployee(name, wage, employementYear);
        company.addEmployee(employee);
        return employee;
    }

    /**
     * Deletes the employee.
     */
    public static void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
        Storage.removeEmployee(employee);
    }

    /**
     * Updates the employee.<br />
     * Requires: wage >= 0.
     */
    public static void updateEmployee(Employee employee, String name, int wage, int employementYear) {
        employee.setName(name);
        employee.setWage(wage);
        employee.setEmployementYear(employementYear);
    }
    
    /**
     * Adds the employee to the company. Removes the employee from the old company if present.
     */
    public static void addEmployeeToCompany(Employee employee, Company company) {
        company.addEmployee(employee);
    }

    public static void addCustomerToCompany(Customer customer, Company company){company.addCustomers(customer);}
    
    /**
     * Removes the employee from the old company if not null.
     * @param company The old company. Can be null.
     * @param employee The employee to remove.
     */
    public static void removeEmployeeFromCompany(Employee employee, Company company) {
        if (company != null) {
            company.removeEmployee(employee);            
        }
    }

    public static void removeCustomerFromCompany(Customer customer, Company company){
        if (company != null){
            company.addCustomers(customer);
        }
    }

    /**
     * Get all the employees.
     */
    public static ArrayList<Employee> getEmployees() {
        return Storage.getEmployees();
    }

    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        Company c1 = Controller.createCompany("IBM", 37);
        Company c2 = Controller.createCompany("AMD", 40);
        Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Controller.createEmployee("Bob Dole", 210, 2011, c2);
        Controller.createEmployee("Alice Schmidt", 250, 2020, c1);
        Controller.createEmployee("George Down", 150, 2005, c2);

        Controller.createEmployee("Rita Uphill", 300, 1991);

        Controller.createCustomer("Henrik");
        Controller.createCustomer("Jens");
    }

    public static void init() {

        initStorage();

    }

}
