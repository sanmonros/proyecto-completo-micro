package com.microservice.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //necesitamos el cliente de webflux
    @Bean
    public WebClient webClient(){
        //Estamos creando un bean de webclient
        return WebClient.builder().build();
    }
}
