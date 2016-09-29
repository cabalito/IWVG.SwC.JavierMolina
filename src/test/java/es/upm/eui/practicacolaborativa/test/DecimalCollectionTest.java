package es.upm.eui.practicacolaborativa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.eui.practicacolaborativa.DecimalCollection;

public class DecimalCollectionTest {

	private double five = 5;
	private double two = 2;
	
	@Test
	public void testCreateDecimalCollectionAndAddOne() {
		DecimalCollection collection = new DecimalCollection();
		assertNotNull(collection);
		collection.add(five);
		assertEquals(collection.size(), 1);
	}

	@Test
	public void testSum() {
		DecimalCollection collection = new DecimalCollection();
		collection.add(five);
		collection.add(two);
		assertEquals(collection.sum(), five + two, 0.01);
	}

	@Test
	public void testHigher() {
		DecimalCollection collection = new DecimalCollection();
		collection.add(two);
		assertNotEquals(collection.higher(), five, 0.01);
		collection.add(five);
		assertEquals(collection.higher(), five, 0.01);
	}

}
