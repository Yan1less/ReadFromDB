package com.yan1less.readdb.mapper;

import com.yan1less.readdb.pojo.blogtext;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Yan1less
 * @Date 2019/4/24 17:27
 * @Description TODO
 **/
@Mapper
public interface MySQLMapper {

    public List<blogtext> selectAll();

}
