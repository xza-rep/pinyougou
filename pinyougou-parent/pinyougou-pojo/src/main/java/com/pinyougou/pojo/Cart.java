package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author xza
 * @date 2018/12/20 15:15
 */
public class Cart implements Serializable{
    private String sellerId;//商家 ID
    private String sellerName;//商家名称

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public List<TbOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<TbOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    private List<TbOrderItem> orderItemList;//购物车明细
}
