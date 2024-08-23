package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsAlterTableSetFileFormat implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.value_oid")
    private Long valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    public OdpsAlterTableSetFileFormat(Long oid, Long valueOid) {
        this.oid = oid;
        this.valueOid = valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    public OdpsAlterTableSetFileFormat() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.value_oid")
    public Long getValueOid() {
        return valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.value_oid")
    public void setValueOid(Long valueOid) {
        this.valueOid = valueOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
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
        OdpsAlterTableSetFileFormat other = (OdpsAlterTableSetFileFormat) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getValueOid() == null ? other.getValueOid() == null : this.getValueOid().equals(other.getValueOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getValueOid() == null) ? 0 : getValueOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", valueOid=").append(valueOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}