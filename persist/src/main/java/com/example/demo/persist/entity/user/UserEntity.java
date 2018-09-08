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
	private Integer userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 微信openid
	 */
	private String weixinOpenid;
	/**
	 * 微信unionid（公众号相关）
	 */
	private String weixinUnionid;
	/**
	 * 微信昵称
	 */
	private String weixinNickname;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWeixinOpenid() {
		return weixinOpenid;
	}

	public void setWeixinOpenid(String weixinOpenid) {
		this.weixinOpenid = weixinOpenid;
	}

	public String getWeixinUnionid() {
		return weixinUnionid;
	}

	public void setWeixinUnionid(String weixinUnionid) {
		this.weixinUnionid = weixinUnionid;
	}

	public String getWeixinNickname() {
		return weixinNickname;
	}

	public void setWeixinNickname(String weixinNickname) {
		this.weixinNickname = weixinNickname;
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
