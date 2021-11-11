package com.wzf.cloud.controller;

import com.wzf.cloud.service.OrderService;
import com.wzf.cloud.domain.CommonResult;
import com.wzf.cloud.domain.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(description = "订单管理", tags = "OrderController")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ApiOperation("添加订单")
    @PostMapping("/create")
    public CommonResult create(@RequestBody Order order) {
        orderService.create(order);
        return new CommonResult("操作成功", 200);
    }

    @ApiOperation("根据ID获取订单")
    @GetMapping("/{id}")
    public CommonResult<Order> getUser(@PathVariable Long id) {
        Order order = orderService.getOrder(id);
        return new CommonResult<>(order);
    }

    @ApiOperation("修改订单")
    @PostMapping("/update")
    public CommonResult update(@RequestBody Order order) {
        orderService.update(order);
        return new CommonResult("操作成功", 200);
    }

    @ApiOperation("根据ID删除订单")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        orderService.delete(id);
        return new CommonResult("操作成功", 200);
    }
}
