package Book_Store_Api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetRequest {
    @Test
    public void performGetRequest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("content-type","application/json")
        .when()
                .get("https://bookstore.toolsqa.com/BookStore/v1/Books");
        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody().asString());

        org.json.JSONObject jsonData = new org.json.JSONObject(response.getBody().asString());
        System.out.println(jsonData);
        for(String str :jsonData.keySet()){
            System.out.println(str);
            System.out.println(jsonData.get(str));
        }
        for (int i=0;i<jsonData.getJSONArray("books").length();i++){
            System.out.println(jsonData.getJSONArray("books").getJSONObject(i).get("title"));
        }

    }
}
