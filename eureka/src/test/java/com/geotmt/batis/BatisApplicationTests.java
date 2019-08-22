package com.geotmt.batis;


import com.geotmt.eureka.TokenEurekaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TokenEurekaApplication.class)
@Transactional
@Rollback
public class BatisApplicationTests {

//    @Autowired
//    private MenuMapper menuMapper;

    @Test
    public void select() {
//        List<Menu> menus = menuMapper.selectAll();
//        menus.forEach(menu -> System.out.println(menu.getName()));
    }

}
