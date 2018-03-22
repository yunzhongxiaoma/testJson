package com.baizhi.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import com.baizhi.bean.Address;
import com.baizhi.bean.User;
import com.google.gson.Gson;

public class TestGson {
    // 对象转json
    @Test
    public void testBean() {
        User u = new User("zhangsan", "123456", 18, null);
        Gson gson = new Gson();
        String json = gson.toJson(u);
        System.out.println(json.toString());
    }

    // 内嵌对象转json
    @Test
    public void testNeiQianBean() {
        User u = new User("zhangsan", "123456", 18, null);
        Address address = new Address("北京", "中关村");
        u.setAddress(address);
        Gson gson = new Gson();
        String json = gson.toJson(u);
        System.out.println(json.toString());
    }

    // Map对象转json
    @Test
    public void testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "小黄");
        map.put(2, "小黑");
        Gson gson = new Gson();
        String json = gson.toJson(map);
        System.out.println(json.toString());
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
        Gson gson = new Gson();
        String json = gson.toJson(set);
        System.out.println(json.toString());
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
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json.toString());
    }
}
