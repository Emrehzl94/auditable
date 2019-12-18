package com.example.auditable.controller;

import com.example.auditable.model.Content;
import com.example.auditable.repository.ContentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin
@Log4j2
@AllArgsConstructor
public class AppController {

    private final ContentRepository contentRepository;

    @PostMapping("/create")
    public ResponseEntity<Content> createContent(@RequestBody @Valid Content content){
        log.debug("before persist content --> " + content);
        content = contentRepository.save(content);
        log.debug("after persist content --> " + content);
        return ResponseEntity.ok(content);
    }

    @PutMapping("/edit")
    public ResponseEntity<String> editContent(){
        contentRepository.updateStatus();
        return ResponseEntity.ok("Ok");
    }
}
