package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Weather")
public class Weather {
	
	@Id
	@Column()
	private String city;
	@Column()
	private String weatherMain;
	@Column()
	private String weatherDescription;
	@Column()
	private int weatherTemp;
	
	public Weather() {
		super();
	}
	public Weather(String city, String weatherMain, String weatherDescription, int weatherTemp) {
		this.city = city;
		this.weatherMain = weatherMain;
		this.weatherDescription = weatherDescription;
		this.weatherTemp = weatherTemp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWeatherMain() {
		return weatherMain;
	}
	public void setWeatherMain(String weatherMain) {
		this.weatherMain = weatherMain;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public int getWeatherTemp() {
		return weatherTemp;
	}
	public void setWeatherTemp(int weatherTemp) {
		this.weatherTemp = weatherTemp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, weatherDescription, weatherMain, weatherTemp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weather other = (Weather) obj;
		return Objects.equals(city, other.city) && Objects.equals(weatherDescription, other.weatherDescription)
				&& Objects.equals(weatherMain, other.weatherMain) && weatherTemp == other.weatherTemp;
	}
	@Override
	public String toString() {
		return "Weather [city=" + city + ", weatherMain=" + weatherMain + ", weatherDescription=" + weatherDescription
				+ ", weatherTemp=" + weatherTemp + "]";
	}
	
	
}
