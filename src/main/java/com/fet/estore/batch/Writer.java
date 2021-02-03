package com.fet.estore.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;


/*
 * 把轉為大寫的字串輸出到控制檯
 * */
public class Writer implements ItemWriter<String> {
	@Override
	public void write(List<? extends String> messages) throws Exception {
		for (String msg : messages) {
			System.out.println("Writing the data " + msg);
		}
	}
}