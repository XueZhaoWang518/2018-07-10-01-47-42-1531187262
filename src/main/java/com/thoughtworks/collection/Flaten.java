package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {

        List<Integer> resList = new ArrayList<Integer>();
        int row = array.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resList.add(array[i][j]);
            }
        }
        return resList;

    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        Set<Integer> resSet = new LinkedHashSet<Integer>();
        int row = array.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resSet.add(array[i][j]);
            }
        }
        List<Integer> resList = new ArrayList<>(resSet);
        return resList;
    }
}
