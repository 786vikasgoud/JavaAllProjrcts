package Api_Endpoints;

import Payloads.pet_data.Pet_Post_Request_Data;
import Routers.Pet_URL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Put_Request {
    public static Response put_request(Pet_Post_Request_Data data){
        Response response=
                given()
                        .contentType(ContentType.JSON)
                        .header("content-type","application/json")
                        .accept(ContentType.JSON)
                        .body(data)
        .when()
                .put(Pet_URL.Post_URI);

        return response;
    }
}
