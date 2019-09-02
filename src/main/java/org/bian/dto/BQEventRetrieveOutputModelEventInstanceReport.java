package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEventRetrieveOutputModelEventInstanceReport
 */
public class BQEventRetrieveOutputModelEventInstanceReport   {
  private Object eventInstanceReportRecord = null;

  private String eventInstanceReportType = null;

  private String eventInstanceReportParameters = null;

  private Object eventInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return eventInstanceReportRecord
  **/

  public Object getEventInstanceReportRecord() {
    return eventInstanceReportRecord;
  }

  public void setEventInstanceReportRecord(Object eventInstanceReportRecord) {
    this.eventInstanceReportRecord = eventInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eventInstanceReportType
  **/

  public String getEventInstanceReportType() {
    return eventInstanceReportType;
  }

  public void setEventInstanceReportType(String eventInstanceReportType) {
    this.eventInstanceReportType = eventInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return eventInstanceReportParameters
  **/

  public String getEventInstanceReportParameters() {
    return eventInstanceReportParameters;
  }

  public void setEventInstanceReportParameters(String eventInstanceReportParameters) {
    this.eventInstanceReportParameters = eventInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return eventInstanceReport
  **/

  public Object getEventInstanceReport() {
    return eventInstanceReport;
  }

  public void setEventInstanceReport(Object eventInstanceReport) {
    this.eventInstanceReport = eventInstanceReport;
  }


}

