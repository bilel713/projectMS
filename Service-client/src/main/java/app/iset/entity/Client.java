package app.iset.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Getter
@Setter
@Entity
public class Client {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column
	private long idClient;

	@Column
	String nom;
	@Column
	String prenom;
	@Column
	@Temporal(TemporalType.DATE)
	Date dateNaissance;
	@Column
	String email;
	@Column
	String password;
	@Column
	@Enumerated(EnumType.STRING)
	CategorieClient categorieClient ;
	@Column
	@Enumerated(EnumType.STRING)
	Profession Profession ;
	@Column
	Boolean active;
	@Column
	String verificationCode;
	
	//we will transfert role to string
	@ManyToMany(cascade = CascadeType.PERSIST, fetch
			= FetchType.EAGER)
	private Set<Role> roles;
	/*
	 * @OneToMany(mappedBy="client")
	 * 
	 * @JsonBackReference private Set<Facture> factures;
	 * 
	 * @OneToMany(mappedBy="client")
	 * 
	 * @JsonIgnore
	 * 
	 * private Set<Reclamation> reclamation;
	 * 
	 * @OneToMany(mappedBy="client")
	 * 
	 * @JsonBackReference(value="test1") private List<Review> reviews;
	 */
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", email=" + email + ", password=" + password + ", categorieClient=" + categorieClient
				+ ", Profession=" + Profession + ", active=" + active + ", verificationCode=" + verificationCode
				+ ", roles=" + roles + "]";
	}



	
	

}
