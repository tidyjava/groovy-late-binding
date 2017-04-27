package com.tidyjava.context.map

import com.tidyjava.context.OrderRef
import com.tidyjava.context.OrderRepository
import com.tidyjava.postman.Postman

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
