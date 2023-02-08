package com.example.tutorial.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.tutorial.model.TutorialModel;

public interface TutorialRepository extends MongoRepository<TutorialModel, String>{
	
	List<TutorialModel> findAllByPublished (Boolean published);

	List<TutorialModel> findAllByTitle(String title);
	
}
