package com.tidyjava.context

class OrderRef {
    Long value

    OrderRef(Long value) {
        this.value = value
    }

    Order call() {
        orderRepository.findOne(value)
    }
}
