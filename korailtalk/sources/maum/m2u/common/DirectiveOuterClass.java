package maum.m2u.common;

import a4.AbstractC0834a;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5245r1;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C5213g1;
import com.google.protobuf.C5228l1;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5240p1;
import com.google.protobuf.C5247s0;
import com.google.protobuf.C5269x;
import com.google.protobuf.D;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC5207e1;
import com.google.protobuf.InterfaceC5243q1;
import com.google.protobuf.InterfaceC5249t0;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.N0;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import maum.m2u.common.EventOuterClass;

/* loaded from: classes3.dex */
public final class DirectiveOuterClass {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001fmaum/m2u/common/directive.proto\u0012\u000fmaum.m2u.common\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001egoogle/protobuf/duration.proto\u001a\u001bmaum/m2u/common/event.proto\"Ç\u0005\n\tDirective\u0012\u0011\n\tinterface\u0018\u0001 \u0001(\t\u0012\u0011\n\toperation\u0018\u0002 \u0001(\t\u00129\n\u0005param\u0018\u0003 \u0001(\u000b2*.maum.m2u.common.DialogAgentForwarderParam\u0012<\n\u0007payload\u0018\u0004 \u0001(\u000b2+.maum.m2u.common.Directive.DirectivePayload\u001a\u009a\u0004\n\u0010DirectivePayload\u00127\n\naudio_play\u0018\u000b \u0001(\u000b2!.maum.m2u.common.AudioPlayPayloadH\u0000\u00127\n\nvideo_play\u0018\f \u0001(\u000b2!.maum.m2u.common.VideoPlayPayloadH\u0000\u0012L\n\u0015avatar_set_expression\u0018\r \u0001(\u000b2+.maum.m2u.common.AvatarSetExpressionPayloadH\u0000\u0012B\n\u0010clova_audio_play\u0018\u000e \u0001(\u000b2&.maum.m2u.common.AudioPlayClovaPayloadH\u0000\u0012L\n\u0019launcher_view_map_payload\u0018\u000f \u0001(\u000b2'.maum.m2u.common.LauncherViewMapPayloadH\u0000\u0012P\n\u001blauncher_launch_app_payload\u0018\u0010 \u0001(\u000b2).maum.m2u.common.LauncherLaunchAppPayloadH\u0000\u0012R\n\u001clauncher_launch_page_payload\u0018\u0011 \u0001(\u000b2*.maum.m2u.common.LauncherLaunchPagePayloadH\u0000B\u000e\n\ftest_payload\"]\n\u0016LauncherViewMapPayload\u0012\u0014\n\fsearch_range\u0018\u0001 \u0001(\t\u0012\u0015\n\rsearch_object\u0018\u0002 \u0001(\t\u0012\u0016\n\u000esearch_keyword\u0018\u0003 \u0001(\t\"T\n\u001aAvatarSetExpressionPayload\u0012\u000e\n\u0006target\u0018\u0001 \u0001(\t\u0012\u0012\n\nexpression\u0018\u0002 \u0001(\t\u0012\u0012\n\ndesciption\u0018\u0003 \u0001(\t\"\u009f\u0003\n\u0010AudioPlayPayload\u00128\n\u0006stream\u0018\u0001 \u0001(\u000b2(.maum.m2u.common.AudioPlayPayload.Stream\u0012<\n\bmetadata\u0018\u0002 \u0001(\u000b2*.maum.m2u.common.AudioPlayPayload.Metadata\u001aO\n\u0006Stream\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003url\u0018\u000b \u0001(\t\u0012,\n\tplay_time\u0018\f \u0001(\u000b2\u0019.google.protobuf.Duration\u001a\u0017\n\u0007Sources\u0012\f\n\u0004urls\u0018\u0001 \u0003(\t\u001a¨\u0001\n\bMetadata\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u0012\u0010\n\bsubtitle\u0018\u0002 \u0001(\t\u00126\n\u0003art\u0018\u000b \u0001(\u000b2).maum.m2u.common.AudioPlayPayload.Sources\u0012C\n\u0010background_image\u0018\f \u0001(\u000b2).maum.m2u.common.AudioPlayPayload.Sources\"\u008f\u0007\n\u0015AudioPlayClovaPayload\u0012L\n\u000edirective_body\u0018\u0001 \u0001(\u000b24.maum.m2u.common.AudioPlayClovaPayload.DirectiveBody\u0012B\n\tplay_list\u0018\u0002 \u0001(\u000b2/.maum.m2u.common.AudioPlayClovaPayload.PlayList\u001a\u008b\u0001\n\rDirectiveBody\u0012\u0014\n\fservice_name\u0018\u0001 \u0001(\t\u0012\u0015\n\rplay_behavior\u0018\u0002 \u0001(\t\u0012 \n\u0018progress_report_interval\u0018\u0003 \u0001(\t\u0012\u0012\n\nplay_index\u0018\u0004 \u0001(\t\u0012\u0017\n\u000fplay_list_count\u0018\u0005 \u0001(\u0005\u001aÖ\u0002\n\bMetaInfo\u0012\u0013\n\u000bexpiry_time\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bcategory_id\u0018\u0002 \u0001(\t\u0012\u0015\n\rcategory_name\u0018\u0003 \u0001(\t\u0012\u0012\n\naudio_name\u0018\u0004 \u0001(\t\u0012\u0010\n\bgenre_id\u0018\u0005 \u0001(\t\u0012\u0012\n\ngenre_name\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bartist_name\u0018\u0007 \u0001(\t\u0012\u0011\n\tartist_id\u0018\b \u0001(\t\u0012\u0013\n\u000bis_adult_yn\u0018\t \u0001(\t\u0012\u0011\n\timage_url\u0018\n \u0001(\t\u0012\u000f\n\u0007is_like\u0018\u000b \u0001(\t\u0012\u0012\n\nlike_count\u0018\f \u0001(\u0005\u0012/\n\frunning_time\u0018\r \u0001(\u000b2\u0019.google.protobuf.Duration\u0012\u0014\n\fcreated_date\u0018\u000e \u0001(\t\u0012\u0013\n\u000bupdate_date\u0018\u000f \u0001(\t\u001aü\u0001\n\bPlayList\u0012B\n\u0004item\u0018\u0001 \u0003(\u000b24.maum.m2u.common.AudioPlayClovaPayload.PlayList.Item\u001a«\u0001\n\u0004Item\u0012\r\n\u0005index\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007item_id\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0003 \u0001(\t\u0012\u0015\n\rinterval_time\u0018\u0004 \u0001(\t\u0012\u001b\n\u0013offset_play_in_time\u0018\u0005 \u0001(\t\u0012B\n\tmeta_info\u0018\u0006 \u0001(\u000b2/.maum.m2u.common.AudioPlayClovaPayload.MetaInfo\".\n\u0010AudioStopPayload\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006reason\u0018\u000b \u0001(\t\"h\n\u0010VideoPlayPayload\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003url\u0018\u000b \u0001(\t\u0012,\n\tplay_time\u0018\f \u0001(\u000b2\u0019.google.protobuf.Duration\"Ò\u0003\n\u0011DelegateDirective\u0012\u0011\n\tinterface\u0018\u0001 \u0001(\t\u0012\u0011\n\toperation\u0018\u0002 \u0001(\t\u00129\n\u0005param\u0018\u0003 \u0001(\u000b2*.maum.m2u.common.DialogAgentForwarderParam\u0012L\n\u0007payload\u0018\u0004 \u0001(\u000b2;.maum.m2u.common.DelegateDirective.DelegateDirectivePayload\u001a\u008d\u0002\n\u0018DelegateDirectivePayload\u0012G\n\u0012launcher_authorize\u0018\r \u0001(\u000b2).maum.m2u.common.LauncherAuthorizePayloadH\u0000\u0012H\n\u0013launcher_fill_slots\u0018\u000e \u0001(\u000b2).maum.m2u.common.LauncherFillSlotsPayloadH\u0000\u0012N\n\u0016launcher_read_document\u0018\u000f \u0001(\u000b2,.maum.m2u.common.LauncherReadDocumentPayloadH\u0000B\u000e\n\ftest_payload\"a\n\u001bLauncherReadDocumentPayload\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u0014\n\fdocument_url\u0018\u0002 \u0001(\t\u0012\r\n\u0005title\u0018\u0003 \u0001(\t\u0012\u0011\n\tsub_title\u0018\u0004 \u0001(\t\"c\n\u0018LauncherAuthorizePayload\u0012\u0010\n\bprovider\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006method\u0018\u0002 \u0001(\t\u0012%\n\u0004meta\u0018d \u0001(\u000b2\u0017.google.protobuf.Struct\"c\n\u0018LauncherFillSlotsPayload\u0012-\n\ffilled_slots\u0018\u0015 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0018\n\u0010requesting_slots\u0018\u0016 \u0003(\t\"\u0088\u0001\n\u0018LauncherLaunchAppPayload\u0012\u000e\n\u0006target\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003uri\u0018\u0002 \u0001(\t\u0012%\n\u0004meta\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0013\n\u000bruntime_env\u0018\u000b \u0001(\t\u0012\u0013\n\u000bdescription\u0018\f \u0001(\t\"\u0088\u0001\n\u0019LauncherLaunchPagePayload\u0012\u000e\n\u0006target\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003uri\u0018\u0002 \u0001(\t\u0012%\n\u0004meta\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0012\n\nbrower_env\u0018\u000b \u0001(\t\u0012\u0013\n\u000bdescription\u0018\f \u0001(\tb\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor(), D.getDescriptor(), EventOuterClass.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayClovaPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayClovaPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayPayload_Metadata_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayPayload_Metadata_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayPayload_Sources_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayPayload_Sources_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayPayload_Stream_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayPayload_Stream_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AudioStopPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioStopPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_AvatarSetExpressionPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AvatarSetExpressionPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_DelegateDirective_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_DelegateDirective_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Directive_DirectivePayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Directive_DirectivePayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Directive_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Directive_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherAuthorizePayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherAuthorizePayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherFillSlotsPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherFillSlotsPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherLaunchAppPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherLaunchAppPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherLaunchPagePayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherLaunchPagePayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherReadDocumentPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherReadDocumentPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherViewMapPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherViewMapPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_VideoPlayPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_VideoPlayPayload_fieldAccessorTable;

    /* renamed from: maum.m2u.common.DirectiveOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$common$DirectiveOuterClass$DelegateDirective$DelegateDirectivePayload$TestPayloadCase;
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase;

        static {
            int[] iArr = new int[DelegateDirective.DelegateDirectivePayload.TestPayloadCase.values().length];
            $SwitchMap$maum$m2u$common$DirectiveOuterClass$DelegateDirective$DelegateDirectivePayload$TestPayloadCase = iArr;
            try {
                iArr[DelegateDirective.DelegateDirectivePayload.TestPayloadCase.LAUNCHER_AUTHORIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$DelegateDirective$DelegateDirectivePayload$TestPayloadCase[DelegateDirective.DelegateDirectivePayload.TestPayloadCase.LAUNCHER_FILL_SLOTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$DelegateDirective$DelegateDirectivePayload$TestPayloadCase[DelegateDirective.DelegateDirectivePayload.TestPayloadCase.LAUNCHER_READ_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$DelegateDirective$DelegateDirectivePayload$TestPayloadCase[DelegateDirective.DelegateDirectivePayload.TestPayloadCase.TESTPAYLOAD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Directive.DirectivePayload.TestPayloadCase.values().length];
            $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase = iArr2;
            try {
                iArr2[Directive.DirectivePayload.TestPayloadCase.AUDIO_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.VIDEO_PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.AVATAR_SET_EXPRESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.CLOVA_AUDIO_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.LAUNCHER_VIEW_MAP_PAYLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.LAUNCHER_LAUNCH_APP_PAYLOAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.LAUNCHER_LAUNCH_PAGE_PAYLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[Directive.DirectivePayload.TestPayloadCase.TESTPAYLOAD_NOT_SET.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static final class AudioPlayClovaPayload extends AbstractC5209f0 implements AudioPlayClovaPayloadOrBuilder {
        public static final int DIRECTIVE_BODY_FIELD_NUMBER = 1;
        public static final int PLAY_LIST_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DirectiveBody directiveBody_;
        private byte memoizedIsInitialized;
        private PlayList playList_;
        private static final AudioPlayClovaPayload DEFAULT_INSTANCE = new AudioPlayClovaPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AudioPlayClovaPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AudioPlayClovaPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AudioPlayClovaPayloadOrBuilder {
            private int bitField0_;
            private C5228l1 directiveBodyBuilder_;
            private DirectiveBody directiveBody_;
            private C5228l1 playListBuilder_;
            private PlayList playList_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AudioPlayClovaPayload audioPlayClovaPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.directiveBodyBuilder_;
                    audioPlayClovaPayload.directiveBody_ = c5228l1 == null ? this.directiveBody_ : (DirectiveBody) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l12 = this.playListBuilder_;
                    audioPlayClovaPayload.playList_ = c5228l12 == null ? this.playList_ : (PlayList) c5228l12.build();
                    i8 |= 2;
                }
                AudioPlayClovaPayload.access$16576(audioPlayClovaPayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_descriptor;
            }

            private C5228l1 getDirectiveBodyFieldBuilder() {
                if (this.directiveBodyBuilder_ == null) {
                    this.directiveBodyBuilder_ = new C5228l1(getDirectiveBody(), getParentForChildren(), isClean());
                    this.directiveBody_ = null;
                }
                return this.directiveBodyBuilder_;
            }

            private C5228l1 getPlayListFieldBuilder() {
                if (this.playListBuilder_ == null) {
                    this.playListBuilder_ = new C5228l1(getPlayList(), getParentForChildren(), isClean());
                    this.playList_ = null;
                }
                return this.playListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getDirectiveBodyFieldBuilder();
                    getPlayListFieldBuilder();
                }
            }

            public Builder clearDirectiveBody() {
                this.bitField0_ &= -2;
                this.directiveBody_ = null;
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.directiveBodyBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPlayList() {
                this.bitField0_ &= -3;
                this.playList_ = null;
                C5228l1 c5228l1 = this.playListBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.playListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
            public DirectiveBody getDirectiveBody() {
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 != null) {
                    return (DirectiveBody) c5228l1.getMessage();
                }
                DirectiveBody directiveBody = this.directiveBody_;
                return directiveBody == null ? DirectiveBody.getDefaultInstance() : directiveBody;
            }

            public DirectiveBody.Builder getDirectiveBodyBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DirectiveBody.Builder) getDirectiveBodyFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
            public DirectiveBodyOrBuilder getDirectiveBodyOrBuilder() {
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 != null) {
                    return (DirectiveBodyOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DirectiveBody directiveBody = this.directiveBody_;
                return directiveBody == null ? DirectiveBody.getDefaultInstance() : directiveBody;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
            public PlayList getPlayList() {
                C5228l1 c5228l1 = this.playListBuilder_;
                if (c5228l1 != null) {
                    return (PlayList) c5228l1.getMessage();
                }
                PlayList playList = this.playList_;
                return playList == null ? PlayList.getDefaultInstance() : playList;
            }

            public PlayList.Builder getPlayListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (PlayList.Builder) getPlayListFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
            public PlayListOrBuilder getPlayListOrBuilder() {
                C5228l1 c5228l1 = this.playListBuilder_;
                if (c5228l1 != null) {
                    return (PlayListOrBuilder) c5228l1.getMessageOrBuilder();
                }
                PlayList playList = this.playList_;
                return playList == null ? PlayList.getDefaultInstance() : playList;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
            public boolean hasDirectiveBody() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
            public boolean hasPlayList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPlayClovaPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDirectiveBody(DirectiveBody directiveBody) {
                DirectiveBody directiveBody2;
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(directiveBody);
                } else if ((this.bitField0_ & 1) == 0 || (directiveBody2 = this.directiveBody_) == null || directiveBody2 == DirectiveBody.getDefaultInstance()) {
                    this.directiveBody_ = directiveBody;
                } else {
                    getDirectiveBodyBuilder().mergeFrom(directiveBody);
                }
                if (this.directiveBody_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergePlayList(PlayList playList) {
                PlayList playList2;
                C5228l1 c5228l1 = this.playListBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(playList);
                } else if ((this.bitField0_ & 2) == 0 || (playList2 = this.playList_) == null || playList2 == PlayList.getDefaultInstance()) {
                    this.playList_ = playList;
                } else {
                    getPlayListBuilder().mergeFrom(playList);
                }
                if (this.playList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setDirectiveBody(DirectiveBody directiveBody) {
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 == null) {
                    directiveBody.getClass();
                    this.directiveBody_ = directiveBody;
                } else {
                    c5228l1.setMessage(directiveBody);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPlayList(PlayList playList) {
                C5228l1 c5228l1 = this.playListBuilder_;
                if (c5228l1 == null) {
                    playList.getClass();
                    this.playList_ = playList;
                } else {
                    c5228l1.setMessage(playList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioPlayClovaPayload build() {
                AudioPlayClovaPayload audioPlayClovaPayloadBuildPartial = buildPartial();
                if (audioPlayClovaPayloadBuildPartial.isInitialized()) {
                    return audioPlayClovaPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) audioPlayClovaPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioPlayClovaPayload buildPartial() {
                AudioPlayClovaPayload audioPlayClovaPayload = new AudioPlayClovaPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(audioPlayClovaPayload);
                }
                onBuilt();
                return audioPlayClovaPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AudioPlayClovaPayload getDefaultInstanceForType() {
                return AudioPlayClovaPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.directiveBody_ = null;
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.directiveBodyBuilder_ = null;
                }
                this.playList_ = null;
                C5228l1 c5228l12 = this.playListBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.playListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AudioPlayClovaPayload) {
                    return mergeFrom((AudioPlayClovaPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setDirectiveBody(DirectiveBody.Builder builder) {
                C5228l1 c5228l1 = this.directiveBodyBuilder_;
                if (c5228l1 == null) {
                    this.directiveBody_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPlayList(PlayList.Builder builder) {
                C5228l1 c5228l1 = this.playListBuilder_;
                if (c5228l1 == null) {
                    this.playList_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(AudioPlayClovaPayload audioPlayClovaPayload) {
                if (audioPlayClovaPayload == AudioPlayClovaPayload.getDefaultInstance()) {
                    return this;
                }
                if (audioPlayClovaPayload.hasDirectiveBody()) {
                    mergeDirectiveBody(audioPlayClovaPayload.getDirectiveBody());
                }
                if (audioPlayClovaPayload.hasPlayList()) {
                    mergePlayList(audioPlayClovaPayload.getPlayList());
                }
                mergeUnknownFields(audioPlayClovaPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    rVar.readMessage(getDirectiveBodyFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPlayListFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class DirectiveBody extends AbstractC5209f0 implements DirectiveBodyOrBuilder {
            private static final DirectiveBody DEFAULT_INSTANCE = new DirectiveBody();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBody.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public DirectiveBody parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = DirectiveBody.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
            public static final int PLAY_BEHAVIOR_FIELD_NUMBER = 2;
            public static final int PLAY_INDEX_FIELD_NUMBER = 4;
            public static final int PLAY_LIST_COUNT_FIELD_NUMBER = 5;
            public static final int PROGRESS_REPORT_INTERVAL_FIELD_NUMBER = 3;
            public static final int SERVICE_NAME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object playBehavior_;
            private volatile Object playIndex_;
            private int playListCount_;
            private volatile Object progressReportInterval_;
            private volatile Object serviceName_;

            public static final class Builder extends AbstractC5209f0.b implements DirectiveBodyOrBuilder {
                private int bitField0_;
                private Object playBehavior_;
                private Object playIndex_;
                private int playListCount_;
                private Object progressReportInterval_;
                private Object serviceName_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(DirectiveBody directiveBody) {
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        directiveBody.serviceName_ = this.serviceName_;
                    }
                    if ((i8 & 2) != 0) {
                        directiveBody.playBehavior_ = this.playBehavior_;
                    }
                    if ((i8 & 4) != 0) {
                        directiveBody.progressReportInterval_ = this.progressReportInterval_;
                    }
                    if ((i8 & 8) != 0) {
                        directiveBody.playIndex_ = this.playIndex_;
                    }
                    if ((i8 & 16) != 0) {
                        directiveBody.playListCount_ = this.playListCount_;
                    }
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_descriptor;
                }

                public Builder clearPlayBehavior() {
                    this.playBehavior_ = DirectiveBody.getDefaultInstance().getPlayBehavior();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearPlayIndex() {
                    this.playIndex_ = DirectiveBody.getDefaultInstance().getPlayIndex();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearPlayListCount() {
                    this.bitField0_ &= -17;
                    this.playListCount_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProgressReportInterval() {
                    this.progressReportInterval_ = DirectiveBody.getDefaultInstance().getProgressReportInterval();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearServiceName() {
                    this.serviceName_ = DirectiveBody.getDefaultInstance().getServiceName();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public String getPlayBehavior() {
                    Object obj = this.playBehavior_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.playBehavior_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public AbstractC5235o getPlayBehaviorBytes() {
                    Object obj = this.playBehavior_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.playBehavior_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public String getPlayIndex() {
                    Object obj = this.playIndex_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.playIndex_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public AbstractC5235o getPlayIndexBytes() {
                    Object obj = this.playIndex_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.playIndex_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public int getPlayListCount() {
                    return this.playListCount_;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public String getProgressReportInterval() {
                    Object obj = this.progressReportInterval_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.progressReportInterval_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public AbstractC5235o getProgressReportIntervalBytes() {
                    Object obj = this.progressReportInterval_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.progressReportInterval_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public String getServiceName() {
                    Object obj = this.serviceName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.serviceName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
                public AbstractC5235o getServiceNameBytes() {
                    Object obj = this.serviceName_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.serviceName_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveBody.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setPlayBehavior(String str) {
                    str.getClass();
                    this.playBehavior_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setPlayBehaviorBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.playBehavior_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setPlayIndex(String str) {
                    str.getClass();
                    this.playIndex_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setPlayIndexBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.playIndex_ = abstractC5235o;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setPlayListCount(int i8) {
                    this.playListCount_ = i8;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setProgressReportInterval(String str) {
                    str.getClass();
                    this.progressReportInterval_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setProgressReportIntervalBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.progressReportInterval_ = abstractC5235o;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setServiceName(String str) {
                    str.getClass();
                    this.serviceName_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setServiceNameBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.serviceName_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.serviceName_ = "";
                    this.playBehavior_ = "";
                    this.progressReportInterval_ = "";
                    this.playIndex_ = "";
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DirectiveBody build() {
                    DirectiveBody directiveBodyBuildPartial = buildPartial();
                    if (directiveBodyBuildPartial.isInitialized()) {
                        return directiveBodyBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) directiveBodyBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DirectiveBody buildPartial() {
                    DirectiveBody directiveBody = new DirectiveBody(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(directiveBody);
                    }
                    onBuilt();
                    return directiveBody;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public DirectiveBody getDefaultInstanceForType() {
                    return DirectiveBody.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.serviceName_ = "";
                    this.playBehavior_ = "";
                    this.progressReportInterval_ = "";
                    this.playIndex_ = "";
                    this.playListCount_ = 0;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof DirectiveBody) {
                        return mergeFrom((DirectiveBody) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.serviceName_ = "";
                    this.playBehavior_ = "";
                    this.progressReportInterval_ = "";
                    this.playIndex_ = "";
                }

                public Builder mergeFrom(DirectiveBody directiveBody) {
                    if (directiveBody == DirectiveBody.getDefaultInstance()) {
                        return this;
                    }
                    if (!directiveBody.getServiceName().isEmpty()) {
                        this.serviceName_ = directiveBody.serviceName_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!directiveBody.getPlayBehavior().isEmpty()) {
                        this.playBehavior_ = directiveBody.playBehavior_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (!directiveBody.getProgressReportInterval().isEmpty()) {
                        this.progressReportInterval_ = directiveBody.progressReportInterval_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (!directiveBody.getPlayIndex().isEmpty()) {
                        this.playIndex_ = directiveBody.playIndex_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (directiveBody.getPlayListCount() != 0) {
                        setPlayListCount(directiveBody.getPlayListCount());
                    }
                    mergeUnknownFields(directiveBody.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.serviceName_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.playBehavior_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 26) {
                                        this.progressReportInterval_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 34) {
                                        this.playIndex_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 8;
                                    } else if (tag != 40) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        this.playListCount_ = rVar.readInt32();
                                        this.bitField0_ |= 16;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ DirectiveBody(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static DirectiveBody getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DirectiveBody parseDelimitedFrom(InputStream inputStream) {
                return (DirectiveBody) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DirectiveBody parseFrom(ByteBuffer byteBuffer) {
                return (DirectiveBody) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectiveBody)) {
                    return super.equals(obj);
                }
                DirectiveBody directiveBody = (DirectiveBody) obj;
                return getServiceName().equals(directiveBody.getServiceName()) && getPlayBehavior().equals(directiveBody.getPlayBehavior()) && getProgressReportInterval().equals(directiveBody.getProgressReportInterval()) && getPlayIndex().equals(directiveBody.getPlayIndex()) && getPlayListCount() == directiveBody.getPlayListCount() && getUnknownFields().equals(directiveBody.getUnknownFields());
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public String getPlayBehavior() {
                Object obj = this.playBehavior_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.playBehavior_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public AbstractC5235o getPlayBehaviorBytes() {
                Object obj = this.playBehavior_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.playBehavior_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public String getPlayIndex() {
                Object obj = this.playIndex_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.playIndex_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public AbstractC5235o getPlayIndexBytes() {
                Object obj = this.playIndex_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.playIndex_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public int getPlayListCount() {
                return this.playListCount_;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public String getProgressReportInterval() {
                Object obj = this.progressReportInterval_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.progressReportInterval_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public AbstractC5235o getProgressReportIntervalBytes() {
                Object obj = this.progressReportInterval_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.progressReportInterval_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.serviceName_) ? AbstractC5209f0.computeStringSize(1, this.serviceName_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.playBehavior_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.playBehavior_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.progressReportInterval_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.progressReportInterval_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.playIndex_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(4, this.playIndex_);
                }
                int i9 = this.playListCount_;
                if (i9 != 0) {
                    iComputeStringSize += AbstractC5248t.computeInt32Size(5, i9);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public String getServiceName() {
                Object obj = this.serviceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.serviceName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.DirectiveBodyOrBuilder
            public AbstractC5235o getServiceNameBytes() {
                Object obj = this.serviceName_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.serviceName_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getServiceName().hashCode()) * 37) + 2) * 53) + getPlayBehavior().hashCode()) * 37) + 3) * 53) + getProgressReportInterval().hashCode()) * 37) + 4) * 53) + getPlayIndex().hashCode()) * 37) + 5) * 53) + getPlayListCount()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveBody.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new DirectiveBody();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.serviceName_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.serviceName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.playBehavior_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 2, this.playBehavior_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.progressReportInterval_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 3, this.progressReportInterval_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.playIndex_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 4, this.playIndex_);
                }
                int i8 = this.playListCount_;
                if (i8 != 0) {
                    abstractC5248t.writeInt32(5, i8);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private DirectiveBody(AbstractC5209f0.b bVar) {
                super(bVar);
                this.serviceName_ = "";
                this.playBehavior_ = "";
                this.progressReportInterval_ = "";
                this.playIndex_ = "";
                this.playListCount_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(DirectiveBody directiveBody) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(directiveBody);
            }

            public static DirectiveBody parseFrom(ByteBuffer byteBuffer, M m8) {
                return (DirectiveBody) PARSER.parseFrom(byteBuffer, m8);
            }

            public static DirectiveBody parseDelimitedFrom(InputStream inputStream, M m8) {
                return (DirectiveBody) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static DirectiveBody parseFrom(AbstractC5235o abstractC5235o) {
                return (DirectiveBody) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DirectiveBody getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static DirectiveBody parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (DirectiveBody) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static DirectiveBody parseFrom(byte[] bArr) {
                return (DirectiveBody) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static DirectiveBody parseFrom(byte[] bArr, M m8) {
                return (DirectiveBody) PARSER.parseFrom(bArr, m8);
            }

            public static DirectiveBody parseFrom(InputStream inputStream) {
                return (DirectiveBody) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            private DirectiveBody() {
                this.serviceName_ = "";
                this.playBehavior_ = "";
                this.progressReportInterval_ = "";
                this.playIndex_ = "";
                this.playListCount_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.serviceName_ = "";
                this.playBehavior_ = "";
                this.progressReportInterval_ = "";
                this.playIndex_ = "";
            }

            public static DirectiveBody parseFrom(InputStream inputStream, M m8) {
                return (DirectiveBody) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static DirectiveBody parseFrom(r rVar) {
                return (DirectiveBody) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static DirectiveBody parseFrom(r rVar, M m8) {
                return (DirectiveBody) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface DirectiveBodyOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            String getPlayBehavior();

            AbstractC5235o getPlayBehaviorBytes();

            String getPlayIndex();

            AbstractC5235o getPlayIndexBytes();

            int getPlayListCount();

            String getProgressReportInterval();

            AbstractC5235o getProgressReportIntervalBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            String getServiceName();

            AbstractC5235o getServiceNameBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        public static final class MetaInfo extends AbstractC5209f0 implements MetaInfoOrBuilder {
            public static final int ARTIST_ID_FIELD_NUMBER = 8;
            public static final int ARTIST_NAME_FIELD_NUMBER = 7;
            public static final int AUDIO_NAME_FIELD_NUMBER = 4;
            public static final int CATEGORY_ID_FIELD_NUMBER = 2;
            public static final int CATEGORY_NAME_FIELD_NUMBER = 3;
            public static final int CREATED_DATE_FIELD_NUMBER = 14;
            public static final int EXPIRY_TIME_FIELD_NUMBER = 1;
            public static final int GENRE_ID_FIELD_NUMBER = 5;
            public static final int GENRE_NAME_FIELD_NUMBER = 6;
            public static final int IMAGE_URL_FIELD_NUMBER = 10;
            public static final int IS_ADULT_YN_FIELD_NUMBER = 9;
            public static final int IS_LIKE_FIELD_NUMBER = 11;
            public static final int LIKE_COUNT_FIELD_NUMBER = 12;
            public static final int RUNNING_TIME_FIELD_NUMBER = 13;
            public static final int UPDATE_DATE_FIELD_NUMBER = 15;
            private static final long serialVersionUID = 0;
            private volatile Object artistId_;
            private volatile Object artistName_;
            private volatile Object audioName_;
            private int bitField0_;
            private volatile Object categoryId_;
            private volatile Object categoryName_;
            private volatile Object createdDate_;
            private volatile Object expiryTime_;
            private volatile Object genreId_;
            private volatile Object genreName_;
            private volatile Object imageUrl_;
            private volatile Object isAdultYn_;
            private volatile Object isLike_;
            private int likeCount_;
            private byte memoizedIsInitialized;
            private B runningTime_;
            private volatile Object updateDate_;
            private static final MetaInfo DEFAULT_INSTANCE = new MetaInfo();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfo.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public MetaInfo parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = MetaInfo.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements MetaInfoOrBuilder {
                private Object artistId_;
                private Object artistName_;
                private Object audioName_;
                private int bitField0_;
                private Object categoryId_;
                private Object categoryName_;
                private Object createdDate_;
                private Object expiryTime_;
                private Object genreId_;
                private Object genreName_;
                private Object imageUrl_;
                private Object isAdultYn_;
                private Object isLike_;
                private int likeCount_;
                private C5228l1 runningTimeBuilder_;
                private B runningTime_;
                private Object updateDate_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(MetaInfo metaInfo) {
                    int i8;
                    int i9 = this.bitField0_;
                    if ((i9 & 1) != 0) {
                        metaInfo.expiryTime_ = this.expiryTime_;
                    }
                    if ((i9 & 2) != 0) {
                        metaInfo.categoryId_ = this.categoryId_;
                    }
                    if ((i9 & 4) != 0) {
                        metaInfo.categoryName_ = this.categoryName_;
                    }
                    if ((i9 & 8) != 0) {
                        metaInfo.audioName_ = this.audioName_;
                    }
                    if ((i9 & 16) != 0) {
                        metaInfo.genreId_ = this.genreId_;
                    }
                    if ((i9 & 32) != 0) {
                        metaInfo.genreName_ = this.genreName_;
                    }
                    if ((i9 & 64) != 0) {
                        metaInfo.artistName_ = this.artistName_;
                    }
                    if ((i9 & 128) != 0) {
                        metaInfo.artistId_ = this.artistId_;
                    }
                    if ((i9 & 256) != 0) {
                        metaInfo.isAdultYn_ = this.isAdultYn_;
                    }
                    if ((i9 & 512) != 0) {
                        metaInfo.imageUrl_ = this.imageUrl_;
                    }
                    if ((i9 & 1024) != 0) {
                        metaInfo.isLike_ = this.isLike_;
                    }
                    if ((i9 & 2048) != 0) {
                        metaInfo.likeCount_ = this.likeCount_;
                    }
                    if ((i9 & 4096) != 0) {
                        C5228l1 c5228l1 = this.runningTimeBuilder_;
                        metaInfo.runningTime_ = c5228l1 == null ? this.runningTime_ : (B) c5228l1.build();
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    if ((i9 & 8192) != 0) {
                        metaInfo.createdDate_ = this.createdDate_;
                    }
                    if ((i9 & 16384) != 0) {
                        metaInfo.updateDate_ = this.updateDate_;
                    }
                    MetaInfo.access$12076(metaInfo, i8);
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_descriptor;
                }

                private C5228l1 getRunningTimeFieldBuilder() {
                    if (this.runningTimeBuilder_ == null) {
                        this.runningTimeBuilder_ = new C5228l1(getRunningTime(), getParentForChildren(), isClean());
                        this.runningTime_ = null;
                    }
                    return this.runningTimeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (AbstractC5209f0.alwaysUseFieldBuilders) {
                        getRunningTimeFieldBuilder();
                    }
                }

                public Builder clearArtistId() {
                    this.artistId_ = MetaInfo.getDefaultInstance().getArtistId();
                    this.bitField0_ &= -129;
                    onChanged();
                    return this;
                }

                public Builder clearArtistName() {
                    this.artistName_ = MetaInfo.getDefaultInstance().getArtistName();
                    this.bitField0_ &= -65;
                    onChanged();
                    return this;
                }

                public Builder clearAudioName() {
                    this.audioName_ = MetaInfo.getDefaultInstance().getAudioName();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearCategoryId() {
                    this.categoryId_ = MetaInfo.getDefaultInstance().getCategoryId();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearCategoryName() {
                    this.categoryName_ = MetaInfo.getDefaultInstance().getCategoryName();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearCreatedDate() {
                    this.createdDate_ = MetaInfo.getDefaultInstance().getCreatedDate();
                    this.bitField0_ &= -8193;
                    onChanged();
                    return this;
                }

                public Builder clearExpiryTime() {
                    this.expiryTime_ = MetaInfo.getDefaultInstance().getExpiryTime();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearGenreId() {
                    this.genreId_ = MetaInfo.getDefaultInstance().getGenreId();
                    this.bitField0_ &= -17;
                    onChanged();
                    return this;
                }

                public Builder clearGenreName() {
                    this.genreName_ = MetaInfo.getDefaultInstance().getGenreName();
                    this.bitField0_ &= -33;
                    onChanged();
                    return this;
                }

                public Builder clearImageUrl() {
                    this.imageUrl_ = MetaInfo.getDefaultInstance().getImageUrl();
                    this.bitField0_ &= -513;
                    onChanged();
                    return this;
                }

                public Builder clearIsAdultYn() {
                    this.isAdultYn_ = MetaInfo.getDefaultInstance().getIsAdultYn();
                    this.bitField0_ &= -257;
                    onChanged();
                    return this;
                }

                public Builder clearIsLike() {
                    this.isLike_ = MetaInfo.getDefaultInstance().getIsLike();
                    this.bitField0_ &= -1025;
                    onChanged();
                    return this;
                }

                public Builder clearLikeCount() {
                    this.bitField0_ &= -2049;
                    this.likeCount_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearRunningTime() {
                    this.bitField0_ &= -4097;
                    this.runningTime_ = null;
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.runningTimeBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearUpdateDate() {
                    this.updateDate_ = MetaInfo.getDefaultInstance().getUpdateDate();
                    this.bitField0_ &= -16385;
                    onChanged();
                    return this;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getArtistId() {
                    Object obj = this.artistId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.artistId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getArtistIdBytes() {
                    Object obj = this.artistId_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.artistId_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getArtistName() {
                    Object obj = this.artistName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.artistName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getArtistNameBytes() {
                    Object obj = this.artistName_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.artistName_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getAudioName() {
                    Object obj = this.audioName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.audioName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getAudioNameBytes() {
                    Object obj = this.audioName_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.audioName_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getCategoryId() {
                    Object obj = this.categoryId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.categoryId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getCategoryIdBytes() {
                    Object obj = this.categoryId_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.categoryId_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getCategoryName() {
                    Object obj = this.categoryName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.categoryName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getCategoryNameBytes() {
                    Object obj = this.categoryName_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.categoryName_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getCreatedDate() {
                    Object obj = this.createdDate_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.createdDate_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getCreatedDateBytes() {
                    Object obj = this.createdDate_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.createdDate_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getExpiryTime() {
                    Object obj = this.expiryTime_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.expiryTime_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getExpiryTimeBytes() {
                    Object obj = this.expiryTime_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.expiryTime_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getGenreId() {
                    Object obj = this.genreId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.genreId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getGenreIdBytes() {
                    Object obj = this.genreId_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.genreId_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getGenreName() {
                    Object obj = this.genreName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.genreName_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getGenreNameBytes() {
                    Object obj = this.genreName_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.genreName_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getImageUrl() {
                    Object obj = this.imageUrl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.imageUrl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getImageUrlBytes() {
                    Object obj = this.imageUrl_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.imageUrl_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getIsAdultYn() {
                    Object obj = this.isAdultYn_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.isAdultYn_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getIsAdultYnBytes() {
                    Object obj = this.isAdultYn_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.isAdultYn_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getIsLike() {
                    Object obj = this.isLike_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.isLike_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getIsLikeBytes() {
                    Object obj = this.isLike_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.isLike_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public int getLikeCount() {
                    return this.likeCount_;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public B getRunningTime() {
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 != null) {
                        return (B) c5228l1.getMessage();
                    }
                    B b9 = this.runningTime_;
                    return b9 == null ? B.getDefaultInstance() : b9;
                }

                public B.b getRunningTimeBuilder() {
                    this.bitField0_ |= 4096;
                    onChanged();
                    return (B.b) getRunningTimeFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public C getRunningTimeOrBuilder() {
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 != null) {
                        return (C) c5228l1.getMessageOrBuilder();
                    }
                    B b9 = this.runningTime_;
                    return b9 == null ? B.getDefaultInstance() : b9;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public String getUpdateDate() {
                    Object obj = this.updateDate_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.updateDate_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public AbstractC5235o getUpdateDateBytes() {
                    Object obj = this.updateDate_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.updateDate_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
                public boolean hasRunningTime() {
                    return (this.bitField0_ & 4096) != 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MetaInfo.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeRunningTime(B b9) {
                    B b10;
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.mergeFrom(b9);
                    } else if ((this.bitField0_ & 4096) == 0 || (b10 = this.runningTime_) == null || b10 == B.getDefaultInstance()) {
                        this.runningTime_ = b9;
                    } else {
                        getRunningTimeBuilder().mergeFrom(b9);
                    }
                    if (this.runningTime_ != null) {
                        this.bitField0_ |= 4096;
                        onChanged();
                    }
                    return this;
                }

                public Builder setArtistId(String str) {
                    str.getClass();
                    this.artistId_ = str;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                public Builder setArtistIdBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.artistId_ = abstractC5235o;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                public Builder setArtistName(String str) {
                    str.getClass();
                    this.artistName_ = str;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setArtistNameBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.artistName_ = abstractC5235o;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setAudioName(String str) {
                    str.getClass();
                    this.audioName_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setAudioNameBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.audioName_ = abstractC5235o;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setCategoryId(String str) {
                    str.getClass();
                    this.categoryId_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setCategoryIdBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.categoryId_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setCategoryName(String str) {
                    str.getClass();
                    this.categoryName_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setCategoryNameBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.categoryName_ = abstractC5235o;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setCreatedDate(String str) {
                    str.getClass();
                    this.createdDate_ = str;
                    this.bitField0_ |= 8192;
                    onChanged();
                    return this;
                }

                public Builder setCreatedDateBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.createdDate_ = abstractC5235o;
                    this.bitField0_ |= 8192;
                    onChanged();
                    return this;
                }

                public Builder setExpiryTime(String str) {
                    str.getClass();
                    this.expiryTime_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setExpiryTimeBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.expiryTime_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setGenreId(String str) {
                    str.getClass();
                    this.genreId_ = str;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setGenreIdBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.genreId_ = abstractC5235o;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setGenreName(String str) {
                    str.getClass();
                    this.genreName_ = str;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setGenreNameBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.genreName_ = abstractC5235o;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setImageUrl(String str) {
                    str.getClass();
                    this.imageUrl_ = str;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setImageUrlBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.imageUrl_ = abstractC5235o;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setIsAdultYn(String str) {
                    str.getClass();
                    this.isAdultYn_ = str;
                    this.bitField0_ |= 256;
                    onChanged();
                    return this;
                }

                public Builder setIsAdultYnBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.isAdultYn_ = abstractC5235o;
                    this.bitField0_ |= 256;
                    onChanged();
                    return this;
                }

                public Builder setIsLike(String str) {
                    str.getClass();
                    this.isLike_ = str;
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setIsLikeBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.isLike_ = abstractC5235o;
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setLikeCount(int i8) {
                    this.likeCount_ = i8;
                    this.bitField0_ |= 2048;
                    onChanged();
                    return this;
                }

                public Builder setRunningTime(B b9) {
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 == null) {
                        b9.getClass();
                        this.runningTime_ = b9;
                    } else {
                        c5228l1.setMessage(b9);
                    }
                    this.bitField0_ |= 4096;
                    onChanged();
                    return this;
                }

                public Builder setUpdateDate(String str) {
                    str.getClass();
                    this.updateDate_ = str;
                    this.bitField0_ |= 16384;
                    onChanged();
                    return this;
                }

                public Builder setUpdateDateBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.updateDate_ = abstractC5235o;
                    this.bitField0_ |= 16384;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.expiryTime_ = "";
                    this.categoryId_ = "";
                    this.categoryName_ = "";
                    this.audioName_ = "";
                    this.genreId_ = "";
                    this.genreName_ = "";
                    this.artistName_ = "";
                    this.artistId_ = "";
                    this.isAdultYn_ = "";
                    this.imageUrl_ = "";
                    this.isLike_ = "";
                    this.createdDate_ = "";
                    this.updateDate_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public MetaInfo build() {
                    MetaInfo metaInfoBuildPartial = buildPartial();
                    if (metaInfoBuildPartial.isInitialized()) {
                        return metaInfoBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) metaInfoBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public MetaInfo buildPartial() {
                    MetaInfo metaInfo = new MetaInfo(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(metaInfo);
                    }
                    onBuilt();
                    return metaInfo;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public MetaInfo getDefaultInstanceForType() {
                    return MetaInfo.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.expiryTime_ = "";
                    this.categoryId_ = "";
                    this.categoryName_ = "";
                    this.audioName_ = "";
                    this.genreId_ = "";
                    this.genreName_ = "";
                    this.artistName_ = "";
                    this.artistId_ = "";
                    this.isAdultYn_ = "";
                    this.imageUrl_ = "";
                    this.isLike_ = "";
                    this.likeCount_ = 0;
                    this.runningTime_ = null;
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.runningTimeBuilder_ = null;
                    }
                    this.createdDate_ = "";
                    this.updateDate_ = "";
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof MetaInfo) {
                        return mergeFrom((MetaInfo) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setRunningTime(B.b bVar) {
                    C5228l1 c5228l1 = this.runningTimeBuilder_;
                    if (c5228l1 == null) {
                        this.runningTime_ = bVar.build();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.bitField0_ |= 4096;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(MetaInfo metaInfo) {
                    if (metaInfo == MetaInfo.getDefaultInstance()) {
                        return this;
                    }
                    if (!metaInfo.getExpiryTime().isEmpty()) {
                        this.expiryTime_ = metaInfo.expiryTime_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!metaInfo.getCategoryId().isEmpty()) {
                        this.categoryId_ = metaInfo.categoryId_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (!metaInfo.getCategoryName().isEmpty()) {
                        this.categoryName_ = metaInfo.categoryName_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (!metaInfo.getAudioName().isEmpty()) {
                        this.audioName_ = metaInfo.audioName_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (!metaInfo.getGenreId().isEmpty()) {
                        this.genreId_ = metaInfo.genreId_;
                        this.bitField0_ |= 16;
                        onChanged();
                    }
                    if (!metaInfo.getGenreName().isEmpty()) {
                        this.genreName_ = metaInfo.genreName_;
                        this.bitField0_ |= 32;
                        onChanged();
                    }
                    if (!metaInfo.getArtistName().isEmpty()) {
                        this.artistName_ = metaInfo.artistName_;
                        this.bitField0_ |= 64;
                        onChanged();
                    }
                    if (!metaInfo.getArtistId().isEmpty()) {
                        this.artistId_ = metaInfo.artistId_;
                        this.bitField0_ |= 128;
                        onChanged();
                    }
                    if (!metaInfo.getIsAdultYn().isEmpty()) {
                        this.isAdultYn_ = metaInfo.isAdultYn_;
                        this.bitField0_ |= 256;
                        onChanged();
                    }
                    if (!metaInfo.getImageUrl().isEmpty()) {
                        this.imageUrl_ = metaInfo.imageUrl_;
                        this.bitField0_ |= 512;
                        onChanged();
                    }
                    if (!metaInfo.getIsLike().isEmpty()) {
                        this.isLike_ = metaInfo.isLike_;
                        this.bitField0_ |= 1024;
                        onChanged();
                    }
                    if (metaInfo.getLikeCount() != 0) {
                        setLikeCount(metaInfo.getLikeCount());
                    }
                    if (metaInfo.hasRunningTime()) {
                        mergeRunningTime(metaInfo.getRunningTime());
                    }
                    if (!metaInfo.getCreatedDate().isEmpty()) {
                        this.createdDate_ = metaInfo.createdDate_;
                        this.bitField0_ |= 8192;
                        onChanged();
                    }
                    if (!metaInfo.getUpdateDate().isEmpty()) {
                        this.updateDate_ = metaInfo.updateDate_;
                        this.bitField0_ |= 16384;
                        onChanged();
                    }
                    mergeUnknownFields(metaInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.expiryTime_ = "";
                    this.categoryId_ = "";
                    this.categoryName_ = "";
                    this.audioName_ = "";
                    this.genreId_ = "";
                    this.genreName_ = "";
                    this.artistName_ = "";
                    this.artistId_ = "";
                    this.isAdultYn_ = "";
                    this.imageUrl_ = "";
                    this.isLike_ = "";
                    this.createdDate_ = "";
                    this.updateDate_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                switch (tag) {
                                    case 0:
                                        z8 = true;
                                    case 10:
                                        this.expiryTime_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    case 18:
                                        this.categoryId_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    case 26:
                                        this.categoryName_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 4;
                                    case 34:
                                        this.audioName_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 8;
                                    case 42:
                                        this.genreId_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 16;
                                    case 50:
                                        this.genreName_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 32;
                                    case 58:
                                        this.artistName_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 64;
                                    case 66:
                                        this.artistId_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 128;
                                    case 74:
                                        this.isAdultYn_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 256;
                                    case 82:
                                        this.imageUrl_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 512;
                                    case AbstractC0834a.MAX_ROWS_IN_BARCODE /* 90 */:
                                        this.isLike_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1024;
                                    case 96:
                                        this.likeCount_ = rVar.readInt32();
                                        this.bitField0_ |= 2048;
                                    case 106:
                                        rVar.readMessage(getRunningTimeFieldBuilder().getBuilder(), m8);
                                        this.bitField0_ |= 4096;
                                    case 114:
                                        this.createdDate_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 8192;
                                    case 122:
                                        this.updateDate_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 16384;
                                    default:
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                            z8 = true;
                                        }
                                }
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ MetaInfo(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            static /* synthetic */ int access$12076(MetaInfo metaInfo, int i8) {
                int i9 = i8 | metaInfo.bitField0_;
                metaInfo.bitField0_ = i9;
                return i9;
            }

            public static MetaInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MetaInfo parseDelimitedFrom(InputStream inputStream) {
                return (MetaInfo) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetaInfo parseFrom(ByteBuffer byteBuffer) {
                return (MetaInfo) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetaInfo)) {
                    return super.equals(obj);
                }
                MetaInfo metaInfo = (MetaInfo) obj;
                if (getExpiryTime().equals(metaInfo.getExpiryTime()) && getCategoryId().equals(metaInfo.getCategoryId()) && getCategoryName().equals(metaInfo.getCategoryName()) && getAudioName().equals(metaInfo.getAudioName()) && getGenreId().equals(metaInfo.getGenreId()) && getGenreName().equals(metaInfo.getGenreName()) && getArtistName().equals(metaInfo.getArtistName()) && getArtistId().equals(metaInfo.getArtistId()) && getIsAdultYn().equals(metaInfo.getIsAdultYn()) && getImageUrl().equals(metaInfo.getImageUrl()) && getIsLike().equals(metaInfo.getIsLike()) && getLikeCount() == metaInfo.getLikeCount() && hasRunningTime() == metaInfo.hasRunningTime()) {
                    return (!hasRunningTime() || getRunningTime().equals(metaInfo.getRunningTime())) && getCreatedDate().equals(metaInfo.getCreatedDate()) && getUpdateDate().equals(metaInfo.getUpdateDate()) && getUnknownFields().equals(metaInfo.getUnknownFields());
                }
                return false;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getArtistId() {
                Object obj = this.artistId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.artistId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getArtistIdBytes() {
                Object obj = this.artistId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.artistId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getArtistName() {
                Object obj = this.artistName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.artistName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getArtistNameBytes() {
                Object obj = this.artistName_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.artistName_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getAudioName() {
                Object obj = this.audioName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.audioName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getAudioNameBytes() {
                Object obj = this.audioName_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.audioName_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getCategoryId() {
                Object obj = this.categoryId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.categoryId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getCategoryIdBytes() {
                Object obj = this.categoryId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.categoryId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getCategoryName() {
                Object obj = this.categoryName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.categoryName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getCategoryNameBytes() {
                Object obj = this.categoryName_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.categoryName_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getCreatedDate() {
                Object obj = this.createdDate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.createdDate_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getCreatedDateBytes() {
                Object obj = this.createdDate_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.createdDate_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getExpiryTime() {
                Object obj = this.expiryTime_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.expiryTime_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getExpiryTimeBytes() {
                Object obj = this.expiryTime_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.expiryTime_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getGenreId() {
                Object obj = this.genreId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.genreId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getGenreIdBytes() {
                Object obj = this.genreId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.genreId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getGenreName() {
                Object obj = this.genreName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.genreName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getGenreNameBytes() {
                Object obj = this.genreName_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.genreName_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getImageUrl() {
                Object obj = this.imageUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.imageUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getImageUrlBytes() {
                Object obj = this.imageUrl_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.imageUrl_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getIsAdultYn() {
                Object obj = this.isAdultYn_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.isAdultYn_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getIsAdultYnBytes() {
                Object obj = this.isAdultYn_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.isAdultYn_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getIsLike() {
                Object obj = this.isLike_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.isLike_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getIsLikeBytes() {
                Object obj = this.isLike_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.isLike_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public int getLikeCount() {
                return this.likeCount_;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public B getRunningTime() {
                B b9 = this.runningTime_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public C getRunningTimeOrBuilder() {
                B b9 = this.runningTime_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.expiryTime_) ? AbstractC5209f0.computeStringSize(1, this.expiryTime_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.categoryId_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.categoryId_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.categoryName_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.categoryName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.audioName_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(4, this.audioName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.genreId_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(5, this.genreId_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.genreName_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(6, this.genreName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.artistName_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(7, this.artistName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.artistId_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(8, this.artistId_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.isAdultYn_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(9, this.isAdultYn_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.imageUrl_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(10, this.imageUrl_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.isLike_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.isLike_);
                }
                int i9 = this.likeCount_;
                if (i9 != 0) {
                    iComputeStringSize += AbstractC5248t.computeInt32Size(12, i9);
                }
                if ((1 & this.bitField0_) != 0) {
                    iComputeStringSize += AbstractC5248t.computeMessageSize(13, getRunningTime());
                }
                if (!AbstractC5209f0.isStringEmpty(this.createdDate_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(14, this.createdDate_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.updateDate_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(15, this.updateDate_);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public String getUpdateDate() {
                Object obj = this.updateDate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.updateDate_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public AbstractC5235o getUpdateDateBytes() {
                Object obj = this.updateDate_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.updateDate_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.MetaInfoOrBuilder
            public boolean hasRunningTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getExpiryTime().hashCode()) * 37) + 2) * 53) + getCategoryId().hashCode()) * 37) + 3) * 53) + getCategoryName().hashCode()) * 37) + 4) * 53) + getAudioName().hashCode()) * 37) + 5) * 53) + getGenreId().hashCode()) * 37) + 6) * 53) + getGenreName().hashCode()) * 37) + 7) * 53) + getArtistName().hashCode()) * 37) + 8) * 53) + getArtistId().hashCode()) * 37) + 9) * 53) + getIsAdultYn().hashCode()) * 37) + 10) * 53) + getImageUrl().hashCode()) * 37) + 11) * 53) + getIsLike().hashCode()) * 37) + 12) * 53) + getLikeCount();
                if (hasRunningTime()) {
                    iHashCode = (((iHashCode * 37) + 13) * 53) + getRunningTime().hashCode();
                }
                int iHashCode2 = (((((((((iHashCode * 37) + 14) * 53) + getCreatedDate().hashCode()) * 37) + 15) * 53) + getUpdateDate().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MetaInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new MetaInfo();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.expiryTime_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.expiryTime_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.categoryId_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 2, this.categoryId_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.categoryName_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 3, this.categoryName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.audioName_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 4, this.audioName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.genreId_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 5, this.genreId_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.genreName_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 6, this.genreName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.artistName_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 7, this.artistName_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.artistId_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 8, this.artistId_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.isAdultYn_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 9, this.isAdultYn_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.imageUrl_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 10, this.imageUrl_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.isLike_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 11, this.isLike_);
                }
                int i8 = this.likeCount_;
                if (i8 != 0) {
                    abstractC5248t.writeInt32(12, i8);
                }
                if ((this.bitField0_ & 1) != 0) {
                    abstractC5248t.writeMessage(13, getRunningTime());
                }
                if (!AbstractC5209f0.isStringEmpty(this.createdDate_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 14, this.createdDate_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.updateDate_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 15, this.updateDate_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private MetaInfo(AbstractC5209f0.b bVar) {
                super(bVar);
                this.expiryTime_ = "";
                this.categoryId_ = "";
                this.categoryName_ = "";
                this.audioName_ = "";
                this.genreId_ = "";
                this.genreName_ = "";
                this.artistName_ = "";
                this.artistId_ = "";
                this.isAdultYn_ = "";
                this.imageUrl_ = "";
                this.isLike_ = "";
                this.likeCount_ = 0;
                this.createdDate_ = "";
                this.updateDate_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(MetaInfo metaInfo) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metaInfo);
            }

            public static MetaInfo parseFrom(ByteBuffer byteBuffer, M m8) {
                return (MetaInfo) PARSER.parseFrom(byteBuffer, m8);
            }

            public static MetaInfo parseDelimitedFrom(InputStream inputStream, M m8) {
                return (MetaInfo) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static MetaInfo parseFrom(AbstractC5235o abstractC5235o) {
                return (MetaInfo) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MetaInfo getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static MetaInfo parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (MetaInfo) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static MetaInfo parseFrom(byte[] bArr) {
                return (MetaInfo) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static MetaInfo parseFrom(byte[] bArr, M m8) {
                return (MetaInfo) PARSER.parseFrom(bArr, m8);
            }

            public static MetaInfo parseFrom(InputStream inputStream) {
                return (MetaInfo) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static MetaInfo parseFrom(InputStream inputStream, M m8) {
                return (MetaInfo) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static MetaInfo parseFrom(r rVar) {
                return (MetaInfo) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static MetaInfo parseFrom(r rVar, M m8) {
                return (MetaInfo) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }

            private MetaInfo() {
                this.expiryTime_ = "";
                this.categoryId_ = "";
                this.categoryName_ = "";
                this.audioName_ = "";
                this.genreId_ = "";
                this.genreName_ = "";
                this.artistName_ = "";
                this.artistId_ = "";
                this.isAdultYn_ = "";
                this.imageUrl_ = "";
                this.isLike_ = "";
                this.likeCount_ = 0;
                this.createdDate_ = "";
                this.updateDate_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.expiryTime_ = "";
                this.categoryId_ = "";
                this.categoryName_ = "";
                this.audioName_ = "";
                this.genreId_ = "";
                this.genreName_ = "";
                this.artistName_ = "";
                this.artistId_ = "";
                this.isAdultYn_ = "";
                this.imageUrl_ = "";
                this.isLike_ = "";
                this.createdDate_ = "";
                this.updateDate_ = "";
            }
        }

        public interface MetaInfoOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            String getArtistId();

            AbstractC5235o getArtistIdBytes();

            String getArtistName();

            AbstractC5235o getArtistNameBytes();

            String getAudioName();

            AbstractC5235o getAudioNameBytes();

            String getCategoryId();

            AbstractC5235o getCategoryIdBytes();

            String getCategoryName();

            AbstractC5235o getCategoryNameBytes();

            String getCreatedDate();

            AbstractC5235o getCreatedDateBytes();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            String getExpiryTime();

            AbstractC5235o getExpiryTimeBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            String getGenreId();

            AbstractC5235o getGenreIdBytes();

            String getGenreName();

            AbstractC5235o getGenreNameBytes();

            String getImageUrl();

            AbstractC5235o getImageUrlBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            String getIsAdultYn();

            AbstractC5235o getIsAdultYnBytes();

            String getIsLike();

            AbstractC5235o getIsLikeBytes();

            int getLikeCount();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            B getRunningTime();

            C getRunningTimeOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            String getUpdateDate();

            AbstractC5235o getUpdateDateBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            boolean hasRunningTime();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        public static final class PlayList extends AbstractC5209f0 implements PlayListOrBuilder {
            public static final int ITEM_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<Item> item_;
            private byte memoizedIsInitialized;
            private static final PlayList DEFAULT_INSTANCE = new PlayList();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public PlayList parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = PlayList.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements PlayListOrBuilder {
                private int bitField0_;
                private C5213g1 itemBuilder_;
                private List<Item> item_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(PlayList playList) {
                }

                private void buildPartialRepeatedFields(PlayList playList) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 != null) {
                        playList.item_ = c5213g1.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                        this.bitField0_ &= -2;
                    }
                    playList.item_ = this.item_;
                }

                private void ensureItemIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.item_ = new ArrayList(this.item_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_descriptor;
                }

                private C5213g1 getItemFieldBuilder() {
                    if (this.itemBuilder_ == null) {
                        this.itemBuilder_ = new C5213g1(this.item_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.item_ = null;
                    }
                    return this.itemBuilder_;
                }

                public Builder addAllItem(Iterable<? extends Item> iterable) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        ensureItemIsMutable();
                        AbstractC5196b.a.addAll((Iterable) iterable, (List) this.item_);
                        onChanged();
                    } else {
                        c5213g1.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder addItem(Item item) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        item.getClass();
                        ensureItemIsMutable();
                        this.item_.add(item);
                        onChanged();
                    } else {
                        c5213g1.addMessage(item);
                    }
                    return this;
                }

                public Item.Builder addItemBuilder() {
                    return (Item.Builder) getItemFieldBuilder().addBuilder(Item.getDefaultInstance());
                }

                public Builder clearItem() {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        this.item_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        c5213g1.clear();
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
                public Item getItem(int i8) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    return c5213g1 == null ? this.item_.get(i8) : (Item) c5213g1.getMessage(i8);
                }

                public Item.Builder getItemBuilder(int i8) {
                    return (Item.Builder) getItemFieldBuilder().getBuilder(i8);
                }

                public List<Item.Builder> getItemBuilderList() {
                    return getItemFieldBuilder().getBuilderList();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
                public int getItemCount() {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    return c5213g1 == null ? this.item_.size() : c5213g1.getCount();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
                public List<Item> getItemList() {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    return c5213g1 == null ? Collections.unmodifiableList(this.item_) : c5213g1.getMessageList();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
                public ItemOrBuilder getItemOrBuilder(int i8) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    return c5213g1 == null ? this.item_.get(i8) : (ItemOrBuilder) c5213g1.getMessageOrBuilder(i8);
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
                public List<? extends ItemOrBuilder> getItemOrBuilderList() {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayList.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeItem(int i8) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        ensureItemIsMutable();
                        this.item_.remove(i8);
                        onChanged();
                    } else {
                        c5213g1.remove(i8);
                    }
                    return this;
                }

                public Builder setItem(int i8, Item item) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        item.getClass();
                        ensureItemIsMutable();
                        this.item_.set(i8, item);
                        onChanged();
                    } else {
                        c5213g1.setMessage(i8, item);
                    }
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.item_ = Collections.emptyList();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public PlayList build() {
                    PlayList playListBuildPartial = buildPartial();
                    if (playListBuildPartial.isInitialized()) {
                        return playListBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) playListBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public PlayList buildPartial() {
                    PlayList playList = new PlayList(this, null);
                    buildPartialRepeatedFields(playList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(playList);
                    }
                    onBuilt();
                    return playList;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public PlayList getDefaultInstanceForType() {
                    return PlayList.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                public Item.Builder addItemBuilder(int i8) {
                    return (Item.Builder) getItemFieldBuilder().addBuilder(i8, Item.getDefaultInstance());
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.item_ = Collections.emptyList();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        this.item_ = Collections.emptyList();
                    } else {
                        this.item_ = null;
                        c5213g1.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addItem(int i8, Item item) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        item.getClass();
                        ensureItemIsMutable();
                        this.item_.add(i8, item);
                        onChanged();
                    } else {
                        c5213g1.addMessage(i8, item);
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof PlayList) {
                        return mergeFrom((PlayList) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setItem(int i8, Item.Builder builder) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        ensureItemIsMutable();
                        this.item_.set(i8, builder.build());
                        onChanged();
                    } else {
                        c5213g1.setMessage(i8, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(PlayList playList) {
                    if (playList == PlayList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.itemBuilder_ == null) {
                        if (!playList.item_.isEmpty()) {
                            if (this.item_.isEmpty()) {
                                this.item_ = playList.item_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureItemIsMutable();
                                this.item_.addAll(playList.item_);
                            }
                            onChanged();
                        }
                    } else if (!playList.item_.isEmpty()) {
                        if (!this.itemBuilder_.isEmpty()) {
                            this.itemBuilder_.addAllMessages(playList.item_);
                        } else {
                            this.itemBuilder_.dispose();
                            this.itemBuilder_ = null;
                            this.item_ = playList.item_;
                            this.bitField0_ &= -2;
                            this.itemBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getItemFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(playList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addItem(Item.Builder builder) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        ensureItemIsMutable();
                        this.item_.add(builder.build());
                        onChanged();
                    } else {
                        c5213g1.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addItem(int i8, Item.Builder builder) {
                    C5213g1 c5213g1 = this.itemBuilder_;
                    if (c5213g1 == null) {
                        ensureItemIsMutable();
                        this.item_.add(i8, builder.build());
                        onChanged();
                    } else {
                        c5213g1.addMessage(i8, builder.build());
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag != 10) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        Item item = (Item) rVar.readMessage(Item.parser(), m8);
                                        C5213g1 c5213g1 = this.itemBuilder_;
                                        if (c5213g1 == null) {
                                            ensureItemIsMutable();
                                            this.item_.add(item);
                                        } else {
                                            c5213g1.addMessage(item);
                                        }
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            public static final class Item extends AbstractC5209f0 implements ItemOrBuilder {
                public static final int INDEX_FIELD_NUMBER = 1;
                public static final int INTERVAL_TIME_FIELD_NUMBER = 4;
                public static final int ITEM_ID_FIELD_NUMBER = 2;
                public static final int META_INFO_FIELD_NUMBER = 6;
                public static final int OFFSET_PLAY_IN_TIME_FIELD_NUMBER = 5;
                public static final int URL_FIELD_NUMBER = 3;
                private static final long serialVersionUID = 0;
                private int bitField0_;
                private volatile Object index_;
                private volatile Object intervalTime_;
                private volatile Object itemId_;
                private byte memoizedIsInitialized;
                private MetaInfo metaInfo_;
                private volatile Object offsetPlayInTime_;
                private volatile Object url_;
                private static final Item DEFAULT_INSTANCE = new Item();
                private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.Item.1
                    @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                    public Item parsePartialFrom(r rVar, M m8) throws C5230m0 {
                        Builder builderNewBuilder = Item.newBuilder();
                        try {
                            builderNewBuilder.mergeFrom(rVar, m8);
                            return builderNewBuilder.buildPartial();
                        } catch (E1 e8) {
                            throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                        } catch (C5230m0 e9) {
                            throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                        } catch (IOException e10) {
                            throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                        }
                    }
                };

                public static final class Builder extends AbstractC5209f0.b implements ItemOrBuilder {
                    private int bitField0_;
                    private Object index_;
                    private Object intervalTime_;
                    private Object itemId_;
                    private C5228l1 metaInfoBuilder_;
                    private MetaInfo metaInfo_;
                    private Object offsetPlayInTime_;
                    private Object url_;

                    /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                        this(cVar);
                    }

                    private void buildPartial0(Item item) {
                        int i8;
                        int i9 = this.bitField0_;
                        if ((i9 & 1) != 0) {
                            item.index_ = this.index_;
                        }
                        if ((i9 & 2) != 0) {
                            item.itemId_ = this.itemId_;
                        }
                        if ((i9 & 4) != 0) {
                            item.url_ = this.url_;
                        }
                        if ((i9 & 8) != 0) {
                            item.intervalTime_ = this.intervalTime_;
                        }
                        if ((i9 & 16) != 0) {
                            item.offsetPlayInTime_ = this.offsetPlayInTime_;
                        }
                        if ((i9 & 32) != 0) {
                            C5228l1 c5228l1 = this.metaInfoBuilder_;
                            item.metaInfo_ = c5228l1 == null ? this.metaInfo_ : (MetaInfo) c5228l1.build();
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        Item.access$14876(item, i8);
                    }

                    public static final C5269x.b getDescriptor() {
                        return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_descriptor;
                    }

                    private C5228l1 getMetaInfoFieldBuilder() {
                        if (this.metaInfoBuilder_ == null) {
                            this.metaInfoBuilder_ = new C5228l1(getMetaInfo(), getParentForChildren(), isClean());
                            this.metaInfo_ = null;
                        }
                        return this.metaInfoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (AbstractC5209f0.alwaysUseFieldBuilders) {
                            getMetaInfoFieldBuilder();
                        }
                    }

                    public Builder clearIndex() {
                        this.index_ = Item.getDefaultInstance().getIndex();
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearIntervalTime() {
                        this.intervalTime_ = Item.getDefaultInstance().getIntervalTime();
                        this.bitField0_ &= -9;
                        onChanged();
                        return this;
                    }

                    public Builder clearItemId() {
                        this.itemId_ = Item.getDefaultInstance().getItemId();
                        this.bitField0_ &= -3;
                        onChanged();
                        return this;
                    }

                    public Builder clearMetaInfo() {
                        this.bitField0_ &= -33;
                        this.metaInfo_ = null;
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 != null) {
                            c5228l1.dispose();
                            this.metaInfoBuilder_ = null;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder clearOffsetPlayInTime() {
                        this.offsetPlayInTime_ = Item.getDefaultInstance().getOffsetPlayInTime();
                        this.bitField0_ &= -17;
                        onChanged();
                        return this;
                    }

                    public Builder clearUrl() {
                        this.url_ = Item.getDefaultInstance().getUrl();
                        this.bitField0_ &= -5;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                    public C5269x.b getDescriptorForType() {
                        return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_descriptor;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public String getIndex() {
                        Object obj = this.index_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                        this.index_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public AbstractC5235o getIndexBytes() {
                        Object obj = this.index_;
                        if (!(obj instanceof String)) {
                            return (AbstractC5235o) obj;
                        }
                        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                        this.index_ = abstractC5235oCopyFromUtf8;
                        return abstractC5235oCopyFromUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public String getIntervalTime() {
                        Object obj = this.intervalTime_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                        this.intervalTime_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public AbstractC5235o getIntervalTimeBytes() {
                        Object obj = this.intervalTime_;
                        if (!(obj instanceof String)) {
                            return (AbstractC5235o) obj;
                        }
                        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                        this.intervalTime_ = abstractC5235oCopyFromUtf8;
                        return abstractC5235oCopyFromUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public String getItemId() {
                        Object obj = this.itemId_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                        this.itemId_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public AbstractC5235o getItemIdBytes() {
                        Object obj = this.itemId_;
                        if (!(obj instanceof String)) {
                            return (AbstractC5235o) obj;
                        }
                        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                        this.itemId_ = abstractC5235oCopyFromUtf8;
                        return abstractC5235oCopyFromUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public MetaInfo getMetaInfo() {
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 != null) {
                            return (MetaInfo) c5228l1.getMessage();
                        }
                        MetaInfo metaInfo = this.metaInfo_;
                        return metaInfo == null ? MetaInfo.getDefaultInstance() : metaInfo;
                    }

                    public MetaInfo.Builder getMetaInfoBuilder() {
                        this.bitField0_ |= 32;
                        onChanged();
                        return (MetaInfo.Builder) getMetaInfoFieldBuilder().getBuilder();
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public MetaInfoOrBuilder getMetaInfoOrBuilder() {
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 != null) {
                            return (MetaInfoOrBuilder) c5228l1.getMessageOrBuilder();
                        }
                        MetaInfo metaInfo = this.metaInfo_;
                        return metaInfo == null ? MetaInfo.getDefaultInstance() : metaInfo;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public String getOffsetPlayInTime() {
                        Object obj = this.offsetPlayInTime_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                        this.offsetPlayInTime_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public AbstractC5235o getOffsetPlayInTimeBytes() {
                        Object obj = this.offsetPlayInTime_;
                        if (!(obj instanceof String)) {
                            return (AbstractC5235o) obj;
                        }
                        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                        this.offsetPlayInTime_ = abstractC5235oCopyFromUtf8;
                        return abstractC5235oCopyFromUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public AbstractC5235o getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (AbstractC5235o) obj;
                        }
                        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                        this.url_ = abstractC5235oCopyFromUtf8;
                        return abstractC5235oCopyFromUtf8;
                    }

                    @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                    public boolean hasMetaInfo() {
                        return (this.bitField0_ & 32) != 0;
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b
                    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                        return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeMetaInfo(MetaInfo metaInfo) {
                        MetaInfo metaInfo2;
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 != null) {
                            c5228l1.mergeFrom(metaInfo);
                        } else if ((this.bitField0_ & 32) == 0 || (metaInfo2 = this.metaInfo_) == null || metaInfo2 == MetaInfo.getDefaultInstance()) {
                            this.metaInfo_ = metaInfo;
                        } else {
                            getMetaInfoBuilder().mergeFrom(metaInfo);
                        }
                        if (this.metaInfo_ != null) {
                            this.bitField0_ |= 32;
                            onChanged();
                        }
                        return this;
                    }

                    public Builder setIndex(String str) {
                        str.getClass();
                        this.index_ = str;
                        this.bitField0_ |= 1;
                        onChanged();
                        return this;
                    }

                    public Builder setIndexBytes(AbstractC5235o abstractC5235o) {
                        abstractC5235o.getClass();
                        AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                        this.index_ = abstractC5235o;
                        this.bitField0_ |= 1;
                        onChanged();
                        return this;
                    }

                    public Builder setIntervalTime(String str) {
                        str.getClass();
                        this.intervalTime_ = str;
                        this.bitField0_ |= 8;
                        onChanged();
                        return this;
                    }

                    public Builder setIntervalTimeBytes(AbstractC5235o abstractC5235o) {
                        abstractC5235o.getClass();
                        AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                        this.intervalTime_ = abstractC5235o;
                        this.bitField0_ |= 8;
                        onChanged();
                        return this;
                    }

                    public Builder setItemId(String str) {
                        str.getClass();
                        this.itemId_ = str;
                        this.bitField0_ |= 2;
                        onChanged();
                        return this;
                    }

                    public Builder setItemIdBytes(AbstractC5235o abstractC5235o) {
                        abstractC5235o.getClass();
                        AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                        this.itemId_ = abstractC5235o;
                        this.bitField0_ |= 2;
                        onChanged();
                        return this;
                    }

                    public Builder setMetaInfo(MetaInfo metaInfo) {
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 == null) {
                            metaInfo.getClass();
                            this.metaInfo_ = metaInfo;
                        } else {
                            c5228l1.setMessage(metaInfo);
                        }
                        this.bitField0_ |= 32;
                        onChanged();
                        return this;
                    }

                    public Builder setOffsetPlayInTime(String str) {
                        str.getClass();
                        this.offsetPlayInTime_ = str;
                        this.bitField0_ |= 16;
                        onChanged();
                        return this;
                    }

                    public Builder setOffsetPlayInTimeBytes(AbstractC5235o abstractC5235o) {
                        abstractC5235o.getClass();
                        AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                        this.offsetPlayInTime_ = abstractC5235o;
                        this.bitField0_ |= 16;
                        onChanged();
                        return this;
                    }

                    public Builder setUrl(String str) {
                        str.getClass();
                        this.url_ = str;
                        this.bitField0_ |= 4;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlBytes(AbstractC5235o abstractC5235o) {
                        abstractC5235o.getClass();
                        AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                        this.url_ = abstractC5235o;
                        this.bitField0_ |= 4;
                        onChanged();
                        return this;
                    }

                    /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                        this();
                    }

                    private Builder() {
                        this.index_ = "";
                        this.itemId_ = "";
                        this.url_ = "";
                        this.intervalTime_ = "";
                        this.offsetPlayInTime_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                        return (Builder) super.addRepeatedField(gVar, obj);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                    public Item build() {
                        Item itemBuildPartial = buildPartial();
                        if (itemBuildPartial.isInitialized()) {
                            return itemBuildPartial;
                        }
                        throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) itemBuildPartial);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                    public Item buildPartial() {
                        Item item = new Item(this, null);
                        if (this.bitField0_ != 0) {
                            buildPartial0(item);
                        }
                        onBuilt();
                        return item;
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public Builder clearField(C5269x.g gVar) {
                        return (Builder) super.clearField(gVar);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                    public Item getDefaultInstanceForType() {
                        return Item.getDefaultInstance();
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public Builder setField(C5269x.g gVar, Object obj) {
                        return (Builder) super.setField(gVar, obj);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                        return (Builder) super.setRepeatedField(gVar, i8, obj);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public final Builder setUnknownFields(G1 g12) {
                        return (Builder) super.setUnknownFields(g12);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public Builder clearOneof(C5269x.l lVar) {
                        return (Builder) super.clearOneof(lVar);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public final Builder mergeUnknownFields(G1 g12) {
                        return (Builder) super.mergeUnknownFields(g12);
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                    public Builder clear() {
                        super.clear();
                        this.bitField0_ = 0;
                        this.index_ = "";
                        this.itemId_ = "";
                        this.url_ = "";
                        this.intervalTime_ = "";
                        this.offsetPlayInTime_ = "";
                        this.metaInfo_ = null;
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 != null) {
                            c5228l1.dispose();
                            this.metaInfoBuilder_ = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                    /* renamed from: clone */
                    public Builder mo3clone() {
                        return (Builder) super.mo3clone();
                    }

                    @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                    public Builder mergeFrom(H0 h02) {
                        if (h02 instanceof Item) {
                            return mergeFrom((Item) h02);
                        }
                        super.mergeFrom(h02);
                        return this;
                    }

                    public Builder setMetaInfo(MetaInfo.Builder builder) {
                        C5228l1 c5228l1 = this.metaInfoBuilder_;
                        if (c5228l1 == null) {
                            this.metaInfo_ = builder.build();
                        } else {
                            c5228l1.setMessage(builder.build());
                        }
                        this.bitField0_ |= 32;
                        onChanged();
                        return this;
                    }

                    private Builder(AbstractC5209f0.c cVar) {
                        super(cVar);
                        this.index_ = "";
                        this.itemId_ = "";
                        this.url_ = "";
                        this.intervalTime_ = "";
                        this.offsetPlayInTime_ = "";
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(Item item) {
                        if (item == Item.getDefaultInstance()) {
                            return this;
                        }
                        if (!item.getIndex().isEmpty()) {
                            this.index_ = item.index_;
                            this.bitField0_ |= 1;
                            onChanged();
                        }
                        if (!item.getItemId().isEmpty()) {
                            this.itemId_ = item.itemId_;
                            this.bitField0_ |= 2;
                            onChanged();
                        }
                        if (!item.getUrl().isEmpty()) {
                            this.url_ = item.url_;
                            this.bitField0_ |= 4;
                            onChanged();
                        }
                        if (!item.getIntervalTime().isEmpty()) {
                            this.intervalTime_ = item.intervalTime_;
                            this.bitField0_ |= 8;
                            onChanged();
                        }
                        if (!item.getOffsetPlayInTime().isEmpty()) {
                            this.offsetPlayInTime_ = item.offsetPlayInTime_;
                            this.bitField0_ |= 16;
                            onChanged();
                        }
                        if (item.hasMetaInfo()) {
                            mergeMetaInfo(item.getMetaInfo());
                        }
                        mergeUnknownFields(item.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                    public Builder mergeFrom(r rVar, M m8) {
                        m8.getClass();
                        boolean z8 = false;
                        while (!z8) {
                            try {
                                try {
                                    int tag = rVar.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.index_ = rVar.readStringRequireUtf8();
                                            this.bitField0_ |= 1;
                                        } else if (tag == 18) {
                                            this.itemId_ = rVar.readStringRequireUtf8();
                                            this.bitField0_ |= 2;
                                        } else if (tag == 26) {
                                            this.url_ = rVar.readStringRequireUtf8();
                                            this.bitField0_ |= 4;
                                        } else if (tag == 34) {
                                            this.intervalTime_ = rVar.readStringRequireUtf8();
                                            this.bitField0_ |= 8;
                                        } else if (tag == 42) {
                                            this.offsetPlayInTime_ = rVar.readStringRequireUtf8();
                                            this.bitField0_ |= 16;
                                        } else if (tag != 50) {
                                            if (!super.parseUnknownField(rVar, m8, tag)) {
                                            }
                                        } else {
                                            rVar.readMessage(getMetaInfoFieldBuilder().getBuilder(), m8);
                                            this.bitField0_ |= 32;
                                        }
                                    }
                                    z8 = true;
                                } catch (C5230m0 e8) {
                                    throw e8.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }
                }

                /* synthetic */ Item(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                    this(bVar);
                }

                static /* synthetic */ int access$14876(Item item, int i8) {
                    int i9 = i8 | item.bitField0_;
                    item.bitField0_ = i9;
                    return i9;
                }

                public static Item getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Item parseDelimitedFrom(InputStream inputStream) {
                    return (Item) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Item parseFrom(ByteBuffer byteBuffer) {
                    return (Item) PARSER.parseFrom(byteBuffer);
                }

                public static Z0 parser() {
                    return PARSER;
                }

                @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Item)) {
                        return super.equals(obj);
                    }
                    Item item = (Item) obj;
                    if (getIndex().equals(item.getIndex()) && getItemId().equals(item.getItemId()) && getUrl().equals(item.getUrl()) && getIntervalTime().equals(item.getIntervalTime()) && getOffsetPlayInTime().equals(item.getOffsetPlayInTime()) && hasMetaInfo() == item.hasMetaInfo()) {
                        return (!hasMetaInfo() || getMetaInfo().equals(item.getMetaInfo())) && getUnknownFields().equals(item.getUnknownFields());
                    }
                    return false;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public String getIndex() {
                    Object obj = this.index_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.index_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public AbstractC5235o getIndexBytes() {
                    Object obj = this.index_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.index_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public String getIntervalTime() {
                    Object obj = this.intervalTime_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.intervalTime_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public AbstractC5235o getIntervalTimeBytes() {
                    Object obj = this.intervalTime_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.intervalTime_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public String getItemId() {
                    Object obj = this.itemId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.itemId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public AbstractC5235o getItemIdBytes() {
                    Object obj = this.itemId_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.itemId_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public MetaInfo getMetaInfo() {
                    MetaInfo metaInfo = this.metaInfo_;
                    return metaInfo == null ? MetaInfo.getDefaultInstance() : metaInfo;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public MetaInfoOrBuilder getMetaInfoOrBuilder() {
                    MetaInfo metaInfo = this.metaInfo_;
                    return metaInfo == null ? MetaInfo.getDefaultInstance() : metaInfo;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public String getOffsetPlayInTime() {
                    Object obj = this.offsetPlayInTime_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.offsetPlayInTime_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public AbstractC5235o getOffsetPlayInTimeBytes() {
                    Object obj = this.offsetPlayInTime_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.offsetPlayInTime_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
                public Z0 getParserForType() {
                    return PARSER;
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
                public int getSerializedSize() {
                    int i8 = this.memoizedSize;
                    if (i8 != -1) {
                        return i8;
                    }
                    int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.index_) ? AbstractC5209f0.computeStringSize(1, this.index_) : 0;
                    if (!AbstractC5209f0.isStringEmpty(this.itemId_)) {
                        iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.itemId_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.url_)) {
                        iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.url_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.intervalTime_)) {
                        iComputeStringSize += AbstractC5209f0.computeStringSize(4, this.intervalTime_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.offsetPlayInTime_)) {
                        iComputeStringSize += AbstractC5209f0.computeStringSize(5, this.offsetPlayInTime_);
                    }
                    if ((1 & this.bitField0_) != 0) {
                        iComputeStringSize += AbstractC5248t.computeMessageSize(6, getMetaInfo());
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public AbstractC5235o getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.url_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayList.ItemOrBuilder
                public boolean hasMetaInfo() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
                public int hashCode() {
                    int i8 = this.memoizedHashCode;
                    if (i8 != 0) {
                        return i8;
                    }
                    int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getIndex().hashCode()) * 37) + 2) * 53) + getItemId().hashCode()) * 37) + 3) * 53) + getUrl().hashCode()) * 37) + 4) * 53) + getIntervalTime().hashCode()) * 37) + 5) * 53) + getOffsetPlayInTime().hashCode();
                    if (hasMetaInfo()) {
                        iHashCode = (((iHashCode * 37) + 6) * 53) + getMetaInfo().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.AbstractC5209f0
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    byte b9 = this.memoizedIsInitialized;
                    if (b9 == 1) {
                        return true;
                    }
                    if (b9 == 0) {
                        return false;
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.AbstractC5209f0
                protected Object newInstance(AbstractC5209f0.h hVar) {
                    return new Item();
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
                public void writeTo(AbstractC5248t abstractC5248t) {
                    if (!AbstractC5209f0.isStringEmpty(this.index_)) {
                        AbstractC5209f0.writeString(abstractC5248t, 1, this.index_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.itemId_)) {
                        AbstractC5209f0.writeString(abstractC5248t, 2, this.itemId_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.url_)) {
                        AbstractC5209f0.writeString(abstractC5248t, 3, this.url_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.intervalTime_)) {
                        AbstractC5209f0.writeString(abstractC5248t, 4, this.intervalTime_);
                    }
                    if (!AbstractC5209f0.isStringEmpty(this.offsetPlayInTime_)) {
                        AbstractC5209f0.writeString(abstractC5248t, 5, this.offsetPlayInTime_);
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        abstractC5248t.writeMessage(6, getMetaInfo());
                    }
                    getUnknownFields().writeTo(abstractC5248t);
                }

                private Item(AbstractC5209f0.b bVar) {
                    super(bVar);
                    this.index_ = "";
                    this.itemId_ = "";
                    this.url_ = "";
                    this.intervalTime_ = "";
                    this.offsetPlayInTime_ = "";
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Builder newBuilder(Item item) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(item);
                }

                public static Item parseFrom(ByteBuffer byteBuffer, M m8) {
                    return (Item) PARSER.parseFrom(byteBuffer, m8);
                }

                public static Item parseDelimitedFrom(InputStream inputStream, M m8) {
                    return (Item) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
                }

                public static Item parseFrom(AbstractC5235o abstractC5235o) {
                    return (Item) PARSER.parseFrom(abstractC5235o);
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public Item getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
                public Builder toBuilder() {
                    AnonymousClass1 anonymousClass1 = null;
                    return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
                }

                public static Item parseFrom(AbstractC5235o abstractC5235o, M m8) {
                    return (Item) PARSER.parseFrom(abstractC5235o, m8);
                }

                @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Item parseFrom(byte[] bArr) {
                    return (Item) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.protobuf.AbstractC5209f0
                public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                    return new Builder(cVar, null);
                }

                public static Item parseFrom(byte[] bArr, M m8) {
                    return (Item) PARSER.parseFrom(bArr, m8);
                }

                public static Item parseFrom(InputStream inputStream) {
                    return (Item) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
                }

                private Item() {
                    this.index_ = "";
                    this.itemId_ = "";
                    this.url_ = "";
                    this.intervalTime_ = "";
                    this.offsetPlayInTime_ = "";
                    this.memoizedIsInitialized = (byte) -1;
                    this.index_ = "";
                    this.itemId_ = "";
                    this.url_ = "";
                    this.intervalTime_ = "";
                    this.offsetPlayInTime_ = "";
                }

                public static Item parseFrom(InputStream inputStream, M m8) {
                    return (Item) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
                }

                public static Item parseFrom(r rVar) {
                    return (Item) AbstractC5209f0.parseWithIOException(PARSER, rVar);
                }

                public static Item parseFrom(r rVar, M m8) {
                    return (Item) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
                }
            }

            public interface ItemOrBuilder extends N0 {
                @Override // com.google.protobuf.N0
                /* synthetic */ List findInitializationErrors();

                @Override // com.google.protobuf.N0
                /* synthetic */ Map getAllFields();

                @Override // com.google.protobuf.N0, A7.a.c
                /* synthetic */ H0 getDefaultInstanceForType();

                @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.google.protobuf.N0, A7.a.c
                /* synthetic */ C5269x.b getDescriptorForType();

                @Override // com.google.protobuf.N0
                /* synthetic */ Object getField(C5269x.g gVar);

                String getIndex();

                AbstractC5235o getIndexBytes();

                @Override // com.google.protobuf.N0
                /* synthetic */ String getInitializationErrorString();

                String getIntervalTime();

                AbstractC5235o getIntervalTimeBytes();

                String getItemId();

                AbstractC5235o getItemIdBytes();

                MetaInfo getMetaInfo();

                MetaInfoOrBuilder getMetaInfoOrBuilder();

                String getOffsetPlayInTime();

                AbstractC5235o getOffsetPlayInTimeBytes();

                @Override // com.google.protobuf.N0
                /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

                @Override // com.google.protobuf.N0
                /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

                @Override // com.google.protobuf.N0
                /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

                @Override // com.google.protobuf.N0
                /* synthetic */ G1 getUnknownFields();

                String getUrl();

                AbstractC5235o getUrlBytes();

                @Override // com.google.protobuf.N0
                /* synthetic */ boolean hasField(C5269x.g gVar);

                boolean hasMetaInfo();

                @Override // com.google.protobuf.N0
                /* synthetic */ boolean hasOneof(C5269x.l lVar);

                @Override // com.google.protobuf.N0, A7.a.c
                /* synthetic */ boolean isInitialized();
            }

            /* synthetic */ PlayList(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static PlayList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static PlayList parseDelimitedFrom(InputStream inputStream) {
                return (PlayList) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static PlayList parseFrom(ByteBuffer byteBuffer) {
                return (PlayList) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PlayList)) {
                    return super.equals(obj);
                }
                PlayList playList = (PlayList) obj;
                return getItemList().equals(playList.getItemList()) && getUnknownFields().equals(playList.getUnknownFields());
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
            public Item getItem(int i8) {
                return this.item_.get(i8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
            public int getItemCount() {
                return this.item_.size();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
            public List<Item> getItemList() {
                return this.item_;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
            public ItemOrBuilder getItemOrBuilder(int i8) {
                return this.item_.get(i8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayload.PlayListOrBuilder
            public List<? extends ItemOrBuilder> getItemOrBuilderList() {
                return this.item_;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeMessageSize = 0;
                for (int i9 = 0; i9 < this.item_.size(); i9++) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(1, this.item_.get(i9));
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getItemCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getItemList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayList.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new PlayList();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                for (int i8 = 0; i8 < this.item_.size(); i8++) {
                    abstractC5248t.writeMessage(1, this.item_.get(i8));
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private PlayList(AbstractC5209f0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(PlayList playList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(playList);
            }

            public static PlayList parseFrom(ByteBuffer byteBuffer, M m8) {
                return (PlayList) PARSER.parseFrom(byteBuffer, m8);
            }

            public static PlayList parseDelimitedFrom(InputStream inputStream, M m8) {
                return (PlayList) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static PlayList parseFrom(AbstractC5235o abstractC5235o) {
                return (PlayList) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public PlayList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            private PlayList() {
                this.memoizedIsInitialized = (byte) -1;
                this.item_ = Collections.emptyList();
            }

            public static PlayList parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (PlayList) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static PlayList parseFrom(byte[] bArr) {
                return (PlayList) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static PlayList parseFrom(byte[] bArr, M m8) {
                return (PlayList) PARSER.parseFrom(bArr, m8);
            }

            public static PlayList parseFrom(InputStream inputStream) {
                return (PlayList) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static PlayList parseFrom(InputStream inputStream, M m8) {
                return (PlayList) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static PlayList parseFrom(r rVar) {
                return (PlayList) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static PlayList parseFrom(r rVar, M m8) {
                return (PlayList) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface PlayListOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            PlayList.Item getItem(int i8);

            int getItemCount();

            List<PlayList.Item> getItemList();

            PlayList.ItemOrBuilder getItemOrBuilder(int i8);

            List<? extends PlayList.ItemOrBuilder> getItemOrBuilderList();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ AudioPlayClovaPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$16576(AudioPlayClovaPayload audioPlayClovaPayload, int i8) {
            int i9 = i8 | audioPlayClovaPayload.bitField0_;
            audioPlayClovaPayload.bitField0_ = i9;
            return i9;
        }

        public static AudioPlayClovaPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioPlayClovaPayload parseDelimitedFrom(InputStream inputStream) {
            return (AudioPlayClovaPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioPlayClovaPayload parseFrom(ByteBuffer byteBuffer) {
            return (AudioPlayClovaPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioPlayClovaPayload)) {
                return super.equals(obj);
            }
            AudioPlayClovaPayload audioPlayClovaPayload = (AudioPlayClovaPayload) obj;
            if (hasDirectiveBody() != audioPlayClovaPayload.hasDirectiveBody()) {
                return false;
            }
            if ((!hasDirectiveBody() || getDirectiveBody().equals(audioPlayClovaPayload.getDirectiveBody())) && hasPlayList() == audioPlayClovaPayload.hasPlayList()) {
                return (!hasPlayList() || getPlayList().equals(audioPlayClovaPayload.getPlayList())) && getUnknownFields().equals(audioPlayClovaPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
        public DirectiveBody getDirectiveBody() {
            DirectiveBody directiveBody = this.directiveBody_;
            return directiveBody == null ? DirectiveBody.getDefaultInstance() : directiveBody;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
        public DirectiveBodyOrBuilder getDirectiveBodyOrBuilder() {
            DirectiveBody directiveBody = this.directiveBody_;
            return directiveBody == null ? DirectiveBody.getDefaultInstance() : directiveBody;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
        public PlayList getPlayList() {
            PlayList playList = this.playList_;
            return playList == null ? PlayList.getDefaultInstance() : playList;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
        public PlayListOrBuilder getPlayListOrBuilder() {
            PlayList playList = this.playList_;
            return playList == null ? PlayList.getDefaultInstance() : playList;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getDirectiveBody()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, getPlayList());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
        public boolean hasDirectiveBody() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayClovaPayloadOrBuilder
        public boolean hasPlayList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDirectiveBody()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDirectiveBody().hashCode();
            }
            if (hasPlayList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPlayList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayClovaPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPlayClovaPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AudioPlayClovaPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getDirectiveBody());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(2, getPlayList());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AudioPlayClovaPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AudioPlayClovaPayload audioPlayClovaPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioPlayClovaPayload);
        }

        public static AudioPlayClovaPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AudioPlayClovaPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AudioPlayClovaPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AudioPlayClovaPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AudioPlayClovaPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (AudioPlayClovaPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AudioPlayClovaPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        private AudioPlayClovaPayload() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioPlayClovaPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AudioPlayClovaPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioPlayClovaPayload parseFrom(byte[] bArr) {
            return (AudioPlayClovaPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static AudioPlayClovaPayload parseFrom(byte[] bArr, M m8) {
            return (AudioPlayClovaPayload) PARSER.parseFrom(bArr, m8);
        }

        public static AudioPlayClovaPayload parseFrom(InputStream inputStream) {
            return (AudioPlayClovaPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AudioPlayClovaPayload parseFrom(InputStream inputStream, M m8) {
            return (AudioPlayClovaPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AudioPlayClovaPayload parseFrom(r rVar) {
            return (AudioPlayClovaPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AudioPlayClovaPayload parseFrom(r rVar, M m8) {
            return (AudioPlayClovaPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AudioPlayClovaPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        AudioPlayClovaPayload.DirectiveBody getDirectiveBody();

        AudioPlayClovaPayload.DirectiveBodyOrBuilder getDirectiveBodyOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        AudioPlayClovaPayload.PlayList getPlayList();

        AudioPlayClovaPayload.PlayListOrBuilder getPlayListOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasDirectiveBody();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasPlayList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class AudioPlayPayload extends AbstractC5209f0 implements AudioPlayPayloadOrBuilder {
        public static final int METADATA_FIELD_NUMBER = 2;
        public static final int STREAM_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Metadata metadata_;
        private Stream stream_;
        private static final AudioPlayPayload DEFAULT_INSTANCE = new AudioPlayPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AudioPlayPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AudioPlayPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AudioPlayPayloadOrBuilder {
            private int bitField0_;
            private C5228l1 metadataBuilder_;
            private Metadata metadata_;
            private C5228l1 streamBuilder_;
            private Stream stream_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AudioPlayPayload audioPlayPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.streamBuilder_;
                    audioPlayPayload.stream_ = c5228l1 == null ? this.stream_ : (Stream) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l12 = this.metadataBuilder_;
                    audioPlayPayload.metadata_ = c5228l12 == null ? this.metadata_ : (Metadata) c5228l12.build();
                    i8 |= 2;
                }
                AudioPlayPayload.access$8276(audioPlayPayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_descriptor;
            }

            private C5228l1 getMetadataFieldBuilder() {
                if (this.metadataBuilder_ == null) {
                    this.metadataBuilder_ = new C5228l1(getMetadata(), getParentForChildren(), isClean());
                    this.metadata_ = null;
                }
                return this.metadataBuilder_;
            }

            private C5228l1 getStreamFieldBuilder() {
                if (this.streamBuilder_ == null) {
                    this.streamBuilder_ = new C5228l1(getStream(), getParentForChildren(), isClean());
                    this.stream_ = null;
                }
                return this.streamBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getStreamFieldBuilder();
                    getMetadataFieldBuilder();
                }
            }

            public Builder clearMetadata() {
                this.bitField0_ &= -3;
                this.metadata_ = null;
                C5228l1 c5228l1 = this.metadataBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metadataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStream() {
                this.bitField0_ &= -2;
                this.stream_ = null;
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.streamBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
            public Metadata getMetadata() {
                C5228l1 c5228l1 = this.metadataBuilder_;
                if (c5228l1 != null) {
                    return (Metadata) c5228l1.getMessage();
                }
                Metadata metadata = this.metadata_;
                return metadata == null ? Metadata.getDefaultInstance() : metadata;
            }

            public Metadata.Builder getMetadataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Metadata.Builder) getMetadataFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
            public MetadataOrBuilder getMetadataOrBuilder() {
                C5228l1 c5228l1 = this.metadataBuilder_;
                if (c5228l1 != null) {
                    return (MetadataOrBuilder) c5228l1.getMessageOrBuilder();
                }
                Metadata metadata = this.metadata_;
                return metadata == null ? Metadata.getDefaultInstance() : metadata;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
            public Stream getStream() {
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 != null) {
                    return (Stream) c5228l1.getMessage();
                }
                Stream stream = this.stream_;
                return stream == null ? Stream.getDefaultInstance() : stream;
            }

            public Stream.Builder getStreamBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Stream.Builder) getStreamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
            public StreamOrBuilder getStreamOrBuilder() {
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 != null) {
                    return (StreamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                Stream stream = this.stream_;
                return stream == null ? Stream.getDefaultInstance() : stream;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
            public boolean hasMetadata() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
            public boolean hasStream() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPlayPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMetadata(Metadata metadata) {
                Metadata metadata2;
                C5228l1 c5228l1 = this.metadataBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(metadata);
                } else if ((this.bitField0_ & 2) == 0 || (metadata2 = this.metadata_) == null || metadata2 == Metadata.getDefaultInstance()) {
                    this.metadata_ = metadata;
                } else {
                    getMetadataBuilder().mergeFrom(metadata);
                }
                if (this.metadata_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStream(Stream stream) {
                Stream stream2;
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(stream);
                } else if ((this.bitField0_ & 1) == 0 || (stream2 = this.stream_) == null || stream2 == Stream.getDefaultInstance()) {
                    this.stream_ = stream;
                } else {
                    getStreamBuilder().mergeFrom(stream);
                }
                if (this.stream_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setMetadata(Metadata metadata) {
                C5228l1 c5228l1 = this.metadataBuilder_;
                if (c5228l1 == null) {
                    metadata.getClass();
                    this.metadata_ = metadata;
                } else {
                    c5228l1.setMessage(metadata);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStream(Stream stream) {
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 == null) {
                    stream.getClass();
                    this.stream_ = stream;
                } else {
                    c5228l1.setMessage(stream);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioPlayPayload build() {
                AudioPlayPayload audioPlayPayloadBuildPartial = buildPartial();
                if (audioPlayPayloadBuildPartial.isInitialized()) {
                    return audioPlayPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) audioPlayPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioPlayPayload buildPartial() {
                AudioPlayPayload audioPlayPayload = new AudioPlayPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(audioPlayPayload);
                }
                onBuilt();
                return audioPlayPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AudioPlayPayload getDefaultInstanceForType() {
                return AudioPlayPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.stream_ = null;
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.streamBuilder_ = null;
                }
                this.metadata_ = null;
                C5228l1 c5228l12 = this.metadataBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.metadataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AudioPlayPayload) {
                    return mergeFrom((AudioPlayPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setMetadata(Metadata.Builder builder) {
                C5228l1 c5228l1 = this.metadataBuilder_;
                if (c5228l1 == null) {
                    this.metadata_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStream(Stream.Builder builder) {
                C5228l1 c5228l1 = this.streamBuilder_;
                if (c5228l1 == null) {
                    this.stream_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(AudioPlayPayload audioPlayPayload) {
                if (audioPlayPayload == AudioPlayPayload.getDefaultInstance()) {
                    return this;
                }
                if (audioPlayPayload.hasStream()) {
                    mergeStream(audioPlayPayload.getStream());
                }
                if (audioPlayPayload.hasMetadata()) {
                    mergeMetadata(audioPlayPayload.getMetadata());
                }
                mergeUnknownFields(audioPlayPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    rVar.readMessage(getStreamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetadataFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class Metadata extends AbstractC5209f0 implements MetadataOrBuilder {
            public static final int ART_FIELD_NUMBER = 11;
            public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 12;
            private static final Metadata DEFAULT_INSTANCE = new Metadata();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.Metadata.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public Metadata parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = Metadata.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
            public static final int SUBTITLE_FIELD_NUMBER = 2;
            public static final int TITLE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private Sources art_;
            private Sources backgroundImage_;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private volatile Object subtitle_;
            private volatile Object title_;

            public static final class Builder extends AbstractC5209f0.b implements MetadataOrBuilder {
                private C5228l1 artBuilder_;
                private Sources art_;
                private C5228l1 backgroundImageBuilder_;
                private Sources backgroundImage_;
                private int bitField0_;
                private Object subtitle_;
                private Object title_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(Metadata metadata) {
                    int i8;
                    int i9 = this.bitField0_;
                    if ((i9 & 1) != 0) {
                        metadata.title_ = this.title_;
                    }
                    if ((i9 & 2) != 0) {
                        metadata.subtitle_ = this.subtitle_;
                    }
                    if ((i9 & 4) != 0) {
                        C5228l1 c5228l1 = this.artBuilder_;
                        metadata.art_ = c5228l1 == null ? this.art_ : (Sources) c5228l1.build();
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    if ((i9 & 8) != 0) {
                        C5228l1 c5228l12 = this.backgroundImageBuilder_;
                        metadata.backgroundImage_ = c5228l12 == null ? this.backgroundImage_ : (Sources) c5228l12.build();
                        i8 |= 2;
                    }
                    Metadata.access$7376(metadata, i8);
                }

                private C5228l1 getArtFieldBuilder() {
                    if (this.artBuilder_ == null) {
                        this.artBuilder_ = new C5228l1(getArt(), getParentForChildren(), isClean());
                        this.art_ = null;
                    }
                    return this.artBuilder_;
                }

                private C5228l1 getBackgroundImageFieldBuilder() {
                    if (this.backgroundImageBuilder_ == null) {
                        this.backgroundImageBuilder_ = new C5228l1(getBackgroundImage(), getParentForChildren(), isClean());
                        this.backgroundImage_ = null;
                    }
                    return this.backgroundImageBuilder_;
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Metadata_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    if (AbstractC5209f0.alwaysUseFieldBuilders) {
                        getArtFieldBuilder();
                        getBackgroundImageFieldBuilder();
                    }
                }

                public Builder clearArt() {
                    this.bitField0_ &= -5;
                    this.art_ = null;
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.artBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearBackgroundImage() {
                    this.bitField0_ &= -9;
                    this.backgroundImage_ = null;
                    C5228l1 c5228l1 = this.backgroundImageBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.backgroundImageBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearSubtitle() {
                    this.subtitle_ = Metadata.getDefaultInstance().getSubtitle();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearTitle() {
                    this.title_ = Metadata.getDefaultInstance().getTitle();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public Sources getArt() {
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 != null) {
                        return (Sources) c5228l1.getMessage();
                    }
                    Sources sources = this.art_;
                    return sources == null ? Sources.getDefaultInstance() : sources;
                }

                public Sources.Builder getArtBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return (Sources.Builder) getArtFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public SourcesOrBuilder getArtOrBuilder() {
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 != null) {
                        return (SourcesOrBuilder) c5228l1.getMessageOrBuilder();
                    }
                    Sources sources = this.art_;
                    return sources == null ? Sources.getDefaultInstance() : sources;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public Sources getBackgroundImage() {
                    C5228l1 c5228l1 = this.backgroundImageBuilder_;
                    if (c5228l1 != null) {
                        return (Sources) c5228l1.getMessage();
                    }
                    Sources sources = this.backgroundImage_;
                    return sources == null ? Sources.getDefaultInstance() : sources;
                }

                public Sources.Builder getBackgroundImageBuilder() {
                    this.bitField0_ |= 8;
                    onChanged();
                    return (Sources.Builder) getBackgroundImageFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public SourcesOrBuilder getBackgroundImageOrBuilder() {
                    C5228l1 c5228l1 = this.backgroundImageBuilder_;
                    if (c5228l1 != null) {
                        return (SourcesOrBuilder) c5228l1.getMessageOrBuilder();
                    }
                    Sources sources = this.backgroundImage_;
                    return sources == null ? Sources.getDefaultInstance() : sources;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Metadata_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public String getSubtitle() {
                    Object obj = this.subtitle_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.subtitle_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public AbstractC5235o getSubtitleBytes() {
                    Object obj = this.subtitle_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.subtitle_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public String getTitle() {
                    Object obj = this.title_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public AbstractC5235o getTitleBytes() {
                    Object obj = this.title_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.title_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public boolean hasArt() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
                public boolean hasBackgroundImage() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Metadata_fieldAccessorTable.ensureFieldAccessorsInitialized(Metadata.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeArt(Sources sources) {
                    Sources sources2;
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.mergeFrom(sources);
                    } else if ((this.bitField0_ & 4) == 0 || (sources2 = this.art_) == null || sources2 == Sources.getDefaultInstance()) {
                        this.art_ = sources;
                    } else {
                        getArtBuilder().mergeFrom(sources);
                    }
                    if (this.art_ != null) {
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    return this;
                }

                public Builder mergeBackgroundImage(Sources sources) {
                    Sources sources2;
                    C5228l1 c5228l1 = this.backgroundImageBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.mergeFrom(sources);
                    } else if ((this.bitField0_ & 8) == 0 || (sources2 = this.backgroundImage_) == null || sources2 == Sources.getDefaultInstance()) {
                        this.backgroundImage_ = sources;
                    } else {
                        getBackgroundImageBuilder().mergeFrom(sources);
                    }
                    if (this.backgroundImage_ != null) {
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    return this;
                }

                public Builder setArt(Sources sources) {
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 == null) {
                        sources.getClass();
                        this.art_ = sources;
                    } else {
                        c5228l1.setMessage(sources);
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setBackgroundImage(Sources sources) {
                    C5228l1 c5228l1 = this.backgroundImageBuilder_;
                    if (c5228l1 == null) {
                        sources.getClass();
                        this.backgroundImage_ = sources;
                    } else {
                        c5228l1.setMessage(sources);
                    }
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setSubtitle(String str) {
                    str.getClass();
                    this.subtitle_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setSubtitleBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.subtitle_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setTitle(String str) {
                    str.getClass();
                    this.title_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setTitleBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.title_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.title_ = "";
                    this.subtitle_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Metadata build() {
                    Metadata metadataBuildPartial = buildPartial();
                    if (metadataBuildPartial.isInitialized()) {
                        return metadataBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) metadataBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Metadata buildPartial() {
                    Metadata metadata = new Metadata(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(metadata);
                    }
                    onBuilt();
                    return metadata;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public Metadata getDefaultInstanceForType() {
                    return Metadata.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.title_ = "";
                    this.subtitle_ = "";
                    this.art_ = null;
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.artBuilder_ = null;
                    }
                    this.backgroundImage_ = null;
                    C5228l1 c5228l12 = this.backgroundImageBuilder_;
                    if (c5228l12 != null) {
                        c5228l12.dispose();
                        this.backgroundImageBuilder_ = null;
                    }
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.title_ = "";
                    this.subtitle_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof Metadata) {
                        return mergeFrom((Metadata) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setArt(Sources.Builder builder) {
                    C5228l1 c5228l1 = this.artBuilder_;
                    if (c5228l1 == null) {
                        this.art_ = builder.build();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setBackgroundImage(Sources.Builder builder) {
                    C5228l1 c5228l1 = this.backgroundImageBuilder_;
                    if (c5228l1 == null) {
                        this.backgroundImage_ = builder.build();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(Metadata metadata) {
                    if (metadata == Metadata.getDefaultInstance()) {
                        return this;
                    }
                    if (!metadata.getTitle().isEmpty()) {
                        this.title_ = metadata.title_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!metadata.getSubtitle().isEmpty()) {
                        this.subtitle_ = metadata.subtitle_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (metadata.hasArt()) {
                        mergeArt(metadata.getArt());
                    }
                    if (metadata.hasBackgroundImage()) {
                        mergeBackgroundImage(metadata.getBackgroundImage());
                    }
                    mergeUnknownFields(metadata.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.title_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.subtitle_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 90) {
                                        rVar.readMessage(getArtFieldBuilder().getBuilder(), m8);
                                        this.bitField0_ |= 4;
                                    } else if (tag != 98) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getBackgroundImageFieldBuilder().getBuilder(), m8);
                                        this.bitField0_ |= 8;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ Metadata(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            static /* synthetic */ int access$7376(Metadata metadata, int i8) {
                int i9 = i8 | metadata.bitField0_;
                metadata.bitField0_ = i9;
                return i9;
            }

            public static Metadata getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Metadata_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Metadata parseDelimitedFrom(InputStream inputStream) {
                return (Metadata) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Metadata parseFrom(ByteBuffer byteBuffer) {
                return (Metadata) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Metadata)) {
                    return super.equals(obj);
                }
                Metadata metadata = (Metadata) obj;
                if (!getTitle().equals(metadata.getTitle()) || !getSubtitle().equals(metadata.getSubtitle()) || hasArt() != metadata.hasArt()) {
                    return false;
                }
                if ((!hasArt() || getArt().equals(metadata.getArt())) && hasBackgroundImage() == metadata.hasBackgroundImage()) {
                    return (!hasBackgroundImage() || getBackgroundImage().equals(metadata.getBackgroundImage())) && getUnknownFields().equals(metadata.getUnknownFields());
                }
                return false;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public Sources getArt() {
                Sources sources = this.art_;
                return sources == null ? Sources.getDefaultInstance() : sources;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public SourcesOrBuilder getArtOrBuilder() {
                Sources sources = this.art_;
                return sources == null ? Sources.getDefaultInstance() : sources;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public Sources getBackgroundImage() {
                Sources sources = this.backgroundImage_;
                return sources == null ? Sources.getDefaultInstance() : sources;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public SourcesOrBuilder getBackgroundImageOrBuilder() {
                Sources sources = this.backgroundImage_;
                return sources == null ? Sources.getDefaultInstance() : sources;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.title_) ? AbstractC5209f0.computeStringSize(1, this.title_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.subtitle_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.subtitle_);
                }
                if ((1 & this.bitField0_) != 0) {
                    iComputeStringSize += AbstractC5248t.computeMessageSize(11, getArt());
                }
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += AbstractC5248t.computeMessageSize(12, getBackgroundImage());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public String getSubtitle() {
                Object obj = this.subtitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.subtitle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public AbstractC5235o getSubtitleBytes() {
                Object obj = this.subtitle_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.subtitle_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public AbstractC5235o getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.title_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public boolean hasArt() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.MetadataOrBuilder
            public boolean hasBackgroundImage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTitle().hashCode()) * 37) + 2) * 53) + getSubtitle().hashCode();
                if (hasArt()) {
                    iHashCode = (((iHashCode * 37) + 11) * 53) + getArt().hashCode();
                }
                if (hasBackgroundImage()) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getBackgroundImage().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Metadata_fieldAccessorTable.ensureFieldAccessorsInitialized(Metadata.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new Metadata();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.title_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.subtitle_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 2, this.subtitle_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    abstractC5248t.writeMessage(11, getArt());
                }
                if ((this.bitField0_ & 2) != 0) {
                    abstractC5248t.writeMessage(12, getBackgroundImage());
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private Metadata(AbstractC5209f0.b bVar) {
                super(bVar);
                this.title_ = "";
                this.subtitle_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Metadata metadata) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metadata);
            }

            public static Metadata parseFrom(ByteBuffer byteBuffer, M m8) {
                return (Metadata) PARSER.parseFrom(byteBuffer, m8);
            }

            public static Metadata parseDelimitedFrom(InputStream inputStream, M m8) {
                return (Metadata) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static Metadata parseFrom(AbstractC5235o abstractC5235o) {
                return (Metadata) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Metadata getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static Metadata parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (Metadata) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Metadata parseFrom(byte[] bArr) {
                return (Metadata) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            private Metadata() {
                this.title_ = "";
                this.subtitle_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.title_ = "";
                this.subtitle_ = "";
            }

            public static Metadata parseFrom(byte[] bArr, M m8) {
                return (Metadata) PARSER.parseFrom(bArr, m8);
            }

            public static Metadata parseFrom(InputStream inputStream) {
                return (Metadata) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static Metadata parseFrom(InputStream inputStream, M m8) {
                return (Metadata) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static Metadata parseFrom(r rVar) {
                return (Metadata) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static Metadata parseFrom(r rVar, M m8) {
                return (Metadata) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface MetadataOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            Sources getArt();

            SourcesOrBuilder getArtOrBuilder();

            Sources getBackgroundImage();

            SourcesOrBuilder getBackgroundImageOrBuilder();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            String getSubtitle();

            AbstractC5235o getSubtitleBytes();

            String getTitle();

            AbstractC5235o getTitleBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            boolean hasArt();

            boolean hasBackgroundImage();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        public static final class Sources extends AbstractC5209f0 implements SourcesOrBuilder {
            private static final Sources DEFAULT_INSTANCE = new Sources();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.Sources.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public Sources parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = Sources.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
            public static final int URLS_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private C5247s0 urls_;

            public static final class Builder extends AbstractC5209f0.b implements SourcesOrBuilder {
                private int bitField0_;
                private C5247s0 urls_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(Sources sources) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.urls_.makeImmutable();
                        sources.urls_ = this.urls_;
                    }
                }

                private void ensureUrlsIsMutable() {
                    if (!this.urls_.isModifiable()) {
                        this.urls_ = new C5247s0((InterfaceC5249t0) this.urls_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Sources_descriptor;
                }

                public Builder addAllUrls(Iterable<String> iterable) {
                    ensureUrlsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.urls_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addUrls(String str) {
                    str.getClass();
                    ensureUrlsIsMutable();
                    this.urls_.add(str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addUrlsBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    ensureUrlsIsMutable();
                    this.urls_.add(abstractC5235o);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearUrls() {
                    this.urls_ = C5247s0.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Sources_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
                public String getUrls(int i8) {
                    return this.urls_.get(i8);
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
                public AbstractC5235o getUrlsBytes(int i8) {
                    return this.urls_.getByteString(i8);
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
                public int getUrlsCount() {
                    return this.urls_.size();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Sources_fieldAccessorTable.ensureFieldAccessorsInitialized(Sources.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setUrls(int i8, String str) {
                    str.getClass();
                    ensureUrlsIsMutable();
                    this.urls_.set(i8, str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
                public InterfaceC5207e1 getUrlsList() {
                    this.urls_.makeImmutable();
                    return this.urls_;
                }

                private Builder() {
                    this.urls_ = C5247s0.emptyList();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Sources build() {
                    Sources sourcesBuildPartial = buildPartial();
                    if (sourcesBuildPartial.isInitialized()) {
                        return sourcesBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) sourcesBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Sources buildPartial() {
                    Sources sources = new Sources(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sources);
                    }
                    onBuilt();
                    return sources;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public Sources getDefaultInstanceForType() {
                    return Sources.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.urls_ = C5247s0.emptyList();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.urls_ = C5247s0.emptyList();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof Sources) {
                        return mergeFrom((Sources) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder mergeFrom(Sources sources) {
                    if (sources == Sources.getDefaultInstance()) {
                        return this;
                    }
                    if (!sources.urls_.isEmpty()) {
                        if (this.urls_.isEmpty()) {
                            this.urls_ = sources.urls_;
                            this.bitField0_ |= 1;
                        } else {
                            ensureUrlsIsMutable();
                            this.urls_.addAll(sources.urls_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(sources.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag != 10) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                        ensureUrlsIsMutable();
                                        this.urls_.add(stringRequireUtf8);
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ Sources(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static Sources getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Sources_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Sources parseDelimitedFrom(InputStream inputStream) {
                return (Sources) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Sources parseFrom(ByteBuffer byteBuffer) {
                return (Sources) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Sources)) {
                    return super.equals(obj);
                }
                Sources sources = (Sources) obj;
                return getUrlsList().equals(sources.getUrlsList()) && getUnknownFields().equals(sources.getUnknownFields());
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSizeNoTag = 0;
                for (int i9 = 0; i9 < this.urls_.size(); i9++) {
                    iComputeStringSizeNoTag += AbstractC5209f0.computeStringSizeNoTag(this.urls_.getRaw(i9));
                }
                int size = iComputeStringSizeNoTag + getUrlsList().size() + getUnknownFields().getSerializedSize();
                this.memoizedSize = size;
                return size;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
            public String getUrls(int i8) {
                return this.urls_.get(i8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
            public AbstractC5235o getUrlsBytes(int i8) {
                return this.urls_.getByteString(i8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
            public int getUrlsCount() {
                return this.urls_.size();
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getUrlsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getUrlsList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Sources_fieldAccessorTable.ensureFieldAccessorsInitialized(Sources.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new Sources();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                for (int i8 = 0; i8 < this.urls_.size(); i8++) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.urls_.getRaw(i8));
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private Sources(AbstractC5209f0.b bVar) {
                super(bVar);
                this.urls_ = C5247s0.emptyList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Sources sources) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sources);
            }

            public static Sources parseFrom(ByteBuffer byteBuffer, M m8) {
                return (Sources) PARSER.parseFrom(byteBuffer, m8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.SourcesOrBuilder
            public InterfaceC5207e1 getUrlsList() {
                return this.urls_;
            }

            public static Sources parseDelimitedFrom(InputStream inputStream, M m8) {
                return (Sources) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static Sources parseFrom(AbstractC5235o abstractC5235o) {
                return (Sources) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Sources getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static Sources parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (Sources) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Sources() {
                this.urls_ = C5247s0.emptyList();
                this.memoizedIsInitialized = (byte) -1;
                this.urls_ = C5247s0.emptyList();
            }

            public static Sources parseFrom(byte[] bArr) {
                return (Sources) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static Sources parseFrom(byte[] bArr, M m8) {
                return (Sources) PARSER.parseFrom(bArr, m8);
            }

            public static Sources parseFrom(InputStream inputStream) {
                return (Sources) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static Sources parseFrom(InputStream inputStream, M m8) {
                return (Sources) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static Sources parseFrom(r rVar) {
                return (Sources) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static Sources parseFrom(r rVar, M m8) {
                return (Sources) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface SourcesOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            String getUrls(int i8);

            AbstractC5235o getUrlsBytes(int i8);

            int getUrlsCount();

            List<String> getUrlsList();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        public static final class Stream extends AbstractC5209f0 implements StreamOrBuilder {
            public static final int ID_FIELD_NUMBER = 1;
            public static final int PLAY_TIME_FIELD_NUMBER = 12;
            public static final int URL_FIELD_NUMBER = 11;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private B playTime_;
            private volatile Object url_;
            private static final Stream DEFAULT_INSTANCE = new Stream();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.Stream.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public Stream parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = Stream.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements StreamOrBuilder {
                private int bitField0_;
                private Object id_;
                private C5228l1 playTimeBuilder_;
                private B playTime_;
                private Object url_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(Stream stream) {
                    int i8;
                    int i9 = this.bitField0_;
                    if ((i9 & 1) != 0) {
                        stream.id_ = this.id_;
                    }
                    if ((i9 & 2) != 0) {
                        stream.url_ = this.url_;
                    }
                    if ((i9 & 4) != 0) {
                        C5228l1 c5228l1 = this.playTimeBuilder_;
                        stream.playTime_ = c5228l1 == null ? this.playTime_ : (B) c5228l1.build();
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    Stream.access$5376(stream, i8);
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Stream_descriptor;
                }

                private C5228l1 getPlayTimeFieldBuilder() {
                    if (this.playTimeBuilder_ == null) {
                        this.playTimeBuilder_ = new C5228l1(getPlayTime(), getParentForChildren(), isClean());
                        this.playTime_ = null;
                    }
                    return this.playTimeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (AbstractC5209f0.alwaysUseFieldBuilders) {
                        getPlayTimeFieldBuilder();
                    }
                }

                public Builder clearId() {
                    this.id_ = Stream.getDefaultInstance().getId();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearPlayTime() {
                    this.bitField0_ &= -5;
                    this.playTime_ = null;
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.playTimeBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearUrl() {
                    this.url_ = Stream.getDefaultInstance().getUrl();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Stream_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public AbstractC5235o getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.id_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public B getPlayTime() {
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 != null) {
                        return (B) c5228l1.getMessage();
                    }
                    B b9 = this.playTime_;
                    return b9 == null ? B.getDefaultInstance() : b9;
                }

                public B.b getPlayTimeBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return (B.b) getPlayTimeFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public C getPlayTimeOrBuilder() {
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 != null) {
                        return (C) c5228l1.getMessageOrBuilder();
                    }
                    B b9 = this.playTime_;
                    return b9 == null ? B.getDefaultInstance() : b9;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public AbstractC5235o getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.url_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
                public boolean hasPlayTime() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Stream_fieldAccessorTable.ensureFieldAccessorsInitialized(Stream.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergePlayTime(B b9) {
                    B b10;
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.mergeFrom(b9);
                    } else if ((this.bitField0_ & 4) == 0 || (b10 = this.playTime_) == null || b10 == B.getDefaultInstance()) {
                        this.playTime_ = b9;
                    } else {
                        getPlayTimeBuilder().mergeFrom(b9);
                    }
                    if (this.playTime_ != null) {
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    return this;
                }

                public Builder setId(String str) {
                    str.getClass();
                    this.id_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.id_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setPlayTime(B b9) {
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 == null) {
                        b9.getClass();
                        this.playTime_ = b9;
                    } else {
                        c5228l1.setMessage(b9);
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setUrl(String str) {
                    str.getClass();
                    this.url_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setUrlBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.url_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.id_ = "";
                    this.url_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Stream build() {
                    Stream streamBuildPartial = buildPartial();
                    if (streamBuildPartial.isInitialized()) {
                        return streamBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) streamBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Stream buildPartial() {
                    Stream stream = new Stream(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(stream);
                    }
                    onBuilt();
                    return stream;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public Stream getDefaultInstanceForType() {
                    return Stream.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.id_ = "";
                    this.url_ = "";
                    this.playTime_ = null;
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.playTimeBuilder_ = null;
                    }
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.id_ = "";
                    this.url_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof Stream) {
                        return mergeFrom((Stream) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setPlayTime(B.b bVar) {
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    if (c5228l1 == null) {
                        this.playTime_ = bVar.build();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(Stream stream) {
                    if (stream == Stream.getDefaultInstance()) {
                        return this;
                    }
                    if (!stream.getId().isEmpty()) {
                        this.id_ = stream.id_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!stream.getUrl().isEmpty()) {
                        this.url_ = stream.url_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (stream.hasPlayTime()) {
                        mergePlayTime(stream.getPlayTime());
                    }
                    mergeUnknownFields(stream.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.id_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 90) {
                                        this.url_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    } else if (tag != 98) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getPlayTimeFieldBuilder().getBuilder(), m8);
                                        this.bitField0_ |= 4;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ Stream(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            static /* synthetic */ int access$5376(Stream stream, int i8) {
                int i9 = i8 | stream.bitField0_;
                stream.bitField0_ = i9;
                return i9;
            }

            public static Stream getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Stream_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Stream parseDelimitedFrom(InputStream inputStream) {
                return (Stream) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Stream parseFrom(ByteBuffer byteBuffer) {
                return (Stream) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Stream)) {
                    return super.equals(obj);
                }
                Stream stream = (Stream) obj;
                if (getId().equals(stream.getId()) && getUrl().equals(stream.getUrl()) && hasPlayTime() == stream.hasPlayTime()) {
                    return (!hasPlayTime() || getPlayTime().equals(stream.getPlayTime())) && getUnknownFields().equals(stream.getUnknownFields());
                }
                return false;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public B getPlayTime() {
                B b9 = this.playTime_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public C getPlayTimeOrBuilder() {
                B b9 = this.playTime_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.url_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.url_);
                }
                if ((1 & this.bitField0_) != 0) {
                    iComputeStringSize += AbstractC5248t.computeMessageSize(12, getPlayTime());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public AbstractC5235o getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.url_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayload.StreamOrBuilder
            public boolean hasPlayTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 11) * 53) + getUrl().hashCode();
                if (hasPlayTime()) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getPlayTime().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_Stream_fieldAccessorTable.ensureFieldAccessorsInitialized(Stream.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new Stream();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.url_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 11, this.url_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    abstractC5248t.writeMessage(12, getPlayTime());
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private Stream(AbstractC5209f0.b bVar) {
                super(bVar);
                this.id_ = "";
                this.url_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Stream stream) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(stream);
            }

            public static Stream parseFrom(ByteBuffer byteBuffer, M m8) {
                return (Stream) PARSER.parseFrom(byteBuffer, m8);
            }

            public static Stream parseDelimitedFrom(InputStream inputStream, M m8) {
                return (Stream) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static Stream parseFrom(AbstractC5235o abstractC5235o) {
                return (Stream) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Stream getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static Stream parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (Stream) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Stream parseFrom(byte[] bArr) {
                return (Stream) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            private Stream() {
                this.id_ = "";
                this.url_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.url_ = "";
            }

            public static Stream parseFrom(byte[] bArr, M m8) {
                return (Stream) PARSER.parseFrom(bArr, m8);
            }

            public static Stream parseFrom(InputStream inputStream) {
                return (Stream) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static Stream parseFrom(InputStream inputStream, M m8) {
                return (Stream) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static Stream parseFrom(r rVar) {
                return (Stream) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static Stream parseFrom(r rVar, M m8) {
                return (Stream) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface StreamOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            String getId();

            AbstractC5235o getIdBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            B getPlayTime();

            C getPlayTimeOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            String getUrl();

            AbstractC5235o getUrlBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            boolean hasPlayTime();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ AudioPlayPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$8276(AudioPlayPayload audioPlayPayload, int i8) {
            int i9 = i8 | audioPlayPayload.bitField0_;
            audioPlayPayload.bitField0_ = i9;
            return i9;
        }

        public static AudioPlayPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioPlayPayload parseDelimitedFrom(InputStream inputStream) {
            return (AudioPlayPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioPlayPayload parseFrom(ByteBuffer byteBuffer) {
            return (AudioPlayPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioPlayPayload)) {
                return super.equals(obj);
            }
            AudioPlayPayload audioPlayPayload = (AudioPlayPayload) obj;
            if (hasStream() != audioPlayPayload.hasStream()) {
                return false;
            }
            if ((!hasStream() || getStream().equals(audioPlayPayload.getStream())) && hasMetadata() == audioPlayPayload.hasMetadata()) {
                return (!hasMetadata() || getMetadata().equals(audioPlayPayload.getMetadata())) && getUnknownFields().equals(audioPlayPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
        public Metadata getMetadata() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.getDefaultInstance() : metadata;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
        public MetadataOrBuilder getMetadataOrBuilder() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.getDefaultInstance() : metadata;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getStream()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, getMetadata());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
        public Stream getStream() {
            Stream stream = this.stream_;
            return stream == null ? Stream.getDefaultInstance() : stream;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
        public StreamOrBuilder getStreamOrBuilder() {
            Stream stream = this.stream_;
            return stream == null ? Stream.getDefaultInstance() : stream;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
        public boolean hasMetadata() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioPlayPayloadOrBuilder
        public boolean hasStream() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasStream()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getStream().hashCode();
            }
            if (hasMetadata()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMetadata().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AudioPlayPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPlayPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AudioPlayPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getStream());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(2, getMetadata());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AudioPlayPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AudioPlayPayload audioPlayPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioPlayPayload);
        }

        public static AudioPlayPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AudioPlayPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AudioPlayPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AudioPlayPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AudioPlayPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (AudioPlayPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AudioPlayPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        private AudioPlayPayload() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioPlayPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AudioPlayPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioPlayPayload parseFrom(byte[] bArr) {
            return (AudioPlayPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static AudioPlayPayload parseFrom(byte[] bArr, M m8) {
            return (AudioPlayPayload) PARSER.parseFrom(bArr, m8);
        }

        public static AudioPlayPayload parseFrom(InputStream inputStream) {
            return (AudioPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AudioPlayPayload parseFrom(InputStream inputStream, M m8) {
            return (AudioPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AudioPlayPayload parseFrom(r rVar) {
            return (AudioPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AudioPlayPayload parseFrom(r rVar, M m8) {
            return (AudioPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AudioPlayPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        AudioPlayPayload.Metadata getMetadata();

        AudioPlayPayload.MetadataOrBuilder getMetadataOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        AudioPlayPayload.Stream getStream();

        AudioPlayPayload.StreamOrBuilder getStreamOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMetadata();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasStream();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class AudioStopPayload extends AbstractC5209f0 implements AudioStopPayloadOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int REASON_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object reason_;
        private static final AudioStopPayload DEFAULT_INSTANCE = new AudioStopPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AudioStopPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AudioStopPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AudioStopPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AudioStopPayloadOrBuilder {
            private int bitField0_;
            private Object id_;
            private Object reason_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AudioStopPayload audioStopPayload) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    audioStopPayload.id_ = this.id_;
                }
                if ((i8 & 2) != 0) {
                    audioStopPayload.reason_ = this.reason_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioStopPayload_descriptor;
            }

            public Builder clearId() {
                this.id_ = AudioStopPayload.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearReason() {
                this.reason_ = AudioStopPayload.getDefaultInstance().getReason();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioStopPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
            public String getReason() {
                Object obj = this.reason_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.reason_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
            public AbstractC5235o getReasonBytes() {
                Object obj = this.reason_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.reason_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AudioStopPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioStopPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.id_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReason(String str) {
                str.getClass();
                this.reason_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setReasonBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.reason_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.id_ = "";
                this.reason_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioStopPayload build() {
                AudioStopPayload audioStopPayloadBuildPartial = buildPartial();
                if (audioStopPayloadBuildPartial.isInitialized()) {
                    return audioStopPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) audioStopPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioStopPayload buildPartial() {
                AudioStopPayload audioStopPayload = new AudioStopPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(audioStopPayload);
                }
                onBuilt();
                return audioStopPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AudioStopPayload getDefaultInstanceForType() {
                return AudioStopPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.reason_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.reason_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AudioStopPayload) {
                    return mergeFrom((AudioStopPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(AudioStopPayload audioStopPayload) {
                if (audioStopPayload == AudioStopPayload.getDefaultInstance()) {
                    return this;
                }
                if (!audioStopPayload.getId().isEmpty()) {
                    this.id_ = audioStopPayload.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!audioStopPayload.getReason().isEmpty()) {
                    this.reason_ = audioStopPayload.reason_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(audioStopPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.id_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 90) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.reason_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ AudioStopPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AudioStopPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AudioStopPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioStopPayload parseDelimitedFrom(InputStream inputStream) {
            return (AudioStopPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioStopPayload parseFrom(ByteBuffer byteBuffer) {
            return (AudioStopPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioStopPayload)) {
                return super.equals(obj);
            }
            AudioStopPayload audioStopPayload = (AudioStopPayload) obj;
            return getId().equals(audioStopPayload.getId()) && getReason().equals(audioStopPayload.getReason()) && getUnknownFields().equals(audioStopPayload.getUnknownFields());
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
        public AbstractC5235o getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.id_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
        public String getReason() {
            Object obj = this.reason_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.reason_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AudioStopPayloadOrBuilder
        public AbstractC5235o getReasonBytes() {
            Object obj = this.reason_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.reason_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.reason_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.reason_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 11) * 53) + getReason().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AudioStopPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioStopPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AudioStopPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.reason_)) {
                AbstractC5209f0.writeString(abstractC5248t, 11, this.reason_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AudioStopPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = "";
            this.reason_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AudioStopPayload audioStopPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioStopPayload);
        }

        public static AudioStopPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AudioStopPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AudioStopPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AudioStopPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AudioStopPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (AudioStopPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AudioStopPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static AudioStopPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AudioStopPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioStopPayload parseFrom(byte[] bArr) {
            return (AudioStopPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private AudioStopPayload() {
            this.id_ = "";
            this.reason_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.reason_ = "";
        }

        public static AudioStopPayload parseFrom(byte[] bArr, M m8) {
            return (AudioStopPayload) PARSER.parseFrom(bArr, m8);
        }

        public static AudioStopPayload parseFrom(InputStream inputStream) {
            return (AudioStopPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AudioStopPayload parseFrom(InputStream inputStream, M m8) {
            return (AudioStopPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AudioStopPayload parseFrom(r rVar) {
            return (AudioStopPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AudioStopPayload parseFrom(r rVar, M m8) {
            return (AudioStopPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AudioStopPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        String getId();

        AbstractC5235o getIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getReason();

        AbstractC5235o getReasonBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class AvatarSetExpressionPayload extends AbstractC5209f0 implements AvatarSetExpressionPayloadOrBuilder {
        public static final int DESCIPTION_FIELD_NUMBER = 3;
        public static final int EXPRESSION_FIELD_NUMBER = 2;
        public static final int TARGET_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object desciption_;
        private volatile Object expression_;
        private byte memoizedIsInitialized;
        private volatile Object target_;
        private static final AvatarSetExpressionPayload DEFAULT_INSTANCE = new AvatarSetExpressionPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AvatarSetExpressionPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AvatarSetExpressionPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AvatarSetExpressionPayloadOrBuilder {
            private int bitField0_;
            private Object desciption_;
            private Object expression_;
            private Object target_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AvatarSetExpressionPayload avatarSetExpressionPayload) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    avatarSetExpressionPayload.target_ = this.target_;
                }
                if ((i8 & 2) != 0) {
                    avatarSetExpressionPayload.expression_ = this.expression_;
                }
                if ((i8 & 4) != 0) {
                    avatarSetExpressionPayload.desciption_ = this.desciption_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AvatarSetExpressionPayload_descriptor;
            }

            public Builder clearDesciption() {
                this.desciption_ = AvatarSetExpressionPayload.getDefaultInstance().getDesciption();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearExpression() {
                this.expression_ = AvatarSetExpressionPayload.getDefaultInstance().getExpression();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTarget() {
                this.target_ = AvatarSetExpressionPayload.getDefaultInstance().getTarget();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
            public String getDesciption() {
                Object obj = this.desciption_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.desciption_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
            public AbstractC5235o getDesciptionBytes() {
                Object obj = this.desciption_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.desciption_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AvatarSetExpressionPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
            public String getExpression() {
                Object obj = this.expression_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.expression_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
            public AbstractC5235o getExpressionBytes() {
                Object obj = this.expression_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.expression_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
            public String getTarget() {
                Object obj = this.target_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.target_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
            public AbstractC5235o getTargetBytes() {
                Object obj = this.target_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.target_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_AvatarSetExpressionPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSetExpressionPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesciption(String str) {
                str.getClass();
                this.desciption_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDesciptionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.desciption_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setExpression(String str) {
                str.getClass();
                this.expression_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setExpressionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.expression_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTarget(String str) {
                str.getClass();
                this.target_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTargetBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.target_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.target_ = "";
                this.expression_ = "";
                this.desciption_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AvatarSetExpressionPayload build() {
                AvatarSetExpressionPayload avatarSetExpressionPayloadBuildPartial = buildPartial();
                if (avatarSetExpressionPayloadBuildPartial.isInitialized()) {
                    return avatarSetExpressionPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) avatarSetExpressionPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AvatarSetExpressionPayload buildPartial() {
                AvatarSetExpressionPayload avatarSetExpressionPayload = new AvatarSetExpressionPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(avatarSetExpressionPayload);
                }
                onBuilt();
                return avatarSetExpressionPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AvatarSetExpressionPayload getDefaultInstanceForType() {
                return AvatarSetExpressionPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.target_ = "";
                this.expression_ = "";
                this.desciption_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.target_ = "";
                this.expression_ = "";
                this.desciption_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AvatarSetExpressionPayload) {
                    return mergeFrom((AvatarSetExpressionPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(AvatarSetExpressionPayload avatarSetExpressionPayload) {
                if (avatarSetExpressionPayload == AvatarSetExpressionPayload.getDefaultInstance()) {
                    return this;
                }
                if (!avatarSetExpressionPayload.getTarget().isEmpty()) {
                    this.target_ = avatarSetExpressionPayload.target_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!avatarSetExpressionPayload.getExpression().isEmpty()) {
                    this.expression_ = avatarSetExpressionPayload.expression_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!avatarSetExpressionPayload.getDesciption().isEmpty()) {
                    this.desciption_ = avatarSetExpressionPayload.desciption_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(avatarSetExpressionPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.target_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.expression_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.desciption_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ AvatarSetExpressionPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AvatarSetExpressionPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AvatarSetExpressionPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AvatarSetExpressionPayload parseDelimitedFrom(InputStream inputStream) {
            return (AvatarSetExpressionPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AvatarSetExpressionPayload parseFrom(ByteBuffer byteBuffer) {
            return (AvatarSetExpressionPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarSetExpressionPayload)) {
                return super.equals(obj);
            }
            AvatarSetExpressionPayload avatarSetExpressionPayload = (AvatarSetExpressionPayload) obj;
            return getTarget().equals(avatarSetExpressionPayload.getTarget()) && getExpression().equals(avatarSetExpressionPayload.getExpression()) && getDesciption().equals(avatarSetExpressionPayload.getDesciption()) && getUnknownFields().equals(avatarSetExpressionPayload.getUnknownFields());
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
        public String getDesciption() {
            Object obj = this.desciption_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.desciption_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
        public AbstractC5235o getDesciptionBytes() {
            Object obj = this.desciption_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.desciption_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
        public String getExpression() {
            Object obj = this.expression_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.expression_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
        public AbstractC5235o getExpressionBytes() {
            Object obj = this.expression_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.expression_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.target_) ? AbstractC5209f0.computeStringSize(1, this.target_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.expression_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.expression_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.desciption_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.desciption_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
        public String getTarget() {
            Object obj = this.target_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.target_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.AvatarSetExpressionPayloadOrBuilder
        public AbstractC5235o getTargetBytes() {
            Object obj = this.target_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.target_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTarget().hashCode()) * 37) + 2) * 53) + getExpression().hashCode()) * 37) + 3) * 53) + getDesciption().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_AvatarSetExpressionPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSetExpressionPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AvatarSetExpressionPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.target_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.target_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.expression_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.expression_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.desciption_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.desciption_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AvatarSetExpressionPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.target_ = "";
            this.expression_ = "";
            this.desciption_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AvatarSetExpressionPayload avatarSetExpressionPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(avatarSetExpressionPayload);
        }

        public static AvatarSetExpressionPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AvatarSetExpressionPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AvatarSetExpressionPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AvatarSetExpressionPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AvatarSetExpressionPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (AvatarSetExpressionPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AvatarSetExpressionPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static AvatarSetExpressionPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AvatarSetExpressionPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AvatarSetExpressionPayload parseFrom(byte[] bArr) {
            return (AvatarSetExpressionPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static AvatarSetExpressionPayload parseFrom(byte[] bArr, M m8) {
            return (AvatarSetExpressionPayload) PARSER.parseFrom(bArr, m8);
        }

        private AvatarSetExpressionPayload() {
            this.target_ = "";
            this.expression_ = "";
            this.desciption_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.target_ = "";
            this.expression_ = "";
            this.desciption_ = "";
        }

        public static AvatarSetExpressionPayload parseFrom(InputStream inputStream) {
            return (AvatarSetExpressionPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AvatarSetExpressionPayload parseFrom(InputStream inputStream, M m8) {
            return (AvatarSetExpressionPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AvatarSetExpressionPayload parseFrom(r rVar) {
            return (AvatarSetExpressionPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AvatarSetExpressionPayload parseFrom(r rVar, M m8) {
            return (AvatarSetExpressionPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AvatarSetExpressionPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        String getDesciption();

        AbstractC5235o getDesciptionBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        String getExpression();

        AbstractC5235o getExpressionBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getTarget();

        AbstractC5235o getTargetBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class DelegateDirective extends AbstractC5209f0 implements DelegateDirectiveOrBuilder {
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_FIELD_NUMBER = 2;
        public static final int PARAM_FIELD_NUMBER = 3;
        public static final int PAYLOAD_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object interface_;
        private byte memoizedIsInitialized;
        private volatile Object operation_;
        private EventOuterClass.DialogAgentForwarderParam param_;
        private DelegateDirectivePayload payload_;
        private static final DelegateDirective DEFAULT_INSTANCE = new DelegateDirective();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.DelegateDirective.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DelegateDirective parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DelegateDirective.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements DelegateDirectiveOrBuilder {
            private int bitField0_;
            private Object interface_;
            private Object operation_;
            private C5228l1 paramBuilder_;
            private EventOuterClass.DialogAgentForwarderParam param_;
            private C5228l1 payloadBuilder_;
            private DelegateDirectivePayload payload_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(DelegateDirective delegateDirective) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    delegateDirective.interface_ = this.interface_;
                }
                if ((i9 & 2) != 0) {
                    delegateDirective.operation_ = this.operation_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    delegateDirective.param_ = c5228l1 == null ? this.param_ : (EventOuterClass.DialogAgentForwarderParam) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.payloadBuilder_;
                    delegateDirective.payload_ = c5228l12 == null ? this.payload_ : (DelegateDirectivePayload) c5228l12.build();
                    i8 |= 2;
                }
                DelegateDirective.access$20676(delegateDirective, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_descriptor;
            }

            private C5228l1 getParamFieldBuilder() {
                if (this.paramBuilder_ == null) {
                    this.paramBuilder_ = new C5228l1(getParam(), getParentForChildren(), isClean());
                    this.param_ = null;
                }
                return this.paramBuilder_;
            }

            private C5228l1 getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new C5228l1(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getParamFieldBuilder();
                    getPayloadFieldBuilder();
                }
            }

            public Builder clearInterface() {
                this.interface_ = DelegateDirective.getDefaultInstance().getInterface();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearOperation() {
                this.operation_ = DelegateDirective.getDefaultInstance().getOperation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearParam() {
                this.bitField0_ &= -5;
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPayload() {
                this.bitField0_ &= -9;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public String getInterface() {
                Object obj = this.interface_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.interface_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public AbstractC5235o getInterfaceBytes() {
                Object obj = this.interface_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.interface_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public String getOperation() {
                Object obj = this.operation_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operation_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public AbstractC5235o getOperationBytes() {
                Object obj = this.operation_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operation_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public EventOuterClass.DialogAgentForwarderParam getParam() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (EventOuterClass.DialogAgentForwarderParam) c5228l1.getMessage();
                }
                EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            public EventOuterClass.DialogAgentForwarderParam.Builder getParamBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (EventOuterClass.DialogAgentForwarderParam.Builder) getParamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public EventOuterClass.DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (EventOuterClass.DialogAgentForwarderParamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public DelegateDirectivePayload getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (DelegateDirectivePayload) c5228l1.getMessage();
                }
                DelegateDirectivePayload delegateDirectivePayload = this.payload_;
                return delegateDirectivePayload == null ? DelegateDirectivePayload.getDefaultInstance() : delegateDirectivePayload;
            }

            public DelegateDirectivePayload.Builder getPayloadBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DelegateDirectivePayload.Builder) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public DelegateDirectivePayloadOrBuilder getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (DelegateDirectivePayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DelegateDirectivePayload delegateDirectivePayload = this.payload_;
                return delegateDirectivePayload == null ? DelegateDirectivePayload.getDefaultInstance() : delegateDirectivePayload;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_fieldAccessorTable.ensureFieldAccessorsInitialized(DelegateDirective.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam2;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(dialogAgentForwarderParam);
                } else if ((this.bitField0_ & 4) == 0 || (dialogAgentForwarderParam2 = this.param_) == null || dialogAgentForwarderParam2 == EventOuterClass.DialogAgentForwarderParam.getDefaultInstance()) {
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    getParamBuilder().mergeFrom(dialogAgentForwarderParam);
                }
                if (this.param_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(DelegateDirectivePayload delegateDirectivePayload) {
                DelegateDirectivePayload delegateDirectivePayload2;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(delegateDirectivePayload);
                } else if ((this.bitField0_ & 8) == 0 || (delegateDirectivePayload2 = this.payload_) == null || delegateDirectivePayload2 == DelegateDirectivePayload.getDefaultInstance()) {
                    this.payload_ = delegateDirectivePayload;
                } else {
                    getPayloadBuilder().mergeFrom(delegateDirectivePayload);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setInterface(String str) {
                str.getClass();
                this.interface_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInterfaceBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.interface_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperation(String str) {
                str.getClass();
                this.operation_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOperationBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operation_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    dialogAgentForwarderParam.getClass();
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    c5228l1.setMessage(dialogAgentForwarderParam);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(DelegateDirectivePayload delegateDirectivePayload) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    delegateDirectivePayload.getClass();
                    this.payload_ = delegateDirectivePayload;
                } else {
                    c5228l1.setMessage(delegateDirectivePayload);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DelegateDirective build() {
                DelegateDirective delegateDirectiveBuildPartial = buildPartial();
                if (delegateDirectiveBuildPartial.isInitialized()) {
                    return delegateDirectiveBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) delegateDirectiveBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DelegateDirective buildPartial() {
                DelegateDirective delegateDirective = new DelegateDirective(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(delegateDirective);
                }
                onBuilt();
                return delegateDirective;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DelegateDirective getDefaultInstanceForType() {
                return DelegateDirective.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.interface_ = "";
                this.operation_ = "";
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                this.payload_ = null;
                C5228l1 c5228l12 = this.payloadBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.payloadBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof DelegateDirective) {
                    return mergeFrom((DelegateDirective) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setParam(EventOuterClass.DialogAgentForwarderParam.Builder builder) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    this.param_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(DelegateDirectivePayload.Builder builder) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(DelegateDirective delegateDirective) {
                if (delegateDirective == DelegateDirective.getDefaultInstance()) {
                    return this;
                }
                if (!delegateDirective.getInterface().isEmpty()) {
                    this.interface_ = delegateDirective.interface_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!delegateDirective.getOperation().isEmpty()) {
                    this.operation_ = delegateDirective.operation_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (delegateDirective.hasParam()) {
                    mergeParam(delegateDirective.getParam());
                }
                if (delegateDirective.hasPayload()) {
                    mergePayload(delegateDirective.getPayload());
                }
                mergeUnknownFields(delegateDirective.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.interface_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.operation_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class DelegateDirectivePayload extends AbstractC5209f0 implements DelegateDirectivePayloadOrBuilder {
            public static final int LAUNCHER_AUTHORIZE_FIELD_NUMBER = 13;
            public static final int LAUNCHER_FILL_SLOTS_FIELD_NUMBER = 14;
            public static final int LAUNCHER_READ_DOCUMENT_FIELD_NUMBER = 15;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int testPayloadCase_;
            private Object testPayload_;
            private static final DelegateDirectivePayload DEFAULT_INSTANCE = new DelegateDirectivePayload();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayload.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public DelegateDirectivePayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = DelegateDirectivePayload.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements DelegateDirectivePayloadOrBuilder {
                private int bitField0_;
                private C5228l1 launcherAuthorizeBuilder_;
                private C5228l1 launcherFillSlotsBuilder_;
                private C5228l1 launcherReadDocumentBuilder_;
                private int testPayloadCase_;
                private Object testPayload_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(DelegateDirectivePayload delegateDirectivePayload) {
                }

                private void buildPartialOneofs(DelegateDirectivePayload delegateDirectivePayload) {
                    C5228l1 c5228l1;
                    C5228l1 c5228l12;
                    C5228l1 c5228l13;
                    delegateDirectivePayload.testPayloadCase_ = this.testPayloadCase_;
                    delegateDirectivePayload.testPayload_ = this.testPayload_;
                    if (this.testPayloadCase_ == 13 && (c5228l13 = this.launcherAuthorizeBuilder_) != null) {
                        delegateDirectivePayload.testPayload_ = c5228l13.build();
                    }
                    if (this.testPayloadCase_ == 14 && (c5228l12 = this.launcherFillSlotsBuilder_) != null) {
                        delegateDirectivePayload.testPayload_ = c5228l12.build();
                    }
                    if (this.testPayloadCase_ != 15 || (c5228l1 = this.launcherReadDocumentBuilder_) == null) {
                        return;
                    }
                    delegateDirectivePayload.testPayload_ = c5228l1.build();
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_descriptor;
                }

                private C5228l1 getLauncherAuthorizeFieldBuilder() {
                    if (this.launcherAuthorizeBuilder_ == null) {
                        if (this.testPayloadCase_ != 13) {
                            this.testPayload_ = LauncherAuthorizePayload.getDefaultInstance();
                        }
                        this.launcherAuthorizeBuilder_ = new C5228l1((LauncherAuthorizePayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 13;
                    onChanged();
                    return this.launcherAuthorizeBuilder_;
                }

                private C5228l1 getLauncherFillSlotsFieldBuilder() {
                    if (this.launcherFillSlotsBuilder_ == null) {
                        if (this.testPayloadCase_ != 14) {
                            this.testPayload_ = LauncherFillSlotsPayload.getDefaultInstance();
                        }
                        this.launcherFillSlotsBuilder_ = new C5228l1((LauncherFillSlotsPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 14;
                    onChanged();
                    return this.launcherFillSlotsBuilder_;
                }

                private C5228l1 getLauncherReadDocumentFieldBuilder() {
                    if (this.launcherReadDocumentBuilder_ == null) {
                        if (this.testPayloadCase_ != 15) {
                            this.testPayload_ = LauncherReadDocumentPayload.getDefaultInstance();
                        }
                        this.launcherReadDocumentBuilder_ = new C5228l1((LauncherReadDocumentPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 15;
                    onChanged();
                    return this.launcherReadDocumentBuilder_;
                }

                public Builder clearLauncherAuthorize() {
                    C5228l1 c5228l1 = this.launcherAuthorizeBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 13) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 13) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearLauncherFillSlots() {
                    C5228l1 c5228l1 = this.launcherFillSlotsBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 14) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 14) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearLauncherReadDocument() {
                    C5228l1 c5228l1 = this.launcherReadDocumentBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 15) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 15) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearTestPayload() {
                    this.testPayloadCase_ = 0;
                    this.testPayload_ = null;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public LauncherAuthorizePayload getLauncherAuthorize() {
                    C5228l1 c5228l1 = this.launcherAuthorizeBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 13 ? (LauncherAuthorizePayload) this.testPayload_ : LauncherAuthorizePayload.getDefaultInstance() : this.testPayloadCase_ == 13 ? (LauncherAuthorizePayload) c5228l1.getMessage() : LauncherAuthorizePayload.getDefaultInstance();
                }

                public LauncherAuthorizePayload.Builder getLauncherAuthorizeBuilder() {
                    return (LauncherAuthorizePayload.Builder) getLauncherAuthorizeFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public LauncherAuthorizePayloadOrBuilder getLauncherAuthorizeOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 13 || (c5228l1 = this.launcherAuthorizeBuilder_) == null) ? i8 == 13 ? (LauncherAuthorizePayload) this.testPayload_ : LauncherAuthorizePayload.getDefaultInstance() : (LauncherAuthorizePayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public LauncherFillSlotsPayload getLauncherFillSlots() {
                    C5228l1 c5228l1 = this.launcherFillSlotsBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 14 ? (LauncherFillSlotsPayload) this.testPayload_ : LauncherFillSlotsPayload.getDefaultInstance() : this.testPayloadCase_ == 14 ? (LauncherFillSlotsPayload) c5228l1.getMessage() : LauncherFillSlotsPayload.getDefaultInstance();
                }

                public LauncherFillSlotsPayload.Builder getLauncherFillSlotsBuilder() {
                    return (LauncherFillSlotsPayload.Builder) getLauncherFillSlotsFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public LauncherFillSlotsPayloadOrBuilder getLauncherFillSlotsOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 14 || (c5228l1 = this.launcherFillSlotsBuilder_) == null) ? i8 == 14 ? (LauncherFillSlotsPayload) this.testPayload_ : LauncherFillSlotsPayload.getDefaultInstance() : (LauncherFillSlotsPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public LauncherReadDocumentPayload getLauncherReadDocument() {
                    C5228l1 c5228l1 = this.launcherReadDocumentBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 15 ? (LauncherReadDocumentPayload) this.testPayload_ : LauncherReadDocumentPayload.getDefaultInstance() : this.testPayloadCase_ == 15 ? (LauncherReadDocumentPayload) c5228l1.getMessage() : LauncherReadDocumentPayload.getDefaultInstance();
                }

                public LauncherReadDocumentPayload.Builder getLauncherReadDocumentBuilder() {
                    return (LauncherReadDocumentPayload.Builder) getLauncherReadDocumentFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public LauncherReadDocumentPayloadOrBuilder getLauncherReadDocumentOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 15 || (c5228l1 = this.launcherReadDocumentBuilder_) == null) ? i8 == 15 ? (LauncherReadDocumentPayload) this.testPayload_ : LauncherReadDocumentPayload.getDefaultInstance() : (LauncherReadDocumentPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public TestPayloadCase getTestPayloadCase() {
                    return TestPayloadCase.forNumber(this.testPayloadCase_);
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public boolean hasLauncherAuthorize() {
                    return this.testPayloadCase_ == 13;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public boolean hasLauncherFillSlots() {
                    return this.testPayloadCase_ == 14;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
                public boolean hasLauncherReadDocument() {
                    return this.testPayloadCase_ == 15;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(DelegateDirectivePayload.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeLauncherAuthorize(LauncherAuthorizePayload launcherAuthorizePayload) {
                    C5228l1 c5228l1 = this.launcherAuthorizeBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 13 || this.testPayload_ == LauncherAuthorizePayload.getDefaultInstance()) {
                            this.testPayload_ = launcherAuthorizePayload;
                        } else {
                            this.testPayload_ = LauncherAuthorizePayload.newBuilder((LauncherAuthorizePayload) this.testPayload_).mergeFrom(launcherAuthorizePayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 13) {
                        c5228l1.mergeFrom(launcherAuthorizePayload);
                    } else {
                        c5228l1.setMessage(launcherAuthorizePayload);
                    }
                    this.testPayloadCase_ = 13;
                    return this;
                }

                public Builder mergeLauncherFillSlots(LauncherFillSlotsPayload launcherFillSlotsPayload) {
                    C5228l1 c5228l1 = this.launcherFillSlotsBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 14 || this.testPayload_ == LauncherFillSlotsPayload.getDefaultInstance()) {
                            this.testPayload_ = launcherFillSlotsPayload;
                        } else {
                            this.testPayload_ = LauncherFillSlotsPayload.newBuilder((LauncherFillSlotsPayload) this.testPayload_).mergeFrom(launcherFillSlotsPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 14) {
                        c5228l1.mergeFrom(launcherFillSlotsPayload);
                    } else {
                        c5228l1.setMessage(launcherFillSlotsPayload);
                    }
                    this.testPayloadCase_ = 14;
                    return this;
                }

                public Builder mergeLauncherReadDocument(LauncherReadDocumentPayload launcherReadDocumentPayload) {
                    C5228l1 c5228l1 = this.launcherReadDocumentBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 15 || this.testPayload_ == LauncherReadDocumentPayload.getDefaultInstance()) {
                            this.testPayload_ = launcherReadDocumentPayload;
                        } else {
                            this.testPayload_ = LauncherReadDocumentPayload.newBuilder((LauncherReadDocumentPayload) this.testPayload_).mergeFrom(launcherReadDocumentPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 15) {
                        c5228l1.mergeFrom(launcherReadDocumentPayload);
                    } else {
                        c5228l1.setMessage(launcherReadDocumentPayload);
                    }
                    this.testPayloadCase_ = 15;
                    return this;
                }

                public Builder setLauncherAuthorize(LauncherAuthorizePayload launcherAuthorizePayload) {
                    C5228l1 c5228l1 = this.launcherAuthorizeBuilder_;
                    if (c5228l1 == null) {
                        launcherAuthorizePayload.getClass();
                        this.testPayload_ = launcherAuthorizePayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(launcherAuthorizePayload);
                    }
                    this.testPayloadCase_ = 13;
                    return this;
                }

                public Builder setLauncherFillSlots(LauncherFillSlotsPayload launcherFillSlotsPayload) {
                    C5228l1 c5228l1 = this.launcherFillSlotsBuilder_;
                    if (c5228l1 == null) {
                        launcherFillSlotsPayload.getClass();
                        this.testPayload_ = launcherFillSlotsPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(launcherFillSlotsPayload);
                    }
                    this.testPayloadCase_ = 14;
                    return this;
                }

                public Builder setLauncherReadDocument(LauncherReadDocumentPayload launcherReadDocumentPayload) {
                    C5228l1 c5228l1 = this.launcherReadDocumentBuilder_;
                    if (c5228l1 == null) {
                        launcherReadDocumentPayload.getClass();
                        this.testPayload_ = launcherReadDocumentPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(launcherReadDocumentPayload);
                    }
                    this.testPayloadCase_ = 15;
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.testPayloadCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DelegateDirectivePayload build() {
                    DelegateDirectivePayload delegateDirectivePayloadBuildPartial = buildPartial();
                    if (delegateDirectivePayloadBuildPartial.isInitialized()) {
                        return delegateDirectivePayloadBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) delegateDirectivePayloadBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DelegateDirectivePayload buildPartial() {
                    DelegateDirectivePayload delegateDirectivePayload = new DelegateDirectivePayload(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(delegateDirectivePayload);
                    }
                    buildPartialOneofs(delegateDirectivePayload);
                    onBuilt();
                    return delegateDirectivePayload;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public DelegateDirectivePayload getDefaultInstanceForType() {
                    return DelegateDirectivePayload.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.testPayloadCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    C5228l1 c5228l1 = this.launcherAuthorizeBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.clear();
                    }
                    C5228l1 c5228l12 = this.launcherFillSlotsBuilder_;
                    if (c5228l12 != null) {
                        c5228l12.clear();
                    }
                    C5228l1 c5228l13 = this.launcherReadDocumentBuilder_;
                    if (c5228l13 != null) {
                        c5228l13.clear();
                    }
                    this.testPayloadCase_ = 0;
                    this.testPayload_ = null;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof DelegateDirectivePayload) {
                        return mergeFrom((DelegateDirectivePayload) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setLauncherAuthorize(LauncherAuthorizePayload.Builder builder) {
                    C5228l1 c5228l1 = this.launcherAuthorizeBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 13;
                    return this;
                }

                public Builder setLauncherFillSlots(LauncherFillSlotsPayload.Builder builder) {
                    C5228l1 c5228l1 = this.launcherFillSlotsBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 14;
                    return this;
                }

                public Builder setLauncherReadDocument(LauncherReadDocumentPayload.Builder builder) {
                    C5228l1 c5228l1 = this.launcherReadDocumentBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 15;
                    return this;
                }

                public Builder mergeFrom(DelegateDirectivePayload delegateDirectivePayload) {
                    if (delegateDirectivePayload == DelegateDirectivePayload.getDefaultInstance()) {
                        return this;
                    }
                    int i8 = AnonymousClass1.$SwitchMap$maum$m2u$common$DirectiveOuterClass$DelegateDirective$DelegateDirectivePayload$TestPayloadCase[delegateDirectivePayload.getTestPayloadCase().ordinal()];
                    if (i8 == 1) {
                        mergeLauncherAuthorize(delegateDirectivePayload.getLauncherAuthorize());
                    } else if (i8 == 2) {
                        mergeLauncherFillSlots(delegateDirectivePayload.getLauncherFillSlots());
                    } else if (i8 == 3) {
                        mergeLauncherReadDocument(delegateDirectivePayload.getLauncherReadDocument());
                    }
                    mergeUnknownFields(delegateDirectivePayload.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 106) {
                                        rVar.readMessage(getLauncherAuthorizeFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 13;
                                    } else if (tag == 114) {
                                        rVar.readMessage(getLauncherFillSlotsFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 14;
                                    } else if (tag != 122) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getLauncherReadDocumentFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 15;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            public enum TestPayloadCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
                LAUNCHER_AUTHORIZE(13),
                LAUNCHER_FILL_SLOTS(14),
                LAUNCHER_READ_DOCUMENT(15),
                TESTPAYLOAD_NOT_SET(0);

                private final int value;

                TestPayloadCase(int i8) {
                    this.value = i8;
                }

                public static TestPayloadCase forNumber(int i8) {
                    if (i8 == 0) {
                        return TESTPAYLOAD_NOT_SET;
                    }
                    switch (i8) {
                        case 13:
                            return LAUNCHER_AUTHORIZE;
                        case 14:
                            return LAUNCHER_FILL_SLOTS;
                        case 15:
                            return LAUNCHER_READ_DOCUMENT;
                        default:
                            return null;
                    }
                }

                @Override // com.google.protobuf.AbstractC5227l0.c
                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static TestPayloadCase valueOf(int i8) {
                    return forNumber(i8);
                }
            }

            /* synthetic */ DelegateDirectivePayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static DelegateDirectivePayload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DelegateDirectivePayload parseDelimitedFrom(InputStream inputStream) {
                return (DelegateDirectivePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DelegateDirectivePayload parseFrom(ByteBuffer byteBuffer) {
                return (DelegateDirectivePayload) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DelegateDirectivePayload)) {
                    return super.equals(obj);
                }
                DelegateDirectivePayload delegateDirectivePayload = (DelegateDirectivePayload) obj;
                if (!getTestPayloadCase().equals(delegateDirectivePayload.getTestPayloadCase())) {
                    return false;
                }
                switch (this.testPayloadCase_) {
                    case 13:
                        if (!getLauncherAuthorize().equals(delegateDirectivePayload.getLauncherAuthorize())) {
                            return false;
                        }
                        break;
                    case 14:
                        if (!getLauncherFillSlots().equals(delegateDirectivePayload.getLauncherFillSlots())) {
                            return false;
                        }
                        break;
                    case 15:
                        if (!getLauncherReadDocument().equals(delegateDirectivePayload.getLauncherReadDocument())) {
                            return false;
                        }
                        break;
                }
                return getUnknownFields().equals(delegateDirectivePayload.getUnknownFields());
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public LauncherAuthorizePayload getLauncherAuthorize() {
                return this.testPayloadCase_ == 13 ? (LauncherAuthorizePayload) this.testPayload_ : LauncherAuthorizePayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public LauncherAuthorizePayloadOrBuilder getLauncherAuthorizeOrBuilder() {
                return this.testPayloadCase_ == 13 ? (LauncherAuthorizePayload) this.testPayload_ : LauncherAuthorizePayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public LauncherFillSlotsPayload getLauncherFillSlots() {
                return this.testPayloadCase_ == 14 ? (LauncherFillSlotsPayload) this.testPayload_ : LauncherFillSlotsPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public LauncherFillSlotsPayloadOrBuilder getLauncherFillSlotsOrBuilder() {
                return this.testPayloadCase_ == 14 ? (LauncherFillSlotsPayload) this.testPayload_ : LauncherFillSlotsPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public LauncherReadDocumentPayload getLauncherReadDocument() {
                return this.testPayloadCase_ == 15 ? (LauncherReadDocumentPayload) this.testPayload_ : LauncherReadDocumentPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public LauncherReadDocumentPayloadOrBuilder getLauncherReadDocumentOrBuilder() {
                return this.testPayloadCase_ == 15 ? (LauncherReadDocumentPayload) this.testPayload_ : LauncherReadDocumentPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeMessageSize = this.testPayloadCase_ == 13 ? AbstractC5248t.computeMessageSize(13, (LauncherAuthorizePayload) this.testPayload_) : 0;
                if (this.testPayloadCase_ == 14) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(14, (LauncherFillSlotsPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 15) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(15, (LauncherReadDocumentPayload) this.testPayload_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public TestPayloadCase getTestPayloadCase() {
                return TestPayloadCase.forNumber(this.testPayloadCase_);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public boolean hasLauncherAuthorize() {
                return this.testPayloadCase_ == 13;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public boolean hasLauncherFillSlots() {
                return this.testPayloadCase_ == 14;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirective.DelegateDirectivePayloadOrBuilder
            public boolean hasLauncherReadDocument() {
                return this.testPayloadCase_ == 15;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8;
                int iHashCode;
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode2 = 779 + getDescriptor().hashCode();
                switch (this.testPayloadCase_) {
                    case 13:
                        i8 = ((iHashCode2 * 37) + 13) * 53;
                        iHashCode = getLauncherAuthorize().hashCode();
                        break;
                    case 14:
                        i8 = ((iHashCode2 * 37) + 14) * 53;
                        iHashCode = getLauncherFillSlots().hashCode();
                        break;
                    case 15:
                        i8 = ((iHashCode2 * 37) + 15) * 53;
                        iHashCode = getLauncherReadDocument().hashCode();
                        break;
                    default:
                        int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                        this.memoizedHashCode = iHashCode3;
                        return iHashCode3;
                }
                iHashCode2 = i8 + iHashCode;
                int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode32;
                return iHashCode32;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(DelegateDirectivePayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new DelegateDirectivePayload();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (this.testPayloadCase_ == 13) {
                    abstractC5248t.writeMessage(13, (LauncherAuthorizePayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 14) {
                    abstractC5248t.writeMessage(14, (LauncherFillSlotsPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 15) {
                    abstractC5248t.writeMessage(15, (LauncherReadDocumentPayload) this.testPayload_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private DelegateDirectivePayload(AbstractC5209f0.b bVar) {
                super(bVar);
                this.testPayloadCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(DelegateDirectivePayload delegateDirectivePayload) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(delegateDirectivePayload);
            }

            public static DelegateDirectivePayload parseFrom(ByteBuffer byteBuffer, M m8) {
                return (DelegateDirectivePayload) PARSER.parseFrom(byteBuffer, m8);
            }

            public static DelegateDirectivePayload parseDelimitedFrom(InputStream inputStream, M m8) {
                return (DelegateDirectivePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static DelegateDirectivePayload parseFrom(AbstractC5235o abstractC5235o) {
                return (DelegateDirectivePayload) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DelegateDirectivePayload getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static DelegateDirectivePayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (DelegateDirectivePayload) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DelegateDirectivePayload() {
                this.testPayloadCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DelegateDirectivePayload parseFrom(byte[] bArr) {
                return (DelegateDirectivePayload) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static DelegateDirectivePayload parseFrom(byte[] bArr, M m8) {
                return (DelegateDirectivePayload) PARSER.parseFrom(bArr, m8);
            }

            public static DelegateDirectivePayload parseFrom(InputStream inputStream) {
                return (DelegateDirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static DelegateDirectivePayload parseFrom(InputStream inputStream, M m8) {
                return (DelegateDirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static DelegateDirectivePayload parseFrom(r rVar) {
                return (DelegateDirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static DelegateDirectivePayload parseFrom(r rVar, M m8) {
                return (DelegateDirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface DelegateDirectivePayloadOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            LauncherAuthorizePayload getLauncherAuthorize();

            LauncherAuthorizePayloadOrBuilder getLauncherAuthorizeOrBuilder();

            LauncherFillSlotsPayload getLauncherFillSlots();

            LauncherFillSlotsPayloadOrBuilder getLauncherFillSlotsOrBuilder();

            LauncherReadDocumentPayload getLauncherReadDocument();

            LauncherReadDocumentPayloadOrBuilder getLauncherReadDocumentOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            DelegateDirectivePayload.TestPayloadCase getTestPayloadCase();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            boolean hasLauncherAuthorize();

            boolean hasLauncherFillSlots();

            boolean hasLauncherReadDocument();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ DelegateDirective(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$20676(DelegateDirective delegateDirective, int i8) {
            int i9 = i8 | delegateDirective.bitField0_;
            delegateDirective.bitField0_ = i9;
            return i9;
        }

        public static DelegateDirective getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DelegateDirective parseDelimitedFrom(InputStream inputStream) {
            return (DelegateDirective) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DelegateDirective parseFrom(ByteBuffer byteBuffer) {
            return (DelegateDirective) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DelegateDirective)) {
                return super.equals(obj);
            }
            DelegateDirective delegateDirective = (DelegateDirective) obj;
            if (!getInterface().equals(delegateDirective.getInterface()) || !getOperation().equals(delegateDirective.getOperation()) || hasParam() != delegateDirective.hasParam()) {
                return false;
            }
            if ((!hasParam() || getParam().equals(delegateDirective.getParam())) && hasPayload() == delegateDirective.hasPayload()) {
                return (!hasPayload() || getPayload().equals(delegateDirective.getPayload())) && getUnknownFields().equals(delegateDirective.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public String getInterface() {
            Object obj = this.interface_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.interface_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public AbstractC5235o getInterfaceBytes() {
            Object obj = this.interface_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.interface_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public String getOperation() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operation_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public AbstractC5235o getOperationBytes() {
            Object obj = this.operation_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operation_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public EventOuterClass.DialogAgentForwarderParam getParam() {
            EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public EventOuterClass.DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
            EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public DelegateDirectivePayload getPayload() {
            DelegateDirectivePayload delegateDirectivePayload = this.payload_;
            return delegateDirectivePayload == null ? DelegateDirectivePayload.getDefaultInstance() : delegateDirectivePayload;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public DelegateDirectivePayloadOrBuilder getPayloadOrBuilder() {
            DelegateDirectivePayload delegateDirectivePayload = this.payload_;
            return delegateDirectivePayload == null ? DelegateDirectivePayload.getDefaultInstance() : delegateDirectivePayload;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.interface_) ? AbstractC5209f0.computeStringSize(1, this.interface_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.operation_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(4, getPayload());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public boolean hasParam() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DelegateDirectiveOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInterface().hashCode()) * 37) + 2) * 53) + getOperation().hashCode();
            if (hasParam()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getParam().hashCode();
            }
            if (hasPayload()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPayload().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_DelegateDirective_fieldAccessorTable.ensureFieldAccessorsInitialized(DelegateDirective.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new DelegateDirective();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.interface_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.interface_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.operation_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(4, getPayload());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private DelegateDirective(AbstractC5209f0.b bVar) {
            super(bVar);
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DelegateDirective delegateDirective) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(delegateDirective);
        }

        public static DelegateDirective parseFrom(ByteBuffer byteBuffer, M m8) {
            return (DelegateDirective) PARSER.parseFrom(byteBuffer, m8);
        }

        public static DelegateDirective parseDelimitedFrom(InputStream inputStream, M m8) {
            return (DelegateDirective) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static DelegateDirective parseFrom(AbstractC5235o abstractC5235o) {
            return (DelegateDirective) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public DelegateDirective getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static DelegateDirective parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (DelegateDirective) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DelegateDirective parseFrom(byte[] bArr) {
            return (DelegateDirective) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private DelegateDirective() {
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.interface_ = "";
            this.operation_ = "";
        }

        public static DelegateDirective parseFrom(byte[] bArr, M m8) {
            return (DelegateDirective) PARSER.parseFrom(bArr, m8);
        }

        public static DelegateDirective parseFrom(InputStream inputStream) {
            return (DelegateDirective) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static DelegateDirective parseFrom(InputStream inputStream, M m8) {
            return (DelegateDirective) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static DelegateDirective parseFrom(r rVar) {
            return (DelegateDirective) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static DelegateDirective parseFrom(r rVar, M m8) {
            return (DelegateDirective) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DelegateDirectiveOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        String getInterface();

        AbstractC5235o getInterfaceBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperation();

        AbstractC5235o getOperationBytes();

        EventOuterClass.DialogAgentForwarderParam getParam();

        EventOuterClass.DialogAgentForwarderParamOrBuilder getParamOrBuilder();

        DelegateDirective.DelegateDirectivePayload getPayload();

        DelegateDirective.DelegateDirectivePayloadOrBuilder getPayloadOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasParam();

        boolean hasPayload();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class Directive extends AbstractC5209f0 implements DirectiveOrBuilder {
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_FIELD_NUMBER = 2;
        public static final int PARAM_FIELD_NUMBER = 3;
        public static final int PAYLOAD_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object interface_;
        private byte memoizedIsInitialized;
        private volatile Object operation_;
        private EventOuterClass.DialogAgentForwarderParam param_;
        private DirectivePayload payload_;
        private static final Directive DEFAULT_INSTANCE = new Directive();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.Directive.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Directive parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Directive.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements DirectiveOrBuilder {
            private int bitField0_;
            private Object interface_;
            private Object operation_;
            private C5228l1 paramBuilder_;
            private EventOuterClass.DialogAgentForwarderParam param_;
            private C5228l1 payloadBuilder_;
            private DirectivePayload payload_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(Directive directive) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    directive.interface_ = this.interface_;
                }
                if ((i9 & 2) != 0) {
                    directive.operation_ = this.operation_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    directive.param_ = c5228l1 == null ? this.param_ : (EventOuterClass.DialogAgentForwarderParam) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.payloadBuilder_;
                    directive.payload_ = c5228l12 == null ? this.payload_ : (DirectivePayload) c5228l12.build();
                    i8 |= 2;
                }
                Directive.access$1776(directive, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_descriptor;
            }

            private C5228l1 getParamFieldBuilder() {
                if (this.paramBuilder_ == null) {
                    this.paramBuilder_ = new C5228l1(getParam(), getParentForChildren(), isClean());
                    this.param_ = null;
                }
                return this.paramBuilder_;
            }

            private C5228l1 getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new C5228l1(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getParamFieldBuilder();
                    getPayloadFieldBuilder();
                }
            }

            public Builder clearInterface() {
                this.interface_ = Directive.getDefaultInstance().getInterface();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearOperation() {
                this.operation_ = Directive.getDefaultInstance().getOperation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearParam() {
                this.bitField0_ &= -5;
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPayload() {
                this.bitField0_ &= -9;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public String getInterface() {
                Object obj = this.interface_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.interface_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public AbstractC5235o getInterfaceBytes() {
                Object obj = this.interface_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.interface_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public String getOperation() {
                Object obj = this.operation_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operation_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public AbstractC5235o getOperationBytes() {
                Object obj = this.operation_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operation_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public EventOuterClass.DialogAgentForwarderParam getParam() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (EventOuterClass.DialogAgentForwarderParam) c5228l1.getMessage();
                }
                EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            public EventOuterClass.DialogAgentForwarderParam.Builder getParamBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (EventOuterClass.DialogAgentForwarderParam.Builder) getParamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public EventOuterClass.DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (EventOuterClass.DialogAgentForwarderParamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public DirectivePayload getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (DirectivePayload) c5228l1.getMessage();
                }
                DirectivePayload directivePayload = this.payload_;
                return directivePayload == null ? DirectivePayload.getDefaultInstance() : directivePayload;
            }

            public DirectivePayload.Builder getPayloadBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DirectivePayload.Builder) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public DirectivePayloadOrBuilder getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (DirectivePayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DirectivePayload directivePayload = this.payload_;
                return directivePayload == null ? DirectivePayload.getDefaultInstance() : directivePayload;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_fieldAccessorTable.ensureFieldAccessorsInitialized(Directive.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam2;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(dialogAgentForwarderParam);
                } else if ((this.bitField0_ & 4) == 0 || (dialogAgentForwarderParam2 = this.param_) == null || dialogAgentForwarderParam2 == EventOuterClass.DialogAgentForwarderParam.getDefaultInstance()) {
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    getParamBuilder().mergeFrom(dialogAgentForwarderParam);
                }
                if (this.param_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(DirectivePayload directivePayload) {
                DirectivePayload directivePayload2;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(directivePayload);
                } else if ((this.bitField0_ & 8) == 0 || (directivePayload2 = this.payload_) == null || directivePayload2 == DirectivePayload.getDefaultInstance()) {
                    this.payload_ = directivePayload;
                } else {
                    getPayloadBuilder().mergeFrom(directivePayload);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setInterface(String str) {
                str.getClass();
                this.interface_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInterfaceBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.interface_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperation(String str) {
                str.getClass();
                this.operation_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOperationBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operation_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    dialogAgentForwarderParam.getClass();
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    c5228l1.setMessage(dialogAgentForwarderParam);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(DirectivePayload directivePayload) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    directivePayload.getClass();
                    this.payload_ = directivePayload;
                } else {
                    c5228l1.setMessage(directivePayload);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Directive build() {
                Directive directiveBuildPartial = buildPartial();
                if (directiveBuildPartial.isInitialized()) {
                    return directiveBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) directiveBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Directive buildPartial() {
                Directive directive = new Directive(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(directive);
                }
                onBuilt();
                return directive;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Directive getDefaultInstanceForType() {
                return Directive.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.interface_ = "";
                this.operation_ = "";
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                this.payload_ = null;
                C5228l1 c5228l12 = this.payloadBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.payloadBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof Directive) {
                    return mergeFrom((Directive) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setParam(EventOuterClass.DialogAgentForwarderParam.Builder builder) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    this.param_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(DirectivePayload.Builder builder) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(Directive directive) {
                if (directive == Directive.getDefaultInstance()) {
                    return this;
                }
                if (!directive.getInterface().isEmpty()) {
                    this.interface_ = directive.interface_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!directive.getOperation().isEmpty()) {
                    this.operation_ = directive.operation_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (directive.hasParam()) {
                    mergeParam(directive.getParam());
                }
                if (directive.hasPayload()) {
                    mergePayload(directive.getPayload());
                }
                mergeUnknownFields(directive.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.interface_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.operation_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class DirectivePayload extends AbstractC5209f0 implements DirectivePayloadOrBuilder {
            public static final int AUDIO_PLAY_FIELD_NUMBER = 11;
            public static final int AVATAR_SET_EXPRESSION_FIELD_NUMBER = 13;
            public static final int CLOVA_AUDIO_PLAY_FIELD_NUMBER = 14;
            public static final int LAUNCHER_LAUNCH_APP_PAYLOAD_FIELD_NUMBER = 16;
            public static final int LAUNCHER_LAUNCH_PAGE_PAYLOAD_FIELD_NUMBER = 17;
            public static final int LAUNCHER_VIEW_MAP_PAYLOAD_FIELD_NUMBER = 15;
            public static final int VIDEO_PLAY_FIELD_NUMBER = 12;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int testPayloadCase_;
            private Object testPayload_;
            private static final DirectivePayload DEFAULT_INSTANCE = new DirectivePayload();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayload.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public DirectivePayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = DirectivePayload.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements DirectivePayloadOrBuilder {
                private C5228l1 audioPlayBuilder_;
                private C5228l1 avatarSetExpressionBuilder_;
                private int bitField0_;
                private C5228l1 clovaAudioPlayBuilder_;
                private C5228l1 launcherLaunchAppPayloadBuilder_;
                private C5228l1 launcherLaunchPagePayloadBuilder_;
                private C5228l1 launcherViewMapPayloadBuilder_;
                private int testPayloadCase_;
                private Object testPayload_;
                private C5228l1 videoPlayBuilder_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(DirectivePayload directivePayload) {
                }

                private void buildPartialOneofs(DirectivePayload directivePayload) {
                    C5228l1 c5228l1;
                    C5228l1 c5228l12;
                    C5228l1 c5228l13;
                    C5228l1 c5228l14;
                    C5228l1 c5228l15;
                    C5228l1 c5228l16;
                    C5228l1 c5228l17;
                    directivePayload.testPayloadCase_ = this.testPayloadCase_;
                    directivePayload.testPayload_ = this.testPayload_;
                    if (this.testPayloadCase_ == 11 && (c5228l17 = this.audioPlayBuilder_) != null) {
                        directivePayload.testPayload_ = c5228l17.build();
                    }
                    if (this.testPayloadCase_ == 12 && (c5228l16 = this.videoPlayBuilder_) != null) {
                        directivePayload.testPayload_ = c5228l16.build();
                    }
                    if (this.testPayloadCase_ == 13 && (c5228l15 = this.avatarSetExpressionBuilder_) != null) {
                        directivePayload.testPayload_ = c5228l15.build();
                    }
                    if (this.testPayloadCase_ == 14 && (c5228l14 = this.clovaAudioPlayBuilder_) != null) {
                        directivePayload.testPayload_ = c5228l14.build();
                    }
                    if (this.testPayloadCase_ == 15 && (c5228l13 = this.launcherViewMapPayloadBuilder_) != null) {
                        directivePayload.testPayload_ = c5228l13.build();
                    }
                    if (this.testPayloadCase_ == 16 && (c5228l12 = this.launcherLaunchAppPayloadBuilder_) != null) {
                        directivePayload.testPayload_ = c5228l12.build();
                    }
                    if (this.testPayloadCase_ != 17 || (c5228l1 = this.launcherLaunchPagePayloadBuilder_) == null) {
                        return;
                    }
                    directivePayload.testPayload_ = c5228l1.build();
                }

                private C5228l1 getAudioPlayFieldBuilder() {
                    if (this.audioPlayBuilder_ == null) {
                        if (this.testPayloadCase_ != 11) {
                            this.testPayload_ = AudioPlayPayload.getDefaultInstance();
                        }
                        this.audioPlayBuilder_ = new C5228l1((AudioPlayPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 11;
                    onChanged();
                    return this.audioPlayBuilder_;
                }

                private C5228l1 getAvatarSetExpressionFieldBuilder() {
                    if (this.avatarSetExpressionBuilder_ == null) {
                        if (this.testPayloadCase_ != 13) {
                            this.testPayload_ = AvatarSetExpressionPayload.getDefaultInstance();
                        }
                        this.avatarSetExpressionBuilder_ = new C5228l1((AvatarSetExpressionPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 13;
                    onChanged();
                    return this.avatarSetExpressionBuilder_;
                }

                private C5228l1 getClovaAudioPlayFieldBuilder() {
                    if (this.clovaAudioPlayBuilder_ == null) {
                        if (this.testPayloadCase_ != 14) {
                            this.testPayload_ = AudioPlayClovaPayload.getDefaultInstance();
                        }
                        this.clovaAudioPlayBuilder_ = new C5228l1((AudioPlayClovaPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 14;
                    onChanged();
                    return this.clovaAudioPlayBuilder_;
                }

                public static final C5269x.b getDescriptor() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_DirectivePayload_descriptor;
                }

                private C5228l1 getLauncherLaunchAppPayloadFieldBuilder() {
                    if (this.launcherLaunchAppPayloadBuilder_ == null) {
                        if (this.testPayloadCase_ != 16) {
                            this.testPayload_ = LauncherLaunchAppPayload.getDefaultInstance();
                        }
                        this.launcherLaunchAppPayloadBuilder_ = new C5228l1((LauncherLaunchAppPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 16;
                    onChanged();
                    return this.launcherLaunchAppPayloadBuilder_;
                }

                private C5228l1 getLauncherLaunchPagePayloadFieldBuilder() {
                    if (this.launcherLaunchPagePayloadBuilder_ == null) {
                        if (this.testPayloadCase_ != 17) {
                            this.testPayload_ = LauncherLaunchPagePayload.getDefaultInstance();
                        }
                        this.launcherLaunchPagePayloadBuilder_ = new C5228l1((LauncherLaunchPagePayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 17;
                    onChanged();
                    return this.launcherLaunchPagePayloadBuilder_;
                }

                private C5228l1 getLauncherViewMapPayloadFieldBuilder() {
                    if (this.launcherViewMapPayloadBuilder_ == null) {
                        if (this.testPayloadCase_ != 15) {
                            this.testPayload_ = LauncherViewMapPayload.getDefaultInstance();
                        }
                        this.launcherViewMapPayloadBuilder_ = new C5228l1((LauncherViewMapPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 15;
                    onChanged();
                    return this.launcherViewMapPayloadBuilder_;
                }

                private C5228l1 getVideoPlayFieldBuilder() {
                    if (this.videoPlayBuilder_ == null) {
                        if (this.testPayloadCase_ != 12) {
                            this.testPayload_ = VideoPlayPayload.getDefaultInstance();
                        }
                        this.videoPlayBuilder_ = new C5228l1((VideoPlayPayload) this.testPayload_, getParentForChildren(), isClean());
                        this.testPayload_ = null;
                    }
                    this.testPayloadCase_ = 12;
                    onChanged();
                    return this.videoPlayBuilder_;
                }

                public Builder clearAudioPlay() {
                    C5228l1 c5228l1 = this.audioPlayBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 11) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 11) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearAvatarSetExpression() {
                    C5228l1 c5228l1 = this.avatarSetExpressionBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 13) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 13) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearClovaAudioPlay() {
                    C5228l1 c5228l1 = this.clovaAudioPlayBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 14) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 14) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearLauncherLaunchAppPayload() {
                    C5228l1 c5228l1 = this.launcherLaunchAppPayloadBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 16) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 16) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearLauncherLaunchPagePayload() {
                    C5228l1 c5228l1 = this.launcherLaunchPagePayloadBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 17) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 17) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearLauncherViewMapPayload() {
                    C5228l1 c5228l1 = this.launcherViewMapPayloadBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 15) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 15) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearTestPayload() {
                    this.testPayloadCase_ = 0;
                    this.testPayload_ = null;
                    onChanged();
                    return this;
                }

                public Builder clearVideoPlay() {
                    C5228l1 c5228l1 = this.videoPlayBuilder_;
                    if (c5228l1 != null) {
                        if (this.testPayloadCase_ == 12) {
                            this.testPayloadCase_ = 0;
                            this.testPayload_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testPayloadCase_ == 12) {
                        this.testPayloadCase_ = 0;
                        this.testPayload_ = null;
                        onChanged();
                    }
                    return this;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public AudioPlayPayload getAudioPlay() {
                    C5228l1 c5228l1 = this.audioPlayBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 11 ? (AudioPlayPayload) this.testPayload_ : AudioPlayPayload.getDefaultInstance() : this.testPayloadCase_ == 11 ? (AudioPlayPayload) c5228l1.getMessage() : AudioPlayPayload.getDefaultInstance();
                }

                public AudioPlayPayload.Builder getAudioPlayBuilder() {
                    return (AudioPlayPayload.Builder) getAudioPlayFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public AudioPlayPayloadOrBuilder getAudioPlayOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 11 || (c5228l1 = this.audioPlayBuilder_) == null) ? i8 == 11 ? (AudioPlayPayload) this.testPayload_ : AudioPlayPayload.getDefaultInstance() : (AudioPlayPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public AvatarSetExpressionPayload getAvatarSetExpression() {
                    C5228l1 c5228l1 = this.avatarSetExpressionBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 13 ? (AvatarSetExpressionPayload) this.testPayload_ : AvatarSetExpressionPayload.getDefaultInstance() : this.testPayloadCase_ == 13 ? (AvatarSetExpressionPayload) c5228l1.getMessage() : AvatarSetExpressionPayload.getDefaultInstance();
                }

                public AvatarSetExpressionPayload.Builder getAvatarSetExpressionBuilder() {
                    return (AvatarSetExpressionPayload.Builder) getAvatarSetExpressionFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public AvatarSetExpressionPayloadOrBuilder getAvatarSetExpressionOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 13 || (c5228l1 = this.avatarSetExpressionBuilder_) == null) ? i8 == 13 ? (AvatarSetExpressionPayload) this.testPayload_ : AvatarSetExpressionPayload.getDefaultInstance() : (AvatarSetExpressionPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public AudioPlayClovaPayload getClovaAudioPlay() {
                    C5228l1 c5228l1 = this.clovaAudioPlayBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 14 ? (AudioPlayClovaPayload) this.testPayload_ : AudioPlayClovaPayload.getDefaultInstance() : this.testPayloadCase_ == 14 ? (AudioPlayClovaPayload) c5228l1.getMessage() : AudioPlayClovaPayload.getDefaultInstance();
                }

                public AudioPlayClovaPayload.Builder getClovaAudioPlayBuilder() {
                    return (AudioPlayClovaPayload.Builder) getClovaAudioPlayFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public AudioPlayClovaPayloadOrBuilder getClovaAudioPlayOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 14 || (c5228l1 = this.clovaAudioPlayBuilder_) == null) ? i8 == 14 ? (AudioPlayClovaPayload) this.testPayload_ : AudioPlayClovaPayload.getDefaultInstance() : (AudioPlayClovaPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_DirectivePayload_descriptor;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public LauncherLaunchAppPayload getLauncherLaunchAppPayload() {
                    C5228l1 c5228l1 = this.launcherLaunchAppPayloadBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 16 ? (LauncherLaunchAppPayload) this.testPayload_ : LauncherLaunchAppPayload.getDefaultInstance() : this.testPayloadCase_ == 16 ? (LauncherLaunchAppPayload) c5228l1.getMessage() : LauncherLaunchAppPayload.getDefaultInstance();
                }

                public LauncherLaunchAppPayload.Builder getLauncherLaunchAppPayloadBuilder() {
                    return (LauncherLaunchAppPayload.Builder) getLauncherLaunchAppPayloadFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public LauncherLaunchAppPayloadOrBuilder getLauncherLaunchAppPayloadOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 16 || (c5228l1 = this.launcherLaunchAppPayloadBuilder_) == null) ? i8 == 16 ? (LauncherLaunchAppPayload) this.testPayload_ : LauncherLaunchAppPayload.getDefaultInstance() : (LauncherLaunchAppPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public LauncherLaunchPagePayload getLauncherLaunchPagePayload() {
                    C5228l1 c5228l1 = this.launcherLaunchPagePayloadBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 17 ? (LauncherLaunchPagePayload) this.testPayload_ : LauncherLaunchPagePayload.getDefaultInstance() : this.testPayloadCase_ == 17 ? (LauncherLaunchPagePayload) c5228l1.getMessage() : LauncherLaunchPagePayload.getDefaultInstance();
                }

                public LauncherLaunchPagePayload.Builder getLauncherLaunchPagePayloadBuilder() {
                    return (LauncherLaunchPagePayload.Builder) getLauncherLaunchPagePayloadFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public LauncherLaunchPagePayloadOrBuilder getLauncherLaunchPagePayloadOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 17 || (c5228l1 = this.launcherLaunchPagePayloadBuilder_) == null) ? i8 == 17 ? (LauncherLaunchPagePayload) this.testPayload_ : LauncherLaunchPagePayload.getDefaultInstance() : (LauncherLaunchPagePayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public LauncherViewMapPayload getLauncherViewMapPayload() {
                    C5228l1 c5228l1 = this.launcherViewMapPayloadBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 15 ? (LauncherViewMapPayload) this.testPayload_ : LauncherViewMapPayload.getDefaultInstance() : this.testPayloadCase_ == 15 ? (LauncherViewMapPayload) c5228l1.getMessage() : LauncherViewMapPayload.getDefaultInstance();
                }

                public LauncherViewMapPayload.Builder getLauncherViewMapPayloadBuilder() {
                    return (LauncherViewMapPayload.Builder) getLauncherViewMapPayloadFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public LauncherViewMapPayloadOrBuilder getLauncherViewMapPayloadOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 15 || (c5228l1 = this.launcherViewMapPayloadBuilder_) == null) ? i8 == 15 ? (LauncherViewMapPayload) this.testPayload_ : LauncherViewMapPayload.getDefaultInstance() : (LauncherViewMapPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public TestPayloadCase getTestPayloadCase() {
                    return TestPayloadCase.forNumber(this.testPayloadCase_);
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public VideoPlayPayload getVideoPlay() {
                    C5228l1 c5228l1 = this.videoPlayBuilder_;
                    return c5228l1 == null ? this.testPayloadCase_ == 12 ? (VideoPlayPayload) this.testPayload_ : VideoPlayPayload.getDefaultInstance() : this.testPayloadCase_ == 12 ? (VideoPlayPayload) c5228l1.getMessage() : VideoPlayPayload.getDefaultInstance();
                }

                public VideoPlayPayload.Builder getVideoPlayBuilder() {
                    return (VideoPlayPayload.Builder) getVideoPlayFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public VideoPlayPayloadOrBuilder getVideoPlayOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testPayloadCase_;
                    return (i8 != 12 || (c5228l1 = this.videoPlayBuilder_) == null) ? i8 == 12 ? (VideoPlayPayload) this.testPayload_ : VideoPlayPayload.getDefaultInstance() : (VideoPlayPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasAudioPlay() {
                    return this.testPayloadCase_ == 11;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasAvatarSetExpression() {
                    return this.testPayloadCase_ == 13;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasClovaAudioPlay() {
                    return this.testPayloadCase_ == 14;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasLauncherLaunchAppPayload() {
                    return this.testPayloadCase_ == 16;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasLauncherLaunchPagePayload() {
                    return this.testPayloadCase_ == 17;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasLauncherViewMapPayload() {
                    return this.testPayloadCase_ == 15;
                }

                @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
                public boolean hasVideoPlay() {
                    return this.testPayloadCase_ == 12;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_DirectivePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectivePayload.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAudioPlay(AudioPlayPayload audioPlayPayload) {
                    C5228l1 c5228l1 = this.audioPlayBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 11 || this.testPayload_ == AudioPlayPayload.getDefaultInstance()) {
                            this.testPayload_ = audioPlayPayload;
                        } else {
                            this.testPayload_ = AudioPlayPayload.newBuilder((AudioPlayPayload) this.testPayload_).mergeFrom(audioPlayPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 11) {
                        c5228l1.mergeFrom(audioPlayPayload);
                    } else {
                        c5228l1.setMessage(audioPlayPayload);
                    }
                    this.testPayloadCase_ = 11;
                    return this;
                }

                public Builder mergeAvatarSetExpression(AvatarSetExpressionPayload avatarSetExpressionPayload) {
                    C5228l1 c5228l1 = this.avatarSetExpressionBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 13 || this.testPayload_ == AvatarSetExpressionPayload.getDefaultInstance()) {
                            this.testPayload_ = avatarSetExpressionPayload;
                        } else {
                            this.testPayload_ = AvatarSetExpressionPayload.newBuilder((AvatarSetExpressionPayload) this.testPayload_).mergeFrom(avatarSetExpressionPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 13) {
                        c5228l1.mergeFrom(avatarSetExpressionPayload);
                    } else {
                        c5228l1.setMessage(avatarSetExpressionPayload);
                    }
                    this.testPayloadCase_ = 13;
                    return this;
                }

                public Builder mergeClovaAudioPlay(AudioPlayClovaPayload audioPlayClovaPayload) {
                    C5228l1 c5228l1 = this.clovaAudioPlayBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 14 || this.testPayload_ == AudioPlayClovaPayload.getDefaultInstance()) {
                            this.testPayload_ = audioPlayClovaPayload;
                        } else {
                            this.testPayload_ = AudioPlayClovaPayload.newBuilder((AudioPlayClovaPayload) this.testPayload_).mergeFrom(audioPlayClovaPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 14) {
                        c5228l1.mergeFrom(audioPlayClovaPayload);
                    } else {
                        c5228l1.setMessage(audioPlayClovaPayload);
                    }
                    this.testPayloadCase_ = 14;
                    return this;
                }

                public Builder mergeLauncherLaunchAppPayload(LauncherLaunchAppPayload launcherLaunchAppPayload) {
                    C5228l1 c5228l1 = this.launcherLaunchAppPayloadBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 16 || this.testPayload_ == LauncherLaunchAppPayload.getDefaultInstance()) {
                            this.testPayload_ = launcherLaunchAppPayload;
                        } else {
                            this.testPayload_ = LauncherLaunchAppPayload.newBuilder((LauncherLaunchAppPayload) this.testPayload_).mergeFrom(launcherLaunchAppPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 16) {
                        c5228l1.mergeFrom(launcherLaunchAppPayload);
                    } else {
                        c5228l1.setMessage(launcherLaunchAppPayload);
                    }
                    this.testPayloadCase_ = 16;
                    return this;
                }

                public Builder mergeLauncherLaunchPagePayload(LauncherLaunchPagePayload launcherLaunchPagePayload) {
                    C5228l1 c5228l1 = this.launcherLaunchPagePayloadBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 17 || this.testPayload_ == LauncherLaunchPagePayload.getDefaultInstance()) {
                            this.testPayload_ = launcherLaunchPagePayload;
                        } else {
                            this.testPayload_ = LauncherLaunchPagePayload.newBuilder((LauncherLaunchPagePayload) this.testPayload_).mergeFrom(launcherLaunchPagePayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 17) {
                        c5228l1.mergeFrom(launcherLaunchPagePayload);
                    } else {
                        c5228l1.setMessage(launcherLaunchPagePayload);
                    }
                    this.testPayloadCase_ = 17;
                    return this;
                }

                public Builder mergeLauncherViewMapPayload(LauncherViewMapPayload launcherViewMapPayload) {
                    C5228l1 c5228l1 = this.launcherViewMapPayloadBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 15 || this.testPayload_ == LauncherViewMapPayload.getDefaultInstance()) {
                            this.testPayload_ = launcherViewMapPayload;
                        } else {
                            this.testPayload_ = LauncherViewMapPayload.newBuilder((LauncherViewMapPayload) this.testPayload_).mergeFrom(launcherViewMapPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 15) {
                        c5228l1.mergeFrom(launcherViewMapPayload);
                    } else {
                        c5228l1.setMessage(launcherViewMapPayload);
                    }
                    this.testPayloadCase_ = 15;
                    return this;
                }

                public Builder mergeVideoPlay(VideoPlayPayload videoPlayPayload) {
                    C5228l1 c5228l1 = this.videoPlayBuilder_;
                    if (c5228l1 == null) {
                        if (this.testPayloadCase_ != 12 || this.testPayload_ == VideoPlayPayload.getDefaultInstance()) {
                            this.testPayload_ = videoPlayPayload;
                        } else {
                            this.testPayload_ = VideoPlayPayload.newBuilder((VideoPlayPayload) this.testPayload_).mergeFrom(videoPlayPayload).buildPartial();
                        }
                        onChanged();
                    } else if (this.testPayloadCase_ == 12) {
                        c5228l1.mergeFrom(videoPlayPayload);
                    } else {
                        c5228l1.setMessage(videoPlayPayload);
                    }
                    this.testPayloadCase_ = 12;
                    return this;
                }

                public Builder setAudioPlay(AudioPlayPayload audioPlayPayload) {
                    C5228l1 c5228l1 = this.audioPlayBuilder_;
                    if (c5228l1 == null) {
                        audioPlayPayload.getClass();
                        this.testPayload_ = audioPlayPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(audioPlayPayload);
                    }
                    this.testPayloadCase_ = 11;
                    return this;
                }

                public Builder setAvatarSetExpression(AvatarSetExpressionPayload avatarSetExpressionPayload) {
                    C5228l1 c5228l1 = this.avatarSetExpressionBuilder_;
                    if (c5228l1 == null) {
                        avatarSetExpressionPayload.getClass();
                        this.testPayload_ = avatarSetExpressionPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(avatarSetExpressionPayload);
                    }
                    this.testPayloadCase_ = 13;
                    return this;
                }

                public Builder setClovaAudioPlay(AudioPlayClovaPayload audioPlayClovaPayload) {
                    C5228l1 c5228l1 = this.clovaAudioPlayBuilder_;
                    if (c5228l1 == null) {
                        audioPlayClovaPayload.getClass();
                        this.testPayload_ = audioPlayClovaPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(audioPlayClovaPayload);
                    }
                    this.testPayloadCase_ = 14;
                    return this;
                }

                public Builder setLauncherLaunchAppPayload(LauncherLaunchAppPayload launcherLaunchAppPayload) {
                    C5228l1 c5228l1 = this.launcherLaunchAppPayloadBuilder_;
                    if (c5228l1 == null) {
                        launcherLaunchAppPayload.getClass();
                        this.testPayload_ = launcherLaunchAppPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(launcherLaunchAppPayload);
                    }
                    this.testPayloadCase_ = 16;
                    return this;
                }

                public Builder setLauncherLaunchPagePayload(LauncherLaunchPagePayload launcherLaunchPagePayload) {
                    C5228l1 c5228l1 = this.launcherLaunchPagePayloadBuilder_;
                    if (c5228l1 == null) {
                        launcherLaunchPagePayload.getClass();
                        this.testPayload_ = launcherLaunchPagePayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(launcherLaunchPagePayload);
                    }
                    this.testPayloadCase_ = 17;
                    return this;
                }

                public Builder setLauncherViewMapPayload(LauncherViewMapPayload launcherViewMapPayload) {
                    C5228l1 c5228l1 = this.launcherViewMapPayloadBuilder_;
                    if (c5228l1 == null) {
                        launcherViewMapPayload.getClass();
                        this.testPayload_ = launcherViewMapPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(launcherViewMapPayload);
                    }
                    this.testPayloadCase_ = 15;
                    return this;
                }

                public Builder setVideoPlay(VideoPlayPayload videoPlayPayload) {
                    C5228l1 c5228l1 = this.videoPlayBuilder_;
                    if (c5228l1 == null) {
                        videoPlayPayload.getClass();
                        this.testPayload_ = videoPlayPayload;
                        onChanged();
                    } else {
                        c5228l1.setMessage(videoPlayPayload);
                    }
                    this.testPayloadCase_ = 12;
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.testPayloadCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DirectivePayload build() {
                    DirectivePayload directivePayloadBuildPartial = buildPartial();
                    if (directivePayloadBuildPartial.isInitialized()) {
                        return directivePayloadBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) directivePayloadBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DirectivePayload buildPartial() {
                    DirectivePayload directivePayload = new DirectivePayload(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(directivePayload);
                    }
                    buildPartialOneofs(directivePayload);
                    onBuilt();
                    return directivePayload;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public DirectivePayload getDefaultInstanceForType() {
                    return DirectivePayload.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.testPayloadCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    C5228l1 c5228l1 = this.audioPlayBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.clear();
                    }
                    C5228l1 c5228l12 = this.videoPlayBuilder_;
                    if (c5228l12 != null) {
                        c5228l12.clear();
                    }
                    C5228l1 c5228l13 = this.avatarSetExpressionBuilder_;
                    if (c5228l13 != null) {
                        c5228l13.clear();
                    }
                    C5228l1 c5228l14 = this.clovaAudioPlayBuilder_;
                    if (c5228l14 != null) {
                        c5228l14.clear();
                    }
                    C5228l1 c5228l15 = this.launcherViewMapPayloadBuilder_;
                    if (c5228l15 != null) {
                        c5228l15.clear();
                    }
                    C5228l1 c5228l16 = this.launcherLaunchAppPayloadBuilder_;
                    if (c5228l16 != null) {
                        c5228l16.clear();
                    }
                    C5228l1 c5228l17 = this.launcherLaunchPagePayloadBuilder_;
                    if (c5228l17 != null) {
                        c5228l17.clear();
                    }
                    this.testPayloadCase_ = 0;
                    this.testPayload_ = null;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof DirectivePayload) {
                        return mergeFrom((DirectivePayload) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setAudioPlay(AudioPlayPayload.Builder builder) {
                    C5228l1 c5228l1 = this.audioPlayBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 11;
                    return this;
                }

                public Builder setAvatarSetExpression(AvatarSetExpressionPayload.Builder builder) {
                    C5228l1 c5228l1 = this.avatarSetExpressionBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 13;
                    return this;
                }

                public Builder setClovaAudioPlay(AudioPlayClovaPayload.Builder builder) {
                    C5228l1 c5228l1 = this.clovaAudioPlayBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 14;
                    return this;
                }

                public Builder setLauncherLaunchAppPayload(LauncherLaunchAppPayload.Builder builder) {
                    C5228l1 c5228l1 = this.launcherLaunchAppPayloadBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 16;
                    return this;
                }

                public Builder setLauncherLaunchPagePayload(LauncherLaunchPagePayload.Builder builder) {
                    C5228l1 c5228l1 = this.launcherLaunchPagePayloadBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 17;
                    return this;
                }

                public Builder setLauncherViewMapPayload(LauncherViewMapPayload.Builder builder) {
                    C5228l1 c5228l1 = this.launcherViewMapPayloadBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 15;
                    return this;
                }

                public Builder setVideoPlay(VideoPlayPayload.Builder builder) {
                    C5228l1 c5228l1 = this.videoPlayBuilder_;
                    if (c5228l1 == null) {
                        this.testPayload_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testPayloadCase_ = 12;
                    return this;
                }

                public Builder mergeFrom(DirectivePayload directivePayload) {
                    if (directivePayload == DirectivePayload.getDefaultInstance()) {
                        return this;
                    }
                    switch (AnonymousClass1.$SwitchMap$maum$m2u$common$DirectiveOuterClass$Directive$DirectivePayload$TestPayloadCase[directivePayload.getTestPayloadCase().ordinal()]) {
                        case 1:
                            mergeAudioPlay(directivePayload.getAudioPlay());
                            break;
                        case 2:
                            mergeVideoPlay(directivePayload.getVideoPlay());
                            break;
                        case 3:
                            mergeAvatarSetExpression(directivePayload.getAvatarSetExpression());
                            break;
                        case 4:
                            mergeClovaAudioPlay(directivePayload.getClovaAudioPlay());
                            break;
                        case 5:
                            mergeLauncherViewMapPayload(directivePayload.getLauncherViewMapPayload());
                            break;
                        case 6:
                            mergeLauncherLaunchAppPayload(directivePayload.getLauncherLaunchAppPayload());
                            break;
                        case 7:
                            mergeLauncherLaunchPagePayload(directivePayload.getLauncherLaunchPagePayload());
                            break;
                    }
                    mergeUnknownFields(directivePayload.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 90) {
                                        rVar.readMessage(getAudioPlayFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 11;
                                    } else if (tag == 98) {
                                        rVar.readMessage(getVideoPlayFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 12;
                                    } else if (tag == 106) {
                                        rVar.readMessage(getAvatarSetExpressionFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 13;
                                    } else if (tag == 114) {
                                        rVar.readMessage(getClovaAudioPlayFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 14;
                                    } else if (tag == 122) {
                                        rVar.readMessage(getLauncherViewMapPayloadFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 15;
                                    } else if (tag == 130) {
                                        rVar.readMessage(getLauncherLaunchAppPayloadFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 16;
                                    } else if (tag != 138) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getLauncherLaunchPagePayloadFieldBuilder().getBuilder(), m8);
                                        this.testPayloadCase_ = 17;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            public enum TestPayloadCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
                AUDIO_PLAY(11),
                VIDEO_PLAY(12),
                AVATAR_SET_EXPRESSION(13),
                CLOVA_AUDIO_PLAY(14),
                LAUNCHER_VIEW_MAP_PAYLOAD(15),
                LAUNCHER_LAUNCH_APP_PAYLOAD(16),
                LAUNCHER_LAUNCH_PAGE_PAYLOAD(17),
                TESTPAYLOAD_NOT_SET(0);

                private final int value;

                TestPayloadCase(int i8) {
                    this.value = i8;
                }

                public static TestPayloadCase forNumber(int i8) {
                    if (i8 == 0) {
                        return TESTPAYLOAD_NOT_SET;
                    }
                    switch (i8) {
                        case 11:
                            return AUDIO_PLAY;
                        case 12:
                            return VIDEO_PLAY;
                        case 13:
                            return AVATAR_SET_EXPRESSION;
                        case 14:
                            return CLOVA_AUDIO_PLAY;
                        case 15:
                            return LAUNCHER_VIEW_MAP_PAYLOAD;
                        case 16:
                            return LAUNCHER_LAUNCH_APP_PAYLOAD;
                        case 17:
                            return LAUNCHER_LAUNCH_PAGE_PAYLOAD;
                        default:
                            return null;
                    }
                }

                @Override // com.google.protobuf.AbstractC5227l0.c
                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static TestPayloadCase valueOf(int i8) {
                    return forNumber(i8);
                }
            }

            /* synthetic */ DirectivePayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static DirectivePayload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_DirectivePayload_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DirectivePayload parseDelimitedFrom(InputStream inputStream) {
                return (DirectivePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DirectivePayload parseFrom(ByteBuffer byteBuffer) {
                return (DirectivePayload) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectivePayload)) {
                    return super.equals(obj);
                }
                DirectivePayload directivePayload = (DirectivePayload) obj;
                if (!getTestPayloadCase().equals(directivePayload.getTestPayloadCase())) {
                    return false;
                }
                switch (this.testPayloadCase_) {
                    case 11:
                        if (!getAudioPlay().equals(directivePayload.getAudioPlay())) {
                            return false;
                        }
                        break;
                    case 12:
                        if (!getVideoPlay().equals(directivePayload.getVideoPlay())) {
                            return false;
                        }
                        break;
                    case 13:
                        if (!getAvatarSetExpression().equals(directivePayload.getAvatarSetExpression())) {
                            return false;
                        }
                        break;
                    case 14:
                        if (!getClovaAudioPlay().equals(directivePayload.getClovaAudioPlay())) {
                            return false;
                        }
                        break;
                    case 15:
                        if (!getLauncherViewMapPayload().equals(directivePayload.getLauncherViewMapPayload())) {
                            return false;
                        }
                        break;
                    case 16:
                        if (!getLauncherLaunchAppPayload().equals(directivePayload.getLauncherLaunchAppPayload())) {
                            return false;
                        }
                        break;
                    case 17:
                        if (!getLauncherLaunchPagePayload().equals(directivePayload.getLauncherLaunchPagePayload())) {
                            return false;
                        }
                        break;
                }
                return getUnknownFields().equals(directivePayload.getUnknownFields());
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public AudioPlayPayload getAudioPlay() {
                return this.testPayloadCase_ == 11 ? (AudioPlayPayload) this.testPayload_ : AudioPlayPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public AudioPlayPayloadOrBuilder getAudioPlayOrBuilder() {
                return this.testPayloadCase_ == 11 ? (AudioPlayPayload) this.testPayload_ : AudioPlayPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public AvatarSetExpressionPayload getAvatarSetExpression() {
                return this.testPayloadCase_ == 13 ? (AvatarSetExpressionPayload) this.testPayload_ : AvatarSetExpressionPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public AvatarSetExpressionPayloadOrBuilder getAvatarSetExpressionOrBuilder() {
                return this.testPayloadCase_ == 13 ? (AvatarSetExpressionPayload) this.testPayload_ : AvatarSetExpressionPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public AudioPlayClovaPayload getClovaAudioPlay() {
                return this.testPayloadCase_ == 14 ? (AudioPlayClovaPayload) this.testPayload_ : AudioPlayClovaPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public AudioPlayClovaPayloadOrBuilder getClovaAudioPlayOrBuilder() {
                return this.testPayloadCase_ == 14 ? (AudioPlayClovaPayload) this.testPayload_ : AudioPlayClovaPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public LauncherLaunchAppPayload getLauncherLaunchAppPayload() {
                return this.testPayloadCase_ == 16 ? (LauncherLaunchAppPayload) this.testPayload_ : LauncherLaunchAppPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public LauncherLaunchAppPayloadOrBuilder getLauncherLaunchAppPayloadOrBuilder() {
                return this.testPayloadCase_ == 16 ? (LauncherLaunchAppPayload) this.testPayload_ : LauncherLaunchAppPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public LauncherLaunchPagePayload getLauncherLaunchPagePayload() {
                return this.testPayloadCase_ == 17 ? (LauncherLaunchPagePayload) this.testPayload_ : LauncherLaunchPagePayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public LauncherLaunchPagePayloadOrBuilder getLauncherLaunchPagePayloadOrBuilder() {
                return this.testPayloadCase_ == 17 ? (LauncherLaunchPagePayload) this.testPayload_ : LauncherLaunchPagePayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public LauncherViewMapPayload getLauncherViewMapPayload() {
                return this.testPayloadCase_ == 15 ? (LauncherViewMapPayload) this.testPayload_ : LauncherViewMapPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public LauncherViewMapPayloadOrBuilder getLauncherViewMapPayloadOrBuilder() {
                return this.testPayloadCase_ == 15 ? (LauncherViewMapPayload) this.testPayload_ : LauncherViewMapPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeMessageSize = this.testPayloadCase_ == 11 ? AbstractC5248t.computeMessageSize(11, (AudioPlayPayload) this.testPayload_) : 0;
                if (this.testPayloadCase_ == 12) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(12, (VideoPlayPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 13) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(13, (AvatarSetExpressionPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 14) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(14, (AudioPlayClovaPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 15) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(15, (LauncherViewMapPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 16) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(16, (LauncherLaunchAppPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 17) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(17, (LauncherLaunchPagePayload) this.testPayload_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public TestPayloadCase getTestPayloadCase() {
                return TestPayloadCase.forNumber(this.testPayloadCase_);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public VideoPlayPayload getVideoPlay() {
                return this.testPayloadCase_ == 12 ? (VideoPlayPayload) this.testPayload_ : VideoPlayPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public VideoPlayPayloadOrBuilder getVideoPlayOrBuilder() {
                return this.testPayloadCase_ == 12 ? (VideoPlayPayload) this.testPayload_ : VideoPlayPayload.getDefaultInstance();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasAudioPlay() {
                return this.testPayloadCase_ == 11;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasAvatarSetExpression() {
                return this.testPayloadCase_ == 13;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasClovaAudioPlay() {
                return this.testPayloadCase_ == 14;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasLauncherLaunchAppPayload() {
                return this.testPayloadCase_ == 16;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasLauncherLaunchPagePayload() {
                return this.testPayloadCase_ == 17;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasLauncherViewMapPayload() {
                return this.testPayloadCase_ == 15;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.Directive.DirectivePayloadOrBuilder
            public boolean hasVideoPlay() {
                return this.testPayloadCase_ == 12;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8;
                int iHashCode;
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode2 = 779 + getDescriptor().hashCode();
                switch (this.testPayloadCase_) {
                    case 11:
                        i8 = ((iHashCode2 * 37) + 11) * 53;
                        iHashCode = getAudioPlay().hashCode();
                        break;
                    case 12:
                        i8 = ((iHashCode2 * 37) + 12) * 53;
                        iHashCode = getVideoPlay().hashCode();
                        break;
                    case 13:
                        i8 = ((iHashCode2 * 37) + 13) * 53;
                        iHashCode = getAvatarSetExpression().hashCode();
                        break;
                    case 14:
                        i8 = ((iHashCode2 * 37) + 14) * 53;
                        iHashCode = getClovaAudioPlay().hashCode();
                        break;
                    case 15:
                        i8 = ((iHashCode2 * 37) + 15) * 53;
                        iHashCode = getLauncherViewMapPayload().hashCode();
                        break;
                    case 16:
                        i8 = ((iHashCode2 * 37) + 16) * 53;
                        iHashCode = getLauncherLaunchAppPayload().hashCode();
                        break;
                    case 17:
                        i8 = ((iHashCode2 * 37) + 17) * 53;
                        iHashCode = getLauncherLaunchPagePayload().hashCode();
                        break;
                    default:
                        int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                        this.memoizedHashCode = iHashCode3;
                        return iHashCode3;
                }
                iHashCode2 = i8 + iHashCode;
                int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode32;
                return iHashCode32;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_DirectivePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectivePayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new DirectivePayload();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (this.testPayloadCase_ == 11) {
                    abstractC5248t.writeMessage(11, (AudioPlayPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 12) {
                    abstractC5248t.writeMessage(12, (VideoPlayPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 13) {
                    abstractC5248t.writeMessage(13, (AvatarSetExpressionPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 14) {
                    abstractC5248t.writeMessage(14, (AudioPlayClovaPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 15) {
                    abstractC5248t.writeMessage(15, (LauncherViewMapPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 16) {
                    abstractC5248t.writeMessage(16, (LauncherLaunchAppPayload) this.testPayload_);
                }
                if (this.testPayloadCase_ == 17) {
                    abstractC5248t.writeMessage(17, (LauncherLaunchPagePayload) this.testPayload_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private DirectivePayload(AbstractC5209f0.b bVar) {
                super(bVar);
                this.testPayloadCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(DirectivePayload directivePayload) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(directivePayload);
            }

            public static DirectivePayload parseFrom(ByteBuffer byteBuffer, M m8) {
                return (DirectivePayload) PARSER.parseFrom(byteBuffer, m8);
            }

            public static DirectivePayload parseDelimitedFrom(InputStream inputStream, M m8) {
                return (DirectivePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static DirectivePayload parseFrom(AbstractC5235o abstractC5235o) {
                return (DirectivePayload) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DirectivePayload getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static DirectivePayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (DirectivePayload) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DirectivePayload() {
                this.testPayloadCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DirectivePayload parseFrom(byte[] bArr) {
                return (DirectivePayload) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static DirectivePayload parseFrom(byte[] bArr, M m8) {
                return (DirectivePayload) PARSER.parseFrom(bArr, m8);
            }

            public static DirectivePayload parseFrom(InputStream inputStream) {
                return (DirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static DirectivePayload parseFrom(InputStream inputStream, M m8) {
                return (DirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static DirectivePayload parseFrom(r rVar) {
                return (DirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static DirectivePayload parseFrom(r rVar, M m8) {
                return (DirectivePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface DirectivePayloadOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            AudioPlayPayload getAudioPlay();

            AudioPlayPayloadOrBuilder getAudioPlayOrBuilder();

            AvatarSetExpressionPayload getAvatarSetExpression();

            AvatarSetExpressionPayloadOrBuilder getAvatarSetExpressionOrBuilder();

            AudioPlayClovaPayload getClovaAudioPlay();

            AudioPlayClovaPayloadOrBuilder getClovaAudioPlayOrBuilder();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            LauncherLaunchAppPayload getLauncherLaunchAppPayload();

            LauncherLaunchAppPayloadOrBuilder getLauncherLaunchAppPayloadOrBuilder();

            LauncherLaunchPagePayload getLauncherLaunchPagePayload();

            LauncherLaunchPagePayloadOrBuilder getLauncherLaunchPagePayloadOrBuilder();

            LauncherViewMapPayload getLauncherViewMapPayload();

            LauncherViewMapPayloadOrBuilder getLauncherViewMapPayloadOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            DirectivePayload.TestPayloadCase getTestPayloadCase();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            VideoPlayPayload getVideoPlay();

            VideoPlayPayloadOrBuilder getVideoPlayOrBuilder();

            boolean hasAudioPlay();

            boolean hasAvatarSetExpression();

            boolean hasClovaAudioPlay();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            boolean hasLauncherLaunchAppPayload();

            boolean hasLauncherLaunchPagePayload();

            boolean hasLauncherViewMapPayload();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            boolean hasVideoPlay();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ Directive(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$1776(Directive directive, int i8) {
            int i9 = i8 | directive.bitField0_;
            directive.bitField0_ = i9;
            return i9;
        }

        public static Directive getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Directive parseDelimitedFrom(InputStream inputStream) {
            return (Directive) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Directive parseFrom(ByteBuffer byteBuffer) {
            return (Directive) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Directive)) {
                return super.equals(obj);
            }
            Directive directive = (Directive) obj;
            if (!getInterface().equals(directive.getInterface()) || !getOperation().equals(directive.getOperation()) || hasParam() != directive.hasParam()) {
                return false;
            }
            if ((!hasParam() || getParam().equals(directive.getParam())) && hasPayload() == directive.hasPayload()) {
                return (!hasPayload() || getPayload().equals(directive.getPayload())) && getUnknownFields().equals(directive.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public String getInterface() {
            Object obj = this.interface_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.interface_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public AbstractC5235o getInterfaceBytes() {
            Object obj = this.interface_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.interface_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public String getOperation() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operation_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public AbstractC5235o getOperationBytes() {
            Object obj = this.operation_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operation_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public EventOuterClass.DialogAgentForwarderParam getParam() {
            EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public EventOuterClass.DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
            EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public DirectivePayload getPayload() {
            DirectivePayload directivePayload = this.payload_;
            return directivePayload == null ? DirectivePayload.getDefaultInstance() : directivePayload;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public DirectivePayloadOrBuilder getPayloadOrBuilder() {
            DirectivePayload directivePayload = this.payload_;
            return directivePayload == null ? DirectivePayload.getDefaultInstance() : directivePayload;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.interface_) ? AbstractC5209f0.computeStringSize(1, this.interface_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.operation_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(4, getPayload());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public boolean hasParam() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.DirectiveOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInterface().hashCode()) * 37) + 2) * 53) + getOperation().hashCode();
            if (hasParam()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getParam().hashCode();
            }
            if (hasPayload()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPayload().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_Directive_fieldAccessorTable.ensureFieldAccessorsInitialized(Directive.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new Directive();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.interface_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.interface_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.operation_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(4, getPayload());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private Directive(AbstractC5209f0.b bVar) {
            super(bVar);
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Directive directive) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(directive);
        }

        public static Directive parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Directive) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Directive parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Directive) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Directive parseFrom(AbstractC5235o abstractC5235o) {
            return (Directive) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Directive getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static Directive parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Directive) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Directive parseFrom(byte[] bArr) {
            return (Directive) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private Directive() {
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.interface_ = "";
            this.operation_ = "";
        }

        public static Directive parseFrom(byte[] bArr, M m8) {
            return (Directive) PARSER.parseFrom(bArr, m8);
        }

        public static Directive parseFrom(InputStream inputStream) {
            return (Directive) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static Directive parseFrom(InputStream inputStream, M m8) {
            return (Directive) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Directive parseFrom(r rVar) {
            return (Directive) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Directive parseFrom(r rVar, M m8) {
            return (Directive) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DirectiveOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        String getInterface();

        AbstractC5235o getInterfaceBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperation();

        AbstractC5235o getOperationBytes();

        EventOuterClass.DialogAgentForwarderParam getParam();

        EventOuterClass.DialogAgentForwarderParamOrBuilder getParamOrBuilder();

        Directive.DirectivePayload getPayload();

        Directive.DirectivePayloadOrBuilder getPayloadOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasParam();

        boolean hasPayload();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherAuthorizePayload extends AbstractC5209f0 implements LauncherAuthorizePayloadOrBuilder {
        public static final int META_FIELD_NUMBER = 100;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int PROVIDER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object method_;
        private volatile Object provider_;
        private static final LauncherAuthorizePayload DEFAULT_INSTANCE = new LauncherAuthorizePayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherAuthorizePayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherAuthorizePayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements LauncherAuthorizePayloadOrBuilder {
            private int bitField0_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object method_;
            private Object provider_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherAuthorizePayload launcherAuthorizePayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    launcherAuthorizePayload.provider_ = this.provider_;
                }
                if ((i9 & 2) != 0) {
                    launcherAuthorizePayload.method_ = this.method_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    launcherAuthorizePayload.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                LauncherAuthorizePayload.access$23176(launcherAuthorizePayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherAuthorizePayload_descriptor;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    this.metaBuilder_ = new C5228l1(getMeta(), getParentForChildren(), isClean());
                    this.meta_ = null;
                }
                return this.metaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getMetaFieldBuilder();
                }
            }

            public Builder clearMeta() {
                this.bitField0_ &= -5;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMethod() {
                this.method_ = LauncherAuthorizePayload.getDefaultInstance().getMethod();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearProvider() {
                this.provider_ = LauncherAuthorizePayload.getDefaultInstance().getProvider();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherAuthorizePayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public String getMethod() {
                Object obj = this.method_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.method_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public AbstractC5235o getMethodBytes() {
                Object obj = this.method_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.method_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public String getProvider() {
                Object obj = this.provider_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.provider_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public AbstractC5235o getProviderBytes() {
                Object obj = this.provider_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.provider_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherAuthorizePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherAuthorizePayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMeta(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 4) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setMeta(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.meta_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMethod(String str) {
                str.getClass();
                this.method_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMethodBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.method_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setProvider(String str) {
                str.getClass();
                this.provider_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setProviderBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.provider_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.provider_ = "";
                this.method_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherAuthorizePayload build() {
                LauncherAuthorizePayload launcherAuthorizePayloadBuildPartial = buildPartial();
                if (launcherAuthorizePayloadBuildPartial.isInitialized()) {
                    return launcherAuthorizePayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherAuthorizePayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherAuthorizePayload buildPartial() {
                LauncherAuthorizePayload launcherAuthorizePayload = new LauncherAuthorizePayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherAuthorizePayload);
                }
                onBuilt();
                return launcherAuthorizePayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherAuthorizePayload getDefaultInstanceForType() {
                return LauncherAuthorizePayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.provider_ = "";
                this.method_ = "";
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.provider_ = "";
                this.method_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherAuthorizePayload) {
                    return mergeFrom((LauncherAuthorizePayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setMeta(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    this.meta_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(LauncherAuthorizePayload launcherAuthorizePayload) {
                if (launcherAuthorizePayload == LauncherAuthorizePayload.getDefaultInstance()) {
                    return this;
                }
                if (!launcherAuthorizePayload.getProvider().isEmpty()) {
                    this.provider_ = launcherAuthorizePayload.provider_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!launcherAuthorizePayload.getMethod().isEmpty()) {
                    this.method_ = launcherAuthorizePayload.method_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (launcherAuthorizePayload.hasMeta()) {
                    mergeMeta(launcherAuthorizePayload.getMeta());
                }
                mergeUnknownFields(launcherAuthorizePayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.provider_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.method_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag != 802) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LauncherAuthorizePayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$23176(LauncherAuthorizePayload launcherAuthorizePayload, int i8) {
            int i9 = i8 | launcherAuthorizePayload.bitField0_;
            launcherAuthorizePayload.bitField0_ = i9;
            return i9;
        }

        public static LauncherAuthorizePayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherAuthorizePayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherAuthorizePayload parseDelimitedFrom(InputStream inputStream) {
            return (LauncherAuthorizePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherAuthorizePayload parseFrom(ByteBuffer byteBuffer) {
            return (LauncherAuthorizePayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherAuthorizePayload)) {
                return super.equals(obj);
            }
            LauncherAuthorizePayload launcherAuthorizePayload = (LauncherAuthorizePayload) obj;
            if (getProvider().equals(launcherAuthorizePayload.getProvider()) && getMethod().equals(launcherAuthorizePayload.getMethod()) && hasMeta() == launcherAuthorizePayload.hasMeta()) {
                return (!hasMeta() || getMeta().equals(launcherAuthorizePayload.getMeta())) && getUnknownFields().equals(launcherAuthorizePayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public String getMethod() {
            Object obj = this.method_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.method_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public AbstractC5235o getMethodBytes() {
            Object obj = this.method_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.method_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public String getProvider() {
            Object obj = this.provider_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.provider_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public AbstractC5235o getProviderBytes() {
            Object obj = this.provider_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.provider_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.provider_) ? AbstractC5209f0.computeStringSize(1, this.provider_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.method_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.method_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(100, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherAuthorizePayloadOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getProvider().hashCode()) * 37) + 2) * 53) + getMethod().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 100) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherAuthorizePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherAuthorizePayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LauncherAuthorizePayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.provider_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.provider_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.method_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.method_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(100, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherAuthorizePayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.provider_ = "";
            this.method_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherAuthorizePayload launcherAuthorizePayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherAuthorizePayload);
        }

        public static LauncherAuthorizePayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherAuthorizePayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherAuthorizePayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherAuthorizePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherAuthorizePayload parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherAuthorizePayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherAuthorizePayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LauncherAuthorizePayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherAuthorizePayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LauncherAuthorizePayload parseFrom(byte[] bArr) {
            return (LauncherAuthorizePayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private LauncherAuthorizePayload() {
            this.provider_ = "";
            this.method_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.provider_ = "";
            this.method_ = "";
        }

        public static LauncherAuthorizePayload parseFrom(byte[] bArr, M m8) {
            return (LauncherAuthorizePayload) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherAuthorizePayload parseFrom(InputStream inputStream) {
            return (LauncherAuthorizePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherAuthorizePayload parseFrom(InputStream inputStream, M m8) {
            return (LauncherAuthorizePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherAuthorizePayload parseFrom(r rVar) {
            return (LauncherAuthorizePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherAuthorizePayload parseFrom(r rVar, M m8) {
            return (LauncherAuthorizePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherAuthorizePayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        C5240p1 getMeta();

        InterfaceC5243q1 getMetaOrBuilder();

        String getMethod();

        AbstractC5235o getMethodBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getProvider();

        AbstractC5235o getProviderBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherFillSlotsPayload extends AbstractC5209f0 implements LauncherFillSlotsPayloadOrBuilder {
        public static final int FILLED_SLOTS_FIELD_NUMBER = 21;
        public static final int REQUESTING_SLOTS_FIELD_NUMBER = 22;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private C5240p1 filledSlots_;
        private byte memoizedIsInitialized;
        private C5247s0 requestingSlots_;
        private static final LauncherFillSlotsPayload DEFAULT_INSTANCE = new LauncherFillSlotsPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherFillSlotsPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherFillSlotsPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements LauncherFillSlotsPayloadOrBuilder {
            private int bitField0_;
            private C5228l1 filledSlotsBuilder_;
            private C5240p1 filledSlots_;
            private C5247s0 requestingSlots_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherFillSlotsPayload launcherFillSlotsPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.filledSlotsBuilder_;
                    launcherFillSlotsPayload.filledSlots_ = c5228l1 == null ? this.filledSlots_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    this.requestingSlots_.makeImmutable();
                    launcherFillSlotsPayload.requestingSlots_ = this.requestingSlots_;
                }
                LauncherFillSlotsPayload.access$24276(launcherFillSlotsPayload, i8);
            }

            private void ensureRequestingSlotsIsMutable() {
                if (!this.requestingSlots_.isModifiable()) {
                    this.requestingSlots_ = new C5247s0((InterfaceC5249t0) this.requestingSlots_);
                }
                this.bitField0_ |= 2;
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherFillSlotsPayload_descriptor;
            }

            private C5228l1 getFilledSlotsFieldBuilder() {
                if (this.filledSlotsBuilder_ == null) {
                    this.filledSlotsBuilder_ = new C5228l1(getFilledSlots(), getParentForChildren(), isClean());
                    this.filledSlots_ = null;
                }
                return this.filledSlotsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getFilledSlotsFieldBuilder();
                }
            }

            public Builder addAllRequestingSlots(Iterable<String> iterable) {
                ensureRequestingSlotsIsMutable();
                AbstractC5196b.a.addAll((Iterable) iterable, (List) this.requestingSlots_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addRequestingSlots(String str) {
                str.getClass();
                ensureRequestingSlotsIsMutable();
                this.requestingSlots_.add(str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addRequestingSlotsBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                ensureRequestingSlotsIsMutable();
                this.requestingSlots_.add(abstractC5235o);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearFilledSlots() {
                this.bitField0_ &= -2;
                this.filledSlots_ = null;
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.filledSlotsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRequestingSlots() {
                this.requestingSlots_ = C5247s0.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherFillSlotsPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public C5240p1 getFilledSlots() {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.filledSlots_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getFilledSlotsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (C5240p1.b) getFilledSlotsFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public InterfaceC5243q1 getFilledSlotsOrBuilder() {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.filledSlots_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public String getRequestingSlots(int i8) {
                return this.requestingSlots_.get(i8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public AbstractC5235o getRequestingSlotsBytes(int i8) {
                return this.requestingSlots_.getByteString(i8);
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public int getRequestingSlotsCount() {
                return this.requestingSlots_.size();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public boolean hasFilledSlots() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherFillSlotsPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherFillSlotsPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFilledSlots(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 1) == 0 || (c5240p12 = this.filledSlots_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.filledSlots_ = c5240p1;
                } else {
                    getFilledSlotsBuilder().mergeFrom(c5240p1);
                }
                if (this.filledSlots_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setFilledSlots(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.filledSlots_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRequestingSlots(int i8, String str) {
                str.getClass();
                ensureRequestingSlotsIsMutable();
                this.requestingSlots_.set(i8, str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
            public InterfaceC5207e1 getRequestingSlotsList() {
                this.requestingSlots_.makeImmutable();
                return this.requestingSlots_;
            }

            private Builder() {
                this.requestingSlots_ = C5247s0.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherFillSlotsPayload build() {
                LauncherFillSlotsPayload launcherFillSlotsPayloadBuildPartial = buildPartial();
                if (launcherFillSlotsPayloadBuildPartial.isInitialized()) {
                    return launcherFillSlotsPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherFillSlotsPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherFillSlotsPayload buildPartial() {
                LauncherFillSlotsPayload launcherFillSlotsPayload = new LauncherFillSlotsPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherFillSlotsPayload);
                }
                onBuilt();
                return launcherFillSlotsPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherFillSlotsPayload getDefaultInstanceForType() {
                return LauncherFillSlotsPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.filledSlots_ = null;
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.filledSlotsBuilder_ = null;
                }
                this.requestingSlots_ = C5247s0.emptyList();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.requestingSlots_ = C5247s0.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherFillSlotsPayload) {
                    return mergeFrom((LauncherFillSlotsPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setFilledSlots(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 == null) {
                    this.filledSlots_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(LauncherFillSlotsPayload launcherFillSlotsPayload) {
                if (launcherFillSlotsPayload == LauncherFillSlotsPayload.getDefaultInstance()) {
                    return this;
                }
                if (launcherFillSlotsPayload.hasFilledSlots()) {
                    mergeFilledSlots(launcherFillSlotsPayload.getFilledSlots());
                }
                if (!launcherFillSlotsPayload.requestingSlots_.isEmpty()) {
                    if (this.requestingSlots_.isEmpty()) {
                        this.requestingSlots_ = launcherFillSlotsPayload.requestingSlots_;
                        this.bitField0_ |= 2;
                    } else {
                        ensureRequestingSlotsIsMutable();
                        this.requestingSlots_.addAll(launcherFillSlotsPayload.requestingSlots_);
                    }
                    onChanged();
                }
                mergeUnknownFields(launcherFillSlotsPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 170) {
                                    rVar.readMessage(getFilledSlotsFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag != 178) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                    ensureRequestingSlotsIsMutable();
                                    this.requestingSlots_.add(stringRequireUtf8);
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LauncherFillSlotsPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$24276(LauncherFillSlotsPayload launcherFillSlotsPayload, int i8) {
            int i9 = i8 | launcherFillSlotsPayload.bitField0_;
            launcherFillSlotsPayload.bitField0_ = i9;
            return i9;
        }

        public static LauncherFillSlotsPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherFillSlotsPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherFillSlotsPayload parseDelimitedFrom(InputStream inputStream) {
            return (LauncherFillSlotsPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherFillSlotsPayload parseFrom(ByteBuffer byteBuffer) {
            return (LauncherFillSlotsPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherFillSlotsPayload)) {
                return super.equals(obj);
            }
            LauncherFillSlotsPayload launcherFillSlotsPayload = (LauncherFillSlotsPayload) obj;
            if (hasFilledSlots() != launcherFillSlotsPayload.hasFilledSlots()) {
                return false;
            }
            return (!hasFilledSlots() || getFilledSlots().equals(launcherFillSlotsPayload.getFilledSlots())) && getRequestingSlotsList().equals(launcherFillSlotsPayload.getRequestingSlotsList()) && getUnknownFields().equals(launcherFillSlotsPayload.getUnknownFields());
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public C5240p1 getFilledSlots() {
            C5240p1 c5240p1 = this.filledSlots_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public InterfaceC5243q1 getFilledSlotsOrBuilder() {
            C5240p1 c5240p1 = this.filledSlots_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public String getRequestingSlots(int i8) {
            return this.requestingSlots_.get(i8);
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public AbstractC5235o getRequestingSlotsBytes(int i8) {
            return this.requestingSlots_.getByteString(i8);
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public int getRequestingSlotsCount() {
            return this.requestingSlots_.size();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(21, getFilledSlots()) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i9 = 0; i9 < this.requestingSlots_.size(); i9++) {
                iComputeStringSizeNoTag += AbstractC5209f0.computeStringSizeNoTag(this.requestingSlots_.getRaw(i9));
            }
            int size = iComputeMessageSize + iComputeStringSizeNoTag + (getRequestingSlotsList().size() * 2) + getUnknownFields().getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public boolean hasFilledSlots() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasFilledSlots()) {
                iHashCode = (((iHashCode * 37) + 21) * 53) + getFilledSlots().hashCode();
            }
            if (getRequestingSlotsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 22) * 53) + getRequestingSlotsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherFillSlotsPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherFillSlotsPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LauncherFillSlotsPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(21, getFilledSlots());
            }
            for (int i8 = 0; i8 < this.requestingSlots_.size(); i8++) {
                AbstractC5209f0.writeString(abstractC5248t, 22, this.requestingSlots_.getRaw(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherFillSlotsPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.requestingSlots_ = C5247s0.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherFillSlotsPayload launcherFillSlotsPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherFillSlotsPayload);
        }

        public static LauncherFillSlotsPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherFillSlotsPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherFillSlotsPayloadOrBuilder
        public InterfaceC5207e1 getRequestingSlotsList() {
            return this.requestingSlots_;
        }

        public static LauncherFillSlotsPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherFillSlotsPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherFillSlotsPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherFillSlotsPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherFillSlotsPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LauncherFillSlotsPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherFillSlotsPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LauncherFillSlotsPayload() {
            this.requestingSlots_ = C5247s0.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.requestingSlots_ = C5247s0.emptyList();
        }

        public static LauncherFillSlotsPayload parseFrom(byte[] bArr) {
            return (LauncherFillSlotsPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherFillSlotsPayload parseFrom(byte[] bArr, M m8) {
            return (LauncherFillSlotsPayload) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherFillSlotsPayload parseFrom(InputStream inputStream) {
            return (LauncherFillSlotsPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherFillSlotsPayload parseFrom(InputStream inputStream, M m8) {
            return (LauncherFillSlotsPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherFillSlotsPayload parseFrom(r rVar) {
            return (LauncherFillSlotsPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherFillSlotsPayload parseFrom(r rVar, M m8) {
            return (LauncherFillSlotsPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherFillSlotsPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        C5240p1 getFilledSlots();

        InterfaceC5243q1 getFilledSlotsOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getRequestingSlots(int i8);

        AbstractC5235o getRequestingSlotsBytes(int i8);

        int getRequestingSlotsCount();

        List<String> getRequestingSlotsList();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasFilledSlots();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherLaunchAppPayload extends AbstractC5209f0 implements LauncherLaunchAppPayloadOrBuilder {
        public static final int DESCRIPTION_FIELD_NUMBER = 12;
        public static final int META_FIELD_NUMBER = 3;
        public static final int RUNTIME_ENV_FIELD_NUMBER = 11;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int URI_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object description_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object runtimeEnv_;
        private volatile Object target_;
        private volatile Object uri_;
        private static final LauncherLaunchAppPayload DEFAULT_INSTANCE = new LauncherLaunchAppPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherLaunchAppPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherLaunchAppPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements LauncherLaunchAppPayloadOrBuilder {
            private int bitField0_;
            private Object description_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object runtimeEnv_;
            private Object target_;
            private Object uri_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherLaunchAppPayload launcherLaunchAppPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    launcherLaunchAppPayload.target_ = this.target_;
                }
                if ((i9 & 2) != 0) {
                    launcherLaunchAppPayload.uri_ = this.uri_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    launcherLaunchAppPayload.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    launcherLaunchAppPayload.runtimeEnv_ = this.runtimeEnv_;
                }
                if ((i9 & 16) != 0) {
                    launcherLaunchAppPayload.description_ = this.description_;
                }
                LauncherLaunchAppPayload.access$25576(launcherLaunchAppPayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchAppPayload_descriptor;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    this.metaBuilder_ = new C5228l1(getMeta(), getParentForChildren(), isClean());
                    this.meta_ = null;
                }
                return this.metaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getMetaFieldBuilder();
                }
            }

            public Builder clearDescription() {
                this.description_ = LauncherLaunchAppPayload.getDefaultInstance().getDescription();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearMeta() {
                this.bitField0_ &= -5;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRuntimeEnv() {
                this.runtimeEnv_ = LauncherLaunchAppPayload.getDefaultInstance().getRuntimeEnv();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearTarget() {
                this.target_ = LauncherLaunchAppPayload.getDefaultInstance().getTarget();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUri() {
                this.uri_ = LauncherLaunchAppPayload.getDefaultInstance().getUri();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public AbstractC5235o getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.description_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchAppPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public String getRuntimeEnv() {
                Object obj = this.runtimeEnv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.runtimeEnv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public AbstractC5235o getRuntimeEnvBytes() {
                Object obj = this.runtimeEnv_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.runtimeEnv_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public String getTarget() {
                Object obj = this.target_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.target_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public AbstractC5235o getTargetBytes() {
                Object obj = this.target_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.target_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public String getUri() {
                Object obj = this.uri_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.uri_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public AbstractC5235o getUriBytes() {
                Object obj = this.uri_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.uri_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchAppPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherLaunchAppPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMeta(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 4) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.description_ = abstractC5235o;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMeta(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.meta_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRuntimeEnv(String str) {
                str.getClass();
                this.runtimeEnv_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setRuntimeEnvBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.runtimeEnv_ = abstractC5235o;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTarget(String str) {
                str.getClass();
                this.target_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTargetBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.target_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUri(String str) {
                str.getClass();
                this.uri_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUriBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.uri_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.target_ = "";
                this.uri_ = "";
                this.runtimeEnv_ = "";
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherLaunchAppPayload build() {
                LauncherLaunchAppPayload launcherLaunchAppPayloadBuildPartial = buildPartial();
                if (launcherLaunchAppPayloadBuildPartial.isInitialized()) {
                    return launcherLaunchAppPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherLaunchAppPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherLaunchAppPayload buildPartial() {
                LauncherLaunchAppPayload launcherLaunchAppPayload = new LauncherLaunchAppPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherLaunchAppPayload);
                }
                onBuilt();
                return launcherLaunchAppPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherLaunchAppPayload getDefaultInstanceForType() {
                return LauncherLaunchAppPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.target_ = "";
                this.uri_ = "";
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                this.runtimeEnv_ = "";
                this.description_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherLaunchAppPayload) {
                    return mergeFrom((LauncherLaunchAppPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setMeta(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    this.meta_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.target_ = "";
                this.uri_ = "";
                this.runtimeEnv_ = "";
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(LauncherLaunchAppPayload launcherLaunchAppPayload) {
                if (launcherLaunchAppPayload == LauncherLaunchAppPayload.getDefaultInstance()) {
                    return this;
                }
                if (!launcherLaunchAppPayload.getTarget().isEmpty()) {
                    this.target_ = launcherLaunchAppPayload.target_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!launcherLaunchAppPayload.getUri().isEmpty()) {
                    this.uri_ = launcherLaunchAppPayload.uri_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (launcherLaunchAppPayload.hasMeta()) {
                    mergeMeta(launcherLaunchAppPayload.getMeta());
                }
                if (!launcherLaunchAppPayload.getRuntimeEnv().isEmpty()) {
                    this.runtimeEnv_ = launcherLaunchAppPayload.runtimeEnv_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!launcherLaunchAppPayload.getDescription().isEmpty()) {
                    this.description_ = launcherLaunchAppPayload.description_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(launcherLaunchAppPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.target_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.uri_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag == 90) {
                                    this.runtimeEnv_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag != 98) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.description_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LauncherLaunchAppPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$25576(LauncherLaunchAppPayload launcherLaunchAppPayload, int i8) {
            int i9 = i8 | launcherLaunchAppPayload.bitField0_;
            launcherLaunchAppPayload.bitField0_ = i9;
            return i9;
        }

        public static LauncherLaunchAppPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchAppPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherLaunchAppPayload parseDelimitedFrom(InputStream inputStream) {
            return (LauncherLaunchAppPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherLaunchAppPayload parseFrom(ByteBuffer byteBuffer) {
            return (LauncherLaunchAppPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherLaunchAppPayload)) {
                return super.equals(obj);
            }
            LauncherLaunchAppPayload launcherLaunchAppPayload = (LauncherLaunchAppPayload) obj;
            if (getTarget().equals(launcherLaunchAppPayload.getTarget()) && getUri().equals(launcherLaunchAppPayload.getUri()) && hasMeta() == launcherLaunchAppPayload.hasMeta()) {
                return (!hasMeta() || getMeta().equals(launcherLaunchAppPayload.getMeta())) && getRuntimeEnv().equals(launcherLaunchAppPayload.getRuntimeEnv()) && getDescription().equals(launcherLaunchAppPayload.getDescription()) && getUnknownFields().equals(launcherLaunchAppPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public AbstractC5235o getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.description_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public String getRuntimeEnv() {
            Object obj = this.runtimeEnv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.runtimeEnv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public AbstractC5235o getRuntimeEnvBytes() {
            Object obj = this.runtimeEnv_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.runtimeEnv_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.target_) ? AbstractC5209f0.computeStringSize(1, this.target_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.uri_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.uri_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getMeta());
            }
            if (!AbstractC5209f0.isStringEmpty(this.runtimeEnv_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.runtimeEnv_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.description_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(12, this.description_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public String getTarget() {
            Object obj = this.target_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.target_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public AbstractC5235o getTargetBytes() {
            Object obj = this.target_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.target_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public String getUri() {
            Object obj = this.uri_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.uri_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public AbstractC5235o getUriBytes() {
            Object obj = this.uri_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.uri_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchAppPayloadOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTarget().hashCode()) * 37) + 2) * 53) + getUri().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (((((((((iHashCode * 37) + 11) * 53) + getRuntimeEnv().hashCode()) * 37) + 12) * 53) + getDescription().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchAppPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherLaunchAppPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LauncherLaunchAppPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.target_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.target_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.uri_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.uri_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getMeta());
            }
            if (!AbstractC5209f0.isStringEmpty(this.runtimeEnv_)) {
                AbstractC5209f0.writeString(abstractC5248t, 11, this.runtimeEnv_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.description_)) {
                AbstractC5209f0.writeString(abstractC5248t, 12, this.description_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherLaunchAppPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.target_ = "";
            this.uri_ = "";
            this.runtimeEnv_ = "";
            this.description_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherLaunchAppPayload launcherLaunchAppPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherLaunchAppPayload);
        }

        public static LauncherLaunchAppPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherLaunchAppPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherLaunchAppPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherLaunchAppPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherLaunchAppPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherLaunchAppPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherLaunchAppPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LauncherLaunchAppPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherLaunchAppPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LauncherLaunchAppPayload parseFrom(byte[] bArr) {
            return (LauncherLaunchAppPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherLaunchAppPayload parseFrom(byte[] bArr, M m8) {
            return (LauncherLaunchAppPayload) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherLaunchAppPayload parseFrom(InputStream inputStream) {
            return (LauncherLaunchAppPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private LauncherLaunchAppPayload() {
            this.target_ = "";
            this.uri_ = "";
            this.runtimeEnv_ = "";
            this.description_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.target_ = "";
            this.uri_ = "";
            this.runtimeEnv_ = "";
            this.description_ = "";
        }

        public static LauncherLaunchAppPayload parseFrom(InputStream inputStream, M m8) {
            return (LauncherLaunchAppPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherLaunchAppPayload parseFrom(r rVar) {
            return (LauncherLaunchAppPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherLaunchAppPayload parseFrom(r rVar, M m8) {
            return (LauncherLaunchAppPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherLaunchAppPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        String getDescription();

        AbstractC5235o getDescriptionBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        C5240p1 getMeta();

        InterfaceC5243q1 getMetaOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getRuntimeEnv();

        AbstractC5235o getRuntimeEnvBytes();

        String getTarget();

        AbstractC5235o getTargetBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUri();

        AbstractC5235o getUriBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherLaunchPagePayload extends AbstractC5209f0 implements LauncherLaunchPagePayloadOrBuilder {
        public static final int BROWER_ENV_FIELD_NUMBER = 11;
        public static final int DESCRIPTION_FIELD_NUMBER = 12;
        public static final int META_FIELD_NUMBER = 3;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int URI_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object browerEnv_;
        private volatile Object description_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object target_;
        private volatile Object uri_;
        private static final LauncherLaunchPagePayload DEFAULT_INSTANCE = new LauncherLaunchPagePayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherLaunchPagePayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherLaunchPagePayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements LauncherLaunchPagePayloadOrBuilder {
            private int bitField0_;
            private Object browerEnv_;
            private Object description_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object target_;
            private Object uri_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherLaunchPagePayload launcherLaunchPagePayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    launcherLaunchPagePayload.target_ = this.target_;
                }
                if ((i9 & 2) != 0) {
                    launcherLaunchPagePayload.uri_ = this.uri_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    launcherLaunchPagePayload.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    launcherLaunchPagePayload.browerEnv_ = this.browerEnv_;
                }
                if ((i9 & 16) != 0) {
                    launcherLaunchPagePayload.description_ = this.description_;
                }
                LauncherLaunchPagePayload.access$27176(launcherLaunchPagePayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchPagePayload_descriptor;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    this.metaBuilder_ = new C5228l1(getMeta(), getParentForChildren(), isClean());
                    this.meta_ = null;
                }
                return this.metaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getMetaFieldBuilder();
                }
            }

            public Builder clearBrowerEnv() {
                this.browerEnv_ = LauncherLaunchPagePayload.getDefaultInstance().getBrowerEnv();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = LauncherLaunchPagePayload.getDefaultInstance().getDescription();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearMeta() {
                this.bitField0_ &= -5;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTarget() {
                this.target_ = LauncherLaunchPagePayload.getDefaultInstance().getTarget();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUri() {
                this.uri_ = LauncherLaunchPagePayload.getDefaultInstance().getUri();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public String getBrowerEnv() {
                Object obj = this.browerEnv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.browerEnv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public AbstractC5235o getBrowerEnvBytes() {
                Object obj = this.browerEnv_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.browerEnv_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public AbstractC5235o getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.description_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchPagePayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public String getTarget() {
                Object obj = this.target_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.target_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public AbstractC5235o getTargetBytes() {
                Object obj = this.target_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.target_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public String getUri() {
                Object obj = this.uri_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.uri_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public AbstractC5235o getUriBytes() {
                Object obj = this.uri_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.uri_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchPagePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherLaunchPagePayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMeta(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 4) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setBrowerEnv(String str) {
                str.getClass();
                this.browerEnv_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBrowerEnvBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.browerEnv_ = abstractC5235o;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.description_ = abstractC5235o;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMeta(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.meta_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTarget(String str) {
                str.getClass();
                this.target_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTargetBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.target_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUri(String str) {
                str.getClass();
                this.uri_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUriBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.uri_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.target_ = "";
                this.uri_ = "";
                this.browerEnv_ = "";
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherLaunchPagePayload build() {
                LauncherLaunchPagePayload launcherLaunchPagePayloadBuildPartial = buildPartial();
                if (launcherLaunchPagePayloadBuildPartial.isInitialized()) {
                    return launcherLaunchPagePayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherLaunchPagePayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherLaunchPagePayload buildPartial() {
                LauncherLaunchPagePayload launcherLaunchPagePayload = new LauncherLaunchPagePayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherLaunchPagePayload);
                }
                onBuilt();
                return launcherLaunchPagePayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherLaunchPagePayload getDefaultInstanceForType() {
                return LauncherLaunchPagePayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.target_ = "";
                this.uri_ = "";
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                this.browerEnv_ = "";
                this.description_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherLaunchPagePayload) {
                    return mergeFrom((LauncherLaunchPagePayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setMeta(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    this.meta_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.target_ = "";
                this.uri_ = "";
                this.browerEnv_ = "";
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(LauncherLaunchPagePayload launcherLaunchPagePayload) {
                if (launcherLaunchPagePayload == LauncherLaunchPagePayload.getDefaultInstance()) {
                    return this;
                }
                if (!launcherLaunchPagePayload.getTarget().isEmpty()) {
                    this.target_ = launcherLaunchPagePayload.target_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!launcherLaunchPagePayload.getUri().isEmpty()) {
                    this.uri_ = launcherLaunchPagePayload.uri_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (launcherLaunchPagePayload.hasMeta()) {
                    mergeMeta(launcherLaunchPagePayload.getMeta());
                }
                if (!launcherLaunchPagePayload.getBrowerEnv().isEmpty()) {
                    this.browerEnv_ = launcherLaunchPagePayload.browerEnv_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!launcherLaunchPagePayload.getDescription().isEmpty()) {
                    this.description_ = launcherLaunchPagePayload.description_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(launcherLaunchPagePayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.target_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.uri_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag == 90) {
                                    this.browerEnv_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag != 98) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.description_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LauncherLaunchPagePayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$27176(LauncherLaunchPagePayload launcherLaunchPagePayload, int i8) {
            int i9 = i8 | launcherLaunchPagePayload.bitField0_;
            launcherLaunchPagePayload.bitField0_ = i9;
            return i9;
        }

        public static LauncherLaunchPagePayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchPagePayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherLaunchPagePayload parseDelimitedFrom(InputStream inputStream) {
            return (LauncherLaunchPagePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherLaunchPagePayload parseFrom(ByteBuffer byteBuffer) {
            return (LauncherLaunchPagePayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherLaunchPagePayload)) {
                return super.equals(obj);
            }
            LauncherLaunchPagePayload launcherLaunchPagePayload = (LauncherLaunchPagePayload) obj;
            if (getTarget().equals(launcherLaunchPagePayload.getTarget()) && getUri().equals(launcherLaunchPagePayload.getUri()) && hasMeta() == launcherLaunchPagePayload.hasMeta()) {
                return (!hasMeta() || getMeta().equals(launcherLaunchPagePayload.getMeta())) && getBrowerEnv().equals(launcherLaunchPagePayload.getBrowerEnv()) && getDescription().equals(launcherLaunchPagePayload.getDescription()) && getUnknownFields().equals(launcherLaunchPagePayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public String getBrowerEnv() {
            Object obj = this.browerEnv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.browerEnv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public AbstractC5235o getBrowerEnvBytes() {
            Object obj = this.browerEnv_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.browerEnv_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public AbstractC5235o getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.description_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.target_) ? AbstractC5209f0.computeStringSize(1, this.target_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.uri_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.uri_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getMeta());
            }
            if (!AbstractC5209f0.isStringEmpty(this.browerEnv_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.browerEnv_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.description_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(12, this.description_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public String getTarget() {
            Object obj = this.target_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.target_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public AbstractC5235o getTargetBytes() {
            Object obj = this.target_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.target_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public String getUri() {
            Object obj = this.uri_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.uri_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public AbstractC5235o getUriBytes() {
            Object obj = this.uri_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.uri_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherLaunchPagePayloadOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTarget().hashCode()) * 37) + 2) * 53) + getUri().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (((((((((iHashCode * 37) + 11) * 53) + getBrowerEnv().hashCode()) * 37) + 12) * 53) + getDescription().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherLaunchPagePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherLaunchPagePayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LauncherLaunchPagePayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.target_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.target_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.uri_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.uri_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getMeta());
            }
            if (!AbstractC5209f0.isStringEmpty(this.browerEnv_)) {
                AbstractC5209f0.writeString(abstractC5248t, 11, this.browerEnv_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.description_)) {
                AbstractC5209f0.writeString(abstractC5248t, 12, this.description_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherLaunchPagePayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.target_ = "";
            this.uri_ = "";
            this.browerEnv_ = "";
            this.description_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherLaunchPagePayload launcherLaunchPagePayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherLaunchPagePayload);
        }

        public static LauncherLaunchPagePayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherLaunchPagePayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherLaunchPagePayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherLaunchPagePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherLaunchPagePayload parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherLaunchPagePayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherLaunchPagePayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LauncherLaunchPagePayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherLaunchPagePayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LauncherLaunchPagePayload parseFrom(byte[] bArr) {
            return (LauncherLaunchPagePayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherLaunchPagePayload parseFrom(byte[] bArr, M m8) {
            return (LauncherLaunchPagePayload) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherLaunchPagePayload parseFrom(InputStream inputStream) {
            return (LauncherLaunchPagePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private LauncherLaunchPagePayload() {
            this.target_ = "";
            this.uri_ = "";
            this.browerEnv_ = "";
            this.description_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.target_ = "";
            this.uri_ = "";
            this.browerEnv_ = "";
            this.description_ = "";
        }

        public static LauncherLaunchPagePayload parseFrom(InputStream inputStream, M m8) {
            return (LauncherLaunchPagePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherLaunchPagePayload parseFrom(r rVar) {
            return (LauncherLaunchPagePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherLaunchPagePayload parseFrom(r rVar, M m8) {
            return (LauncherLaunchPagePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherLaunchPagePayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        String getBrowerEnv();

        AbstractC5235o getBrowerEnvBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        String getDescription();

        AbstractC5235o getDescriptionBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        C5240p1 getMeta();

        InterfaceC5243q1 getMetaOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getTarget();

        AbstractC5235o getTargetBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUri();

        AbstractC5235o getUriBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherReadDocumentPayload extends AbstractC5209f0 implements LauncherReadDocumentPayloadOrBuilder {
        public static final int DOCUMENT_URL_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SUB_TITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object documentUrl_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object subTitle_;
        private volatile Object title_;
        private static final LauncherReadDocumentPayload DEFAULT_INSTANCE = new LauncherReadDocumentPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherReadDocumentPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherReadDocumentPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements LauncherReadDocumentPayloadOrBuilder {
            private int bitField0_;
            private Object documentUrl_;
            private Object id_;
            private Object subTitle_;
            private Object title_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherReadDocumentPayload launcherReadDocumentPayload) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    launcherReadDocumentPayload.id_ = this.id_;
                }
                if ((i8 & 2) != 0) {
                    launcherReadDocumentPayload.documentUrl_ = this.documentUrl_;
                }
                if ((i8 & 4) != 0) {
                    launcherReadDocumentPayload.title_ = this.title_;
                }
                if ((i8 & 8) != 0) {
                    launcherReadDocumentPayload.subTitle_ = this.subTitle_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherReadDocumentPayload_descriptor;
            }

            public Builder clearDocumentUrl() {
                this.documentUrl_ = LauncherReadDocumentPayload.getDefaultInstance().getDocumentUrl();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = LauncherReadDocumentPayload.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSubTitle() {
                this.subTitle_ = LauncherReadDocumentPayload.getDefaultInstance().getSubTitle();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = LauncherReadDocumentPayload.getDefaultInstance().getTitle();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherReadDocumentPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public String getDocumentUrl() {
                Object obj = this.documentUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.documentUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public AbstractC5235o getDocumentUrlBytes() {
                Object obj = this.documentUrl_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.documentUrl_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public String getSubTitle() {
                Object obj = this.subTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.subTitle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public AbstractC5235o getSubTitleBytes() {
                Object obj = this.subTitle_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.subTitle_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
            public AbstractC5235o getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.title_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherReadDocumentPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherReadDocumentPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDocumentUrl(String str) {
                str.getClass();
                this.documentUrl_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDocumentUrlBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.documentUrl_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.id_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSubTitle(String str) {
                str.getClass();
                this.subTitle_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSubTitleBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.subTitle_ = abstractC5235o;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.title_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.id_ = "";
                this.documentUrl_ = "";
                this.title_ = "";
                this.subTitle_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherReadDocumentPayload build() {
                LauncherReadDocumentPayload launcherReadDocumentPayloadBuildPartial = buildPartial();
                if (launcherReadDocumentPayloadBuildPartial.isInitialized()) {
                    return launcherReadDocumentPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherReadDocumentPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherReadDocumentPayload buildPartial() {
                LauncherReadDocumentPayload launcherReadDocumentPayload = new LauncherReadDocumentPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherReadDocumentPayload);
                }
                onBuilt();
                return launcherReadDocumentPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherReadDocumentPayload getDefaultInstanceForType() {
                return LauncherReadDocumentPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.documentUrl_ = "";
                this.title_ = "";
                this.subTitle_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherReadDocumentPayload) {
                    return mergeFrom((LauncherReadDocumentPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.documentUrl_ = "";
                this.title_ = "";
                this.subTitle_ = "";
            }

            public Builder mergeFrom(LauncherReadDocumentPayload launcherReadDocumentPayload) {
                if (launcherReadDocumentPayload == LauncherReadDocumentPayload.getDefaultInstance()) {
                    return this;
                }
                if (!launcherReadDocumentPayload.getId().isEmpty()) {
                    this.id_ = launcherReadDocumentPayload.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!launcherReadDocumentPayload.getDocumentUrl().isEmpty()) {
                    this.documentUrl_ = launcherReadDocumentPayload.documentUrl_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!launcherReadDocumentPayload.getTitle().isEmpty()) {
                    this.title_ = launcherReadDocumentPayload.title_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!launcherReadDocumentPayload.getSubTitle().isEmpty()) {
                    this.subTitle_ = launcherReadDocumentPayload.subTitle_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(launcherReadDocumentPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.id_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.documentUrl_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.title_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.subTitle_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LauncherReadDocumentPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static LauncherReadDocumentPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherReadDocumentPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherReadDocumentPayload parseDelimitedFrom(InputStream inputStream) {
            return (LauncherReadDocumentPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherReadDocumentPayload parseFrom(ByteBuffer byteBuffer) {
            return (LauncherReadDocumentPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherReadDocumentPayload)) {
                return super.equals(obj);
            }
            LauncherReadDocumentPayload launcherReadDocumentPayload = (LauncherReadDocumentPayload) obj;
            return getId().equals(launcherReadDocumentPayload.getId()) && getDocumentUrl().equals(launcherReadDocumentPayload.getDocumentUrl()) && getTitle().equals(launcherReadDocumentPayload.getTitle()) && getSubTitle().equals(launcherReadDocumentPayload.getSubTitle()) && getUnknownFields().equals(launcherReadDocumentPayload.getUnknownFields());
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public String getDocumentUrl() {
            Object obj = this.documentUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.documentUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public AbstractC5235o getDocumentUrlBytes() {
            Object obj = this.documentUrl_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.documentUrl_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public AbstractC5235o getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.id_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.documentUrl_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.documentUrl_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.title_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.subTitle_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(4, this.subTitle_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public String getSubTitle() {
            Object obj = this.subTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.subTitle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public AbstractC5235o getSubTitleBytes() {
            Object obj = this.subTitle_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.subTitle_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherReadDocumentPayloadOrBuilder
        public AbstractC5235o getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.title_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getDocumentUrl().hashCode()) * 37) + 3) * 53) + getTitle().hashCode()) * 37) + 4) * 53) + getSubTitle().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherReadDocumentPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherReadDocumentPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LauncherReadDocumentPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.documentUrl_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.documentUrl_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.title_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.subTitle_)) {
                AbstractC5209f0.writeString(abstractC5248t, 4, this.subTitle_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherReadDocumentPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = "";
            this.documentUrl_ = "";
            this.title_ = "";
            this.subTitle_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherReadDocumentPayload launcherReadDocumentPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherReadDocumentPayload);
        }

        public static LauncherReadDocumentPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherReadDocumentPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherReadDocumentPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherReadDocumentPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherReadDocumentPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherReadDocumentPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherReadDocumentPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LauncherReadDocumentPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherReadDocumentPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LauncherReadDocumentPayload parseFrom(byte[] bArr) {
            return (LauncherReadDocumentPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherReadDocumentPayload parseFrom(byte[] bArr, M m8) {
            return (LauncherReadDocumentPayload) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherReadDocumentPayload parseFrom(InputStream inputStream) {
            return (LauncherReadDocumentPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private LauncherReadDocumentPayload() {
            this.id_ = "";
            this.documentUrl_ = "";
            this.title_ = "";
            this.subTitle_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.documentUrl_ = "";
            this.title_ = "";
            this.subTitle_ = "";
        }

        public static LauncherReadDocumentPayload parseFrom(InputStream inputStream, M m8) {
            return (LauncherReadDocumentPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherReadDocumentPayload parseFrom(r rVar) {
            return (LauncherReadDocumentPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherReadDocumentPayload parseFrom(r rVar, M m8) {
            return (LauncherReadDocumentPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherReadDocumentPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        String getDocumentUrl();

        AbstractC5235o getDocumentUrlBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        String getId();

        AbstractC5235o getIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getSubTitle();

        AbstractC5235o getSubTitleBytes();

        String getTitle();

        AbstractC5235o getTitleBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherViewMapPayload extends AbstractC5209f0 implements LauncherViewMapPayloadOrBuilder {
        private static final LauncherViewMapPayload DEFAULT_INSTANCE = new LauncherViewMapPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherViewMapPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherViewMapPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int SEARCH_KEYWORD_FIELD_NUMBER = 3;
        public static final int SEARCH_OBJECT_FIELD_NUMBER = 2;
        public static final int SEARCH_RANGE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object searchKeyword_;
        private volatile Object searchObject_;
        private volatile Object searchRange_;

        public static final class Builder extends AbstractC5209f0.b implements LauncherViewMapPayloadOrBuilder {
            private int bitField0_;
            private Object searchKeyword_;
            private Object searchObject_;
            private Object searchRange_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherViewMapPayload launcherViewMapPayload) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    launcherViewMapPayload.searchRange_ = this.searchRange_;
                }
                if ((i8 & 2) != 0) {
                    launcherViewMapPayload.searchObject_ = this.searchObject_;
                }
                if ((i8 & 4) != 0) {
                    launcherViewMapPayload.searchKeyword_ = this.searchKeyword_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherViewMapPayload_descriptor;
            }

            public Builder clearSearchKeyword() {
                this.searchKeyword_ = LauncherViewMapPayload.getDefaultInstance().getSearchKeyword();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearSearchObject() {
                this.searchObject_ = LauncherViewMapPayload.getDefaultInstance().getSearchObject();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSearchRange() {
                this.searchRange_ = LauncherViewMapPayload.getDefaultInstance().getSearchRange();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherViewMapPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
            public String getSearchKeyword() {
                Object obj = this.searchKeyword_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.searchKeyword_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
            public AbstractC5235o getSearchKeywordBytes() {
                Object obj = this.searchKeyword_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.searchKeyword_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
            public String getSearchObject() {
                Object obj = this.searchObject_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.searchObject_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
            public AbstractC5235o getSearchObjectBytes() {
                Object obj = this.searchObject_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.searchObject_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
            public String getSearchRange() {
                Object obj = this.searchRange_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.searchRange_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
            public AbstractC5235o getSearchRangeBytes() {
                Object obj = this.searchRange_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.searchRange_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherViewMapPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherViewMapPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setSearchKeyword(String str) {
                str.getClass();
                this.searchKeyword_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSearchKeywordBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.searchKeyword_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSearchObject(String str) {
                str.getClass();
                this.searchObject_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSearchObjectBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.searchObject_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSearchRange(String str) {
                str.getClass();
                this.searchRange_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSearchRangeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.searchRange_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.searchRange_ = "";
                this.searchObject_ = "";
                this.searchKeyword_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherViewMapPayload build() {
                LauncherViewMapPayload launcherViewMapPayloadBuildPartial = buildPartial();
                if (launcherViewMapPayloadBuildPartial.isInitialized()) {
                    return launcherViewMapPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherViewMapPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherViewMapPayload buildPartial() {
                LauncherViewMapPayload launcherViewMapPayload = new LauncherViewMapPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherViewMapPayload);
                }
                onBuilt();
                return launcherViewMapPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherViewMapPayload getDefaultInstanceForType() {
                return LauncherViewMapPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.searchRange_ = "";
                this.searchObject_ = "";
                this.searchKeyword_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.searchRange_ = "";
                this.searchObject_ = "";
                this.searchKeyword_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherViewMapPayload) {
                    return mergeFrom((LauncherViewMapPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(LauncherViewMapPayload launcherViewMapPayload) {
                if (launcherViewMapPayload == LauncherViewMapPayload.getDefaultInstance()) {
                    return this;
                }
                if (!launcherViewMapPayload.getSearchRange().isEmpty()) {
                    this.searchRange_ = launcherViewMapPayload.searchRange_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!launcherViewMapPayload.getSearchObject().isEmpty()) {
                    this.searchObject_ = launcherViewMapPayload.searchObject_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!launcherViewMapPayload.getSearchKeyword().isEmpty()) {
                    this.searchKeyword_ = launcherViewMapPayload.searchKeyword_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(launcherViewMapPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.searchRange_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.searchObject_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.searchKeyword_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LauncherViewMapPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static LauncherViewMapPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherViewMapPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherViewMapPayload parseDelimitedFrom(InputStream inputStream) {
            return (LauncherViewMapPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherViewMapPayload parseFrom(ByteBuffer byteBuffer) {
            return (LauncherViewMapPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherViewMapPayload)) {
                return super.equals(obj);
            }
            LauncherViewMapPayload launcherViewMapPayload = (LauncherViewMapPayload) obj;
            return getSearchRange().equals(launcherViewMapPayload.getSearchRange()) && getSearchObject().equals(launcherViewMapPayload.getSearchObject()) && getSearchKeyword().equals(launcherViewMapPayload.getSearchKeyword()) && getUnknownFields().equals(launcherViewMapPayload.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
        public String getSearchKeyword() {
            Object obj = this.searchKeyword_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.searchKeyword_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
        public AbstractC5235o getSearchKeywordBytes() {
            Object obj = this.searchKeyword_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.searchKeyword_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
        public String getSearchObject() {
            Object obj = this.searchObject_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.searchObject_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
        public AbstractC5235o getSearchObjectBytes() {
            Object obj = this.searchObject_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.searchObject_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
        public String getSearchRange() {
            Object obj = this.searchRange_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.searchRange_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.LauncherViewMapPayloadOrBuilder
        public AbstractC5235o getSearchRangeBytes() {
            Object obj = this.searchRange_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.searchRange_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.searchRange_) ? AbstractC5209f0.computeStringSize(1, this.searchRange_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.searchObject_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.searchObject_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.searchKeyword_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.searchKeyword_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSearchRange().hashCode()) * 37) + 2) * 53) + getSearchObject().hashCode()) * 37) + 3) * 53) + getSearchKeyword().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_LauncherViewMapPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherViewMapPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LauncherViewMapPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.searchRange_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.searchRange_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.searchObject_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.searchObject_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.searchKeyword_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.searchKeyword_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherViewMapPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.searchRange_ = "";
            this.searchObject_ = "";
            this.searchKeyword_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherViewMapPayload launcherViewMapPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherViewMapPayload);
        }

        public static LauncherViewMapPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherViewMapPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherViewMapPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherViewMapPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherViewMapPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherViewMapPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherViewMapPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LauncherViewMapPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherViewMapPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LauncherViewMapPayload parseFrom(byte[] bArr) {
            return (LauncherViewMapPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherViewMapPayload parseFrom(byte[] bArr, M m8) {
            return (LauncherViewMapPayload) PARSER.parseFrom(bArr, m8);
        }

        private LauncherViewMapPayload() {
            this.searchRange_ = "";
            this.searchObject_ = "";
            this.searchKeyword_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.searchRange_ = "";
            this.searchObject_ = "";
            this.searchKeyword_ = "";
        }

        public static LauncherViewMapPayload parseFrom(InputStream inputStream) {
            return (LauncherViewMapPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherViewMapPayload parseFrom(InputStream inputStream, M m8) {
            return (LauncherViewMapPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherViewMapPayload parseFrom(r rVar) {
            return (LauncherViewMapPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherViewMapPayload parseFrom(r rVar, M m8) {
            return (LauncherViewMapPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherViewMapPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getSearchKeyword();

        AbstractC5235o getSearchKeywordBytes();

        String getSearchObject();

        AbstractC5235o getSearchObjectBytes();

        String getSearchRange();

        AbstractC5235o getSearchRangeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class VideoPlayPayload extends AbstractC5209f0 implements VideoPlayPayloadOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PLAY_TIME_FIELD_NUMBER = 12;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private B playTime_;
        private volatile Object title_;
        private volatile Object url_;
        private static final VideoPlayPayload DEFAULT_INSTANCE = new VideoPlayPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DirectiveOuterClass.VideoPlayPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public VideoPlayPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = VideoPlayPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements VideoPlayPayloadOrBuilder {
            private int bitField0_;
            private Object id_;
            private C5228l1 playTimeBuilder_;
            private B playTime_;
            private Object title_;
            private Object url_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(VideoPlayPayload videoPlayPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    videoPlayPayload.id_ = this.id_;
                }
                if ((i9 & 2) != 0) {
                    videoPlayPayload.title_ = this.title_;
                }
                if ((i9 & 4) != 0) {
                    videoPlayPayload.url_ = this.url_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.playTimeBuilder_;
                    videoPlayPayload.playTime_ = c5228l1 == null ? this.playTime_ : (B) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                VideoPlayPayload.access$18576(videoPlayPayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_VideoPlayPayload_descriptor;
            }

            private C5228l1 getPlayTimeFieldBuilder() {
                if (this.playTimeBuilder_ == null) {
                    this.playTimeBuilder_ = new C5228l1(getPlayTime(), getParentForChildren(), isClean());
                    this.playTime_ = null;
                }
                return this.playTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getPlayTimeFieldBuilder();
                }
            }

            public Builder clearId() {
                this.id_ = VideoPlayPayload.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearPlayTime() {
                this.bitField0_ &= -9;
                this.playTime_ = null;
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.playTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = VideoPlayPayload.getDefaultInstance().getTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = VideoPlayPayload.getDefaultInstance().getUrl();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_VideoPlayPayload_descriptor;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public B getPlayTime() {
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 != null) {
                    return (B) c5228l1.getMessage();
                }
                B b9 = this.playTime_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            public B.b getPlayTimeBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (B.b) getPlayTimeFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public C getPlayTimeOrBuilder() {
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 != null) {
                    return (C) c5228l1.getMessageOrBuilder();
                }
                B b9 = this.playTime_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public AbstractC5235o getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.title_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public AbstractC5235o getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.url_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
            public boolean hasPlayTime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DirectiveOuterClass.internal_static_maum_m2u_common_VideoPlayPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoPlayPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergePlayTime(B b9) {
                B b10;
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(b9);
                } else if ((this.bitField0_ & 8) == 0 || (b10 = this.playTime_) == null || b10 == B.getDefaultInstance()) {
                    this.playTime_ = b9;
                } else {
                    getPlayTimeBuilder().mergeFrom(b9);
                }
                if (this.playTime_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.id_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPlayTime(B b9) {
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 == null) {
                    b9.getClass();
                    this.playTime_ = b9;
                } else {
                    c5228l1.setMessage(b9);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.title_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.url_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.id_ = "";
                this.title_ = "";
                this.url_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public VideoPlayPayload build() {
                VideoPlayPayload videoPlayPayloadBuildPartial = buildPartial();
                if (videoPlayPayloadBuildPartial.isInitialized()) {
                    return videoPlayPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) videoPlayPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public VideoPlayPayload buildPartial() {
                VideoPlayPayload videoPlayPayload = new VideoPlayPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(videoPlayPayload);
                }
                onBuilt();
                return videoPlayPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public VideoPlayPayload getDefaultInstanceForType() {
                return VideoPlayPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.title_ = "";
                this.url_ = "";
                this.playTime_ = null;
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.playTimeBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof VideoPlayPayload) {
                    return mergeFrom((VideoPlayPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setPlayTime(B.b bVar) {
                C5228l1 c5228l1 = this.playTimeBuilder_;
                if (c5228l1 == null) {
                    this.playTime_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.title_ = "";
                this.url_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(VideoPlayPayload videoPlayPayload) {
                if (videoPlayPayload == VideoPlayPayload.getDefaultInstance()) {
                    return this;
                }
                if (!videoPlayPayload.getId().isEmpty()) {
                    this.id_ = videoPlayPayload.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!videoPlayPayload.getTitle().isEmpty()) {
                    this.title_ = videoPlayPayload.title_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!videoPlayPayload.getUrl().isEmpty()) {
                    this.url_ = videoPlayPayload.url_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (videoPlayPayload.hasPlayTime()) {
                    mergePlayTime(videoPlayPayload.getPlayTime());
                }
                mergeUnknownFields(videoPlayPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.id_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.title_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 90) {
                                    this.url_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 98) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPlayTimeFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ VideoPlayPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$18576(VideoPlayPayload videoPlayPayload, int i8) {
            int i9 = i8 | videoPlayPayload.bitField0_;
            videoPlayPayload.bitField0_ = i9;
            return i9;
        }

        public static VideoPlayPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_VideoPlayPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoPlayPayload parseDelimitedFrom(InputStream inputStream) {
            return (VideoPlayPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoPlayPayload parseFrom(ByteBuffer byteBuffer) {
            return (VideoPlayPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoPlayPayload)) {
                return super.equals(obj);
            }
            VideoPlayPayload videoPlayPayload = (VideoPlayPayload) obj;
            if (getId().equals(videoPlayPayload.getId()) && getTitle().equals(videoPlayPayload.getTitle()) && getUrl().equals(videoPlayPayload.getUrl()) && hasPlayTime() == videoPlayPayload.hasPlayTime()) {
                return (!hasPlayTime() || getPlayTime().equals(videoPlayPayload.getPlayTime())) && getUnknownFields().equals(videoPlayPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public AbstractC5235o getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.id_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public B getPlayTime() {
            B b9 = this.playTime_;
            return b9 == null ? B.getDefaultInstance() : b9;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public C getPlayTimeOrBuilder() {
            B b9 = this.playTime_;
            return b9 == null ? B.getDefaultInstance() : b9;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.title_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.url_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.url_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(12, getPlayTime());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public AbstractC5235o getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.title_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public AbstractC5235o getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.url_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DirectiveOuterClass.VideoPlayPayloadOrBuilder
        public boolean hasPlayTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getTitle().hashCode()) * 37) + 11) * 53) + getUrl().hashCode();
            if (hasPlayTime()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getPlayTime().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DirectiveOuterClass.internal_static_maum_m2u_common_VideoPlayPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoPlayPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new VideoPlayPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.title_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.url_)) {
                AbstractC5209f0.writeString(abstractC5248t, 11, this.url_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(12, getPlayTime());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private VideoPlayPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = "";
            this.title_ = "";
            this.url_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(VideoPlayPayload videoPlayPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoPlayPayload);
        }

        public static VideoPlayPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (VideoPlayPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static VideoPlayPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (VideoPlayPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static VideoPlayPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (VideoPlayPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public VideoPlayPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static VideoPlayPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (VideoPlayPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VideoPlayPayload parseFrom(byte[] bArr) {
            return (VideoPlayPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static VideoPlayPayload parseFrom(byte[] bArr, M m8) {
            return (VideoPlayPayload) PARSER.parseFrom(bArr, m8);
        }

        private VideoPlayPayload() {
            this.id_ = "";
            this.title_ = "";
            this.url_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.title_ = "";
            this.url_ = "";
        }

        public static VideoPlayPayload parseFrom(InputStream inputStream) {
            return (VideoPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static VideoPlayPayload parseFrom(InputStream inputStream, M m8) {
            return (VideoPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static VideoPlayPayload parseFrom(r rVar) {
            return (VideoPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static VideoPlayPayload parseFrom(r rVar, M m8) {
            return (VideoPlayPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface VideoPlayPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        String getId();

        AbstractC5235o getIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        B getPlayTime();

        C getPlayTimeOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getTitle();

        AbstractC5235o getTitleBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUrl();

        AbstractC5235o getUrlBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasPlayTime();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_common_Directive_descriptor = bVar;
        internal_static_maum_m2u_common_Directive_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Interface", "Operation", "Param", "Payload"});
        C5269x.b bVar2 = bVar.getNestedTypes().get(0);
        internal_static_maum_m2u_common_Directive_DirectivePayload_descriptor = bVar2;
        internal_static_maum_m2u_common_Directive_DirectivePayload_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"AudioPlay", "VideoPlay", "AvatarSetExpression", "ClovaAudioPlay", "LauncherViewMapPayload", "LauncherLaunchAppPayload", "LauncherLaunchPagePayload", "TestPayload"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_common_LauncherViewMapPayload_descriptor = bVar3;
        internal_static_maum_m2u_common_LauncherViewMapPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"SearchRange", "SearchObject", "SearchKeyword"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_common_AvatarSetExpressionPayload_descriptor = bVar4;
        internal_static_maum_m2u_common_AvatarSetExpressionPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar4, new String[]{"Target", "Expression", "Desciption"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(3);
        internal_static_maum_m2u_common_AudioPlayPayload_descriptor = bVar5;
        internal_static_maum_m2u_common_AudioPlayPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar5, new String[]{"Stream", "Metadata"});
        C5269x.b bVar6 = bVar5.getNestedTypes().get(0);
        internal_static_maum_m2u_common_AudioPlayPayload_Stream_descriptor = bVar6;
        internal_static_maum_m2u_common_AudioPlayPayload_Stream_fieldAccessorTable = new AbstractC5209f0.g(bVar6, new String[]{"Id", "Url", "PlayTime"});
        C5269x.b bVar7 = bVar5.getNestedTypes().get(1);
        internal_static_maum_m2u_common_AudioPlayPayload_Sources_descriptor = bVar7;
        internal_static_maum_m2u_common_AudioPlayPayload_Sources_fieldAccessorTable = new AbstractC5209f0.g(bVar7, new String[]{"Urls"});
        C5269x.b bVar8 = bVar5.getNestedTypes().get(2);
        internal_static_maum_m2u_common_AudioPlayPayload_Metadata_descriptor = bVar8;
        internal_static_maum_m2u_common_AudioPlayPayload_Metadata_fieldAccessorTable = new AbstractC5209f0.g(bVar8, new String[]{"Title", "Subtitle", "Art", "BackgroundImage"});
        C5269x.b bVar9 = getDescriptor().getMessageTypes().get(4);
        internal_static_maum_m2u_common_AudioPlayClovaPayload_descriptor = bVar9;
        internal_static_maum_m2u_common_AudioPlayClovaPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar9, new String[]{"DirectiveBody", "PlayList"});
        C5269x.b bVar10 = bVar9.getNestedTypes().get(0);
        internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_descriptor = bVar10;
        internal_static_maum_m2u_common_AudioPlayClovaPayload_DirectiveBody_fieldAccessorTable = new AbstractC5209f0.g(bVar10, new String[]{"ServiceName", "PlayBehavior", "ProgressReportInterval", "PlayIndex", "PlayListCount"});
        C5269x.b bVar11 = bVar9.getNestedTypes().get(1);
        internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_descriptor = bVar11;
        internal_static_maum_m2u_common_AudioPlayClovaPayload_MetaInfo_fieldAccessorTable = new AbstractC5209f0.g(bVar11, new String[]{"ExpiryTime", "CategoryId", "CategoryName", "AudioName", "GenreId", "GenreName", "ArtistName", "ArtistId", "IsAdultYn", "ImageUrl", "IsLike", "LikeCount", "RunningTime", "CreatedDate", "UpdateDate"});
        C5269x.b bVar12 = bVar9.getNestedTypes().get(2);
        internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_descriptor = bVar12;
        internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_fieldAccessorTable = new AbstractC5209f0.g(bVar12, new String[]{"Item"});
        C5269x.b bVar13 = bVar12.getNestedTypes().get(0);
        internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_descriptor = bVar13;
        internal_static_maum_m2u_common_AudioPlayClovaPayload_PlayList_Item_fieldAccessorTable = new AbstractC5209f0.g(bVar13, new String[]{"Index", "ItemId", "Url", "IntervalTime", "OffsetPlayInTime", "MetaInfo"});
        C5269x.b bVar14 = getDescriptor().getMessageTypes().get(5);
        internal_static_maum_m2u_common_AudioStopPayload_descriptor = bVar14;
        internal_static_maum_m2u_common_AudioStopPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar14, new String[]{"Id", "Reason"});
        C5269x.b bVar15 = getDescriptor().getMessageTypes().get(6);
        internal_static_maum_m2u_common_VideoPlayPayload_descriptor = bVar15;
        internal_static_maum_m2u_common_VideoPlayPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar15, new String[]{"Id", "Title", "Url", "PlayTime"});
        C5269x.b bVar16 = getDescriptor().getMessageTypes().get(7);
        internal_static_maum_m2u_common_DelegateDirective_descriptor = bVar16;
        internal_static_maum_m2u_common_DelegateDirective_fieldAccessorTable = new AbstractC5209f0.g(bVar16, new String[]{"Interface", "Operation", "Param", "Payload"});
        C5269x.b bVar17 = bVar16.getNestedTypes().get(0);
        internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_descriptor = bVar17;
        internal_static_maum_m2u_common_DelegateDirective_DelegateDirectivePayload_fieldAccessorTable = new AbstractC5209f0.g(bVar17, new String[]{"LauncherAuthorize", "LauncherFillSlots", "LauncherReadDocument", "TestPayload"});
        C5269x.b bVar18 = getDescriptor().getMessageTypes().get(8);
        internal_static_maum_m2u_common_LauncherReadDocumentPayload_descriptor = bVar18;
        internal_static_maum_m2u_common_LauncherReadDocumentPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar18, new String[]{"Id", "DocumentUrl", "Title", "SubTitle"});
        C5269x.b bVar19 = getDescriptor().getMessageTypes().get(9);
        internal_static_maum_m2u_common_LauncherAuthorizePayload_descriptor = bVar19;
        internal_static_maum_m2u_common_LauncherAuthorizePayload_fieldAccessorTable = new AbstractC5209f0.g(bVar19, new String[]{"Provider", "Method", "Meta"});
        C5269x.b bVar20 = getDescriptor().getMessageTypes().get(10);
        internal_static_maum_m2u_common_LauncherFillSlotsPayload_descriptor = bVar20;
        internal_static_maum_m2u_common_LauncherFillSlotsPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar20, new String[]{"FilledSlots", "RequestingSlots"});
        C5269x.b bVar21 = getDescriptor().getMessageTypes().get(11);
        internal_static_maum_m2u_common_LauncherLaunchAppPayload_descriptor = bVar21;
        internal_static_maum_m2u_common_LauncherLaunchAppPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar21, new String[]{"Target", "Uri", "Meta", "RuntimeEnv", "Description"});
        C5269x.b bVar22 = getDescriptor().getMessageTypes().get(12);
        internal_static_maum_m2u_common_LauncherLaunchPagePayload_descriptor = bVar22;
        internal_static_maum_m2u_common_LauncherLaunchPagePayload_fieldAccessorTable = new AbstractC5209f0.g(bVar22, new String[]{"Target", "Uri", "Meta", "BrowerEnv", "Description"});
        AbstractC5245r1.getDescriptor();
        D.getDescriptor();
        EventOuterClass.getDescriptor();
    }

    private DirectiveOuterClass() {
    }

    public static C5269x.h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
