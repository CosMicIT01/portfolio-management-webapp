package de.cosmicit.pms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.cosmicit.pms.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("agentService")
public class AgentService {

    @Autowired
    SubscriptionService subscriptionService;

    @Autowired
    RestTemplate restTemplate;

    String restUrl = "http://localhost:8080/agent";

    @Autowired
    ObjectMapper objectMapper;

    public List<Subscription> getSubscriptionsByAgentIdNumeric(Long id) {

        List<Subscription> subscriptions = new ArrayList<>();

        restUrl = restUrl + "/" + id +"/subscriptions";

        try {

            ResponseEntity<Subscription[]> responseEntity = restTemplate.getForEntity(restUrl,Subscription[].class);
            Subscription[] objects = responseEntity.getBody();
            MediaType contentType = responseEntity.getHeaders().getContentType();
            HttpStatus statusCode = responseEntity.getStatusCode();
            subscriptions = Arrays.asList(objects);

        }catch (Exception ex){
            ex.printStackTrace();

        }

        return subscriptions;
    }
}
