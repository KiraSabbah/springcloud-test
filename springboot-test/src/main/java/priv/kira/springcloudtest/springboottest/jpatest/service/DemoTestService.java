package priv.kira.springcloudtest.springboottest.jpatest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.kira.springcloudtest.springboottest.jpatest.entity.DemoTest;
import priv.kira.springcloudtest.springboottest.jpatest.repository.DemoTestRepository;

@Service
public class DemoTestService {

    @Autowired
    private DemoTestRepository demoTestRepository;

    public DemoTest getById(Long id){
        return demoTestRepository.findById(id).orElse(null);
    }

}
