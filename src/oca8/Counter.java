package oca8;

public class Counter<T>{  //1
    T t;
    public  <T> int count(T[] ta, T t){  //2
        this.t = t;  //3
        int count = 0;
        for(T x : ta){
            count =  x == t ? count+1: count;//4
        }
        return count;
    }
}