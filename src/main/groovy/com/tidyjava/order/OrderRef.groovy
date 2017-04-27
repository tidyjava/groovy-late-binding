package com.tidyjava.order

class OrderRef {
    Long value

    OrderRef(Long value) {
        this.value = value
    }

    Order call() {
        orderRepository.findOne(value)
    }
}
