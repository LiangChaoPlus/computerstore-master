package top.year21.computerstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 对应数据表t_dict_district的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    private Integer id;
    private String parent;
    private String code;
    private String name;

}
