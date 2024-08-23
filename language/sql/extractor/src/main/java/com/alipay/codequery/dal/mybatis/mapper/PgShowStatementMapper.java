package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PgShowStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PgShowStatement;
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
public interface PgShowStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, exprOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PgShowStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PgShowStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<PgShowStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="expr_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<PgShowStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pgShowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pgShowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int insert(PgShowStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgShowStatement, c ->
            c.map(oid).toProperty("oid")
            .map(exprOid).toProperty("exprOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int insertMultiple(Collection<PgShowStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pgShowStatement, c ->
            c.map(oid).toProperty("oid")
            .map(exprOid).toProperty("exprOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int insertSelective(PgShowStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgShowStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(exprOid).toPropertyWhenPresent("exprOid", record::getExprOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default Optional<PgShowStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pgShowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default List<PgShowStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pgShowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default List<PgShowStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pgShowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default Optional<PgShowStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pgShowStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(PgShowStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(exprOid).equalTo(record::getExprOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PgShowStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(exprOid).equalToWhenPresent(record::getExprOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int updateByPrimaryKey(PgShowStatement record) {
        return update(c ->
            c.set(exprOid).equalTo(record::getExprOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_show_statement")
    default int updateByPrimaryKeySelective(PgShowStatement record) {
        return update(c ->
            c.set(exprOid).equalToWhenPresent(record::getExprOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}