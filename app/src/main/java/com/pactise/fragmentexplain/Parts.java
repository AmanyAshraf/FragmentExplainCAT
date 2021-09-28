package com.pactise.fragmentexplain;

import java.util.ArrayList;

public class Parts {
    private static final ArrayList<Integer> heads = new ArrayList<Integer>() {{
        add(R.drawable.head1);
        add(R.drawable.head2);
        add(R.drawable.head3);
        add(R.drawable.head4);
        add(R.drawable.head5);

    }};

    private static final ArrayList<Integer> bodies = new ArrayList<Integer>() {{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
    }};

    private static final ArrayList<Integer> legs = new ArrayList<Integer>() {{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
        add(R.drawable.legs4);
        add(R.drawable.legs5);

    }};

    private static final ArrayList<Integer> all = new ArrayList<Integer>() {{
        addAll(heads);
        addAll(bodies);
        addAll(legs);
    }};


    // Getter methods that return lists of all head images, body images, and leg images

    public static ArrayList<Integer> getHeads() {
        return heads;
    }

    public static ArrayList<Integer> getBodies() {
        return bodies;
    }

    public static ArrayList<Integer> getLegs() {
        return legs;
    }

    // Returns a list of all the images combined: heads, bodies, and legs in that order
    public static ArrayList<Integer> getAll() {
        return all;
    }
}