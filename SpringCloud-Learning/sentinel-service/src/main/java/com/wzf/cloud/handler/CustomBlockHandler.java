package com.wzf.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wzf.cloud.domain.CommonResult;


public class CustomBlockHandler {

    public CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}
