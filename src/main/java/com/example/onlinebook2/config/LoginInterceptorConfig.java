package com.example.onlinebook2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import com.example.onlinebook2.interceptor.LoginInterceptor;

@Configuration
public class LoginInterceptorConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 将上面自定义好的拦截器添加进去。
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api/**").excludePathPatterns("/api/login").excludePathPatterns("/api/register");
        super.addInterceptors(registry);
    }

}
