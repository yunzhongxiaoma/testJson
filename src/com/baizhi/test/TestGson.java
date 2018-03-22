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
    // ����תjson
    @Test
    public void testBean() {
        User u = new User("zhangsan", "123456", 18, null);
        Gson gson = new Gson();
        String json = gson.toJson(u);
        System.out.println(json.toString());
    }

    // ��Ƕ����תjson
    @Test
    public void testNeiQianBean() {
        User u = new User("zhangsan", "123456", 18, null);
        Address address = new Address("����", "�йش�");
        u.setAddress(address);
        Gson gson = new Gson();
        String json = gson.toJson(u);
        System.out.println(json.toString());
    }

    // Map����תjson
    @Test
    public void testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "С��");
        map.put(2, "С��");
        Gson gson = new Gson();
        String json = gson.toJson(map);
        System.out.println(json.toString());
    }

    // Set���϶���תJson
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
    
    // list���϶���תjson
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
