package com.yuan.iliya.crud.service.impl;

import com.yuan.iliya.crud.dao.Dao;
import com.yuan.iliya.crud.dao.impl.DaoImpl;
import com.yuan.iliya.crud.entity.Customer;
import com.yuan.iliya.crud.service.CustomerService;

import java.io.Serializable;
import java.util.List;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 19:35
 * @copyright ©2018
 */
public class CustomerServiceImpl implements CustomerService {
    private Dao dao = new DaoImpl();
    public void saveCustomer(Customer customer) {
        dao.save(customer);

    }

    public void updateCustomer(Customer customer) {
        dao.update(customer);

    }

    public void deleteCustomer(Serializable id) {
        dao.delete(id);

    }

    public Customer getCustomer(Serializable id) {
        return dao.getCustomer(id);
    }

    public List<Customer> getAllCustomers() {
        return dao.getCustomerForList();
    }
}
