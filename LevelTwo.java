package com.jspiders.school.entity;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="level_two")
public class LevelTwo implements Serializable {

	@Id
	@GenericGenerator(name = "key_auto", strategy = "increment")
	@GeneratedValue(generator = "key_auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="fees")
	private Double fees;
	
	@Column(name="home")
	private String home;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "LevelTwo [id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + ", home=" + home + "]";
	}
	
	
}
