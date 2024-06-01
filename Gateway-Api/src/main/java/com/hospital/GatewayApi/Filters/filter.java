package com.hospital.GatewayApi.Filters;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class filter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("Request coming.....");
        ServerHttpRequest request = exchange.getRequest();
        String url = request.getURI().toString();

        /*String countryName = request.getHeaders().getFirst("country");

        if (countryName.equals("US")){
            try {
                throw new Exception("Country not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }*/
        log.info("URL : " + url);
        return chain.filter(exchange);
    }
}