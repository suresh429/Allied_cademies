package com.journals.alliedacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("subcat_cnt")
    private int subcatCnt;
    @SerializedName("subcat_details")
    private List<SubcatDetailsBean> subcatDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSubcatCnt() {
        return subcatCnt;
    }

    public void setSubcatCnt(int subcatCnt) {
        this.subcatCnt = subcatCnt;
    }

    public List<SubcatDetailsBean> getSubcatDetails() {
        return subcatDetails;
    }

    public void setSubcatDetails(List<SubcatDetailsBean> subcatDetails) {
        this.subcatDetails = subcatDetails;
    }

    public static class SubcatDetailsBean {
        @SerializedName("managejournal")
        private String managejournal;
        @SerializedName("journal")
        private String journal;
        @SerializedName("journalcode")
        private String journalcode;
        @SerializedName("rel_keyword")
        private String relKeyword;
        @SerializedName("journal_logo")
        private String journalLogo;
        @SerializedName("home_url")
        private String homeUrl;
        @SerializedName("archive_url")
        private String archiveUrl;
        @SerializedName("ci_url")
        private String ciUrl;
        @SerializedName("inst_url")
        private String instUrl;
        @SerializedName("flyerimg")
        private String flyerimg;
        @SerializedName("track_paper")
        private String trackPaper;
        @SerializedName("vol_issue_name")
        private String volIssueName;

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

        public String getJournalcode() {
            return journalcode;
        }

        public void setJournalcode(String journalcode) {
            this.journalcode = journalcode;
        }

        public String getRelKeyword() {
            return relKeyword;
        }

        public void setRelKeyword(String relKeyword) {
            this.relKeyword = relKeyword;
        }

        public String getJournalLogo() {
            return journalLogo;
        }

        public void setJournalLogo(String journalLogo) {
            this.journalLogo = journalLogo;
        }

        public String getHomeUrl() {
            return homeUrl;
        }

        public void setHomeUrl(String homeUrl) {
            this.homeUrl = homeUrl;
        }

        public String getArchiveUrl() {
            return archiveUrl;
        }

        public void setArchiveUrl(String archiveUrl) {
            this.archiveUrl = archiveUrl;
        }

        public String getCiUrl() {
            return ciUrl;
        }

        public void setCiUrl(String ciUrl) {
            this.ciUrl = ciUrl;
        }

        public String getInstUrl() {
            return instUrl;
        }

        public void setInstUrl(String instUrl) {
            this.instUrl = instUrl;
        }

        public String getFlyerimg() {
            return flyerimg;
        }

        public void setFlyerimg(String flyerimg) {
            this.flyerimg = flyerimg;
        }

        public String getTrackPaper() {
            return trackPaper;
        }

        public void setTrackPaper(String trackPaper) {
            this.trackPaper = trackPaper;
        }

        public String getVolIssueName() {
            return volIssueName;
        }

        public void setVolIssueName(String volIssueName) {
            this.volIssueName = volIssueName;
        }
    }
}
