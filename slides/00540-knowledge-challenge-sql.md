---
layout: default
---

<ChallengeHeader index="5"/>

````md magic-move {at:2}
```sql
drop table if exists iu_data.students;
create table iu_data.students (
  id uuid primary key default gen_random_uuid(),
  first_name text not null,
  last_name text not null
);
```

```sql{6}
drop table if exists iu_data.students;
create table iu_data.students (
  id uuid primary key default gen_random_uuid(),
  first_name text not null,
  last_name text not null,
  full_name text not null generated always as (first_name || last_name) stored
);
```
````

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-postgresql text-6xl"/>
    <a href="https://postgresql.org/" target="_blank">
      PostgreSQL
    </a>
  </div>
  <div class="flex flex-col items-center gap-2 duration-500" v-after>
    <div class="i-devicon-mysql text-6xl"/>
    <a href="https://www.mysql.com/" target="_blank">
      MySQL
    </a>
  </div>
</div>

<PageNumber/>
