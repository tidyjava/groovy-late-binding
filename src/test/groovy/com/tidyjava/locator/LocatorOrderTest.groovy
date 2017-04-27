package com.tidyjava.locator

import com.tidyjava.postman.PostmanSpy

class LocatorOrderTest extends GroovyTestCase {

    def postman = new PostmanSpy()

    void setUp() {
        ServiceLocator.postman = postman
    }

    void testConfirm() {
        def order = new LocatorOrder(123)
        order.confirm()
        assert postman.mail == "Order 123 confirmation"
    }
}
