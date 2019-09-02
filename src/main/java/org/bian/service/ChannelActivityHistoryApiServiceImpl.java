/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ChannelActivityHistoryApiServiceImpl implements ChannelActivityHistoryApiService {

	public SDChannelActivityHistoryActivateOutputModel activate(SDChannelActivityHistoryActivateInputModel request){
		return JsonReader.read("activate-SDChannelActivityHistoryActivateOutputModel.json",new TypeReference<SDChannelActivityHistoryActivateOutputModel>(){});
	}
	
	public BQEventCaptureOutputModel captureEvent(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEventCaptureInputModel request){
		return JsonReader.read("capture-BQEventCaptureOutputModel.json",new TypeReference<BQEventCaptureOutputModel>(){});
	}
	
	public SDChannelActivityHistoryConfigureOutputModel configure(String sdReferenceId, SDChannelActivityHistoryConfigureInputModel request){
		return JsonReader.read("configure-SDChannelActivityHistoryConfigureOutputModel.json",new TypeReference<SDChannelActivityHistoryConfigureOutputModel>(){});
	}
	
	public CRChannelActivityLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRChannelActivityLogControlInputModel request){
		return JsonReader.read("control-CRChannelActivityLogControlOutputModel.json",new TypeReference<CRChannelActivityLogControlOutputModel>(){});
	}
	
	public SDChannelActivityHistoryFeedbackOutputModel feedback(String sdReferenceId, SDChannelActivityHistoryFeedbackInputModel request){
		return JsonReader.read("feedback-SDChannelActivityHistoryFeedbackOutputModel.json",new TypeReference<SDChannelActivityHistoryFeedbackOutputModel>(){});
	}
	
	public CRChannelActivityLogInitiateOutputModel initiate(String sdReferenceId, CRChannelActivityLogInitiateInputModel request){
		return JsonReader.read("initiate-CRChannelActivityLogInitiateOutputModel.json",new TypeReference<CRChannelActivityLogInitiateOutputModel>(){});
	}
	
	public CRChannelActivityLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRChannelActivityLogRetrieveOutputModel.json",new TypeReference<CRChannelActivityLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQEventRetrieveOutputModel retrieveEvent(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEventRetrieveOutputModel.json",new TypeReference<BQEventRetrieveOutputModel>(){});
	}
	
	public SDChannelActivityHistoryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDChannelActivityHistoryRetrieveOutputModel.json",new TypeReference<SDChannelActivityHistoryRetrieveOutputModel>(){});
	}
	
	public CRChannelActivityLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRChannelActivityLogUpdateInputModel request){
		return JsonReader.read("update-CRChannelActivityLogUpdateOutputModel.json",new TypeReference<CRChannelActivityLogUpdateOutputModel>(){});
	}
	
	public BQEventUpdateOutputModel updateEvent(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEventUpdateInputModel request){
		return JsonReader.read("update-BQEventUpdateOutputModel.json",new TypeReference<BQEventUpdateOutputModel>(){});
	}
	
}
