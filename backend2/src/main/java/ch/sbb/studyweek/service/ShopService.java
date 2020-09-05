package ch.sbb.studyweek.service;

import ch.sbb.studyweek.model.Shop;
import ch.sbb.studyweek.repo.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepository shopRepository;

    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

}
