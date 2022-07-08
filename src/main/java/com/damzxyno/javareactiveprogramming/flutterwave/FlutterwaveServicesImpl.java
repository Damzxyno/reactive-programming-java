package com.damzxyno.javareactiveprogramming.flutterwave;

import com.damzxyno.javareactiveprogramming.ApiResponsePayload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class FlutterwaveServicesImpl {
    private final FlutterwaveProperties flutterwaveProperties;

    public ResponseEntity<ApiResponsePayload> getBanksRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization","Bearer " + flutterwaveProperties.getSecretKey());
        return restTemplate.exchange(Flutterwave_API.BASE_URL + "banks/NG", HttpMethod.GET,  new HttpEntity<>(headers), ApiResponsePayload.class);
    }


}
