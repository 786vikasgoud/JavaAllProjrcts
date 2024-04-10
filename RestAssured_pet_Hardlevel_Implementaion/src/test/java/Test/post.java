package Test;

import Api_Endpoints.PostRequest;
import Payloads.Set_petdata.Set_petdata;
import Payloads.pet_data.Pet_Post_Request_Data;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class post {
    Pet_Post_Request_Data data;
    @BeforeTest
    public void dataset_up(){
        data = new Pet_Post_Request_Data();
        Set_petdata.set_pet_data(data);
    }
    @Test
    public void Perform_Post_Request(ITestContext  context){
        Response response= PostRequest.post_request(data);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println(response.statusCode());
        int id = data.getId();
        context.getSuite().setAttribute("id",id);
        context.getSuite().setAttribute("data",data);

    }
}
