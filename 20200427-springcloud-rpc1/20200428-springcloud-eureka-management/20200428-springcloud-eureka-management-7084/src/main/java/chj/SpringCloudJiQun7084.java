package chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：chj
 * @date ：Created in 2020/4/28 20:48
 * @params :
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudJiQun7084 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudJiQun7084.class,args);
    }
}
