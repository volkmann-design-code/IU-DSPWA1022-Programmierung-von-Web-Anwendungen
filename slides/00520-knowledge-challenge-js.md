---
layout: default
---

<ChallengeHeader index="3"/>

```html
<button id="make-smth-btn">Say Hello!</button>
```

```js
const btn = document.getElementById("make-smth-btn");
btn.addEventListener("click", () => console.log("Hello, World!"));
```

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-javascript text-6xl"/>
    <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
      JavaScript
    </a>
  </div>
</div>

<PageNumber/>
