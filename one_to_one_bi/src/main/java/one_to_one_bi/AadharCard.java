package one_to_one_bi;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column (nullable = false)
	private long number;
	@Column (nullable=false)
	private LocalDate dob;
	@Column (nullable = false)
	private String City;
	@OneToOne (mappedBy="card")
	private User user;
	
	
	@Override
	public String toString() {
		return "AadharCard [Id=" + Id + ", number=" + number + ", dob=" + dob + ", City=" + City + ", user=" + user
				+ "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate string) {
		this.dob = string;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

	
	
}
