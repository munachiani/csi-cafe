    insert into hibernate_sequence values ( 1 );
    
   insert into roles values (1,"Administrator");
  	insert into roles values ( 2,"Regular");
  	
  	insert into positions values (1,"Faculty");
  	insert into positions values (2,"Staff");
  	insert into positions values (3,"Student");
  	
  	insert into organizational_units values(1,"College");
  	insert into organizational_units values(2,"Department");
  	insert into organizational_units values(3,"Division");
  	insert into organizational_units values(4,"Office");
  	insert into organizational_units values(5,"Undeclared");
  	
  	insert into colleges values(1,"CSULA",1);
  	
  	
  	insert into departments values(1,"Computer Science Department",1);
  	insert into departments values(2,"Electrical & Electronics Department",1);
  	
  	insert into offices values(1,"Head of Department",1);
  	
  	insert into programs values (1,"FYrE@ECST","First-Year Experience Program at ECST","Describing FYr@ECST");
  	insert into programs values (2,"LSAMP","Louis Stokes Alliance for Minority Participation","Describing LSAMP");
  	insert into programs values (3,"LSAMP-BD","Louis Stokes Alliance for Minority Participation BD","Describing LSAMP-BD");
  	
  	insert into tags values (1,"Robotics","ACM","Computer Science");
  	insert into tags values (2,"Civil","CCM","Civil Engineering");
  	
  	  	
  	insert into users values (1,"mailstomuna@gmail.com", "Munachimso","Ani","abcd","Director of LSAMP","muna",1,1,1,1);
  	insert into users values (2,"ugochukwu@gmail.com", "Ugo","Ani","abcd","Student","ugo",2,2,3,2);
  	
  	insert into authorities values(1,1);
  	insert into authorities values(2,2);

  	
  	/* The above sql statement worked 
  	 * add inserts for event_tags and events*/
  	
  	


