---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Vererbung

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Klassen können Eigenschaften und Methoden von vorhandenen Klassen erben
- Sie beherrschen dann gemeinsame Fähigkeiten und können allgemein genutzt werden

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
    final Car golf = new Car("VW");
    final Bike mtb = new Bike(28);
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
    final Car golf = new Car("VW");
    final Bike mtb = new Bike(28);

    golf instanceof Car; // true
    golf instanceof Vehicle; // true
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
    final Car golf = new Car("VW");
    final Bike mtb = new Bike(28);

    golf instanceof Car; // true
    golf instanceof Vehicle; // true

    mtb instanceof Car; // false !
    mtb instanceof Bike; // true
    mtb instanceof Vehicle; // true
}
```
````

</div>
</div>

<PageNumber/>
