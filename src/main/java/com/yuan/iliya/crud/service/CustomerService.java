package com.yuan.iliya.crud.service;

import com.yuan.iliya.crud.entity.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 19:34
 * @copyright ©2018
 */
public interface CustomerService {
    public void saveCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Serializable id);
    public Customer getCustomer(Serializable id);
    public List<Customer> getAllCustomers();
}
