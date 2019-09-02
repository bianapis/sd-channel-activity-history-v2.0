package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceAnalysis
 */
public class CRChannelActivityLogRetrieveOutputModelChannelActivityLogInstanceAnalysis   {
  private String channelActivityLogInstanceAnalysisData = null;

  private String channelActivityLogInstanceAnalysisReportType = null;

  private Object channelActivityLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return channelActivityLogInstanceAnalysisData
  **/

  public String getChannelActivityLogInstanceAnalysisData() {
    return channelActivityLogInstanceAnalysisData;
  }

  public void setChannelActivityLogInstanceAnalysisData(String channelActivityLogInstanceAnalysisData) {
    this.channelActivityLogInstanceAnalysisData = channelActivityLogInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return channelActivityLogInstanceAnalysisReportType
  **/

  public String getChannelActivityLogInstanceAnalysisReportType() {
    return channelActivityLogInstanceAnalysisReportType;
  }

  public void setChannelActivityLogInstanceAnalysisReportType(String channelActivityLogInstanceAnalysisReportType) {
    this.channelActivityLogInstanceAnalysisReportType = channelActivityLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return channelActivityLogInstanceAnalysisReport
  **/

  public Object getChannelActivityLogInstanceAnalysisReport() {
    return channelActivityLogInstanceAnalysisReport;
  }

  public void setChannelActivityLogInstanceAnalysisReport(Object channelActivityLogInstanceAnalysisReport) {
    this.channelActivityLogInstanceAnalysisReport = channelActivityLogInstanceAnalysisReport;
  }


}

