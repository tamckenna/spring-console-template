package com.creoslate.template;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    @Test public void testAppHasAGreeting() {
        Application classUnderTest = new Application();
        assertNotNull("app should have a greeting", classUnderTest.getHelloWorld());
    }
}
