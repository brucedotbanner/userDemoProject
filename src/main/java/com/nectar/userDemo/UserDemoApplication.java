package com.nectar.userDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.nectar.userDemo.beans.UserEntity;
import com.nectar.userDemo.repository.UserDemoRepository;
@SpringBootApplication
public class UserDemoApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private UserDemoRepository userDemoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		if (userDemoRepository.count() == 0) {
            List<UserEntity> users = Arrays.asList(
                new UserEntity("Mohanlal", "mohanlal@example.com", "9876543210"),
                new UserEntity("Mammootty", "mammootty@example.com", "9876543211"),
                new UserEntity("Dulquer Salmaan", "dulquer@example.com", "9876543212"),
                new UserEntity("Fahadh Faasil", "fahadh@example.com", "9876543213"),
                new UserEntity("Prithviraj Sukumaran", "prithviraj@example.com", "9876543214"),
                new UserEntity("Tovino Thomas", "tovino@example.com", "9876543215"),
                new UserEntity("Nivin Pauly", "nivin@example.com", "9876543216"),
                new UserEntity("Suresh Gopi", "suresh@example.com", "9876543217"),
                new UserEntity("Jayasurya", "jayasurya@example.com", "9876543218"),
                new UserEntity("Kunchacko Boban", "kunchacko@example.com", "9876543219")
            );
            userDemoRepository.saveAll(users);
        }
	}

}
