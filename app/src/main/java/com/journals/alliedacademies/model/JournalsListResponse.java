package com.journals.alliedacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JournalsListResponse {


    @SerializedName("journal_cnt")
    private int journalCnt;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("journal_details")
    private List<JournalDetailsBean> journalDetails;

    public int getJournalCnt() {
        return journalCnt;
    }

    public void setJournalCnt(int journalCnt) {
        this.journalCnt = journalCnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JournalDetailsBean> getJournalDetails() {
        return journalDetails;
    }

    public void setJournalDetails(List<JournalDetailsBean> journalDetails) {
        this.journalDetails = journalDetails;
    }

    public static class JournalDetailsBean {
        @SerializedName("managejournal")
        private String managejournal;
        @SerializedName("journal")
        private String journal;

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }
    }
}
