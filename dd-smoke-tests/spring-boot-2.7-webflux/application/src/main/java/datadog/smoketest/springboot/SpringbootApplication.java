package datadog.smoketest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

  public static void main(final String[] args) throws InterruptedException {
    SpringApplication.run(SpringbootApplication.class, args);
  }
}
