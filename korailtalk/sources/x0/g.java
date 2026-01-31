package x0;

import ai.maum.m2u.cdk.MapIf;
import android.database.Cursor;
import com.google.firebase.messaging.AbstractC5186c;
import com.kakao.sdk.user.Constants;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import z0.InterfaceC6610b;

/* loaded from: classes.dex */
public class g {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    public final Map<String, a> columns;
    public final Set<b> foreignKeys;
    public final Set<d> indices;
    public final String name;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f37497a;
        public final int affinity;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        @Deprecated
        public a(String str, String str2, boolean z8, int i8) {
            this(str, str2, z8, i8, null, 0);
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(MapIf.E_TEXT)) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.primaryKeyPosition != aVar.primaryKeyPosition || !this.name.equals(aVar.name) || this.notNull != aVar.notNull) {
                return false;
            }
            if (this.f37497a == 1 && aVar.f37497a == 2 && (str3 = this.defaultValue) != null && !str3.equals(aVar.defaultValue)) {
                return false;
            }
            if (this.f37497a == 2 && aVar.f37497a == 1 && (str2 = aVar.defaultValue) != null && !str2.equals(this.defaultValue)) {
                return false;
            }
            int i8 = this.f37497a;
            return (i8 == 0 || i8 != aVar.f37497a || ((str = this.defaultValue) == null ? aVar.defaultValue == null : str.equals(aVar.defaultValue))) && this.affinity == aVar.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        public String toString() {
            return "Column{name='" + this.name + "', type='" + this.type + "', affinity='" + this.affinity + "', notNull=" + this.notNull + ", primaryKeyPosition=" + this.primaryKeyPosition + ", defaultValue='" + this.defaultValue + "'}";
        }

        public a(String str, String str2, boolean z8, int i8, String str3, int i9) {
            this.name = str;
            this.type = str2;
            this.notNull = z8;
            this.primaryKeyPosition = i8;
            this.affinity = a(str2);
            this.defaultValue = str3;
            this.f37497a = i9;
        }
    }

    public static class b {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = Collections.unmodifiableList(list);
            this.referenceColumnNames = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.referenceTable.equals(bVar.referenceTable) && this.onDelete.equals(bVar.onDelete) && this.onUpdate.equals(bVar.onUpdate) && this.columnNames.equals(bVar.columnNames)) {
                return this.referenceColumnNames.equals(bVar.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + "', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    static class c implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        final int f37498a;

        /* renamed from: b, reason: collision with root package name */
        final int f37499b;

        /* renamed from: c, reason: collision with root package name */
        final String f37500c;

        /* renamed from: d, reason: collision with root package name */
        final String f37501d;

        c(int i8, int i9, String str, String str2) {
            this.f37498a = i8;
            this.f37499b = i9;
            this.f37500c = str;
            this.f37501d = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            int i8 = this.f37498a - cVar.f37498a;
            return i8 == 0 ? this.f37499b - cVar.f37499b : i8;
        }
    }

    public static class d {
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public final boolean unique;

        public d(String str, boolean z8, List<String> list) {
            this.name = str;
            this.unique = z8;
            this.columns = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.unique == dVar.unique && this.columns.equals(dVar.columns)) {
                return this.name.startsWith(DEFAULT_PREFIX) ? dVar.name.startsWith(DEFAULT_PREFIX) : this.name.equals(dVar.name);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.name.startsWith(DEFAULT_PREFIX) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + '}';
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.name = str;
        this.columns = Collections.unmodifiableMap(map);
        this.foreignKeys = Collections.unmodifiableSet(set);
        this.indices = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    private static Map a(InterfaceC6610b interfaceC6610b, String str) {
        Cursor cursorQuery = interfaceC6610b.query("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorQuery.getColumnCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    map.put(string, new a(string, cursorQuery.getString(columnIndex2), cursorQuery.getInt(columnIndex3) != 0, cursorQuery.getInt(columnIndex4), cursorQuery.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorQuery.close();
        }
    }

    private static List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(Constants.ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(AbstractC5186c.a.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < count; i8++) {
            cursor.moveToPosition(i8);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set c(InterfaceC6610b interfaceC6610b, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorQuery = interfaceC6610b.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex(Constants.ID);
            int columnIndex2 = cursorQuery.getColumnIndex("seq");
            int columnIndex3 = cursorQuery.getColumnIndex("table");
            int columnIndex4 = cursorQuery.getColumnIndex("on_delete");
            int columnIndex5 = cursorQuery.getColumnIndex("on_update");
            List<c> listB = b(cursorQuery);
            int count = cursorQuery.getCount();
            for (int i8 = 0; i8 < count; i8++) {
                cursorQuery.moveToPosition(i8);
                if (cursorQuery.getInt(columnIndex2) == 0) {
                    int i9 = cursorQuery.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listB) {
                        if (cVar.f37498a == i9) {
                            arrayList.add(cVar.f37500c);
                            arrayList2.add(cVar.f37501d);
                        }
                    }
                    hashSet.add(new b(cursorQuery.getString(columnIndex3), cursorQuery.getString(columnIndex4), cursorQuery.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            cursorQuery.close();
            return hashSet;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static d d(InterfaceC6610b interfaceC6610b, String str, boolean z8) {
        Cursor cursorQuery = interfaceC6610b.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorQuery.getInt(columnIndex)), cursorQuery.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z8, arrayList);
                cursorQuery.close();
                return dVar;
            }
            cursorQuery.close();
            return null;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    private static Set e(InterfaceC6610b interfaceC6610b, String str) {
        Cursor cursorQuery = interfaceC6610b.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex(com.kakao.sdk.common.Constants.ORIGIN);
            int columnIndex3 = cursorQuery.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorQuery.moveToNext()) {
                    if (CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(cursorQuery.getString(columnIndex2))) {
                        String string = cursorQuery.getString(columnIndex);
                        boolean z8 = true;
                        if (cursorQuery.getInt(columnIndex3) != 1) {
                            z8 = false;
                        }
                        d dVarD = d(interfaceC6610b, string, z8);
                        if (dVarD == null) {
                            return null;
                        }
                        hashSet.add(dVarD);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public static g read(InterfaceC6610b interfaceC6610b, String str) {
        return new g(str, a(interfaceC6610b, str), c(interfaceC6610b, str), e(interfaceC6610b, str));
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.name;
        if (str == null ? gVar.name != null : !str.equals(gVar.name)) {
            return false;
        }
        Map<String, a> map = this.columns;
        if (map == null ? gVar.columns != null : !map.equals(gVar.columns)) {
            return false;
        }
        Set<b> set2 = this.foreignKeys;
        if (set2 == null ? gVar.foreignKeys != null : !set2.equals(gVar.foreignKeys)) {
            return false;
        }
        Set<d> set3 = this.indices;
        if (set3 == null || (set = gVar.indices) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.columns;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.foreignKeys;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public g(String str, Map<String, a> map, Set<b> set) {
        this(str, map, set, Collections.emptySet());
    }
}
