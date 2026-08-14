package org.leaguemanager.analytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Staff {
    private String staffFirstName;
    private String staffLastName;

    private Integer Salary;

    private enum staffCategory {
        Coaching,
        Executive,
        Medical,
        Scouting

    }

    private enum staffRole {
        HeadCoach,
        AssistantCoach,
        PositionCoach,
        HeadOfPerformanceCoach,
        StrengthAndConditioningCoach,
        TeamDoctor,
        AthleticTrainer,
        TeamNutritionist,
        VideoAnalyst,
        DirectorOfTeamOperations,
        EquipmentManager,
        President,
        VicePresident,
        SportingDirector,
        DirectorOfScouting,
        GeneralManager




    }




    @Id
    private Long id;
}
