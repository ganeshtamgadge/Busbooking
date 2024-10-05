package com.usecase1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usecase1.dto.TicketBookingDTO;
import com.usecase1.model.TicketBooking;

@Repository

public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer> {

	public List<TicketBooking> findByTravelDate(String travelDate);
	public List<TicketBooking> findByBoardingPoint(String boardingPoint);
		
	
}
