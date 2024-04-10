import org.testng.annotations.Test;

import java.util.HashMap;

public class practice_maps {
    @Test
    public void my_hash(){
        HashMap <String,String> data = new HashMap<>();
        data.put("name","Vikas");
        data.put("gender","male");
        data.put("village","kowdipally");

        for(String str: data.keySet()){
            String value = data.get(str);
            System.out.println(value);
        }

    }
}
