package com.example.democonsumer;

import com.example.demoprovider.service.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication
public class DemoConsumerApplication
{

	//public static void main(String[] args)
	//{
	//	SpringApplication.run(DemoConsumerApplication.class, args);
	//}

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoConsumerApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);

		//while (true)
		{
			HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
					.getBean("helloSyncServiceReference");

			System.out.println(helloSyncServiceReference.saySync("sync"));
		}
	}
}
