package org.tuchnyak.cvapi.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {
    private String firstName;
    private String lastName;
    private String middleName;
    private Location location;
    private String email;
    private String linkedInnLink;
    private String additionalLink;
    private boolean isReadyToRelocate;
    private boolean isVisaSponsorshipRequired;

}


