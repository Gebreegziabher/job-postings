package miu.edu;

import com.fasterxml.jackson.core.JsonProcessingException;
import miu.edu.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    DataPublisher publisher;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String[] args) throws JsonProcessingException {
        for (int i = 0; i < 1000; i++) {
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

            publisher.publish(Mapper.mapToString(jobPosting));
        }
    }
}
