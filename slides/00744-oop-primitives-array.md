---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Grundlagen <SubHeading text="Arrays (1/3)"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Es gibt verschiedene Möglichkeiten, mehrere Objekte einer Art in einer Variablen zu halten
- Die grundlegendste ist das Array
- Die `length` eines Array gibt die Anzahl der Elemente an
- Die Position eines Elementes im Array ist sein _Index_. Begonnen zu zählen wird bei `0`, der höchste Index ist `length - 1`.

</div>
<div class="col-span-6">

````md magic-move
```java
char data[] = {'J', 'a', 'n', 'e'};

data.length; // 4

data[0]; // J
data[1]; // a

// 🚫 Exception Index -1 out of bounds for length 4
data[-1];
```
````

</div>
</div>

<PageNumber/>
