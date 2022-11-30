package com.sample.web.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleMapper {
	
	public SampleVO testToday();
	
	@Select("SELECT GETDATE() AS today")
	public SampleVO anoToday();
}
