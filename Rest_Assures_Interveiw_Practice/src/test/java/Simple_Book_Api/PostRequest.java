package Simple_Book_Api;
import java.util.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {
    @Test
public void postMethod(ITestContext context){
        String bearerToken =  (String)context.getSuite().getAttribute("accessToken");
        HashMap<String,Object> map = new HashMap<>();
        map.put("bookId", 1);
        map.put("customerName","John");
   Response response = given()
           .contentType(ContentType.JSON)
           .accept(ContentType.JSON)
           .header("content-type","application/json")
           .auth().oauth2("18cb7020bd0bf8347f26472290392b88c284e78b634d0fe8edaeb3bf983a2428")
           .pathParam("orders","orders")
           .baseUri("https://simple-books-api.glitch.me")
           .body(map)
           .when()
           .post("/{orders}");
    System.out.println(response.getBody().asString());
    org.json.JSONObject jsonData = new org.json.JSONObject(response.getBody().asString());
    jsonData.getString("orderId");
    context.getSuite().setAttribute("orderId",jsonData.getString("orderId"));
    String str = (String) context.getSuite().getAttribute("orderId");
        System.out.println(str);

}
}
