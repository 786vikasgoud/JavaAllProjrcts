package Utilities;

import Utilities.Category;
import Utilities.Tag;

import java.util.List;

public class Pet {
    private long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}









//package Utilities;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Pet {
//    private HashMap <String,Object> data = new HashMap<>();
//    private HashMap <String,Object> category ;
//    private String id;
//    private String name;
//    private ArrayList <String> photoUrls;
//    private ArrayList <HashMap<String,Object>> tags;
//    private HashMap <String,Object> tag;
//    private String status;
//
//    private static HashMap<String, Object> getStringObjectHashMap() {
//        HashMap <String, Object> category = new HashMap<>();
//        category.put("id",0);
//        category.put("name","string");
//        ArrayList<String> photoUrls = new ArrayList<>();
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
