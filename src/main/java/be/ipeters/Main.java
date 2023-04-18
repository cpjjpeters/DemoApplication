package be.ipeters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
//@EnableAutoConfiguration(exclude={org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration.class})
@ComponentScan(basePackages = { "be.ipeters", "be.ipeters.crud.mapper" })
@EnableScheduling
public class Main {
    public static void main(String[] args) {
//		ApplicationContext ctx =
				SpringApplication.run(Main.class, args);
        log.debug("Hello world!");

//	JmsTemplate jms = ctx.getBean(JmsTemplate.class);
//		jms.convertAndSend("javainuse", "test message");
	}

//    	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

}