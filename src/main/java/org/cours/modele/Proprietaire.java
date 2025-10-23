package org.cours.modele;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proprietaire {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="proprietaire")
	@JsonIgnore
	private List<Voiture> voitures;

	public Proprietaire(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
}
