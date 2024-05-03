---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Sichtbarkeit <span class="text-muted text-2xl">Zusammenfassung</span>

Methoden und Eigenschaften einer Klasse sind in unterschiedlichen Kontexten sichtbar, abhängig vom _Modifikator_.

|               | **Class** | **Package** | **Subclass** | **World** |
| ------------- | --------- | ----------- | ------------ | --------- |
| `public`      | ✅        | ✅          | ✅           | ✅        |
| `protected`   | ✅        | ✅          | ✅           | 🚫        |
| _no modifier_ | ✅        | ✅          | 🚫           | 🚫        |
| `private`     | ✅        | 🚫          | 🚫           | 🚫        |

<PageNumber/>
