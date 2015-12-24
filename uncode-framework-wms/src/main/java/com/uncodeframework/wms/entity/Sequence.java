package com.uncodeframework.wms.entity;

import java.io.Serializable;

public class Sequence implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence.name
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence.current_value
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    private Integer currentValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence.increment
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    private Integer increment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sequence
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence.name
     *
     * @return the value of sequence.name
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence.name
     *
     * @param name the value for sequence.name
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence.current_value
     *
     * @return the value of sequence.current_value
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    public Integer getCurrentValue() {
        return currentValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence.current_value
     *
     * @param currentValue the value for sequence.current_value
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence.increment
     *
     * @return the value of sequence.increment
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    public Integer getIncrement() {
        return increment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence.increment
     *
     * @param increment the value for sequence.increment
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    public void setIncrement(Integer increment) {
        this.increment = increment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", currentValue=").append(currentValue);
        sb.append(", increment=").append(increment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
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
        Sequence other = (Sequence) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCurrentValue() == null ? other.getCurrentValue() == null : this.getCurrentValue().equals(other.getCurrentValue()))
            && (this.getIncrement() == null ? other.getIncrement() == null : this.getIncrement().equals(other.getIncrement()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence
     *
     * @mbggenerated Thu Dec 17 14:35:10 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCurrentValue() == null) ? 0 : getCurrentValue().hashCode());
        result = prime * result + ((getIncrement() == null) ? 0 : getIncrement().hashCode());
        return result;
    }
}