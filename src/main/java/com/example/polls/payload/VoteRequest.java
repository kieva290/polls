package com.example.polls.payload;

import org.springframework.lang.NonNull;

public class VoteRequest {

    @NonNull
    private Long choiceId;

    @NonNull
    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(@NonNull Long choiceId) {
        this.choiceId = choiceId;
    }

}
