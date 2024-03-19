package one_to_one_bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column(nullable = false,unique= true)
	private String name;
	@Column(nullable = false,unique= true)
	private long phone;
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name="AadharCard_id")
	private AadharCard card;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public AadharCard getCard() {
		return card;
	}
	public void setCard(AadharCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", phone=" + phone + ", card=" + card + "]";
	}
	
	
}
