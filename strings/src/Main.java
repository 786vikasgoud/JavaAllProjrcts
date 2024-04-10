import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byarray();
    }

    public static void byarray(){
        int j=0;
        StringBuilder str = new StringBuilder("aaaaabbccaaaddcccczzzz");
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<((str.length())-1);i++){
            j=i+1;
            int cnt =1;
            while (j<str.length() && str.charAt(i)==str.charAt(j)){
                j++;
                cnt++;
            }
            if(cnt>1){
                ans.append(cnt);
                ans.append(str.charAt(i));
            }
            else {
                ans.append(str.charAt(i));
            }
            i=j-1;
        }
        System.out.println(ans);

    }
    public void byhashmap(){
        String str = "aaabbbccdjffyfndyyyysbhgsxjxjxpppppp";
        HashMap<String,Integer> str1  = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(str1.containsKey(String.valueOf(str.charAt(i)))){
                int j = str1.get(String.valueOf(str.charAt(i)));
                j++;
                str1.put(String.valueOf(str.charAt(i)),j);
//                System.out.println("hiiii");
            }
            else {
                str1.put(String.valueOf(str.charAt(i)),1);
            }
        }
        for (String S:str1.keySet()){
            System.out.print(str1.get(S)+""+S);
        }
    }



}