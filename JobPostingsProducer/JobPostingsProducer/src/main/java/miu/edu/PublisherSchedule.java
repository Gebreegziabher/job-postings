package miu.edu;

import com.fasterxml.jackson.core.JsonProcessingException;
import miu.edu.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Component
public class PublisherSchedule {
    @Autowired
    DataPublisher publisher;

    @Scheduled(fixedRate = 5000) //run every 30 seconds
    public void run() throws JsonProcessingException {
        JobPosting jobPosting = new JobPosting.Builder()
                .company(Company.name())
                .companyRating(CompanyRating.rating())
                .companySize(CompanySize.size())
                .education(Education.level())
                .experience(Experience.required())
                .industry(Industry.name())
                .jobTitle(Job.title())
                .jobLevel(Job.level())
                .jobType(Job.type())
                .location(Location.name())
                .salaryRange(Salary.range())
                .skill(Skill.required())
                .source(Source.required())
                .summary(Summary.text())
                .openFrom(RandomDate.getDate())
                .count(new Random().nextInt(1000))
                .build();
        System.out.println(jobPosting);
        //publisher.publish(Mapper.mapToString(jobPosting));
    }
}
