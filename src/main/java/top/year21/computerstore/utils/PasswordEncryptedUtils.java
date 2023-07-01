package top.year21.computerstore.utils;

import org.springframework.util.DigestUtils;

/**
 * @description: 处理密码加密的工具类
 */
public class PasswordEncryptedUtils {

    public static String getPasswordByMD5(String pwd,String salt){
        for (int i = 0; i < 3 ; i++) {
            //md5加密算法的调用
            pwd =  DigestUtils.md5DigestAsHex((salt + pwd + salt).getBytes()).toUpperCase();
        }
        //返回经过加密的结果
        return pwd;
    }
}
