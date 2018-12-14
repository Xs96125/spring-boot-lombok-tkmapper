package com.baizhi.xs.conttroller;

import com.baizhi.xs.entity.Address;
import com.baizhi.xs.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressMapper addressMapper;
    @Autowired


    @RequestMapping("query")
    public List<Address> query(){

        return addressMapper.selectAll();
    }
}
