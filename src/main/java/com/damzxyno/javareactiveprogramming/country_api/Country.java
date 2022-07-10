package com.damzxyno.javareactiveprogramming.country_api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private Name name;
    private String [] capital;
    private Long population;
    private String region;
    private String subregion;
}
