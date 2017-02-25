package com.hpe.my.model.entiy;

import java.io.Serializable;

/**
 * Created by BaiRu on 2016/12/27.
 */
public class UserInfo implements Serializable {

    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
