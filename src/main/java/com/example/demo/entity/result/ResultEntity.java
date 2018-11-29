package com.example.demo.entity.result;

import java.io.Serializable;

public class ResultEntity implements Serializable {

    private static final long serialVersionUID = 3401781428101852075L;

    /**
     * 接口请求处理结果
     * 成功true，失败-false
     */
    private Boolean success;

    /**
     * 处理结果信息
     */
    private String errorMsg;

    /**
     * 返回数据对象
     */
    private Object object;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ResultEntity(Boolean success, String errorMsg, Object object) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.object = object;
    }
}
