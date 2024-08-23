package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlOpenStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlOpenStatement;
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
public interface SqlOpenStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, cursorNameOid, forOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlOpenStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlOpenStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cursor_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="for_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlOpenStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="cursor_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="for_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlOpenStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlOpenStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlOpenStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int insert(SqlOpenStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlOpenStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cursorNameOid).toProperty("cursorNameOid")
            .map(forOid).toProperty("forOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int insertMultiple(Collection<SqlOpenStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlOpenStatement, c ->
            c.map(oid).toProperty("oid")
            .map(cursorNameOid).toProperty("cursorNameOid")
            .map(forOid).toProperty("forOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int insertSelective(SqlOpenStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlOpenStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(cursorNameOid).toPropertyWhenPresent("cursorNameOid", record::getCursorNameOid)
            .map(forOid).toPropertyWhenPresent("forOid", record::getForOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default Optional<SqlOpenStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlOpenStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default List<SqlOpenStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlOpenStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default List<SqlOpenStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlOpenStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default Optional<SqlOpenStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlOpenStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlOpenStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(cursorNameOid).equalTo(record::getCursorNameOid)
                .set(forOid).equalTo(record::getForOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlOpenStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(cursorNameOid).equalToWhenPresent(record::getCursorNameOid)
                .set(forOid).equalToWhenPresent(record::getForOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int updateByPrimaryKey(SqlOpenStatement record) {
        return update(c ->
            c.set(cursorNameOid).equalTo(record::getCursorNameOid)
            .set(forOid).equalTo(record::getForOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_open_statement")
    default int updateByPrimaryKeySelective(SqlOpenStatement record) {
        return update(c ->
            c.set(cursorNameOid).equalToWhenPresent(record::getCursorNameOid)
            .set(forOid).equalToWhenPresent(record::getForOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}