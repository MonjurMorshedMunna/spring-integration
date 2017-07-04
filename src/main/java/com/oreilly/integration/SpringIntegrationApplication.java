package com.oreilly.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

  @Autowired
  private EnhancedPrinterGateway gateway;


  public static void main(String[] args) {
    SpringApplication.run(SpringIntegrationApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments pApplicationArguments) throws Exception {
    Person[] payloads = {new Person("Kevin", "Bowsersox"), new Person("Monjur", "Morshed"), new Person("Jane", "Doe'")};
    for (int x = 0; x < payloads.length; x++) {
      this.gateway.print(payloads[x]);
//      System.out.println(returnMessage);
    }

  }
}
