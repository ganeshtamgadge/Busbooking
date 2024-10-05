package com.usecase1.dto;

public class TicketBookingDTO {
	private String userName;
	private String userEmailId;
	private int noOfPersons;
	private String bookingDate;
	private String travelDate;
	private String boardingPoint;
	private String destinationPoint;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDestinationPoint() {
		return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	public TicketBookingDTO( String userName, String userEmailId, int noOfPersons, String bookingDate,
			String travelDate, String boardingPoint, String destinationPoint) {
		

		this.userName = userName;
		this.userEmailId = userEmailId;
		this.noOfPersons = noOfPersons;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
	}
	public TicketBookingDTO() {
		
	}
	@Override
	public String toString() {
		return "TicketBookingDTO [ userName=" + userName + ", userEmailId=" + userEmailId
				+ ", noOfPersons=" + noOfPersons + ", bookingDate=" + bookingDate + ", travelDate=" + travelDate
				+ ", boardingPoint=" + boardingPoint + ", destinationPoint=" + destinationPoint + "]";
	}
	
	

}
