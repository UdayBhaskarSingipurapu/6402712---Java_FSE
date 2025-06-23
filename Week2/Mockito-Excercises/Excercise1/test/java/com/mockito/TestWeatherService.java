package com.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestWeatherService {
	
	@Mock
	WeatherApiClient apiClientMock;
	
	@InjectMocks
	WeatherService weather;
	
	@BeforeEach
	void setUp() {
		weather = new WeatherService(apiClientMock);
	}
	
	@Test
	void test_WeatherService() {
		// Arrange
		when(apiClientMock.getWeather(anyString())).thenReturn("Sunny 34deg");
		
		// Act
		String report = weather.getweatherReport("Hyderabad");
		
		// Assert
		assertEquals("Weather in Hyderabad is Sunny 34deg", report);
		
	}

}
