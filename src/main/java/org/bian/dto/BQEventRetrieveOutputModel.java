package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEventRetrieveOutputModelBQEventInstanceRecord;
import org.bian.dto.BQEventRetrieveOutputModelChannelActivityLogInstanceRecord;
import org.bian.dto.BQEventRetrieveOutputModelEventInstanceAnalysis;
import org.bian.dto.BQEventRetrieveOutputModelEventInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEventRetrieveOutputModel
 */
public class BQEventRetrieveOutputModel   {
  private BQEventRetrieveOutputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord = null;

  private BQEventRetrieveOutputModelBQEventInstanceRecord bQEventInstanceRecord = null;

  private String eventRetrieveActionTaskReference = null;

  private Object eventRetrieveActionTaskRecord = null;

  private String eventRetrieveActionResponse = null;

  private BQEventRetrieveOutputModelEventInstanceReport eventInstanceReport = null;

  private BQEventRetrieveOutputModelEventInstanceAnalysis eventInstanceAnalysis = null;


  /**
   * Get channelActivityLogInstanceRecord
   * @return channelActivityLogInstanceRecord
  **/

  public BQEventRetrieveOutputModelChannelActivityLogInstanceRecord getChannelActivityLogInstanceRecord() {
    return channelActivityLogInstanceRecord;
  }

  public void setChannelActivityLogInstanceRecord(BQEventRetrieveOutputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord) {
    this.channelActivityLogInstanceRecord = channelActivityLogInstanceRecord;
  }


  /**
   * Get bQEventInstanceRecord
   * @return bQEventInstanceRecord
  **/

  public BQEventRetrieveOutputModelBQEventInstanceRecord getBQEventInstanceRecord() {
    return bQEventInstanceRecord;
  }
 @JsonProperty("bQEventInstanceRecord")
  public void setBQEventInstanceRecord(BQEventRetrieveOutputModelBQEventInstanceRecord bQEventInstanceRecord) {
    this.bQEventInstanceRecord = bQEventInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Event instance retrieve service call 
   * @return eventRetrieveActionTaskReference
  **/

  public String getEventRetrieveActionTaskReference() {
    return eventRetrieveActionTaskReference;
  }

  public void setEventRetrieveActionTaskReference(String eventRetrieveActionTaskReference) {
    this.eventRetrieveActionTaskReference = eventRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return eventRetrieveActionResponse
  **/

  public String getEventRetrieveActionResponse() {
    return eventRetrieveActionResponse;
  }

  public void setEventRetrieveActionResponse(String eventRetrieveActionResponse) {
    this.eventRetrieveActionResponse = eventRetrieveActionResponse;
  }


  /**
   * Get eventInstanceReport
   * @return eventInstanceReport
  **/

  public BQEventRetrieveOutputModelEventInstanceReport getEventInstanceReport() {
    return eventInstanceReport;
  }

  public void setEventInstanceReport(BQEventRetrieveOutputModelEventInstanceReport eventInstanceReport) {
    this.eventInstanceReport = eventInstanceReport;
  }


  /**
   * Get eventInstanceAnalysis
   * @return eventInstanceAnalysis
  **/

  public BQEventRetrieveOutputModelEventInstanceAnalysis getEventInstanceAnalysis() {
    return eventInstanceAnalysis;
  }

  public void setEventInstanceAnalysis(BQEventRetrieveOutputModelEventInstanceAnalysis eventInstanceAnalysis) {
    this.eventInstanceAnalysis = eventInstanceAnalysis;
  }


}

