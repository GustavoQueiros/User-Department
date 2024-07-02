package com.devsuperior.userdept.entity;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "tb_user" )
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public User(){

    }

}
