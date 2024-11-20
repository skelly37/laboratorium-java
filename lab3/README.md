# Zadanie 3
## Pliki
- [Kod źródłowy](./src/main/java)
- [Testy](./src/test/java)
- [Raport pokrycia (przed dodaniem punktu 4)](./cov-bez-4.html)
- [pom.xml](./pom.xml)

## Wynik
### Main
```
[main] INFO ShapeDescriber - Shape type: Triangle | Red: 255, Green: 255, Blue: 255, Alpha: 0 | Area: 1.7320508075688772 | Perimeter: 6.0
[main] INFO ShapeDescriber - Shape type: Rectangle | Red: 0, Green: 0, Blue: 0, Alpha: 0 | Area: 6.0 | Perimeter: 10.0
```

### Testy
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< org.example:lab3 >--------------------------
[INFO] Building lab3 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.9:prepare-agent (default) @ lab3 ---
[INFO] argLine set to -javaagent:/Users/skelly/.m2/repository/org/jacoco/org.jacoco.agent/0.8.9/org.jacoco.agent-0.8.9-runtime.jar=destfile=/Users/skelly/repos/lab3/target/jacoco.exec
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ lab3 ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ lab3 ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ lab3 ---
[INFO] skip non existing resourceDirectory /Users/skelly/repos/lab3/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ lab3 ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ lab3 ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ColorTests
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.056 s -- in ColorTests
[INFO] Running ShapeTests
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 s -- in ShapeTests
[INFO] Running ShapeDescriberTests
[main] INFO ShapeDescriber - Shape type: Rectangle | Red: 0, Green: 0, Blue: 0, Alpha: 0 | Area: 2.0 | Perimeter: 6.0
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 s -- in ShapeDescriberTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 17, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.279 s
[INFO] Finished at: 2024-11-20T20:02:23+01:00
[INFO] ------------------------------------------------------------------------
```

## Zrzuty ekranu
### Main

### Testy

### Pokrycie testami