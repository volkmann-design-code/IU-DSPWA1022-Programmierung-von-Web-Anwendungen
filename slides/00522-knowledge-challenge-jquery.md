---
layout: default
---

<ChallengeHeader index="5"/>

```js
$("div").click(function () {
  if ($(this).hasClass("protected")) {
    $(this)
      .animate({ left: -10 })
      .animate({ left: 10 })
      .animate({ left: -10 })
      .animate({ left: 10 })
      .animate({ left: 0 });
  }
});
```

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-jquery text-5xl"/>
    <a href="https://jquery.com/" target="_blank">
      jQuery
    </a>
  </div>
</div>

<PageNumber/>
