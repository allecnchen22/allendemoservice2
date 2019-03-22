package com.example.allendemoservice2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;

import io.prometheus.client.hotspot.DefaultExports;

@EnablePrometheusMetrics
@SpringBootApplication
public class Allendemoservice2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Allendemoservice2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DefaultExports.initialize();
	}

}
