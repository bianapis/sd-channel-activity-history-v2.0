package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceReportRecord
 */
public class CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceReportRecord   {
  private String channelActivityLogInstanceReportData = null;

  private String channelActivityLogInstanceReportType = null;

  private Object channelActivityLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return channelActivityLogInstanceReportData
  **/

  public String getChannelActivityLogInstanceReportData() {
    return channelActivityLogInstanceReportData;
  }

  public void setChannelActivityLogInstanceReportData(String channelActivityLogInstanceReportData) {
    this.channelActivityLogInstanceReportData = channelActivityLogInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return channelActivityLogInstanceReportType
  **/

  public String getChannelActivityLogInstanceReportType() {
    return channelActivityLogInstanceReportType;
  }

  public void setChannelActivityLogInstanceReportType(String channelActivityLogInstanceReportType) {
    this.channelActivityLogInstanceReportType = channelActivityLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return channelActivityLogInstanceReport
  **/

  public Object getChannelActivityLogInstanceReport() {
    return channelActivityLogInstanceReport;
  }

  public void setChannelActivityLogInstanceReport(Object channelActivityLogInstanceReport) {
    this.channelActivityLogInstanceReport = channelActivityLogInstanceReport;
  }


}

