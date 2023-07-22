package com.promineotech;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	
	/*
	 * In TestDemoJUnitTest.java, add a private instance variable of type TestDemo named
	 * testDemo.
	 * 
	 * In the setUp method, create the TestDemo object. This will ensure that a new
	 * TestDemo object is created before each test.
	 * 
	 */

	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		
		testDemo = new TestDemo();
	}
	
	/*
	 * Change "@Test" to "@ParameterizedTest". Add the import statement for
	 * org.junit.jupiter.params.ParameterizedTest.
	 
	 * Just below the @ParameterizedTest annotation, add the
	 * annotation @MethodSource.
	 * 
	 * Pass a single parameter to @MethodSource. It must be the fully-qualified
	 * (includes package) class name of the test followed by a # sign followed by
	 * the name of the method that supplies the parameters. Since the test is in the
	 * default package, there is no package in the fully-qualified class name. So,
	 */
	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	
	/* Change the name of method "test" to
	 * "assertThatTwoPositiveNumbersAreAddedCorrectly".
	 * 
	 * Add four parameters to assertThatTwoPositiveNumbersAreAddedCorrectly
	 
	 * Write the test. Remove the "fail" line. Test the value of expectException. If
	 * it is false, assert that when TestDemo.addPositive is called with values a
	 * and b, that the result is the same as the parameter expected.
	 * 
	 * Add the test for the thrown exception in an else clause. Use
	 * assertThatThrownBy for this. Add the static import
	 * org.assertj.core.api.Assertions.assertThatThrownBy;
	 * 
	 * As a parameter to assertThatThrownBy, add a Lambda expression with no
	 * parameters. The Lambda body should be the method call to
	 * testDemo.addPositive.
	 * 
	 * Use the assertion isInstanceOf(IllegalArgumentException.class) to ensure that
	 * the correct exception is thrown.
	 */
	
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException)
	{
		if(!expectException) {
			  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
			}else {
	            assertThatThrownBy(() -> testDemo.addPositive(a, b))
            .isInstanceOf(IllegalArgumentException.class);
			}	
	}
	
	/*
	 * Create a static method named argumentsForAddPositive. It should not have any
	 * parameters and it should return a Stream of Arguments. The imports are:
	 * java.util.stream.Stream and org.junit.jupiter.params.provider.Arguments.
	 * 
	 * The method should return a Stream as in Stream.of();
	 * 
	 * Each parameter set should be wrapped in an arguments() method call. Add the
	 * static import for arguments:
	 * org.junit.jupiter.params.provider.Arguments.arguments.
	 * 
	 * So, if you are adding 2 and 4 to get the value of 6 and are not expecting an
	 * exception, you need to do: arguments(2, 4, 6, false)
	 * 
	 * Add as many arguments lines as needed to test the addPositive method
	 * thoroughly. Make sure to add some zero or negative arguments
	 * 
	 */
	
	public static Stream<Arguments> argumentsForAddPositive() {
        return Stream.of(
               Arguments.arguments(2, 4, 6, false),
               Arguments.arguments(0, 4, 4, true),
               Arguments.arguments(-2, -4, 2, true));
    }
	
	/*
	 * Change "@Test" to "@ParameterizedTest". Add the import statement for
	 * org.junit.jupiter.params.ParameterizedTest.
	 
	 * Just below the @ParameterizedTest annotation, add the
	 * annotation @MethodSource.
	 * 
	 * Pass a single parameter to @MethodSource. It must be the fully-qualified
	 * (includes package) class name of the test followed by a # sign followed by
	 * the name of the method that supplies the parameters. Since the test is in the
	 * default package, there is no package in the fully-qualified class name. So,
	 */
	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForMultiplyPositive")
	
	/* Change the name of method "test" to
	 * "assertThatTwoPositiveNumbersAreMultipliedCorrectly".
	 * 
	 * Add four parameters to assertThatTwoPositiveNumbersAreAddedCorrectly
	 
	 * Write the test. Remove the "fail" line. Test the value of expectException. If
	 * it is false, assert that when TestDemo.multiplyPositive is called with values a
	 * and b, that the result is the same as the parameter expected.
	 * 
	 * Add the test for the thrown exception in an else clause. Use
	 * assertThatThrownBy for this. Add the static import
	 * org.assertj.core.api.Assertions.assertThatThrownBy;
	 * 
	 * As a parameter to assertThatThrownBy, add a Lambda expression with no
	 * parameters. The Lambda body should be the method call to
	 * testDemo.multiplyPositive.
	 * 
	 * Use the assertion isInstanceOf(IllegalArgumentException.class) to ensure that
	 * the correct exception is thrown.
	 */
	void assertThatTwoPositiveNumbersAreMultipliedCorrectly(int a, int b, int expected, boolean expectException)
	{
		if(!expectException) {
			  assertThat(testDemo.multiplyPositive(a, b)).isEqualTo(expected);
			}else {
	            assertThatThrownBy(() -> testDemo.multiplyPositive(a, b))
            .isInstanceOf(IllegalArgumentException.class);
			}	
	}
	/*
	 * Create a static method named argumentsForMultiplyPositive. It should not have any
	 * parameters and it should return a Stream of Arguments. The imports are:
	 * java.util.stream.Stream and org.junit.jupiter.params.provider.Arguments.
	 * 
	 * The method should return a Stream as in Stream.of();
	 * 
	 * Each parameter set should be wrapped in an arguments() method call. Add the
	 * static import for arguments:
	 * org.junit.jupiter.params.provider.Arguments.arguments.
	 * 
	 * So, if you are adding 2 and 4 to get the value of 6 and are not expecting an
	 * exception, you need to do: arguments(2, 4, 8, false)
	 * 
	 * Add as many arguments lines as needed to test the addPositive method
	 * thoroughly. Make sure to add some zero or negative arguments
	 * 
	 */
	
	public static Stream<Arguments> argumentsForMultiplyPositive() {
        return Stream.of(
               Arguments.arguments(2, 4, -8, false),
               Arguments.arguments(0, 4, -4, true),
               Arguments.arguments(-2, -4, -8, true));
    }

}
