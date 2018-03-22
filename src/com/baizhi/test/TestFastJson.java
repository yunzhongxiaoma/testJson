package com.baizhi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.baizhi.bean.Address;
import com.baizhi.bean.User;

public class TestFastJson {
    // 对象转json串
    @Test
    public void testBean() {
        User u = new User("zhangsan", "123456", 18, null);
        
        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString.toString());
    }
    

    // 内嵌对象转json
    @Test
    public void testNeiQianBean() {
        User u = new User("zhangsan", "123456", 18, null);
        Address address = new Address("北京", "中关村");
        u.setAddress(address);

        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString.toString());
    }

    // Map对象转json
    @Test
    public void testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "小黄");
        map.put(2, "小黑");

        String jsonString = JSON.toJSONString(map);
        System.out.println(jsonString.toString());
    }

    // Set集合对象转Json
    @Test
    public void testSet() {
        HashSet<User> set = new HashSet<>();
        User u = new User("zhangsan", "123456", 18, null);
        User u1 = new User("zhangsan1", "123456", 18, null);
        User u2 = new User("zhangsan2", "123456", 18, null);
        set.add(u);
        set.add(u1);
        set.add(u2);

        String jsonString = JSON.toJSONString(set);
        System.out.println(jsonString.toString());
    }
    
    // list集合对象转json
    @Test
    public void testList() {
        User u = new User("zhangsan", "123456", 18, null);
        User u1 = new User("zhangsan1", "123456", 18, null);
        User u2 = new User("zhangsan2", "123456", 18, null);
        ArrayList<User> list = new ArrayList<User>();
        list.add(u);
        list.add(u1);
        list.add(u2);

        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString.toString());
    }
}
