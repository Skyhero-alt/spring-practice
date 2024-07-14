package me.skyhero.spring_practice.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Integer distance,
        Location location) {
}