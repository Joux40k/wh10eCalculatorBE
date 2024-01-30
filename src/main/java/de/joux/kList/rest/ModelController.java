package de.joux.kList.rest;

import de.joux.kList.persistence.entity.WHModel;
import de.joux.kList.rest.dto.ModelDTO;
import de.joux.kList.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/model")
@RequiredArgsConstructor
public class ModelController {
    private final ModelService modelService;

    @PostMapping
    private ResponseEntity<Void> saveModel(@RequestBody ModelDTO modelDto) {
        WHModel WHModel = new WHModel();
        BeanUtils.copyProperties(modelDto, WHModel);
        modelService.setModel(WHModel);
        return ResponseEntity.ok().build();
    }
}
