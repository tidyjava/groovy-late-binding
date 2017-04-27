package com.tidyjava.locator

class LocatorOrderRepository {
    def orders = [123L: new LocatorOrder(123L)]

    def findOne(Long id) {
        orders[id]
    }
}
