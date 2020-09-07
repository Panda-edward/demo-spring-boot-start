package com.ed.panda.demo.component;

import com.ed.panda.demo.properties.ClusterProperties;

/**
 * @Author: Edward
 * @Date: 2020/9/7 上午11:43
 *
 * <p>
 * 示例组件
 * 获取当前集群节点name。
 */
public class ClusterComponent {

    ClusterProperties clusterProperties;

    public String getCurrentClusterName() {
        System.out.println("当前集群name===>" + clusterProperties.getName());
        return clusterProperties.getName();
    }

    public ClusterProperties getClusterProperties() {
        return clusterProperties;
    }

    public void setClusterProperties(ClusterProperties clusterProperties) {
        this.clusterProperties = clusterProperties;
    }
}
