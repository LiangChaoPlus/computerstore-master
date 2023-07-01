package top.year21.computerstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: 对应数据表t_order的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity {
    private Integer oid;
    private Integer uid;
    private Integer aid;
    private String recvName;
    private String recvPhone;
    private String recvProvince;
    private String recvCity;
    private String recvArea;
    private String recvAddress;
    private Long totalPrice;
    private Integer status;
    private Date orderTime;
    private Date payTime;
}
