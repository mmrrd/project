package com.riya.livecricket.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PointTable {


    @SerializedName("STATUS")
    @Expose
    private Boolean status;
    @SerializedName("PointList")
    @Expose
    private List<Point> pointList = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }


    public class Point {

        @SerializedName("PointId")
        @Expose
        private String pointId;
        @SerializedName("TeamName")
        @Expose
        private String teamName;
        @SerializedName("Img")
        @Expose
        private String img;
        @SerializedName("Rank")
        @Expose
        private String rank;
        @SerializedName("Matches")
        @Expose
        private String matches;
        @SerializedName("Won")
        @Expose
        private String won;
        @SerializedName("Lost")
        @Expose
        private String lost;
        @SerializedName("TP")
        @Expose
        private String tp;
        @SerializedName("NRR")
        @Expose
        private String nrr;

        public String getPointId() {
            return pointId;
        }

        public void setPointId(String pointId) {
            this.pointId = pointId;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getMatches() {
            return matches;
        }

        public void setMatches(String matches) {
            this.matches = matches;
        }

        public String getWon() {
            return won;
        }

        public void setWon(String won) {
            this.won = won;
        }

        public String getLost() {
            return lost;
        }

        public void setLost(String lost) {
            this.lost = lost;
        }

        public String getTp() {
            return tp;
        }

        public void setTp(String tp) {
            this.tp = tp;
        }

        public String getNrr() {
            return nrr;
        }

        public void setNrr(String nrr) {
            this.nrr = nrr;
        }

    }
}
