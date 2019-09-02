package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEventUpdateInputModelBQEventInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEventUpdateInputModel
 */
public class BQEventUpdateInputModel   {
  private String channelActivityLogInstanceReference = null;

  private String eventInstanceReference = null;

  private BQEventUpdateInputModelBQEventInstanceRecord bQEventInstanceRecord = null;

  private Object eventUpdateActionTaskRecord = null;

  private String eventUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Channel Activity Log instance 
   * @return channelActivityLogInstanceReference
  **/

  public String getChannelActivityLogInstanceReference() {
    return channelActivityLogInstanceReference;
  }

  public void setChannelActivityLogInstanceReference(String channelActivityLogInstanceReference) {
    this.channelActivityLogInstanceReference = channelActivityLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Event instance 
   * @return eventInstanceReference
  **/

  public String getEventInstanceReference() {
    return eventInstanceReference;
  }

  public void setEventInstanceReference(String eventInstanceReference) {
    this.eventInstanceReference = eventInstanceReference;
  }


  /**
   * Get bQEventInstanceRecord
   * @return bQEventInstanceRecord
  **/

  public BQEventUpdateInputModelBQEventInstanceRecord getBQEventInstanceRecord() {
    return bQEventInstanceRecord;
  }

  public void setBQEventInstanceRecord(BQEventUpdateInputModelBQEventInstanceRecord bQEventInstanceRecord) {
    this.bQEventInstanceRecord = bQEventInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eventUpdateActionTaskRecord
  **/

  public Object getEventUpdateActionTaskRecord() {
    return eventUpdateActionTaskRecord;
  }

  public void setEventUpdateActionTaskRecord(Object eventUpdateActionTaskRecord) {
    this.eventUpdateActionTaskRecord = eventUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return eventUpdateActionRequest
  **/

  public String getEventUpdateActionRequest() {
    return eventUpdateActionRequest;
  }

  public void setEventUpdateActionRequest(String eventUpdateActionRequest) {
    this.eventUpdateActionRequest = eventUpdateActionRequest;
  }


}

