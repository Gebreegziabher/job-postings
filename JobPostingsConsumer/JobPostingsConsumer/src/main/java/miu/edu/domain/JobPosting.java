package miu.edu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ToString
@NoArgsConstructor
@Data
@Document
public class JobPosting {
    @Id
    private String id;
    private String company;
    private String companyRating;
    private String companySize;
    private String education;
    private String experience;
    private String industry;
    private String jobTitle;
    private String jobLevel;
    private String jobType;
    private String location;
    private String salaryRange;
    private String skills;
    private String source;
    private String summary;
    private Date openFrom;
    private int count;

    public static class Builder {
        private String company;
        private String companyRating;
        private String companySize;
        private String education;
        private String experience;
        private String industry;
        private String jobTitle;
        private String jobLevel;
        private String jobType;
        private String location;
        private String salaryRange;
        private String skills;
        private String source;
        private String summary;
        private Date openFrom;
        private int count;

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder companyRating(String companyRating) {
            this.companyRating = companyRating;
            return this;
        }

        public Builder companySize(String companySize) {
            this.companySize = companySize;
            return this;
        }

        public Builder education(String education) {
            this.education = education;
            return this;
        }

        public Builder experience(String experience) {
            this.experience = experience;
            return this;
        }

        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        public Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder jobLevel(String jobLevel) {
            this.jobLevel = jobLevel;
            return this;
        }

        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder salaryRange(String salaryRange) {
            this.salaryRange = salaryRange;
            return this;
        }

        public Builder skill(String skills) {
            this.skills = skills;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder openFrom(Date openFrom) {
            this.openFrom = openFrom;
            return this;
        }
        public Builder count(int count) {
            this.count = count;
            return this;
        }

        public JobPosting build() {
            return new JobPosting(this);
        }
    }

    private JobPosting(Builder builder) {
        company = builder.company;
        companyRating = builder.companyRating;
        companySize = builder.companySize;
        education = builder.education;
        experience = builder.experience;
        industry = builder.industry;
        jobTitle = builder.jobTitle;
        jobLevel = builder.jobLevel;
        jobType = builder.jobType;
        location = builder.location;
        salaryRange = builder.salaryRange;
        skills = builder.skills;
        source = builder.source;
        summary = builder.summary;
        openFrom = builder.openFrom;
        count = builder.count;
    }
}
