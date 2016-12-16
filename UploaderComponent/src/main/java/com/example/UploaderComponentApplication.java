package com.example;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.models.ImageRepository;

@SpringBootApplication
public class UploaderComponentApplication {

	@Bean
	InitializingBean saveDataAtStartup(ImageRepository repository){
		
		return ()->{
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);			
		};
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UploaderComponentApplication.class, args);
	}
}
