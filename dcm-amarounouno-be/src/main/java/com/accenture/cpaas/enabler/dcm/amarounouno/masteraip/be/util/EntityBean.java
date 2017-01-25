package com.accenture.cpaas.enabler.dcm.amarounouno.masteraip.be.util;

import java.io.Serializable;

public class EntityBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String tableName;
    private String jsonContent;
    
    
    public EntityBean(String tableName, String jsonContent) {
        super();
        this.tableName = tableName;
        this.jsonContent = jsonContent;
    }
    

    public EntityBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the tableName
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * @param tableName the tableName to set
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return the jsonContent
     */
    public String getJsonContent() {
        return jsonContent;
    }
    
    /**
     * @param jsonContent the jsonContent to set
     */
    public void setJsonContent(String jsonContent) {
        this.jsonContent = jsonContent;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EntityBean [tableName=");
        builder.append(tableName);
        builder.append(", jsonContent=");
        builder.append(jsonContent);
        builder.append("]");
        return builder.toString();
    }
    
}
