package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int maximum= arrayList.get(0);
        for (Integer i : this.arrayList) {
            if (maximum < i) {
                maximum = i;
            }
        }
        return maximum;
    }

    public double getMinimum() {
        throw new NotImplementedException();
    }

    public double getAverage() {
        throw new NotImplementedException();
    }

    public double getMedian() { throw new NotImplementedException(); }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        int res = 0;
        for (Integer i:this.arrayList ) {
            if (i % 2 == 0) {
                res = i;
                break;
            }
        }
        return res;
    }

    public int getIndexOfFirstEven() {
        int res = 0;
        for (Integer i:this.arrayList ) {
            if (i % 2 == 0) {
                res = this.arrayList.indexOf(i)-1;
            }
        }
        return res;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (arrayList.size() != this.arrayList.size()) {
            return false;
        } else {
            for (Integer i:this.arrayList ) {
                if (i != arrayList.get(this.arrayList.indexOf(i))) {
                    return false;
                }
                }
            return true;
            }
        }



    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
