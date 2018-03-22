package com.yiche.pojo;

/**
 * @author kouyy
 */
public class BodyEntry {
	 public String EntityId;
     public OperaterInfoEntry OperaterInfo;
     public FriendEntry Friend;

 public String getEntityId() {
     return EntityId;
 }

 public void setEntityId(String entityId) {
     EntityId = entityId;
 }

 public OperaterInfoEntry getOperaterInfo() {
     return OperaterInfo;
 }

 public void setOperaterInfo(OperaterInfoEntry operaterInfo) {
     OperaterInfo = operaterInfo;
 }

 public FriendEntry getFriend() {
     return Friend;
 }

 public void setFriend(FriendEntry friend) {
     Friend = friend;
 }
	}
