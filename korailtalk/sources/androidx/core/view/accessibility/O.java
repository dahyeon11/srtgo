package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public interface O {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Bundle f9167a;

        public void setBundle(Bundle bundle) {
            this.f9167a = bundle;
        }
    }

    public static final class b extends a {
        public boolean getExtendSelection() {
            return this.f9167a.getBoolean(H.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        }

        public int getGranularity() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        }
    }

    public static final class c extends a {
        public String getHTMLElement() {
            return this.f9167a.getString(H.ACTION_ARGUMENT_HTML_ELEMENT_STRING);
        }
    }

    public static final class d extends a {
        public int getX() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_MOVE_WINDOW_X);
        }

        public int getY() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_MOVE_WINDOW_Y);
        }
    }

    public static final class e extends a {
        public int getColumn() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_COLUMN_INT);
        }

        public int getRow() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_ROW_INT);
        }
    }

    public static final class f extends a {
        public float getProgress() {
            return this.f9167a.getFloat(H.ACTION_ARGUMENT_PROGRESS_VALUE);
        }
    }

    public static final class g extends a {
        public int getEnd() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_SELECTION_END_INT);
        }

        public int getStart() {
            return this.f9167a.getInt(H.ACTION_ARGUMENT_SELECTION_START_INT);
        }
    }

    public static final class h extends a {
        public CharSequence getText() {
            return this.f9167a.getCharSequence(H.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE);
        }
    }

    boolean perform(View view, a aVar);
}
