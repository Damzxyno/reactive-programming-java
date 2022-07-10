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

    public static CountryResponse convertFromCountry (Country x){
        return CountryResponse.builder()
                .capital(x.getCapital() == null? "" : x.getCapital()[0])
                .name(x.getName().getOfficial())
                .population(String.format("%,2d",x.getPopulation()))
                .region(x.getRegion())
                .subregion(x.getSubregion())
                .build();
    }
}
