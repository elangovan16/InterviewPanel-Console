package com.elangovan16.interviewpanel.removecandidate;

import java.util.Timer;
import java.util.TimerTask;
import com.elangovan16.interviewpanel.dto.Candidate;

public class RemoveCandidateView extends TimerTask {

	static String Magenta = "\u001B[45m";
	static String reset = "\u001b[0m";
	private RemoveCandidateViewModel removeCandidateViewModel;

	public RemoveCandidateView() {
		removeCandidateViewModel = new RemoveCandidateViewModel(this);
	}

	public void start(boolean flag) {
		Timer time = new Timer();
		if(flag)
		time.schedule(this, 20000, 20000);
		else {
			time.cancel();
			this.cancel();
		}
	}

	@Override
	public void run() {
		RemoveCandidateView remove = new RemoveCandidateView();
		remove.removeCurrentCandidate();
	}

	public void removeCurrentCandidate() {
		Candidate currentCandidate = removeCandidateViewModel.removeCurrentCandidate();
		if (currentCandidate != null) {
			System.out.println("Interview Completed for ---> " + Magenta + currentCandidate.getName() + reset);
		} else {

		}
	}

}
