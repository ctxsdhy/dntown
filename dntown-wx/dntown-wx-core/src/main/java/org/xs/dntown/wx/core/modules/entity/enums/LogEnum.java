package org.xs.dntown.wx.core.modules.entity.enums;

public enum LogEnum {
	
	info("0", "信息"),
	error("1", "报错");
	 
	private String value;
    private String desc;
 
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }
 
    public String getDesc() {
        return desc;
    }
 
    public void setDesc(String desc) {
        this.desc = desc;
    }
 
    private LogEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
