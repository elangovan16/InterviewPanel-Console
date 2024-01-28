package com.elangovan16.interviewpanel.viewcurrentcandidate;

import com.elangovan16.interviewpanel.dto.Candidate;

public class ViewCurrentCandidateView {
	static String yellow = "\u001B[33m";
	static String reset = "\u001B[0m";
	private ViewCurrentCandidateViewModel viewCurrentCandidateViewModel;

	public ViewCurrentCandidateView() {
		viewCurrentCandidateViewModel = new ViewCurrentCandidateViewModel(this);
	}

	public void displayCurrentCandidate() {
		Candidate Candidate = viewCurrentCandidateViewModel.getCurrentCandidate();
		if (Candidate != null) {
			String currentCandidate = Candidate.getName();
			System.out.println(yellow + "The Current Candidate is : " + reset + currentCandidate);
		} else {
			System.out.println("There are No Candidates\n");
		}
	}

}
