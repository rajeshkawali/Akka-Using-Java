---------------------------------------------------------------------------------------------------
To run your class in the JVM. You can use -Dexec.args="arg0 arg1" to pass arguments.(Git-Bash)

C:\WorkSpace\JavaWithAkka>mvn clean install

C:\WorkSpace\JavaWithAkka>mvn exec:java -Dexec.mainClass="com.akka.main.PrimeCalculator" -Dexec.args="2 5"

---------------------------------------------------------------------------------------------------
If you want to use this regularly, you can add the parameters into the pom.xml as well

<!-- 
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>exec-maven-plugin</artifactId>
				<version>1.2.1</version>
				<executions>
					<execution>
						<goals>
							<goal>java</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<mainClass>com.akka.main.PrimeCalculator</mainClass>
					<arguments>
						<argument>4</argument>
						<argument>6</argument>
					</arguments>
				</configuration>
			</plugin>
 -->
 
 ---------------------------------------------------------------------------------------------------
 
 
 ---------------------------------------------------------------------------------------------------