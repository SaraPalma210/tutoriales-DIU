package com.example.tutorial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("tutorials")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TutorialModel {
	@Id
	private String id;
	private String title;
	private String description;
	private Boolean published;

	public String getId() {
		return id;
	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public Boolean getPublished() {
//		return published;
//	}
//	public void setPublished(Boolean published) {
//		this.published = published;
//	}

	
}
