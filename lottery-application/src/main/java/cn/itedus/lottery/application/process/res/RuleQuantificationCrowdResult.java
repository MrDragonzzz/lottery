package cn.itedus.lottery.application.process.res;

import cn.itedus.lottery.common.Result;

/**
 * @description:
 * @author: 龙嘉翼
 * @Date: 2023/4/8
 */
public class RuleQuantificationCrowdResult extends Result {
    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
