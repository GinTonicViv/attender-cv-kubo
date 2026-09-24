package org.upjs;

import java.time.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("LocalDate " + LocalDate.now());
        System.out.println("LocalDateTime " + LocalDateTime.now());
        System.out.println("Instant " + Instant.now());
        System.out.println("ZonedTime" + ZonedDateTime.now());
        System.out.println("OffsetDateTime " + OffsetDateTime.now());
    }
}
