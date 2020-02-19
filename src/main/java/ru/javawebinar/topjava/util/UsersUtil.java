package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class UsersUtil {
    public static final List<User> USERS = Arrays.asList(
            new User(null, "First", "111@mail.ru", "111", Role.ROLE_ADMIN, Role.ROLE_USER),
            new User(null, "Second", "222@mail.ru", "222", Role.ROLE_USER),
            new User(null, "Third", "333@mail.ru", "333", 2100, true, EnumSet.of(Role.ROLE_USER))
    );
}
