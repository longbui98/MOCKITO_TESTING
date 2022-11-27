package com.udacity.timezones.client;

import java.util.List;

public class FakeWorldTimeApiClient implements WordTimeApiClient {
	private List<String> validTimeZones;

	public FakeWorldTimeApiClient(List<String> validTimeZones) {
		this.validTimeZones = validTimeZones;
	}

	@Override
	public List<String> getValidTimeZones(String area) {
		// TODO Auto-generated method stub
		return validTimeZones;
	}

}
