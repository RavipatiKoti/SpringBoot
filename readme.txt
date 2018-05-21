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
    
    
