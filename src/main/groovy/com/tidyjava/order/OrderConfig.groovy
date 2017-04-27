package com.tidyjava.order

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OrderConfig {

    @Bean
    def orderRepository() {
        return new OrderRepository()
    }

    @Bean
    def postman() {
        return new Postman()
    }
}
