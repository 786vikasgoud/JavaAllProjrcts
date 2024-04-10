package Book_Store_Api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {
    @Test
    public void perform_The_Post_Request(){
        HashMap<String, Object> requestData = new HashMap<>();
        requestData.put("id",0);
        requestData.put("username","VikasGoud");
        requestData.put("firstName","Shivaiahgari");
        requestData.put("lastName","VikasGoud");
        requestData.put( "email", "shivaiahgarivikasgoud@gmail.com");
        requestData.put("password" ,"Vikas786@");
        requestData.put("phone","94859409444");
        requestData.put("userStatus",0);
//        Response response =
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("contant-type","application/json")
                .body(requestData)
        .when()
                .post("https://petstore.swagger.io/v2/user")
                .then()
                .statusCode(200)
                .log().all()
                .log().body()
                .body("code",equalTo(200));
//        Assert.assertEquals(response.getStatusCode(),200);
//        System.out.println(response.getBody().asString());


    }
}
