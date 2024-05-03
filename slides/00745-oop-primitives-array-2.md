---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Grundlagen <SubHeading text="Arrays (2/3)"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Arrays können sowohl als _Literal_, als auch mittels `new` und Angabe der Länge erstellt werden
- Bei der Erstellung mittels `new` ist das Array nicht leer, sondern der jeweilige [Standardwert des Datentyps](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) wird eingesetzt

</div>
<div class="col-span-6">

````md magic-move
```java
int ints[] = {1, 2, 3};
float[] floats = new float[5];

ints.length; // 3
floats.length; // 5

floats[0]; // 0.0f
```
````

</div>
</div>

<PageNumber/>
