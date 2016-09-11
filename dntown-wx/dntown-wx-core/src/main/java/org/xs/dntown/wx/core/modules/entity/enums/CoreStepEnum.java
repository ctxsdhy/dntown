package org.xs.dntown.wx.core.modules.entity.enums;

public enum CoreStepEnum {
	
	normal("0", "正常"),
	name("1", "取名");
	 
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
 
    private CoreStepEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
