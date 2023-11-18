package com.xuanzhe.helloworld.pojo;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix="person")
@Validated
public class Person {
  @Email()
  private String name;
  private Integer age;
  private Boolean happy;
  private Date birth;
  private Map<String, Object> maps;
  private List<Object> lists;
  private Dog dog;
}
