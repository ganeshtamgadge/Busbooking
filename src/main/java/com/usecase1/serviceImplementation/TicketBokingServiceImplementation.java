package com.usecase1.serviceImplementation;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase1.dto.TicketBookingDTO;
import com.usecase1.model.TicketBooking;
import com.usecase1.repository.TicketBookingRepository;
import com.usecase1.service.TicketBookingService;

@Service
public class TicketBokingServiceImplementation implements TicketBookingService {

	@Autowired
	TicketBookingRepository ticketBookingRepository;

	@Override
	public TicketBookingDTO getUserDetailsFromDb(int userId) {
		TicketBookingDTO ticketBookingDto = new TicketBookingDTO();
		TicketBooking ticketBooking = ticketBookingRepository.findById(userId).get();
		
		BeanUtils.copyProperties(ticketBooking, ticketBookingDto);
		return ticketBookingDto;
	}

	@Override
	public void saveUser(TicketBookingDTO ticketBookingDTO) {
		TicketBooking booking = new TicketBooking();
		BeanUtils.copyProperties(ticketBookingDTO, booking);
		ticketBookingRepository.save(booking);

	}

	@Override
	public List<TicketBooking> getUserDetailsFromDbBasedOnTravelDate(String travelDate) {
		List<TicketBooking> findByTravelDate = ticketBookingRepository.findByTravelDate(travelDate);
		return findByTravelDate;
	}

	@Override
	public List<TicketBooking> getUserDetailsFromDbBasedOnBoardingDate(String boardingPoint) {
		List<TicketBooking> findByBoardingPoint = ticketBookingRepository.findByBoardingPoint(boardingPoint);
		return findByBoardingPoint;
	}

}
