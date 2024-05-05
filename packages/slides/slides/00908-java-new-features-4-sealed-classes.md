---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="Sealed Classes"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- Mittels Vererbung kann eine Klassenhierarchie aufgebaut werden
- Prinzipiell kann jede Klasse jede andere Klasse mittels `extends` erweitern
- Seit [Java 17 gibt es `sealed` Klassen](https://docs.oracle.com/en/java/javase/17/language/sealed-classes-and-interfaces.html#GUID-0C709461-CC33-419A-82BF-61461336E65F), mit denen nun eingeschränkt werden kann, welche Sub-Klassen erlaubt sind
- Es gibt auch `sealed` Interfaces, die nach demselben Prinzip funktionieren

</div>
<div class="col-span-7">

````md magic-move
```java
public sealed class Shape
    permits Circle, Square, Rectangle {
}

// 🚫 ERROR
public class Triangle extends Shape {}
```
````

</div>
</div>

<PageNumber/>
