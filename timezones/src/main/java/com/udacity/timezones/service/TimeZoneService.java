package com.udacity.timezones.service;

import com.udacity.timezones.client.WordTimeApiClient;

public class TimeZoneService {
	private final WordTimeApiClient WordTimeApiClient;

	public TimeZoneService(WordTimeApiClient WordTimeApiClient) {
		this.WordTimeApiClient = WordTimeApiClient;
	}

	public String getAvailableTimezoneText(String area) {
		return String.format(
			"Available timezones in %s are %s.",
			area,
			String.join(", ", WordTimeApiClient.getValidTimeZones(area))
		);
	}
}
