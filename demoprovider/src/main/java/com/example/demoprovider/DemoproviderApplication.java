package com.example.demoprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml"})
@SpringBootApplication
public class DemoproviderApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DemoproviderApplication.class, args);
	}
}
