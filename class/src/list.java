import java.sql.SQLOutput;
import java.util.*;
import java.io.*;


public class list {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            arr.add(i*i);
        }
        arr.add(2,25);
        arr.set(0,11);
        arr.add(4,32);
        arr.set(5,65);
        Collections.sort(arr);
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains(32));
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            ar.add(i);
        }
        arr.addAll(ar);
        Collections.sort(arr,Collections.reverseOrder());
        Collections.reverse(arr);
//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
        arr.addFirst(284);
        System.out.println(arr.getFirst());
        Iterator it=arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
//        System.out.println(arr);
    }
}
