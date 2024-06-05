package com.chinhbean.bookinghotel.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hotel_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;
}
