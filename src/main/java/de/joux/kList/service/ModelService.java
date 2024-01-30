package de.joux.kList.service;

import de.joux.kList.persistence.ModelRepository;
import de.joux.kList.persistence.entity.WHModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ModelService {
    private final ModelRepository repository;

    public void setModel(WHModel WHModel) {
        repository.save(WHModel);
    }
}
