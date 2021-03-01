package com.journals.alliedacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeResponse {

    @SerializedName("status")
    private boolean status;
    @SerializedName("cat_cnt")
    private int catCnt;
    @SerializedName("cat_details")
    private List<CatDetailsBean> catDetails;
    @SerializedName("currissue_highlights")
    private List<CurrissueHighlightsBean> currissueHighlights;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCatCnt() {
        return catCnt;
    }

    public void setCatCnt(int catCnt) {
        this.catCnt = catCnt;
    }

    public List<CatDetailsBean> getCatDetails() {
        return catDetails;
    }

    public void setCatDetails(List<CatDetailsBean> catDetails) {
        this.catDetails = catDetails;
    }

    public List<CurrissueHighlightsBean> getCurrissueHighlights() {
        return currissueHighlights;
    }

    public void setCurrissueHighlights(List<CurrissueHighlightsBean> currissueHighlights) {
        this.currissueHighlights = currissueHighlights;
    }

    public static class CatDetailsBean {
        @SerializedName("cat_id")
        private String catId;
        @SerializedName("category_name")
        private String categoryName;
        @SerializedName("page_url")
        private String pageUrl;
        @SerializedName("cat_img")
        private String catImg;

        public String getCatId() {
            return catId;
        }

        public void setCatId(String catId) {
            this.catId = catId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getPageUrl() {
            return pageUrl;
        }

        public void setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
        }

        public String getCatImg() {
            return catImg;
        }

        public void setCatImg(String catImg) {
            this.catImg = catImg;
        }
    }

    public static class CurrissueHighlightsBean {
        @SerializedName("sno")
        private String sno;
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
        @SerializedName("art_type")
        private String artType;
        @SerializedName("abstract")
        private String abstractX;
        @SerializedName("page_num")
        private String pageNum;
        @SerializedName("lpage_num")
        private String lpageNum;
        @SerializedName("date")
        private String date;
        @SerializedName("vol")
        private String vol;
        @SerializedName("issue")
        private String issue;
        @SerializedName("rel_keyword")
        private String relKeyword;
        @SerializedName("jshort_name")
        private String jshortName;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
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

        public String getArtType() {
            return artType;
        }

        public void setArtType(String artType) {
            this.artType = artType;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
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

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public String getRelKeyword() {
            return relKeyword;
        }

        public void setRelKeyword(String relKeyword) {
            this.relKeyword = relKeyword;
        }

        public String getJshortName() {
            return jshortName;
        }

        public void setJshortName(String jshortName) {
            this.jshortName = jshortName;
        }
    }
}
