package com.database.jdbcAndJpaDemo;

public class Zipcodes {
	
	private long zipcode;
	private String statename;
	private String cityname;
	private String Countryname;
	public Zipcodes(long zipcode, String statename, String cityname, String countryname) {
		super();
		this.zipcode = zipcode;
		this.statename = statename;
		this.cityname = cityname;
		this.Countryname = countryname;
	}
	public long getZipcode() {
		return zipcode;
	}
	public String getStatename() {
		return statename;
	}
	public String getCityname() {
		return cityname;
	}
	public String getCountryname() {
		return Countryname;
	}
	@Override
	public String toString() {
		return "Zipcodes [zipcode=" + zipcode + ", statename=" + statename + ", cityname=" + cityname + ", Countryname="
				+ Countryname + "]";
	}
}
