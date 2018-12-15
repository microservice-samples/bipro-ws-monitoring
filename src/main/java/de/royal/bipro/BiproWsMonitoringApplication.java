package de.royal.bipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class BiproWsMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiproWsMonitoringApplication.class, args);
	}
}
