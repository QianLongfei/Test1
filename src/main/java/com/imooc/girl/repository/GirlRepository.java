package com.imooc.girl.repository;

import com.imooc.girl.domain.Girl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.util.List;

public interface GirlRepository extends JpaRepositoriesAutoConfiguration<Girl,Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);


}
