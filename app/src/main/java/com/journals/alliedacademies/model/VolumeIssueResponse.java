package com.journals.alliedacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VolumeIssueResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("vol_issue")
    private int volIssue;
    @SerializedName("vol_issue_details")
    private List<VolIssueDetailsBean> volIssueDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVolIssue() {
        return volIssue;
    }

    public void setVolIssue(int volIssue) {
        this.volIssue = volIssue;
    }

    public List<VolIssueDetailsBean> getVolIssueDetails() {
        return volIssueDetails;
    }

    public void setVolIssueDetails(List<VolIssueDetailsBean> volIssueDetails) {
        this.volIssueDetails = volIssueDetails;
    }

    public static class VolIssueDetailsBean {
        @SerializedName("sno")
        private String sno;
        @SerializedName("month")
        private String month;
        @SerializedName("year")
        private String year;
        @SerializedName("title")
        private String title;
        @SerializedName("author_names")
        private String authorNames;
        @SerializedName("abstractlink")
        private String abstractlink;
        @SerializedName("pdflink")
        private String pdflink;
        @SerializedName("fulltextlink")
        private String fulltextlink;
        @SerializedName("sup_file")
        private String supFile;
        @SerializedName("journal")
        private String journal;
        @SerializedName("page_num")
        private String pageNum;
        @SerializedName("lpage_num")
        private String lpageNum;
        @SerializedName("art_img")
        private Object artImg;
        @SerializedName("doi_num")
        private Object doiNum;
        @SerializedName("doi_stat")
        private String doiStat;
        @SerializedName("art_type")
        private String artType;
        @SerializedName("volume")
        private String volume;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthorNames() {
            return authorNames;
        }

        public void setAuthorNames(String authorNames) {
            this.authorNames = authorNames;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getSupFile() {
            return supFile;
        }

        public void setSupFile(String supFile) {
            this.supFile = supFile;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getPageNum() {
            return pageNum;
        }

        public void setPageNum(String pageNum) {
            this.pageNum = pageNum;
        }

        public String getLpageNum() {
            return lpageNum;
        }

        public void setLpageNum(String lpageNum) {
            this.lpageNum = lpageNum;
        }

        public Object getArtImg() {
            return artImg;
        }

        public void setArtImg(Object artImg) {
            this.artImg = artImg;
        }

        public Object getDoiNum() {
            return doiNum;
        }

        public void setDoiNum(Object doiNum) {
            this.doiNum = doiNum;
        }

        public String getDoiStat() {
            return doiStat;
        }

        public void setDoiStat(String doiStat) {
            this.doiStat = doiStat;
        }

        public String getArtType() {
            return artType;
        }

        public void setArtType(String artType) {
            this.artType = artType;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }
    }
}
