package de.cosmicit.pms.service;

import de.cosmicit.pms.model.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service("promotionsService")
public class PromotionsService {


    @Autowired
    RestTemplate restTemplate;

    String promotionUrl = "/promotion";

    @Value("${pms.rest.service.uri}") // localhost:8080
    private String pmsRestUri;

    public Promotion getPromotionById(Long id) {

        Promotion promotion = null;
        String restURL = pmsRestUri + promotionUrl + "/" + id;
        try {

            ResponseEntity<Promotion> responseEntity = restTemplate.getForEntity(restURL, Promotion.class);
            promotion = responseEntity.getBody();
            MediaType contentType = responseEntity.getHeaders().getContentType();
            HttpStatus statusCode = responseEntity.getStatusCode();
            System.out.println("getPromotionById : statusCode :: "+statusCode);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return  promotion;
    }
}
