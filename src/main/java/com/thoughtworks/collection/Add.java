package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0;
        boolean b = leftBorder <= rightBorder;
        if(b==true){
            for(int i=leftBorder;i<=rightBorder;i++)
            {
                if(i%2 == 0)sum+=i;

            }
        }
        else{
            for(int i=leftBorder;i>=rightBorder;i--)
            {
                if(i%2 == 0)sum+=i;

            }
        }

        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum=0;
        boolean b = leftBorder <= rightBorder;
        if(b == true){
            for(int i =leftBorder;i <= rightBorder;i++)
            {
                if(i%2 == 1)sum+=i;

            }
        }
        else{
            for(int i = leftBorder;i >= rightBorder;i--)
            {
                if(i%2 == 1)sum+=i;

            }

        }

        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        Iterator<Integer> it =arrayList.iterator();
        while(it.hasNext()){
            sum += 3 * it.next() + 2;
        }
        return sum;

    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> myList = new ArrayList<Integer>();
        Iterator<Integer> it =arrayList.iterator();
        while(it.hasNext()){
            int tmp= it.next();
            int res=0;
            if(tmp%2==1)
            {
                res= tmp * 3 + 2;
            }
            else
            {
                res = tmp;
            }
            myList.add(res);
        }
        return myList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum=0;
        Iterator<Integer> it =arrayList.iterator();
        while(it.hasNext()){
            int tmp= it.next();
            if(tmp%2==1) sum += 3 * tmp + 5;
        }
        return sum;

    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double res = 0;
        Iterator<Integer> it = arrayList.iterator();
        ArrayList<Integer> myList = new ArrayList<>();
        while(it.hasNext()){
            int tmp = it.next();
            if (tmp % 2 == 0) {
                myList.add(tmp);
            }
        }
        Collections.sort(myList);
        int size = myList.size();
        if (size % 2 == 0) {
            int i = size / 2 - 1;
            res = (myList.get(i) + myList.get(i + 1)) / 2;
        }
        else
        {
            res = myList.get(size / 2 + 1);
        }
        return res;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double res = 0;
        Iterator<Integer> it = arrayList.iterator();
        ArrayList<Integer> myList = new ArrayList<>();
        int sum = 0;
        int size = 0;
        while(it.hasNext()){
            int tmp = it.next();
            if (tmp % 2 == 0) {
                sum += tmp;
                size++;
            }
        }
        res = sum / size;
        return res;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (specialElment % 2 == 1) {
            return false;
        }
        Iterator<Integer> it = arrayList.iterator();
        ArrayList<Integer> myList = new ArrayList<>();
        while(it.hasNext()){
            int tmp = it.next();
            if (tmp % 2 == 0) {
                myList.add(tmp);
            }
        }
        if (myList.contains(specialElment)) {
            return true;
        } else {
            return false;
        }

    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Iterator<Integer> it = arrayList.iterator();
        ArrayList<Integer> myList = new ArrayList<>();
        while(it.hasNext()){
            int tmp = it.next();
            if (tmp % 2 == 0 && !myList.contains(tmp)) {

                myList.add(tmp);
            }
        }
        return myList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Iterator<Integer> it = arrayList.iterator();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        while(it.hasNext()){
            int tmp = it.next();
            if (tmp % 2 == 0) {
                evenList.add(tmp);
            } else {
                oddList.add(tmp);
            }
        }
        Collections.sort(evenList);
        Collections.reverse(oddList);
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> myList = new ArrayList<Integer>();
        Iterator<Integer> it =arrayList.iterator();
        if (arrayList.size() <= 1) {
            return myList;
        }
        int first = it.next();
        int second = 0;
        while(it.hasNext()){
            second = first;
            first = it.next();
            int res = (first + second) * 3;
            myList.add(res);
        }
        return myList;
    }
}
