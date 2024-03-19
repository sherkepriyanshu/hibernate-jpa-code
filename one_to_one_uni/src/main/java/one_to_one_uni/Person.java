package one_to_one_uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false ,unique=true)
	private long phone;
	@OneToOne
	private Pancard Card;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Pancard getCard() {
		return Card;
	}
	public void setCard(Pancard card) {
		Card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", phone=" + phone + ", Card=" + Card + "]";
	}
	
}
