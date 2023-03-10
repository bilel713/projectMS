package com.iset.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.JoinColumn;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Produit {

@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column
private long idproduit;


@Column
String code;

@Column
String libelle;

@Column
Float prixUnitaire;



@Column 
String description ;
//@ManyToOne
//private Stock stock;



//@OneToOne
//@JsonBackReference(value="detailproduit")
//private DetailProduit detailProduit;

//
//@ManyToOne
//@JsonBackReference(value="rayon")
//private Rayon rayon;

//@OneToMany(mappedBy="produit")
//detailFacture detailFactures;
//
//@OneToMany(mappedBy="product",cascade = CascadeType.REMOVE)
//@JsonBackReference(value="test1")
//private List<Review> reviews;

//@ManyToMany
//@JsonBackReference
//@JoinTable(name = "T_PRODUIT_FOURNISSEUR",joinColumns={@JoinColumn(name="idproduit")},inverseJoinColumns={@JoinColumn(name ="idFournisseur")})
//private Set<Fournisseur> fournisseurs;

//@OneToOne(mappedBy="produit") 
//@JsonBackReference(value = "promotion")
//
//private Promotion promotion ; 





}
