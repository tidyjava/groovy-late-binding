package com.tidyjava.locator

import com.tidyjava.postman.Postman

class LocatorApplication {
    static void main(String[] args) {
        ServiceLocator.postman = new Postman()
        ServiceLocator.orderRepository = new LocatorOrderRepository()

        def orderRef = new LocatorOrderRef(123L)
        orderRef().confirm()

        orderRef.notExisting
    }
}
