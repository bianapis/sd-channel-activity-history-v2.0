package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEventCaptureInputModelBQEventInstanceRecordCustomerContactRecordCustomerContactRecordActivityRecord
 */
public class BQEventCaptureInputModelBQEventInstanceRecordCustomerContactRecordCustomerContactRecordActivityRecord   {
  private String customerContactDialogueReference = null;

  private Object customerContactDialogueRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any contact session dialogue records created during the contact - there can be several 
   * @return customerContactDialogueReference
  **/

  public String getCustomerContactDialogueReference() {
    return customerContactDialogueReference;
  }

  public void setCustomerContactDialogueReference(String customerContactDialogueReference) {
    this.customerContactDialogueReference = customerContactDialogueReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The session dialogue log of actions is returned to SD-Contact Handler and added to the contact record 
   * @return customerContactDialogueRecord
  **/

  public Object getCustomerContactDialogueRecord() {
    return customerContactDialogueRecord;
  }

  public void setCustomerContactDialogueRecord(Object customerContactDialogueRecord) {
    this.customerContactDialogueRecord = customerContactDialogueRecord;
  }


}

