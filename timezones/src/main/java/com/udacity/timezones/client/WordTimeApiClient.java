package com.udacity.timezones.client;

import java.util.List;

public interface WordTimeApiClient {
    List<String> getValidTimeZones(String area);
}
