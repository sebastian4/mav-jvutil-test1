package com.slpz.mvjvutltst1.jbhv.trdto;

import java.util.List;
import junit.framework.Assert;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.slpz.mvjvutlone.dto.TrackDto;
import com.slpz.mvjvutlone.model.Track;

public class TrackDtoSteps {
	
	private TrackDto trackDto;

	public TrackDtoSteps() {
		trackDto = new TrackDto();
	}
	
    @Given("I have an initial trackdto")
    public void givenIHaveAnInitialTrackDto() { 
    	trackDto = new TrackDto();
    }

    @When("I push an item $item")
    public void whenIPushAnItem(@Named("item") String item) {
    	Track track30 = new Track(30,"Beatles Song","Beatles");
    	trackDto.createTrack(track30);
    }

    @Then("I should count $expected")
    public void thenIShouldCount(@Named("expected") int expected) {
    	List<Track> tracks1 = trackDto.getAllTracks();
        Assert.assertEquals(tracks1.size(), expected);
    }
}
