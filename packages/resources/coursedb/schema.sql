begin;

create extension if not exists "uuid-ossp";

drop schema if exists dspwa1022 cascade;

create schema dspwa1022;

drop table if exists dspwa1022.product;

create table dspwa1022.product (
    id uuid primary key default gen_random_uuid (),
    name text not null
);

commit;
