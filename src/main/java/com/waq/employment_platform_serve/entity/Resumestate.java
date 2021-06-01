package com.waq.employment_platform_serve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Resumestate implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 简历投递状态id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 简历状态
0已投递 1已查看  2初筛  3笔试  4面试  5不合适  6录用
     */
      private Integer state;

      /**
     * 简历投递记录的id
     */
      private Integer resumeboxId;

      /**
     * 操作时间
     */
      private LocalDateTime operateDate;


}
