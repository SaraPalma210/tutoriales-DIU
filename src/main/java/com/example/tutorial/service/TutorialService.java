package com.example.tutorial.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorial.controller.TutorialDTO;
import com.example.tutorial.controller.TutorialDTOConverter;
import com.example.tutorial.model.TutorialModel;
import com.example.tutorial.repository.TutorialRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TutorialService {
	@Autowired
	private TutorialRepository repository;

	public List<TutorialDTO> getAllTutorials() {
		return TutorialDTOConverter.convertListToDto(repository.findAll());
	}

	public TutorialDTO getTutorialById(String id) {
		return TutorialDTOConverter.convertToDto(repository.findById(id));
	}

	public List<TutorialDTO> getTutorialsByTitle(String title) {
		return TutorialDTOConverter.convertListToDto(repository.findAllByTitle(title));
	}

	public List<TutorialDTO> getTutorialsByPublished(Boolean published) {
		return TutorialDTOConverter.convertListToDto(repository.findAllByPublished(published));
	}

	public TutorialDTO saveTutorial(TutorialModel tutorial) {
		return TutorialDTOConverter.convertToDto(repository.save(tutorial));
	}

	public void deleteTutorialById(String id) {
		repository.deleteById(id);
	}

	public void deleteAllTutorials() {
		repository.deleteAll();
	}
}