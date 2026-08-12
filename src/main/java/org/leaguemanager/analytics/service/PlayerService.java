package org.leaguemanager.analytics.service;

import org.leaguemanager.analytics.model.Player;
import org.leaguemanager.analytics.repository.PlayerRepository;
import org.leaguemanager.analytics.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class PlayerService {

    private final PlayerRepository playerRepository;
    private final TeamRepository  teamRepository;

    public PlayerService(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }


    public Optional<Player> getPlayerById(Long id){
        return playerRepository.findById(id);
    }

    public Player createPlayer(Player player){
        return playerRepository.save(player);
    }

}
