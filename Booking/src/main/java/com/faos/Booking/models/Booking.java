//package com.faos.Booking.models;
//
//import com.faos.Booking.models.enums.BookingStatus;
//import com.faos.Booking.models.enums.PaymentMode;
//import com.faos.Booking.models.enums.PaymentStatus;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "bookings")
//public class Booking {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long bookingId;
//    private Long customerId;
//    private Long cylinderId;
//    private LocalDateTime bookingDate = LocalDateTime.now();
//    private LocalDateTime deliveryDate;
//
//    @Enumerated(EnumType.STRING)
//    private PaymentMode paymentMode;
//
//    @Enumerated(EnumType.STRING)
//    private PaymentStatus paymentStatus;
//
//    @Enumerated(EnumType.STRING)
//    private BookingStatus bookingStatus;
//
//    private double additionalCharges;
//    private double amount;
//    private double totalAmount;
//}

package com.faos.Booking.models;

import com.faos.Booking.models.enums.BookingStatus;
import com.faos.Booking.models.enums.PaymentMode;
import com.faos.Booking.models.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;
    private Long customerId;
    private Long cylinderId;
    private LocalDateTime bookingDate = LocalDateTime.now();
    private LocalDateTime deliveryDate;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private double additionalCharges;
    private double amount;
    private double totalAmount;
}