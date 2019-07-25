package com.stuff.lightning.talks.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StuffLightningTalks {
	
	private String topic;
	
	private String topicDescription;
	
	private String emailAddress;
	
	private Date submissionDate = new Date();
	
	private Date lightningTalkDate = new Date();

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

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Date getLightningTalkDate() {
		return lightningTalkDate;
	}

	public void setLightningTalkDate(Date lightningTalkDate) {
		this.lightningTalkDate = lightningTalkDate;
	}

}
