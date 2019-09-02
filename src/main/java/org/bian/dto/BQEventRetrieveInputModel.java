package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEventRetrieveInputModelEventInstanceAnalysis;
import org.bian.dto.BQEventRetrieveInputModelEventInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEventRetrieveInputModel
 */
public class BQEventRetrieveInputModel   {
  private Object eventRetrieveActionTaskRecord = null;

  private String eventRetrieveActionRequest = null;

  private BQEventRetrieveInputModelEventInstanceReport eventInstanceReport = null;

  private BQEventRetrieveInputModelEventInstanceAnalysis eventInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eventRetrieveActionTaskRecord
  **/

  public Object getEventRetrieveActionTaskRecord() {
    return eventRetrieveActionTaskRecord;
  }

  public void setEventRetrieveActionTaskRecord(Object eventRetrieveActionTaskRecord) {
    this.eventRetrieveActionTaskRecord = eventRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return eventRetrieveActionRequest
  **/

  public String getEventRetrieveActionRequest() {
    return eventRetrieveActionRequest;
  }

  public void setEventRetrieveActionRequest(String eventRetrieveActionRequest) {
    this.eventRetrieveActionRequest = eventRetrieveActionRequest;
  }


  /**
   * Get eventInstanceReport
   * @return eventInstanceReport
  **/

  public BQEventRetrieveInputModelEventInstanceReport getEventInstanceReport() {
    return eventInstanceReport;
  }

  public void setEventInstanceReport(BQEventRetrieveInputModelEventInstanceReport eventInstanceReport) {
    this.eventInstanceReport = eventInstanceReport;
  }


  /**
   * Get eventInstanceAnalysis
   * @return eventInstanceAnalysis
  **/

  public BQEventRetrieveInputModelEventInstanceAnalysis getEventInstanceAnalysis() {
    return eventInstanceAnalysis;
  }

  public void setEventInstanceAnalysis(BQEventRetrieveInputModelEventInstanceAnalysis eventInstanceAnalysis) {
    this.eventInstanceAnalysis = eventInstanceAnalysis;
  }


}

