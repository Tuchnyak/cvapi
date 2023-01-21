package org.tuchnyak.cvapi.model;

import lombok.*;

import java.time.LocalDate;
import java.time.YearMonth;

@Builder
@Data
public class Education {

    private int beginYear;
    private int endYear;
    private Location location;
    private EduType type;
    private String educationalLevel;
    private String fieldOfStudy;
    private String organizationName;
    private String additionalInformation;

    public enum EduType {
        SCHOOL, COLLEGE, UNIVERSITY, ADVANCED_TRAINING_COURSE, ONLINE_COURSE
    }
}

