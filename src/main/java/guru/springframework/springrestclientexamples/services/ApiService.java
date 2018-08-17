package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * Created by Jnwanya on
 * Sun, 14 Jan, 2018.
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
