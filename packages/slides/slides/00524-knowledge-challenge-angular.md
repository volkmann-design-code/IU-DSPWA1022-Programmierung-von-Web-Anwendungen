---
layout: default
---

<ChallengeHeader index="7"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-9">

```ts
@Component({
  selector: "app-root",
  standalone: true,
  template: `
    <label for="name">Name:</label>
    <input type="text" [(ngModel)]="name" placeholder="Enter a name here" />
    <h1>Hello {{ name }}!</h1>
  `,
  imports: [FormsModule],
})
export class DemoComponent {
  name = "";
}
```

</div>
</div>

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-angular text-5xl"/>
    <a href="https://angular.dev/" target="_blank">
      Angular
    </a>
  </div>
</div>

![Angular Component](/images/angular-hello-component.gif){.absolute .right .top-content .w-[12rem] .border .rounded}

<PageNumber/>
````
