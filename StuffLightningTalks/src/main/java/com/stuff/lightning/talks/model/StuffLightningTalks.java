package com.stuff.lightning.talks.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.stuff.lightning.talks.utils.UtilitiesHelper;

@Document
public class StuffLightningTalks {
	
	private String topic;
	
	private String topicDescription;
	
	private String emailAddress;
	
	private String submissionDate = UtilitiesHelper.getLocalDateTime();
	
	private String lightningTalkDate = UtilitiesHelper.getLocalDateTime();

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getLightningTalkDate() {
		return lightningTalkDate;
	}

	public void setLightningTalkDate(String lightningTalkDate) {
		this.lightningTalkDate = lightningTalkDate;
	}

}
