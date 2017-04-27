package com.tidyjava.injection

class InjectionOrderRepository {
    def orders = [:]

    def findOne(Long id) {
        orders[id]
    }
}
