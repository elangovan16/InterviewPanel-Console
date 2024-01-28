package com.elangovan16.interviewpanel.removecandidate;

import com.elangovan16.interviewpanel.dto.Candidate;
import com.elangovan16.interviewpanel.repository.InterviewPanelRepository;

public class RemoveCandidateViewModel {

	private RemoveCandidateView removeCandidateView;

	public RemoveCandidateViewModel(RemoveCandidateView removeCandidateView) {
		this.removeCandidateView = removeCandidateView;
	}

	public Candidate removeCurrentCandidate() {
		return InterviewPanelRepository.getInstance().removeCurrentCandidate();
	}

}
