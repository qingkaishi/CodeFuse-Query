package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterTablespaceStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.add_data_file_oid")
    private Long addDataFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.drop_data_file_oid")
    private Long dropDataFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.engine_oid")
    private Long engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.initial_size_oid")
    private Long initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.is_wait")
    private Integer isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    public MySqlAlterTablespaceStatement(Long oid, Long addDataFileOid, Long dropDataFileOid, Long engineOid, Long initialSizeOid, Integer isWait, Long nameOid) {
        this.oid = oid;
        this.addDataFileOid = addDataFileOid;
        this.dropDataFileOid = dropDataFileOid;
        this.engineOid = engineOid;
        this.initialSizeOid = initialSizeOid;
        this.isWait = isWait;
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    public MySqlAlterTablespaceStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.add_data_file_oid")
    public Long getAddDataFileOid() {
        return addDataFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.add_data_file_oid")
    public void setAddDataFileOid(Long addDataFileOid) {
        this.addDataFileOid = addDataFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.drop_data_file_oid")
    public Long getDropDataFileOid() {
        return dropDataFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.drop_data_file_oid")
    public void setDropDataFileOid(Long dropDataFileOid) {
        this.dropDataFileOid = dropDataFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.engine_oid")
    public Long getEngineOid() {
        return engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.engine_oid")
    public void setEngineOid(Long engineOid) {
        this.engineOid = engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.initial_size_oid")
    public Long getInitialSizeOid() {
        return initialSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.initial_size_oid")
    public void setInitialSizeOid(Long initialSizeOid) {
        this.initialSizeOid = initialSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.is_wait")
    public Integer getIsWait() {
        return isWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.is_wait")
    public void setIsWait(Integer isWait) {
        this.isWait = isWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_tablespace_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
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
        MySqlAlterTablespaceStatement other = (MySqlAlterTablespaceStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAddDataFileOid() == null ? other.getAddDataFileOid() == null : this.getAddDataFileOid().equals(other.getAddDataFileOid()))
            && (this.getDropDataFileOid() == null ? other.getDropDataFileOid() == null : this.getDropDataFileOid().equals(other.getDropDataFileOid()))
            && (this.getEngineOid() == null ? other.getEngineOid() == null : this.getEngineOid().equals(other.getEngineOid()))
            && (this.getInitialSizeOid() == null ? other.getInitialSizeOid() == null : this.getInitialSizeOid().equals(other.getInitialSizeOid()))
            && (this.getIsWait() == null ? other.getIsWait() == null : this.getIsWait().equals(other.getIsWait()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAddDataFileOid() == null) ? 0 : getAddDataFileOid().hashCode());
        result = prime * result + ((getDropDataFileOid() == null) ? 0 : getDropDataFileOid().hashCode());
        result = prime * result + ((getEngineOid() == null) ? 0 : getEngineOid().hashCode());
        result = prime * result + ((getInitialSizeOid() == null) ? 0 : getInitialSizeOid().hashCode());
        result = prime * result + ((getIsWait() == null) ? 0 : getIsWait().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", addDataFileOid=").append(addDataFileOid);
        sb.append(", dropDataFileOid=").append(dropDataFileOid);
        sb.append(", engineOid=").append(engineOid);
        sb.append(", initialSizeOid=").append(initialSizeOid);
        sb.append(", isWait=").append(isWait);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}