package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityLogInitiateInputModelChannelActivityLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogInitiateInputModel
 */
public class CRChannelActivityLogInitiateInputModel   {
  private String channelActivityHistoryServicingSessionReference = null;

  private Object channelActivityLogInitiateActionRecord = null;

  private String channelActivityLogInstanceStatus = null;

  private CRChannelActivityLogInitiateInputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return channelActivityHistoryServicingSessionReference
  **/

  public String getChannelActivityHistoryServicingSessionReference() {
    return channelActivityHistoryServicingSessionReference;
  }

  public void setChannelActivityHistoryServicingSessionReference(String channelActivityHistoryServicingSessionReference) {
    this.channelActivityHistoryServicingSessionReference = channelActivityHistoryServicingSessionReference;
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

  public CRChannelActivityLogInitiateInputModelChannelActivityLogInstanceRecord getChannelActivityLogInstanceRecord() {
    return channelActivityLogInstanceRecord;
  }

  public void setChannelActivityLogInstanceRecord(CRChannelActivityLogInitiateInputModelChannelActivityLogInstanceRecord channelActivityLogInstanceRecord) {
    this.channelActivityLogInstanceRecord = channelActivityLogInstanceRecord;
  }


}

