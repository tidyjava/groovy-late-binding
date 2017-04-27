package com.tidyjava.context

import org.springframework.beans.factory.NoSuchBeanDefinitionException
import org.springframework.context.ApplicationContext

class SpringContext implements ContextExtension.Context {
    private final ApplicationContext springContext

    SpringContext(ApplicationContext springContext) {
        this.springContext = springContext
    }

    def getAt(String name) {
        try {
            return springContext.getBean(name)
        } catch (NoSuchBeanDefinitionException ignored) {
            return null
        }
    }
}
