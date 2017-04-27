package com.tidyjava.injection

class InjectionOrder {
    def id
    def postman

    InjectionOrder(id, postman) {
        this.id = id
        this.postman = postman
    }

    def confirm() {
        postman.send("Order $id confirmation")
    }
}
