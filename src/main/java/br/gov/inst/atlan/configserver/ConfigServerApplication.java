package br.gov.inst.atlan.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.Arrays;
import java.util.Comparator;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		Arrays.stream(args).sorted(Comparator.reverseOrder());
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
