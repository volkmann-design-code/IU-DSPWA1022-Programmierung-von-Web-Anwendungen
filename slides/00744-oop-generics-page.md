---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Generics <SubHeading text="Weitere Beispiele"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Natürlich können auch eigene generische Klassen und Interfaces erstellt werden
- Beispielsweise können wir eine `Page<E>`-Klasse definieren, mit der wir verschiedene Objekte aus einer Datenbank laden können
- Die Informationen einer `Page<E>` können wir dann im Frontend nutzen, um eine Seitennavigation anzuzeigen

</div>
<div class="col-span-6">

````md magic-move
```java
public class Page<E> {
    public List<E> items;
    public int pageSize;
    public int offset;
    public int totalCount;

    // ...
}

public class CarRepository {

    public Page<Car> fetchCars(int pageSize, int offset) {
        // ...
    }

}
```
````

</div>
</div>

![Nutzung des Paginators im Frontend](/images/paginator.png){.absolute .left .bottom-23 .w-[25rem] .border .rounded}

<PageNumber/>
