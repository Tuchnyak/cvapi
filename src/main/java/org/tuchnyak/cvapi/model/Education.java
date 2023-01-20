package org.tuchnyak.cvapi.model;

import lombok.*;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Education extends AbstractTimelineItem {

    private EduType type;
    private String educationalLevel;
    private String fieldOfStudy;
    private String organizationName;
    private String additionalInformation;

    public Education(LocalDate begin, LocalDate end) {
        super(begin, end);
    }

    public enum EduType {
        SCHOOL, COLLEGE, UNIVERSITY, ADVANCED_TRAINING_COURSE, ONLINE_COURSE
    }
}

