package mall.pojo;

import mall.mapper.PropertyValueMapper;
import mall.pojo.extension.PropertyValueExtension;

public class PropertyValue extends PropertyValueExtension implements mall.pojo.ORM.POJOMapper<PropertyValueMapper> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4519785673526780363L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property_value.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property_value.ptid
     *
     * @mbg.generated
     */
    private Integer ptid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property_value.value
     *
     * @mbg.generated
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property_value.pid
     *
     * @return the value of property_value.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property_value.pid
     *
     * @param pid the value for property_value.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property_value.ptid
     *
     * @return the value of property_value.ptid
     *
     * @mbg.generated
     */
    public Integer getPtid() {
        return ptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property_value.ptid
     *
     * @param ptid the value for property_value.ptid
     *
     * @mbg.generated
     */
    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property_value.value
     *
     * @return the value of property_value.value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property_value.value
     *
     * @param value the value for property_value.value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}