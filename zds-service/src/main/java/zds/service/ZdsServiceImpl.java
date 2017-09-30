package zds.service;

import zds.api.ZdsService;

public class ZdsServiceImpl implements ZdsService{
    public String hello(String name) {
        return "----" + name;
    }
}
