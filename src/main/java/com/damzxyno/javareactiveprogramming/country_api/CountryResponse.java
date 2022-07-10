package com.damzxyno.javareactiveprogramming.country_api;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryResponse {
    private String name;
    private String capital;
    private String population;
    private String region;
    private String subregion;
}
