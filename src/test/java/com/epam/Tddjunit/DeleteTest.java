package com.epam.Tddjunit;
import static org.junit.Assert.*;
import org.junit.Test;
public class DeleteTest {
	@Test
	public void test1st() {
		assertEquals("BCD",Delete.remove("ABCD"));
	}
	@Test
	public void testFirst2() {
		assertEquals("CD",Delete.remove("AACD"));
	}
	@Test
	public void test2nd() {
		assertEquals("RMP",Delete.remove("RAMP"));
	}
	@Test
	public void testLast() {
		assertEquals("OMG",Delete.remove("OMG"));
	}
	@Test
	public void testRandom() {
		assertEquals("BAA",Delete.remove("AABAA"));
	}
	@Test
	public void testEmpty() {
		assertEquals("",Delete.remove(""));
	}
}
