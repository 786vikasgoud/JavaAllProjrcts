import java.lang.reflect.Type;
import java.util.*;
import java.lang.*;
import java.io.InputStream;

public class Main {
    public static int[] sorted(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
        return arr;
    }

    public static int maxnumber(int arr[]) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        max = min;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String[] sortedstring(String str1[]) {
        for (int i = 0; i < str1.length - 1; i++) {
            for (int j = 0; j < str1.length - 1; j++) {
                int s = str1[j].compareTo(str1[j + 1]);
                if (s > 0) {
                    String st = str1[j];
                    str1[j] = str1[j + 1];
                    str1[j + 1] = st;
                }
            }
        }
        return str1;
    }

    public static void allaboutstring() {
        String str2 = new String();
        str2 = "i am vikas";
        System.out.println(str2);
        String str = "vikas goud ramesh";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        String str1 = "123";
        int num = 1234;
        String st = Integer.toString(num);
        System.out.println(st);
        int nubber = Integer.parseInt(str1);
        System.out.println(nubber);
    }

    public static String reverse(String str) {
        StringBuilder st = new StringBuilder();
        st.append(str);
        for (int i = 0; i < st.length() / 2; i++) {
            int n = (st.length() - 1) - i;
            char c = st.charAt(i);
            char ch = st.charAt(n);
            st.setCharAt(i, ch);
            st.setCharAt(n, c);
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            st.append(str.charAt(i));
        }
        return st.toString();
    }

    // str = "aaabbbcdeefhhhhhikkkkkkk";
    public static String me(String str) {
        StringBuilder st = new StringBuilder();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            int inc = 0;
            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                inc++;
                j++;
            }
            i = j - 1;
            if (inc > 1) {

                st.append(Integer.toString(inc));
            }
            st.append(Character.toString(str.charAt(i)));
        }
        //System.out.println(st);
        return st.toString();
    }

    public static void sortinbuild(){
        int arr[]={9,6,2,8,5,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
    public static void arrtostr(){
        String str="hah bet shd";
        String arr1[]=str.split(" ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i].charAt(0));
        }

        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1=1234;
        String st=Integer.toString(num1);
        System.out.println(st);
        String str="1234";
        String s="13";
        if(str.contains(s)){
            System.out.println("yes");
        }
        int num =Integer.parseInt(str);
        System.out.println(num);
    }
}