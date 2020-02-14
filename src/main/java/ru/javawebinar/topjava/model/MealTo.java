package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class MealTo {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

//    private final Supplier<Boolean> excess;
//    private final AtomicBoolean excess;
    private final boolean excess;

    private String id;

    public MealTo(LocalDateTime dateTime, String description, int calories, boolean excess) {
        this.id=UUID.randomUUID().toString();
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.excess = excess;
    }

    public String getId() {
        return id;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isExcess() {
        return excess;
    }
//    public Boolean getExcess() {
//        return excess.get();
//    }

    @Override
    public String toString() {
        return "MealTo{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", excess=" + excess +
                '}';
    }
}
