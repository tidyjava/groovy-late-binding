package com.tidyjava.postman

class PostmanSpy extends Postman {
    String mail

    def send(String mail) {
        this.mail = mail
    }
}
