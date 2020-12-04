package com.moofa.course.server.mapper;


import com.moofa.course.server.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    public List<Test> list();
}
