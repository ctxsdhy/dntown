package org.xs.dntown.wx.common.persistence;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * 主键属性
 */
@MappedSuperclass
public abstract class IdEntity extends BaseEntity {
	
	@Id
	@GeneratedValue(generator="system-uuid") 
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
