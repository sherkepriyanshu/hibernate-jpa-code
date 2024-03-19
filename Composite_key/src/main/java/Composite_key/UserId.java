package Composite_key;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class UserId implements Serializable {
	
	private String Email;

	private Long Phone;
	
	
	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public Long getPhone() {
		return Phone;
	}


	public void setPhone(Long phone) {
		Phone = phone;
	}


	@Override
	public String toString() {
		return "UserId [Email=" + Email + ", Phone=" + Phone + "]";
	}
	

}
