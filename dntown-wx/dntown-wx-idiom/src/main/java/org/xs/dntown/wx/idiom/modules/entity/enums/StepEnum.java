package org.xs.dntown.wx.idiom.modules.entity.enums;

public enum StepEnum {
	
	normal("0", "正常"),
	answer("1", "接龙");
	
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
 
    private StepEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
