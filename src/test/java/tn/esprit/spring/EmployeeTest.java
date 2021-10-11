package tn.esprit.spring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.services.EmployeServiceImpl;

@SpringBootTest
public class EmployeeTest {
	@Autowired
	EmployeServiceImpl us; 

	

	@Test
	public void ajout() {
		us.affecterEmployeADepartement(1, 1);
	}

	@Test
	public void affichage() {
		us.affecterContratAEmploye(1, 1);
	}
	
	@Test
	public void delete() {
		us.deleteContratById(1);
	}
	
	@Test
	public void getAllEmploye() {
		us.getAllEmployes();
	}
	@Test
	public void Modif() {
		us.affecterEmployeADepartement(1, 1);
	}
	
}
