package org.example;
//package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Countcharacters {
    public static void main(String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> count = new HashMap<>();
        char[] charactersInString = sentence.toCharArray();
        for (char car : charactersInString) {
            if (!count.containsKey(car)) {
                count.put(car, 1);
            } else {
                count.put(car, count.get(car) + 1);
            }
        }
        for (Map.Entry<Character, Integer> newCount : count.entrySet()) {
            System.out.println(newCount.getKey() + ": " + newCount.getValue());
        }
    };
}

