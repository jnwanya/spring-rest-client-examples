package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by Jnwanya on
 * Sun, 14 Jan, 2018.
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private String apiUrl;

    public ApiServiceImpl(RestTemplate restTemplate,@Value("${api_url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("limit", limit);

      //  UserData userData = restTemplate.getForObject(apiUrl + limit, UserData.class);
        UserData userData = restTemplate.getForObject(urlBuilder.toUriString(), UserData.class);
        return userData.getData();
    }
}
