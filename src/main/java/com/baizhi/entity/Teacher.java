package com.baizhi.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Getter
@Setter
@ToString
@Table(name = "teacher")
public class Teacher {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int user_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "age")
    private int age;
    @Transient
    private String test;
}
