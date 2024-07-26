package edu.ict.rms.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Long itemId;
    private String name;
    private Double rentalPerDay;
    private Double getFinePerDay;
}
