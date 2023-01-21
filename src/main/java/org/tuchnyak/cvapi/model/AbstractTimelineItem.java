package org.tuchnyak.cvapi.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.YearMonth;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractTimelineItem {

    private YearMonth begin;
    private YearMonth end;

}
