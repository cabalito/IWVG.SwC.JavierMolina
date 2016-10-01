package es.upm.eui.practicacolaborativa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.eui.practicacolaborativa.Fraction;

public class FractionTest {
	
	private int numerator = 3;
    private int denominator = 9;

    @Test
	public void testFraction() {
		Fraction fraction = new Fraction();
		assertNotNull(fraction);
	}
    
	@Test
	public void testFractionIntInt() {
		Fraction fraction = new Fraction(numerator, denominator);
		assertNotNull(fraction);
	}

	@Test
	public void testDecimal() {
		Fraction fraction = new Fraction();
		double result = 1;
		assertEquals(fraction.decimal(), result, 0.01 );
		fraction = new Fraction(numerator, denominator);
		assertEquals(fraction.decimal(), (double)numerator/denominator, 0.01);
		
	}

	@Test
	public void testSum() {
		Fraction fraction = new Fraction(numerator, denominator);
		Fraction otherFraction = new Fraction(5, 2); 
		Fraction sum = fraction.sum(otherFraction);
		
		assertEquals(sum.getNumerator(), numerator+5 );
		assertEquals(sum.getDenominator(), denominator+2 );
	}
}
