package alp.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientApp {
  public static void main(String[] args) {
    SpringApplication.run(EurekaClientApp.class, args);
  }
}

//org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration