package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Getter
	@Setter
	private Integer id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String address;

	@Getter
	@Setter
	private String loginId;

	@Getter
	@Setter
	private String loginPass;

	@Getter
	@Setter
	private Date createDate;
}
