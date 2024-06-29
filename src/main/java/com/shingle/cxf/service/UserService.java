package com.shingle.cxf.service;

import com.shingle.cxf.bo.UserBo;
import com.shingle.cxf.request.UserQueryParam;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "UserService")
public interface UserService {



    UserBo getUserById(@WebParam(name = "id") Long id);


    UserBo queryUserByParam(@WebParam(name = "param") UserQueryParam param);
}
