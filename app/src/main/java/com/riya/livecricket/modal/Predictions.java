package com.riya.livecricket.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Predictions {


    @SerializedName("STATUS")
    @Expose
    private Boolean status;
    @SerializedName("Predictions")
    @Expose
    private List<Prediction> predictions = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(List<Prediction> predictions) {
        this.predictions = predictions;
    }


    public class Prediction {

        @SerializedName("PredId")
        @Expose
        private String predId;
        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("Time")
        @Expose
        private String time;
        @SerializedName("Desc")
        @Expose
        private String desc;
        @SerializedName("Img1")
        @Expose
        private String img1;
        @SerializedName("Img2")
        @Expose
        private String img2;

        public String getPredId() {
            return predId;
        }

        public void setPredId(String predId) {
            this.predId = predId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getImg1() {
            return img1;
        }

        public void setImg1(String img1) {
            this.img1 = img1;
        }

        public String getImg2() {
            return img2;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

    }
}
