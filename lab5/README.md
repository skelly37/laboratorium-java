# Laboratorium 5
## Kod źródłowy
- [src](./src/main/java/lab5)
- [application.properties](./src/main/resources/application.properties)
- [pom.xml](./pom.xml)

## Wynik programu
### Logi serwera
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.4)

2024-12-02T11:44:00.927+01:00  INFO 13844 --- [           main] lab5.MainApplication                     : Starting MainApplication using Java 21.0.3 with PID 13844 (/Users/skelly/repos/lab5/target/classes started by skelly in /Users/skelly/repos/lab5)
2024-12-02T11:44:00.928+01:00  INFO 13844 --- [           main] lab5.MainApplication                     : No active profile set, falling back to 1 default profile: "default"
2024-12-02T11:44:01.154+01:00  INFO 13844 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-12-02T11:44:01.175+01:00  INFO 13844 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 16 ms. Found 2 JPA repository interfaces.
2024-12-02T11:44:01.354+01:00  INFO 13844 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-12-02T11:44:01.357+01:00  INFO 13844 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-12-02T11:44:01.357+01:00  INFO 13844 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.13]
2024-12-02T11:44:01.388+01:00  INFO 13844 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-12-02T11:44:01.388+01:00  INFO 13844 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 444 ms
2024-12-02T11:44:01.449+01:00  INFO 13844 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-12-02T11:44:01.474+01:00  INFO 13844 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.9.Final
2024-12-02T11:44:01.475+01:00  INFO 13844 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2024-12-02T11:44:01.525+01:00  INFO 13844 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-12-02T11:44:01.576+01:00  INFO 13844 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-12-02T11:44:01.583+01:00  INFO 13844 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-12-02T11:44:01.631+01:00  INFO 13844 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@6eede35e
2024-12-02T11:44:01.632+01:00  INFO 13844 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-12-02T11:44:01.727+01:00  INFO 13844 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-12-02T11:44:01.971+01:00  INFO 13844 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: create table rectangles (id bigserial not null, alpha integer not null, blue integer not null, green integer not null, red integer not null, height float(53) not null, width float(53) not null, primary key (id))
Hibernate: create table triangles (id bigserial not null, alpha integer not null, blue integer not null, green integer not null, red integer not null, a float(53) not null, b float(53) not null, c float(53) not null, primary key (id))
2024-12-02T11:44:02.022+01:00  INFO 13844 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-12-02T11:44:02.127+01:00  WARN 13844 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2024-12-02T11:44:02.250+01:00  INFO 13844 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2024-12-02T11:44:02.253+01:00  INFO 13844 --- [           main] lab5.MainApplication                     : Started MainApplication in 1.474 seconds (process running for 1.836)
2024-12-02T11:44:06.542+01:00  INFO 13844 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2024-12-02T11:44:06.543+01:00  INFO 13844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2024-12-02T11:44:06.544+01:00  INFO 13844 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
Hibernate: insert into rectangles (alpha,blue,green,red,height,width) values (?,?,?,?,?,?)
Hibernate: insert into triangles (a,b,c,alpha,blue,green,red) values (?,?,?,?,?,?,?)
Hibernate: select r1_0.id,r1_0.alpha,r1_0.blue,r1_0.green,r1_0.red,r1_0.height,r1_0.width from rectangles r1_0
Hibernate: select t1_0.id,t1_0.a,t1_0.b,t1_0.c,t1_0.alpha,t1_0.blue,t1_0.green,t1_0.red from triangles t1_0
```

### Zrzuty ekranu z klienta HTTP
#### Utworzenie Rectangle

#### Utworzenie Triangle


#### Pobranie dostępnych obiektów

