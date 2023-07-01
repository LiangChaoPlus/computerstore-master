package top.year21.computerstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 对应数据表t_favorites的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorites {
    private Integer fid;
    private Integer uid;
    private Integer pid;
    private String image;
    private Long price;
    private String title;
    private String sellPoint;
    private Integer status;
}
