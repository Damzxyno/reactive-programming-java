package com.damzxyno.javareactiveprogramming.flutterwave;

public enum Flutterwave_API {
    BASE_URL("https://api.flutterwave.com/v3/");

    private final String url;

    Flutterwave_API(String url){
        this.url = url;
    }

    public String toString(){
        return url;
    }
}
