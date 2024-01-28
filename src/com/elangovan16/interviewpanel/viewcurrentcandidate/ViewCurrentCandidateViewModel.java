package com.elangovan16.interviewpanel.viewcurrentcandidate;

import com.elangovan16.interviewpanel.dto.Candidate;
import com.elangovan16.interviewpanel.repository.InterviewPanelRepository;

public class ViewCurrentCandidateViewModel {
	private ViewCurrentCandidateView viewCurrentCandidateView;
	public ViewCurrentCandidateViewModel(ViewCurrentCandidateView viewCurrentCandidateView) {
		this.viewCurrentCandidateView=viewCurrentCandidateView;
	}
	public Candidate getCurrentCandidate() {
		return InterviewPanelRepository.getInstance().getCurrentCandidate();
	}
	
}
