/* Disable foreign key co checks to drop all tables and enable after dropping */

SET FOREIGN_KEY_CHECKS = 0;



drop table colleges;
drop table departments;
drop table event_tags;
drop table csi_events;
drop table offices; 
drop table organizational_units;
drop table hibernate_sequence;
drop table positions;
drop table programs;
drop table rewards;
drop table roles;
drop table tags;
drop table users;
drop table user_events;


SET FOREIGN_KEY_CHECKS = 1;

