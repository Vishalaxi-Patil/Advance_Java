package com.xworkz.rich.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="RICH_PERSON")

public class RichEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="NET_WORTH_IN_BILLION")
	private int netWorthInBillion;
	@Column(name="BUSINESS")
	private String business;
	@Column(name="RANK")
	private int rank;
	@Column(name="MARRIED")
	private boolean married;

}
