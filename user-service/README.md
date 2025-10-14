### Procedimiento

- 1.- Cambiar el archivo application.properties a application.yml
- 2.- Copiar application.yml en el directorio config-repo  
- 3.- Agregar dependencia en el pom.xml
```
        <spring-cloud.version>2025.0.0</spring-cloud.version>

```
```
        <!-- Spring Cloud Config Client -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>

```
```
    <!-- Spring Cloud Dependencies -->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```