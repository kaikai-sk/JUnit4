package com.sk.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sk.junit.T;

public class TTest
{

	@Test
	public void testAdd()
	{
		int z=new T().add(3, 5);
		assertEquals(8, z);
	}

}
