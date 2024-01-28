package com.elangovan16.interviewpanel.repository;

import java.util.LinkedList;
import java.util.Queue;

import com.elangovan16.interviewpanel.dto.Candidate;

public class InterviewPanelRepository {
	private static InterviewPanelRepository repository;
	private Queue<Candidate> candidatesList = new LinkedList<Candidate>();

	private InterviewPanelRepository() {

	}

	public static InterviewPanelRepository getInstance() {
		if (repository == null) {
			repository = new InterviewPanelRepository();
		}
		return repository;
	}

	public void insertCandidate(Candidate candidate) {
		candidatesList.add(candidate);
	}

	public Queue<Candidate> getCandidatesList() {
		return candidatesList;
	}

	public Candidate getCurrentCandidate() {
		return candidatesList.peek();
	}

	public Queue<Candidate> getWaitingRoomCandidatesList() {
		return candidatesList;
	}

	public Candidate removeCurrentCandidate() {
		if(!candidatesList.isEmpty()) {
			return candidatesList.poll();
		}
		return null;
	}
}
