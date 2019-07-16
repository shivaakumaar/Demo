package com.maven;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class MavenApplication {
	 private static final Logger LOGGER = LogManager.getLogger(MavenApplication.class);
	public static void main(String[] args) {
		LOGGER.info("enered  into  main()");
		SpringApplication.run(MavenApplication.class, args);
		 
	        LOGGER.debug("Debug level log message");
	        LOGGER.error("Error level log message");
	}

}
