package org.tuchnyak.cvapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.tuchnyak.cvapi.model.*;

import java.time.Month;
import java.time.YearMonth;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        Cv cv = Cv.builder()
                .applicant(createApplicant())
                .summary(getSummary())
                .skills(getSKills())
                .accomplishments(getAccomplishments())
                .workExperiences(getWork())
                .education(getEdu())
                .build();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cv);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private static Set<Education> getEdu() {
        Set<Education> set = new TreeSet<>((e1, e2) -> Integer.compare(e2.getBeginYear(), e1.getBeginYear()));
        set.add(
                Education.builder()
                        .beginYear(2006)
                        .endYear(2012)
                        .type(Education.EduType.UNIVERSITY)
                        .educationalLevel("Master’s Degree")
                        .fieldOfStudy("Optotechnics")
                        .organizationName("The National Research University of Information Technologies, Mechanics and Optics (ITMO University)")
                        .additionalInformation("Department of Applied and Computer Optics")
                        .location(new Location("Russia", "Saint Petersburg"))
                        .build()
        );
        set.add(
                Education.builder()
                        .beginYear(2019)
                        .endYear(2019)
                        .type(Education.EduType.ADVANCED_TRAINING_COURSE)
                        .fieldOfStudy("Software developer using Java EE technologies")
                        .organizationName("Innopolis University")
                        .location(new Location("Russia", "Kazan"))
                        .build()
        );
        return set;
    }

    private static Set<WorkExperience> getWork() {
        Set<WorkExperience> set = new TreeSet<>((w1, w2) -> w2.getBegin().compareTo(w1.getBegin()));
        set.add(
                WorkExperience.builder()
                        .begin(YearMonth.of(2019, Month.MARCH))
                        .end(YearMonth.of(2023, Month.JANUARY))
                        .role("Software Engineer")
                        .employer("Sberbank")
                        .location(new Location("Russia", "Saint Petersburg"))
                        .dutiesDescription("providing payments and information about fines and taxes on interaction with government APIs, team of 9")
                        .technologies(new Skill(Skill.Type.TECHNOLOGIES, List.of("Java", "Kotlin", "Xslt", "Spring", "Maven", "Git")))
                        .build()
        );
        return set;
    }

    private static List<String> getAccomplishments() {
        return List.of(
                "Developed new functionality in the legacy system that provides subscriptions on fines information for bank customers",
                "Split a monolithic system into microservices using the inner proprietary message-driven framework (Akka-like)",
                "Developed one of the subsystems using OpenShift services for new payment API between bank and government, both from scratch and forking existing service"
        );
    }

    private static List<Skill> getSKills() {
        return List.of(
                new Skill(Skill.Type.LANGUAGES, List.of("Java", "Kotlin", "SQL")),
                new Skill(Skill.Type.TECHNOLOGIES, List.of("Spring", "SOA/REST/Web services", "Maven", "Gradle", "JUnit", "Kafka", "Oracle AQ", "OpenShift", "Selenium")),
                new Skill(Skill.Type.TOOLS, List.of("Git", "Jira/Confluence/Bitbucket")),
                new Skill(Skill.Type.METHODOLOGY, List.of("Scrum", "Kanban")),
                new Skill(Skill.Type.DATABASES, List.of("Oracle DB", "PostgreSQL")),
                new Skill(Skill.Type.IDE, List.of("IntelliJ IDEA", "Eclipse"))
        );
    }

    private static List<String> getSummary() {
        return List.of(
                "9+ years of engineering experience, almost 4 of them in software developing services for financial systems (mostly using Java) both from scratch and diving into an existing codebase.",
                "Took part in the process of transferring the legacy systems to microservices.",
                "Last role: I was a backend software engineer (Java, Kotlin) in the Sberbank, payments and transfers team."
        );
    }

    private static Applicant createApplicant() {
        return Applicant.builder()
                .firstName("George")
                .lastName("Shchennikov")
                .email("georgii.o.sv@gmail.com")
                .linkedInnLink("https://www.linkedin.com/in/george-sv/")
                .location(new Location("Armenia", "Yerevan"))
                .isReadyToRelocate(true)
                .isVisaSponsorshipRequired(true)
                .build();
    }

}
