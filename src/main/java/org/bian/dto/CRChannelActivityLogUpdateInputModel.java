package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogUpdateInputModel
 */
public class CRChannelActivityLogUpdateInputModel   {
  private String channelActivityHistoryServicingSessionReference = null;

  private String channelActivityLogInstanceReference = null;

  private Object channelActivityLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return channelActivityHistoryServicingSessionReference
  **/

  public String getChannelActivityHistoryServicingSessionReference() {
    return channelActivityHistoryServicingSessionReference;
  }

  public void setChannelActivityHistoryServicingSessionReference(String channelActivityHistoryServicingSessionReference) {
    this.channelActivityHistoryServicingSessionReference = channelActivityHistoryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Channel Activity Log instance 
   * @return channelActivityLogInstanceReference
  **/

  public String getChannelActivityLogInstanceReference() {
    return channelActivityLogInstanceReference;
  }

  public void setChannelActivityLogInstanceReference(String channelActivityLogInstanceReference) {
    this.channelActivityLogInstanceReference = channelActivityLogInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

