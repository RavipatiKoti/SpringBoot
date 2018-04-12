This is basic spring boot application.

1.Download any Eclipse version
2.Create a Maven project
3.open the pom.xml
4.Add the dependency related to Spring boot project
   <parent>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-parent</artifactId>
     <version>1.5.6.RELEASE</version>
  </parent>
 
 <dependencies>
     <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-web</artifactId>
     </dependency>
     <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-devtools</artifactId>
     <optional>true</optional>
</dependency>
 </dependencies>

<properties>
 <java.version>1.8</java.version>
 </properties>  