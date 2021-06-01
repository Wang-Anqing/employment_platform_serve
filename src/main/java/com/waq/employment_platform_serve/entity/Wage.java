package com.waq.employment_platform_serve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Wage implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 薪资分享主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 公司id
     */
      private Integer companyId;
  /**
   * 公司名称
   */
  private String companyName;
      /**
     * 工作名称
     */
      private String jobName;

      /**
     * 薪资内容
     */
      private String account;

      /**
     * 发布时间
     */
      private LocalDate submitDate;


}
