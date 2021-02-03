package com.fet.estore.batch;

import org.springframework.batch.item.ItemProcessor;


/*
 * 將字串轉為大寫
 * */
public class Processor implements ItemProcessor<String, String> {
	@Override
	public String process(String data) throws Exception {
		return data.toUpperCase();
	}
}