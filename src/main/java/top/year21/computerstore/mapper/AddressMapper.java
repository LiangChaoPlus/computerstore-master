package top.year21.computerstore.mapper;

import top.year21.computerstore.entity.Address;

import java.util.Date;
import java.util.List;

/**
 * @description: Address实体类对应的mapper接口
 */
public interface AddressMapper {

    /**
     * Description : 添加用户地址
     * @param address 用户地址信息
     * @return int
     **/
    int addAddress(Address address);

    /**
     * Description : 查询用户地址条目数
     * @param uid 用户地址id
     * @return int
     **/




















    int userAddressCount(Integer uid);

    /**
     * Description : 查询用户id所有地址记录
     * @param uid 用户id
     * @return java.util.List<top.year21.computerstore.entity.Address>
     **/
    List<Address> queryUserAddress(Integer uid);

    /**
     * Description : 根据地址aid查询某条数据
     * @param aid 地址的aid
     * @return top.year21.computerstore.entity.Address
     **/
    Address queryUserAddressByAid(Integer aid);

    /**
     * Description : 根据用户uid将其关联的地址设置为非默认值
     * @param uid 用户uid
     * @return int
     **/
    int setAllAddressNotDefault(Integer uid);

    /**
     * Description : 根据地址aid将某条地址设为默认值
     * @param aid 地址aid
     * @param modifiedUser 修改者
     * @param modifiedTime 修改时间
     * @return int
     **/
    int setOneAddressDefault(Integer aid,String modifiedUser, Date modifiedTime);

    /**
     * Description : 根据地址aid删除指定时间
     * @param aid 地址aid
     * @param modifiedUser 修改者
     * @param modifiedTime 修改时间
     * @return int
     **/
    int deleteAddressByAid(Integer aid,String modifiedUser, Date modifiedTime);

    /**
     * Description : 根据aid修改用户信息
     * @param address 更新的用户地址信息
     * @return int
     **/
    int updateUserAddressByAid(Address address);

}
