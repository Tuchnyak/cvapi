package org.tuchnyak.cvapi;

import org.tuchnyak.cvapi.model.*;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Cv cv = Cv.builder()
                .applicant(createApplicant())
                .summary(getSummary())
                .skills(getSKills())
                .accomplishments(getAccomplishments())
                .workExperiences(getWork())
                .educations(getEdu())
                .build();
    }

    private static List<Education> getEdu() {
        return List.of(
                Education.builder()
                        .type(Education.EduType.UNIVERSITY)
                        .educationalLevel("Master’s Degree")
                        .fieldOfStudy("Optotechnics")
                        .organizationName("The National Research University of Information Technologies, Mechanics and Optics (ITMO University)")
                        .additionalInformation("Department of Applied and Computer Optics")
                        .build()
        );
    }

    private static List<WorkExperience> getWork() {
        return List.of(
                WorkExperience.builder()
                        .role("Software Engineer")
                        .employer("LemonBank")
                        .location(new Location("USA", "NYC"))
                        .dutiesDescription("providing payments and information about fines and taxes on interaction with government APIs, team of 9")
                        .technologies(new Skill(Skill.Type.TECHNOLOGIES, List.of("Java", "Kotlin", "Xslt", "Spring", "Maven", "Git")))
                        .build()
        );
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
                new Skill(Skill.Type.TECHNOLOGIES, List.of("Spring", "SOA/REST/Web services", "Maven", "Gradle", "JUnit", "Kafka", "Oracle AQ", "OpenShift,")),
                new Skill(Skill.Type.TOOLS, List.of("Git", "Jira/Confluence/Bitbucket")),
                new Skill(Skill.Type.METHODOLOGY, List.of("Scrum", "Kanban")),
                new Skill(Skill.Type.DATABASES, List.of("Oracle DB", "PostgreSQL")),
                new Skill(Skill.Type.IDE, List.of("IntelliJ IDEA", "Eclipse"))
        );
    }

    private static List<String> getSummary() {
        return List.of(
                "Works in statistical analysis and data reconfiguration",
                "My friends do not understand what I do",
                "Former head of the division in Tulsa"
        );
    }

    private static Applicant createApplicant() {
        return Applicant.builder()
                .firstName("Chandler")
                .lastName("Bing")
                .email("bingoman@yahu.com")
                .linkedInnLink("https://www.linkedin.com/in/chandler_bingo/")
                .location(new Location("11217", "USA", "New York City"))
                .isReadyToRelocate(false)
                .isVisaSponsorshipRequired(false)
                .build();
    }

}
