package com.usecase1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TicketBooking {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
		private  int userId;
		private String userName;
		private String userPassword;
		private String userEmailId;
		private int noOfPersons;
		private String bookingDate;
		private String travelDate;
		private String boardingPoint;
		private String destinationPoint;
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
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
		public TicketBooking(int userId, String userName, String userPassword, String userEmailId, int noOfPersons,
				String bookingDate, String travelDate, String boardingPoint, String destinationPoint) {
			
			this.userId = userId;
			this.userName = userName;
			this.userPassword = userPassword;
			this.userEmailId = userEmailId;
			this.noOfPersons = noOfPersons;
			this.bookingDate = bookingDate;
			this.travelDate = travelDate;
			this.boardingPoint = boardingPoint;
			this.destinationPoint = destinationPoint;
		}
		public TicketBooking() {
			
		}
		@Override
		public String toString() {
			return "TicketBooking [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
					+ ", userEmailId=" + userEmailId + ", noOfPersons=" + noOfPersons + ", bookingDate=" + bookingDate
					+ ", travelDate=" + travelDate + ", boardingPoint=" + boardingPoint + ", destinationPoint="
					+ destinationPoint + "]";
		}
		
		

}
