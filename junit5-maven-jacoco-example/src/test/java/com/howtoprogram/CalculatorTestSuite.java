package com.howtoprogram;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorTest.class
})
public class CalculatorTestSuite {
    // Esta clase permanece vacía. Es solo un contenedor para las pruebas.
}