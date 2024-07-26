package edu.ict.rms.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Integer id;
    private String name;
    private String city;
    private Integer contact;
}
