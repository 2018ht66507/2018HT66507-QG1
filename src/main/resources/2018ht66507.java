package com.2018ht66507;

public class 2018ht66507 {

    public String getMessage(String name) {

        StringBuilder result = new StringBuilder();

        if (name == null || name.trim().length() == 0) {

            result.append("WILP");

        } else {

            result.append("BITS " + name);

        }
        return result.toString();
    }

}
