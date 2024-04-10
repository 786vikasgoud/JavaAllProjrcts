import Utilities.Category;
import Utilities.Pet;
import Utilities.Tag;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;

public class Test_API {

    @Test
    public void test_1() {
        Pet pet = createPetObject();

        given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .body(pet)
        .when()
                .post("https://petstore.swagger.io/v2/pet")
        .then()
                .statusCode(200)
                .body("name", equalTo("doggier"))
                .body("photoUrls[0]", equalTo("string"))
                .body("tags[0].name", equalTo("string"))
                .body("tags[0].id", equalTo(0))
                .log().all();
    }

    private static Pet createPetObject() {
        Category category = new Category(0, "String");
        ArrayList<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag = new Tag(0, "string");
        tags.add(tag);

        Pet pet = new Pet();
        pet.setId(0);
        pet.setCategory(category);
        pet.setName("doggier");
        pet.setPhotoUrls(photoUrls);
        pet.setTags(tags);
        pet.setStatus("available");
        return pet;
    }
}










//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Objects;
//
//import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//
//import static org.hamcrest.Matchers.*;
//
//public class Test_API {
//    @Test
//    public void test_1(){
//
//        HashMap<String, Object> data = getStringObjectHashMap();
//
//
//        given()
//                .contentType("application/json")
//                .header("Content-Type", "application/json")
//                .body(data)
//        .when()
//                .post("https://petstore.swagger.io/v2/pet")
//        .then()
//                .statusCode(200)
//                .body("name", equalTo("doggie"))
//                .body("photoUrls[0]",equalTo("string"))
//                .body("tags[0].name",equalTo("string"))
//                .body("tags[0].id",equalTo(0))
//                .log().all();
//    }
//
//    private static HashMap<String, Object> getStringObjectHashMap() {
//        HashMap <String, Object> category = new HashMap<>();
//        category.put("id",0);
//        category.put("name","string");
//        ArrayList <String> photoUrls = new ArrayList<>();
//        photoUrls.add("string");
//        ArrayList<HashMap<String, Object>> tags = new ArrayList<>();
//        HashMap <String,Object> tag = new HashMap<>();
//        tag.put("id",0);
//        tag.put("name","string");
//        tags.add(tag);
//
//
//        HashMap <String,Object> data = new HashMap<>();
//        data.put("id",0);
//        data.put("category",category);
//        data.put("name","doggie");
//        data.put("photoUrls",photoUrls);
//        data.put("tags",tags);
//        data.put("status","available");
//        return data;
//    }
//}
