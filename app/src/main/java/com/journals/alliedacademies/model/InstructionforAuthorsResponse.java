package com.journals.alliedacademies.model;

import com.google.gson.annotations.SerializedName;

public class InstructionforAuthorsResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("abt_journal")
    private int abtJournal;
    @SerializedName("inst_author_details")
    private String instAuthorDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbtJournal() {
        return abtJournal;
    }

    public void setAbtJournal(int abtJournal) {
        this.abtJournal = abtJournal;
    }

    public String getInstAuthorDetails() {
        return instAuthorDetails;
    }

    public void setInstAuthorDetails(String instAuthorDetails) {
        this.instAuthorDetails = instAuthorDetails;
    }
}
