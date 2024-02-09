package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="eid")
private Long eid;

@Column(name="ename")
private String ename;

@Column(name="salary")
private Long salary;

@Column(name="Dept")
private String Dept;

@Column(name="eaddr")
private String eaddr;


}
