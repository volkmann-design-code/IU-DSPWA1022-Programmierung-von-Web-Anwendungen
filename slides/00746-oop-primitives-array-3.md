---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Grundlagen <SubHeading text="Arrays (3/3)"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Die Elemente eines Arrays können verändert, also neu zugewiesen werden
- Es gibt diverse [Util-Methoden in `java.util.Arrays`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Arrays.html), um mit Arrays zu interagieren

</div>
<div class="col-span-6">

````md magic-move
```java
int ints[] = {99, 22, 33};

ints[1]; // 22
ints[1] = 42;
ints[1]; // 42

java.util.Arrays.sort(ints);

ints[0]; // 33
ints[1]; // 42
ints[2]; // 99


```
````

</div>
</div>

<PageNumber/>
