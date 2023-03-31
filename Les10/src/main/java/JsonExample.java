import org.json.JSONObject;

public class JsonExample {
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"John\",\"age\":30,\"city\":\"Spb\"}";
        JSONObject jsonObject = new JSONObject(jsonStr);

        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String city = jsonObject.getString("city");

        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("city " + city);
    }
}
