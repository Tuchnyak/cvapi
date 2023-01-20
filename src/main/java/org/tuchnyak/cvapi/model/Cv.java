package org.tuchnyak.cvapi.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Cv {

    private Applicant applicant;
    private List<String> summary;
    private List<Skill> skills;
    List<String> accomplishments;
    List<WorkExperience> workExperiences;
    List<Education> educations;

}
