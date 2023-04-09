package cn.itedus.lottery.domain.rule.repository;

import cn.itedus.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @description:规则信息仓储服务接口
 * @author: 龙嘉翼
 * @Date: 2023/4/8
 */
public interface IRuleRepository {
    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);
}