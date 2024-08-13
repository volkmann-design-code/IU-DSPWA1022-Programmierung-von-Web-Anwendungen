---
layout: default
---

# Diverses <SubHeading text="Web App Deployment"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- Wie bekomme ich eine Web-App (Frontend und/oder Server) von meinem lokalen Entwicklungs-Rechner ins Internet/in die Cloud?

```mermaid
flowchart LR

    local(Lokale Entwicklung)

    fe-build(Frontend-App-Build)
    webserver(Webserver/FTP)

    server-build(Server-App-Build/Bundle)
    appserver(Anwendungsserver)

    local --> fe-build
    fe-build --> webserver
    local --> server-build
    server-build --> appserver
```

<div class="mb-4"></div>

- **Lokale Entwicklung:** z.B. Vite, Angular CLI (ng serve), ...
- **Webserver/FTP:** z.B. Webhosting-Anbieter (IONOS, Strato, ...), XAMPP auf lokaler Infrastruktur, Docker
- **Anwendungsserver:** z.B. Docker, Google App Engine, Cloud Functions, ...
- **Automatisierung:** z.B. Github Actions, Jenkins, Google Cloud Build, ...

</div>
</div>

<PageNumber/>
