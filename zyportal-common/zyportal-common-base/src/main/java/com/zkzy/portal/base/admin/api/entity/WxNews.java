package com.zkzy.portal.base.admin.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class WxNews implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.ID
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.TITLE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.AUTHOR
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.EDIT_DATE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String editDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.PUBLISH_DATE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String publishDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.MEMO
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.TYPE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.DISABLED
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private BigDecimal disabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.TITLE_PIC
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private String titlePic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WX_NEWS.CONTENT
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    private byte[] content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.ID
     *
     * @return the value of WX_NEWS.ID
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.ID
     *
     * @param id the value for WX_NEWS.ID
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.TITLE
     *
     * @return the value of WX_NEWS.TITLE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.TITLE
     *
     * @param title the value for WX_NEWS.TITLE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.AUTHOR
     *
     * @return the value of WX_NEWS.AUTHOR
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.AUTHOR
     *
     * @param author the value for WX_NEWS.AUTHOR
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.EDIT_DATE
     *
     * @return the value of WX_NEWS.EDIT_DATE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getEditDate() {
        return editDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.EDIT_DATE
     *
     * @param editDate the value for WX_NEWS.EDIT_DATE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setEditDate(String editDate) {
        this.editDate = editDate == null ? null : editDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.PUBLISH_DATE
     *
     * @return the value of WX_NEWS.PUBLISH_DATE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.PUBLISH_DATE
     *
     * @param publishDate the value for WX_NEWS.PUBLISH_DATE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate == null ? null : publishDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.MEMO
     *
     * @return the value of WX_NEWS.MEMO
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.MEMO
     *
     * @param memo the value for WX_NEWS.MEMO
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.TYPE
     *
     * @return the value of WX_NEWS.TYPE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.TYPE
     *
     * @param type the value for WX_NEWS.TYPE
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.DISABLED
     *
     * @return the value of WX_NEWS.DISABLED
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public BigDecimal getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.DISABLED
     *
     * @param disabled the value for WX_NEWS.DISABLED
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setDisabled(BigDecimal disabled) {
        this.disabled = disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.TITLE_PIC
     *
     * @return the value of WX_NEWS.TITLE_PIC
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public String getTitlePic() {
        return titlePic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.TITLE_PIC
     *
     * @param titlePic the value for WX_NEWS.TITLE_PIC
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic == null ? null : titlePic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WX_NEWS.CONTENT
     *
     * @return the value of WX_NEWS.CONTENT
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WX_NEWS.CONTENT
     *
     * @param content the value for WX_NEWS.CONTENT
     *
     * @mbggenerated Tue Aug 22 13:40:05 GMT+08:00 2017
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}