package com.tidyjava.context.map

import com.tidyjava.context.ContextExtension

import java.util.concurrent.ConcurrentHashMap

class MapContext implements ContextExtension.Context {
    private final Map<String, Object> map = new ConcurrentHashMap<>()

    def getAt(String name) {
        map[name]
    }

    def putAt(String name, Object value) {
        map[name] = value
    }
}