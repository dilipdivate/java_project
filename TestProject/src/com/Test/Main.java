package com.Test;

public class Main {

	public static void main(String[] args) {

		FootballPlayer joe = new FootballPlayer("Joe");
		FootballPlayer pat = new FootballPlayer("Pat");

		FootballPlayer messi = new FootballPlayer("Messi");
		FootballPlayer rati = new FootballPlayer("Rati");

		CricketPlayer dhoni = new CricketPlayer("Dhoni");
		CricketPlayer yuvi = new CricketPlayer("Yuvi");

		CricketPlayer ponting = new CricketPlayer("Ponting");
		CricketPlayer mcgrath = new CricketPlayer("Mcgrath");

		Team<CricketPlayer> india = new Team<>("India");
		Team<CricketPlayer> australia = new Team<>("Australia");

		Team<FootballPlayer> brazil = new Team<>("Brazil");
		Team<FootballPlayer> argentina = new Team<>("Argentina");

		india.addPlayer(dhoni);
		india.addPlayer(yuvi);
		australia.addPlayer(ponting);
		australia.addPlayer(mcgrath);

		australia.addPlayer(dhoni);
		brazil.addPlayer(joe);
		brazil.addPlayer(pat);
		argentina.addPlayer(messi);
		argentina.addPlayer(rati);

		india.matchResult(australia, 1, 0);
		brazil.matchResult(argentina, 3, 8);

		System.out.println(india.numPlayers());
		System.out.println(australia.numPlayers());
		System.out.println(brazil.numPlayers());
		System.out.println(argentina.numPlayers());

		System.out.println("Rankings");
		System.out.println(india.getName() + ": " + india.ranking());
		System.out.println(australia.getName() + ": " + australia.ranking());
		System.out.println(brazil.getName() + ": " + brazil.ranking());
		System.out.println(argentina.getName() + ": " + argentina.ranking());

		System.out.println(india.compareTo(australia));
		System.out.println(brazil.compareTo(argentina));
		System.out.println(argentina.compareTo(brazil));
		System.out.println(australia.compareTo(india));

//		ArrayList<Team> teams;
//		Collections.sort(teams);

	}

}
