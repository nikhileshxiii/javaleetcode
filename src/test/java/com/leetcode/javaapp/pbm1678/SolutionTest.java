package com.leetcode.javaapp.pbm1678;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@DisplayNameGeneration(SolutionTest.CustomDisplayNameGenerator.class)
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void interpret1() {
        String command = "G()(al)";
        String Output = "Goal";
        Assertions.assertEquals(Output, solution.interpret(command));
    }

    @Test
    void interpret2() {
        String command = "G()()()()(al)";
        String Output = "Gooooal";
        Assertions.assertEquals(Output, solution.interpret(command));
    }

    @Test
    void interpret3() {
        String command = "(al)G(al)()()G";
        String Output = "alGalooG";
        Assertions.assertEquals(Output, solution.interpret(command));
    }

    static class CustomDisplayNameGenerator extends DisplayNameGenerator.Standard {

        @Override
        public String generateDisplayNameForClass(Class<?> testClass) {
            return this.getClass().getPackageName();
        }

        @Override
        public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
            return super.generateDisplayNameForNestedClass(nestedClass);
        }

        @Override
        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
            String name = testMethod.getName();
            return Arrays.stream(name.split("_")).collect(Collectors.joining(" | "));
        }
    }
}