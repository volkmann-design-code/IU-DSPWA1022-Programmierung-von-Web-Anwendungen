---
layout: default
---

<ChallengeHeader index="11"/>

````md magic-move
```sql
select o.id, o.state, c.full_name
from offer o
join customer c on o.customer = c.id
where
  o.created_at >= '2024-04-01'
  and
  o.created_at < '2024-05-01';
```

```sql
select
  substring(c.postal_code from 0 for 3) as pc_prefix,
  sum(o.value)
from offer o
join customer c on o.customer = c.id
where
  o.created_at >= '2024-04-01'
  and
  o.created_at < '2024-05-01'
group by pc_prefix
order by pc_prefix;
```
````

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500">
    <div class="i-devicon-postgresql text-6xl"/>
    <a href="https://postgresql.org/" target="_blank">
      PostgreSQL
    </a>
  </div>
  <div class="flex flex-col items-center gap-2 duration-500">
    <div class="i-devicon-mysql text-6xl"/>
    <a href="https://www.mysql.com/" target="_blank">
      MySQL
    </a>
  </div>
</div>

<PageNumber/>
