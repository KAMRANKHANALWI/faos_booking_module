package com.faos.Booking.controllers;

import com.faos.Booking.models.Booking;
import com.faos.Booking.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public Flux<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Mono<ResponseEntity<Booking>> createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking).map(ResponseEntity::ok);
    }
}