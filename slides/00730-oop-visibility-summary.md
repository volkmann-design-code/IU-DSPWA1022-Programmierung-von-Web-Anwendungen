---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Sichtbarkeit <SubHeading text="Zusammenfassung"/>

Methoden und Eigenschaften einer Klasse sind in unterschiedlichen Kontexten sichtbar, abhängig vom _Modifikator_.
Die Tabelle zeigt die verschiedenen Möglichkeiten in **Java**.

|               | **Class** | **Package** | **Subclass** | **World** |
| ------------- | --------- | ----------- | ------------ | --------- |
| `public`      | ✅        | ✅          | ✅           | ✅        |
| `protected`   | ✅        | ✅          | ✅           | 🚫        |
| _no modifier_ | ✅        | ✅          | 🚫           | 🚫        |
| `private`     | ✅        | 🚫          | 🚫           | 🚫        |

<PageNumber/>
