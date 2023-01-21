package org.tuchnyak.cvapi.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Builder
public class Cv {

    private Applicant applicant;
    private List<String> summary;
    private List<Skill> skills;
    List<String> accomplishments;
    Set<WorkExperience> workExperiences;
    Set<Education> education;


}
