package com.quanlyrapphim.quanlyrap.untils;

import java.util.ArrayList;

import com.google.gson.Gson;

public class JsonStringToArray {

    public static int[] JsonToArray(String input) {
        Gson gson = new Gson();
        int[] array = gson.fromJson(input, int[].class);

        // Printing the array elements
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }
        return array;
    }

}
