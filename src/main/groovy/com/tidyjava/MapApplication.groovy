package com.tidyjava

import com.tidyjava.order.OrderRef
import com.tidyjava.order.OrderRepository
import com.tidyjava.order.Postman

import static com.tidyjava.context.ContextExtension.ctx

class MapApplication {
    static void main(String[] args) {
        ctx["orderRepository"] = new OrderRepository()
        ctx["postman"] = new Postman()

        def orderRef = new OrderRef(123L)
        orderRef().confirm()

        orderRef.notExisting
    }
}



