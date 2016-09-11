package org.xs.dntown.wx.core.modules.entity.enums;

public enum ModuleEnum {
	
	normal("0", "正常"),
	game24("1", "game24"),
	idiom("2", "idiom");
	
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
 
    private ModuleEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
