create table authorities (
       role_id bigint,
        user_id bigint not null,
        primary key (user_id)
    );
    
create table colleges (
       id bigint not null,
        name varchar(255),
        units_id bigint,
        primary key (id)
   );

    create table departments (
       id bigint not null,
        name varchar(255),
        college_id bigint,
        primary key (id)
   );

    create table event_tags (
       event_id bigint not null,
        tag_id bigint not null,
        primary key (event_id, tag_id)
   );

    create table events (
       id bigint not null,
        description varchar(255) not null,
        end_time datetime(6) not null,
        admin_approved bit not null,
        event_organizer bit not null,
        location varchar(255) not null,
        name varchar(255) not null,
        start_time datetime(6) not null,
        rewards_id bigint,
        primary key (id)
   );

    create table hibernate_sequence (
       next_val bigint
   );

    create table offices (
       id bigint not null,
        name varchar(255),
        units_id bigint,
        primary key (id)
   );

    create table organizational_units (
       id bigint not null,
        name varchar(255) not null,
        primary key (id)
   );

    create table positions (
       id bigint not null,
        name varchar(255) not null,
        primary key (id)
   );

    create table programs (
       id bigint not null,
        description varchar(255) not null,
        fullName varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
   );

    create table rewards (
       id bigint not null,
        description varchar(255),
        end_time datetime(6),
        reward_provider bit,
        organizer varchar(255),
        start_time datetime(6),
        primary key (id)
   );

    create table roles (
       id bigint not null,
        name varchar(255) not null,
        primary key (id)
   );

    create table tags (
       id bigint not null,
        affilications varchar(255) not null,
        content varchar(255) not null,
        event_type varchar(255) not null,
        primary key (id)
   );

    create table user_events (
       id bigint not null,
        isAttending bit not null,
        event_id bigint,
        user_id bigint,
        primary key (id)
   );

    create table users (
       id bigint not null,
        email varchar(255) not null,
        full_name varchar(255) not null,
        last_name varchar(255) not null,
        password varchar(255) not null,
        title varchar(255),
        username varchar(255) not null,
        organizationalUnit_id bigint,
        postion_id bigint,
        program_id bigint,
        roles_id bigint,
        primary key (id)
   );
   
     alter table authorities 
       add constraint FK7kj74d912rytfp5su91jfv0tg 
       foreign key (role_id) 
       references roles (id);

    alter table positions 
       add constraint UK_3vhyopdpf9huqh1t67ho6nayj unique (name);

    alter table roles 
       add constraint UK_ofx66keruapi6vyqpv6f2or37 unique (name);

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

    alter table users 
       add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username);

    alter table colleges 
       add constraint FKj1l49mwd7r3t8x0ccilu7gk9g 
       foreign key (units_id) 
       references organizational_units (id);

    alter table departments 
       add constraint FKsmh4d91rvr9whcb3j8e40xrr5 
       foreign key (college_id) 
       references colleges (id);

    alter table event_tags 
       add constraint FKt07xql63t6125c0wjk4j0lmqa 
       foreign key (tag_id) 
       references tags (id);

    alter table event_tags 
       add constraint FKiwoyitw224ykom58m5xnoa9y6 
       foreign key (event_id) 
       references events (id);

    alter table events 
       add constraint FKsb5ic93knwcso4789gmdhm4f1 
       foreign key (rewards_id) 
       references rewards (id);

    alter table offices 
       add constraint FKic8setnawhsaxwh9t09oawity 
       foreign key (units_id) 
       references organizational_units (id);

    alter table user_events 
       add constraint FKqh8jukuil4jkihri1o262hik7 
       foreign key (event_id) 
       references events (id);

    alter table user_events 
       add constraint FKg3rv1yxrs56ohyn30rlt7vum7 
       foreign key (user_id) 
       references users (id);

    alter table users 
       add constraint FKqoow4aaunk5h5k4s9ohmtj34t 
       foreign key (organizationalUnit_id) 
       references organizational_units (id);

    alter table users 
       add constraint FKadd3b1eewuvgg9n1uuryvpdco 
       foreign key (postion_id) 
       references positions (id);

    alter table users 
       add constraint FKnygb5uvahfy3wrmd0xaj3hux2 
       foreign key (program_id) 
       references programs (id);

    alter table users 
       add constraint FKbgvg7xuekkcqmpvi3tgkxk85j 
       foreign key (roles_id) 
       references roles (id);