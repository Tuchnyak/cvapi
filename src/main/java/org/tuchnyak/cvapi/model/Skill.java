package org.tuchnyak.cvapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    private Type type;
    private List<String> list;

    public enum Type {
        LANGUAGES, TECHNOLOGIES, TOOLS, METHODOLOGY, DATABASES, IDE
    }

}
