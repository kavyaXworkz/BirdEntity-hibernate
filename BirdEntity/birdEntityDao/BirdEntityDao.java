package birdEntityDao;

import birdEntityDto.BirdEntity;

public interface BirdEntityDao {
	
		void save(BirdEntity entity);
		BirdEntity readById(int pk);

	}


