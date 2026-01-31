package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.stmt.mapped.MappedPreparedStmt;
import com.j256.ormlite.table.TableInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class StatementBuilder<T, ID> {
    private static Logger logger = LoggerFactory.getLogger((Class<?>) StatementBuilder.class);
    protected boolean addTableName;
    protected final Dao<T, ID> dao;
    protected final DatabaseType databaseType;
    protected final TableInfo<T, ID> tableInfo;
    protected final String tableName;
    protected StatementType type;
    protected Where<T, ID> where = null;

    public static class StatementInfo {
        private final List<ArgumentHolder> argList;
        private final String statement;

        /* synthetic */ StatementInfo(String str, List list, AnonymousClass1 anonymousClass1) {
            this(str, list);
        }

        public List<ArgumentHolder> getArgList() {
            return this.argList;
        }

        public String getStatement() {
            return this.statement;
        }

        private StatementInfo(String str, List<ArgumentHolder> list) {
            this.argList = list;
            this.statement = str;
        }
    }

    public enum StatementType {
        SELECT(true, true, false, false),
        SELECT_LONG(true, true, false, false),
        SELECT_RAW(true, true, false, false),
        UPDATE(true, false, true, false),
        DELETE(true, false, true, false),
        EXECUTE(false, false, false, true);

        private final boolean okForExecute;
        private final boolean okForQuery;
        private final boolean okForStatementBuilder;
        private final boolean okForUpdate;

        StatementType(boolean z8, boolean z9, boolean z10, boolean z11) {
            this.okForStatementBuilder = z8;
            this.okForQuery = z9;
            this.okForUpdate = z10;
            this.okForExecute = z11;
        }

        public boolean isOkForExecute() {
            return this.okForExecute;
        }

        public boolean isOkForQuery() {
            return this.okForQuery;
        }

        public boolean isOkForStatementBuilder() {
            return this.okForStatementBuilder;
        }

        public boolean isOkForUpdate() {
            return this.okForUpdate;
        }
    }

    protected enum WhereOperation {
        FIRST("WHERE ", null),
        AND("AND (", ") "),
        OR("OR (", ") ");

        private final String after;
        private final String before;

        WhereOperation(String str, String str2) {
            this.before = str;
            this.after = str2;
        }

        public void appendAfter(StringBuilder sb) {
            String str = this.after;
            if (str != null) {
                sb.append(str);
            }
        }

        public void appendBefore(StringBuilder sb) {
            String str = this.before;
            if (str != null) {
                sb.append(str);
            }
        }
    }

    public StatementBuilder(DatabaseType databaseType, TableInfo<T, ID> tableInfo, Dao<T, ID> dao, StatementType statementType) {
        this.databaseType = databaseType;
        this.tableInfo = tableInfo;
        this.tableName = tableInfo.getTableName();
        this.dao = dao;
        this.type = statementType;
        if (statementType.isOkForStatementBuilder()) {
            return;
        }
        throw new IllegalStateException("Building a statement from a " + statementType + " statement is not allowed");
    }

    protected abstract void appendStatementEnd(StringBuilder sb, List<ArgumentHolder> list);

    protected abstract void appendStatementStart(StringBuilder sb, List<ArgumentHolder> list);

    protected void appendStatementString(StringBuilder sb, List<ArgumentHolder> list) {
        appendStatementStart(sb, list);
        appendWhereStatement(sb, list, WhereOperation.FIRST);
        appendStatementEnd(sb, list);
    }

    protected boolean appendWhereStatement(StringBuilder sb, List<ArgumentHolder> list, WhereOperation whereOperation) {
        if (this.where == null) {
            return whereOperation == WhereOperation.FIRST;
        }
        whereOperation.appendBefore(sb);
        this.where.appendSql(this.addTableName ? this.tableName : null, sb, list);
        whereOperation.appendAfter(sb);
        return false;
    }

    protected String buildStatementString(List<ArgumentHolder> list) {
        StringBuilder sb = new StringBuilder(128);
        appendStatementString(sb, list);
        String string = sb.toString();
        logger.debug("built statement {}", string);
        return string;
    }

    @Deprecated
    public void clear() {
        reset();
    }

    protected FieldType[] getResultFieldTypes() {
        return null;
    }

    StatementType getType() {
        return this.type;
    }

    protected MappedPreparedStmt<T, ID> prepareStatement(Long l8) {
        List<ArgumentHolder> arrayList = new ArrayList<>();
        String strBuildStatementString = buildStatementString(arrayList);
        ArgumentHolder[] argumentHolderArr = (ArgumentHolder[]) arrayList.toArray(new ArgumentHolder[arrayList.size()]);
        FieldType[] resultFieldTypes = getResultFieldTypes();
        FieldType[] fieldTypeArr = new FieldType[arrayList.size()];
        for (int i8 = 0; i8 < argumentHolderArr.length; i8++) {
            fieldTypeArr[i8] = argumentHolderArr[i8].getFieldType();
        }
        if (this.type.isOkForStatementBuilder()) {
            TableInfo<T, ID> tableInfo = this.tableInfo;
            if (this.databaseType.isLimitSqlSupported()) {
                l8 = null;
            }
            return new MappedPreparedStmt<>(tableInfo, strBuildStatementString, fieldTypeArr, resultFieldTypes, argumentHolderArr, l8, this.type);
        }
        throw new IllegalStateException("Building a statement from a " + this.type + " statement is not allowed");
    }

    public StatementInfo prepareStatementInfo() {
        ArrayList arrayList = new ArrayList();
        return new StatementInfo(buildStatementString(arrayList), arrayList);
    }

    public String prepareStatementString() {
        return buildStatementString(new ArrayList());
    }

    public void reset() {
        this.where = null;
    }

    public void setWhere(Where<T, ID> where) {
        this.where = where;
    }

    protected boolean shouldPrependTableNameToColumns() {
        return false;
    }

    protected FieldType verifyColumnName(String str) {
        return this.tableInfo.getFieldTypeByColumnName(str);
    }

    public Where<T, ID> where() {
        Where<T, ID> where = new Where<>(this.tableInfo, this, this.databaseType);
        this.where = where;
        return where;
    }
}
