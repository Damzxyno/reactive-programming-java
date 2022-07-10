package com.damzxyno.javareactiveprogramming.country_api;

import com.damzxyno.javareactiveprogramming.ApiResponsePayload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final WebClient dummyTextWebClient;

    public Mono<List<CountryResponse>> getCountries() {
        return dummyTextWebClient
                .get()
                .uri( "all")
                .retrieve()
                .bodyToFlux(Country.class)
                .doOnNext(x -> System.out.println(Arrays.toString(x.getCapital())))
                .filter(x -> x.getRegion().equalsIgnoreCase("Africa"))
                .map(x -> CountryResponse.builder()
                        .capital(x.getCapital() == null? "" : x.getCapital()[0])
                        .name(x.getName().getOfficial())
                        .population(String.format("%,2d",x.getPopulation()))
                        .region(x.getRegion())
                        .subregion(x.getSubregion())
                        .build()
                ).collectSortedList(Comparator.comparing(CountryResponse::getName));
    }
}
