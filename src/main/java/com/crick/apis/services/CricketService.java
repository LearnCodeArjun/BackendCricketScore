package com.crick.apis.services;

import java.util.List;

import com.crick.apis.entities.Match;

public interface CricketService {
   
	//get Live matches
    List<Match> getLiveMatchScores();
    
    //get worldcup point table
    List<List<String>> getCWC2023PointTable();

    
    //get all matches
    List<Match> getAllMatches();



}
