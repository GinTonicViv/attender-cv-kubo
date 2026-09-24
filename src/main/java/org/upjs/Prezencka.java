package org.upjs;

import java.sql.SQLOutput;
import java.time.*;
import java.util.List;

public record Prezencka(
        Long id,
        LocalDate date,
        Subject subject,
        List<User> attendees

        //datum localDate
        //Datum+cas pre gui localDateTime, pre db Instant, ZonedDateTime, OffsetDateTime
        //cas localTime
) {
}
