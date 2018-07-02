package com.xhs.videoplayer;

/**
 * Created by 布鲁斯.李 on 2018/7/2.
 * Email:zp18595658325@163.com
 */

public class SwitchVideoModel {

        private String url;
        private String name;

        public SwitchVideoModel(String name, String url) {
            this.name = name;
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

