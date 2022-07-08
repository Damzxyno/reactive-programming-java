package com.damzxyno.javareactiveprogramming;

import com.damzxyno.javareactiveprogramming.flutterwave.Bank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponsePayload{
    private String status;
    private String message;
    private List<Bank> data;
}
