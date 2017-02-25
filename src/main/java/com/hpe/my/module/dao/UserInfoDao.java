package com.hpe.my.module.dao;

import com.hpe.my.model.entiy.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by BaiRu on 2016/12/27.
 */
@Repository
public interface UserInfoDao {

  UserInfo queryInfo();
}
