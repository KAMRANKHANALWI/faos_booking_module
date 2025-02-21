package com.faos.booking_frontend.controllers;

import com.faos.booking_frontend.models.BookingModel;
import com.faos.booking_frontend.services.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import java.util.List;

@Controller
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("booking", new BookingModel());
        return "index";
    }

    @PostMapping("/addBooking")
    public Mono<String> addBooking(@ModelAttribute("booking") BookingModel booking, Model model) {
        return bookingService.addBooking(booking)
                .map(response -> "statuspage")
                .onErrorResume(e -> {
                    model.addAttribute("errorMessage", "Booking could not be processed.");
                    return Mono.just("statuspage");
                });
    }

    @GetMapping("/bookings")
    public String viewBookings(Model model) {
        List<BookingModel> bookings = bookingService.getAllBookings().collectList().block();
        model.addAttribute("bookings", bookings);
        return "booking-list";
    }

    @GetMapping("/add-booking")
    public String addBookingPage(Model model) {
        model.addAttribute("booking", new BookingModel());
        return "booking-form";
    }
}