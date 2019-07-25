package com.stuff.lightning.talks.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stuff.lightning.talks.model.StuffLightningTalks;

@Repository
public interface StuffLightningTalksRepository extends MongoRepository<StuffLightningTalks, String> {

}
