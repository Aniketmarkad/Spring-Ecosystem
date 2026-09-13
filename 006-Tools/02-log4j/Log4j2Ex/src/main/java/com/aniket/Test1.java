package com.aniket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {

	// private static final Logger log = LogManager.getLogger(Test.class);
	private static final Logger logger = LogManager.getLogger(Test1.class); 
	
	 public static void main(String[] args) {
			//processData();
		 
		    logger.trace("FROM TRACE METHOD");
	        logger.debug("FROM DEBUG METHOD");
	        logger.info("FROM INFO METHOD");
	        logger.warn("FROM WARN METHOD");
	        logger.error("FROM ERROR METHOD");
	        logger.fatal("FROM FATAL METHOD");
		}
	 
	/*public static void processData()
	{
		/*log.trace("FROM TRACE METHOD");
		log.warn("FROM WARN METHOD");
		log.debug("FROM DEBUG METHOD");
		log.error("FROM ERROR METHOD");
		log.info("FROM INFO METHOD");
		log.fatal("FROM FATAL METHOD");
		
		
	} */
}
    