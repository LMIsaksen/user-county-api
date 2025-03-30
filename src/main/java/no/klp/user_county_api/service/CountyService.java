package no.klp.user_county_api.service;

import no.klp.user_county_api.model.CountyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Service
public class CountyService {

    private final RestClient restClient = RestClient.create();
    private static final String API_URL = "https://ws.geonorge.no/kommuneinfo/v1/fylker/";

    public String getCountyName(String countyNumber) {
        try {
            CountyResponse county = restClient.get()
                    .uri(API_URL + countyNumber)
                    .retrieve()
                    .body(CountyResponse.class);

            if (county == null || county.getFylkesnavn() == null) {
                return null;
            }
            return county.getFylkesnavn();

        } catch (RestClientException e) {
            return null;
        }
    }
}