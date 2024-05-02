---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Was bedeutet "objektorientiert"?

<div class="grid grid-cols-12 gap-4">
<div class="col-span-6">

- Gleichartige Objekte gehören derselben Klasse an
- Sie besitzen dieselben Eigenschaften und Methoden, haben aber zur Laufzeit unterschiedliche Ausprägungen
- Objekte interargieren miteinander, indem sie ihre Methoden aufrufen

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
```

```java
public class Car extends Vehicle {

    public String manufacturer;

    public Car(String manufacturer) {
        super();
        this.manufacturer = manufacturer;
    }

}

void main() {
    final Car golf = new Car("VW");
    final Car testarossa = new Car("Ferrari");
}
```

```java
public class Car extends Vehicle {

    public String manufacturer;

    public Car(String manufacturer) {
        super();
        this.manufacturer = manufacturer;
    }

}

void main() {
    final Car golf = new Car("VW");
    final Car testarossa = new Car("Ferrari");

    final Person jane = new Person("Jane Doe");
    jane.drive(testarossa);
}
```
````

</div>
</div>

<PageNumber/>
