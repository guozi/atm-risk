package com.risk.controller.service.service;

import java.util.Map;

public interface ModelService {

    /**
     * 通过nid，或者类型，计算用户运营商数据
     *
     * @param nid
     * @param type
     */
    void verifyUserOperator(String nid, Integer type);

    /**
     * 训练模型
     */
    void modelLearn();

    /**
     * 保存所有运营商通话记录
     */
    void saveAllOperator(String nid);

    void saveAllOperator();

    /**
     * 查询最近10天主叫通话次数
     *
     * @param nid       订单号
     * @param applyTime 订单时间
     * @param day       最近天数
     * @param type      DIAL:主叫，DIALED被叫
     * @return
     */
    Map<String, Object> getCallNumByDay(String nid, Long applyTime, Integer day, String type);

    /**
     * 查询最近天数内互相通话次数和时长
     *
     * @param nid       订单号
     * @param applyTime 订单时间
     * @param day       最近天数
     * @return
     */
    Map<String, Object> getCallAndCalledByDay(String nid, Long applyTime, Integer day);
}
