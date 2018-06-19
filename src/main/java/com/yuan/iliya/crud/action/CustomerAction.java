package com.yuan.iliya.crud.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yuan.iliya.crud.entity.Customer;
import com.yuan.iliya.crud.service.CustomerService;
import com.yuan.iliya.crud.service.impl.CustomerServiceImpl;

import java.util.List;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 19:37
 * @copyright ©2018
 */
public class CustomerAction extends ActionSupport {
    private CustomerService customerService = new CustomerServiceImpl();
    private Customer customer;
    private List<Customer> customers;
    private String id;



    public String login(){
        if (customerService.getCustomer(id).getName() != null){
            System.out.println(id);

            return "success";
        }
        return "login";
    }

    public String listUI(){
        customers = customerService.getAllCustomers();

        return "listUI";
    }

    public String addUI(){


        return "addUI";
    }

    public String add(){
        if (customer != null){
            customerService.saveCustomer(customer);
        }
        return "list";
    }


    public String delete(){
        if (id != null){
            customerService.deleteCustomer(id);
        }

        return "list";
    }
    public String editUI(){
        customer = customerService.getCustomer(id);

        return "editUI";
    }

    public String edit(){
        if (customer != null){
            customerService.updateCustomer(customer);
        }

        return "list";
    }

    public CustomerAction() {
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
