package com.example.catfact;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CatfactApplicationTests {
	@BeforeAll
	static void beforeAll(){
		System.out.println("Before the class!!\n");
	}
	Random random;
	@BeforeEach
	void init(){
		random = new Random();
	}

	@AfterEach
	void afterEach(){
		System.out.println("After Each method\n");
	}

	@Test
	void sum(){
		int expected=2;
		int actual = random.sum(1,1);
		Assertions.assertEquals(expected,actual);
	}

	@Test
	void test2(){
		int[] array_actual = {1,2,3,4,5};
		System.out.println("Inside TestNG 2");
		Assertions.assertArrayEquals(random.array(),array_actual);
	}

	@Test
	void test3(){
		List<Integer> array_actual = new ArrayList<>();
		array_actual.add(1);
		array_actual.add(2);
		System.out.println(array_actual);
		Assertions.assertEquals(random.yoyo(), array_actual);
		System.out.println("Inside TestNG 3");
	}

}
