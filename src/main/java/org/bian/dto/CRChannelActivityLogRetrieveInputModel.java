package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceAnalysis;
import org.bian.dto.CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogRetrieveInputModel
 */
public class CRChannelActivityLogRetrieveInputModel   {
  private Object channelActivityLogRetrieveActionTaskRecord = null;

  private String channelActivityLogRetrieveActionRequest = null;

  private CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceReportRecord channelActivityLogInstanceReportRecord = null;

  private CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceAnalysis channelActivityLogInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return channelActivityLogRetrieveActionRequest
  **/

  public String getChannelActivityLogRetrieveActionRequest() {
    return channelActivityLogRetrieveActionRequest;
  }

  public void setChannelActivityLogRetrieveActionRequest(String channelActivityLogRetrieveActionRequest) {
    this.channelActivityLogRetrieveActionRequest = channelActivityLogRetrieveActionRequest;
  }


  /**
   * Get channelActivityLogInstanceReportRecord
   * @return channelActivityLogInstanceReportRecord
  **/

  public CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceReportRecord getChannelActivityLogInstanceReportRecord() {
    return channelActivityLogInstanceReportRecord;
  }

  public void setChannelActivityLogInstanceReportRecord(CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceReportRecord channelActivityLogInstanceReportRecord) {
    this.channelActivityLogInstanceReportRecord = channelActivityLogInstanceReportRecord;
  }


  /**
   * Get channelActivityLogInstanceAnalysis
   * @return channelActivityLogInstanceAnalysis
  **/

  public CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceAnalysis getChannelActivityLogInstanceAnalysis() {
    return channelActivityLogInstanceAnalysis;
  }

  public void setChannelActivityLogInstanceAnalysis(CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceAnalysis channelActivityLogInstanceAnalysis) {
    this.channelActivityLogInstanceAnalysis = channelActivityLogInstanceAnalysis;
  }


}

