package com.spring.config;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author WeiMin
 * @desc nacos配置
 * @date 2020/7/31
 */
@Configuration
@PropertySource(value = { "classpath:config.properties" })
@EnableNacosDiscovery(globalProperties = @NacosProperties(serverAddr = "${nacos.registry.address}",namespace = "${nacos.registry.namespace}"))
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "${nacos.registry.address}",namespace = "${nacos.registry.namespace}"))
@NacosPropertySource(dataId = "app_config_init.properties", autoRefreshed = true)
@Slf4j
public class NacosConfiguration {

}
