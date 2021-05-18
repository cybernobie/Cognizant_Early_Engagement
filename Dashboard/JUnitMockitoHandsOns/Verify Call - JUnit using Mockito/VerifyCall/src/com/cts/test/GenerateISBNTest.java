package com.cts.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.never;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;

import org.mockito.InjectMocks;
import org.mockito.Mock;
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
        
        // when
        service.assignISBN("ISBN0001");
        // then 
        verify(book, times(1)).setIsbn("ISBN0001");
	}
	
	@Test
	public void testFailed() {
	    	//fill code
	    	
	    // then 
	    exceptionRule.expect(RuntimeException.class);
	    exceptionRule.expectMessage("Invalid Code");
	    // when
	    service.assignISBN("ISBN001");
	    // then
	    verify(book, never()).setIsbn("ISBN001");
	}

    @Test
	public void testException() {
	    	//fill code
        
        // then 
	    exceptionRule.expect(RuntimeException.class);
	    exceptionRule.expectMessage("Invalid Code");
	    // when
	    service.assignISBN("ISBN001");
	}
}
