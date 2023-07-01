package top.year21.computerstore.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 多表查询结果集映射的值对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVo{
    private Integer cid;
    private Integer pid;
    private Integer uid;
    private Long price;
    private Integer num;
    private String title;
    private String image;
    private String realPrice;
}
