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
	
    @Autowired
	
	private FormationRepository formationRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(TrainingManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Formation f1=formationRepository.save(new Formation(null,"Laravel",30,null));
		
		Formation f2=formationRepository.save(new Formation(null,"Spring",30,null));
		
		
		Formation f3=formationRepository.save(new Formation(null,"Django",30,null));
		


		etudiantRepository.save(new Etudiant(null,"Fotsing","Jaures",new Date()),f1);

		etudiantRepository.save(new Etudiant(null,"Pascal","Longrich",new Date()),f1);

		etudiantRepository.save(new Etudiant(null,"Jean","La Vache",new Date()),f2);
		
		etudiantRepository.save(new Etudiant(null,"Hugo le pomnier","Venaline",new Date()),f3);
		

	
	}

}
