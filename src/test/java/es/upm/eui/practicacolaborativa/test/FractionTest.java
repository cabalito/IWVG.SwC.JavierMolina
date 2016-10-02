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
	public void testSubtraction(){
		Fraction f = new Fraction(3,2);
		assertEquals(new Fraction(1,2).decimal(), f.subtraction(new Fraction(2,2)).decimal(), 0.0);
	}

	@Test
	public void testSum() {
		Fraction fraction = new Fraction(3, 2);
		Fraction otherFraction = new Fraction(2, 2); 
		Fraction sum = fraction.sum(otherFraction);
		
		assertEquals(3+2 , sum.getNumerator() );
		assertEquals(2, sum.getDenominator()) ;
	}
	
	@Test
    public void divisionTest() {
		
    	Fraction fraction1 = new Fraction(3,9);
    	Fraction fraction2= new Fraction(5,10);
    	Fraction result = new Fraction(30,45);
    	assertEquals(result.getNumerator(),fraction1.division(fraction2).getNumerator());
     	assertEquals(result.getDenominator(),fraction1.division(fraction2).getDenominator());

    }

}
