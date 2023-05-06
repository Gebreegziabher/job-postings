package miu.edu;

import com.fasterxml.jackson.core.JsonProcessingException;
import miu.edu.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PublisherSchedule {
    @Autowired
    KafkaPublisher publisher;

<<<<<<< HEAD
    @Autowired
    JmsSender sender;

=======
>>>>>>> d753d7fa05aa3b92833f2ef605db44eefc07cea3
    @Scheduled(fixedRate = 15000) //run every 15 seconds
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
<<<<<<< HEAD

        //publisher.publish(Mapper.mapToString(jobPosting));
        sender.send(Mapper.mapToString(jobPosting));
=======
        //System.out.println(jobPosting);
        publisher.publish(Mapper.mapToString(jobPosting));
>>>>>>> d753d7fa05aa3b92833f2ef605db44eefc07cea3
    }
}
