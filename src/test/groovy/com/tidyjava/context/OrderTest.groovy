package com.tidyjava.context

import com.tidyjava.postman.PostmanSpy

import static com.tidyjava.context.ContextExtension.ctx

class OrderTest extends GroovyTestCase {

    def postman = new PostmanSpy()

    void setUp() {
        ctx["postman"] = postman
    }

    void testConfirm() {
        def order = new Order(123)
        order.confirm()
        assert postman.mail == "Order 123 confirmation"
    }
}
