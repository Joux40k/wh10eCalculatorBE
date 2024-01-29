package de.joux.kList.service;

import de.joux.kList.persistence.ModelRepository;
import de.joux.kList.persistence.entity.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;

    public void setModel(Model model) {
        repository.save(model);
    }
}
