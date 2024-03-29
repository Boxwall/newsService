package com.news.configration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.news.interceptor.CheckLogin;

@Configuration
public class InterceptorConfig  extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry  registry) {
        registry.addInterceptor(new CheckLogin()).addPathPatterns("/*/*").excludePathPatterns("/login");
        super.addInterceptors(registry);
    }
}
