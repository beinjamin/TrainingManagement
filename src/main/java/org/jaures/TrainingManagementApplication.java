package org.jaures;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@SpringBootApplication
public class TrainingManagementApplication implements CommandLineRunner{

	@Autowired
	
	private EtudiantRepository etudiantRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TrainingManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

		etudiantRepository.save(new Etudiant(null,"Fotsing","Jaures",new Date()));
	
	}

}
