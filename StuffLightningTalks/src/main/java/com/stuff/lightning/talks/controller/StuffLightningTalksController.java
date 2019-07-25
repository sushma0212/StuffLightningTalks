package com.stuff.lightning.talks.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
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
	
	public StuffLightningTalksController(StuffLightningTalksRepository stuffLightningTalksRepository){
		this.stuffLightningTalksRepository = stuffLightningTalksRepository;
	}

	// inject via application.properties
		@Value("${welcome.message:test}")
		private String message = "Hello World";

		@RequestMapping("/")
		public String welcome(Map<String, Object> model) {
			model.put("message", this.message);
			return "welcome";
		}
		
		@RequestMapping(value = "/create", method = RequestMethod.POST)
		public StuffLightningTalks addNewTalks(@RequestBody StuffLightningTalks talks) {
			LOG.info("Saving StuffLightningTalks.");
			return stuffLightningTalksRepository.save(talks);
		}
}
