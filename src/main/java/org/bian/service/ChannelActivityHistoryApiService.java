/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ChannelActivityHistoryApiService {

	SDChannelActivityHistoryActivateOutputModel activate(SDChannelActivityHistoryActivateInputModel request);
	
	BQEventCaptureOutputModel captureEvent(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEventCaptureInputModel request);
	
	SDChannelActivityHistoryConfigureOutputModel configure(String sdReferenceId, SDChannelActivityHistoryConfigureInputModel request);
	
	CRChannelActivityLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRChannelActivityLogControlInputModel request);
	
	SDChannelActivityHistoryFeedbackOutputModel feedback(String sdReferenceId, SDChannelActivityHistoryFeedbackInputModel request);
	
	CRChannelActivityLogInitiateOutputModel initiate(String sdReferenceId, CRChannelActivityLogInitiateInputModel request);
	
	CRChannelActivityLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQEventRetrieveOutputModel retrieveEvent(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDChannelActivityHistoryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRChannelActivityLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRChannelActivityLogUpdateInputModel request);
	
	BQEventUpdateOutputModel updateEvent(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEventUpdateInputModel request);
	
}
