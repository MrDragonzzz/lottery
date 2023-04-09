package cn.itedus.lottery.domain.rule.service.engine;

import cn.itedus.lottery.domain.rule.service.logic.LogicFilter;
import cn.itedus.lottery.domain.rule.service.logic.impl.UserAgeFilter;
import cn.itedus.lottery.domain.rule.service.logic.impl.UserGenderFilter;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:规则配置
 * @author: 龙嘉翼
 * @Date: 2023/4/8
 */
public class EngineConfig {
    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserGenderFilter userGenderFilter;
    @Resource
    private UserAgeFilter userAgeFilter;

    @PostConstruct
    public void init(){
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }
}
