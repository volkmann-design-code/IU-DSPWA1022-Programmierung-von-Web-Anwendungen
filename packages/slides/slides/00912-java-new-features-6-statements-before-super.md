---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="Statements vor super()"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- [Seit Java 22](https://docs.oracle.com/en/java/javase/22/language/statements-super.html#GUID-33B53C2C-F20C-4256-9055-9AFC73251AEB) können nun erstmals Statements vor dem `super()`-Aufruf im Konstruktor verwendet werden
- Nutzung zum Beispiel für Validierung von Parametern

</div>
<div class="col-span-7">

````md magic-move
```java
public class PositiveBigInteger extends BigInteger {

    public PositiveBigInteger(long value) {
        if (value <= 0) {
            throw new IllegalArgumentException("non-positive value");
        }
        super(Long.toString(value));
    }

}
```
````

</div>
</div>

<PageNumber/>
