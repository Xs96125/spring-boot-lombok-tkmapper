package com.baizhi.xs;

import com.baizhi.xs.entity.Address;
import com.baizhi.xs.entity.Order;
import com.baizhi.xs.mapper.AddressMapper;
import com.baizhi.xs.mapper.OrderMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLombokTkmapperApplicationTests {
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private OrderMapper orderMapper;


    @Test
    public void test1() {
        List<Address> addresses = addressMapper.selectAll();
        for (Address address : addresses) {
            System.out.println(address);
        }

    }

    @Test
    public void test2() {

        Address t = new Address(null, "左一峰", "向阳", "12312312312", 2);
        addressMapper.insert(t);
    }

    @Test
    public void test3() {
        Address address = new Address(null,null,null,null,null);
        RowBounds rowBounds = new RowBounds(25,5);
        System.out.println(addressMapper.selectByRowBounds(address,rowBounds));

    }

    @Test
    public void test4() {
        List<Order> x = orderMapper.selectAll();
        for (Order order : x) {
            System.out.println(order);
        }


    }



}
