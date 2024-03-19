package Composite_key;



import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class User  {
	private String name;
	private String Password;
	@EmbeddedId
	private UserId userId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public UserId getUserId() {
		return userId;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", Password=" + Password +  "]";
	}
	
	

}
