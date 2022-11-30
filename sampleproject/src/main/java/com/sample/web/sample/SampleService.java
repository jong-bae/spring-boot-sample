package com.sample.web.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired private SampleMapper sampleMapper;
	
	public SampleVO getToday() {
		return sampleMapper.testToday();
	}
	
	public SampleVO getToday2() {
		return sampleMapper.anoToday();
	}
}
