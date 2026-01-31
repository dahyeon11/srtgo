package R;

import S.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j extends e implements i {
    public e[] mWidgets = new e[4];
    public int mWidgetsCount = 0;

    @Override // R.i
    public void add(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i8 = this.mWidgetsCount + 1;
        e[] eVarArr = this.mWidgets;
        if (i8 > eVarArr.length) {
            this.mWidgets = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.mWidgets;
        int i9 = this.mWidgetsCount;
        eVarArr2[i9] = eVar;
        this.mWidgetsCount = i9 + 1;
    }

    public void addDependents(ArrayList<o> arrayList, int i8, o oVar) {
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            oVar.add(this.mWidgets[i9]);
        }
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            S.i.findDependents(this.mWidgets[i10], i8, arrayList, oVar);
        }
    }

    @Override // R.e
    public void copy(e eVar, HashMap<e, e> map) {
        super.copy(eVar, map);
        j jVar = (j) eVar;
        this.mWidgetsCount = 0;
        int i8 = jVar.mWidgetsCount;
        for (int i9 = 0; i9 < i8; i9++) {
            add(map.get(jVar.mWidgets[i9]));
        }
    }

    public int findGroupInDependents(int i8) {
        int i9;
        int i10;
        for (int i11 = 0; i11 < this.mWidgetsCount; i11++) {
            e eVar = this.mWidgets[i11];
            if (i8 == 0 && (i10 = eVar.horizontalGroup) != -1) {
                return i10;
            }
            if (i8 == 1 && (i9 = eVar.verticalGroup) != -1) {
                return i9;
            }
        }
        return -1;
    }

    @Override // R.i
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // R.i
    public void updateConstraints(f fVar) {
    }
}
