package com.stuff.lightning.talks.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stuff.lightning.talks.model.StuffLightningTalks;
import com.stuff.lightning.talks.repo.StuffLightningTalksRepository;

@Controller
public class StuffLightningTalksController {
	private final Logger LOG = LoggerFactory.getLogger(StuffLightningTalksController.class);
	private final StuffLightningTalksRepository stuffLightningTalksRepository;

	public StuffLightningTalksController(StuffLightningTalksRepository stuffLightningTalksRepository) {
		this.stuffLightningTalksRepository = stuffLightningTalksRepository;
	}

	@GetMapping(value = "/")
	public String welcome() {
		return "main";
	}
	
	@RequestMapping(value = "/createTopic", method = RequestMethod.POST)
	public ResponseEntity<StuffLightningTalks> saveTopics(@RequestBody StuffLightningTalks data) {
		StuffLightningTalks talk = stuffLightningTalksRepository.save(data);
	    return new ResponseEntity<>(talk, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAllTopis", method = RequestMethod.GET)
	public ResponseEntity<List<StuffLightningTalks>> getTopics() {
		List<StuffLightningTalks> topics = stuffLightningTalksRepository.findAll();
	    return new ResponseEntity<>(topics, HttpStatus.OK);
	}
}
