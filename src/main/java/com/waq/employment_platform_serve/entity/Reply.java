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
    public class Reply implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 回复帖子的id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 回帖人的id
     */
      private Integer userId;

      /**
     * 回帖人姓名
     */
      private String userName;

      /**
     * 回帖人头像
     */
      private String userHeader;

      /**
     * 主帖id
     */
      private Integer discussId;

      /**
     * 回帖内容
     */
      private String content;

      /**
     * 回帖日期
     */
      private String date;


}
