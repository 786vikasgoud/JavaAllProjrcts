package Test;

import Api_Endpoints.Put_Request;
import Payloads.pet_data.Pet_Post_Request_Data;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class put {
    Pet_Post_Request_Data data;
    Response response;
    @Test
    public void perform_put_request(ITestContext context){
       data = (Pet_Post_Request_Data) context.getSuite().getAttribute("data");
        System.out.println(data.getName());
        data.getCategory().setName("Tommy");
        data.setName("Snake");
        data.setStatus("unavailable");
        response = Put_Request.put_request(data);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println(data.getName());
    }
}
