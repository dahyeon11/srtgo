package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c implements u {

    /* renamed from: g, reason: collision with root package name */
    static final HashMap f8090g;

    /* renamed from: h, reason: collision with root package name */
    static final HashMap f8091h;

    /* renamed from: a, reason: collision with root package name */
    private final r f8092a;

    /* renamed from: b, reason: collision with root package name */
    private t f8093b;

    /* renamed from: c, reason: collision with root package name */
    private String f8094c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f8095d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f8096e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f8097f = -1;

    static {
        HashMap map = new HashMap();
        f8090g = map;
        HashMap map2 = new HashMap();
        f8091h = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public c(r rVar) {
        this.f8092a = rVar;
    }

    private static void a(int i8, androidx.constraintlayout.widget.d dVar, View view, HashMap map, int i9, int i10) {
        String str = (String) f8090g.get(Pair.create(Integer.valueOf(i9), Integer.valueOf(i10)));
        String str2 = (String) map.get(str);
        if (str2 != null) {
            String str3 = (String) f8091h.get(str);
            dVar.connect(view.getId(), i9, Integer.parseInt(str2), i10, str3 != null ? b(i8, (String) map.get(str3)) : 0);
        }
    }

    private static int b(int i8, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i8) / 160.0f);
    }

    private static void c(int i8, androidx.constraintlayout.widget.d dVar, View view, HashMap map) {
        String str = (String) map.get("layout_editor_absoluteX");
        if (str != null) {
            dVar.setEditorAbsoluteX(view.getId(), b(i8, str));
        }
        String str2 = (String) map.get("layout_editor_absoluteY");
        if (str2 != null) {
            dVar.setEditorAbsoluteY(view.getId(), b(i8, str2));
        }
    }

    private static void d(androidx.constraintlayout.widget.d dVar, View view, HashMap map, int i8) {
        String str = (String) map.get(i8 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i8 == 0) {
                dVar.setHorizontalBias(view.getId(), Float.parseFloat(str));
            } else if (i8 == 1) {
                dVar.setVerticalBias(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void e(int i8, androidx.constraintlayout.widget.d dVar, View view, HashMap map, int i9) {
        String str = (String) map.get(i9 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iB = !str.equalsIgnoreCase("wrap_content") ? b(i8, str) : -2;
            if (i9 == 0) {
                dVar.constrainWidth(view.getId(), iB);
            } else {
                dVar.constrainHeight(view.getId(), iB);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public int designAccess(int i8, String str, Object obj, float[] fArr, int i9, float[] fArr2, int i10) {
        o oVar;
        View view = (View) obj;
        if (i8 != 0) {
            r rVar = this.f8092a;
            if (rVar.f8344z == null || view == null || (oVar = (o) rVar.f8297I.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (i8 == 0) {
            return 1;
        }
        if (i8 == 1) {
            int duration = this.f8092a.f8344z.getDuration() / 16;
            oVar.d(fArr2, duration);
            return duration;
        }
        if (i8 == 2) {
            int duration2 = this.f8092a.f8344z.getDuration() / 16;
            oVar.c(fArr2, null);
            return duration2;
        }
        if (i8 != 3) {
            return -1;
        }
        this.f8092a.f8344z.getDuration();
        return oVar.h(str, fArr2, i10);
    }

    public void disableAutoTransition(boolean z8) {
        this.f8092a.O(z8);
    }

    public void dumpConstraintSet(String str) {
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            rVar.f8344z = this.f8093b;
        }
        int iX = rVar.X(str);
        System.out.println(" dumping  " + str + " (" + iX + ")");
        try {
            this.f8092a.f8344z.f(iX).dump(this.f8092a.f8344z, new int[0]);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        t tVar = this.f8092a.f8344z;
        if (tVar == null) {
            return -1;
        }
        int duration = tVar.getDuration() / 16;
        o oVar = (o) this.f8092a.f8297I.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.c(fArr, null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i8) {
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            return -1;
        }
        o oVar = (o) rVar.f8297I.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.d(fArr, i8);
        return i8;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        t tVar = this.f8092a.f8344z;
        if (tVar == null) {
            return;
        }
        int duration = tVar.getDuration() / 16;
        o oVar = (o) this.f8092a.f8297I.get(obj);
        if (oVar == null) {
            return;
        }
        oVar.f(fArr, duration);
    }

    public String getEndState() {
        int endState = this.f8092a.getEndState();
        if (this.f8097f == endState) {
            return this.f8095d;
        }
        String strU = this.f8092a.U(endState);
        if (strU != null) {
            this.f8095d = strU;
            this.f8097f = endState;
        }
        return strU;
    }

    public int getKeyFrameInfo(Object obj, int i8, int[] iArr) {
        o oVar = (o) this.f8092a.f8297I.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.getKeyFrameInfo(i8, iArr);
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public float getKeyFramePosition(Object obj, int i8, float f8, float f9) {
        return ((o) this.f8092a.f8297I.get((View) obj)).m(i8, f8, f9);
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        o oVar = (o) this.f8092a.f8297I.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.getkeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i8, int i9, int i10) {
        r rVar = this.f8092a;
        t tVar = rVar.f8344z;
        if (tVar == null) {
            return null;
        }
        return tVar.k(rVar.getContext(), i8, i9, i10);
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public Object getKeyframeAtLocation(Object obj, float f8, float f9) {
        o oVar;
        View view = (View) obj;
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            return -1;
        }
        if (view == null || (oVar = (o) rVar.f8297I.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.n(viewGroup.getWidth(), viewGroup.getHeight(), f8, f9);
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public Boolean getPositionKeyframe(Object obj, Object obj2, float f8, float f9, String[] strArr, float[] fArr) {
        if (!(obj instanceof k)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        ((o) this.f8092a.f8297I.get(view)).s(view, (k) obj, f8, f9, strArr, fArr);
        this.f8092a.rebuildScene();
        this.f8092a.f8312Q = true;
        return Boolean.TRUE;
    }

    public float getProgress() {
        return this.f8092a.getProgress();
    }

    public String getStartState() {
        int startState = this.f8092a.getStartState();
        if (this.f8096e == startState) {
            return this.f8094c;
        }
        String strU = this.f8092a.U(startState);
        if (strU != null) {
            this.f8094c = strU;
            this.f8096e = startState;
        }
        return this.f8092a.U(startState);
    }

    public String getState() {
        if (this.f8094c != null && this.f8095d != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.f8094c;
            }
            if (progress >= 0.99f) {
                return this.f8095d;
            }
        }
        return this.f8094c;
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public long getTransitionTimeMs() {
        return this.f8092a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        return (this.f8094c == null || this.f8095d == null) ? false : true;
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public void setAttributes(int i8, String str, Object obj, Object obj2) throws NumberFormatException {
        View view = (View) obj;
        HashMap map = (HashMap) obj2;
        int iX = this.f8092a.X(str);
        androidx.constraintlayout.widget.d dVarF = this.f8092a.f8344z.f(iX);
        if (dVarF == null) {
            return;
        }
        dVarF.clear(view.getId());
        e(i8, dVarF, view, map, 0);
        e(i8, dVarF, view, map, 1);
        a(i8, dVarF, view, map, 6, 6);
        a(i8, dVarF, view, map, 6, 7);
        a(i8, dVarF, view, map, 7, 7);
        a(i8, dVarF, view, map, 7, 6);
        a(i8, dVarF, view, map, 1, 1);
        a(i8, dVarF, view, map, 1, 2);
        a(i8, dVarF, view, map, 2, 2);
        a(i8, dVarF, view, map, 2, 1);
        a(i8, dVarF, view, map, 3, 3);
        a(i8, dVarF, view, map, 3, 4);
        a(i8, dVarF, view, map, 4, 3);
        a(i8, dVarF, view, map, 4, 4);
        a(i8, dVarF, view, map, 5, 5);
        d(dVarF, view, map, 0);
        d(dVarF, view, map, 1);
        c(i8, dVarF, view, map);
        this.f8092a.updateState(iX, dVarF);
        this.f8092a.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public void setKeyFrame(Object obj, int i8, String str, Object obj2) {
        t tVar = this.f8092a.f8344z;
        if (tVar != null) {
            tVar.setKeyframe((View) obj, i8, str, obj2);
            r rVar = this.f8092a;
            rVar.f8309O = i8 / 100.0f;
            rVar.f8305M = 0.0f;
            rVar.rebuildScene();
            this.f8092a.P(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public boolean setKeyFramePosition(Object obj, int i8, int i9, float f8, float f9) {
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            return false;
        }
        o oVar = (o) rVar.f8297I.get(obj);
        r rVar2 = this.f8092a;
        int i10 = (int) (rVar2.f8303L * 100.0f);
        if (oVar == null) {
            return false;
        }
        View view = (View) obj;
        if (!rVar2.f8344z.s(view, i10)) {
            return false;
        }
        float fM = oVar.m(2, f8, f9);
        float fM2 = oVar.m(5, f8, f9);
        this.f8092a.f8344z.setKeyframe(view, i10, "motion:percentX", Float.valueOf(fM));
        this.f8092a.f8344z.setKeyframe(view, i10, "motion:percentY", Float.valueOf(fM2));
        this.f8092a.rebuildScene();
        this.f8092a.P(true);
        this.f8092a.invalidate();
        return true;
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof d) {
            ((d) obj).setValue(str, obj2);
            this.f8092a.rebuildScene();
            this.f8092a.f8312Q = true;
        }
    }

    public void setState(String str) throws NumberFormatException {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f8094c == str) {
            return;
        }
        this.f8094c = str;
        this.f8095d = null;
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            rVar.f8344z = this.f8093b;
        }
        int iX = rVar.X(str);
        this.f8096e = iX;
        if (iX != 0) {
            if (iX == this.f8092a.getStartState()) {
                this.f8092a.setProgress(0.0f);
            } else if (iX == this.f8092a.getEndState()) {
                this.f8092a.setProgress(1.0f);
            } else {
                this.f8092a.transitionToState(iX);
                this.f8092a.setProgress(1.0f);
            }
        }
        this.f8092a.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public void setToolPosition(float f8) {
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            rVar.f8344z = this.f8093b;
        }
        rVar.setProgress(f8);
        this.f8092a.P(true);
        this.f8092a.requestLayout();
        this.f8092a.invalidate();
    }

    public void setTransition(String str, String str2) throws NumberFormatException {
        r rVar = this.f8092a;
        if (rVar.f8344z == null) {
            rVar.f8344z = this.f8093b;
        }
        int iX = rVar.X(str);
        int iX2 = this.f8092a.X(str2);
        this.f8092a.setTransition(iX, iX2);
        this.f8096e = iX;
        this.f8097f = iX2;
        this.f8094c = str;
        this.f8095d = str2;
    }

    public void setViewDebug(Object obj, int i8) {
        o oVar = (o) this.f8092a.f8297I.get(obj);
        if (oVar != null) {
            oVar.setDrawPath(i8);
            this.f8092a.invalidate();
        }
    }

    public Object getKeyframe(Object obj, int i8, int i9) {
        if (this.f8092a.f8344z == null) {
            return null;
        }
        int id = ((View) obj).getId();
        r rVar = this.f8092a;
        return rVar.f8344z.k(rVar.getContext(), i8, id, i9);
    }
}
