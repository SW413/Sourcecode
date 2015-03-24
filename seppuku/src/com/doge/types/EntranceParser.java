package com.doge.types;

/**
 * Created by michno on 24/3/15.
 */
public class EntranceParser {
    public static int[] ParseEntrance(String ent){
        String[] strArr = ent.replaceAll("\\[",  "").replaceAll("\\]",  "").split(",");
        int[] coordinates = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                coordinates[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException nfe) {}
        }
        return coordinates;
    }
}
