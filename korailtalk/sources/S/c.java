package S;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: g, reason: collision with root package name */
    ArrayList f4547g;

    /* renamed from: h, reason: collision with root package name */
    private int f4548h;

    public c(R.e eVar, int i8) {
        super(eVar);
        this.f4547g = new ArrayList();
        this.orientation = i8;
        m();
    }

    private void m() {
        R.e eVar;
        R.e eVar2 = this.f4591a;
        R.e previousChainMember = eVar2.getPreviousChainMember(this.orientation);
        while (true) {
            R.e eVar3 = previousChainMember;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                previousChainMember = eVar2.getPreviousChainMember(this.orientation);
            }
        }
        this.f4591a = eVar;
        this.f4547g.add(eVar.getRun(this.orientation));
        R.e nextChainMember = eVar.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.f4547g.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator it = this.f4547g.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i8 = this.orientation;
            if (i8 == 0) {
                pVar.f4591a.horizontalChainRun = this;
            } else if (i8 == 1) {
                pVar.f4591a.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((R.f) this.f4591a.getParent()).isRtl() && this.f4547g.size() > 1) {
            ArrayList arrayList = this.f4547g;
            this.f4591a = ((p) arrayList.get(arrayList.size() - 1)).f4591a;
        }
        this.f4548h = this.orientation == 0 ? this.f4591a.getHorizontalChainStyle() : this.f4591a.getVerticalChainStyle();
    }

    private R.e n() {
        for (int i8 = 0; i8 < this.f4547g.size(); i8++) {
            p pVar = (p) this.f4547g.get(i8);
            if (pVar.f4591a.getVisibility() != 8) {
                return pVar.f4591a;
            }
        }
        return null;
    }

    private R.e o() {
        for (int size = this.f4547g.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f4547g.get(size);
            if (pVar.f4591a.getVisibility() != 8) {
                return pVar.f4591a;
            }
        }
        return null;
    }

    @Override // S.p
    public void applyToWidget() {
        for (int i8 = 0; i8 < this.f4547g.size(); i8++) {
            ((p) this.f4547g.get(i8)).applyToWidget();
        }
    }

    @Override // S.p
    void c() {
        Iterator it = this.f4547g.iterator();
        while (it.hasNext()) {
            ((p) it.next()).c();
        }
        int size = this.f4547g.size();
        if (size < 1) {
            return;
        }
        R.e eVar = ((p) this.f4547g.get(0)).f4591a;
        R.e eVar2 = ((p) this.f4547g.get(size - 1)).f4591a;
        if (this.orientation == 0) {
            R.d dVar = eVar.mLeft;
            R.d dVar2 = eVar2.mRight;
            f fVarG = g(dVar, 0);
            int margin = dVar.getMargin();
            R.e eVarN = n();
            if (eVarN != null) {
                margin = eVarN.mLeft.getMargin();
            }
            if (fVarG != null) {
                a(this.start, fVarG, margin);
            }
            f fVarG2 = g(dVar2, 0);
            int margin2 = dVar2.getMargin();
            R.e eVarO = o();
            if (eVarO != null) {
                margin2 = eVarO.mRight.getMargin();
            }
            if (fVarG2 != null) {
                a(this.end, fVarG2, -margin2);
            }
        } else {
            R.d dVar3 = eVar.mTop;
            R.d dVar4 = eVar2.mBottom;
            f fVarG3 = g(dVar3, 1);
            int margin3 = dVar3.getMargin();
            R.e eVarN2 = n();
            if (eVarN2 != null) {
                margin3 = eVarN2.mTop.getMargin();
            }
            if (fVarG3 != null) {
                a(this.start, fVarG3, margin3);
            }
            f fVarG4 = g(dVar4, 1);
            int margin4 = dVar4.getMargin();
            R.e eVarO2 = o();
            if (eVarO2 != null) {
                margin4 = eVarO2.mBottom.getMargin();
            }
            if (fVarG4 != null) {
                a(this.end, fVarG4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // S.p
    void d() {
        this.f4592b = null;
        Iterator it = this.f4547g.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
    }

    @Override // S.p
    public long getWrapDimension() {
        int size = this.f4547g.size();
        long wrapDimension = 0;
        for (int i8 = 0; i8 < size; i8++) {
            wrapDimension = wrapDimension + r4.start.f4560c + ((p) this.f4547g.get(i8)).getWrapDimension() + r4.end.f4560c;
        }
        return wrapDimension;
    }

    @Override // S.p
    boolean i() {
        int size = this.f4547g.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!((p) this.f4547g.get(i8)).i()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator it = this.f4547g.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            string = ((string + SimpleComparison.LESS_THAN_OPERATION) + pVar) + "> ";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5 A[PHI: r1 r22 r23 r24
  0x01d5: PHI (r1v61 int) = (r1v59 int), (r1v67 int) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    @Override // S.p, S.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(S.d r26) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.c.update(S.d):void");
    }
}
