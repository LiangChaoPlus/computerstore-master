package top.year21.computerstore.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: 多表查询结果集映射的值对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVo {
    private Integer oid;
    private Integer aid;
    private String recvName;
    private String zip;
    private String phone;
    private String provinceName;
    private String cityName;
    private String areaName;
    private String address;
    private Long totalPrice;
    private Integer status;
    private Date orderTime;
    private Date payTime;
    private String image;
    private String title;
    private Long price;
    private Integer num;
}
