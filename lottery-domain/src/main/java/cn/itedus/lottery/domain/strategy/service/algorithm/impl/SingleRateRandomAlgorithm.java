package cn.itedus.lottery.domain.strategy.service.algorithm.impl;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:单项随机概率抽奖，抽到一个已经排掉的奖品则未中奖
 * @author: 龙嘉翼
 * @Date: 2023/4/6
 */

@Component("singleRateRandomDrawAlgorithm")
public class SingleRateRandomAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        String[] rateTuple = super.rateTupleMap.get(strategyId);
        assert  rateTuple!=null;

        int randomVal = this.generateSecureRandomIntCode(100);
        int idx = super.hashIdx(randomVal);

        String awardId= rateTuple[idx];
        if(excludeAwardIds.contains(awardId)){
            return null;
        }
        return awardId;
    }
}
