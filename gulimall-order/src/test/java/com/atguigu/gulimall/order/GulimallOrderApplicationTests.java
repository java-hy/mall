package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallOrderApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void contextLoads() {
/*        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setReceiverName("黄耀");
        orderEntity.setReceiverPhone("15632157538");
        orderService.save(orderEntity);
        System.out.println("保存成功");*/

/*        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(1L);
        orderEntity.setReceiverName("黄耀");
        orderService.updateById(orderEntity);
        System.out.println("修改成功");*/


    }

}
