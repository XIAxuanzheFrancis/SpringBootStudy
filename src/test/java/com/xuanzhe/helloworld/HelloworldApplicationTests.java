package com.xuanzhe.helloworld;

import com.xuanzhe.helloworld.pojo.Dog;
import com.xuanzhe.helloworld.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {
  @Autowired
  private Dog dog;
  @Autowired
  private Person person;
  @Test
  void contextLoads() {
    System.out.println(dog.toString());
    System.out.println(person.toString());
  }

}
