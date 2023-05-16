package easyweb.easywebeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EasyWebEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyWebEurekaApplication.class, args);
    }

}
