package com.spring.config;

import com.yuantu.common.sms.SMSUtilService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Data
public class ConfigHelperDemo {

    @Value("${config.reids.redisServerHost}")
    private String redisServerHost;
    @Value("${config.reids.redisServerPort}")
    private String redisServerPort;
    @Value("${config.reids.redisServerUser}")
    private String redisServerUser;
    @Value("${config.corp.corpIdAndNoProxy}")
    //机构id不确定,需要映射
    private String corpIdAndNoProxy;
    @Value("${config.corp.corpIdAndIdProxy}")
    //机构id不确定,需要映射
    private String corpIdAndIdProxy;
    @Value("${config.reids.redisServerPassword}")
    private String redisServerPassword;
    @Value("${config.reids.corpRemoteOpers}")
    private String corpRemoteOpers;
    @Value("${config.corp.serviceLogNotSaveWord}")
    private String serviceLogNotSaveWord;
    @Value("${config.env}")
    private String env;
    /**
     * 服务稳定性topic
     */
    @Value("${config.kafka.serviceTopic}")
    private String serviceTopic;

    // --------------------------短信配置-------------------
    @Value("${msg.provider}")
    private String provider;
    @Value("${msg.account}")
    private String account;
    @Value("${msg.pswd}")
    private String pswd;
    @Value("${msg.product}")
    private String product;
    @Value("${msg.sendAddress}")
    private String sendAddress;
    @Value("${msg.smsParam}")
    private String smsParam;
    @Value("${msg.needStatus}")
    private String needstatus;
    @Value("${msg.extno}")
    private String extno;
    @Value("${msg.accountApplyContact}")
    private String accountApplyContact;

    @Bean
    public SMSUtilService getSmsUtilService(){
        return new SMSUtilService();
    }

}
