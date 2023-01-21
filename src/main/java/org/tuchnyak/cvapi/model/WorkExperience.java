package org.tuchnyak.cvapi.model;

import lombok.*;

import java.time.LocalDate;
import java.time.YearMonth;

@Builder
@Data
public class WorkExperience {

    private YearMonth begin;
    private YearMonth end;
    private String role;
    private String employer;
    private Location location;
    private String dutiesDescription;
    private Skill technologies;

}
