package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> myList = new ArrayList<>();
        if (left <= right) {
            int i = left;
            while (i <= right) {
                myList.add(i++);
            }
        } else {
            int i = left;
            while (i >= right) {
                myList.add(i--);
            }
        }
        return myList;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> myList = new ArrayList<>();
        if (left <= right) {
            int i = left;
            while (i <= right) {
                if (i % 2 == 0) {
                    myList.add(i);
                }
                i++;
            }
        } else {
            int i = left;
            while (i >= right) {
                if (i % 2 == 0) {
                    myList.add(i);
                }
                i--;
            }
        }
        return myList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> myList = new ArrayList<>();
        for(int i:array){
            if (i % 2 == 0) {
                myList.add(i);
            }
        }
        return myList;
    }

    public int popLastElment(int[] array) {
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (int i : array) {
            st.add(i);
        }
        res = st.pop();
        return res;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        for(int i:firstArray){
            if (secondList.contains(i)) {
                myList.add(i);
            }
        }
        return myList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> myList = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).collect(Collectors.toList());
        for(int i:secondList){
            if (!myList.contains(i)) {
                myList.add(i);
            }
        }
        return myList;
    }
}
