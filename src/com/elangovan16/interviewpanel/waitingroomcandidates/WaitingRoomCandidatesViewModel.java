package com.elangovan16.interviewpanel.waitingroomcandidates;

import java.util.Queue;

import com.elangovan16.interviewpanel.dto.Candidate;
import com.elangovan16.interviewpanel.repository.InterviewPanelRepository;

public class WaitingRoomCandidatesViewModel {
	private WaitingRoomCandidatesView waitingRoomCandidatesView;

	public WaitingRoomCandidatesViewModel(WaitingRoomCandidatesView waitingRoomCandidatesView) {
		this.waitingRoomCandidatesView = waitingRoomCandidatesView;
	}

	public Queue<Candidate> getWaitingRoomCandidatesList() {
		return InterviewPanelRepository.getInstance().getWaitingRoomCandidatesList();
	}
	
	
}
