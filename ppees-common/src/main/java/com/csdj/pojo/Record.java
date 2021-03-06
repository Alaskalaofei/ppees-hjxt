package com.csdj.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Record {
  private Integer rid;
  private String bname;
  private String fname;
  private String bcertificate;
  private String fcertificate;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JSONField(format = "yyyy-MM-dd")
  private Date birth;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JSONField(format = "yyyy-MM-dd")
  private Date fbirth;
  private String boccupation;
  private String foccupation;
  private String bnation;
  private String fnation;
  private Integer bdocumentid;
  private Integer fdocumentid;
  private Integer bage;
  private Integer fage;
  private Integer beducation;
  private Integer feducation;
  private String baccount;
  private String faccount;
  private String bphone;
  private String fphone;
  @JSONField(format = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date marriage;
  private String bregistered;
  private String fregistered;
  private String present;
  private String zipcode;
  private Integer telephonenumber;
  private Integer informedconsent;
  @JSONField(format = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date creationtime;
  private String mheadportrait;
  private String fheadportrait;
  private Integer consanguinity;
  private SysUser sysUser;
  private String assessmentcontent;

  public String getAssessmentcontent() {
    return assessmentcontent;
  }

  public void setAssessmentcontent(String assessmentcontent) {
    this.assessmentcontent = assessmentcontent;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getBcertificate() {
    return bcertificate;
  }

  public void setBcertificate(String bcertificate) {
    this.bcertificate = bcertificate;
  }

  public String getFcertificate() {
    return fcertificate;
  }

  public void setFcertificate(String fcertificate) {
    this.fcertificate = fcertificate;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public Date getFbirth() {
    return fbirth;
  }

  public void setFbirth(Date fbirth) {
    this.fbirth = fbirth;
  }

  public String getBoccupation() {
    return boccupation;
  }

  public void setBoccupation(String boccupation) {
    this.boccupation = boccupation;
  }

  public String getFoccupation() {
    return foccupation;
  }

  public void setFoccupation(String foccupation) {
    this.foccupation = foccupation;
  }

  public String getBnation() {
    return bnation;
  }

  public void setBnation(String bnation) {
    this.bnation = bnation;
  }

  public String getFnation() {
    return fnation;
  }

  public void setFnation(String fnation) {
    this.fnation = fnation;
  }

  public Integer getBdocumentid() {
    return bdocumentid;
  }

  public void setBdocumentid(Integer bdocumentid) {
    this.bdocumentid = bdocumentid;
  }

  public Integer getFdocumentid() {
    return fdocumentid;
  }

  public void setFdocumentid(Integer fdocumentid) {
    this.fdocumentid = fdocumentid;
  }

  public Integer getBage() {
    return bage;
  }

  public void setBage(Integer bage) {
    this.bage = bage;
  }

  public Integer getFage() {
    return fage;
  }

  public void setFage(Integer fage) {
    this.fage = fage;
  }

  public Integer getBeducation() {
    return beducation;
  }

  public void setBeducation(Integer beducation) {
    this.beducation = beducation;
  }

  public Integer getFeducation() {
    return feducation;
  }

  public void setFeducation(Integer feducation) {
    this.feducation = feducation;
  }

  public String getBaccount() {
    return baccount;
  }

  public void setBaccount(String baccount) {
    this.baccount = baccount;
  }

  public String getFaccount() {
    return faccount;
  }

  public void setFaccount(String faccount) {
    this.faccount = faccount;
  }

  public String getBphone() {
    return bphone;
  }

  public void setBphone(String bphone) {
    this.bphone = bphone;
  }

  public String getFphone() {
    return fphone;
  }

  public void setFphone(String fphone) {
    this.fphone = fphone;
  }

  public Date getMarriage() {
    return marriage;
  }

  public void setMarriage(Date marriage) {
    this.marriage = marriage;
  }

  public String getBregistered() {
    return bregistered;
  }

  public void setBregistered(String bregistered) {
    this.bregistered = bregistered;
  }

  public String getFregistered() {
    return fregistered;
  }

  public void setFregistered(String fregistered) {
    this.fregistered = fregistered;
  }

  public String getPresent() {
    return present;
  }

  public void setPresent(String present) {
    this.present = present;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Integer getTelephonenumber() {
    return telephonenumber;
  }

  public void setTelephonenumber(Integer telephonenumber) {
    this.telephonenumber = telephonenumber;
  }

  public Integer getInformedconsent() {
    return informedconsent;
  }

  public void setInformedconsent(Integer informedconsent) {
    this.informedconsent = informedconsent;
  }

  public Date getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(Date creationtime) {
    this.creationtime = creationtime;
  }

  public String getMheadportrait() {
    return mheadportrait;
  }

  public void setMheadportrait(String mheadportrait) {
    this.mheadportrait = mheadportrait;
  }

  public String getFheadportrait() {
    return fheadportrait;
  }

  public void setFheadportrait(String fheadportrait) {
    this.fheadportrait = fheadportrait;
  }

  public Integer getConsanguinity() {
    return consanguinity;
  }

  public void setConsanguinity(Integer consanguinity) {
    this.consanguinity = consanguinity;
  }

  public SysUser getSysUser() {
    return sysUser;
  }

  public void setSysUser(SysUser sysUser) {
    this.sysUser = sysUser;
  }
}