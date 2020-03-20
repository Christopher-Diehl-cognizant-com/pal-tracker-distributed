package io.pivotal.pal.tracker.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author 780449
 */
@EnableEurekaServer
@SpringBootApplication
public class App {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}