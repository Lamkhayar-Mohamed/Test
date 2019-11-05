package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Hassani", "Mohamed", df.parse("12/01/1998"), "hassan@gmail.com", 613496026, "hassan.jpg"));
		contactRepository.save(new Contact("Yamanii", "khalidd", df.parse("13/02/1992"), "khalid@gmail.com", 618496026, "khalid.jpg"));
		contactRepository.save(new Contact("zawalii", "Yasmine", df.parse("17/12/1992"), "Yasmin@gmail.com", 618496178, "Yasmin.jpg"));
		contactRepository.save(new Contact("Bourezgui", "Yasmine", df.parse("17/12/1991"), "Yasmin@gmail.com", 618496178, "Yasmin.jpg"));
		contactRepository.save(new Contact("Salimi", "Hamza", df.parse("17/12/1991"), "Yasmin@gmail.com", 618496178, "Yasmin.jpg"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
	}
}
		
