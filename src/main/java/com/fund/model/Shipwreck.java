package com.fund.model;

public class Shipwreck {
	
	Long id;
	String name;
	String description;
	private String condition;
	Integer depth;
	Double latitude;
	Double longiture;
	Integer yearDiscovered;
	
	public Shipwreck() {}
	
	public Shipwreck(Long id, String name, String description, String condition,  Integer depth, Double latitude, Double longiture,
			Integer yearDiscovered) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.setCondition(condition);
		this.depth = depth;
		this.latitude = latitude;
		this.longiture = longiture;
		this.yearDiscovered = yearDiscovered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongiture() {
		return longiture;
	}

	public void setLongiture(Double longiture) {
		this.longiture = longiture;
	}

	public Integer getYearDiscovered() {
		return yearDiscovered;
	}

	public void setYearDiscovered(Integer yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	

}
