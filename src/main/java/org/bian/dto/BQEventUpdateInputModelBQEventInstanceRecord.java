package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEventUpdateInputModelBQEventInstanceRecordCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * BQEventUpdateInputModelBQEventInstanceRecord
 */
public class BQEventUpdateInputModelBQEventInstanceRecord   {
  private String employeeReference = null;

  private String productReference = null;

  private String productInstanceReference = null;

  private String customerContactRecordReference = null;

  private BQEventUpdateInputModelBQEventInstanceRecordCustomerContactRecord customerContactRecord = null;

  private String customerContactRecordDuration = null;

  private Object customerContactActivityRecord = null;

  private String customerContactResult = null;

  private String channelActivityHistoryReportReference = null;

  private String channelActivityHistoryReportFromto = null;

  private Object channelActivityHistoryReport = null;

  private String transactionAuthorizationResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The servicing resource for assisted customer exchanges 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The type of product involved 
   * @return productReference
  **/

  public String getProductReference() {
    return productReference;
  }

  public void setProductReference(String productReference) {
    this.productReference = productReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the specific product accessed by the proposed transaction 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the contact record for the active contact where the transaction is sourced 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public BQEventUpdateInputModelBQEventInstanceRecordCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(BQEventUpdateInputModelBQEventInstanceRecordCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the start and end date times for the contact 
   * @return customerContactRecordDuration
  **/

  public String getCustomerContactRecordDuration() {
    return customerContactRecordDuration;
  }

  public void setCustomerContactRecordDuration(String customerContactRecordDuration) {
    this.customerContactRecordDuration = customerContactRecordDuration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Description of all actions performed during the contact, including all sessions 
   * @return customerContactActivityRecord
  **/

  public Object getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(Object customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The interim result of the contact (subject to transaction approval) 
   * @return customerContactResult
  **/

  public String getCustomerContactResult() {
    return customerContactResult;
  }

  public void setCustomerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a channel activity report extracted for the customer 
   * @return channelActivityHistoryReportReference
  **/

  public String getChannelActivityHistoryReportReference() {
    return channelActivityHistoryReportReference;
  }

  public void setChannelActivityHistoryReportReference(String channelActivityHistoryReportReference) {
    this.channelActivityHistoryReportReference = channelActivityHistoryReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period for the channel activity report 
   * @return channelActivityHistoryReportFromto
  **/

  public String getChannelActivityHistoryReportFromto() {
    return channelActivityHistoryReportFromto;
  }

  public void setChannelActivityHistoryReportFromto(String channelActivityHistoryReportFromto) {
    this.channelActivityHistoryReportFromto = channelActivityHistoryReportFromto;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the report extracting recent channel activity records to support the transaction authorization decision 
   * @return channelActivityHistoryReport
  **/

  public Object getChannelActivityHistoryReport() {
    return channelActivityHistoryReport;
  }

  public void setChannelActivityHistoryReport(Object channelActivityHistoryReport) {
    this.channelActivityHistoryReport = channelActivityHistoryReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Indicates success or failure or required increased authentication level to be acquired for authorization 
   * @return transactionAuthorizationResult
  **/

  public String getTransactionAuthorizationResult() {
    return transactionAuthorizationResult;
  }

  public void setTransactionAuthorizationResult(String transactionAuthorizationResult) {
    this.transactionAuthorizationResult = transactionAuthorizationResult;
  }


}

