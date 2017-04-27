package com.tidyjava.context

import org.springframework.stereotype.Repository

@Repository
class OrderRepository {
    def orders = [123L: new Order(123L)]

    def findOne(Long id) {
        orders[id]
    }
}
