package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogUpdateOutputModel
 */
public class CRChannelActivityLogUpdateOutputModel   {
  private String channelActivityLogUpdateActionTaskReference = null;

  private Object channelActivityLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return channelActivityLogUpdateActionTaskReference
  **/

  public String getChannelActivityLogUpdateActionTaskReference() {
    return channelActivityLogUpdateActionTaskReference;
  }

  public void setChannelActivityLogUpdateActionTaskReference(String channelActivityLogUpdateActionTaskReference) {
    this.channelActivityLogUpdateActionTaskReference = channelActivityLogUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return channelActivityLogUpdateActionTaskRecord
  **/

  public Object getChannelActivityLogUpdateActionTaskRecord() {
    return channelActivityLogUpdateActionTaskRecord;
  }

  public void setChannelActivityLogUpdateActionTaskRecord(Object channelActivityLogUpdateActionTaskRecord) {
    this.channelActivityLogUpdateActionTaskRecord = channelActivityLogUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

