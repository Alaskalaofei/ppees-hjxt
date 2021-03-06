package com.csdj.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class LetterOfConsentSignature {

  private Integer id;
  private String signatureman;
  private String signaturefeman;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date signaturedate;
  private String serviceStaffsignature;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSignatureman() {
    return signatureman;
  }

  public void setSignatureman(String signatureman) {
    this.signatureman = signatureman;
  }

  public String getSignaturefeman() {
    return signaturefeman;
  }

  public void setSignaturefeman(String signaturefeman) {
    this.signaturefeman = signaturefeman;
  }

  public Date getSignaturedate() {
    return signaturedate;
  }

  public void setSignaturedate(Date signaturedate) {
    this.signaturedate = signaturedate;
  }

  public String getServiceStaffsignature() {
    return serviceStaffsignature;
  }

  public void setServiceStaffsignature(String serviceStaffsignature) {
    this.serviceStaffsignature = serviceStaffsignature;
  }
}
