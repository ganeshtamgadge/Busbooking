package com.usecase1.service;

import java.util.List;

import com.usecase1.dto.TicketBookingDTO;
import com.usecase1.model.TicketBooking;


public interface TicketBookingService {
	 TicketBookingDTO getUserDetailsFromDb(int userId);
	 
	 void saveUser(TicketBookingDTO ticketBookingDTO);
	 
	 List<TicketBooking> getUserDetailsFromDbBasedOnTravelDate(String travelDate);
	
	 List<TicketBooking> getUserDetailsFromDbBasedOnBoardingDate(String boardingPoint);
}
