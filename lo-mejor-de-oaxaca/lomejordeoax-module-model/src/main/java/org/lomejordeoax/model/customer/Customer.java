package org.lomejordeoax.model.customer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.lomejordeoax.model.address.Address;
import org.lomejordeoax.model.address.Phone;

@Entity
@Table(name = "ta_customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 4307585101753877117L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customer_id;
	@Column
	private String first_name;
	@Column
	private String middle_name;
	@Column
	private String last_name;
	@Column
	private String second_last_name;
	@Column
	private String email;
	@Column
	@Temporal(TemporalType.DATE)
	private Date birth_date;
	@Column
	private Character sex;
	@Column
	private String position;
	@Column
	private String agent;
	@Column
	private String rfc;
	@Column
	private String curp;
	@Column
	private boolean retention_tax;
	@Column
	private boolean breakdown_IEPS;
	@Column
	private double credit_limit;
	@Column
	private int credit_days;
	@Column
	private Integer employee_id;
	@Column
	private Integer customer_status_id;
	@Column
	private Integer company_id;
	@Column
	private Integer sale_price_id;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ta_customer_address", 
	joinColumns ={ @JoinColumn(name = "customer_id")},
	inverseJoinColumns ={ @JoinColumn(name = "address_id") })
	private List<Address> address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ta_customer_phone", 
	joinColumns ={ @JoinColumn(name = "customer_id")},
	inverseJoinColumns ={ @JoinColumn(name = "phone_id") })
	private List<Phone> phones;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSecond_last_name() {
		return second_last_name;
	}

	public void setSecond_last_name(String second_last_name) {
		this.second_last_name = second_last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public boolean isRetention_tax() {
		return retention_tax;
	}

	public void setRetention_tax(boolean retention_tax) {
		this.retention_tax = retention_tax;
	}

	public boolean isBreakdown_IEPS() {
		return breakdown_IEPS;
	}

	public void setBreakdown_IEPS(boolean breakdown_IEPS) {
		this.breakdown_IEPS = breakdown_IEPS;
	}

	public double getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}

	public int getCredit_days() {
		return credit_days;
	}

	public void setCredit_days(int credit_days) {
		this.credit_days = credit_days;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getCustomer_status_id() {
		return customer_status_id;
	}

	public void setCustomer_status_id(Integer customer_status_id) {
		this.customer_status_id = customer_status_id;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getSale_price_id() {
		return sale_price_id;
	}

	public void setSale_price_id(Integer sale_price_id) {
		this.sale_price_id = sale_price_id;
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customer_id=").append(customer_id)
				.append(", first_name=").append(first_name)
				.append(", middle_name=").append(middle_name)
				.append(", last_name=").append(last_name)
				.append(", second_last_name=").append(second_last_name)
				.append(", email=").append(email).append(", birth_date=")
				.append(birth_date).append(", sex=").append(sex)
				.append(", position=").append(position).append(", agent=")
				.append(agent).append(", rfc=").append(rfc).append(", curp=")
				.append(curp).append(", retention_tax=").append(retention_tax)
				.append(", breakdown_IEPS=").append(breakdown_IEPS)
				.append(", credit_limit=").append(credit_limit)
				.append(", credit_days=").append(credit_days)
				.append(", employee_id=").append(employee_id)
				.append(", customer_status_id=").append(customer_status_id)
				.append(", company_id=").append(company_id)
				.append(", sale_price_id=").append(sale_price_id)
				.append(", created_date=").append(created_date)
				.append(", modification_date=").append(modification_date)
				.append(", address=").append(address).append(", phones=")
				.append(phones).append("]");
		return builder.toString();
	}
	
}
