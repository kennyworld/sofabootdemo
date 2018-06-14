package com.example.demoprovider.service.impl;

import com.example.demoprovider.service.HelloSyncService;

/**
 * @author : liu.jf
 * @version : 1.0
 * @description :
 * @projectName : sofabootdemo
 * @createTime : 2018/6/7 13:55
 */
public class HelloSyncServiceImpl implements HelloSyncService
{
	@Override
	public String saySync(String string) {
		return "provider tell you : this is your say: " +  string;
	}
}
