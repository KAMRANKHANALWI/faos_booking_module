package com.faos.booking_frontend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingModel {
    private Long bookingId;
    private Long customerId;
    private Long cylinderId;
    private LocalDateTime bookingDate;
    private LocalDateTime deliveryDate;
    private String paymentMode;
    private String paymentStatus;
    private String bookingStatus;
    private double additionalCharges;
    private double amount;
    private double totalAmount;
}
