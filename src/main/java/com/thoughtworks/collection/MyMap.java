package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Iterator<Integer> it = this.array.iterator();
        while (it.hasNext()) {
            Integer tmp = it.next();
            map.put(tmp, 3 * tmp);
        }
        Collection<Integer> collection=map.values();
        List<Integer> myList = new ArrayList<>(collection);
        return myList;

    }

    public List<String> mapLetter() {
        Map<Integer, String> map = new LinkedHashMap<>();
        Iterator<Integer> it = this.array.iterator();
        while (it.hasNext()) {
            int tmp = it.next();
            map.put(tmp, letterList.get(tmp-1));
        }
        Collection<String> collection=map.values();
        List<String> myList = new ArrayList<>(collection);
        return myList;
    }

    public List<String> mapLetters() {
        //Map<Integer, String> map = new LinkedHashMap<>();
        Iterator<Integer> it = this.array.iterator();
        List<String> myList = new ArrayList<>();
        while (it.hasNext()) {
            Integer tmp = it.next();
            String value="";
            do {
                Integer t = tmp % 26;
                if (t == 0) {
                    t += 26;
                    value = value.concat(letterList.get(t - 1));
                    tmp -= 26;
                } else {
                    value = value.concat(letterList.get(t - 1));
                }
                tmp = tmp / 26;
            } while (tmp != 0);
            myList.add(new StringBuffer(value).reverse().toString());
        }
        return myList;
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
