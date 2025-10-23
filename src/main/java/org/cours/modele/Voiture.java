package org.cours.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String marque;
	private String modele;
	private String couleur;
	private String immatricule;
	private int annee;
	private int prix;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proprietaire")
	@JsonIgnore
	private Proprietaire proprietaire;

	public Voiture(String marque, String modele, String couleur, String immatricule, int annee, int prix) {
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatricule = immatricule;
		this.annee = annee;
		this.prix = prix;
	}
}
