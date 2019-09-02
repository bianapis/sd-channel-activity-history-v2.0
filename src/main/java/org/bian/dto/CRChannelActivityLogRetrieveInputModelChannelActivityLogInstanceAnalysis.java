package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceAnalysis
 */
public class CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceAnalysis   {
  private String channelActivityLogInstanceAnalysisReference = null;

  private String channelActivityLogInstanceAnalysisReportType = null;

  private String channelActivityLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return channelActivityLogInstanceAnalysisReference
  **/

  public String getChannelActivityLogInstanceAnalysisReference() {
    return channelActivityLogInstanceAnalysisReference;
  }

  public void setChannelActivityLogInstanceAnalysisReference(String channelActivityLogInstanceAnalysisReference) {
    this.channelActivityLogInstanceAnalysisReference = channelActivityLogInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return channelActivityLogInstanceAnalysisParameters
  **/

  public String getChannelActivityLogInstanceAnalysisParameters() {
    return channelActivityLogInstanceAnalysisParameters;
  }

  public void setChannelActivityLogInstanceAnalysisParameters(String channelActivityLogInstanceAnalysisParameters) {
    this.channelActivityLogInstanceAnalysisParameters = channelActivityLogInstanceAnalysisParameters;
  }


}

