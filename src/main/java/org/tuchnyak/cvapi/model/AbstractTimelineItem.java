package org.tuchnyak.cvapi.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractTimelineItem {

    private LocalDate begin;
    private LocalDate end;

}
