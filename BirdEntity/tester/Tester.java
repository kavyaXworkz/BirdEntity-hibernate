package tester;

import birdEntityDao.BirdEntityDao;
import birdEntityDao.BirdEntityImpl;
import birdEntityDto.BirdEntity;

public class Tester {
	public static void main(String[] args) {
		
	  BirdEntity en=new BirdEntity(1, "parrot", "tumkur", "green", "rice");
	  
	  BirdEntityDao ent= new BirdEntityImpl();
	  ent.save(en);
	  System.out.println("saved to db");
	  
	  ent.readById(1);
	  System.out.println("details");
	  
	  }

	  
}
