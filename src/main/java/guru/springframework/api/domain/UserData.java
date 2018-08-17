package guru.springframework.api.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jnwanya on
 * Sun, 14 Jan, 2018.
 */
public class UserData {

    private List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
