package com.tidyjava.locator

class LocatorOrderRef {
    Long value

    LocatorOrderRef(Long value) {
        this.value = value
    }

    LocatorOrder call() {
        ServiceLocator.orderRepository.findOne(value)
    }
}
