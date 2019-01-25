package com.xzy.service.impl;

import com.xzy.dao.TestDao;
import com.xzy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public String selectById(int id) {
        return testDao.selectById(id);
    }
}
