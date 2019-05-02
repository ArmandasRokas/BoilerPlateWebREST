import java.util.HashMap;
import java.util.Map;

public class UserRepo {

    private Map<String, User> users = new HashMap<>();

    public UserRepo(){
        User user = new User();
        user.setId("1");
        user.setName("From hashmap");
        users.put(user.getId(), user);
    }

    public User getUser(String id) {
        return users.get(id);
    }

}
