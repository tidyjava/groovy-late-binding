package com.tidyjava.context

import com.tidyjava.context.map.MapContext

class ContextExtension {
    static volatile Context ctx = new MapContext()

    static propertyMissing(Object self, String name) {
        def object = ctx[name]
        if (object) {
            return object
        } else {
            throw new MissingPropertyException(name, self.class)
        }
    }

    static interface Context {
        def getAt(String name)
    }
}

