create table colleges (
       id bigint not null,
        name varchar(255),
        department_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table csi_events (
       id bigint not null,
        description varchar(255) not null,
        end_time datetime(6) not null,
        admin_approved bit not null,
        admin_reviewd bit not null,
        event_organizer bit not null,
        location varchar(255) not null,
        name varchar(255) not null,
        start_time datetime(6) not null,
        user_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table departments (
       id bigint not null,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table event_tags (
       event_id bigint not null,
        tag_id bigint not null,
        primary key (event_id, tag_id)
    ) engine=InnoDB;

    create table hibernate_sequence (
       next_val bigint
    ) engine=InnoDB;



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

    create table rewards (
       id bigint not null,
        description varchar(255),
        end_time datetime(6),
        reward_provider bit,
        organizer varchar(255),
        reward_criteria integer,
        start_time datetime(6),
        events_id bigint,
        tags_id bigint,
        user_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table roles (
       id bigint not null,
        name varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tags (
       id bigint not null,
        affilications varchar(255) not null,
        content varchar(255) not null,
        event_type varchar(255) not null,
        primary key (id)
    ) engine=InnoDB;

    create table user_events (
       id bigint not null,
        isAttending bit not null,
        event_id bigint,
        user_id bigint,
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

    alter table csi_events 
       add constraint FKce2lhx3500dwnc8jb2kfc7bur 
       foreign key (user_id) 
       references users (id);

    alter table event_tags 
       add constraint FKt07xql63t6125c0wjk4j0lmqa 
       foreign key (tag_id) 
       references tags (id);

    alter table event_tags 
       add constraint FK99l7casxubkl8y3hto4y1s050 
       foreign key (event_id) 
       references csi_events (id);

    alter table organizational_units 
       add constraint FKlsc6via620pmlvm1wco3e9i18 
       foreign key (college_id) 
       references colleges (id);

    alter table organizational_units 
       add constraint FKt6lvmfbqonddvqo3vqfrbamc 
       foreign key (office_id) 
       references offices (id);

    alter table rewards 
       add constraint FKqxb90w170j6dfxn0i2es8pq79 
       foreign key (events_id) 
       references csi_events (id);

    alter table rewards 
       add constraint FK4hvo7bomrg3tsw23ltqdkp4b0 
       foreign key (tags_id) 
       references tags (id);

    alter table rewards 
       add constraint FK5ko6wh7m9q06ew6o1tq90j0ym 
       foreign key (user_id) 
       references users (id);

    alter table user_events 
       add constraint FK4w7g45ko92fkynl1v7alyy0i7 
       foreign key (event_id) 
       references csi_events (id);

    alter table user_events 
       add constraint FKg3rv1yxrs56ohyn30rlt7vum7 
       foreign key (user_id) 
       references users (id);

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
