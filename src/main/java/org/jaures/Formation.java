package org.jaures;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
	private Long id;
	private String nom;
	private int duree;
	
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
