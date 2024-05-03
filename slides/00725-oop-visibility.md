---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Sichtbarkeit <SubHeading text="public und private"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Jede Klasse sollte nur die Methoden und Eigenschaften öffentlich sichtbar (`public`) machen, die die Benutzer benötigen
- Interne Implementierungsdetails sollten privat (`private`) bleiben
- Verhinderung unerlaubter oder unsinniger Operationen durch externe Nutzer

</div>
<div class="col-span-6">

````md magic-move
```java
public class Car extends Vehicle {

    private Int gear;

    public void startEngine() {
        this.checkGearboxInNeutral();
        this.initializeEngineSpin();
        this.startFuelInjection();
    }

    private void checkGearboxInNeutral() {
        return this.gear == 0;
    }

    private void startFuelInjection() {
        // ...
    }

    private void initializeEngineSpin() {
        // ...
    }
}
```
````

</div>
</div>

<PageNumber/>
