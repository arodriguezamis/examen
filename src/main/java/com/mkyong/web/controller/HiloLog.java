package com.mkyong.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiloLog implements Runnable {
	
	private final Logger logger = LoggerFactory.getLogger(HiloLog.class);

	public void run(){
		int x=0;
		while (true) {
			logger.debug("Llenando el log con informacion "+x++);		    
		}
	}
}