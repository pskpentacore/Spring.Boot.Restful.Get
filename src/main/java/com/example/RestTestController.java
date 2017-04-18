package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getData")
public class RestTestController {
	/*private List<String> dataList = new ArrayList<String>(Arrays.asList("Spring", "Rest", "SRC"));
	private List<String> keyList = new ArrayList<String>(Arrays.asList("Test1", "Test2", "Test3"));*/
	
	@RequestMapping(method=RequestMethod.GET)
	public Data getData(
			@RequestParam(value="id", required=false, defaultValue="0") Integer id,
			@RequestParam(value="key", required=false, defaultValue="No value") String value){
		Data data =  new Data(id, value);
		return data;
	}
}
