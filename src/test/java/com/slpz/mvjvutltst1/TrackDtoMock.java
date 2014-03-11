package com.slpz.mvjvutltst1;

import org.mockito.Mockito;

import com.slpz.mvjvutlone.dto.TrackDto;
import com.slpz.mvjvutlone.model.Track;

public class TrackDtoMock {

	public static void main(String[] args) {
		
		TrackDto trackDto = createMockTrackDto();
	    
	    System.out.println(trackDto.getTrackById(22));

	}
	
	public static TrackDto createMockTrackDto() {
		
		TrackDto trackDto = Mockito.spy(new TrackDto());
		
		Track track22 = new Track(22,"Jude","Beatles");
	    Mockito.when(trackDto.getTrackById(22)).thenReturn(track22);
	    
	    return trackDto;
	}

}
