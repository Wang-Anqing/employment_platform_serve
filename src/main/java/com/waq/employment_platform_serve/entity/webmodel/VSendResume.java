package com.waq.employment_platform_serve.entity.webmodel;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class VSendResume implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户编号，标识用户唯一性的主键
     */
      private Integer jobseekerId;

      /**
     * 工作名称
     */
      private String jobName;

      /**
     * 公司名称
     */
      private String companyName;

      /**
     * 简历状态
0已投递 1已查看  2初筛  3笔试  4面试  5不合适  6录用
     */
      private Integer state;

      /**
     * 操作时间
     */
      private LocalDateTime operateDate;
      private String title;

}
