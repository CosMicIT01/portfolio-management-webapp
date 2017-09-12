package de.cosmicit.pms.service;

import de.cosmicit.pms.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service("subscriptionService")
public class SubscriptionService {


    @Autowired
    RestTemplate restTemplate;

    String subscriptionUrl = "/subscription";

    @Value("${pms.rest.service.uri}") // localhost:8080
    private String pmsRestUri;

    public Subscription getSubscriptionById(Long id) {

        Subscription subscription = null;
        String restURL = pmsRestUri + subscriptionUrl + "/" + id;
        try {

            ResponseEntity<Subscription> responseEntity = restTemplate.getForEntity(restURL, Subscription.class);
            subscription = responseEntity.getBody();
            MediaType contentType = responseEntity.getHeaders().getContentType();
            HttpStatus statusCode = responseEntity.getStatusCode();
            System.out.println("getSubscriptionById : statusCode :: "+statusCode);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return  subscription;
    }
}
