package com.elangovan16.interviewpanel.addcandidate;

import java.util.Scanner;
import com.elangovan16.interviewpanel.dto.Candidate;

public class AddCandidateView {
	static String green="\u001b[32m"; //green ANSI
	static String reset="\u001b[0m";
	static String red="\u001b[31m";
	
	private AddCandidateViewModel addCandidateViewModel;
	Scanner sc = new Scanner(System.in);
	public AddCandidateView() {
		addCandidateViewModel = new AddCandidateViewModel(this);
	}

	public void getCandidateInfo() {
		Candidate candidate = new Candidate();
		System.out.println("Enter the Name :");
		candidate.setName(sc.nextLine());
		addCandidateViewModel.validate(candidate);
	}

	public void onSuccess() {
		System.out.println( green+"Inserted Successfully"+reset);
	}

	public void showError(String errorMessage) {
		System.err.println(errorMessage);
	}
}
