create extension if not exists "uuid-ossp";
create table if not exists prime_number
(
    id                varchar
    constraint group_pk primary key                 default uuid_generate_v4(),
    value              text                  not null,
    generation_datetime timestamp with time zone default now()
    );