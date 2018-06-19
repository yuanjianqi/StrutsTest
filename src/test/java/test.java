import com.yuan.iliya.crud.dao.Dao;
import com.yuan.iliya.crud.dao.impl.DaoImpl;
import com.yuan.iliya.crud.entity.Customer;
import org.junit.Test;

import java.util.List;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 20:09
 * @copyright ©2018
 */
public class test {
    Dao dao = new DaoImpl();
    @Test
    public void test(){
        List<Customer> customers = dao.getCustomerForList();
        System.out.println(customers);
    }
}
