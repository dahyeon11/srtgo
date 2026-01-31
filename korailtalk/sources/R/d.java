package R;

import Q.i;
import S.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b */
    private int f4149b;

    /* renamed from: c */
    private boolean f4150c;

    /* renamed from: e */
    Q.i f4152e;
    public final e mOwner;
    public d mTarget;
    public final b mType;

    /* renamed from: a */
    private HashSet f4148a = null;
    public int mMargin = 0;

    /* renamed from: d */
    int f4151d = -1;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4153a;

        static {
            int[] iArr = new int[b.values().length];
            f4153a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4153a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4153a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4153a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4153a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4153a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4153a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4153a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4153a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.mOwner = eVar;
        this.mType = bVar;
    }

    private boolean a(e eVar, HashSet hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == getOwner()) {
            return true;
        }
        ArrayList<d> anchors = eVar.getAnchors();
        int size = anchors.size();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = anchors.get(i8);
            if (dVar.isSimilarDimensionConnection(this) && dVar.isConnected() && a(dVar.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean connect(d dVar, int i8, int i9, boolean z8) {
        if (dVar == null) {
            reset();
            return true;
        }
        if (!z8 && !isValidConnection(dVar)) {
            return false;
        }
        this.mTarget = dVar;
        if (dVar.f4148a == null) {
            dVar.f4148a = new HashSet();
        }
        HashSet hashSet = this.mTarget.f4148a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i8 > 0) {
            this.mMargin = i8;
        } else {
            this.mMargin = 0;
        }
        this.f4151d = i9;
        return true;
    }

    public void copyFrom(d dVar, HashMap<e, e> map) {
        HashSet hashSet;
        d dVar2 = this.mTarget;
        if (dVar2 != null && (hashSet = dVar2.f4148a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.mTarget;
        if (dVar3 != null) {
            this.mTarget = map.get(dVar.mTarget.mOwner).getAnchor(dVar3.getType());
        } else {
            this.mTarget = null;
        }
        d dVar4 = this.mTarget;
        if (dVar4 != null) {
            if (dVar4.f4148a == null) {
                dVar4.f4148a = new HashSet();
            }
            this.mTarget.f4148a.add(this);
        }
        this.mMargin = dVar.mMargin;
        this.f4151d = dVar.f4151d;
    }

    public void findDependents(int i8, ArrayList<o> arrayList, o oVar) {
        HashSet hashSet = this.f4148a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                S.i.findDependents(((d) it.next()).mOwner, i8, arrayList, oVar);
            }
        }
    }

    public HashSet<d> getDependents() {
        return this.f4148a;
    }

    public int getFinalValue() {
        if (this.f4150c) {
            return this.f4149b;
        }
        return 0;
    }

    public int getMargin() {
        d dVar;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        return (this.f4151d <= -1 || (dVar = this.mTarget) == null || dVar.mOwner.getVisibility() != 8) ? this.mMargin : this.f4151d;
    }

    public final d getOpposite() {
        switch (a.f4153a[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.mOwner.mRight;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mBottom;
            case 5:
                return this.mOwner.mTop;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public e getOwner() {
        return this.mOwner;
    }

    public Q.i getSolverVariable() {
        return this.f4152e;
    }

    public d getTarget() {
        return this.mTarget;
    }

    public b getType() {
        return this.mType;
    }

    public boolean hasCenteredDependents() {
        HashSet hashSet = this.f4148a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        HashSet hashSet = this.f4148a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasFinalValue() {
        return this.f4150c;
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isConnectionAllowed(e eVar, d dVar) {
        return isConnectionAllowed(eVar);
    }

    public boolean isSideAnchor() {
        switch (a.f4153a[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(d dVar) {
        b type = dVar.getType();
        b bVar = this.mType;
        if (type == bVar) {
            return true;
        }
        switch (a.f4153a[bVar.ordinal()]) {
            case 1:
                return type != b.BASELINE;
            case 2:
            case 3:
            case 7:
                return type == b.LEFT || type == b.RIGHT || type == b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return type == b.TOP || type == b.BOTTOM || type == b.CENTER_Y || type == b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isValidConnection(d dVar) {
        if (dVar == null) {
            return false;
        }
        b type = dVar.getType();
        b bVar = this.mType;
        if (type == bVar) {
            return bVar != b.BASELINE || (dVar.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (a.f4153a[bVar.ordinal()]) {
            case 1:
                return (type == b.BASELINE || type == b.CENTER_X || type == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z8 = type == b.LEFT || type == b.RIGHT;
                if (dVar.getOwner() instanceof h) {
                    return z8 || type == b.CENTER_X;
                }
                return z8;
            case 4:
            case 5:
                boolean z9 = type == b.TOP || type == b.BOTTOM;
                if (dVar.getOwner() instanceof h) {
                    return z9 || type == b.CENTER_Y;
                }
                return z9;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isVerticalAnchor() {
        switch (a.f4153a[this.mType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public void reset() {
        HashSet hashSet;
        d dVar = this.mTarget;
        if (dVar != null && (hashSet = dVar.f4148a) != null) {
            hashSet.remove(this);
            if (this.mTarget.f4148a.size() == 0) {
                this.mTarget.f4148a = null;
            }
        }
        this.f4148a = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.f4151d = -1;
        this.f4150c = false;
        this.f4149b = 0;
    }

    public void resetFinalResolution() {
        this.f4150c = false;
        this.f4149b = 0;
    }

    public void resetSolverVariable(Q.c cVar) {
        Q.i iVar = this.f4152e;
        if (iVar == null) {
            this.f4152e = new Q.i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.reset();
        }
    }

    public void setFinalValue(int i8) {
        this.f4149b = i8;
        this.f4150c = true;
    }

    public void setGoneMargin(int i8) {
        if (isConnected()) {
            this.f4151d = i8;
        }
    }

    public void setMargin(int i8) {
        if (isConnected()) {
            this.mMargin = i8;
        }
    }

    public String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }

    public boolean isConnectionAllowed(e eVar) {
        if (a(eVar, new HashSet())) {
            return false;
        }
        e parent = getOwner().getParent();
        return parent == eVar || eVar.getParent() == parent;
    }

    public boolean connect(d dVar, int i8) {
        return connect(dVar, i8, -1, false);
    }
}
