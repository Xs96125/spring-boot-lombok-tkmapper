package com.baizhi.xs.entity;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderr")
public class Order implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    @Column(name = "orderTime")
   /* @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")*/
    private Date orderTime;
    @Column(name ="userId" )
    private Long userId;
    @Column(name ="addressId" )
    private Long addressId;

}
