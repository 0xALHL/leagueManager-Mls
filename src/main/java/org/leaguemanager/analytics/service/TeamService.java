package org.leaguemanager.analytics.service;
import org.springframework.stereotype.Service;
import org.leaguemanager.analytics.model.Team;
import org.leaguemanager.analytics.repository.TeamRepository;
import java.util.List;
import java.util.Optional;
@Service
public class TeamService {
// Use the final type so it can never be changed
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
    // New comment
    public List<Team> getAllTeams(){

    }

}
