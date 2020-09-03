# JenkinsGroupTestCasesRun

Run specific xml from jenkins...

$  mvn clean test -Dsurefire.suiteXmlFiles=Sanity.xml


Important Files to look

POM.XML
<plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
          <configuration>
            <!-- Suite testng xml file to consider for test execution -->
            <suiteXmlFiles>
              <!--suppress UnresolvedMavenProperty, cmd: mvn clean test -Dsurefire.suiteXmlFiles=Sanity.xml -->
              <suiteXmlFile>${suiteXmlFiles}</suiteXmlFile>
            </suiteXmlFiles>
          </configuration>
        </plugin>
  
  Prerequisite:
  
  > maven has been setup
  
  
  

