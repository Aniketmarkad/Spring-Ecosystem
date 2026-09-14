package com.aniket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test2 {

	
		private static final Logger logger = LogManager.getLogger(Test2.class); 
		
		 public static void main(String[] args) {
				processData();
			 
	
			}
		 
		public static void processData()
		{
			logger.trace("FROM TRACE METHOD");
	        logger.debug("FROM DEBUG METHOD");
	        logger.info("FROM INFO METHOD");
	        logger.warn("FROM WARN METHOD");
	        logger.error("FROM ERROR METHOD");
	        logger.fatal("FROM FATAL METHOD");
			
		} 
}
