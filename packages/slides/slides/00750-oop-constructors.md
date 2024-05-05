---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Objekterzeugung <SubHeading text="Constructor"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Bisher haben wir entweder primitive Datentypen verwendet oder Objekte mittels `new` erzeugt
- Wenn `new Car()` aufgerufen wird, dann wird der `constructor` der Klasse `Car` aufgerufen
- Der Konstruktor-Aufruf reserviert und befüllt den Speicher für das Objekt und all seine Eigenschaften (hier `manufacturer`)

</div>
<div class="col-span-6">

````md magic-move
```java
public class Car {

    public String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}

void main() {
    final Car golf = new Car("manufacturer");
}

```
````

</div>
</div>

<PageNumber/>
