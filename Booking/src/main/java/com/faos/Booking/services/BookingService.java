package com.faos.Booking.services;

import com.faos.Booking.models.Booking;
import com.faos.Booking.repositories.BookingRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Flux<Booking> getAllBookings() {
        return Flux.fromIterable(bookingRepository.findAll());
    }

    public Mono<Booking> saveBooking(Booking booking) {
        return Mono.just(bookingRepository.save(booking));
    }
}