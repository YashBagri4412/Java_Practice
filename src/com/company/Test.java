package com.company;

import java.util.LinkedList;

public class Test {
    public int recreateNumber(LinkedList<Integer> l1){
        int number = 0;
        int size = l1.size();
        for(int i = 0;i<size;i++){
            number = number + l1.get(i) * (int)Math.pow(10,(size-(i+1)));
        }
        return number;
    }
    public int greatestInsertion(int n){
        //insert 5 at any given position to get the maximum num.
        //bisect My number
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        int number = 0;
        while(n!=0) {
            int lastDigit = n % 10;
            n = (int) n / 10;
            l1.addFirst(lastDigit);

        }
        if(l1.getFirst()<0){
            l1.addFirst(-5);
            return recreateNumber(l1);
        }
        int j = 0;
        for(int i=0;i<l1.size();i++){
            if(5>l1.get(i) && l1.get(i)>0) {
                l1.add(i, 5);
                j = 1;
                break;
            }

        }
        if(j == 0 && l1.getLast()>0){
            l1.addLast(5);
        }
        //recreating the number

        return recreateNumber(l1);
    }

}
