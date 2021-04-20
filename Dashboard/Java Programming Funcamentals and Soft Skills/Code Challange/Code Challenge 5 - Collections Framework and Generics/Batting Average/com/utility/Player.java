package com.utility;

import java.util.List;

public class  Player {
    private List<Integer> scoreList;

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Integer> scoreList) {
        this.scoreList = scoreList;
    }

    public double getAverageRunScored() {
        if (scoreList.isEmpty()) {
            return 0.0;
        }

        int size = scoreList.size();
        int totalScore = 0;

        for (int score : scoreList) {
            totalScore += score;
        }

        return (double) totalScore / (double) size;
    }

    public void addScoreDetails(int score) {
        scoreList.add(score);
    }
}
