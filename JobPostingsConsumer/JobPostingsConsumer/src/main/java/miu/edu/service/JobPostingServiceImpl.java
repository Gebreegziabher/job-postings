package miu.edu.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import miu.edu.domain.JobPosting;
import miu.edu.repository.IJobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class JobPostingServiceImpl implements IJobPostingService {

    @Autowired
    private IJobPostingRepository jobPostingRepository;

    @Override
    public Mono<JobPosting> save(JobPosting jobPosting) {
        var response = jobPostingRepository.save(jobPosting);
        //response.subscribe(savedJobPosting -> System.out.println(savedJobPosting));
        return response;
    }

    @Override
    public Mono<JobPosting> findById(String id) {
        return jobPostingRepository.findById(id);
    }

    @Override
    public Flux<JobPosting> findAll() {
        return jobPostingRepository.findAll();
    }

    @Override
    public Flux<JobPosting> findByDate(Date date) {
        return jobPostingRepository.findByOpenFromGreaterThanEqual(date);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return jobPostingRepository.deleteById(id);
    }

    @Override
    public Mono<Void> deleteAll() {
        return jobPostingRepository.deleteAll();
    }

//    @Override
//    public Flux<JobStatistics> getJobStatistics(Date date){
//        Flux<JobPosting> jobPostingFlux = findByDate(date);
//
//        GroupOperation groupByTitle = group("jobTitle")
//                .count().as("count")
//                .project("count")
//                .and("_id").as("title");
//    }
}
