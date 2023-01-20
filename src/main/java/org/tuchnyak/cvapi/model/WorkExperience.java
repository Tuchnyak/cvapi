package org.tuchnyak.cvapi.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class WorkExperience extends AbstractTimelineItem {

    private String role;
    private String employer;
    private Location location;
    private String dutiesDescription;
    private Skill technologies;

    public WorkExperience(LocalDate begin, LocalDate end) {
        super(begin, end);
    }
}
