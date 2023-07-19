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
	private TestDemo testDemo;
	@BeforeEach
	void setUp() throws Exception {
		
		testDemo = new TestDemo();
	}

	@Test
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException)
	{
		if(!expectException) {
			  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
			}else {
	            assertThatThrownBy(() -> testDemo.addPositive(a, b))
            .isInstanceOf(IllegalArgumentException.class);
			}	
	}
	
	static Stream<Arguments> argumentsForAddPositive() {
        return Stream.of(
                Arguments.arguments(2, 4, 6, false),
                Arguments.arguments(0, 4, 4, true),
                Arguments.arguments(-2, 4, 2, true));
    }

}
