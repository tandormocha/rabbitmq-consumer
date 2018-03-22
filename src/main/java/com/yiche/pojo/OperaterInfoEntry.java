package com.yiche.pojo;

/**
 * @author kouyy
 */
public class OperaterInfoEntry {
	  public int UserId;
      public String UserName;
      public String UserIp;
      public String OperateTime;

  public int getUserId() {
      return UserId;
  }

  public void setUserId(int userId) {
      UserId = userId;
  }

  public String getUserName() {
      return UserName;
  }

  public void setUserName(String userName) {
      UserName = userName;
  }

  public String getUserIp() {
      return UserIp;
  }

  public void setUserIp(String userIp) {
      UserIp = userIp;
  }

  public String getOperateTime() {
      return OperateTime;
  }

  public void setOperateTime(String operateTime) {
      OperateTime = operateTime;
  }
	}
