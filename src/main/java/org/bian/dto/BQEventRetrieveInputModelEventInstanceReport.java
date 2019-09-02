package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEventRetrieveInputModelEventInstanceReport
 */
public class BQEventRetrieveInputModelEventInstanceReport   {
  private String eventInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return eventInstanceReportReference
  **/

  public String getEventInstanceReportReference() {
    return eventInstanceReportReference;
  }

  public void setEventInstanceReportReference(String eventInstanceReportReference) {
    this.eventInstanceReportReference = eventInstanceReportReference;
  }


}

