package kodlama.io.kutuphane.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="identityNo")
	private String identityNo;
	
	@Column(name="name")
	private String firstNmae;
	
	@Column(name="surname")
	private String lastName;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="mail")
	private String mail;
	
	
	
}
