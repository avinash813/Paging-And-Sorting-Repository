package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.Entity.VaccineInfo;
import com.sample.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		VaccineManagementImpl obj = context.getBean(VaccineManagementImpl.class);
		
//		Iterable<VaccineInfo> vaccineList = obj.fetchDetails(false, "vaccineName", "country"); //true for ASC and false for DESC
//		vaccineList.forEach((c) -> System.out.println(c));
		
//		obj.fetchDetailsByPgNo(1, 2, true, "vaccineName", "country" ).forEach((c) -> System.out.println(c));
		
		obj.fetchDetailsByPgSize(2);
		
		context.close();

		
	}

}
