package com.ed.panda.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : Edward
 * @date : 2020/9/7 上午11:51
 */
@ConfigurationProperties(prefix = "cluster")
public class ClusterProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
