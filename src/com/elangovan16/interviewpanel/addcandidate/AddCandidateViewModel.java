package com.elangovan16.interviewpanel.addcandidate;

import com.elangovan16.interviewpanel.dto.Candidate;
import com.elangovan16.interviewpanel.repository.InterviewPanelRepository;

public class AddCandidateViewModel {
private AddCandidateView addCandidateView;
	
	public AddCandidateViewModel(AddCandidateView addCandidateView){
		this.addCandidateView = addCandidateView;
	}
	
	public void validate(Candidate candidate) {
		if(candidate.getName().length()>=3&&candidate.getName().length()<50) {
			
			InterviewPanelRepository.getInstance().insertCandidate(candidate);
			
			this.addCandidateView.onSuccess();
		}else {
			this.addCandidateView.showError("Invalid Name-Name length should be min 3 and Max 50");
		}
		
	}
}
