package priv.kira.springcloudtest.springboottest.jpatest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.kira.springcloudtest.springboottest.jpatest.entity.DemoTest;
import priv.kira.springcloudtest.springboottest.jpatest.repository.DemoTestRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DemoTestService {

    @Autowired
    private DemoTestRepository demoTestRepository;

    public DemoTest getById(Long id){
        return demoTestRepository.findById(id).orElse(null);
    }

    @Transactional
    public List<DemoTest> transactiontest(){
        List<DemoTest> list=new ArrayList<>();

        DemoTest dt1=new DemoTest();
        dt1.setName("trainsactiontest--aa-1");
        dt1.setCreateDatetime(new Date());
        dt1.setActive(false);
        demoTestRepository.save(dt1);
        list.add(dt1);

        DemoTest dt2=new DemoTest();
        dt2.setName("trainsactiontest--bb-2");
        dt2.setCreateDatetime(new Date());
        dt2.setActive(false);
        demoTestRepository.save(dt2);
        list.add(dt2);

        //throw new RuntimeException("抛出运行时异常");

        return list;
    }

    @Transactional
    public DemoTest transactiontest2(){
        Optional<DemoTest> demoTest=demoTestRepository.findById(1L);

        demoTest.ifPresent(dt->dt.setName("transactiontest--gg2"));

        return demoTest.orElse(null);
    }

}
