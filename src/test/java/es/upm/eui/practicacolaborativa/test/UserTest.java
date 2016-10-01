package es.upm.eui.practicacolaborativa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.eui.practicacolaborativa.User;

public class UserTest {
	
    private int number = 3;
    private String name = "abraham";
    private String familyName = "lincoln";
    private String nameFirstCapital = "Abraham";
    private String familyNameCapital = "Lincoln";

	@Test
	public void testUserAndFormat() {
		User user = new User(number, name, familyName);
		assertEquals(user.getName(), nameFirstCapital);
		assertEquals(user.getFamilyName(), familyNameCapital);
		assertEquals(user.getNumber(), 3);
	}
	
	@Test
	public void testFullName() {
		User user = new User(number, name, familyName);
		assertEquals(user.fullName(), nameFirstCapital+" "+familyNameCapital);
	}

	@Test
	public void testInitials() {
		User user = new User(number, name, familyName);
		assertEquals(user.initials(), "A.");
	}

	@Test
	public void testInitialWithFamilyName() {
		User user = new User(number, name, familyName);
		assertEquals(user.initialWithFamilyName(), "A.L");	
	}
}
