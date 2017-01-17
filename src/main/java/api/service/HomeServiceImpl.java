package api.service;

import api.entity.HomePage;
import api.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeRepository repository;

    @Override
    public HomePage save(HomePage page) {
        return repository.save(page);
    }
}
