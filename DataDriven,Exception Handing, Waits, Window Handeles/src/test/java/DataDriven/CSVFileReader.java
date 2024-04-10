package DataDriven;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class CSVFileReader {

    @Test(dataProvider = "testdatabydata")
    public void datareaderBydataprovider(String username,String password){
        System.out.println(username+" "+password);
    }
   @DataProvider(name ="testdatabydata")
    public String[][] csv_file_reader() throws CsvValidationException, IOException {
        String[][] arr2D;
        ArrayList<ArrayList<String>> arr2d = new ArrayList<>();
        File path = new File("/home/vikas/IdeaProjects/DataDriven,Exception Handing, Waits, Window Handeles/src/test/java/TestData/postman datadrien testing.csv");
        CSVReader reader =new CSVReader(new FileReader(path));
        String[] arr;
        String[] str = reader.readNext();
        while ((arr = reader.readNext())!=null){
            ArrayList<String> dup = new ArrayList<>();
                for (int i = 0; i<arr.length; i++){
                    dup.add(arr[i]);
                }
                arr2d.add(dup);
        }
        int len =arr2d.size();
        arr2D=new String[len][arr2d.getFirst().size()];
        for(int i=0;i<arr2d.size();i++){
            for (int j=0;j<arr2d.get(i).size();j++){
                arr2D[i][j] = arr2d.get(i).get(j);
            }
        }
        return arr2D;
    }
}
