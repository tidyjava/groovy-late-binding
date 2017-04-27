package com.tidyjava.injection

class InjectionOrderRef {
    Long value
    InjectionOrderRepository orderRepository

    InjectionOrderRef(Long value, orderRepository) {
        this.value = value
        this.orderRepository = orderRepository
    }

    InjectionOrder call() {
        orderRepository.findOne(value)
    }
}
