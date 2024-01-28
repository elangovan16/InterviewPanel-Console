package com.elangovan16.interviewpanel;

import java.util.Scanner;

import com.elangovan16.interviewpanel.addcandidate.AddCandidateView;
import com.elangovan16.interviewpanel.removecandidate.RemoveCandidateView;
import com.elangovan16.interviewpanel.viewcurrentcandidate.ViewCurrentCandidateView;
import com.elangovan16.interviewpanel.waitingroomcandidates.WaitingRoomCandidatesView;

public class InterviewPanel {

	static String green = "\u001b[32m"; // green ANSI
	static String reset = "\u001b[0m";
	static String red = "\u001b[31m";
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		InterviewPanel interviewPanel = new InterviewPanel();
		interviewPanel.startIntrview();
	}

	private void startIntrview() {
		boolean flag = true;
		int choice;
		RemoveCandidateView process = new RemoveCandidateView();
		process.start(true);
		do {
			consoleDetails();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1 -> {
				AddCandidateView addCandidate = new AddCandidateView();
				addCandidate.getCandidateInfo();
			}
			case 2 -> {
				ViewCurrentCandidateView viewCurrentCandidate = new ViewCurrentCandidateView();
				viewCurrentCandidate.displayCurrentCandidate();
			}
			case 3 -> {
				WaitingRoomCandidatesView waitingRoomCandidates = new WaitingRoomCandidatesView();
				waitingRoomCandidates.dispalyWaitingRoomCandidates();
			}
			case 0 -> {
				System.out.println(green + "InterviewPanel Application was closeing..." + reset);
				flag = false;
			}
			default -> {
				System.out.println(red + "Invalid choice. Please Enter Valid Choice." + reset);
			}
			}
		} while (flag);
		process.start(false);
		sc.close();
	}

	private void consoleDetails() {
		System.out.println("+-----------------------------+");
		System.out.println("|       Interview Panel       |");
		System.out.println("+-----------------------------+");
		System.out.println("|  1 .Add Candidate           |");
		System.out.println("|  2 .View Current Candidate  |");
		System.out.println("|  3 .WaitingRoom Candidates  |");
		System.out.println("|  0 .Exit...                 |");
		System.out.println("+-----------------------------+");
		System.out.println("Enter your Choice -----> ");
	}

}
