package com.mockito;

public class WeatherService {
	
	private final WeatherApiClient apiClient;
	
	public WeatherService(WeatherApiClient client) {
		this.apiClient = client;
	}
	
	public String getweatherReport(String city) {
		String weather = apiClient.getWeather(city);
		
		return "Weather in " + city + " is " + weather;
		
	}

}
