package com.slpz.mvjvutltst1;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionTest {

	private Collection collection;
	 
    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
        collection = new ArrayList();
        System.out.println("setUp");
    }
 
    @After
    public void tearDown() {
        collection.clear();
        System.out.println("tearDown");
    }
 
    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
        System.out.println("testEmptyCollection");
    }
 
    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("testOneItemCollection");
    }
    
}
