package com.usecase1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usecase1.dto.TicketBookingDTO;
import com.usecase1.model.TicketBooking;
import com.usecase1.service.TicketBookingService;

@RestController
public class TicketBookingController {

	@Autowired
	TicketBookingService ticketBookingService;

	@GetMapping("/get-userBookingDetails/{userId}")
	public TicketBookingDTO getUserBookingDetailsFromDb(@PathVariable int userId) {
		return ticketBookingService.getUserDetailsFromDb(userId);

	}

	@PostMapping("/save-user")
	public String saveusers(@RequestBody TicketBookingDTO ticketBookingDTO) {
		ticketBookingService.saveUser(ticketBookingDTO);
		return "user saved successfully !";

	}

	@GetMapping("/get-user/data/{travelDate}")
	public List<TicketBooking> getUserBookingDetailsFromDbBasedOnTravelDate(@PathVariable String travelDate) {
		return ticketBookingService.getUserDetailsFromDbBasedOnTravelDate(travelDate);

	}

	@GetMapping("/get-user/database/{boardingPoint}")
	public List<TicketBooking> getUserBookingDetailsFromDbBasedOnBoardingPoint(@PathVariable String boardingPoint) {
		return ticketBookingService.getUserDetailsFromDbBasedOnBoardingDate(boardingPoint);

	}
}
