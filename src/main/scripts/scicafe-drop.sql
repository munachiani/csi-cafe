/* Disable foreign key co checks to drop all tables and enable after dropping */

SET FOREIGN_KEY_CHECKS = 0;



drop table authorities;
drop table colleges;
drop table departments;
drop table event_tags;
drop table events;
drop table hibernate_sequence;
drop table offices;
drop table organizational_units;
drop table positions;
drop table programs;
drop table rewards;
drop table roles;
drop table tags;
drop table user_events;
drop table users;


SET FOREIGN_KEY_CHECKS = 1;

