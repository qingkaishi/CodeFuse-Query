package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableChangeOwnerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableChangeOwner;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SqlAlterTableChangeOwnerMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    BasicColumn[] selectList = BasicColumn.columnList(oid, ownerOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableChangeOwner> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableChangeOwner> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTableChangeOwner> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTableChangeOwner> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableChangeOwner, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableChangeOwner, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int insert(SqlAlterTableChangeOwner record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableChangeOwner, c ->
            c.map(oid).toProperty("oid")
            .map(ownerOid).toProperty("ownerOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int insertMultiple(Collection<SqlAlterTableChangeOwner> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableChangeOwner, c ->
            c.map(oid).toProperty("oid")
            .map(ownerOid).toProperty("ownerOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int insertSelective(SqlAlterTableChangeOwner record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableChangeOwner, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(ownerOid).toPropertyWhenPresent("ownerOid", record::getOwnerOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default Optional<SqlAlterTableChangeOwner> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableChangeOwner, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default List<SqlAlterTableChangeOwner> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableChangeOwner, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default List<SqlAlterTableChangeOwner> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableChangeOwner, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default Optional<SqlAlterTableChangeOwner> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableChangeOwner, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableChangeOwner record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(ownerOid).equalTo(record::getOwnerOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableChangeOwner record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(ownerOid).equalToWhenPresent(record::getOwnerOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int updateByPrimaryKey(SqlAlterTableChangeOwner record) {
        return update(c ->
            c.set(ownerOid).equalTo(record::getOwnerOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    default int updateByPrimaryKeySelective(SqlAlterTableChangeOwner record) {
        return update(c ->
            c.set(ownerOid).equalToWhenPresent(record::getOwnerOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}