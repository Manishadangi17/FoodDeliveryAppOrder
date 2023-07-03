package com.capg.FoodDeliveryAppOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan({"com.capg.FoodDeliveryAppOrder.entity.Customer"})
//@EnableJpaRepositories("com.capg.FoodDeliveryAppOrder.entity.Customer")
public class FoodDeliveryAppOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryAppOrderApplication.class, args);
	}

}
