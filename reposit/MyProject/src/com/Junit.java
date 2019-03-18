package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit {
	Calculator c = new Calculator();

	@Test
	void test() {
		assertEquals(8,c.add(6,2));
	}

}
