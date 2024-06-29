package com.shingle.cxf.service.impl;

import com.shingle.cxf.bo.UserBo;
import com.shingle.cxf.request.UserQueryParam;
import com.shingle.cxf.service.UserService;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "UserService", endpointInterface = "com.shingle.cxf.service.UserService")
public class UserServiceImpl implements UserService {

    private static final List<UserBo> USER_DATA_BASE = new ArrayList<>();

    static {
        UserBo userBo = new UserBo();
        userBo.setId(1L);
        userBo.setName("shingle1");
        userBo.setSex("male");
        USER_DATA_BASE.add(userBo);
        UserBo userBo2 = new UserBo();
        userBo2.setId(2L);
        userBo2.setName("shingle2");
        userBo2.setSex("female");
        USER_DATA_BASE.add(userBo2);
    }

    @Override
    public UserBo getUserById(Long id) {
        return USER_DATA_BASE.stream().filter(userBo -> userBo.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public UserBo queryUserByParam(UserQueryParam param) {
        return USER_DATA_BASE.stream().filter(userBo -> userBo.getId().equals(param.getId())).findFirst().orElse(null);
    }

}
