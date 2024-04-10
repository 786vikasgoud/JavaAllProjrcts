package Simple_Book_Api;
import java.util.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Create_Token {
    @Test
    public void GenerateToken(ITestContext context){
        HashMap<String,String> map = new HashMap<>();
        map.put("clientName","Postman");
        map.put("clientEmail","vlellh@example.com");
        Response response=
                given()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .header("content-type","application/json")
                        .pathParam("api-clients","api-clients")
                        .body(map)
                .when()
                        .post("https://simple-books-api.glitch.me/{api-clients}/");
        System.out.println(response.getBody().asString());
        org.json.JSONObject json_data= new org.json.JSONObject(response.getBody().asString());
        System.out.println(json_data.getString("accessToken"));
        context.getSuite().setAttribute("accessToken",json_data.getString("accessToken"));
    }
}
