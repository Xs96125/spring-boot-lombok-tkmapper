package com.baizhi.xs.conttroller;

import com.baizhi.xs.entity.Order;
import com.baizhi.xs.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("o")
public class OrderrController {
    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping("query")
    public List<Order> queryAll(){
       return orderMapper.selectAll();
    }
}
