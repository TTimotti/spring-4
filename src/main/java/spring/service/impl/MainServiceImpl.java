package spring.service.impl;

import org.springframework.stereotype.Service;
import spring.service.MainService;

@Service
public class MainServiceImpl implements MainService {
    public String hello(String name) {
        return "Hello! " + name;
    }
}
