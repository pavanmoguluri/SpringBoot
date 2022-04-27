package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="sample")
public class entity  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  id;
	
	private String name;

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

	public entity() {
		super();
	}

	public entity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
