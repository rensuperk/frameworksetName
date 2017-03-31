/*
 * Copyright (c) 2001-2016 Bidlink(Beijing) E-Biz Tech Co.,Ltd.
 * All rights reserved.
 * 必联（北京）电子商务科技有限公司 版权所有
 * <p>Project.java</p>
 */
package cn.rk.setname.model;

import cn.rk.setname.annotation.OrgSetName;
import cn.rk.setname.annotation.SetName;
import cn.rk.setname.annotation.UserSetName;
import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.Length;

/**
 * 该文件为自动生成,不允许修改
 *
 * @version 2.0.0
 * @author <a href="jiamingliu@ebnew.com">robot</a>
 * @date 16-6-13 下午1:22
 */
public class Project {

	//UUID
	private String id;
	//类型ID
	private String typeId;
	//总项的id
	private String basicId;
	//招标项目编号
	@Length(max = 30 , message = "长度不能超过{max}")
	private String number;
	//招标项目名称
	@Length(max = 200 , message = "长度不能超过{max}")
	private String name;
	//内容
	@Length(max = 2000 , message = "长度不能超过{max}")
	private String content;
	//招标方式 011001:公开,011002:邀请,011009:其他
	private String bidTypeCode;
	//项目状态 1=未进行,2=进行中、3=已结束 4=已中止,-1=已删除
	private String status;
	//创建人
	@UserSetName(type = SetName.Type.CODE)
	private String createUserId;
	//创建人名称
	@UserSetName(type = SetName.Type.VALUE)
	private String createUserName;
	//创建时间
	@JSONField(format="yyyy-MM-dd HH:mm")
	private java.util.Date createTime;
	//最后更新人
	private String updateUserId;
	//更新时间
	@JSONField (format="yyyy-MM-dd HH:mm:ss")
	private java.util.Date updateTime;
	//最后审核人
	private String auditUserId;
	//审核通过时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private java.util.Date auditTime;
	//审核部门id
	private String auditDepartmentId;
	//监管部门
	private String regulatorCode;
	//招标项目所属行业
//	private String industryCode;
	//委托金额
	private String entrustAmount;
	//委托日期
	@JSONField (format="yyyy-MM-dd")
	private java.util.Date entrustTime;
	//结项时间
	@JSONField (format="yyyy-MM-dd HH:mm")
	private java.util.Date endTime;
	//是否拆包(true:拆包)
	private Boolean isApart;
	//拆包数量,最多300
	private Integer apartCount;
	//审核状态 1:未提交,2:审核中,3:审核通过,4:审核未通过,-1:已撤回
	private String auditSatatus;
	//项目性质,用","隔开
	private String nature;
	//委托人ids,用","隔开
	private String bidCallIds;
	//委托人names,用","隔开
	private String bidCallNames;
	//租户ID
	private String tenantId;
	//部门编码
	@OrgSetName(type = SetName.Type.CODE)
	private Long orgCode;
	//部门名称
	@OrgSetName(type = SetName.Type.VALUE)
	private String orgName;
	//币种
	private String currencyCode;
	//币种单位 1:元 2:万元
	private String currencyUnit;
	//招标组织形式
	private String bidOrgType;
	//招标采购项目名称（项目模板名称）
	private String typeName;
	//是否测试：1=测试,0=正式
	private Boolean isTest;
	//系统状态:1有效,0无效
	private Integer systemStatus;
	//
	private Boolean source;
	//
	private Long oldId;
	//邀请招标理由
	@Length(max = 2000 , message = "长度不能超过{max}")
	private String invitReason;
	//批复文号：立项新增字段
	@Length(max = 50 , message = "长度不能超过{max}")
	private String replyNumber;
	//项目类别：立项新增字段
	private String projectCategory;
	//备案部门：立项新增
	@Length(max = 200 , message = "长度不能超过{max}")
	private String recordDep;
	//国际标id
	private Long bpsId;

	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setTypeId(String typeId){
		this.typeId = typeId;
	}
	public String getTypeId(){
		return typeId;
	}
	public void setBasicId(String basicId){
		this.basicId = basicId;
	}
	public String getBasicId(){
		return basicId;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return content;
	}
	public void setBidTypeCode(String bidTypeCode){
		this.bidTypeCode = bidTypeCode;
	}
	public String getBidTypeCode(){
		return bidTypeCode;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return status;
	}
	public void setCreateUserId(String createUserId){
		this.createUserId = createUserId;
	}
	public String getCreateUserId(){
		return createUserId;
	}
	public void setCreateUserName(String createUserName){
		this.createUserName = createUserName;
	}
	public String getCreateUserName(){
		return createUserName;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getCreateTime(){
		return createTime;
	}
	public void setUpdateUserId(String updateUserId){
		this.updateUserId = updateUserId;
	}
	public String getUpdateUserId(){
		return updateUserId;
	}
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	public void setAuditUserId(String auditUserId){
		this.auditUserId = auditUserId;
	}
	public String getAuditUserId(){
		return auditUserId;
	}
	public void setAuditTime(java.util.Date auditTime){
		this.auditTime = auditTime;
	}
	public java.util.Date getAuditTime(){
		return auditTime;
	}
	public void setAuditDepartmentId(String auditDepartmentId){
		this.auditDepartmentId = auditDepartmentId;
	}
	public String getAuditDepartmentId(){
		return auditDepartmentId;
	}
	public void setRegulatorCode(String regulatorCode){
		this.regulatorCode = regulatorCode;
	}
	public String getRegulatorCode(){
		return regulatorCode;
	}
	public void setEntrustAmount(String entrustAmount){
		this.entrustAmount = entrustAmount;
	}
	public String getEntrustAmount(){
		return entrustAmount;
	}
	public void setEntrustTime(java.util.Date entrustTime){
		this.entrustTime = entrustTime;
	}
	public java.util.Date getEntrustTime(){
		return entrustTime;
	}
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	public java.util.Date getEndTime(){
		return endTime;
	}
	public void setIsApart(Boolean isApart){
		this.isApart = isApart;
	}
	public Boolean getIsApart(){
		return isApart;
	}
	public void setApartCount(Integer apartCount){
		this.apartCount = apartCount;
	}
	public Integer getApartCount(){
		return apartCount;
	}
	public void setAuditSatatus(String auditSatatus){
		this.auditSatatus = auditSatatus;
	}
	public String getAuditSatatus(){
		return auditSatatus;
	}
	/*public String getAuditStatus(){
		return auditSatatus;
	}*/
	public void setNature(String nature){
		this.nature = nature;
	}
	public String getNature(){
		return nature;
	}
	public void setBidCallIds(String bidCallIds){
		this.bidCallIds = bidCallIds;
	}
	public String getBidCallIds(){
		return bidCallIds;
	}
	public void setBidCallNames(String bidCallNames){
		this.bidCallNames = bidCallNames;
	}
	public String getBidCallNames(){
		return bidCallNames;
	}
	public void setTenantId(String tenantId){
		this.tenantId = tenantId;
	}
	public String getTenantId(){
		return tenantId;
	}
	public void setOrgCode(Long orgCode){
		this.orgCode = orgCode;
	}
	public Long getOrgCode(){
		return orgCode;
	}
	public void setOrgName(String orgName){
		this.orgName = orgName;
	}
	public String getOrgName(){
		return orgName;
	}
	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}
	public String getCurrencyCode(){
		return currencyCode;
	}
	public void setCurrencyUnit(String currencyUnit){
		this.currencyUnit = currencyUnit;
	}
	public String getCurrencyUnit(){
		return currencyUnit;
	}
	public void setBidOrgType(String bidOrgType){
		this.bidOrgType = bidOrgType;
	}
	public String getBidOrgType(){
		return bidOrgType;
	}
	public void setTypeName(String typeName){
		this.typeName = typeName;
	}
	public String getTypeName(){
		return typeName;
	}
	public void setIsTest(Boolean isTest){
		this.isTest = isTest;
	}
	public Boolean getIsTest(){
		return isTest;
	}
	public void setSystemStatus(Integer systemStatus){
		this.systemStatus = systemStatus;
	}
	public Integer getSystemStatus(){
		return systemStatus;
	}
	public void setSource(Boolean source){
		this.source = source;
	}
	public Boolean getSource(){
		return source;
	}
	public void setOldId(Long oldId){
		this.oldId = oldId;
	}
	public Long getOldId(){
		return oldId;
	}
	public void setInvitReason(String invitReason){
		this.invitReason = invitReason;
	}
	public String getInvitReason(){
		return invitReason;
	}
	public void setReplyNumber(String replyNumber){
		this.replyNumber = replyNumber;
	}
	public String getReplyNumber(){
		return replyNumber;
	}
	public void setProjectCategory(String projectCategory){
		this.projectCategory = projectCategory;
	}
	public String getProjectCategory(){
		return projectCategory;
	}
	public void setRecordDep(String recordDep){
		this.recordDep = recordDep;
	}
	public String getRecordDep(){
		return recordDep;
	}

	public Long getBpsId() {
		return bpsId;
	}

	public void setBpsId(Long bpsId) {
		this.bpsId = bpsId;
	}
}