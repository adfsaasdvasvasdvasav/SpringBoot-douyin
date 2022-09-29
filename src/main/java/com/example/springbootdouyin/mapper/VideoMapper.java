package com.example.springbootdouyin.mapper;

import com.example.springbootdouyin.entity.Video;

import java.util.List;

/**
* @author GW00319035
* @description 针对表【video】的数据库操作Mapper
* @createDate 2022-09-22 16:30:47
* @Entity com.example.springbootdouyin.entity.Video
*/
public interface VideoMapper {

    //编写一个查询数据的方法

    public List<Video> queryList();          //返回的是抖音集合列表，list中的对象，
                                     // 就是我们的视频对象video,是刚才生成的类
                                //只说话不办事，那谁去做呢，交给红鸟来做；光标放在queryList身上，Alt+enter
                        //创建语句查询语句。

}




