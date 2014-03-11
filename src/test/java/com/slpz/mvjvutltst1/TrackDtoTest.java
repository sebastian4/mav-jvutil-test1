package com.slpz.mvjvutltst1;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import com.slpz.mvjvutlone.dto.TrackDto;
import com.slpz.mvjvutlone.model.Track;

public class TrackDtoTest {

	private static TrackDto trackDto = null;
	 
    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("oneTimeSetUp");
    	trackDto = new TrackDto();
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
    public void testGetAllTracks() {
        System.out.println("testGetAllTracks");
        List<Track> tracks1 = trackDto.getAllTracks();
        assertNotNull(tracks1);
        assertTrue(tracks1.size()>0);
    }
    
    @Test
    public void testGetTrackById() {
    	System.out.println("testGetTrackById");
    	Track track12 = trackDto.getTrackById(11);
    	assertTrue(track12.getTitle().equals("One"));
    }
 
    @Test
    public void testCreateTrack() {
    	System.out.println("testCreateTrack");
    	List<Track> tracks1;
    	tracks1 = trackDto.getAllTracks();
    	int oldSize = tracks1.size();
    	Track track22 = new Track(22,"Jude","Beatles");
    	Track track23 = new Track(23,"Submarine","Beatles");
    	trackDto.createTrack(track22);
    	trackDto.createTrack(track23);
    	tracks1 = trackDto.getAllTracks();
    	assertTrue(tracks1.size()==oldSize+2);
    }
    
    @Test
    public void testDeleteTrackById() {
    	System.out.println("testDeleteTrackById");
    	List<Track> tracks1;
    	tracks1 = trackDto.getAllTracks();
    	int oldSize = tracks1.size();
    	trackDto.deleteTrackById(12);
    	tracks1 = trackDto.getAllTracks();
    	assertTrue(tracks1.size()==oldSize-1);
    	assertNull(trackDto.getTrackById(12));
    }
    
    @Test
    public void testUpdateTrack() {
    	System.out.println("testUpdateTrack");
    	Track track24 = new Track(13,"1999","Pineapples");
    	trackDto.updateTrack(track24);
    	Track track25 = trackDto.getTrackById(13);
    	assertTrue(track25.getSinger().equals("Pineapples"));
    }
    
}
