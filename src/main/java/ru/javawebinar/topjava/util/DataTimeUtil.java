package ru.javawebinar.topjava.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataTimeUtil {
    public static final DateTimeFormatter DATE_TIME_FORMATTER=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static boolean isBetweenInclusive(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }


    public static String toString(LocalDateTime date) {
        return date==null?"":date.format(DATE_TIME_FORMATTER);
    }
}
