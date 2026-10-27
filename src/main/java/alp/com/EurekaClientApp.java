package alp.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EurekaClientApp {
  public static void main(String[] args) {
    SpringApplication.run(EurekaClientApp.class, args);
  }
  
  @GetMapping("/test")
  public String test() {
	  return "test";
  }
}



//org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration