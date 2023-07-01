package top.year21.computerstore.service;

import com.github.pagehelper.PageInfo;
import top.year21.computerstore.entity.Favorites;


/**
 * @description: 处理收藏业务的业务层接口
 */
public interface IFavoritesService {

    //添加收藏商品的抽象方法
    int addFavorites(Integer uid,Integer pid);


    //查询收藏商品的抽象方法
    PageInfo<Favorites> queryFavorites(Integer uid, Integer pageNum, Integer pageSize,Integer status);

    //根据收藏商品fid和用户uid取消对应商品收藏的抽象方法
    int updateFavoritesStatus(Integer status,Integer fid,Integer uid);
}
