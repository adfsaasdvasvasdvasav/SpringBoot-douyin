package com.example.springbootdouyin.controller;
import com.example.springbootdouyin.entity.Video;
import com.example.springbootdouyin.mapper.VideoMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/*
* 控制器的角色（被Spring管理）
*  @Controller:  是属于普通控制器
   @RestController:  是前后端分离的控制器，用于构建restful风格接口的控制器，默认返回JSON。
   * 相当于@Controller和@reponsbody的整合
* */
@RestController
public class VideoController {

    @Resource  //原理就是给videoMapper赋值
     private VideoMapper videoMapper; //用蓝鸟来查，用框架查询，需要声明一个videoMapper

    //可以写多个请求的方法，一个模块的功能都写到一个控制器下。
    @RequestMapping("/test")   //具体前端用户可能写的一个地址,如果前端控制器访问test网址
                                // ，就会找到控制器中的Hellow方法，特定的请求会到指定的方法。
    public String hellow(){    //用来相应前端的请求
        return "你好，我是张三"; //给前端返回
    }

    //查询数据库数据的请求方法；
    @RequestMapping("/query")
    public List<Video> list(){
        //查询数据
        List<Video> videos = videoMapper.queryList();  //得到一个集合

        return videos;
    }

}
