package com.briup.apps.poll.bean;

public class Options {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_options.id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_options.label
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_options.score
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_options.question_id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private Long questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_options.name
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_options.id
     *
     * @return the value of poll_options.id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_options.id
     *
     * @param id the value for poll_options.id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_options.label
     *
     * @return the value of poll_options.label
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_options.label
     *
     * @param label the value for poll_options.label
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_options.score
     *
     * @return the value of poll_options.score
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_options.score
     *
     * @param score the value for poll_options.score
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_options.question_id
     *
     * @return the value of poll_options.question_id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_options.question_id
     *
     * @param questionId the value for poll_options.question_id
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_options.name
     *
     * @return the value of poll_options.name
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_options.name
     *
     * @param name the value for poll_options.name
     *
     * @mbg.generated Tue Jun 26 09:43:09 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}