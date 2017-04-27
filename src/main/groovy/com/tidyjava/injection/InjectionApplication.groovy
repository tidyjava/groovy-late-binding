package com.tidyjava.injection

import com.tidyjava.postman.Postman

class InjectionApplication {
    static void main(String[] args) {
        def postman = new Postman()
        def orderRepository = new InjectionOrderRepository()

        orderRepository.orders[123L] = new InjectionOrder(123L, postman)

        def orderRef = new InjectionOrderRef(123L, orderRepository)
        orderRef().confirm()

        orderRef.notExisting
    }
}
