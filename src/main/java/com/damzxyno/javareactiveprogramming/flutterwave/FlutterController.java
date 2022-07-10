package com.damzxyno.javareactiveprogramming.flutterwave;

import com.damzxyno.javareactiveprogramming.ApiResponsePayload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bank")
public class FlutterController {
    private final FlutterwaveServicesImpl flutterwaveServices;

    @GetMapping("/rest-template")
    public ResponseEntity<ApiResponsePayload> getBanksUsingRestTemplate(){
        return flutterwaveServices.getBanksRestTemplate();
    }

    @GetMapping("/webclient")
    public ResponseEntity<Mono<ApiResponsePayload>> getBanksUsingWebclient(){
        return flutterwaveServices.getBanksWebClient();
    }
}
