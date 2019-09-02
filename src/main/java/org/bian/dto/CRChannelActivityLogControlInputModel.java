package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChannelActivityLogControlInputModelChannelActivityLogControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRChannelActivityLogControlInputModel
 */
public class CRChannelActivityLogControlInputModel   {
  private String channelActivityHistoryServicingSessionReference = null;

  private String channelActivityLogInstanceReference = null;

  private Object channelActivityLogControlActionTaskRecord = null;

  private CRChannelActivityLogControlInputModelChannelActivityLogControlActionRequest channelActivityLogControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return channelActivityLogControlActionTaskRecord
  **/

  public Object getChannelActivityLogControlActionTaskRecord() {
    return channelActivityLogControlActionTaskRecord;
  }

  public void setChannelActivityLogControlActionTaskRecord(Object channelActivityLogControlActionTaskRecord) {
    this.channelActivityLogControlActionTaskRecord = channelActivityLogControlActionTaskRecord;
  }


  /**
   * Get channelActivityLogControlActionRequest
   * @return channelActivityLogControlActionRequest
  **/

  public CRChannelActivityLogControlInputModelChannelActivityLogControlActionRequest getChannelActivityLogControlActionRequest() {
    return channelActivityLogControlActionRequest;
  }

  public void setChannelActivityLogControlActionRequest(CRChannelActivityLogControlInputModelChannelActivityLogControlActionRequest channelActivityLogControlActionRequest) {
    this.channelActivityLogControlActionRequest = channelActivityLogControlActionRequest;
  }


}

