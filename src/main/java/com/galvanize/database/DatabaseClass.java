package com.galvanize.database;

import com.galvanize.model.Review;
import com.galvanize.model.Snack;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Long, Snack> snacks = new HashMap<>();

    public static Map<Long, Snack> getSnacks() { return snacks; }

    private static Map<Long, Review> reviews = new HashMap<>();

    public static Map<Long, Review> getReviews() { return reviews; }

}
