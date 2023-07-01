package top.year21.computerstore.utils;

import lombok.Data;

/**
 * @description: 响应数据
 */
@Data
public class JsonResult<E> {
    //响应状态码 200-成功 4000-用户名重复 5000-数据库或服务器异常
    private int status;
    //响应信息
    private String message;
    //响应数据
    private E data;

    public JsonResult() {
    }

    public JsonResult(int status) {
        this.status = status;
    }

    public JsonResult(Throwable e) {
        this.message = e.getMessage();
    }

    public JsonResult(int status, E data) {
        this.status = status;
        this.data = data;
    }
}
