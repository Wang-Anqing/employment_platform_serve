package com.waq.employment_platform_serve.entity.webmodel;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author WAQ
 * @since 2021-06-04
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class VCompanyReceiveResume implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 投递记录的主键
     */
      private Integer resumeboxId;

      /**
     * 简历的标题
     */
      private String title;

      /**
     * 求职者名称
     */
      private String name;

      /**
     * 投递公司的id
     */
      private Integer companyId;

      /**
     * 工作名称
     */
      private String jobName;

      /**
     * 求职者的现居住地
     */
      private String location;

      /**
     * 求职者邮箱
     */
      private String email;

      /**
     * 求职者电话
     */
      private String phone;

      /**
     * 民族
     */
      private String nation;

      /**
     * 政治面貌
     */
      private String politicalStatus;

      /**
     * 性别
     */
      private String sex;

      /**
     * 生日
     */
      private LocalDate birthday;

      /**
     * 求职意向
     */
      private String job;

      /**
     * 期望薪资
     */
      private String wage;

      /**
     * 毕业院校
     */
      private String school;

      /**
     * 投递的简历id
     */
      private Integer resumeId;


}
