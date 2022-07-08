package com.damzxyno.javareactiveprogramming.flutterwave;

import com.damzxyno.javareactiveprogramming.ApiResponsePayload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bank")
public class FlutterController {
    private final FlutterwaveServicesImpl flutterwaveServices;

    @GetMapping("/rest-template")
    public ResponseEntity<ApiResponsePayload> getBanksUsingRestTemplate(){
        var x = flutterwaveServices.getBanksRestTemplate();
        System.out.println(x.getBody().getData().size());
        return x;
    }
}
