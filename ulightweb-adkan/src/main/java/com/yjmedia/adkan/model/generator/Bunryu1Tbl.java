package com.yjmedia.adkan.model.generator;

public class Bunryu1Tbl {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BUNRYU1_TBL.BUNRYU_CODE
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    private Integer bunryuCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BUNRYU1_TBL.BUNRYU_NAME
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    private String bunryuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BUNRYU1_TBL.MEDIA
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    private Integer media;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BUNRYU1_TBL.BUNRYU_CODE
     *
     * @return the value of BUNRYU1_TBL.BUNRYU_CODE
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    public Integer getBunryuCode() {
        return bunryuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BUNRYU1_TBL.BUNRYU_CODE
     *
     * @param bunryuCode the value for BUNRYU1_TBL.BUNRYU_CODE
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    public void setBunryuCode(Integer bunryuCode) {
        this.bunryuCode = bunryuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BUNRYU1_TBL.BUNRYU_NAME
     *
     * @return the value of BUNRYU1_TBL.BUNRYU_NAME
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    public String getBunryuName() {
        return bunryuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BUNRYU1_TBL.BUNRYU_NAME
     *
     * @param bunryuName the value for BUNRYU1_TBL.BUNRYU_NAME
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    public void setBunryuName(String bunryuName) {
        this.bunryuName = bunryuName == null ? null : bunryuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BUNRYU1_TBL.MEDIA
     *
     * @return the value of BUNRYU1_TBL.MEDIA
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    public Integer getMedia() {
        return media;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BUNRYU1_TBL.MEDIA
     *
     * @param media the value for BUNRYU1_TBL.MEDIA
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    public void setMedia(Integer media) {
        this.media = media;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUNRYU1_TBL
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Bunryu1Tbl other = (Bunryu1Tbl) that;
        return (this.getBunryuCode() == null ? other.getBunryuCode() == null : this.getBunryuCode().equals(other.getBunryuCode()))
            && (this.getBunryuName() == null ? other.getBunryuName() == null : this.getBunryuName().equals(other.getBunryuName()))
            && (this.getMedia() == null ? other.getMedia() == null : this.getMedia().equals(other.getMedia()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUNRYU1_TBL
     *
     * @mbggenerated Sun May 08 18:39:47 KST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBunryuCode() == null) ? 0 : getBunryuCode().hashCode());
        result = prime * result + ((getBunryuName() == null) ? 0 : getBunryuName().hashCode());
        result = prime * result + ((getMedia() == null) ? 0 : getMedia().hashCode());
        return result;
    }
}