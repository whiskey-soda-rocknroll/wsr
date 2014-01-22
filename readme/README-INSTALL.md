To set values for tomcat, apache, oracle please use environment variables(similar to JAVA_HOME, M2_HOME):
=========================================================================================================

* RMS_TOMCAT_SERVER - name of tomcat server(please, configure it in maven settings.xml)
* RMS_TOMCAT_URL - url of tomcat manager
* RMS_STATIC_DIRECTORY - path to apache directory for static resources of rms-info project
* RMS_ORACLE_DEFAULT_SCHEMA - default schema for database
* RMS_ORACLE_URL - url for oracle database
* RMS_ORACLE_USERNAME - username for oracle database
* RMS_ORACLE_PASSWORD - password for oracle database


_example:_

    RMS_TOMCAT_SERVER=localhost-server
    RMS_TOMCAT_URL=http://localhost:8085/manager/text
    RMS_STATIC_DIRECTORY=D:/opt/apache/htdocs/rms-info/static/
    RMS_ORACLE_DEFAULT_SCHEMA=team1
    RMS_ORACLE_URL=jdbc:oracle:thin:@localhost:1521:xe
    RMS_ORACLE_USERNAME=team1
    RMS_ORACLE_PASSWORD=team1

    maven settings.xml:

    	<server>
          <id>localhost-server</id>
          <username>managerScript</username>
          <password>Babc123</password>
        </server>

    tomcat tomcat-users.xml

        <user username="managerScript" password="Babc123" roles="manager-script"/>


_To deploy you can use:_

        Maven command line:   mvn clean install

Set Code style
	copy java_code_formatting_rules_intellij_idea.xml in {user.home.folder}\.IntelliJIdea12\config\codestyles\
        restart IntelliJIdea
        in IntelliJIdea File > Setting > Code Style > Set java_code_formatting_rules_intellij_idea