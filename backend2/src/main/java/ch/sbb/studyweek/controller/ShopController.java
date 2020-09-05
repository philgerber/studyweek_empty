package ch.sbb.studyweek.controller;


import ch.sbb.studyweek.model.Shop;
import ch.sbb.studyweek.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ShopController {


    private final ShopService shopService;

    @GetMapping("/shops")
    public ResponseEntity<List<Shop>> findAll() {
        return ResponseEntity.ok(shopService.findAll());
    }


}
