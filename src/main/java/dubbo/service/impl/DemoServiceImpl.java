package dubbo.service.impl;

import dubbo.bean.User;
import dubbo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/21 0021.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("jack");
        u1.setAge(20);
        u1.setSex("��");

        User u2 = new User();
        u2.setName("tom");
        u2.setAge(21);
        u2.setSex("Ů");

        User u3 = new User();
        u3.setName("rose");
        u3.setAge(19);
        u3.setSex("Ů");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
