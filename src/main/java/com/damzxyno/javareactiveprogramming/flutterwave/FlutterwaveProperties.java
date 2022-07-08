package com.damzxyno.javareactiveprogramming.flutterwave;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class FlutterwaveProperties {
    @Value("${flutter_public_key}")
    private String publicKey;

    @Value("${flutter_secret_key}")
    private String secretKey;

    @Value("${flutter_encryption_key}")
    private String encryption;
}
