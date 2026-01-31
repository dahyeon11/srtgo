package com.j256.ormlite.table;

import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.DatabaseFieldConfigLoader;
import com.j256.ormlite.misc.SqlExceptionUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DatabaseTableConfigLoader {
    private static final String CONFIG_FILE_END_MARKER = "# --table-end--";
    private static final String CONFIG_FILE_FIELDS_END = "# --table-fields-end--";
    private static final String CONFIG_FILE_FIELDS_START = "# --table-fields-start--";
    private static final String CONFIG_FILE_START_MARKER = "# --table-start--";
    private static final String FIELD_NAME_DATA_CLASS = "dataClass";
    private static final String FIELD_NAME_TABLE_NAME = "tableName";

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.j256.ormlite.table.DatabaseTableConfig<T> fromReader(java.io.BufferedReader r6) throws java.sql.SQLException, java.io.IOException {
        /*
            com.j256.ormlite.table.DatabaseTableConfig r0 = new com.j256.ormlite.table.DatabaseTableConfig
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            java.lang.String r3 = r6.readLine()     // Catch: java.io.IOException -> L6a
            if (r3 != 0) goto Le
            goto L16
        Le:
            java.lang.String r4 = "# --table-end--"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L1b
        L16:
            if (r2 == 0) goto L19
            return r0
        L19:
            r6 = 0
            return r6
        L1b:
            java.lang.String r4 = "# --table-fields-start--"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L27
            readFields(r6, r0)
            goto L7
        L27:
            int r4 = r3.length()
            if (r4 == 0) goto L7
            java.lang.String r4 = "#"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L7
            java.lang.String r4 = "# --table-start--"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L3e
            goto L7
        L3e:
            java.lang.String r2 = "="
            r4 = -2
            java.lang.String[] r2 = r3.split(r2, r4)
            int r4 = r2.length
            r5 = 2
            if (r4 != r5) goto L53
            r3 = r2[r1]
            r4 = 1
            r2 = r2[r4]
            readTableField(r0, r3, r2)
            r2 = r4
            goto L7
        L53:
            java.sql.SQLException r6 = new java.sql.SQLException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DatabaseTableConfig reading from stream cannot parse line: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L6a:
            r6 = move-exception
            java.lang.String r0 = "Could not read DatabaseTableConfig from stream"
            java.sql.SQLException r6 = com.j256.ormlite.misc.SqlExceptionUtil.create(r0, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.DatabaseTableConfigLoader.fromReader(java.io.BufferedReader):com.j256.ormlite.table.DatabaseTableConfig");
    }

    public static List<DatabaseTableConfig<?>> loadDatabaseConfigFromReader(BufferedReader bufferedReader) throws SQLException, IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            DatabaseTableConfig databaseTableConfigFromReader = fromReader(bufferedReader);
            if (databaseTableConfigFromReader == null) {
                return arrayList;
            }
            arrayList.add(databaseTableConfigFromReader);
        }
    }

    private static <T> void readFields(BufferedReader bufferedReader, DatabaseTableConfig<T> databaseTableConfig) throws SQLException, IOException {
        DatabaseFieldConfig databaseFieldConfigFromReader;
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null || line.equals(CONFIG_FILE_FIELDS_END) || (databaseFieldConfigFromReader = DatabaseFieldConfigLoader.fromReader(bufferedReader)) == null) {
                    break;
                } else {
                    arrayList.add(databaseFieldConfigFromReader);
                }
            } catch (IOException e8) {
                throw SqlExceptionUtil.create("Could not read next field from config file", e8);
            }
        }
        databaseTableConfig.setFieldConfigs(arrayList);
    }

    private static <T> void readTableField(DatabaseTableConfig<T> databaseTableConfig, String str, String str2) {
        if (!str.equals(FIELD_NAME_DATA_CLASS)) {
            if (str.equals(FIELD_NAME_TABLE_NAME)) {
                databaseTableConfig.setTableName(str2);
            }
        } else {
            try {
                databaseTableConfig.setDataClass(Class.forName(str2));
            } catch (ClassNotFoundException unused) {
                throw new IllegalArgumentException("Unknown class specified for dataClass: " + str2);
            }
        }
    }

    public static <T> void write(BufferedWriter bufferedWriter, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        try {
            writeConfig(bufferedWriter, databaseTableConfig);
        } catch (IOException e8) {
            throw SqlExceptionUtil.create("Could not write config to writer", e8);
        }
    }

    private static <T> void writeConfig(BufferedWriter bufferedWriter, DatabaseTableConfig<T> databaseTableConfig) throws SQLException, IOException {
        bufferedWriter.append(CONFIG_FILE_START_MARKER);
        bufferedWriter.newLine();
        if (databaseTableConfig.getDataClass() != null) {
            bufferedWriter.append(FIELD_NAME_DATA_CLASS).append('=').append((CharSequence) databaseTableConfig.getDataClass().getName());
            bufferedWriter.newLine();
        }
        if (databaseTableConfig.getTableName() != null) {
            bufferedWriter.append(FIELD_NAME_TABLE_NAME).append('=').append((CharSequence) databaseTableConfig.getTableName());
            bufferedWriter.newLine();
        }
        bufferedWriter.append(CONFIG_FILE_FIELDS_START);
        bufferedWriter.newLine();
        if (databaseTableConfig.getFieldConfigs() != null) {
            Iterator<DatabaseFieldConfig> it = databaseTableConfig.getFieldConfigs().iterator();
            while (it.hasNext()) {
                DatabaseFieldConfigLoader.write(bufferedWriter, it.next(), databaseTableConfig.getTableName());
            }
        }
        bufferedWriter.append(CONFIG_FILE_FIELDS_END);
        bufferedWriter.newLine();
        bufferedWriter.append(CONFIG_FILE_END_MARKER);
        bufferedWriter.newLine();
    }
}
