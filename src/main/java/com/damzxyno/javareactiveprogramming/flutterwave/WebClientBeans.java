package com.damzxyno.javareactiveprogramming.flutterwave;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBeans {

    @Bean(name = "flutterWebClient")
    public WebClient getWebClientBean(){
        return WebClient.builder().baseUrl(Flutterwave_API.BASE_URL).build();
    }


    @Bean(name = "dummyTextWebClient")
    public WebClient getDummyTextClientBean(){
        return WebClient.builder().baseUrl("https://restcountries.com/v3.1/").build();
    }
}
