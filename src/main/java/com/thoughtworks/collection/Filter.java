package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        Iterator<Integer> it = this.array.iterator();
        List<Integer> myList = new ArrayList<>();
        while (it.hasNext()) {
            int tmp = it.next();
            if (tmp % 2 == 0) {
                myList.add(tmp);
            }
        }
        return myList;
    }

    public List<Integer> filterMultipleOfThree() {
        Iterator<Integer> it = this.array.iterator();
        List<Integer> myList = new ArrayList<>();
        while (it.hasNext()) {
            int tmp = it.next();
            if (tmp % 3 == 0) {
                myList.add(tmp);
            }
        }
        return myList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> commonList = new ArrayList<>();
        Iterator<Integer> it=firstList.iterator();
        while (it.hasNext()) {
            int tmp = it.next();
            if (secondList.contains(tmp) && !commonList.contains(tmp)) {
                commonList.add(tmp);
            }
        }

        return commonList;
    }

    public List<Integer> getDifferentElements() {
        Iterator<Integer> it = this.array.iterator();
        List<Integer> resList = new ArrayList<>();
        while (it.hasNext()) {
            int tmp = it.next();
            if (!resList.contains(tmp)) {
                resList.add(tmp);
            }
        }

        return resList;
    }
}