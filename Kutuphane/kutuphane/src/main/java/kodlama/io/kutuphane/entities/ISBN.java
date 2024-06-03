package kodlama.io.kutuphane.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ısbn")
public class ISBN {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="number")
	private String number;
	
	@Column(name="publicationyear")
	private String publicationYear;
	
	@Column(name="publisher")
	private String publisher;
	

}
