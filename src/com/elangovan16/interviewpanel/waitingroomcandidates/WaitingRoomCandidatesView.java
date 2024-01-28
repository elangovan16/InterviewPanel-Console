package com.elangovan16.interviewpanel.waitingroomcandidates;

import java.util.Queue;

import com.elangovan16.interviewpanel.dto.Candidate;

public class WaitingRoomCandidatesView {

	private WaitingRoomCandidatesViewModel waitingRoomCandidatesViewModel;

	public WaitingRoomCandidatesView() {
		waitingRoomCandidatesViewModel = new WaitingRoomCandidatesViewModel(this);
	}

	public void dispalyWaitingRoomCandidates() {
		Queue<Candidate> waitingRoomCandidatesList = waitingRoomCandidatesViewModel.getWaitingRoomCandidatesList();

		if (waitingRoomCandidatesList.size() <= 1) {
			System.out.println("\n+--WaitingRoom CandidatesList--+");
			System.out.println("WaitingRoom is empty");
			System.out.println("+------------------------------+\n");
			
		} else {
			System.out.println("\n+--WaitingRoom CandidatesList--+");
			int index = 1;
			boolean flag = true;
			for (Candidate c : waitingRoomCandidatesList) {
				if (flag) {
					Candidate current = c;
					flag = false;
				} else {
					System.out.println(index + " ." + c.getName());
					index++;
				}
			}
			System.out.println("+------------------------------+\n");
		}
	}

}
