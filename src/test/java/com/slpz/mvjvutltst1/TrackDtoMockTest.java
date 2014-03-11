package com.slpz.mvjvutltst1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.slpz.mvjvutltst1.TrackDtoMock;
import com.slpz.mvjvutlone.dto.TrackDto;
import com.slpz.mvjvutlone.model.Track;

public class TrackDtoMockTest {

	private static TrackDto trackDto = null;
	 
    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("oneTimeSetUp");
    	trackDto = TrackDtoMock.createMockTrackDto();
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
        System.out.println("setUp");
    }
 
    @After
    public void tearDown() {
        System.out.println("tearDown");
    }
    
    @Test
    public void testGetTrackById() {
    	System.out.println("testGetTrackById");
    	Track track22 = trackDto.getTrackById(22);
    	assertTrue(track22.getTitle().equals("Jude"));
    	assertTrue(track22.getSinger().equals("Beatles"));
    }
    
}
