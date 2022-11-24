package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Monster {
    @Id @GeneratedValue
    private Long id;
    private String tribe;
    private String name;
    private int attack;
    private int defense;
    private String description;
}
