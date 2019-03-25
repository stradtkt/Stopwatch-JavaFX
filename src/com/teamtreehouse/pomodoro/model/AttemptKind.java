package com.teamtreehouse.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60),
    BREAK(5 * 60);
    private int mTotalSeconds;
    AttemptKind(int totalSeconds) {
        mTotalSeconds = totalSeconds;
    }
    private int getTotalSeconds() {
        return mTotalSeconds;
    }
}
