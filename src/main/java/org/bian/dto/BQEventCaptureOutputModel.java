package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEventCaptureOutputModel
 */
public class BQEventCaptureOutputModel   {
  private String eventCaptureActionTaskReference = null;

  private Object eventCaptureActionTaskRecord = null;

  private String eventCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Event instance capture service call 
   * @return eventCaptureActionTaskReference
  **/

  public String getEventCaptureActionTaskReference() {
    return eventCaptureActionTaskReference;
  }

  public void setEventCaptureActionTaskReference(String eventCaptureActionTaskReference) {
    this.eventCaptureActionTaskReference = eventCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Event structured input transaction/record 
   * @return eventCaptureRecordReference
  **/

  public String getEventCaptureRecordReference() {
    return eventCaptureRecordReference;
  }

  public void setEventCaptureRecordReference(String eventCaptureRecordReference) {
    this.eventCaptureRecordReference = eventCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

