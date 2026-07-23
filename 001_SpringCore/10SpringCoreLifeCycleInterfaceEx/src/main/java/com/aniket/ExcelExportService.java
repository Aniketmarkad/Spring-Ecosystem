package com.aniket;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

	@Component("eobj")
	public class ExcelExportService 
	{

		@Value("Sample")
		private String fileName;
		 
		@Value("CSV FORMAT")
		private String mode;
		
		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		@PostConstruct
		public void setup() throws Exception 
		{
			System.out.println("FROM INIT METHOD");
		}
		
		@PreDestroy
		public void clean() throws Exception 
		{
			System.out.println("FROM DESTORY METHOD");
		}

		
		@Override
		public String toString() 
		{
			return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
		}
		
		
	}


