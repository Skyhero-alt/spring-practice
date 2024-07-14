package me.skyhero.spring_practice.run;

import java.time.LocalDateTime;

public class Run {

    private Integer id;
    private String title;
    private LocalDateTime starTime;
    private LocalDateTime endTime;
    private Integer distance;

    public Run(Integer id, String title, LocalDateTime starTime, LocalDateTime endTime, Integer distance) {
        this.id = id;
        this.title = title;
        this.starTime = starTime;
        this.endTime = endTime;
        this.distance = distance;
    }

}