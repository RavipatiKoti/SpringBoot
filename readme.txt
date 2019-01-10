How to use profilers in Spring 
in pom.xml use like below
<profiles>
		<profile>
			<id>intg</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<properties>
				<configuration.properties.file>application-intg.properties</configuration.properties.file>
			</properties>
		</profile>
    
    <profie>
       <id>dev</id>
       <properties>
          <configuration.properties.file>application-dev.properties</configuration.properties.file>
       </properties>
    </profile>
    
    
    
    ComponentScan Info:
1.If your other packages hierarchies are below your main app with the @SpringBootApplication annotation, you’re covered by implicit components scan.

Let's suppose Main class in com.ravipati package.if you define a package under com.ravipati package then no need to specify the sub package in the component scan by default it takes.

2.If there are beans/components in other packages which are not sub packages of the main package, you should manually add them as @ComponentScan
    
Let's suppose Main Class in com.ravipati,and if we define other packages out side of the com.ravipati package then we need to specify the ComponentScan in the Main class package like below
##########################
package com.ravipati.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ravipati.controller")
public class SpringBootMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(SpringBootMainClass.class, args);
	}
}

################################
package com.ravipati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/")
	public String sayHello(){
		return "Hello Welcome to my tutorial";
	}
	
	
	
	
}
