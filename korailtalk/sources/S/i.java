package S;

import R.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i {
    private static o a(ArrayList arrayList, int i8) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (i8 == oVar.f4578b) {
                return oVar;
            }
        }
        return null;
    }

    public static o findDependents(R.e eVar, int i8, ArrayList<o> arrayList, o oVar) {
        int iFindGroupInDependents;
        int i9 = i8 == 0 ? eVar.horizontalGroup : eVar.verticalGroup;
        if (i9 != -1 && (oVar == null || i9 != oVar.f4578b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i10);
                if (oVar2.getId() == i9) {
                    if (oVar != null) {
                        oVar.moveTo(i8, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof R.j) && (iFindGroupInDependents = ((R.j) eVar).findGroupInDependents(i8)) != -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i11);
                    if (oVar3.getId() == iFindGroupInDependents) {
                        oVar = oVar3;
                        break;
                    }
                    i11++;
                }
            }
            if (oVar == null) {
                oVar = new o(i8);
            }
            arrayList.add(oVar);
        }
        if (oVar.add(eVar)) {
            if (eVar instanceof R.h) {
                R.h hVar = (R.h) eVar;
                hVar.getAnchor().findDependents(hVar.getOrientation() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i8 == 0) {
                eVar.horizontalGroup = oVar.getId();
                eVar.mLeft.findDependents(i8, arrayList, oVar);
                eVar.mRight.findDependents(i8, arrayList, oVar);
            } else {
                eVar.verticalGroup = oVar.getId();
                eVar.mTop.findDependents(i8, arrayList, oVar);
                eVar.mBaseline.findDependents(i8, arrayList, oVar);
                eVar.mBottom.findDependents(i8, arrayList, oVar);
            }
            eVar.mCenter.findDependents(i8, arrayList, oVar);
        }
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:424:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean simpleSolvingPass(R.f r16, S.b.InterfaceC0072b r17) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.i.simpleSolvingPass(R.f, S.b$b):boolean");
    }

    public static boolean validInGroup(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
