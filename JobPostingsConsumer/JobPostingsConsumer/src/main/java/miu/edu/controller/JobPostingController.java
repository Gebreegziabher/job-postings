package miu.edu.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.domain.JobPosting;
import miu.edu.service.JobPostingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/jobpostings")
public class JobPostingController {
    @Autowired
    private JobPostingServiceImpl jobPostingService;
    @GetMapping
    public Flux<JobPosting> findAll(){
        return jobPostingService.findAll();
    }
}
