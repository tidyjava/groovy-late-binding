package com.tidyjava.order

class OrderRepository {
    def orders = [123L: new Order(123L)]

    def findOne(Long id) {
        orders[id]
    }
}
