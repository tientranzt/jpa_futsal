package com.axonactive.team;

import com.axonactive.contact.Contact;
import com.axonactive.player.Player;
import com.axonactive.groupstage.GroupStage;
import com.axonactive.teaminfo.TeamInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private TeamInfo info;

    private int idMatch;

    private GroupStage groupStage;

    private Contact contact;

    private List<Player> members = new ArrayList<>();

    public void addMember(Player player) {

        if (members.size() < 12) {

            members.add(player);

        } else {

            throw new IllegalStateException("Maximum size of team member");
        }
    }




}


