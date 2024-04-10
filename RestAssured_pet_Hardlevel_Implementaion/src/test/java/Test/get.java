package Test;

import Api_Endpoints.Get_Request;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;

public class get {
    @Test
    public void perform_get_request(ITestContext context){
        int id = (Integer) context.getSuite().getAttribute("id");
        Response response = Get_Request.get_request(id);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }
}
