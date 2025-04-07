package com.learning.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.SpringJDBC.model.Programmer;
import com.learning.SpringJDBC.repo.ProgrammerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Application.class, args);
		ProgrammerRepo prepo=context.getBean(ProgrammerRepo.class);
		Programmer programmer=context.getBean(Programmer.class);
		
		programmer.setProgammerId("201");
		programmer.setProgammerName("Kumar");
		programmer.setProgammerLanguage("Js");
		prepo.addProgrammer(programmer);
		System.out.println(prepo.getAllProgrammers());
		System.out.println("Hi");
		
	}


}
