package com.waq.employment_platform_serve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2021-06-02
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Discuss implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用来标记讨论帖子的主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用于标记发帖人的外键
     */
      private Integer userId;

  /**
   * 用于标记发帖人的外键
   */
  private String userHeader;
    /**
     * 用于标记发帖人名称
     */
    private String userName;
      /**
     * 帖子的主题
     */
      private String title;

      /**
     * 帖子的内容
     */
      private String content;

      /**
     * 点赞数
     */
      private Integer likes;

      /**
     * 浏览人数
     */
      private Integer viewer;
    /**
     * 发布日期
     */
    private String date;

      /**
     * 1综合讨论  2面经分享  3笔试分享  4企业发帖
     */
      private Integer type;

      /**
     * 用于标记帖子的状态 1保留 0删除
     */
      private String status;


}
