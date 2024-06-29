package com.shingle.cxf.response;

import com.shingle.cxf.bo.UserBo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class UserResponse extends BaseResponse<UserBo>{

}
