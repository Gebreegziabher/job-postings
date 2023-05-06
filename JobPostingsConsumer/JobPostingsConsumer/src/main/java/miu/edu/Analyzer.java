package miu.edu;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Analyzer {
    private List<JobsByTitle> jobsByTitles;
    private List<JobsBySkill> jobsBySkills;
    private List<JobsBySalaryDistribution> jobsBySalaryDistributions;
    private List<JobsByLocation> jobsByLocations;
    private List<JobsByIndustry> jobsByIndustries;
    private List<JobsByExperience> jobsByExperiences;
}
