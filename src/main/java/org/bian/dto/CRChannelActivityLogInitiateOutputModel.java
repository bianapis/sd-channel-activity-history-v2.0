package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityLogInitiateOutputModelChannelActivityLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogInitiateOutputModel
 */
public class CRChannelActivityLogInitiateOutputModel   {
  private String channelActivityLogInstanceReference = null;

  private String channelActivityLogInitiateActionReference = null;

  private Object channelActivityLogInitiateActionRecord = null;

  private String channelActivityLogInstanceStatus = null;

  private CRChannelActivityLogInitiateOutputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Channel Activity Log instance 
   * @return channelActivityLogInstanceReference
  **/

  public String getChannelActivityLogInstanceReference() {
    return channelActivityLogInstanceReference;
  }

  public void setChannelActivityLogInstanceReference(String channelActivityLogInstanceReference) {
    this.channelActivityLogInstanceReference = channelActivityLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return channelActivityLogInitiateActionReference
  **/

  public String getChannelActivityLogInitiateActionReference() {
    return channelActivityLogInitiateActionReference;
  }

  public void setChannelActivityLogInitiateActionReference(String channelActivityLogInitiateActionReference) {
    this.channelActivityLogInitiateActionReference = channelActivityLogInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return channelActivityLogInitiateActionRecord
  **/

  public Object getChannelActivityLogInitiateActionRecord() {
    return channelActivityLogInitiateActionRecord;
  }

  public void setChannelActivityLogInitiateActionRecord(Object channelActivityLogInitiateActionRecord) {
    this.channelActivityLogInitiateActionRecord = channelActivityLogInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Channel Activity Log instance (e.g. initialised, pending, active) 
   * @return channelActivityLogInstanceStatus
  **/

  public String getChannelActivityLogInstanceStatus() {
    return channelActivityLogInstanceStatus;
  }

  public void setChannelActivityLogInstanceStatus(String channelActivityLogInstanceStatus) {
    this.channelActivityLogInstanceStatus = channelActivityLogInstanceStatus;
  }


  /**
   * Get channelActivityLogInstanceRecord
   * @return channelActivityLogInstanceRecord
  **/

  public CRChannelActivityLogInitiateOutputModelChannelActivityLogInstanceRecord getChannelActivityLogInstanceRecord() {
    return channelActivityLogInstanceRecord;
  }

  public void setChannelActivityLogInstanceRecord(CRChannelActivityLogInitiateOutputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord) {
    this.channelActivityLogInstanceRecord = channelActivityLogInstanceRecord;
  }


}

