package com.example.tutorial.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.tutorial.model.TutorialModel;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TutorialDTOConverter {
private static final ModelMapper modelMapper = new ModelMapper();
    private static final ModelMapper modelmapper = new ModelMapper();

    public static TutorialDTO convertToDto(TutorialModel tutoriales) {
        return modelmapper.map(tutoriales, TutorialDTO.class);
    }

    public static List<TutorialDTO> convertListToDto(List<TutorialModel> tutorialsBd) {
        List<TutorialDTO> tutorials = new ArrayList<>();
        for (TutorialModel tutorial : tutorialsBd) {
            tutorials.add(modelmapper.map(tutorial, TutorialDTO.class));
        }
        return tutorials;
    }

    public static TutorialDTO convertToDto(Optional<TutorialModel> byId) {
        return modelmapper.map(byId, TutorialDTO.class);
    }
}
