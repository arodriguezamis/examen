# Maven - Aplicacion de Prueba
Maven 3, Spring 5 MVC, JUnit 5, Logback and Jetty web server. A simple web project to display a current date.

Project Link - https://github.com/arodriguezamis/examen.git


## 1. Como compilar este proyecto?

### 1.1 Crear un WAR con maven :
```
$ git clone https://github.com/arodriguezamis/examen.git
$ cd examen
$ mvn clean install
```
NOTA IMPORTANTE: En caso de se desee instalar en tomcat. Antes de compilar se necesita modificar el archivo pom.xml y sustituir esta sección:

<!-- Some containers like Tomcat don't have jstl library -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
			<scope>provided</scope> <--- ELIMINAR ESTA LINEA EN CASO DE INTENTAR INSTALAR EN TOMCAT
		</dependency>



El war final se genera en la ruta 'target/finalName'

