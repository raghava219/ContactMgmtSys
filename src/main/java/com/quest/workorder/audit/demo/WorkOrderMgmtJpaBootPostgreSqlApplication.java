package com.quest.workorder.audit.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.quest.workorder.main.repository.WorkOrderMovementRepository;

@SpringBootApplication
@ComponentScan("com.quest.workorder")
public class WorkOrderMgmtJpaBootPostgreSqlApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory
			.getLogger(WorkOrderMgmtJpaBootPostgreSqlApplication.class);

	
	  @Autowired private WorkOrderMovementRepository workOrderMovementRepository;
	 
	
	public static void main(String[] args) {
		SpringApplication.run(WorkOrderMgmtJpaBootPostgreSqlApplication.class,
				args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Application Running...");

	}

}
