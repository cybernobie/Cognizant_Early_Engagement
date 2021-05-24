package com.cts.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
		@Mock
        Book book;
		@InjectMocks
        GenerateISBN service;

		@Rule
        public ExpectedException exceptionRule = ExpectedException.none();


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuccess() {
	    	//fill code
		service.assignISBN("ISBN1258");
		Mockito.verify(book,Mockito.times(1)).setIsbn("ISBN1258");
	}

	@Test(expected = RuntimeException.class)
	public void testFailed() {
	    	//fill code
		service.assignISBN("ISBN125");
		Mockito.verify(book,Mockito.never()).setIsbn("ISBN125");
	}

	@Test(expected = RuntimeException.class)
	public void testException() {
	    	//fill code
		service.assignISBN("ISasd25");

	}
}
