package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEventCaptureInputModelBQEventInstanceRecord;
import org.bian.dto.BQEventCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQEventCaptureInputModel
 */
public class BQEventCaptureInputModel   {
  private String channelActivityLogInstanceReference = null;

  private String eventInstanceReference = null;

  private BQEventCaptureInputModelBQEventInstanceRecord bQEventInstanceRecord = null;

  private Object eventCaptureActionTaskRecord = null;

  private BQEventCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQEventCaptureInputModelBQEventInstanceRecord getBQEventInstanceRecord() {
    return bQEventInstanceRecord;
  }

  public void setBQEventInstanceRecord(BQEventCaptureInputModelBQEventInstanceRecord bQEventInstanceRecord) {
    this.bQEventInstanceRecord = bQEventInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return eventCaptureActionTaskRecord
  **/

  public Object getEventCaptureActionTaskRecord() {
    return eventCaptureActionTaskRecord;
  }

  public void setEventCaptureActionTaskRecord(Object eventCaptureActionTaskRecord) {
    this.eventCaptureActionTaskRecord = eventCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQEventCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQEventCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

