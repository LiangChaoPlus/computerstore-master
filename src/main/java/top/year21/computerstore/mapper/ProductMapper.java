package top.year21.computerstore.mapper;

import top.year21.computerstore.entity.Product;

import java.util.List;

/**
 * @description: 实体类Product对应的mapper接口
 */
public interface ProductMapper {

    /**
     * Description : 查询优先权前五的商品进行展示
     * @return java.util.List<top.year21.computerstore.entity.Product>
     **/
    List<Product> queryPriorityProduct();

    /**
     * Description : 查询最新上架的商品进行展示
     * @return java.util.List<top.year21.computerstore.entity.Product>
     **/
    List<Product> queryTheNewProduct();

    /**
     * Description : 根据指定商品id进行商品查询
     * @param id 商品id
     * @return top.year21.computerstore.entity.Product
     **/
    Product queryProductById(Integer id);

    /**
     * Description : 根据指定的名称关键字进行模糊查询
     * @param title 要查询的商品名称关键字
     * @return java.util.List<top.year21.computerstore.entity.Product>
     **/
    List<Product> queryProductByTitle(String title);
}
