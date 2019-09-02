package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEventRetrieveOutputModelEventInstanceAnalysis
 */
public class BQEventRetrieveOutputModelEventInstanceAnalysis   {
  private Object eventInstanceAnalysisRecord = null;

  private String eventInstanceAnalysisReportType = null;

  private String eventInstanceAnalysisParameters = null;

  private Object eventInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return eventInstanceAnalysisRecord
  **/

  public Object getEventInstanceAnalysisRecord() {
    return eventInstanceAnalysisRecord;
  }

  public void setEventInstanceAnalysisRecord(Object eventInstanceAnalysisRecord) {
    this.eventInstanceAnalysisRecord = eventInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eventInstanceAnalysisReportType
  **/

  public String getEventInstanceAnalysisReportType() {
    return eventInstanceAnalysisReportType;
  }

  public void setEventInstanceAnalysisReportType(String eventInstanceAnalysisReportType) {
    this.eventInstanceAnalysisReportType = eventInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return eventInstanceAnalysisParameters
  **/

  public String getEventInstanceAnalysisParameters() {
    return eventInstanceAnalysisParameters;
  }

  public void setEventInstanceAnalysisParameters(String eventInstanceAnalysisParameters) {
    this.eventInstanceAnalysisParameters = eventInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return eventInstanceAnalysisReport
  **/

  public Object getEventInstanceAnalysisReport() {
    return eventInstanceAnalysisReport;
  }

  public void setEventInstanceAnalysisReport(Object eventInstanceAnalysisReport) {
    this.eventInstanceAnalysisReport = eventInstanceAnalysisReport;
  }


}

