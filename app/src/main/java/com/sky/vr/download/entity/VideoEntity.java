package com.sky.vr.download.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by sky on 16-10-30.
 */
@Entity
public class VideoEntity {


    @Id(autoincrement = true)
    private long id;

    /**
     * 下载的任务id
     */
    private long tid;
    private String thumbnail;

    @NotNull
    private String displayName;

    @NotNull
    private String name;

    /**
     * 描述
     */
    private String desc;

    @NotNull
    private String dir;

    @NotNull
    private String url;

    /**
     * 下载的视频类型
     */
    private int type;

    /**
     * 添加的任务时间
     */
    private long time;

    @Generated(hash = 1829756143)
    public VideoEntity(long id, long tid, String thumbnail,
            @NotNull String displayName, @NotNull String name, String desc,
            @NotNull String dir, @NotNull String url, int type, long time) {
        this.id = id;
        this.tid = tid;
        this.thumbnail = thumbnail;
        this.displayName = displayName;
        this.name = name;
        this.desc = desc;
        this.dir = dir;
        this.url = url;
        this.type = type;
        this.time = time;
    }

    @Generated(hash = 1984976152)
    public VideoEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}