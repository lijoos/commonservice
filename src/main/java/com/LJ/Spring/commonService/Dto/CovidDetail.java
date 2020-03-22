package com.LJ.Spring.commonService.Dto;

import java.util.ArrayList;

public class CovidDetail {
	private String id;
	 private String displayName;
	 ArrayList < CovidDetail > areas = new ArrayList < CovidDetail > ();

	 private float totalConfirmed;
	 private float totalDeaths;
	 private float totalRecovered;
	 private String lastUpdated;
	 private String country;
	 private String parentId = null;


	 // Getter Methods 

	 public String getId() {
	  return id;
	 }

	 public String getDisplayName() {
	  return displayName;
	 }

	 public float getTotalConfirmed() {
	  return totalConfirmed;
	 }

	 public float getTotalDeaths() {
	  return totalDeaths;
	 }

	 public float getTotalRecovered() {
	  return totalRecovered;
	 }

	 public String getLastUpdated() {
	  return lastUpdated;
	 }

	 public String getCountry() {
	  return country;
	 }

	 public String getParentId() {
	  return parentId;
	 }

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setDisplayName(String displayName) {
	  this.displayName = displayName;
	 }

	 public void setTotalConfirmed(float totalConfirmed) {
	  this.totalConfirmed = totalConfirmed;
	 }

	 public void setTotalDeaths(float totalDeaths) {
	  this.totalDeaths = totalDeaths;
	 }

	 public void setTotalRecovered(float totalRecovered) {
	  this.totalRecovered = totalRecovered;
	 }

	 public void setLastUpdated(String lastUpdated) {
	  this.lastUpdated = lastUpdated;
	 }

	 public void setCountry(String country) {
	  this.country = country;
	 }

	 public void setParentId(String parentId) {
	  this.parentId = parentId;
	 }
	 public ArrayList<CovidDetail> getAreas() {
			return areas;
		}

		public void setAreas(ArrayList<CovidDetail> areas) {
			this.areas = areas;
		}

}
