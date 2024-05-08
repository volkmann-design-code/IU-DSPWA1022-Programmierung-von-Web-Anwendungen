---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Architekturen <SubHeading text="Microservices"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Die bisherigen Beispiele zeigten ein _monolithisches Modell_, bei dem es _einen_ Server gibt, der sämtliche Aufgaben bewältigt
- Alternativ dazu kann man die Bestandteile einer Anwendung aufteilen, dann spricht man von _Microservices_

</div>
<div class="col-span-6">

```mermaid
%%{init: {"flowchart": {"htmlLabels": false}} }%%
flowchart TD
    c(Client)
    s{{"`**Server**
    API, Documents Service, Notifications, ...`"}}

    c <--> s
```

<Figcaption>Beispiel für die monolithische Architektur</Figcaption>

</div>
<div class="col-span-6">

```mermaid
%%{init: {"flowchart": {"htmlLabels": false}} }%%
flowchart TD
    c(Client)
    capi{{Customer API}}
    docs{{Documents Service}}
    notifications{{Notifications}}

    c <--> capi
    c <--> docs
    capi <--> notifications
```

<Figcaption>Beispiel für eine Microservice-Architektur</Figcaption>

</div>
</div>

<PageNumber/>
