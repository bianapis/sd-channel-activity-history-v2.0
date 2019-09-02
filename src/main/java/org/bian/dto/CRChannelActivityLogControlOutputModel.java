package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogControlOutputModel
 */
public class CRChannelActivityLogControlOutputModel   {
  private String channelActivityLogControlActionTaskReference = null;

  private Object channelActivityLogControlActionTaskRecord = null;

  private String channelActivityLogControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Channel Activity Log instance control processing service call 
   * @return channelActivityLogControlActionTaskReference
  **/

  public String getChannelActivityLogControlActionTaskReference() {
    return channelActivityLogControlActionTaskReference;
  }

  public void setChannelActivityLogControlActionTaskReference(String channelActivityLogControlActionTaskReference) {
    this.channelActivityLogControlActionTaskReference = channelActivityLogControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return channelActivityLogControlActionTaskRecord
  **/

  public Object getChannelActivityLogControlActionTaskRecord() {
    return channelActivityLogControlActionTaskRecord;
  }

  public void setChannelActivityLogControlActionTaskRecord(Object channelActivityLogControlActionTaskRecord) {
    this.channelActivityLogControlActionTaskRecord = channelActivityLogControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return channelActivityLogControlActionResponse
  **/

  public String getChannelActivityLogControlActionResponse() {
    return channelActivityLogControlActionResponse;
  }

  public void setChannelActivityLogControlActionResponse(String channelActivityLogControlActionResponse) {
    this.channelActivityLogControlActionResponse = channelActivityLogControlActionResponse;
  }


}

