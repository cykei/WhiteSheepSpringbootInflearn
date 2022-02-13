package me.whitesheep.demo;

import me.cykei.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
        //SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    public Holoman holoman(){
//      Holoman holoman = new Holoman();
//      holoman.setName("yy");
//      holoman.setHowLong(34);
//      return holoman;
//    }

}
