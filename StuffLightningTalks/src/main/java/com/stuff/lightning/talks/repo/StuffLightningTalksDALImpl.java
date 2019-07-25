package com.stuff.lightning.talks.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.stuff.lightning.talks.model.StuffLightningTalks;

@Repository
public class StuffLightningTalksDALImpl implements StuffLightningTalksDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public StuffLightningTalks addNewTalk(StuffLightningTalks talks) {
		mongoTemplate.save(talks);
		return talks;
	}

}
