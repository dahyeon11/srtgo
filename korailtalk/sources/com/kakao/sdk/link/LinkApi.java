package com.kakao.sdk.link;

import C7.D;
import com.kakao.sdk.link.model.ImageUploadResult;
import com.kakao.sdk.link.model.ValidationResult;
import com.kakao.sdk.template.model.DefaultTemplate;
import d8.c;
import d8.e;
import d8.f;
import d8.l;
import d8.o;
import d8.q;
import d8.t;
import java.util.Map;
import retrofit2.InterfaceC6201b;

/* loaded from: classes.dex */
public interface LinkApi {

    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC6201b scrapImage$default(LinkApi linkApi, String str, Boolean bool, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrapImage");
            }
            if ((i8 & 2) != 0) {
                bool = Boolean.TRUE;
            }
            return linkApi.scrapImage(str, bool);
        }

        public static /* synthetic */ InterfaceC6201b uploadImage$default(LinkApi linkApi, D.b bVar, Boolean bool, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadImage");
            }
            if ((i8 & 2) != 0) {
                bool = Boolean.TRUE;
            }
            return linkApi.uploadImage(bVar, bool);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC6201b validateCustom$default(LinkApi linkApi, long j8, Map map, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateCustom");
            }
            if ((i8 & 2) != 0) {
                map = null;
            }
            return linkApi.validateCustom(j8, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC6201b validateScrap$default(LinkApi linkApi, String str, Long l8, Map map, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateScrap");
            }
            if ((i8 & 2) != 0) {
                l8 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            return linkApi.validateScrap(str, l8, map);
        }
    }

    @o(Constants.SCRAP_IMAGE_PATH)
    @e
    InterfaceC6201b<ImageUploadResult> scrapImage(@c(com.kakao.sdk.template.Constants.IMAGE_URL) String str, @c("secure_resource") Boolean bool);

    @o(Constants.UPLOAD_IMAGE_PATH)
    @l
    InterfaceC6201b<ImageUploadResult> uploadImage(@q D.b bVar, @q("secure_resource") Boolean bool);

    @f("/v2/api/kakaolink/talk/template/validate?link_ver=4.0")
    InterfaceC6201b<ValidationResult> validateCustom(@t(Constants.TEMPLATE_ID) long j8, @t(Constants.TEMPLATE_ARGS) Map<String, String> map);

    @f("/v2/api/kakaolink/talk/template/default?link_ver=4.0")
    InterfaceC6201b<ValidationResult> validateDefault(@t("template_object") DefaultTemplate defaultTemplate);

    @f("/v2/api/kakaolink/talk/template/scrap?link_ver=4.0")
    InterfaceC6201b<ValidationResult> validateScrap(@t(Constants.REQUEST_URL) String str, @t(Constants.TEMPLATE_ID) Long l8, @t(Constants.TEMPLATE_ARGS) Map<String, String> map);
}
