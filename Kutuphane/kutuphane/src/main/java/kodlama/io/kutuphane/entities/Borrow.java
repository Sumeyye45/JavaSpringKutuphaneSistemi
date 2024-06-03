package kodlama.io.kutuphane.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="barrow")
public class Borrow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="barrow_date")
	private String barrowDate;
	
	@Column(name="due_date")
	private String dueDate;
	
	@Column(name="delivery_date")
	String deliveryDate;
	
	@Column(name="borrow_claim")
	private String borrowClaim;
	

}
