package com.ck.Properties.foods;

public class MainCourses extends Foods {
    private final static String foodType = "Main Courses";

    public MainCourses(String name, double price) {
        super(name, MainCourses.foodType, price);
    }
}
