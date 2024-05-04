---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="var"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Bisher haben wir lokale Variablen explizit mit ihrem Typ/ihrer Klasse deklariert
- Seit Java 10 gibt es _Type Inference_ und das neue [`var` Schlüsselwort](https://docs.oracle.com/en/java/javase/22/language/java-language-changes.html#JSLAN-GUID-7D5FDD65-ACE4-4B3C-80F4-CC01CBD211A4)
- Die Nutzung von `var` ist allerdings nur bei _lokalen Variablen_, also innerhalb von Fuktionen möglich - nicht bei Instanz- oder Klassenvariablen (`static`)

</div>
<div class="col-span-6">

````md magic-move
```java
public class Car {
    String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

void main() {
    String name = "Peter";
    Map<String, int> bankAccounts = new Map<String, int>();
    Car golf = new Car("VW");

    golf.startEngine();
}

```

```java
public class Car {
    String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

void main() {
    var name = "Peter";
    var bankAccounts = new Map<String, int>();
    var golf = new Car("VW");

    golf.startEngine();
}

```

```java
public class Car {
    // 🚫 ERROR: Typ muss explizit sein --> String
    var manufacturer;

    // 🚫 ERROR: Typ muss explizit sein --> String
    public Car(var manufacturer) {
        this.manufacturer = manufacturer;
    }
}

void main() {
    var name = "Peter";
    var bankAccounts = new Map<String, int>();
    var golf = new Car("VW");

    golf.startEngine();
}

```
````

</div>
</div>

<PageNumber/>
