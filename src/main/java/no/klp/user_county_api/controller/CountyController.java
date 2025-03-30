package no.klp.user_county_api.controller;

import no.klp.user_county_api.service.CountyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/county")
public class CountyController {

    private final CountyService countyService;

    public CountyController(CountyService countyService) {
        this.countyService = countyService;
    }

    @GetMapping(value = "/{countyNumber}", produces = "text/plain")
    public ResponseEntity<String> getCountyName(@PathVariable String countyNumber) {
        String countyName = countyService.getCountyName(countyNumber);

        if (countyName == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(countyName);
    }
}