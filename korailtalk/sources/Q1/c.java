package Q1;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import y1.o;
import y1.p;
import y1.q;
import y1.s;
import y1.y;

/* loaded from: classes.dex */
public abstract class c {

    public static abstract class a {
        public abstract List<b> getImages();

        public abstract CharSequence getText();
    }

    public static abstract class b {
        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    /* renamed from: Q1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0068c {
        void onNativeAdLoaded(c cVar);
    }

    public interface d {
    }

    protected abstract Object a();

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @Deprecated
    public abstract void enableCustomClickGesture();

    public abstract a getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract b getIcon();

    public abstract List<b> getImages();

    public abstract o getMediaContent();

    public abstract List<q> getMuteThisAdReasons();

    public abstract String getPrice();

    public abstract y getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(q qVar);

    public abstract void performClick(Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setMuteThisAdListener(p pVar);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void setUnconfirmedClickListener(d dVar);
}
