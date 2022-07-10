package com.damzxyno.javareactiveprogramming;

import com.damzxyno.javareactiveprogramming.flutterwave.Bank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiResponsePayload{
    private String status;
    private String message;
    private List<Bank> data;
}
