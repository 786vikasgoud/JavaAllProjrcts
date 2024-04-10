package Payloads.Set_petdata;

import Payloads.pet_data.Category;
import Payloads.pet_data.Pet_Post_Request_Data;
import Payloads.pet_data.tag;
import org.junit.jupiter.api.Tags;

import java.util.ArrayList;

public class Set_petdata {
    public static void set_pet_data(Pet_Post_Request_Data data){
        data.setId(14);
        Category category =new Category();
        category.setId(14);
        category.setName("string");
        data.setCategory(category);
        data.setName("doggie");
        ArrayList<String> list = new ArrayList<>();
        list.add("Tommy");
        list.add("Jimmy");
        list.add("doggie");
        data.setPhotoUrls(list);
        tag Tag = new tag();
        Tag.setName("doggie");
        Tag.setId(14);
        tag Tags = new tag();
        Tags.setId(15);
        Tags.setName("Dog");
        ArrayList<tag> listTag =new ArrayList<>();
        listTag.add(Tag);
        listTag.add(Tags);
        data.setTags(listTag);
        data.setStatus("available");
    }
}
