package com.ctrip.framework.apollo.portal;

import com.ctrip.framework.apollo.common.ApolloCommonConfig;
import com.ctrip.framework.apollo.openapi.PortalOpenApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackageClasses = {ApolloCommonConfig.class,
        PortalApplication.class, PortalOpenApiConfig.class})
public class PortalApplication {

    /**
     * User
     * Apollo portal用户
     * UserRole
     * 用户和角色的关系
     * Role
     * 角色
     * RolePermission
     * 角色和权限的关系
     * Permission
     * 权限
     * 对应到具体的实体资源和操作，如修改NamespaceA的配置，发布NamespaceB的配置等。
     * Consumer
     * 第三方应用
     * ConsumerToken
     * 发给第三方应用的token
     * ConsumerRole
     * 第三方应用和角色的关系
     * ConsumerAudit
     * 第三方应用访问审计
     *
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PortalApplication.class, args);
    }
}
