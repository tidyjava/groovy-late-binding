package com.tidyjava.injection

import com.tidyjava.postman.PostmanSpy

class InjectionOrderTest extends GroovyTestCase {

    def postman = new PostmanSpy()

    void testConfirm() {
        def order = new InjectionOrder(123, postman)
        order.confirm()
        assert postman.mail == "Order 123 confirmation"
    }
}
