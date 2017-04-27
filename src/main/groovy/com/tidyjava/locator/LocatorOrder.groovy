package com.tidyjava.locator

import static com.tidyjava.locator.ServiceLocator.postman

class LocatorOrder {
    def id

    LocatorOrder(id) {
        this.id = id
    }

    def confirm() {
        postman.send("Order $id confirmation")
    }
}
