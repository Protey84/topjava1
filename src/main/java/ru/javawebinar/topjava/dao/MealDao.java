package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.MealTo;

import java.util.List;

public interface MealDao {
    void add(MealTo mealTo);
    void delete(int mealToId);
    void update(MealTo mealTo);
    List<MealTo> getAllMealTo();
    MealTo getMealToById(String id);

}
