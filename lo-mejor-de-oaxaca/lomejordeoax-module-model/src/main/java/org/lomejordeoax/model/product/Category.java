package org.lomejordeoax.model.product;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ct_category")
public class Category implements Serializable {
	
	private static final long serialVersionUID = -243174998100310543L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer category_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String picture;
	@Column
	private Integer company_id;
	
	@ManyToOne
	@JoinColumn(name="departament_id")
	private Departament departament;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
			
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Departament getDepartament() {
		return departament;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getModification_date() {
		return modification_date;
	}
	public void setModification_date(Date modification_date) {
		this.modification_date = modification_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", name=" + name
				+ ", description=" + description + ", picture=" + picture
				+ ", company_id=" + company_id + ", departament=" + departament
				+ ", created_date=" + created_date + ", modification_date="
				+ modification_date + "]";
	}
	
}
