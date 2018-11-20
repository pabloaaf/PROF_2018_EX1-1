package pabloaaf.Prof_Ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringTest {
	
	@Test
	public void test_equals(){
		MyString a = new MyString("algo");
		MyString b = new MyString("algo");
		assertTrue(a.compareTo(b) == 0); //1-(2-3)-2-5-7
	}
	
	@Test
	public void test_NotEquals_sameLength(){
		MyString a = new MyString("algo");
		MyString b = new MyString("alco");
		assertTrue(a.compareTo(b) == 4); //1-(2-3)-4-7
	}
	
	@Test
	public void test_NotSameLength(){
		MyString a = new MyString("algo");
		MyString b = new MyString();
		assertTrue(a.compareTo(b) == 4); //1-6-7
	}
}
