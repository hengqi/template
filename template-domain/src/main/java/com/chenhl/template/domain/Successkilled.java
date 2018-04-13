package com.chenhl.template.domain;

import java.util.Date;

public class Successkilled extends SuccesskilledKey {
    private Byte seckillState;

    private Date createTime;

    //多对一
    private Seckill seckill;

    public Byte getSeckillState() {
        return seckillState;
    }

    public void setSeckillState(Byte seckillState) {
        this.seckillState = seckillState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}