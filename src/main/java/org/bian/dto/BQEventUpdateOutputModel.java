package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEventUpdateInputModelBQEventInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEventUpdateOutputModel
 */
public class BQEventUpdateOutputModel   {
  private BQEventUpdateInputModelBQEventInstanceRecord bQEventInstanceRecord = null;

  private String eventUpdateActionTaskReference = null;

  private Object eventUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return eventUpdateActionTaskReference
  **/

  public String getEventUpdateActionTaskReference() {
    return eventUpdateActionTaskReference;
  }

  public void setEventUpdateActionTaskReference(String eventUpdateActionTaskReference) {
    this.eventUpdateActionTaskReference = eventUpdateActionTaskReference;
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

