package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceReportRecord
 */
public class CRChannelActivityLogRetrieveInputModelChannelActivityLogInstanceReportRecord   {
  private String channelActivityLogInstanceReportReference = null;

  private String channelActivityLogInstanceReportType = null;

  private String channelActivityLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return channelActivityLogInstanceReportReference
  **/

  public String getChannelActivityLogInstanceReportReference() {
    return channelActivityLogInstanceReportReference;
  }

  public void setChannelActivityLogInstanceReportReference(String channelActivityLogInstanceReportReference) {
    this.channelActivityLogInstanceReportReference = channelActivityLogInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return channelActivityLogInstanceReportParameters
  **/

  public String getChannelActivityLogInstanceReportParameters() {
    return channelActivityLogInstanceReportParameters;
  }

  public void setChannelActivityLogInstanceReportParameters(String channelActivityLogInstanceReportParameters) {
    this.channelActivityLogInstanceReportParameters = channelActivityLogInstanceReportParameters;
  }


}

