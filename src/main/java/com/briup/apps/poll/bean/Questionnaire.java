package com.briup.apps.poll.bean;

public class Questionnaire {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_questionnaire.id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_questionnaire.name
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_questionnaire.description
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_questionnaire.id
     *
     * @return the value of poll_questionnaire.id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_questionnaire.id
     *
     * @param id the value for poll_questionnaire.id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_questionnaire.name
     *
     * @return the value of poll_questionnaire.name
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_questionnaire.name
     *
     * @param name the value for poll_questionnaire.name
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_questionnaire.description
     *
     * @return the value of poll_questionnaire.description
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_questionnaire.description
     *
     * @param description the value for poll_questionnaire.description
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}