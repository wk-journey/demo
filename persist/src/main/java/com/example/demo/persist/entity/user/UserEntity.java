package com.example.demo.persist.entity.user;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wangkai
 * @date 2018-08-22 16:11
 * @desc com.example.demo.persist.entity.user
 */
@Entity
@Table(name = "t_user")
public class UserEntity {
	/**
	 * 用户id，主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uerId;
	/**
	 * 用户名
	 */
	private String uerName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	@Column(insertable = false, updatable = false)
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Column(insertable = false, updatable = false)
	private Date updateTime;

	public UserEntity() {
	}

	public Integer getUerId() {
		return uerId;
	}

	public void setUerId(Integer uerId) {
		this.uerId = uerId;
	}

	public String getUerName() {
		return uerName;
	}

	public void setUerName(String uerName) {
		this.uerName = uerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
