package top.year21.computerstore.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @description: 支付宝沙箱支付配置类
 */
@Data
@Component
public class AlipayConfig {
    //自己的appId
    public static String appId = "2021000122636422";
    //应用私有秘钥
    public static String appPrivateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDAIiQIdfb7i1jzqHtyerIEwRL24d2j+NWBZSOOisrJaFvrGeeZGjO97uv1R2cc0aOWtaqzvaN3/5+v8qbGE3n0MxwAGcp1TtHImGfZOCYk5MUyWiE+YYgn/MlZZHNX4bk9Zx7IL9X0IjohOdmnIex+KV5120B9pANht6jR+hROtEE0FMe7Qrx1m+LCJWlJt7X/XjgwKrptSKf62vQuBJgNZLOV7HzLzcanvahEHp+f14zRPWVlPxF+nKmeAgq62UPN3eMjsR/xvyDW1xy3e5H+UYAE+gyRtwIlwhha2al0WHdFxwtCLEhum1W+tcMN9MWLf1XNvUY9c8WE0In2G7ahAgMBAAECggEAI2Zm8zQg9InhMsupKxeWMzALuXc2Kh8P345t9bZ21JMo1HFqbZgZTnZ1/TRRuEqb9Im2UPWw58wudPGlbrtp7ed40j/uQJzsJCSIhcpFpOiNuNBIbcD0oEGAK7tJUTjis4CLeGDv79JamYKaKqQiecBPijGCeWO9x8RaE44bLcDQLTK3569635CXE2BQc9DNRvGLXgwvphb2tf1l/4dkfccK3/SUNlWsSvotI2KKu/Cr1wE1ryLvW6xgCRO31Cods/Ai4vTBxFlWGK7cfPt1YpDEGesuW/3Y5oWecthhKdhEPXGyvl/D8ARUqy+PX3iltlFihcv7PHicUpoqgiyvXQKBgQD6JVj7nzxmTa02x9fMltwsZgNPdS3jpm0yBm9KQgJrgRumiEBOMJuiKoHubiKC+Z9fljKWVFU2fWR48R//Vy/98pb0+4I8M/83Uct3U4n01aXzCW0aUxaNqykbQCZHTRt8oO356V7/0lWXizrd0PuACKVqZgrJGbqteyceYB4U4wKBgQDEoTvI1gLuvMYEJxeeAqbvr7nMI5+KYmUO8OCxTSR0kEfvSZkDUOOvqKnyUv3eem5e48y9St0KKejXc+ESPVo9LywSk/nJk7+l+TSqgMycVN7ijkv1t8j+RsWTHIyAO4StsOmZtYYFYyFpUr8WMLKwqS4nYNwgZcRQQgDUNGuhqwKBgBi5xFfq33+FQg/eJRiV+OFym/UosgaEltqRBEMkzzRtKJyHb0PLTjbzWLCGtmaX4gcCw7FUWK/wKRRDUVRd++JwLje8/JySzzFapm//E+3diG/DiMNHXz1Vo9SLvLzjhEoHZj6DsN48njVCj+kJFTMMp70ipQJHxsoLGEzKV27dAoGAYeJl8Z/gS9q7tLuFPUrSscVH+ADP3kMHTf3JzVm6yTA+LzfzLTxqbDrJh3GbIdLO+PvsI1uOWA3u9LqiE8NpFcZS6Viy449iu4wolKyTr0tsvVnbJJJ+Q18V4hs3MmrurMzCLZu5ARuNOXJQ4AoUGm/OIxpL2vDuXonNAdaqsgsCgYBuXVTXSD3g5EniJuRbWl8jJ34S/6YH3rYSPwZt4c9jwqHVoP7FENyBhr8fvZ+AZBGTVB1jS6Q/XvsYgCEvyP+oZBQ5mwgeGxrL34BswufhYrWUtxy5QGt1hFwyVl/UgDi6pT1ZgSvXjwuuq9TGT4tBouTpI3bKop9WIlyCoBRbKw==";
    //支付宝公钥
    public static String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh+kVI8Yregq8X5A33mFOFiPgn+OkNPfi7jWZzQok3J1qtGT9o+d0a+dWNuiLCdOUHEF34ZpDNzqVjANIJ5268Zb0GnSY5KLqhb8bV2WrPVmJze20GYYp/0Xet/O0R5sXAb3JjJa44Rx7Qq97f8C83/UCPMtIoXtldrrcVEv5H8QpVKlE8dKhHxVf3o1dj8itlEuc3GdB4C7lmlN9IJeB/ouaz2We0EizCZ1+GSwxeUE/pGV5kRsBGtvEKbGVekePQtVE/IPYYUuCtLJBh5wV3iQY5Wb8DI6yousGPyk5OD0FurtUeJ6rSm38u+UY2UHrkBatGxzAuaR6CetVW75UmwIDAQAB";
    //异步回调地址
    public static String notifyUrl = "http://1.14.176.219:8080/alipay/notifyNotice";
    //同步回调地址
    public static String returnUrl = "http://1.14.176.219:8080/alipay/returnNotice";
    //推荐使用这个秘钥
    public static String signType = "RSA2";
    //使用的编码格式
    public static String charset = "utf-8";
    //支付宝默认网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

}
