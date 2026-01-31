package d0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5300b {

    /* renamed from: d0.b$a */
    public interface a {
        void obtainBounds(Object obj, Rect rect);
    }

    /* renamed from: d0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0271b {
        Object get(Object obj, int i8);

        int size(Object obj);
    }

    /* renamed from: d0.b$c */
    private static class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f29949a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f29950b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        private final boolean f29951c;

        /* renamed from: d, reason: collision with root package name */
        private final a f29952d;

        c(boolean z8, a aVar) {
            this.f29951c = z8;
            this.f29952d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f29949a;
            Rect rect2 = this.f29950b;
            this.f29952d.obtainBounds(obj, rect);
            this.f29952d.obtainBounds(obj2, rect2);
            int i8 = rect.top;
            int i9 = rect2.top;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.left;
            int i11 = rect2.left;
            if (i10 < i11) {
                return this.f29951c ? 1 : -1;
            }
            if (i10 > i11) {
                return this.f29951c ? -1 : 1;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            int i14 = rect.right;
            int i15 = rect2.right;
            if (i14 < i15) {
                return this.f29951c ? 1 : -1;
            }
            if (i14 > i15) {
                return this.f29951c ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i8, Rect rect, Rect rect2, Rect rect3) {
        boolean zB = b(i8, rect, rect2);
        if (b(i8, rect, rect3) || !zB) {
            return false;
        }
        return !h(i8, rect, rect3) || i8 == 17 || i8 == 66 || i(i8, rect, rect2) < k(i8, rect, rect3);
    }

    private static boolean b(int i8, Rect rect, Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static Object c(Object obj, ArrayList arrayList, boolean z8) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z8 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object d(Object obj, ArrayList arrayList, boolean z8) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z8 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int e(int i8, int i9) {
        return (i8 * 13 * i8) + (i9 * i9);
    }

    private static boolean f(int i8, Rect rect, Rect rect2, Rect rect3) {
        if (!g(rect, rect2, i8)) {
            return false;
        }
        if (g(rect, rect3, i8) && !a(i8, rect, rect2, rect3)) {
            return !a(i8, rect, rect3, rect2) && e(i(i8, rect, rect2), m(i8, rect, rect2)) < e(i(i8, rect, rect3), m(i8, rect, rect3));
        }
        return true;
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(L l8, InterfaceC0271b interfaceC0271b, a aVar, T t8, Rect rect, int i8) {
        Rect rect2 = new Rect(rect);
        if (i8 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i8 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i8 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int size = interfaceC0271b.size(l8);
        Rect rect3 = new Rect();
        T t9 = null;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = interfaceC0271b.get(l8, i9);
            if (obj != t8) {
                aVar.obtainBounds(obj, rect3);
                if (f(i8, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t9 = (T) obj;
                }
            }
        }
        return t9;
    }

    public static <L, T> T findNextFocusInRelativeDirection(L l8, InterfaceC0271b interfaceC0271b, a aVar, T t8, int i8, boolean z8, boolean z9) {
        int size = interfaceC0271b.size(l8);
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(interfaceC0271b.get(l8, i9));
        }
        Collections.sort(arrayList, new c(z8, aVar));
        if (i8 == 1) {
            return (T) d(t8, arrayList, z9);
        }
        if (i8 == 2) {
            return (T) c(t8, arrayList, z9);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static boolean g(Rect rect, Rect rect2, int i8) {
        if (i8 == 17) {
            int i9 = rect.right;
            int i10 = rect2.right;
            return (i9 > i10 || rect.left >= i10) && rect.left > rect2.left;
        }
        if (i8 == 33) {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            return (i11 > i12 || rect.top >= i12) && rect.top > rect2.top;
        }
        if (i8 == 66) {
            int i13 = rect.left;
            int i14 = rect2.left;
            return (i13 < i14 || rect.right <= i14) && rect.right < rect2.right;
        }
        if (i8 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i15 = rect.top;
        int i16 = rect2.top;
        return (i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom;
    }

    private static boolean h(int i8, Rect rect, Rect rect2) {
        if (i8 == 17) {
            return rect.left >= rect2.right;
        }
        if (i8 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i8 == 66) {
            return rect.right <= rect2.left;
        }
        if (i8 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int i(int i8, Rect rect, Rect rect2) {
        return Math.max(0, j(i8, rect, rect2));
    }

    private static int j(int i8, Rect rect, Rect rect2) {
        int i9;
        int i10;
        if (i8 == 17) {
            i9 = rect.left;
            i10 = rect2.right;
        } else if (i8 == 33) {
            i9 = rect.top;
            i10 = rect2.bottom;
        } else if (i8 == 66) {
            i9 = rect2.left;
            i10 = rect.right;
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i9 = rect2.top;
            i10 = rect.bottom;
        }
        return i9 - i10;
    }

    private static int k(int i8, Rect rect, Rect rect2) {
        return Math.max(1, l(i8, rect, rect2));
    }

    private static int l(int i8, Rect rect, Rect rect2) {
        int i9;
        int i10;
        if (i8 == 17) {
            i9 = rect.left;
            i10 = rect2.left;
        } else if (i8 == 33) {
            i9 = rect.top;
            i10 = rect2.top;
        } else if (i8 == 66) {
            i9 = rect2.right;
            i10 = rect.right;
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i9 = rect2.bottom;
            i10 = rect.bottom;
        }
        return i9 - i10;
    }

    private static int m(int i8, Rect rect, Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
