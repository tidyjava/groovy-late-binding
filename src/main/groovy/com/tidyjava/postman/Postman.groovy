package com.tidyjava.postman

import org.springframework.stereotype.Service

@Service
class Postman {
    def send(String mail) {
        println(mail)
    }
}
