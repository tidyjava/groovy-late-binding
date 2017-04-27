package com.tidyjava

import com.tidyjava.context.ContextExtension
import com.tidyjava.context.SpringContext
import com.tidyjava.order.OrderRef
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class SpringApplication {
    static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.tidyjava")
        ContextExtension.ctx = new SpringContext(applicationContext)

        def orderRef = new OrderRef(123L)
        orderRef().confirm()

        orderRef.notExisting
    }
}



