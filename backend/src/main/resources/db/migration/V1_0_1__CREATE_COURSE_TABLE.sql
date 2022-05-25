create table user_access.user
(
    id           bigserial    not null,
    username     varchar(20)  not null,
    password     varchar(100) not null,
    name         text         not null,
    gender       int          not null,
    is_admin     boolean      not null default false,
    birthday     timestamp(3) not null,
    phone_num    varchar(15),
    home_address text,
    constraint user_pk PRIMARY KEY (id),
    constraint username_unique unique (username)
);

create table notice
(
    id             serial not null,
    notice_context text   not null,
    notice_time    timestamp(3),
    constraint notice_pk primary key (id)
);

create table dialogue
(
    id           serial not null,
    context      text,
    context_time timestamp(3),
    constraint dialogue_pk primary key (id)
);