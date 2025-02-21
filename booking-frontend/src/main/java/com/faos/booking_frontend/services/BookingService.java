package com.faos.booking_frontend.services;

import com.faos.booking_frontend.models.BookingModel;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class BookingService {
    private final WebClient webClient;

    public BookingService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080/api/bookings").build();
    }

    public Flux<BookingModel> getAllBookings() {
        return webClient.get().retrieve().bodyToFlux(BookingModel.class);
    }

    public Mono<BookingModel> addBooking(BookingModel booking) {
        return webClient.post().bodyValue(booking).retrieve().bodyToMono(BookingModel.class);
    }
}