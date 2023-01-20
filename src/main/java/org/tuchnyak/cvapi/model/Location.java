package org.tuchnyak.cvapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Location {

    private String postalCode;
    @NonNull
    private String country;
    @NonNull
    private String city;

}
