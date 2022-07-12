package com.damzxyno.javareactiveprogramming.flutterwave;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "flutter")
public class FlutterwaveProperties {
    private String publicKey;
    private String secretKey;
    private String encryption;
}
