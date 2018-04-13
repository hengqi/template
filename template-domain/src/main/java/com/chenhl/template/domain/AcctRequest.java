package com.chenhl.template.domain;

import java.util.Date;

public class AcctRequest {
    private Long acctrequestid;

    private Long accountingrequestextid;

    private String businesspartid;

    private String externaltradenum;

    private String externaltradetype;

    private String externalsubtradenum;

    private String externalsubtradetype;

    private String businessabstract;

    private String messagebody;

    private String errorcode;

    private String errormsg;

    private String accountingstatus;

    private String url;

    private Date inputdate;

    private Date stampdate;

    private String inputman;

    private String stampman;

    public Long getAcctrequestid() {
        return acctrequestid;
    }

    public void setAcctrequestid(Long acctrequestid) {
        this.acctrequestid = acctrequestid;
    }

    public Long getAccountingrequestextid() {
        return accountingrequestextid;
    }

    public void setAccountingrequestextid(Long accountingrequestextid) {
        this.accountingrequestextid = accountingrequestextid;
    }

    public String getBusinesspartid() {
        return businesspartid;
    }

    public void setBusinesspartid(String businesspartid) {
        this.businesspartid = businesspartid == null ? null : businesspartid.trim();
    }

    public String getExternaltradenum() {
        return externaltradenum;
    }

    public void setExternaltradenum(String externaltradenum) {
        this.externaltradenum = externaltradenum == null ? null : externaltradenum.trim();
    }

    public String getExternaltradetype() {
        return externaltradetype;
    }

    public void setExternaltradetype(String externaltradetype) {
        this.externaltradetype = externaltradetype == null ? null : externaltradetype.trim();
    }

    public String getExternalsubtradenum() {
        return externalsubtradenum;
    }

    public void setExternalsubtradenum(String externalsubtradenum) {
        this.externalsubtradenum = externalsubtradenum == null ? null : externalsubtradenum.trim();
    }

    public String getExternalsubtradetype() {
        return externalsubtradetype;
    }

    public void setExternalsubtradetype(String externalsubtradetype) {
        this.externalsubtradetype = externalsubtradetype == null ? null : externalsubtradetype.trim();
    }

    public String getBusinessabstract() {
        return businessabstract;
    }

    public void setBusinessabstract(String businessabstract) {
        this.businessabstract = businessabstract == null ? null : businessabstract.trim();
    }

    public String getMessagebody() {
        return messagebody;
    }

    public void setMessagebody(String messagebody) {
        this.messagebody = messagebody == null ? null : messagebody.trim();
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode == null ? null : errorcode.trim();
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg == null ? null : errormsg.trim();
    }

    public String getAccountingstatus() {
        return accountingstatus;
    }

    public void setAccountingstatus(String accountingstatus) {
        this.accountingstatus = accountingstatus == null ? null : accountingstatus.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public Date getStampdate() {
        return stampdate;
    }

    public void setStampdate(Date stampdate) {
        this.stampdate = stampdate;
    }

    public String getInputman() {
        return inputman;
    }

    public void setInputman(String inputman) {
        this.inputman = inputman == null ? null : inputman.trim();
    }

    public String getStampman() {
        return stampman;
    }

    public void setStampman(String stampman) {
        this.stampman = stampman == null ? null : stampman.trim();
    }
}