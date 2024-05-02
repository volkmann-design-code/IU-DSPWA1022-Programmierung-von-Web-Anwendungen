---
layout: default
---

<ChallengeHeader index="4"/>

```ts twoslash
type Direction = "in" | "out";

class Call {
  constructor(
    readonly direction: Direction,
    readonly from: string,
    readonly to: string,
  ) {}
}

const callMom = new Call("out", "+49...", "+49...");
const invalidCall = new Call("oops", "+49...", "+49...");
```

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-typescript text-5xl"/>
    <a href="https://www.typescriptlang.org/" target="_blank">
      TypeScript
    </a>
  </div>
</div>

<PageNumber/>
