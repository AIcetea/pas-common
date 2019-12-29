package com.tarotdt.pas.common.support;

/**
 * 微信订单状态码
 *  订单状态：
 * 101 订单生成，未支付；
 * 102，下单后未支付用户取消；
 * 103，下单后未支付超时系统自动取消
 *
 * 201 支付完成，商家未发货；
 * 202，订单生产，已付款未发货，但是退款取消；
 *
 * 301 商家发货，用户未确认；
 *
 * 401 用户确认收货，订单结束；
 * 402 用户没有确认收货，但是快递反馈已收获后，超过一定时间，系统自动确认收货，订单结束。
 *
 * 状态码所对应的业务
 * 当101用户未付款时，此时用户可以进行的操作是取消订单，或者付款操作
 * 当201支付完成而商家未发货时，此时用户可以取消订单并申请退款
 * 当301商家已发货时，此时用户可以有确认收货的操作
 * 当401用户确认收货以后，此时用户可以进行的操作是删除订单，评价商品，或者再次购买
 * 当402系统自动确认收货以后，此时用户可以删除订单，评价商品，或者再次购买
 */
public enum  OrderCode {
    /** 101 订单生成，未支付 */
    Generating_Order(101),
    /** 102，下单后未支付用户取消 */
    Unfinished_Order(102),
    /** 下单后未支付超时系统自动取消（超时订单） */
    Timeout_Order(103),
    /** 支付完成，商家未发货 (待发货)*/
    Pending_Delivery(201),
    /** 订单生产，已付款未发货，但是退款取消 */
    Unwanted_Order(202),
    /** 商家发货，用户未确认(已经发货) */
    Already_Shipped(301),
    /** 用户确认收货，订单结束 */
    User_Confirmation(401),
    /** 用户没有确认收货，但是快递反馈已收获后，超过一定时间，系统自动确认收货，订单结束 */
    Express_Confirmation(402);

    private final Integer value;

    private OrderCode(Integer value) {
        this.value = value;
    }

    /**
     * Return the integer value of this status code.
     */
    public Integer value() {
        return this.value;
    }

    public String toString() {
        return this.value.toString();
    }
}
