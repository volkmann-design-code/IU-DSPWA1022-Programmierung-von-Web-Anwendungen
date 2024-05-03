---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Vererbung <SubHeading text="Übersicht"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Klassen können Eigenschaften und Methoden von vorhandenen Klassen erben
- Sie beherrschen dann gemeinsame Fähigkeiten und können allgemein genutzt werden
- Zusätzlich können sie spezifische Eigenschaften und Methoden haben

</div>
<div class="col-span-6">

````md magic-move
```java
public class Car extends Vehicle {
    public String manufacturer;

    public Car(String manufacturer) {
        super();
        this.manufacturer = manufacturer;
    }
}

public class Bike extends Vehicle {
    public int wheelSize;

    public Bike(int wheelSize) {
        super();
        this.wheelSize = wheelSize;
    }
}
```

```java
public class Car extends Vehicle {
    // ...
}

public class Bike extends Vehicle {
    // ...
}

void main() {
    final Vehicle golf = new Car("VW");
    final Vehicle mtb = new Bike(28);
}
```

```java
public class Car extends Vehicle {
    // ...
}

public class Bike extends Vehicle {
    // ...
}

void main() {
    final Vehicle golf = new Car("VW");
    final Vehicle mtb = new Bike(28);

    golf instanceof Vehicle; ✅
    golf instanceof Car; ✅
}
```

```java
public class Car extends Vehicle {
    // ...
}

public class Bike extends Vehicle {
    // ...
}

void main() {
    final Vehicle golf = new Car("VW");
    final Vehicle mtb = new Bike(28);

    golf instanceof Vehicle; ✅
    golf instanceof Car; ✅
    golf instanceof Bike; 🚫

    mtb instanceof Vehicle; ✅
    mtb instanceof Car; 🚫
    mtb instanceof Bike; ✅
}
```

```java
public abstract class Vehicle {
    public void move();
}

void main() {
    final Vehicle golf = new Car("VW");
    final Vehicle mtb = new Bike(28);

    golf.move();
    mtb.move();
}
```
````

</div>
</div>

<PageNumber/>
