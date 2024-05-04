---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Interfaces <SubHeading text="Übersicht"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Neben Klassen (`class`) gibt es auch definierte Schnittstellen (`interface`)
- Sie werden genutzt, um Gemeinsamkeiten und Fähigkeiten von Objekten zu beschreiben
- Sie dienen der Abstraktion und zur Bildung allgemeingültiger "Verträge"
- Je nach Anwendungsfall kann eine abstrakte Klasse oder ein Interface sinnvoller sein

</div>
<div class="col-span-6">

```mermaid
classDiagram
    PieceOfCloth ..|> Wearable : implements
    Watch ..|> Wearable : implements
    Jeans --|> PieceOfCloth : extends
    TShirt --|> PieceOfCloth : extends
    Person ..> Wearable : uses

    class Wearable {
        <<interface>>
        wear()
    }

    class PieceOfCloth {
        <<abstract>>
        String fabric
    }

    class Jeans {
        int length
    }

    class TShirt {
        String size
    }

    class Watch {
        getTime()
    }

    class Person {
        wear(Wearable w)
        discard(Wearable w)
    }
```

</div>
</div>

<PageNumber/>
