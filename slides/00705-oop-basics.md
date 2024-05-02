---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Was bedeutet "objektorientiert"?

<div class="grid grid-cols-12 gap-4">
<div class="col-span-6">

- Zerlegung von Aufgaben/Dingen der "echten Welt" in kontrollierbare Teile (= Objekte)
- Objekte haben einen Typ (`class`), Eigenschaften und Methoden
- In ein System/Programm existieren Objekte verschiedener Klassen und interargieren miteinander

</div>
<div class="col-span-6">

```mermaid
classDiagram
    Vehicle <|-- Car
    Vehicle <|-- Bike
    Vehicle: +move()
    <<Abstract>> Vehicle

    class Bike{
        +int wheelSize
        +breakFront()
        +breakBack()
    }

    class Car{
        +String manufacturer
        +startEngine()
        +stopEngine()
    }

    class Person {
        +String name
        +drive(Vehicle v)
    }
```

</div>
</div>

<PageNumber/>
