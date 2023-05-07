package miu.edu.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.domain.JobPosting;
import miu.edu.service.JobPostingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/jobpostings")
public class JobPostingController {
    @Autowired
    private JobPostingServiceImpl jobPostingService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<JobPosting> save(@RequestBody JobPosting jobPosting){
        return jobPostingService.save(jobPosting);
    }

    @GetMapping
    public Flux<JobPosting> findAll(){
        return jobPostingService.findAll();
    }

    @DeleteMapping
    public Mono<ResponseEntity<Void>> deleteAll(){
        return jobPostingService.deleteAll()
                .map( r -> ResponseEntity.ok().<Void>build())
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}