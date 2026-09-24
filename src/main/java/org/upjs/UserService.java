package org.upjs;

import java.util.List;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database) {
        this.database = database;

    }

    public GenderRatio computeGenderRatio(){
        double b=0;
        double g=0;
        double u=0;
        int count=database.size();

        for (User user : database) {
            if (user.gender() == User.Gender.MALE) b++;
            if (user.gender() == User.Gender.FEMALE) g++;
            else u++;
        }

        return new GenderRatio(b/count,g/count, u/count);
    }
}
