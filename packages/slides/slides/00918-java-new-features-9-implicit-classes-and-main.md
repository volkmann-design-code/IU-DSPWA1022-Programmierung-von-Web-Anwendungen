---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="Implicit Main"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- Ebenfalls noch in Preview: [Implizite Hauptklasse / Main-Methode](https://docs.oracle.com/en/java/javase/22/language/implicitly-declared-classes-and-instance-main-methods.html#GUID-35544A22-61AB-4928-99BB-A9DD1CA062FF)
- Erfordert nicht zwingend die Nutzung einer übergordneten `public class` und einer `public static void main(String[] args)`-Methode
- Erzeugt eine _implizite_ Hauptklasse
- Reduziert Boilderplate-Code und vereinfachst EInstieg in die Sprache

</div>
<div class="col-span-7">

````md magic-move
```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

```java
class HelloWorld {
  void main() {
    System.out.println("Hello, World!");
  }
}
```

```java
void main() {
  System.out.println("Hello, World!");
}
```

```java
String greeting = "Hello";

String getName() {
  return "Jane";
}

void main() {
  System.out.println(STR."\{greeting}, \{getName()}!");
}
```
````

</div>
</div>

<PageNumber/>
