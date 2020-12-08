package com.axonactive.match;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

// match -> play -> team -> player

@Getter
@NoArgsConstructor
public class Match {

    private int id;

    private LocalDateTime dateTime;

    private String location;

    public Match(int id, LocalDateTime dateTime, String location) {

        this.id = id;

        this.dateTime = dateTime;

        this.location = location;

    }

}
