package com.example.lwp.swagger2.swagger2authdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger2添加全局参数
 * @author lanwp
 * @Date 2019/9/17 7:53
 */
//@Configuration
//@EnableSwagger2
//@EnableSwaggerBootstrapUI
public class Swagger2GlobalParametersConfig {

    @Bean
    public Docket createRestApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .pathMapping("/")
                .globalOperationParameters(getGlobalOperationParameters())
                .select()
                // 指定当前包路径，这里就添加了两个包，注意方法变成了basePackage，中间加上成员变量splitor
                .apis(RequestHandlerSelectors.basePackage("com.example.lwp.swagger2.swagger2authdemo.controller"))
                .paths(PathSelectors.any())
                .build()
                ;
        return docket;
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot整合Swagger")
                .description("SpringBoot整合Swagger，详细信息......")
                .version("9.0")
                .contact(new Contact("张三", "blog.csdn.net", "zhangsan@gmail.com"))
                .contact(new Contact("李四", "blog.csdn.net", "zhangsan@gmail.com"))
//                        .license("The Apache License")
//                        .licenseUrl("http://www.baidu.com")
                .build();
    }

    /*private List<Parameter> getGlobalOperationParameters() {
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder.name("X-Auth-Token").description("token").modelRef(new ModelRef("string")).parameterType("header").required(false);
        pars.add(parameterBuilder.build());
        parameterBuilder.name("X-userid").description("用户id").modelRef(new ModelRef("int")).parameterType("query").required(false);
        pars.add(parameterBuilder.build());
        parameterBuilder.name("X-name").description("用户名").modelRef(new ModelRef("string")).parameterType("cookie").required(false);
        pars.add(parameterBuilder.build());
        return pars;
    }*/

    private List<Parameter> getGlobalOperationParameters() {
        List<Parameter> pars = new ArrayList<>();
        addGlobalOperationParameter(pars, "X-Auth-Token","token", "string", "header", false);
        addGlobalOperationParameter(pars, "X-userid","用户id", "int", "query", false);
        addGlobalOperationParameter(pars, "X-name","用户名", "string", "cookie", false);
        return pars;
    }

    /**
     *
     * @param pars
     * @param name
     * @param description
     * @param modelRefType
     * @param parameterType
     * @param required
     */
    private void addGlobalOperationParameter(List<Parameter> pars, String name, String description, String modelRefType, String parameterType, boolean required) {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        // header query cookie
        parameterBuilder.name(name).description(description).modelRef(new ModelRef(modelRefType)).parameterType(parameterType).required(required);
        pars.add(parameterBuilder.build());
    }
}
