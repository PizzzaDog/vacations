package by.andersen;

import by.andersen.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan("by.andersen")
public class ApplicationConfiguration {

  public static void main(String[] args) {
      SpringApplication.run(ApplicationConfiguration.class);
  }

  
}
