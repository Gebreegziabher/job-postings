package miu.edu.service;

import miu.edu.domain.JobPosting;
import miu.edu.service.records.JobStatistics;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

public interface IJobPostingService {
    Mono<JobPosting> save(JobPosting jobPosting);
    Mono<JobPosting> findById(String id);
    Flux<JobPosting> findAll();
    void deleteById(String id);
    Flux<JobPosting> findByDate(Date date);
    //Flux<JobStatistics> getJobStatistics();
}
