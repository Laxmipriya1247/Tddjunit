package task;



import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveAfromfirst2charsTest {
	
	RemovefirstA removeA = new RemovefirstA();

	@Test
	public void testfirstchar() {

		assertEquals("BCD",removeA.remove("ABCD"));
	}
	@Test
	public void testfirsttwochar() {

		assertEquals("CD",removeA.remove("AACD"));
	}
	@Test
	public void testsecondchar() {

		assertEquals("BCD",removeA.remove("BACD"));
	}
	@Test
	public void testnoAs() {
		assertEquals("BCD",removeA.remove("BCD"));
	}
	@Test
	public void testLastchar() {

		assertEquals("BCDA",removeA.remove("BCDA"));
	}
	@Test
	public void test1st2Aslast2As() {

		assertEquals("BAA",removeA.remove("AABAA"));
	}

	@Test
	public void testempty() {

		assertEquals("", removeA.remove(""));
	}

}


