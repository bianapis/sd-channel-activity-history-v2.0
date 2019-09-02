package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEventCaptureInputModelCaptureRecordType
 */
public class BQEventCaptureInputModelCaptureRecordType   {
  private Object captureInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Structured input transaction/record (e.g. timesheet, event record, account posting) 
   * @return captureInputRecord
  **/

  public Object getCaptureInputRecord() {
    return captureInputRecord;
  }

  public void setCaptureInputRecord(Object captureInputRecord) {
    this.captureInputRecord = captureInputRecord;
  }


}

