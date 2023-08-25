package com.example.springDemo.domain;

public class Director {
	private String directorId;
	private String directorName;
	/**
	 * @param directorId
	 * @param directorName
	 */
	public Director(String directorId, String directorName) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
	}
	/**
	 * @return directorId
	 */
	public String getDirectorId() {
		return directorId;
	}
	/**
	 * @param directorId セットする directorId
	 */
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	/**
	 * @return directorName
	 */
	public String getDirectorName() {
		return directorName;
	}
	/**
	 * @param directorName セットする directorName
	 */
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	
	

}
