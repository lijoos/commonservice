package com.LJ.Spring.commonService.Model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "covidData")
public class CovidDetail{
	 private float totalConfirmed;
	 private float totalDeaths;
	 private float totalRecovered;
	 private String lastUpdated;
	 private String country;
	 private String parentId = null;
	 private String id;
	 private String displayName;
	 ArrayList < CovidDetail > areas = new ArrayList < CovidDetail > ();
	 
	 public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public ArrayList<CovidDetail> getAreas() {
		return areas;
	}
	public void setAreas(ArrayList<CovidDetail> areas) {
		this.areas = areas;
	}
	public float getTotalConfirmed() {
		return totalConfirmed;
	}
	public void setTotalConfirmed(float totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}
	public float getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(float totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public float getTotalRecovered() {
		return totalRecovered;
	}
	public void setTotalRecovered(float totalRecovered) {
		this.totalRecovered = totalRecovered;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
