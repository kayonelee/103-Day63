package com.win.junit;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {

//PROGRAMMING EXERCISE-NICKNAMES
        HashMap<String, String> nicknames = new HashMap<>();
        //ADDING A KEY AND VALUE-PUT METHOD-------
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        String matthewNickname = nicknames.get("matthew");
        System.out.println(matthewNickname);
    }
}