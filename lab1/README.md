# Zadanie 1
## Komenda
```shell
java -version
```

## Wynik
```
openjdk version "21.0.3" 2024-04-16 LTS
OpenJDK Runtime Environment Temurin-21.0.3+9 (build 21.0.3+9-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.3+9 (build 21.0.3+9-LTS, mixed mode)
```

# Zadanie 2
## Kod (przed zmianami do zadania 3)
```java
class Shape {
    public void print(){
        System.out.println("Class name: " + this.getClass().getSimpleName());
    }

    public static void main(String[] args){
        Shape shape = new Shape();
        shape.print();
    }
}
```

## Kompilacja
```shell
javac src/Main.java
```

## Uruchomienie
```shell
java src/Main.java
```

## Wynik
```
Class name: Shape
```

# Zadanie 3
## Kod
[Main.java](src/Main.java)

## Wynik testowego uruchomienia dla trójkąta i prostokąta
```
Area: 1.7320508075688772
Perimeter: 6.0
Area: 6.0
Perimeter: 10.0
```
