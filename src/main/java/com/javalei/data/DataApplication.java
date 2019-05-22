package com.javalei.data;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.dynamic.DynamicGecco;
import com.geccocrawler.gecco.spring.SpringGeccoEngine;
import com.geccocrawler.gecco.spring.SpringPipelineFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class DataApplication {
	@Bean
	public SpringPipelineFactory springPipelineFactory() {
		return new SpringPipelineFactory();
	}

	@Bean
	public SpringGeccoEngine initGecco() {
		return new SpringGeccoEngine() {
			@Override
			public void init() {

//				DynamicGecco.html()
//						.gecco("http://www.zuanke8.com/forum-15-1.html", "consolePipeline")
//						.requestField("request").request().build().
//				listField("tiezi",String.class).csspath(".new").build()
//
//
//						.register();
//						.stringField("project").requestParameter().build()
//						.stringField("title").csspath(".repository-meta-content").text(false).build()
//						.intField("star").csspath(".pagehead-actions li:nth-child(2) .social-count").text(false).build()
//						.intField("fork").csspath(".pagehead-actions li:nth-child(3) .social-count").text().build()
//						.stringField("contributors").csspath("ul.numbers-summary > li:nth-child(4) > a").href().build()
//						.register();

				GeccoEngine.create()
						.pipelineFactory(springPipelineFactory)
						.classpath("com.javalei.data")
						.start("http://www.zuanke8.com/forum-15-1.html")
						.start();
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}

}
