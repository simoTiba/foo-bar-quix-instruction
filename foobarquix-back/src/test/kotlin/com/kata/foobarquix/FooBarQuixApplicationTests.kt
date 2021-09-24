package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
class FooBarQuixApplicationTests {

    @Autowired
    lateinit var fooBarQuixService: FooBarQuixService;

    @Test
    fun convert_shouldReturnBarBuzz_whenInputIs_10() {
        //Given
        var input = 10;
        var expected = "BarBuzz";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnOne_whenInputIs_1() {
        //Given
        var input = 1;
        var expected = "1";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnFooFoo_whenInputIs_3() {
        //Given
        var input = 3;
        var expected = "FooFoo";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnBarBar_whenInputIs_5() {
        //Given
        var input = 5;
        var expected = "BarBar";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnQuixQuix_whenInputIs_7() {
        //Given
        var input = 7;
        var expected = "QuixQuix";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnQuixQuixQuix_whenInputIs_77() {
        //Given
        var input = 77;
        var expected = "QuixQuixQuix";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnFoo_whenInputIs_9() {
        //Given
        var input = 9;
        var expected = "Foo";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnFooBar_whenInputIs_51() {
        //Given
        var input = 51;
        var expected = "FooBar";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnBarFoo_whenInputIs_53() {
        //Given
        var input = 53;
        var expected = "BarFoo";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }


    @Test
    fun convert_shouldReturnFooFooFoo_whenInputIs_33() {
        //Given
        var input = 33;
        var expected = "FooFooFoo";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnFooQuix_whenInputIs_27() {
        //Given
        var input = 27;
        var expected = "FooQuix";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnFooBarBar_whenInputIs_15() {
        //Given
        var input = 15;
        var expected = "FooBarBar";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }

    @Test
    fun convert_shouldReturnOneOne_whenInputIs_11() {
        //Given
        var input = 11;
        var expected = "11";

        //When
        var result = fooBarQuixService.convertNumber(input);

        //Then
        assertEquals(result, expected);
    }
}
