package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceAnalysis;
import org.bian.dto.CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceRecord;
import org.bian.dto.CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogRetrieveOutputModel
 */
public class CRChannelActivityLogRetrieveOutputModel   {
  private CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord = null;

  private String channelActivityLogRetrieveActionTaskReference = null;

  private Object channelActivityLogRetrieveActionTaskRecord = null;

  private String channelActivityLogRetrieveActionResponse = null;

  private CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceReportRecord channelActivityLogInstanceReportRecord = null;

  private CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceAnalysis channelActivityLogInstanceAnalysis = null;


  /**
   * Get channelActivityLogInstanceRecord
   * @return channelActivityLogInstanceRecord
  **/

  public CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceRecord getChannelActivityLogInstanceRecord() {
    return channelActivityLogInstanceRecord;
  }

  public void setChannelActivityLogInstanceRecord(CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord) {
    this.channelActivityLogInstanceRecord = channelActivityLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Channel Activity Log instance retrieve service call 
   * @return channelActivityLogRetrieveActionTaskReference
  **/

  public String getChannelActivityLogRetrieveActionTaskReference() {
    return channelActivityLogRetrieveActionTaskReference;
  }

  public void setChannelActivityLogRetrieveActionTaskReference(String channelActivityLogRetrieveActionTaskReference) {
    this.channelActivityLogRetrieveActionTaskReference = channelActivityLogRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return channelActivityLogRetrieveActionTaskRecord
  **/

  public Object getChannelActivityLogRetrieveActionTaskRecord() {
    return channelActivityLogRetrieveActionTaskRecord;
  }

  public void setChannelActivityLogRetrieveActionTaskRecord(Object channelActivityLogRetrieveActionTaskRecord) {
    this.channelActivityLogRetrieveActionTaskRecord = channelActivityLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return channelActivityLogRetrieveActionResponse
  **/

  public String getChannelActivityLogRetrieveActionResponse() {
    return channelActivityLogRetrieveActionResponse;
  }

  public void setChannelActivityLogRetrieveActionResponse(String channelActivityLogRetrieveActionResponse) {
    this.channelActivityLogRetrieveActionResponse = channelActivityLogRetrieveActionResponse;
  }


  /**
   * Get channelActivityLogInstanceReportRecord
   * @return channelActivityLogInstanceReportRecord
  **/

  public CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceReportRecord getChannelActivityLogInstanceReportRecord() {
    return channelActivityLogInstanceReportRecord;
  }

  public void setChannelActivityLogInstanceReportRecord(CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceReportRecord channelActivityLogInstanceReportRecord) {
    this.channelActivityLogInstanceReportRecord = channelActivityLogInstanceReportRecord;
  }


  /**
   * Get channelActivityLogInstanceAnalysis
   * @return channelActivityLogInstanceAnalysis
  **/

  public CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceAnalysis getChannelActivityLogInstanceAnalysis() {
    return channelActivityLogInstanceAnalysis;
  }

  public void setChannelActivityLogInstanceAnalysis(CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceAnalysis channelActivityLogInstanceAnalysis) {
    this.channelActivityLogInstanceAnalysis = channelActivityLogInstanceAnalysis;
  }


}

