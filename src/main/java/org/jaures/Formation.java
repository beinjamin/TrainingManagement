package org.jaures;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Formation {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int duree;
	
	@OneToMany(mappedBy="formation")
	
    private Collection<Etudiant> etudiants;
	
	public Formation(Long id, String nom, int duree) {
		this.id=id;
		this.setNom(nom);
		this.setDuree(duree);
		
		// TODO Auto-generated constructor stub
	}

	public Formation(Object object, String string, int i, Object object2) {
		// TODO Auto-generated constructor stub
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
}
