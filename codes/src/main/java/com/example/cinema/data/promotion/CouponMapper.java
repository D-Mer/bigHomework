package com.example.cinema.data.promotion;

import com.example.cinema.po.Coupon;
import com.example.cinema.po.VIPCostInfo;
import com.example.cinema.vo.SendCouponForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liying on 2019/4/17.
 */
@Mapper
public interface CouponMapper {

    int insertCoupon(Coupon coupon);

    List<Coupon> selectCouponByUser(int userId);

    Coupon selectById(int id);

    void insertCouponUser(@Param("couponId") int couponId,@Param("userId")int userId);

    void deleteCouponUser(@Param("couponId") int couponId,@Param("userId")int userId);

    List<Coupon> selectCouponByUserAndAmount(@Param("userId") int userId,@Param("amount") double amount);

    List<VIPCostInfo> selectByCost(@Param("target_amount") double target_amount);

    List<Coupon> selectCoupon();

    void sendCoupon(List<SendCouponForm> sendCouponFormList);
}
