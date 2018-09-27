    insert into hibernate_sequence values ( 1 );
    
--   insert into roles values (1,"Administrator");
--  	insert into roles values ( 2,"Regular");
--  	
--  	insert into positions values (1,"Faculty");
--  	insert into positions values (2,"Staff");
--  	insert into positions values (3,"Student");
--  	
--  	insert into organizational_units values(1,"College");
--  	insert into organizational_units values(2,"Department");
--  	insert into organizational_units values(3,"Division");
--  	insert into organizational_units values(4,"Office");
--  	insert into organizational_units values(5,"Undeclared");
--  	
--  	insert into colleges values(1,"CSULA",1);
--  	
--  	
--  	insert into departments values(1,"Computer Science Department",1);
--  	insert into departments values(2,"Electrical & Electronics Department",1);
--  	
--  	insert into offices values(1,"Head of Department",1);
--  	
--  	insert into programs values (1,"FYrE@ECST","First-Year Experience Program at ECST","Describing FYr@ECST");
--  	insert into programs values (2,"LSAMP","Louis Stokes Alliance for Minority Participation","Describing LSAMP");
--  	insert into programs values (3,"LSAMP-BD","Louis Stokes Alliance for Minority Participation BD","Describing LSAMP-BD");
--  	
--  	insert into tags values (1,"Robotics","ACM","Computer Science");
--  	insert into tags values (2,"Civil","CCM","Civil Engineering");
--  	
--  	  	
--  	insert into users values (1,"mailstomuna@gmail.com",true, "Munachimso","Ani","abcd","Director of LSAMP","muna",1,1,1,1);
--  	insert into users values (2,"ugochukwu@gmail.com",true, "Ugo","Ani","abcd","Student","ugo",2,2,3,1);
  	
  
  	
  	/* The above sql statement worked 
  	 * add inserts for event_tags and events*/
  	
    
    insert into hibernate_sequence values ( 100 );

  	
  	insert into roles values (1,"Administrator");
  	insert into roles values ( 2,"Regular");
  	
  	insert into positions values (1,"Faculty");
  	insert into positions values (2,"Staff");
  	insert into positions values (3,"Student");
  	
  	insert into departments values(1,"ECST");
  	  	insert into departments values(2,"HHS");

  	
  	insert into colleges values(1,"CSULA",1);
  	
  	insert into offices values(1,"Security Offcie");
  	
  	insert into organizational_units values(1,"College",1,1);
  	
  	insert into tags values(1,"Computer Science","ACM","Robotics");
  	insert into tags values(2,"Electrical Engineering ","ECM","Robotics");
  	 		
  	insert into programs values (1,"First-Year Experience Program at ECST","FYrE@ECST","Describing FYr@ECST");
  	insert into programs values (2,"Louis Stokes Alliance for Minority Participation","LSAMP","Describing LSAMP");
  	insert into programs values (3,"Louis Stokes Alliance for Minority Participation BD","LSAMP-BD","Describing LSAMP-BD");
  	insert into programs values (4,"Association of Computing Machinery","ACM","Describing ACM");
  	
  	insert into users values (1,"mailstomuna@gmail.com",true, "Munachimso","Ani","abcd","Director of LSAMP","muna",1,1,1,2);
  	insert into users values (2,"ugo@gmail.com",true, "Ugo","Ani","abcd","President of ACM Student Chapter","ugo",1,2,2,2);
  	
  	insert into csi_events values (1,"Join us for free popcorn, game play raffle prizes, great music, or just come hang out with friends. For more information or to request accommodations for a disability, please contact the U-SU Admin Office at (323) 343-2450","2018-09-27 00:00:00",false,false,false,"The Pit, University-Student Union Basement","Happy Hour at The Pit","2018-09-26 00:00:00",1);
  	insert into csi_events values (2,"An eight-session, trauma-informed program that emphasizes process, not performance. It pairs collective drumming with therapy to build core social-emotional strengths. It includes guided interaction with rhythmic activities serving as a metaphor for life, followed by reflection and dialogue. Spots are limited. Please sign up at CSI, U-SU 204.","2018-09-27 00:00:00",false,false,false,"Xtreme Fitness, Basement, University-Student Union","Drum Circle Series","2018-09-26 00:00:00",1);

  	
  	insert into event_tags values(1,1);
  	insert into event_tags values(1,2);
  	
  	insert into rewards values (1,"Reward for event","2018-09-26 00:00:00",false,"Computer Department", 4,"2018-09-27 00:00:00",1,1,2);
  		insert into rewards values (2,"Reward for Drumming event","2018-09-26 00:00:00",false,"EE Department", 3,"2018-09-27 00:00:00",2,2,2);
  	



