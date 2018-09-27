create table colleges (
       id bigint not null,
        name varchar(255),
        department_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table departments (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table hibernate_sequence (
       next_val bigint
    ) engine=InnoDB;

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    create table offices (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table organizational_units (
       id bigint not null,
        name varchar(255) not null,
        college_id bigint,
        office_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table positions (
       id bigint not null,
        name varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table programs (
       id bigint not null,
        description varchar(255) not null,
        name varchar(255) not null,
        program_name varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table roles (
       id bigint not null,
        name varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table users (
       id bigint not null,
        email varchar(255) not null,
        enabled bit not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        password varchar(255) not null,
        title varchar(255),
        username varchar(255) not null,
        organization_unit_id bigint,
        position_id bigint,
        program_id bigint,
        roles_id bigint,
        primary key (id)
    ) engine=InnoDB;

    alter table positions 
       add constraint UK_3vhyopdpf9huqh1t67ho6nayj unique (name);

    alter table roles 
       add constraint UK_ofx66keruapi6vyqpv6f2or37 unique (name);

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

    alter table users 
       add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username);

    alter table colleges 
       add constraint FK715amiu12audm6fcwpda13hak 
       foreign key (department_id) 
       references departments (id);

    alter table organizational_units 
       add constraint FKlsc6via620pmlvm1wco3e9i18 
       foreign key (college_id) 
       references colleges (id);

    alter table organizational_units 
       add constraint FKt6lvmfbqonddvqo3vqfrbamc 
       foreign key (office_id) 
       references offices (id);

    alter table users 
       add constraint FK44os4me16gw2p2uowkg2c7xjm 
       foreign key (organization_unit_id) 
       references organizational_units (id);

    alter table users 
       add constraint FK6ph6xiiydudp6umjf2xckbbmi 
       foreign key (position_id) 
       references positions (id);

    alter table users 
       add constraint FKnygb5uvahfy3wrmd0xaj3hux2 
       foreign key (program_id) 
       references programs (id);

    alter table users 
       add constraint FKbgvg7xuekkcqmpvi3tgkxk85j 
       foreign key (roles_id) 
       references roles (id);
