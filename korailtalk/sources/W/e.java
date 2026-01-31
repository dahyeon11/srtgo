package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.core.B0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import u.C6372C;
import z.y0;

/* loaded from: classes.dex */
public class e implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f37363a;

    public e(C6372C c6372c) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c6372c.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            B0.e("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(34) : null;
        List listAsList = outputSizes != null ? Arrays.asList((Size[]) outputSizes.clone()) : Collections.emptyList();
        this.f37363a = listAsList;
        B0.d("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + listAsList);
    }

    static boolean a(C6372C c6372c) {
        Integer num = (Integer) c6372c.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> getSupportedResolutions() {
        return new ArrayList(this.f37363a);
    }
}
