package com.udacity.timezones.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.udacity.timezones.client.WordTimeApiClient;

@ExtendWith(MockitoExtension.class)
public class TimeZoneServiceTest {
	
	private TimeZoneService timeZoneService;

	@Mock
	private WordTimeApiClient wordTimeApiClient;
	
	@BeforeEach
	void init() {
		timeZoneService = new TimeZoneService(wordTimeApiClient);
	}
	
	@Test
	void getAvailableTimezoneText_timeApiReturnsStringList_returnsCountriesAsString() {
		List<String> validTimeZones = List.of("Amsterdam", "Andorra", "Astrakhan", "Athens");
		
		when(wordTimeApiClient.getValidTimeZones(anyString())).thenReturn(validTimeZones);

		String timeZoneText = timeZoneService.getAvailableTimezoneText("Europe");
		
		String expectedReturn = "Amsterdam, Andorra, Astrakhan, Athens";

		assertTrue(timeZoneText.contains(expectedReturn));
	}
}
