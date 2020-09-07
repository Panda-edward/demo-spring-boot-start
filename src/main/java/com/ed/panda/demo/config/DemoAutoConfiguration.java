package com.ed.panda.demo.config;

import com.ed.panda.demo.component.ClusterComponent;
import com.ed.panda.demo.properties.ClusterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Edward
 * @date : 2020/9/7 上午11:27
 * spring配置类,实现需要IDC类的spring托管
 */
@Configuration
/** 条件成立,该配置才会生效,否则跳过（不会抛出异常） */
@ConditionalOnClass(com.alibaba.druid.pool.DruidDataSource.class)
@EnableConfigurationProperties(ClusterProperties.class)
public class DemoAutoConfiguration {

    @Autowired
    ClusterProperties clusterProperties;

    /**
     * spring托管clusterComponent
     */
    @Bean
    public ClusterComponent clusterComponent() {
        ClusterComponent component = new ClusterComponent();
        component.setClusterProperties(clusterProperties);
        return component;
    }

}
