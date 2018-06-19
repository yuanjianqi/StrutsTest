package com.yuan.iliya.crud.dao;

import com.yuan.iliya.crud.entity.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 19:19
 * @copyright ©2018
 */
public interface Dao {
    public void save(Customer customer);
    public void update(Customer customer);
    public  void delete(Serializable id);
    public Customer getCustomer(Serializable id);
    public List<Customer> getCustomerForList();
}
