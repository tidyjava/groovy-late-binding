package com.tidyjava.context

class Order {
    def id

    Order(id) {
        this.id = id
    }

    def confirm() {
        postman.send("Order $id confirmation")
    }
}
