package de.cosmicit.pms.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.cosmicit.pms.model.ServiceRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("serviceRequestService")
public class ServiceRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ServiceRequestService.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ObjectMapper objectMapper;

    String serviceRequestUrl = "/servicerequest";

    @Value("${pms.rest.service.uri}") // localhost:8080
    private String pmsRestUri;

    public ServiceRequest createServiceRequest(ServiceRequest serviceRequest){

        String responseValue;
        String serializedServiceRequest ;
        try {
            String restUrl = pmsRestUri + serviceRequestUrl ;

            serializedServiceRequest = objectMapper.writeValueAsString(serviceRequest);
            HttpEntity<String> entity = new HttpEntity<>(serializedServiceRequest);

            ResponseEntity<String> response = restTemplate.postForEntity(restUrl, entity, String.class);
            responseValue = response.getBody();
            logger.debug("status response: " + response.getBody());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return serviceRequest;
    }
}
