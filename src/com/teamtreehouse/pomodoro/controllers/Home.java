package com.teamtreehouse.pomodoro.controllers;

import com.teamtreehouse.pomodoro.model.Attempt;
import com.teamtreehouse.pomodoro.model.AttemptKind;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class Home {
    @FXML
    private VBox container;

    private Attempt mCurrentAttempt;

    private void prepareAttempt(AttemptKind kind) {
        mCurrentAttempt = new Attempt(kind, "");
        addAttemptStyle(kind);
    }

    private void addAttemptStyle(AttemptKind kind) {
        container.getStyleClass().add(kind.toString().toLowerCase());
    }

    private void clearAttemptStyles() {
        for (AttemptKind kind : AttemptKind.values()) {
            container.getStyleClass().remove(kind.toString().toLowerCase());
        }
    }
}
