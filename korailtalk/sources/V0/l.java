package V0;

import a1.i;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: d */
    private final String f5144d;

    /* renamed from: f */
    private final a1.i f5146f;

    /* renamed from: a */
    private final Path f5141a = new Path();

    /* renamed from: b */
    private final Path f5142b = new Path();

    /* renamed from: c */
    private final Path f5143c = new Path();

    /* renamed from: e */
    private final List f5145e = new ArrayList();

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5147a;

        static {
            int[] iArr = new int[i.a.values().length];
            f5147a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5147a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5147a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5147a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5147a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(a1.i iVar) {
        this.f5144d = iVar.getName();
        this.f5146f = iVar;
    }

    private void a() {
        for (int i8 = 0; i8 < this.f5145e.size(); i8++) {
            this.f5143c.addPath(((m) this.f5145e.get(i8)).getPath());
        }
    }

    private void b(Path.Op op) {
        this.f5142b.reset();
        this.f5141a.reset();
        for (int size = this.f5145e.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f5145e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List listC = dVar.c();
                for (int size2 = listC.size() - 1; size2 >= 0; size2--) {
                    Path path = ((m) listC.get(size2)).getPath();
                    path.transform(dVar.d());
                    this.f5142b.addPath(path);
                }
            } else {
                this.f5142b.addPath(mVar.getPath());
            }
        }
        m mVar2 = (m) this.f5145e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List listC2 = dVar2.c();
            for (int i8 = 0; i8 < listC2.size(); i8++) {
                Path path2 = ((m) listC2.get(i8)).getPath();
                path2.transform(dVar2.d());
                this.f5141a.addPath(path2);
            }
        } else {
            this.f5141a.set(mVar2.getPath());
        }
        this.f5143c.op(this.f5141a, this.f5142b, op);
    }

    @Override // V0.j
    public void absorbContent(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.f5145e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // V0.m, V0.c, V0.e
    public String getName() {
        return this.f5144d;
    }

    @Override // V0.m
    public Path getPath() {
        this.f5143c.reset();
        if (this.f5146f.isHidden()) {
            return this.f5143c;
        }
        int i8 = a.f5147a[this.f5146f.getMode().ordinal()];
        if (i8 == 1) {
            a();
        } else if (i8 == 2) {
            b(Path.Op.UNION);
        } else if (i8 == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i8 == 4) {
            b(Path.Op.INTERSECT);
        } else if (i8 == 5) {
            b(Path.Op.XOR);
        }
        return this.f5143c;
    }

    @Override // V0.m, V0.c, V0.e
    public void setContents(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < this.f5145e.size(); i8++) {
            ((m) this.f5145e.get(i8)).setContents(list, list2);
        }
    }
}
