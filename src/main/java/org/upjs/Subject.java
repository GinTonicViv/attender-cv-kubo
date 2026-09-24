package org.upjs;

import java.util.List;

public record Subject(
        Long id,
        String name,
        int year,
        //najlahsie sa pretypuvava z db na list
        List<User> students

) {
}
