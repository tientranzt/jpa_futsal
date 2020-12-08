package com.axonactive.play;

import com.axonactive.match.Match;
import com.axonactive.resultvalue.ResultValue;
import com.axonactive.team.Team;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.stream.Collectors;



@Getter
@Setter
public class Play {

    private int id;

    private Team team;

    private Match match;

    private ResultValue result;

    public Play(int id, Team team, Match match) {

        this.id = id;

        this.team = team;

        this.match = match;

    }

    public int getPlayId() {

        return this.id;

    }

    public void updateResultValue(ResultValue result) {

        this.result = result;

    }

    public Play getPlayById(List<Play> plays, int id) {

        List<Play> matchPlay = plays.stream().filter(play -> play.getPlayId() == id).collect(Collectors.toList());

        if (matchPlay.size() != 0) {

            return matchPlay.iterator().next();

        }

        return null;

    }

}
