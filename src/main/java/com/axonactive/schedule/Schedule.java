package com.axonactive.schedule;


import com.axonactive.match.Match;
import com.axonactive.play.Play;
import com.axonactive.team.Team;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@NoArgsConstructor
public class Schedule {

    private List<Play> plays = new ArrayList<>();

    private List<Team> teams = new ArrayList<>();

    private void shuffleTeam() {

        Collections.shuffle(teams);

    }

    private void addTeamToPlayWithoutResidual() {

        int teamSize = teams.size();

        shuffleTeam();

        for (int index = 0; index < teamSize / 2; index++) {

            plays.add(new Play(index, teams.get(index), new Match(index + 1, LocalDateTime.of(2020, 12, 20, 17, 00), "Can Tho")));
            plays.add(new Play(index + 1, teams.get(teamSize - (index + 1)), new Match(index + 1, LocalDateTime.of(2020, 12, 20, 17, 0), "Can Tho")));

        }

    }

    private void addTeamToPlayWithResidual() {

        // error

    }

    public void generateSchedule() {

        if (teams.size() % 2 == 0) {

            addTeamToPlayWithoutResidual();

        } else {

            addTeamToPlayWithoutResidual();

        }

    }


}
