package maum.m2u.map;

import A7.a;
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
import com.google.protobuf.C5269x;
import com.google.protobuf.D;
import com.google.protobuf.E1;
import com.google.protobuf.F;
import com.google.protobuf.G;
import com.google.protobuf.G1;
import com.google.protobuf.H;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC5204d1;
import com.google.protobuf.InterfaceC5243q1;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.N0;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import com.google.protobuf.w1;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import maum.m2u.common.DeviceOuterClass;
import maum.m2u.common.EventOuterClass;
import maum.m2u.common.LocationOuterClass;
import y7.AbstractC6551a;
import z7.AbstractC6650a;

/* loaded from: classes3.dex */
public final class Map {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u0016maum/m2u/map/map.proto\u0012\fmaum.m2u.map\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001egoogle/protobuf/duration.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001bgoogle/protobuf/empty.proto\u001a\u001bmaum/brain/stt/speech.proto\u001a\u001bmaum/brain/tts/speech.proto\u001a\u0018maum/brain/idr/idr.proto\u001a\u001cmaum/m2u/common/device.proto\u001a\u001emaum/m2u/common/location.proto\u001a\u001bmaum/m2u/common/event.proto\"c\n\u000bPingRequest\u0012'\n\u0006device\u0018\u0001 \u0001(\u000b2\u0017.maum.m2u.common.Device\u0012+\n\u0007ping_at\u0018e \u0001(\u000b2\u001a.google.protobuf.Timestamp\"\u008e\u0003\n\fPongResponse\u0012@\n\fclient_state\u0018\u0001 \u0001(\u000e2*.maum.m2u.map.PongResponse.PongClientState\u00121\n\u0006m2u_id\u0018\u0002 \u0001(\u000b2!.maum.m2u.map.MaumToYouIdentifier\u0012\u001c\n\u0014require_event_stream\u0018\u0003 \u0001(\b\u0012/\n\tdir_state\u0018\u000b \u0001(\u000b2\u001c.maum.m2u.map.DirectiveState\u0012\u000f\n\u0007version\u0018c \u0001(\t\u0012+\n\u0007pong_at\u0018d \u0001(\u000b2\u001a.google.protobuf.Timestamp\"|\n\u000fPongClientState\u0012\u0018\n\u0014PONG_CLIENT_CONTINUE\u0010\u0000\u0012\u0019\n\u0015PONG_NEW_CLIENT_FOUND\u0010\u0001\u0012\u001c\n\u0018PONG_IDLE_CLIENT_RESTART\u0010\u0002\u0012\u0016\n\u0012PONG_ACCESS_DENIED\u0010\u0003\"I\n\u0013MaumToYouIdentifier\u0012\f\n\u0004uuid\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\t\u0012\u0013\n\u000blicensed_to\u0018\u0003 \u0001(\t\"d\n\u000eDirectiveState\u0012\u000f\n\u0007pending\u0018\u0001 \u0001(\b\u0012\u0015\n\rpending_count\u0018\u0002 \u0001(\u0005\u0012\u0011\n\tdiscarded\u0018\u000b \u0001(\b\u0012\u0017\n\u000fdiscarded_count\u0018\f \u0001(\u0005\"¢\u0002\n\bMapEvent\u0012*\n\u0005event\u0018\u0001 \u0001(\u000b2\u0019.maum.m2u.map.EventStreamH\u0000\u0012-\n\nstream_end\u0018\u0002 \u0001(\u000b2\u0017.maum.m2u.map.StreamEndH\u0000\u00121\n\fstream_break\u0018\u0003 \u0001(\u000b2\u0019.maum.m2u.map.StreamBreakH\u0000\u0012\u000f\n\u0005bytes\u0018\u000b \u0001(\fH\u0000\u0012\u000e\n\u0004text\u0018\f \u0001(\tH\u0000\u0012(\n\u0004meta\u0018\u0015 \u0001(\u000b2\u0018.maum.m2u.map.StreamMetaH\u0000\u0012/\n\texception\u0018c \u0001(\u000b2\u001a.maum.m2u.map.MapExceptionH\u0000B\f\n\ntest_event\"\u0081\u0007\n\u000bEventStream\u0012/\n\tinterface\u0018\u0001 \u0001(\u000b2\u001c.maum.m2u.map.AsyncInterface\u0012\u0011\n\tstream_id\u0018\u0002 \u0001(\t\u0012\u0019\n\u0011operation_sync_id\u0018\u0003 \u0001(\t\u00128\n\bcontexts\u0018\u000b \u0003(\u000b2&.maum.m2u.map.EventStream.EventContext\u00123\n\u0005param\u0018\f \u0001(\u000b2$.maum.m2u.map.EventStream.EventParam\u0012(\n\u0007payload\u0018c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012,\n\bbegin_at\u0018d \u0001(\u000b2\u001a.google.protobuf.Timestamp\u001ax\n\fEventContext\u0012)\n\u0006device\u0018\u0001 \u0001(\u000b2\u0017.maum.m2u.common.DeviceH\u0000\u0012-\n\blocation\u0018\u0002 \u0001(\u000b2\u0019.maum.m2u.common.LocationH\u0000B\u000e\n\ftest_context\u001aÑ\u0003\n\nEventParam\u0012J\n\u0018speech_recognition_param\u0018\u0001 \u0001(\u000b2&.maum.brain.stt.SpeechRecognitionParamH\u0000\u0012H\n\u0017image_recognition_param\u0018\u0002 \u0001(\u000b2%.maum.brain.idr.ImageRecognitionParamH\u0000\u0012/\n\u000bvideo_param\u0018\u0003 \u0001(\u000b2\u0018.maum.m2u.map.VideoParamH\u0000\u00123\n\rgesture_param\u0018\u0004 \u0001(\u000b2\u001a.maum.m2u.map.GestureParamH\u0000\u00125\n\u000ekeyboard_param\u0018\u0005 \u0001(\u000b2\u001b.maum.m2u.map.KeyboardParamH\u0000\u0012R\n\u001cdialog_agent_forwarder_param\u0018\u0006 \u0001(\u000b2*.maum.m2u.common.DialogAgentForwarderParamH\u0000\u0012.\n\u000bempty_param\u0018è\u0007 \u0001(\u000b2\u0016.google.protobuf.EmptyH\u0000B\f\n\ntest_param\"²\u0002\n\fMapDirective\u00122\n\tdirective\u0018\u0001 \u0001(\u000b2\u001d.maum.m2u.map.DirectiveStreamH\u0000\u0012-\n\nstream_end\u0018\u0002 \u0001(\u000b2\u0017.maum.m2u.map.StreamEndH\u0000\u00121\n\fstream_break\u0018\u0003 \u0001(\u000b2\u0019.maum.m2u.map.StreamBreakH\u0000\u0012\u000f\n\u0005bytes\u0018\u000b \u0001(\fH\u0000\u0012\u000e\n\u0004text\u0018\f \u0001(\tH\u0000\u0012(\n\u0004meta\u0018\u0015 \u0001(\u000b2\u0018.maum.m2u.map.StreamMetaH\u0000\u0012/\n\texception\u0018c \u0001(\u000b2\u001a.maum.m2u.map.MapExceptionH\u0000B\u0010\n\u000etest_directive\"\u009b\u0004\n\u000fDirectiveStream\u0012/\n\tinterface\u0018\u0001 \u0001(\u000b2\u001c.maum.m2u.map.AsyncInterface\u0012\u0011\n\tstream_id\u0018\u0002 \u0001(\t\u0012\u0019\n\u0011operation_sync_id\u0018\u0003 \u0001(\t\u0012;\n\u0005param\u0018\u0004 \u0001(\u000b2,.maum.m2u.map.DirectiveStream.DirectiveParam\u0012(\n\u0007payload\u0018c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012,\n\bbegin_at\u0018d \u0001(\u000b2\u001a.google.protobuf.Timestamp\u001a\u0093\u0002\n\u000eDirectiveParam\u0012F\n\u0010da_forward_param\u0018\u0001 \u0001(\u000b2*.maum.m2u.common.DialogAgentForwarderParamH\u0000\u0012J\n\u0018speech_synthesizer_param\u0018\u0002 \u0001(\u000b2&.maum.brain.tts.SpeechSynthesizerParamH\u0000\u0012/\n\u000bvideo_param\u0018\u0003 \u0001(\u000b2\u0018.maum.m2u.map.VideoParamH\u0000\u0012.\n\u000bempty_param\u0018è\u0007 \u0001(\u000b2\u0016.google.protobuf.EmptyH\u0000B\f\n\ntest_param\"ë\u000b\n\fMapException\u0012\u0014\n\fexception_id\u0018\u0001 \u0001(\t\u0012:\n\u000bstatus_code\u0018\n \u0001(\u000e2%.maum.m2u.map.MapException.StatusCode\u0012\u0012\n\nex_message\u0018\u0015 \u0001(\t\u0012\u0010\n\bex_index\u0018\u0016 \u0001(\u0005\u0012(\n\u0007payload\u0018c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012-\n\tthrown_at\u0018d \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0011\n\tstream_id\u0018e \u0001(\t\u0012\u0019\n\u0011operation_sync_id\u0018f \u0001(\t\u00126\n\u0010called_interface\u0018g \u0001(\u000b2\u001c.maum.m2u.map.AsyncInterface\"£\t\n\nStatusCode\u0012\u0018\n\u0014STATUS_NOT_SPECIFIED\u0010\u0000\u0012\u0013\n\u000eGRPC_STT_ERROR\u0010õ\u0003\u0012\u0013\n\u000eGRPC_IDR_ERROR\u0010ö\u0003\u0012\u0013\n\u000eGRPC_TTS_ERROR\u0010÷\u0003\u0012\u001c\n\u0017GRPC_AUTH_SIGN_IN_ERROR\u0010ø\u0003\u0012\u001d\n\u0018GRPC_AUTH_SIGN_OUT_ERROR\u0010ù\u0003\u0012'\n\"GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR\u0010ú\u0003\u0012\u001d\n\u0018GRPC_AUTH_IS_VALID_ERROR\u0010û\u0003\u0012\"\n\u001dGRPC_AUTH_GET_USER_INFO_ERROR\u0010ü\u0003\u0012)\n$GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR\u0010ý\u0003\u0012&\n!GRPC_AUTH_GET_USER_SETTINGS_ERROR\u0010þ\u0003\u0012\u001b\n\u0016GRPC_ROUTER_OPEN_ERROR\u0010ÿ\u0003\u0012\u001b\n\u0016GRPC_ROUTER_TALK_ERROR\u0010\u0080\u0004\u0012\u001c\n\u0017GRPC_ROUTER_EVENT_ERROR\u0010\u0081\u0004\u0012\u001c\n\u0017GRPC_ROUTER_CLOSE_ERROR\u0010\u0082\u0004\u0012\u001f\n\u001aGRPC_ROUTER_FEEDBACK_ERROR\u0010\u0083\u0004\u0012#\n\u001eGRPC_STT_TRANSCRIPT_NULL_ERROR\u0010\u0084\u0004\u0012\u0019\n\u0014AUTH_IS_VAILD_FAILED\u0010\u00ad\u0002\u0012\u001c\n\u0017AUTH_INVALID_AUTH_TOKEN\u0010®\u0002\u0012\u0010\n\u000bAUTH_FAILED\u0010¯\u0002\u0012\u0018\n\u0013AUTH_INVALID_HEADER\u0010°\u0002\u0012\u001b\n\u0016AUTH_CHECK_AUTH_FAILED\u0010±\u0002\u0012\u0018\n\u0013MAP_NO_STREAM_PARAM\u0010¶\u0002\u0012\u0015\n\u0010MAP_IF_NOT_FOUND\u0010·\u0002\u0012\u001f\n\u001aMAP_IF_STREAMING_NOT_MATCH\u0010¸\u0002\u0012 \n\u001bMAP_IF_DUPLICATED_STREAMING\u0010¹\u0002\u0012\u001b\n\u0016MAP_EVENT_CASE_NOT_SET\u0010º\u0002\u0012 \n\u001bMAP_CURRENTLY_HAS_NO_STREAM\u0010»\u0002\u0012\u001c\n\u0017MAP_STREAM_ID_NOT_MATCH\u0010¼\u0002\u0012\u0016\n\u0011MAP_PAYLOAD_ERROR\u0010½\u0002\u0012\u0018\n\u0013MAP_CLASS_NOT_FOUND\u0010¾\u0002\u0012\u001d\n\u0018ROUTER_SESSION_NOT_FOUND\u0010\u0091\u0003\u0012\u001b\n\u0016ROUTER_SESSION_INVALID\u0010\u0092\u0003\u0012\u001d\n\u0018ROUTER_CHATBOT_NOT_FOUND\u0010\u0093\u0003\u0012\u0018\n\u0013ROUTER_DA_NOT_FOUND\u0010\u0094\u0003\u0012\u0014\n\u000fROUTER_DA_ERROR\u0010\u0095\u0003\u0012\u0019\n\u0014ROUTER_ITF_NOT_FOUND\u0010\u0096\u0003\u0012\u0015\n\u0010ROUTER_ITF_ERROR\u0010\u0097\u0003\u0012%\n MAP_TOTAL_SESSION_COUNT_EXCEEDED\u0010\u0098\u0003\u0012\u001b\n\u0016MAP_SYSTEM_MAINTENANCE\u0010\u0099\u0003\"H\n\nStreamMeta\u0012\u0013\n\u000bobject_type\u0018\u0001 \u0001(\t\u0012%\n\u0004meta\u0018\u000b \u0001(\u000b2\u0017.google.protobuf.Struct\"J\n\tStreamEnd\u0012\u0011\n\tstream_id\u0018\u0001 \u0001(\t\u0012*\n\u0006end_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\"\u009a\u0002\n\u000bStreamBreak\u0012\u000e\n\u0006reason\u0018\u0001 \u0001(\t\u00128\n\u0007breaker\u0018\u0002 \u0001(\u000e2'.maum.m2u.map.StreamBreak.StreamBreaker\u0012\u0011\n\tstream_id\u0018\u0003 \u0001(\t\u0012-\n\tbroken_at\u0018d \u0001(\u000b2\u001a.google.protobuf.Timestamp\"\u007f\n\rStreamBreaker\u0012\u0018\n\u0014BREAK_BY_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rBREAK_BY_USER\u0010\u0001\u0012\u0013\n\u000fBREAK_BY_SYSTEM\u0010\u0002\u0012\u0014\n\u0010BREAK_BY_LOGICAL\u0010\u0003\u0012\u0016\n\u0012BREAK_BY_EXCEPTION\u0010\u0004\"´\u0001\n\u000eAsyncInterface\u0012\u0011\n\tinterface\u0018\u0001 \u0001(\t\u0012\u0011\n\toperation\u0018\u0002 \u0001(\t\u00128\n\u0004type\u0018\u0003 \u0001(\u000e2*.maum.m2u.map.AsyncInterface.OperationType\u0012\u0011\n\tstreaming\u0018\u0004 \u0001(\b\"/\n\rOperationType\u0012\f\n\bOP_EVENT\u0010\u0000\u0012\u0010\n\fOP_DIRECTIVE\u0010\u0001\"F\n\u0012AsyncInterfaceList\u00120\n\ninterfaces\u0018\u0001 \u0003(\u000b2\u001c.maum.m2u.map.AsyncInterface\"A\n\nVideoParam\u0012\u0014\n\fvideo_format\u0018\u0001 \u0001(\t\u0012\r\n\u0005codec\u0018\u0002 \u0001(\t\u0012\u000e\n\u0004todo\u0018\u009f\u008d\u0006 \u0001(\t\"\u001e\n\fGestureParam\u0012\u000e\n\u0004todo\u0018\u009f\u008d\u0006 \u0001(\t\"R\n\rKeyboardParam\u0012\u0014\n\ftyped_length\u0018\u0001 \u0001(\u0005\u0012+\n\bduration\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.Duration2Å\u0002\n\u0015MaumToYouProxyService\u0012?\n\u0004Ping\u0012\u0019.maum.m2u.map.PingRequest\u001a\u001a.maum.m2u.map.PongResponse\"\u0000\u0012I\n\rGetDirectives\u0012\u0016.maum.m2u.map.MapEvent\u001a\u001a.maum.m2u.map.MapDirective\"\u0000(\u00010\u0001\u0012G\n\u000bEventStream\u0012\u0016.maum.m2u.map.MapEvent\u001a\u001a.maum.m2u.map.MapDirective\"\u0000(\u00010\u0001\u0012W\n\u0013ListAsyncInterfaces\u0012\u001c.maum.m2u.map.AsyncInterface\u001a .maum.m2u.map.AsyncInterfaceList\"\u0000b\u0006proto3"}, new C5269x.h[]{y1.getDescriptor(), D.getDescriptor(), AbstractC5245r1.getDescriptor(), H.getDescriptor(), AbstractC6650a.getDescriptor(), a.getDescriptor(), AbstractC6551a.getDescriptor(), DeviceOuterClass.getDescriptor(), LocationOuterClass.getDescriptor(), EventOuterClass.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_map_AsyncInterfaceList_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_AsyncInterfaceList_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_AsyncInterface_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_AsyncInterface_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_DirectiveState_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_DirectiveState_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_DirectiveStream_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_DirectiveStream_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_EventStream_EventContext_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_EventStream_EventContext_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_EventStream_EventParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_EventStream_EventParam_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_EventStream_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_EventStream_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_GestureParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_GestureParam_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_KeyboardParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_KeyboardParam_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MapDirective_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MapDirective_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MapEvent_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MapEvent_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MapException_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MapException_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MaumToYouIdentifier_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MaumToYouIdentifier_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_PingRequest_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_PingRequest_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_PongResponse_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_PongResponse_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_StreamBreak_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_StreamBreak_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_StreamEnd_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_StreamEnd_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_StreamMeta_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_StreamMeta_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_VideoParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_VideoParam_fieldAccessorTable;

    /* renamed from: maum.m2u.map.Map$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase;
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Map$EventStream$EventContext$TestContextCase;
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase;
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase;
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase;

        static {
            int[] iArr = new int[DirectiveStream.DirectiveParam.TestParamCase.values().length];
            $SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase = iArr;
            try {
                iArr[DirectiveStream.DirectiveParam.TestParamCase.DA_FORWARD_PARAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase[DirectiveStream.DirectiveParam.TestParamCase.SPEECH_SYNTHESIZER_PARAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase[DirectiveStream.DirectiveParam.TestParamCase.VIDEO_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase[DirectiveStream.DirectiveParam.TestParamCase.EMPTY_PARAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase[DirectiveStream.DirectiveParam.TestParamCase.TESTPARAM_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[MapDirective.TestDirectiveCase.values().length];
            $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase = iArr2;
            try {
                iArr2[MapDirective.TestDirectiveCase.DIRECTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.STREAM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.STREAM_BREAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.BYTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.META.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[MapDirective.TestDirectiveCase.TESTDIRECTIVE_NOT_SET.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[EventStream.EventParam.TestParamCase.values().length];
            $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase = iArr3;
            try {
                iArr3[EventStream.EventParam.TestParamCase.SPEECH_RECOGNITION_PARAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.IMAGE_RECOGNITION_PARAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.VIDEO_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.GESTURE_PARAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.KEYBOARD_PARAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.DIALOG_AGENT_FORWARDER_PARAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.EMPTY_PARAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[EventStream.EventParam.TestParamCase.TESTPARAM_NOT_SET.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr4 = new int[EventStream.EventContext.TestContextCase.values().length];
            $SwitchMap$maum$m2u$map$Map$EventStream$EventContext$TestContextCase = iArr4;
            try {
                iArr4[EventStream.EventContext.TestContextCase.DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventContext$TestContextCase[EventStream.EventContext.TestContextCase.LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$EventStream$EventContext$TestContextCase[EventStream.EventContext.TestContextCase.TESTCONTEXT_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[MapEvent.TestEventCase.values().length];
            $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase = iArr5;
            try {
                iArr5[MapEvent.TestEventCase.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.STREAM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.STREAM_BREAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.BYTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.META.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[MapEvent.TestEventCase.TESTEVENT_NOT_SET.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
        }
    }

    public static final class AsyncInterface extends AbstractC5209f0 implements AsyncInterfaceOrBuilder {
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_FIELD_NUMBER = 2;
        public static final int STREAMING_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object interface_;
        private byte memoizedIsInitialized;
        private volatile Object operation_;
        private boolean streaming_;
        private int type_;
        private static final AsyncInterface DEFAULT_INSTANCE = new AsyncInterface();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.AsyncInterface.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AsyncInterface parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AsyncInterface.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements AsyncInterfaceOrBuilder {
            private int bitField0_;
            private Object interface_;
            private Object operation_;
            private boolean streaming_;
            private int type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AsyncInterface asyncInterface) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    asyncInterface.interface_ = this.interface_;
                }
                if ((i8 & 2) != 0) {
                    asyncInterface.operation_ = this.operation_;
                }
                if ((i8 & 4) != 0) {
                    asyncInterface.type_ = this.type_;
                }
                if ((i8 & 8) != 0) {
                    asyncInterface.streaming_ = this.streaming_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_AsyncInterface_descriptor;
            }

            public Builder clearInterface() {
                this.interface_ = AsyncInterface.getDefaultInstance().getInterface();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearOperation() {
                this.operation_ = AsyncInterface.getDefaultInstance().getOperation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearStreaming() {
                this.bitField0_ &= -9;
                this.streaming_ = false;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -5;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_AsyncInterface_descriptor;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public String getInterface() {
                Object obj = this.interface_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.interface_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public AbstractC5235o getInterfaceBytes() {
                Object obj = this.interface_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.interface_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public String getOperation() {
                Object obj = this.operation_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operation_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public AbstractC5235o getOperationBytes() {
                Object obj = this.operation_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operation_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public boolean getStreaming() {
                return this.streaming_;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public OperationType getType() {
                OperationType operationTypeForNumber = OperationType.forNumber(this.type_);
                return operationTypeForNumber == null ? OperationType.UNRECOGNIZED : operationTypeForNumber;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_AsyncInterface_fieldAccessorTable.ensureFieldAccessorsInitialized(AsyncInterface.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
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

            public Builder setStreaming(boolean z8) {
                this.streaming_ = z8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setType(OperationType operationType) {
                operationType.getClass();
                this.bitField0_ |= 4;
                this.type_ = operationType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i8) {
                this.type_ = i8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.interface_ = "";
                this.operation_ = "";
                this.type_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AsyncInterface build() {
                AsyncInterface asyncInterfaceBuildPartial = buildPartial();
                if (asyncInterfaceBuildPartial.isInitialized()) {
                    return asyncInterfaceBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) asyncInterfaceBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AsyncInterface buildPartial() {
                AsyncInterface asyncInterface = new AsyncInterface(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(asyncInterface);
                }
                onBuilt();
                return asyncInterface;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AsyncInterface getDefaultInstanceForType() {
                return AsyncInterface.getDefaultInstance();
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
                this.type_ = 0;
                this.streaming_ = false;
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.interface_ = "";
                this.operation_ = "";
                this.type_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AsyncInterface) {
                    return mergeFrom((AsyncInterface) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(AsyncInterface asyncInterface) {
                if (asyncInterface == AsyncInterface.getDefaultInstance()) {
                    return this;
                }
                if (!asyncInterface.getInterface().isEmpty()) {
                    this.interface_ = asyncInterface.interface_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!asyncInterface.getOperation().isEmpty()) {
                    this.operation_ = asyncInterface.operation_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (asyncInterface.type_ != 0) {
                    setTypeValue(asyncInterface.getTypeValue());
                }
                if (asyncInterface.getStreaming()) {
                    setStreaming(asyncInterface.getStreaming());
                }
                mergeUnknownFields(asyncInterface.getUnknownFields());
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
                                } else if (tag == 24) {
                                    this.type_ = rVar.readEnum();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.streaming_ = rVar.readBool();
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

        public enum OperationType implements InterfaceC5204d1 {
            OP_EVENT(0),
            OP_DIRECTIVE(1),
            UNRECOGNIZED(-1);

            public static final int OP_DIRECTIVE_VALUE = 1;
            public static final int OP_EVENT_VALUE = 0;
            private final int value;
            private static final AbstractC5227l0.d internalValueMap = new AbstractC5227l0.d() { // from class: maum.m2u.map.Map.AsyncInterface.OperationType.1
                @Override // com.google.protobuf.AbstractC5227l0.d
                public OperationType findValueByNumber(int i8) {
                    return OperationType.forNumber(i8);
                }
            };
            private static final OperationType[] VALUES = values();

            OperationType(int i8) {
                this.value = i8;
            }

            public static OperationType forNumber(int i8) {
                if (i8 == 0) {
                    return OP_EVENT;
                }
                if (i8 != 1) {
                    return null;
                }
                return OP_DIRECTIVE;
            }

            public static final C5269x.e getDescriptor() {
                return AsyncInterface.getDescriptor().getEnumTypes().get(0);
            }

            public static AbstractC5227l0.d internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static OperationType valueOf(int i8) {
                return forNumber(i8);
            }

            public static OperationType valueOf(C5269x.f fVar) {
                if (fVar.getType() == getDescriptor()) {
                    if (fVar.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        /* synthetic */ AsyncInterface(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AsyncInterface getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_AsyncInterface_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AsyncInterface parseDelimitedFrom(InputStream inputStream) {
            return (AsyncInterface) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AsyncInterface parseFrom(ByteBuffer byteBuffer) {
            return (AsyncInterface) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AsyncInterface)) {
                return super.equals(obj);
            }
            AsyncInterface asyncInterface = (AsyncInterface) obj;
            return getInterface().equals(asyncInterface.getInterface()) && getOperation().equals(asyncInterface.getOperation()) && this.type_ == asyncInterface.type_ && getStreaming() == asyncInterface.getStreaming() && getUnknownFields().equals(asyncInterface.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public String getInterface() {
            Object obj = this.interface_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.interface_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public AbstractC5235o getInterfaceBytes() {
            Object obj = this.interface_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.interface_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public String getOperation() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operation_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public AbstractC5235o getOperationBytes() {
            Object obj = this.operation_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operation_ = abstractC5235oCopyFromUtf8;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.interface_) ? AbstractC5209f0.computeStringSize(1, this.interface_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.operation_);
            }
            if (this.type_ != OperationType.OP_EVENT.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(3, this.type_);
            }
            boolean z8 = this.streaming_;
            if (z8) {
                iComputeStringSize += AbstractC5248t.computeBoolSize(4, z8);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public boolean getStreaming() {
            return this.streaming_;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public OperationType getType() {
            OperationType operationTypeForNumber = OperationType.forNumber(this.type_);
            return operationTypeForNumber == null ? OperationType.UNRECOGNIZED : operationTypeForNumber;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInterface().hashCode()) * 37) + 2) * 53) + getOperation().hashCode()) * 37) + 3) * 53) + this.type_) * 37) + 4) * 53) + AbstractC5227l0.hashBoolean(getStreaming())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_AsyncInterface_fieldAccessorTable.ensureFieldAccessorsInitialized(AsyncInterface.class, Builder.class);
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
            return new AsyncInterface();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.interface_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.interface_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.operation_);
            }
            if (this.type_ != OperationType.OP_EVENT.getNumber()) {
                abstractC5248t.writeEnum(3, this.type_);
            }
            boolean z8 = this.streaming_;
            if (z8) {
                abstractC5248t.writeBool(4, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AsyncInterface(AbstractC5209f0.b bVar) {
            super(bVar);
            this.interface_ = "";
            this.operation_ = "";
            this.type_ = 0;
            this.streaming_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AsyncInterface asyncInterface) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(asyncInterface);
        }

        public static AsyncInterface parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AsyncInterface) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AsyncInterface parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AsyncInterface) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AsyncInterface parseFrom(AbstractC5235o abstractC5235o) {
            return (AsyncInterface) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AsyncInterface getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static AsyncInterface parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AsyncInterface) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AsyncInterface parseFrom(byte[] bArr) {
            return (AsyncInterface) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static AsyncInterface parseFrom(byte[] bArr, M m8) {
            return (AsyncInterface) PARSER.parseFrom(bArr, m8);
        }

        public static AsyncInterface parseFrom(InputStream inputStream) {
            return (AsyncInterface) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private AsyncInterface() {
            this.interface_ = "";
            this.operation_ = "";
            this.type_ = 0;
            this.streaming_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.interface_ = "";
            this.operation_ = "";
            this.type_ = 0;
        }

        public static AsyncInterface parseFrom(InputStream inputStream, M m8) {
            return (AsyncInterface) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AsyncInterface parseFrom(r rVar) {
            return (AsyncInterface) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AsyncInterface parseFrom(r rVar, M m8) {
            return (AsyncInterface) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public static final class AsyncInterfaceList extends AbstractC5209f0 implements AsyncInterfaceListOrBuilder {
        public static final int INTERFACES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AsyncInterface> interfaces_;
        private byte memoizedIsInitialized;
        private static final AsyncInterfaceList DEFAULT_INSTANCE = new AsyncInterfaceList();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.AsyncInterfaceList.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AsyncInterfaceList parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AsyncInterfaceList.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements AsyncInterfaceListOrBuilder {
            private int bitField0_;
            private C5213g1 interfacesBuilder_;
            private List<AsyncInterface> interfaces_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AsyncInterfaceList asyncInterfaceList) {
            }

            private void buildPartialRepeatedFields(AsyncInterfaceList asyncInterfaceList) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 != null) {
                    asyncInterfaceList.interfaces_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.interfaces_ = Collections.unmodifiableList(this.interfaces_);
                    this.bitField0_ &= -2;
                }
                asyncInterfaceList.interfaces_ = this.interfaces_;
            }

            private void ensureInterfacesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.interfaces_ = new ArrayList(this.interfaces_);
                    this.bitField0_ |= 1;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_AsyncInterfaceList_descriptor;
            }

            private C5213g1 getInterfacesFieldBuilder() {
                if (this.interfacesBuilder_ == null) {
                    this.interfacesBuilder_ = new C5213g1(this.interfaces_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.interfaces_ = null;
                }
                return this.interfacesBuilder_;
            }

            public Builder addAllInterfaces(Iterable<? extends AsyncInterface> iterable) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    ensureInterfacesIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.interfaces_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addInterfaces(AsyncInterface asyncInterface) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    asyncInterface.getClass();
                    ensureInterfacesIsMutable();
                    this.interfaces_.add(asyncInterface);
                    onChanged();
                } else {
                    c5213g1.addMessage(asyncInterface);
                }
                return this;
            }

            public AsyncInterface.Builder addInterfacesBuilder() {
                return (AsyncInterface.Builder) getInterfacesFieldBuilder().addBuilder(AsyncInterface.getDefaultInstance());
            }

            public Builder clearInterfaces() {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    this.interfaces_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_AsyncInterfaceList_descriptor;
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
            public AsyncInterface getInterfaces(int i8) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                return c5213g1 == null ? this.interfaces_.get(i8) : (AsyncInterface) c5213g1.getMessage(i8);
            }

            public AsyncInterface.Builder getInterfacesBuilder(int i8) {
                return (AsyncInterface.Builder) getInterfacesFieldBuilder().getBuilder(i8);
            }

            public List<AsyncInterface.Builder> getInterfacesBuilderList() {
                return getInterfacesFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
            public int getInterfacesCount() {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                return c5213g1 == null ? this.interfaces_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
            public List<AsyncInterface> getInterfacesList() {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.interfaces_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
            public AsyncInterfaceOrBuilder getInterfacesOrBuilder(int i8) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                return c5213g1 == null ? this.interfaces_.get(i8) : (AsyncInterfaceOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
            public List<? extends AsyncInterfaceOrBuilder> getInterfacesOrBuilderList() {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.interfaces_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_AsyncInterfaceList_fieldAccessorTable.ensureFieldAccessorsInitialized(AsyncInterfaceList.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeInterfaces(int i8) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    ensureInterfacesIsMutable();
                    this.interfaces_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setInterfaces(int i8, AsyncInterface asyncInterface) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    asyncInterface.getClass();
                    ensureInterfacesIsMutable();
                    this.interfaces_.set(i8, asyncInterface);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, asyncInterface);
                }
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.interfaces_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AsyncInterfaceList build() {
                AsyncInterfaceList asyncInterfaceListBuildPartial = buildPartial();
                if (asyncInterfaceListBuildPartial.isInitialized()) {
                    return asyncInterfaceListBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) asyncInterfaceListBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AsyncInterfaceList buildPartial() {
                AsyncInterfaceList asyncInterfaceList = new AsyncInterfaceList(this, null);
                buildPartialRepeatedFields(asyncInterfaceList);
                if (this.bitField0_ != 0) {
                    buildPartial0(asyncInterfaceList);
                }
                onBuilt();
                return asyncInterfaceList;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AsyncInterfaceList getDefaultInstanceForType() {
                return AsyncInterfaceList.getDefaultInstance();
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

            public AsyncInterface.Builder addInterfacesBuilder(int i8) {
                return (AsyncInterface.Builder) getInterfacesFieldBuilder().addBuilder(i8, AsyncInterface.getDefaultInstance());
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
                this.interfaces_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    this.interfaces_ = Collections.emptyList();
                } else {
                    this.interfaces_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder addInterfaces(int i8, AsyncInterface asyncInterface) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    asyncInterface.getClass();
                    ensureInterfacesIsMutable();
                    this.interfaces_.add(i8, asyncInterface);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, asyncInterface);
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
                if (h02 instanceof AsyncInterfaceList) {
                    return mergeFrom((AsyncInterfaceList) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setInterfaces(int i8, AsyncInterface.Builder builder) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    ensureInterfacesIsMutable();
                    this.interfaces_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(AsyncInterfaceList asyncInterfaceList) {
                if (asyncInterfaceList == AsyncInterfaceList.getDefaultInstance()) {
                    return this;
                }
                if (this.interfacesBuilder_ == null) {
                    if (!asyncInterfaceList.interfaces_.isEmpty()) {
                        if (this.interfaces_.isEmpty()) {
                            this.interfaces_ = asyncInterfaceList.interfaces_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureInterfacesIsMutable();
                            this.interfaces_.addAll(asyncInterfaceList.interfaces_);
                        }
                        onChanged();
                    }
                } else if (!asyncInterfaceList.interfaces_.isEmpty()) {
                    if (!this.interfacesBuilder_.isEmpty()) {
                        this.interfacesBuilder_.addAllMessages(asyncInterfaceList.interfaces_);
                    } else {
                        this.interfacesBuilder_.dispose();
                        this.interfacesBuilder_ = null;
                        this.interfaces_ = asyncInterfaceList.interfaces_;
                        this.bitField0_ &= -2;
                        this.interfacesBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getInterfacesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(asyncInterfaceList.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addInterfaces(AsyncInterface.Builder builder) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    ensureInterfacesIsMutable();
                    this.interfaces_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addInterfaces(int i8, AsyncInterface.Builder builder) {
                C5213g1 c5213g1 = this.interfacesBuilder_;
                if (c5213g1 == null) {
                    ensureInterfacesIsMutable();
                    this.interfaces_.add(i8, builder.build());
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
                                    AsyncInterface asyncInterface = (AsyncInterface) rVar.readMessage(AsyncInterface.parser(), m8);
                                    C5213g1 c5213g1 = this.interfacesBuilder_;
                                    if (c5213g1 == null) {
                                        ensureInterfacesIsMutable();
                                        this.interfaces_.add(asyncInterface);
                                    } else {
                                        c5213g1.addMessage(asyncInterface);
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

        /* synthetic */ AsyncInterfaceList(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AsyncInterfaceList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_AsyncInterfaceList_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AsyncInterfaceList parseDelimitedFrom(InputStream inputStream) {
            return (AsyncInterfaceList) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AsyncInterfaceList parseFrom(ByteBuffer byteBuffer) {
            return (AsyncInterfaceList) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AsyncInterfaceList)) {
                return super.equals(obj);
            }
            AsyncInterfaceList asyncInterfaceList = (AsyncInterfaceList) obj;
            return getInterfacesList().equals(asyncInterfaceList.getInterfacesList()) && getUnknownFields().equals(asyncInterfaceList.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
        public AsyncInterface getInterfaces(int i8) {
            return this.interfaces_.get(i8);
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
        public int getInterfacesCount() {
            return this.interfaces_.size();
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
        public List<AsyncInterface> getInterfacesList() {
            return this.interfaces_;
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
        public AsyncInterfaceOrBuilder getInterfacesOrBuilder(int i8) {
            return this.interfaces_.get(i8);
        }

        @Override // maum.m2u.map.Map.AsyncInterfaceListOrBuilder
        public List<? extends AsyncInterfaceOrBuilder> getInterfacesOrBuilderList() {
            return this.interfaces_;
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
            for (int i9 = 0; i9 < this.interfaces_.size(); i9++) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(1, this.interfaces_.get(i9));
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
            if (getInterfacesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInterfacesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_AsyncInterfaceList_fieldAccessorTable.ensureFieldAccessorsInitialized(AsyncInterfaceList.class, Builder.class);
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
            return new AsyncInterfaceList();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            for (int i8 = 0; i8 < this.interfaces_.size(); i8++) {
                abstractC5248t.writeMessage(1, this.interfaces_.get(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AsyncInterfaceList(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AsyncInterfaceList asyncInterfaceList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(asyncInterfaceList);
        }

        public static AsyncInterfaceList parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AsyncInterfaceList) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AsyncInterfaceList parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AsyncInterfaceList) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AsyncInterfaceList parseFrom(AbstractC5235o abstractC5235o) {
            return (AsyncInterfaceList) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AsyncInterfaceList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        private AsyncInterfaceList() {
            this.memoizedIsInitialized = (byte) -1;
            this.interfaces_ = Collections.emptyList();
        }

        public static AsyncInterfaceList parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AsyncInterfaceList) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AsyncInterfaceList parseFrom(byte[] bArr) {
            return (AsyncInterfaceList) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static AsyncInterfaceList parseFrom(byte[] bArr, M m8) {
            return (AsyncInterfaceList) PARSER.parseFrom(bArr, m8);
        }

        public static AsyncInterfaceList parseFrom(InputStream inputStream) {
            return (AsyncInterfaceList) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AsyncInterfaceList parseFrom(InputStream inputStream, M m8) {
            return (AsyncInterfaceList) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AsyncInterfaceList parseFrom(r rVar) {
            return (AsyncInterfaceList) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AsyncInterfaceList parseFrom(r rVar, M m8) {
            return (AsyncInterfaceList) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AsyncInterfaceListOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

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

        AsyncInterface getInterfaces(int i8);

        int getInterfacesCount();

        List<AsyncInterface> getInterfacesList();

        AsyncInterfaceOrBuilder getInterfacesOrBuilder(int i8);

        List<? extends AsyncInterfaceOrBuilder> getInterfacesOrBuilderList();

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

    public interface AsyncInterfaceOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

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

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        boolean getStreaming();

        AsyncInterface.OperationType getType();

        int getTypeValue();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class DirectiveState extends AbstractC5209f0 implements DirectiveStateOrBuilder {
        public static final int DISCARDED_COUNT_FIELD_NUMBER = 12;
        public static final int DISCARDED_FIELD_NUMBER = 11;
        public static final int PENDING_COUNT_FIELD_NUMBER = 2;
        public static final int PENDING_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int discardedCount_;
        private boolean discarded_;
        private byte memoizedIsInitialized;
        private int pendingCount_;
        private boolean pending_;
        private static final DirectiveState DEFAULT_INSTANCE = new DirectiveState();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.DirectiveState.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DirectiveState parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DirectiveState.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements DirectiveStateOrBuilder {
            private int bitField0_;
            private int discardedCount_;
            private boolean discarded_;
            private int pendingCount_;
            private boolean pending_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(DirectiveState directiveState) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    directiveState.pending_ = this.pending_;
                }
                if ((i8 & 2) != 0) {
                    directiveState.pendingCount_ = this.pendingCount_;
                }
                if ((i8 & 4) != 0) {
                    directiveState.discarded_ = this.discarded_;
                }
                if ((i8 & 8) != 0) {
                    directiveState.discardedCount_ = this.discardedCount_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_DirectiveState_descriptor;
            }

            public Builder clearDiscarded() {
                this.bitField0_ &= -5;
                this.discarded_ = false;
                onChanged();
                return this;
            }

            public Builder clearDiscardedCount() {
                this.bitField0_ &= -9;
                this.discardedCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPending() {
                this.bitField0_ &= -2;
                this.pending_ = false;
                onChanged();
                return this;
            }

            public Builder clearPendingCount() {
                this.bitField0_ &= -3;
                this.pendingCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_DirectiveState_descriptor;
            }

            @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
            public boolean getDiscarded() {
                return this.discarded_;
            }

            @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
            public int getDiscardedCount() {
                return this.discardedCount_;
            }

            @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
            public boolean getPending() {
                return this.pending_;
            }

            @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
            public int getPendingCount() {
                return this.pendingCount_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_DirectiveState_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveState.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDiscarded(boolean z8) {
                this.discarded_ = z8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDiscardedCount(int i8) {
                this.discardedCount_ = i8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPending(boolean z8) {
                this.pending_ = z8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPendingCount(int i8) {
                this.pendingCount_ = i8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DirectiveState build() {
                DirectiveState directiveStateBuildPartial = buildPartial();
                if (directiveStateBuildPartial.isInitialized()) {
                    return directiveStateBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) directiveStateBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DirectiveState buildPartial() {
                DirectiveState directiveState = new DirectiveState(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(directiveState);
                }
                onBuilt();
                return directiveState;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DirectiveState getDefaultInstanceForType() {
                return DirectiveState.getDefaultInstance();
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

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
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
                this.pending_ = false;
                this.pendingCount_ = 0;
                this.discarded_ = false;
                this.discardedCount_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof DirectiveState) {
                    return mergeFrom((DirectiveState) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(DirectiveState directiveState) {
                if (directiveState == DirectiveState.getDefaultInstance()) {
                    return this;
                }
                if (directiveState.getPending()) {
                    setPending(directiveState.getPending());
                }
                if (directiveState.getPendingCount() != 0) {
                    setPendingCount(directiveState.getPendingCount());
                }
                if (directiveState.getDiscarded()) {
                    setDiscarded(directiveState.getDiscarded());
                }
                if (directiveState.getDiscardedCount() != 0) {
                    setDiscardedCount(directiveState.getDiscardedCount());
                }
                mergeUnknownFields(directiveState.getUnknownFields());
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
                                if (tag == 8) {
                                    this.pending_ = rVar.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.pendingCount_ = rVar.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 88) {
                                    this.discarded_ = rVar.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag != 96) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.discardedCount_ = rVar.readInt32();
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

        /* synthetic */ DirectiveState(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static DirectiveState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_DirectiveState_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DirectiveState parseDelimitedFrom(InputStream inputStream) {
            return (DirectiveState) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DirectiveState parseFrom(ByteBuffer byteBuffer) {
            return (DirectiveState) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectiveState)) {
                return super.equals(obj);
            }
            DirectiveState directiveState = (DirectiveState) obj;
            return getPending() == directiveState.getPending() && getPendingCount() == directiveState.getPendingCount() && getDiscarded() == directiveState.getDiscarded() && getDiscardedCount() == directiveState.getDiscardedCount() && getUnknownFields().equals(directiveState.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
        public boolean getDiscarded() {
            return this.discarded_;
        }

        @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
        public int getDiscardedCount() {
            return this.discardedCount_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
        public boolean getPending() {
            return this.pending_;
        }

        @Override // maum.m2u.map.Map.DirectiveStateOrBuilder
        public int getPendingCount() {
            return this.pendingCount_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            boolean z8 = this.pending_;
            int iComputeBoolSize = z8 ? AbstractC5248t.computeBoolSize(1, z8) : 0;
            int i9 = this.pendingCount_;
            if (i9 != 0) {
                iComputeBoolSize += AbstractC5248t.computeInt32Size(2, i9);
            }
            boolean z9 = this.discarded_;
            if (z9) {
                iComputeBoolSize += AbstractC5248t.computeBoolSize(11, z9);
            }
            int i10 = this.discardedCount_;
            if (i10 != 0) {
                iComputeBoolSize += AbstractC5248t.computeInt32Size(12, i10);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashBoolean(getPending())) * 37) + 2) * 53) + getPendingCount()) * 37) + 11) * 53) + AbstractC5227l0.hashBoolean(getDiscarded())) * 37) + 12) * 53) + getDiscardedCount()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_DirectiveState_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveState.class, Builder.class);
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
            return new DirectiveState();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            boolean z8 = this.pending_;
            if (z8) {
                abstractC5248t.writeBool(1, z8);
            }
            int i8 = this.pendingCount_;
            if (i8 != 0) {
                abstractC5248t.writeInt32(2, i8);
            }
            boolean z9 = this.discarded_;
            if (z9) {
                abstractC5248t.writeBool(11, z9);
            }
            int i9 = this.discardedCount_;
            if (i9 != 0) {
                abstractC5248t.writeInt32(12, i9);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private DirectiveState(AbstractC5209f0.b bVar) {
            super(bVar);
            this.pending_ = false;
            this.pendingCount_ = 0;
            this.discarded_ = false;
            this.discardedCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DirectiveState directiveState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(directiveState);
        }

        public static DirectiveState parseFrom(ByteBuffer byteBuffer, M m8) {
            return (DirectiveState) PARSER.parseFrom(byteBuffer, m8);
        }

        public static DirectiveState parseDelimitedFrom(InputStream inputStream, M m8) {
            return (DirectiveState) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static DirectiveState parseFrom(AbstractC5235o abstractC5235o) {
            return (DirectiveState) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public DirectiveState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static DirectiveState parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (DirectiveState) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DirectiveState parseFrom(byte[] bArr) {
            return (DirectiveState) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static DirectiveState parseFrom(byte[] bArr, M m8) {
            return (DirectiveState) PARSER.parseFrom(bArr, m8);
        }

        public static DirectiveState parseFrom(InputStream inputStream) {
            return (DirectiveState) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private DirectiveState() {
            this.pending_ = false;
            this.pendingCount_ = 0;
            this.discarded_ = false;
            this.discardedCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DirectiveState parseFrom(InputStream inputStream, M m8) {
            return (DirectiveState) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static DirectiveState parseFrom(r rVar) {
            return (DirectiveState) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static DirectiveState parseFrom(r rVar, M m8) {
            return (DirectiveState) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DirectiveStateOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        boolean getDiscarded();

        int getDiscardedCount();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        boolean getPending();

        int getPendingCount();

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

    public static final class DirectiveStream extends AbstractC5209f0 implements DirectiveStreamOrBuilder {
        public static final int BEGIN_AT_FIELD_NUMBER = 100;
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_SYNC_ID_FIELD_NUMBER = 3;
        public static final int PARAM_FIELD_NUMBER = 4;
        public static final int PAYLOAD_FIELD_NUMBER = 99;
        public static final int STREAM_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private w1 beginAt_;
        private int bitField0_;
        private AsyncInterface interface_;
        private byte memoizedIsInitialized;
        private volatile Object operationSyncId_;
        private DirectiveParam param_;
        private C5240p1 payload_;
        private volatile Object streamId_;
        private static final DirectiveStream DEFAULT_INSTANCE = new DirectiveStream();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.DirectiveStream.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DirectiveStream parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DirectiveStream.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements DirectiveStreamOrBuilder {
            private C5228l1 beginAtBuilder_;
            private w1 beginAt_;
            private int bitField0_;
            private C5228l1 interfaceBuilder_;
            private AsyncInterface interface_;
            private Object operationSyncId_;
            private C5228l1 paramBuilder_;
            private DirectiveParam param_;
            private C5228l1 payloadBuilder_;
            private C5240p1 payload_;
            private Object streamId_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(DirectiveStream directiveStream) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.interfaceBuilder_;
                    directiveStream.interface_ = c5228l1 == null ? this.interface_ : (AsyncInterface) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    directiveStream.streamId_ = this.streamId_;
                }
                if ((i9 & 4) != 0) {
                    directiveStream.operationSyncId_ = this.operationSyncId_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.paramBuilder_;
                    directiveStream.param_ = c5228l12 == null ? this.param_ : (DirectiveParam) c5228l12.build();
                    i8 |= 2;
                }
                if ((i9 & 16) != 0) {
                    C5228l1 c5228l13 = this.payloadBuilder_;
                    directiveStream.payload_ = c5228l13 == null ? this.payload_ : (C5240p1) c5228l13.build();
                    i8 |= 4;
                }
                if ((i9 & 32) != 0) {
                    C5228l1 c5228l14 = this.beginAtBuilder_;
                    directiveStream.beginAt_ = c5228l14 == null ? this.beginAt_ : (w1) c5228l14.build();
                    i8 |= 8;
                }
                DirectiveStream.access$10976(directiveStream, i8);
            }

            private C5228l1 getBeginAtFieldBuilder() {
                if (this.beginAtBuilder_ == null) {
                    this.beginAtBuilder_ = new C5228l1(getBeginAt(), getParentForChildren(), isClean());
                    this.beginAt_ = null;
                }
                return this.beginAtBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_DirectiveStream_descriptor;
            }

            private C5228l1 getInterfaceFieldBuilder() {
                if (this.interfaceBuilder_ == null) {
                    this.interfaceBuilder_ = new C5228l1(getInterface(), getParentForChildren(), isClean());
                    this.interface_ = null;
                }
                return this.interfaceBuilder_;
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
                    getInterfaceFieldBuilder();
                    getParamFieldBuilder();
                    getPayloadFieldBuilder();
                    getBeginAtFieldBuilder();
                }
            }

            public Builder clearBeginAt() {
                this.bitField0_ &= -33;
                this.beginAt_ = null;
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.beginAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInterface() {
                this.bitField0_ &= -2;
                this.interface_ = null;
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.interfaceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOperationSyncId() {
                this.operationSyncId_ = DirectiveStream.getDefaultInstance().getOperationSyncId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearParam() {
                this.bitField0_ &= -9;
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
                this.bitField0_ &= -17;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStreamId() {
                this.streamId_ = DirectiveStream.getDefaultInstance().getStreamId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public w1 getBeginAt() {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.beginAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getBeginAtBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (w1.b) getBeginAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public x1 getBeginAtOrBuilder() {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.beginAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_DirectiveStream_descriptor;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public AsyncInterface getInterface() {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    return (AsyncInterface) c5228l1.getMessage();
                }
                AsyncInterface asyncInterface = this.interface_;
                return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
            }

            public AsyncInterface.Builder getInterfaceBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AsyncInterface.Builder) getInterfaceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public AsyncInterfaceOrBuilder getInterfaceOrBuilder() {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    return (AsyncInterfaceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                AsyncInterface asyncInterface = this.interface_;
                return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public String getOperationSyncId() {
                Object obj = this.operationSyncId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operationSyncId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public AbstractC5235o getOperationSyncIdBytes() {
                Object obj = this.operationSyncId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operationSyncId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public DirectiveParam getParam() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (DirectiveParam) c5228l1.getMessage();
                }
                DirectiveParam directiveParam = this.param_;
                return directiveParam == null ? DirectiveParam.getDefaultInstance() : directiveParam;
            }

            public DirectiveParam.Builder getParamBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DirectiveParam.Builder) getParamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public DirectiveParamOrBuilder getParamOrBuilder() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (DirectiveParamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DirectiveParam directiveParam = this.param_;
                return directiveParam == null ? DirectiveParam.getDefaultInstance() : directiveParam;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public C5240p1 getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.payload_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getPayloadBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (C5240p1.b) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public InterfaceC5243q1 getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.payload_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public String getStreamId() {
                Object obj = this.streamId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.streamId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public AbstractC5235o getStreamIdBytes() {
                Object obj = this.streamId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.streamId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public boolean hasBeginAt() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public boolean hasInterface() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_DirectiveStream_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveStream.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBeginAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 32) == 0 || (w1Var2 = this.beginAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.beginAt_ = w1Var;
                } else {
                    getBeginAtBuilder().mergeFrom(w1Var);
                }
                if (this.beginAt_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeInterface(AsyncInterface asyncInterface) {
                AsyncInterface asyncInterface2;
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(asyncInterface);
                } else if ((this.bitField0_ & 1) == 0 || (asyncInterface2 = this.interface_) == null || asyncInterface2 == AsyncInterface.getDefaultInstance()) {
                    this.interface_ = asyncInterface;
                } else {
                    getInterfaceBuilder().mergeFrom(asyncInterface);
                }
                if (this.interface_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeParam(DirectiveParam directiveParam) {
                DirectiveParam directiveParam2;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(directiveParam);
                } else if ((this.bitField0_ & 8) == 0 || (directiveParam2 = this.param_) == null || directiveParam2 == DirectiveParam.getDefaultInstance()) {
                    this.param_ = directiveParam;
                } else {
                    getParamBuilder().mergeFrom(directiveParam);
                }
                if (this.param_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 16) == 0 || (c5240p12 = this.payload_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.payload_ = c5240p1;
                } else {
                    getPayloadBuilder().mergeFrom(c5240p1);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setBeginAt(w1 w1Var) {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.beginAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setInterface(AsyncInterface asyncInterface) {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 == null) {
                    asyncInterface.getClass();
                    this.interface_ = asyncInterface;
                } else {
                    c5228l1.setMessage(asyncInterface);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperationSyncId(String str) {
                str.getClass();
                this.operationSyncId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOperationSyncIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operationSyncId_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setParam(DirectiveParam directiveParam) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    directiveParam.getClass();
                    this.param_ = directiveParam;
                } else {
                    c5228l1.setMessage(directiveParam);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPayload(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.payload_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStreamIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.streamId_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.streamId_ = "";
                this.operationSyncId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DirectiveStream build() {
                DirectiveStream directiveStreamBuildPartial = buildPartial();
                if (directiveStreamBuildPartial.isInitialized()) {
                    return directiveStreamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) directiveStreamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DirectiveStream buildPartial() {
                DirectiveStream directiveStream = new DirectiveStream(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(directiveStream);
                }
                onBuilt();
                return directiveStream;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DirectiveStream getDefaultInstanceForType() {
                return DirectiveStream.getDefaultInstance();
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
                this.interface_ = null;
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.interfaceBuilder_ = null;
                }
                this.streamId_ = "";
                this.operationSyncId_ = "";
                this.param_ = null;
                C5228l1 c5228l12 = this.paramBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.paramBuilder_ = null;
                }
                this.payload_ = null;
                C5228l1 c5228l13 = this.payloadBuilder_;
                if (c5228l13 != null) {
                    c5228l13.dispose();
                    this.payloadBuilder_ = null;
                }
                this.beginAt_ = null;
                C5228l1 c5228l14 = this.beginAtBuilder_;
                if (c5228l14 != null) {
                    c5228l14.dispose();
                    this.beginAtBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.streamId_ = "";
                this.operationSyncId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof DirectiveStream) {
                    return mergeFrom((DirectiveStream) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setBeginAt(w1.b bVar) {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 == null) {
                    this.beginAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setInterface(AsyncInterface.Builder builder) {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 == null) {
                    this.interface_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setParam(DirectiveParam.Builder builder) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    this.param_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPayload(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder mergeFrom(DirectiveStream directiveStream) {
                if (directiveStream == DirectiveStream.getDefaultInstance()) {
                    return this;
                }
                if (directiveStream.hasInterface()) {
                    mergeInterface(directiveStream.getInterface());
                }
                if (!directiveStream.getStreamId().isEmpty()) {
                    this.streamId_ = directiveStream.streamId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!directiveStream.getOperationSyncId().isEmpty()) {
                    this.operationSyncId_ = directiveStream.operationSyncId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (directiveStream.hasParam()) {
                    mergeParam(directiveStream.getParam());
                }
                if (directiveStream.hasPayload()) {
                    mergePayload(directiveStream.getPayload());
                }
                if (directiveStream.hasBeginAt()) {
                    mergeBeginAt(directiveStream.getBeginAt());
                }
                mergeUnknownFields(directiveStream.getUnknownFields());
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
                                    rVar.readMessage(getInterfaceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.streamId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.operationSyncId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                } else if (tag == 794) {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 16;
                                } else if (tag != 802) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getBeginAtFieldBuilder().getBuilder(), m8);
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

        public static final class DirectiveParam extends AbstractC5209f0 implements DirectiveParamOrBuilder {
            public static final int DA_FORWARD_PARAM_FIELD_NUMBER = 1;
            public static final int EMPTY_PARAM_FIELD_NUMBER = 1000;
            public static final int SPEECH_SYNTHESIZER_PARAM_FIELD_NUMBER = 2;
            public static final int VIDEO_PARAM_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int testParamCase_;
            private Object testParam_;
            private static final DirectiveParam DEFAULT_INSTANCE = new DirectiveParam();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.DirectiveStream.DirectiveParam.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public DirectiveParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = DirectiveParam.newBuilder();
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

            public static final class Builder extends AbstractC5209f0.b implements DirectiveParamOrBuilder {
                private int bitField0_;
                private C5228l1 daForwardParamBuilder_;
                private C5228l1 emptyParamBuilder_;
                private C5228l1 speechSynthesizerParamBuilder_;
                private int testParamCase_;
                private Object testParam_;
                private C5228l1 videoParamBuilder_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(DirectiveParam directiveParam) {
                }

                private void buildPartialOneofs(DirectiveParam directiveParam) {
                    C5228l1 c5228l1;
                    C5228l1 c5228l12;
                    C5228l1 c5228l13;
                    C5228l1 c5228l14;
                    directiveParam.testParamCase_ = this.testParamCase_;
                    directiveParam.testParam_ = this.testParam_;
                    if (this.testParamCase_ == 1 && (c5228l14 = this.daForwardParamBuilder_) != null) {
                        directiveParam.testParam_ = c5228l14.build();
                    }
                    if (this.testParamCase_ == 2 && (c5228l13 = this.speechSynthesizerParamBuilder_) != null) {
                        directiveParam.testParam_ = c5228l13.build();
                    }
                    if (this.testParamCase_ == 3 && (c5228l12 = this.videoParamBuilder_) != null) {
                        directiveParam.testParam_ = c5228l12.build();
                    }
                    if (this.testParamCase_ != 1000 || (c5228l1 = this.emptyParamBuilder_) == null) {
                        return;
                    }
                    directiveParam.testParam_ = c5228l1.build();
                }

                private C5228l1 getDaForwardParamFieldBuilder() {
                    if (this.daForwardParamBuilder_ == null) {
                        if (this.testParamCase_ != 1) {
                            this.testParam_ = EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
                        }
                        this.daForwardParamBuilder_ = new C5228l1((EventOuterClass.DialogAgentForwarderParam) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 1;
                    onChanged();
                    return this.daForwardParamBuilder_;
                }

                public static final C5269x.b getDescriptor() {
                    return Map.internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_descriptor;
                }

                private C5228l1 getEmptyParamFieldBuilder() {
                    if (this.emptyParamBuilder_ == null) {
                        if (this.testParamCase_ != 1000) {
                            this.testParam_ = F.getDefaultInstance();
                        }
                        this.emptyParamBuilder_ = new C5228l1((F) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 1000;
                    onChanged();
                    return this.emptyParamBuilder_;
                }

                private C5228l1 getSpeechSynthesizerParamFieldBuilder() {
                    if (this.speechSynthesizerParamBuilder_ == null) {
                        if (this.testParamCase_ != 2) {
                            this.testParam_ = a.b.getDefaultInstance();
                        }
                        this.speechSynthesizerParamBuilder_ = new C5228l1((a.b) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 2;
                    onChanged();
                    return this.speechSynthesizerParamBuilder_;
                }

                private C5228l1 getVideoParamFieldBuilder() {
                    if (this.videoParamBuilder_ == null) {
                        if (this.testParamCase_ != 3) {
                            this.testParam_ = VideoParam.getDefaultInstance();
                        }
                        this.videoParamBuilder_ = new C5228l1((VideoParam) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 3;
                    onChanged();
                    return this.videoParamBuilder_;
                }

                public Builder clearDaForwardParam() {
                    C5228l1 c5228l1 = this.daForwardParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 1) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 1) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearEmptyParam() {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 1000) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 1000) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearSpeechSynthesizerParam() {
                    C5228l1 c5228l1 = this.speechSynthesizerParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 2) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 2) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearTestParam() {
                    this.testParamCase_ = 0;
                    this.testParam_ = null;
                    onChanged();
                    return this;
                }

                public Builder clearVideoParam() {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 3) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 3) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public EventOuterClass.DialogAgentForwarderParam getDaForwardParam() {
                    C5228l1 c5228l1 = this.daForwardParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 1 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : this.testParamCase_ == 1 ? (EventOuterClass.DialogAgentForwarderParam) c5228l1.getMessage() : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
                }

                public EventOuterClass.DialogAgentForwarderParam.Builder getDaForwardParamBuilder() {
                    return (EventOuterClass.DialogAgentForwarderParam.Builder) getDaForwardParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public EventOuterClass.DialogAgentForwarderParamOrBuilder getDaForwardParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 1 || (c5228l1 = this.daForwardParamBuilder_) == null) ? i8 == 1 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : (EventOuterClass.DialogAgentForwarderParamOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return Map.internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_descriptor;
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public F getEmptyParam() {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 1000 ? (F) this.testParam_ : F.getDefaultInstance() : this.testParamCase_ == 1000 ? (F) c5228l1.getMessage() : F.getDefaultInstance();
                }

                public F.b getEmptyParamBuilder() {
                    return (F.b) getEmptyParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public G getEmptyParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 1000 || (c5228l1 = this.emptyParamBuilder_) == null) ? i8 == 1000 ? (F) this.testParam_ : F.getDefaultInstance() : (G) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public a.b getSpeechSynthesizerParam() {
                    C5228l1 c5228l1 = this.speechSynthesizerParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 2 ? (a.b) this.testParam_ : a.b.getDefaultInstance() : this.testParamCase_ == 2 ? (a.b) c5228l1.getMessage() : a.b.getDefaultInstance();
                }

                public a.b.C0007b getSpeechSynthesizerParamBuilder() {
                    return (a.b.C0007b) getSpeechSynthesizerParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public a.c getSpeechSynthesizerParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 2 || (c5228l1 = this.speechSynthesizerParamBuilder_) == null) ? i8 == 2 ? (a.b) this.testParam_ : a.b.getDefaultInstance() : (a.c) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public TestParamCase getTestParamCase() {
                    return TestParamCase.forNumber(this.testParamCase_);
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public VideoParam getVideoParam() {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance() : this.testParamCase_ == 3 ? (VideoParam) c5228l1.getMessage() : VideoParam.getDefaultInstance();
                }

                public VideoParam.Builder getVideoParamBuilder() {
                    return (VideoParam.Builder) getVideoParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public VideoParamOrBuilder getVideoParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 3 || (c5228l1 = this.videoParamBuilder_) == null) ? i8 == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance() : (VideoParamOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public boolean hasDaForwardParam() {
                    return this.testParamCase_ == 1;
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public boolean hasEmptyParam() {
                    return this.testParamCase_ == 1000;
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public boolean hasSpeechSynthesizerParam() {
                    return this.testParamCase_ == 2;
                }

                @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
                public boolean hasVideoParam() {
                    return this.testParamCase_ == 3;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return Map.internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveParam.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeDaForwardParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                    C5228l1 c5228l1 = this.daForwardParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 1 || this.testParam_ == EventOuterClass.DialogAgentForwarderParam.getDefaultInstance()) {
                            this.testParam_ = dialogAgentForwarderParam;
                        } else {
                            this.testParam_ = EventOuterClass.DialogAgentForwarderParam.newBuilder((EventOuterClass.DialogAgentForwarderParam) this.testParam_).mergeFrom(dialogAgentForwarderParam).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 1) {
                        c5228l1.mergeFrom(dialogAgentForwarderParam);
                    } else {
                        c5228l1.setMessage(dialogAgentForwarderParam);
                    }
                    this.testParamCase_ = 1;
                    return this;
                }

                public Builder mergeEmptyParam(F f8) {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 1000 || this.testParam_ == F.getDefaultInstance()) {
                            this.testParam_ = f8;
                        } else {
                            this.testParam_ = F.newBuilder((F) this.testParam_).mergeFrom(f8).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 1000) {
                        c5228l1.mergeFrom(f8);
                    } else {
                        c5228l1.setMessage(f8);
                    }
                    this.testParamCase_ = 1000;
                    return this;
                }

                public Builder mergeSpeechSynthesizerParam(a.b bVar) {
                    C5228l1 c5228l1 = this.speechSynthesizerParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 2 || this.testParam_ == a.b.getDefaultInstance()) {
                            this.testParam_ = bVar;
                        } else {
                            this.testParam_ = a.b.newBuilder((a.b) this.testParam_).mergeFrom(bVar).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 2) {
                        c5228l1.mergeFrom(bVar);
                    } else {
                        c5228l1.setMessage(bVar);
                    }
                    this.testParamCase_ = 2;
                    return this;
                }

                public Builder mergeVideoParam(VideoParam videoParam) {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 3 || this.testParam_ == VideoParam.getDefaultInstance()) {
                            this.testParam_ = videoParam;
                        } else {
                            this.testParam_ = VideoParam.newBuilder((VideoParam) this.testParam_).mergeFrom(videoParam).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 3) {
                        c5228l1.mergeFrom(videoParam);
                    } else {
                        c5228l1.setMessage(videoParam);
                    }
                    this.testParamCase_ = 3;
                    return this;
                }

                public Builder setDaForwardParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                    C5228l1 c5228l1 = this.daForwardParamBuilder_;
                    if (c5228l1 == null) {
                        dialogAgentForwarderParam.getClass();
                        this.testParam_ = dialogAgentForwarderParam;
                        onChanged();
                    } else {
                        c5228l1.setMessage(dialogAgentForwarderParam);
                    }
                    this.testParamCase_ = 1;
                    return this;
                }

                public Builder setEmptyParam(F f8) {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 == null) {
                        f8.getClass();
                        this.testParam_ = f8;
                        onChanged();
                    } else {
                        c5228l1.setMessage(f8);
                    }
                    this.testParamCase_ = 1000;
                    return this;
                }

                public Builder setSpeechSynthesizerParam(a.b bVar) {
                    C5228l1 c5228l1 = this.speechSynthesizerParamBuilder_;
                    if (c5228l1 == null) {
                        bVar.getClass();
                        this.testParam_ = bVar;
                        onChanged();
                    } else {
                        c5228l1.setMessage(bVar);
                    }
                    this.testParamCase_ = 2;
                    return this;
                }

                public Builder setVideoParam(VideoParam videoParam) {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 == null) {
                        videoParam.getClass();
                        this.testParam_ = videoParam;
                        onChanged();
                    } else {
                        c5228l1.setMessage(videoParam);
                    }
                    this.testParamCase_ = 3;
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.testParamCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DirectiveParam build() {
                    DirectiveParam directiveParamBuildPartial = buildPartial();
                    if (directiveParamBuildPartial.isInitialized()) {
                        return directiveParamBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) directiveParamBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public DirectiveParam buildPartial() {
                    DirectiveParam directiveParam = new DirectiveParam(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(directiveParam);
                    }
                    buildPartialOneofs(directiveParam);
                    onBuilt();
                    return directiveParam;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public DirectiveParam getDefaultInstanceForType() {
                    return DirectiveParam.getDefaultInstance();
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
                    this.testParamCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    C5228l1 c5228l1 = this.daForwardParamBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.clear();
                    }
                    C5228l1 c5228l12 = this.speechSynthesizerParamBuilder_;
                    if (c5228l12 != null) {
                        c5228l12.clear();
                    }
                    C5228l1 c5228l13 = this.videoParamBuilder_;
                    if (c5228l13 != null) {
                        c5228l13.clear();
                    }
                    C5228l1 c5228l14 = this.emptyParamBuilder_;
                    if (c5228l14 != null) {
                        c5228l14.clear();
                    }
                    this.testParamCase_ = 0;
                    this.testParam_ = null;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof DirectiveParam) {
                        return mergeFrom((DirectiveParam) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setDaForwardParam(EventOuterClass.DialogAgentForwarderParam.Builder builder) {
                    C5228l1 c5228l1 = this.daForwardParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testParamCase_ = 1;
                    return this;
                }

                public Builder setEmptyParam(F.b bVar) {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = bVar.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.testParamCase_ = 1000;
                    return this;
                }

                public Builder setSpeechSynthesizerParam(a.b.C0007b c0007b) {
                    C5228l1 c5228l1 = this.speechSynthesizerParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = c0007b.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(c0007b.build());
                    }
                    this.testParamCase_ = 2;
                    return this;
                }

                public Builder setVideoParam(VideoParam.Builder builder) {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testParamCase_ = 3;
                    return this;
                }

                public Builder mergeFrom(DirectiveParam directiveParam) {
                    if (directiveParam == DirectiveParam.getDefaultInstance()) {
                        return this;
                    }
                    int i8 = AnonymousClass1.$SwitchMap$maum$m2u$map$Map$DirectiveStream$DirectiveParam$TestParamCase[directiveParam.getTestParamCase().ordinal()];
                    if (i8 == 1) {
                        mergeDaForwardParam(directiveParam.getDaForwardParam());
                    } else if (i8 == 2) {
                        mergeSpeechSynthesizerParam(directiveParam.getSpeechSynthesizerParam());
                    } else if (i8 == 3) {
                        mergeVideoParam(directiveParam.getVideoParam());
                    } else if (i8 == 4) {
                        mergeEmptyParam(directiveParam.getEmptyParam());
                    }
                    mergeUnknownFields(directiveParam.getUnknownFields());
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
                                        rVar.readMessage(getDaForwardParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 1;
                                    } else if (tag == 18) {
                                        rVar.readMessage(getSpeechSynthesizerParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 2;
                                    } else if (tag == 26) {
                                        rVar.readMessage(getVideoParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 3;
                                    } else if (tag != 8002) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getEmptyParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 1000;
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

            public enum TestParamCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
                DA_FORWARD_PARAM(1),
                SPEECH_SYNTHESIZER_PARAM(2),
                VIDEO_PARAM(3),
                EMPTY_PARAM(1000),
                TESTPARAM_NOT_SET(0);

                private final int value;

                TestParamCase(int i8) {
                    this.value = i8;
                }

                public static TestParamCase forNumber(int i8) {
                    if (i8 == 0) {
                        return TESTPARAM_NOT_SET;
                    }
                    if (i8 == 1) {
                        return DA_FORWARD_PARAM;
                    }
                    if (i8 == 2) {
                        return SPEECH_SYNTHESIZER_PARAM;
                    }
                    if (i8 == 3) {
                        return VIDEO_PARAM;
                    }
                    if (i8 != 1000) {
                        return null;
                    }
                    return EMPTY_PARAM;
                }

                @Override // com.google.protobuf.AbstractC5227l0.c
                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static TestParamCase valueOf(int i8) {
                    return forNumber(i8);
                }
            }

            /* synthetic */ DirectiveParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static DirectiveParam getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DirectiveParam parseDelimitedFrom(InputStream inputStream) {
                return (DirectiveParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DirectiveParam parseFrom(ByteBuffer byteBuffer) {
                return (DirectiveParam) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectiveParam)) {
                    return super.equals(obj);
                }
                DirectiveParam directiveParam = (DirectiveParam) obj;
                if (!getTestParamCase().equals(directiveParam.getTestParamCase())) {
                    return false;
                }
                int i8 = this.testParamCase_;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 1000 && !getEmptyParam().equals(directiveParam.getEmptyParam())) {
                                return false;
                            }
                        } else if (!getVideoParam().equals(directiveParam.getVideoParam())) {
                            return false;
                        }
                    } else if (!getSpeechSynthesizerParam().equals(directiveParam.getSpeechSynthesizerParam())) {
                        return false;
                    }
                } else if (!getDaForwardParam().equals(directiveParam.getDaForwardParam())) {
                    return false;
                }
                return getUnknownFields().equals(directiveParam.getUnknownFields());
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public EventOuterClass.DialogAgentForwarderParam getDaForwardParam() {
                return this.testParamCase_ == 1 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public EventOuterClass.DialogAgentForwarderParamOrBuilder getDaForwardParamOrBuilder() {
                return this.testParamCase_ == 1 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public F getEmptyParam() {
                return this.testParamCase_ == 1000 ? (F) this.testParam_ : F.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public G getEmptyParamOrBuilder() {
                return this.testParamCase_ == 1000 ? (F) this.testParam_ : F.getDefaultInstance();
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
                int iComputeMessageSize = this.testParamCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (EventOuterClass.DialogAgentForwarderParam) this.testParam_) : 0;
                if (this.testParamCase_ == 2) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (a.b) this.testParam_);
                }
                if (this.testParamCase_ == 3) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(3, (VideoParam) this.testParam_);
                }
                if (this.testParamCase_ == 1000) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(1000, (F) this.testParam_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public a.b getSpeechSynthesizerParam() {
                return this.testParamCase_ == 2 ? (a.b) this.testParam_ : a.b.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public a.c getSpeechSynthesizerParamOrBuilder() {
                return this.testParamCase_ == 2 ? (a.b) this.testParam_ : a.b.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public TestParamCase getTestParamCase() {
                return TestParamCase.forNumber(this.testParamCase_);
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public VideoParam getVideoParam() {
                return this.testParamCase_ == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public VideoParamOrBuilder getVideoParamOrBuilder() {
                return this.testParamCase_ == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public boolean hasDaForwardParam() {
                return this.testParamCase_ == 1;
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public boolean hasEmptyParam() {
                return this.testParamCase_ == 1000;
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public boolean hasSpeechSynthesizerParam() {
                return this.testParamCase_ == 2;
            }

            @Override // maum.m2u.map.Map.DirectiveStream.DirectiveParamOrBuilder
            public boolean hasVideoParam() {
                return this.testParamCase_ == 3;
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
                int i10 = this.testParamCase_;
                if (i10 == 1) {
                    i8 = ((iHashCode2 * 37) + 1) * 53;
                    iHashCode = getDaForwardParam().hashCode();
                } else if (i10 == 2) {
                    i8 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getSpeechSynthesizerParam().hashCode();
                } else {
                    if (i10 != 3) {
                        if (i10 == 1000) {
                            i8 = ((iHashCode2 * 37) + 1000) * 53;
                            iHashCode = getEmptyParam().hashCode();
                        }
                        int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                        this.memoizedHashCode = iHashCode3;
                        return iHashCode3;
                    }
                    i8 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getVideoParam().hashCode();
                }
                iHashCode2 = i8 + iHashCode;
                int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode32;
                return iHashCode32;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveParam.class, Builder.class);
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
                return new DirectiveParam();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (this.testParamCase_ == 1) {
                    abstractC5248t.writeMessage(1, (EventOuterClass.DialogAgentForwarderParam) this.testParam_);
                }
                if (this.testParamCase_ == 2) {
                    abstractC5248t.writeMessage(2, (a.b) this.testParam_);
                }
                if (this.testParamCase_ == 3) {
                    abstractC5248t.writeMessage(3, (VideoParam) this.testParam_);
                }
                if (this.testParamCase_ == 1000) {
                    abstractC5248t.writeMessage(1000, (F) this.testParam_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private DirectiveParam(AbstractC5209f0.b bVar) {
                super(bVar);
                this.testParamCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(DirectiveParam directiveParam) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(directiveParam);
            }

            public static DirectiveParam parseFrom(ByteBuffer byteBuffer, M m8) {
                return (DirectiveParam) PARSER.parseFrom(byteBuffer, m8);
            }

            public static DirectiveParam parseDelimitedFrom(InputStream inputStream, M m8) {
                return (DirectiveParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static DirectiveParam parseFrom(AbstractC5235o abstractC5235o) {
                return (DirectiveParam) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DirectiveParam getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static DirectiveParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (DirectiveParam) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DirectiveParam() {
                this.testParamCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DirectiveParam parseFrom(byte[] bArr) {
                return (DirectiveParam) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static DirectiveParam parseFrom(byte[] bArr, M m8) {
                return (DirectiveParam) PARSER.parseFrom(bArr, m8);
            }

            public static DirectiveParam parseFrom(InputStream inputStream) {
                return (DirectiveParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static DirectiveParam parseFrom(InputStream inputStream, M m8) {
                return (DirectiveParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static DirectiveParam parseFrom(r rVar) {
                return (DirectiveParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static DirectiveParam parseFrom(r rVar, M m8) {
                return (DirectiveParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface DirectiveParamOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ java.util.Map getAllFields();

            EventOuterClass.DialogAgentForwarderParam getDaForwardParam();

            EventOuterClass.DialogAgentForwarderParamOrBuilder getDaForwardParamOrBuilder();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            F getEmptyParam();

            G getEmptyParamOrBuilder();

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

            a.b getSpeechSynthesizerParam();

            a.c getSpeechSynthesizerParamOrBuilder();

            DirectiveParam.TestParamCase getTestParamCase();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            VideoParam getVideoParam();

            VideoParamOrBuilder getVideoParamOrBuilder();

            boolean hasDaForwardParam();

            boolean hasEmptyParam();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            boolean hasSpeechSynthesizerParam();

            boolean hasVideoParam();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ DirectiveStream(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$10976(DirectiveStream directiveStream, int i8) {
            int i9 = i8 | directiveStream.bitField0_;
            directiveStream.bitField0_ = i9;
            return i9;
        }

        public static DirectiveStream getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_DirectiveStream_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DirectiveStream parseDelimitedFrom(InputStream inputStream) {
            return (DirectiveStream) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DirectiveStream parseFrom(ByteBuffer byteBuffer) {
            return (DirectiveStream) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectiveStream)) {
                return super.equals(obj);
            }
            DirectiveStream directiveStream = (DirectiveStream) obj;
            if (hasInterface() != directiveStream.hasInterface()) {
                return false;
            }
            if ((hasInterface() && !getInterface().equals(directiveStream.getInterface())) || !getStreamId().equals(directiveStream.getStreamId()) || !getOperationSyncId().equals(directiveStream.getOperationSyncId()) || hasParam() != directiveStream.hasParam()) {
                return false;
            }
            if ((hasParam() && !getParam().equals(directiveStream.getParam())) || hasPayload() != directiveStream.hasPayload()) {
                return false;
            }
            if ((!hasPayload() || getPayload().equals(directiveStream.getPayload())) && hasBeginAt() == directiveStream.hasBeginAt()) {
                return (!hasBeginAt() || getBeginAt().equals(directiveStream.getBeginAt())) && getUnknownFields().equals(directiveStream.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public w1 getBeginAt() {
            w1 w1Var = this.beginAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public x1 getBeginAtOrBuilder() {
            w1 w1Var = this.beginAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public AsyncInterface getInterface() {
            AsyncInterface asyncInterface = this.interface_;
            return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public AsyncInterfaceOrBuilder getInterfaceOrBuilder() {
            AsyncInterface asyncInterface = this.interface_;
            return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public String getOperationSyncId() {
            Object obj = this.operationSyncId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operationSyncId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public AbstractC5235o getOperationSyncIdBytes() {
            Object obj = this.operationSyncId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operationSyncId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public DirectiveParam getParam() {
            DirectiveParam directiveParam = this.param_;
            return directiveParam == null ? DirectiveParam.getDefaultInstance() : directiveParam;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public DirectiveParamOrBuilder getParamOrBuilder() {
            DirectiveParam directiveParam = this.param_;
            return directiveParam == null ? DirectiveParam.getDefaultInstance() : directiveParam;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public C5240p1 getPayload() {
            C5240p1 c5240p1 = this.payload_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public InterfaceC5243q1 getPayloadOrBuilder() {
            C5240p1 c5240p1 = this.payload_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getInterface()) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(2, this.streamId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operationSyncId_)) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(3, this.operationSyncId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(4, getParam());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(99, getPayload());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(100, getBeginAt());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public String getStreamId() {
            Object obj = this.streamId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.streamId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public AbstractC5235o getStreamIdBytes() {
            Object obj = this.streamId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.streamId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public boolean hasBeginAt() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public boolean hasInterface() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public boolean hasParam() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // maum.m2u.map.Map.DirectiveStreamOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasInterface()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInterface().hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 2) * 53) + getStreamId().hashCode()) * 37) + 3) * 53) + getOperationSyncId().hashCode();
            if (hasParam()) {
                iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getParam().hashCode();
            }
            if (hasPayload()) {
                iHashCode2 = (((iHashCode2 * 37) + 99) * 53) + getPayload().hashCode();
            }
            if (hasBeginAt()) {
                iHashCode2 = (((iHashCode2 * 37) + 100) * 53) + getBeginAt().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_DirectiveStream_fieldAccessorTable.ensureFieldAccessorsInitialized(DirectiveStream.class, Builder.class);
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
            return new DirectiveStream();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getInterface());
            }
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.streamId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operationSyncId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.operationSyncId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(4, getParam());
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC5248t.writeMessage(99, getPayload());
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC5248t.writeMessage(100, getBeginAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private DirectiveStream(AbstractC5209f0.b bVar) {
            super(bVar);
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DirectiveStream directiveStream) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(directiveStream);
        }

        public static DirectiveStream parseFrom(ByteBuffer byteBuffer, M m8) {
            return (DirectiveStream) PARSER.parseFrom(byteBuffer, m8);
        }

        public static DirectiveStream parseDelimitedFrom(InputStream inputStream, M m8) {
            return (DirectiveStream) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static DirectiveStream parseFrom(AbstractC5235o abstractC5235o) {
            return (DirectiveStream) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public DirectiveStream getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static DirectiveStream parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (DirectiveStream) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DirectiveStream parseFrom(byte[] bArr) {
            return (DirectiveStream) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private DirectiveStream() {
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.streamId_ = "";
            this.operationSyncId_ = "";
        }

        public static DirectiveStream parseFrom(byte[] bArr, M m8) {
            return (DirectiveStream) PARSER.parseFrom(bArr, m8);
        }

        public static DirectiveStream parseFrom(InputStream inputStream) {
            return (DirectiveStream) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static DirectiveStream parseFrom(InputStream inputStream, M m8) {
            return (DirectiveStream) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static DirectiveStream parseFrom(r rVar) {
            return (DirectiveStream) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static DirectiveStream parseFrom(r rVar, M m8) {
            return (DirectiveStream) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DirectiveStreamOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        w1 getBeginAt();

        x1 getBeginAtOrBuilder();

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

        AsyncInterface getInterface();

        AsyncInterfaceOrBuilder getInterfaceOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperationSyncId();

        AbstractC5235o getOperationSyncIdBytes();

        DirectiveStream.DirectiveParam getParam();

        DirectiveStream.DirectiveParamOrBuilder getParamOrBuilder();

        C5240p1 getPayload();

        InterfaceC5243q1 getPayloadOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getStreamId();

        AbstractC5235o getStreamIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasBeginAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasInterface();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasParam();

        boolean hasPayload();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class EventStream extends AbstractC5209f0 implements EventStreamOrBuilder {
        public static final int BEGIN_AT_FIELD_NUMBER = 100;
        public static final int CONTEXTS_FIELD_NUMBER = 11;
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_SYNC_ID_FIELD_NUMBER = 3;
        public static final int PARAM_FIELD_NUMBER = 12;
        public static final int PAYLOAD_FIELD_NUMBER = 99;
        public static final int STREAM_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private w1 beginAt_;
        private int bitField0_;
        private List<EventContext> contexts_;
        private AsyncInterface interface_;
        private byte memoizedIsInitialized;
        private volatile Object operationSyncId_;
        private EventParam param_;
        private C5240p1 payload_;
        private volatile Object streamId_;
        private static final EventStream DEFAULT_INSTANCE = new EventStream();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.EventStream.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public EventStream parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = EventStream.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements EventStreamOrBuilder {
            private C5228l1 beginAtBuilder_;
            private w1 beginAt_;
            private int bitField0_;
            private C5213g1 contextsBuilder_;
            private List<EventContext> contexts_;
            private C5228l1 interfaceBuilder_;
            private AsyncInterface interface_;
            private Object operationSyncId_;
            private C5228l1 paramBuilder_;
            private EventParam param_;
            private C5228l1 payloadBuilder_;
            private C5240p1 payload_;
            private Object streamId_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(EventStream eventStream) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.interfaceBuilder_;
                    eventStream.interface_ = c5228l1 == null ? this.interface_ : (AsyncInterface) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    eventStream.streamId_ = this.streamId_;
                }
                if ((i9 & 4) != 0) {
                    eventStream.operationSyncId_ = this.operationSyncId_;
                }
                if ((i9 & 16) != 0) {
                    C5228l1 c5228l12 = this.paramBuilder_;
                    eventStream.param_ = c5228l12 == null ? this.param_ : (EventParam) c5228l12.build();
                    i8 |= 2;
                }
                if ((i9 & 32) != 0) {
                    C5228l1 c5228l13 = this.payloadBuilder_;
                    eventStream.payload_ = c5228l13 == null ? this.payload_ : (C5240p1) c5228l13.build();
                    i8 |= 4;
                }
                if ((i9 & 64) != 0) {
                    C5228l1 c5228l14 = this.beginAtBuilder_;
                    eventStream.beginAt_ = c5228l14 == null ? this.beginAt_ : (w1) c5228l14.build();
                    i8 |= 8;
                }
                EventStream.access$7876(eventStream, i8);
            }

            private void buildPartialRepeatedFields(EventStream eventStream) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 != null) {
                    eventStream.contexts_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.contexts_ = Collections.unmodifiableList(this.contexts_);
                    this.bitField0_ &= -9;
                }
                eventStream.contexts_ = this.contexts_;
            }

            private void ensureContextsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.contexts_ = new ArrayList(this.contexts_);
                    this.bitField0_ |= 8;
                }
            }

            private C5228l1 getBeginAtFieldBuilder() {
                if (this.beginAtBuilder_ == null) {
                    this.beginAtBuilder_ = new C5228l1(getBeginAt(), getParentForChildren(), isClean());
                    this.beginAt_ = null;
                }
                return this.beginAtBuilder_;
            }

            private C5213g1 getContextsFieldBuilder() {
                if (this.contextsBuilder_ == null) {
                    this.contextsBuilder_ = new C5213g1(this.contexts_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.contexts_ = null;
                }
                return this.contextsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_EventStream_descriptor;
            }

            private C5228l1 getInterfaceFieldBuilder() {
                if (this.interfaceBuilder_ == null) {
                    this.interfaceBuilder_ = new C5228l1(getInterface(), getParentForChildren(), isClean());
                    this.interface_ = null;
                }
                return this.interfaceBuilder_;
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
                    getInterfaceFieldBuilder();
                    getContextsFieldBuilder();
                    getParamFieldBuilder();
                    getPayloadFieldBuilder();
                    getBeginAtFieldBuilder();
                }
            }

            public Builder addAllContexts(Iterable<? extends EventContext> iterable) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    ensureContextsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.contexts_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addContexts(EventContext eventContext) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    eventContext.getClass();
                    ensureContextsIsMutable();
                    this.contexts_.add(eventContext);
                    onChanged();
                } else {
                    c5213g1.addMessage(eventContext);
                }
                return this;
            }

            public EventContext.Builder addContextsBuilder() {
                return (EventContext.Builder) getContextsFieldBuilder().addBuilder(EventContext.getDefaultInstance());
            }

            public Builder clearBeginAt() {
                this.bitField0_ &= -65;
                this.beginAt_ = null;
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.beginAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearContexts() {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    this.contexts_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearInterface() {
                this.bitField0_ &= -2;
                this.interface_ = null;
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.interfaceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOperationSyncId() {
                this.operationSyncId_ = EventStream.getDefaultInstance().getOperationSyncId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearParam() {
                this.bitField0_ &= -17;
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
                this.bitField0_ &= -33;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStreamId() {
                this.streamId_ = EventStream.getDefaultInstance().getStreamId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public w1 getBeginAt() {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.beginAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getBeginAtBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (w1.b) getBeginAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public x1 getBeginAtOrBuilder() {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.beginAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public EventContext getContexts(int i8) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                return c5213g1 == null ? this.contexts_.get(i8) : (EventContext) c5213g1.getMessage(i8);
            }

            public EventContext.Builder getContextsBuilder(int i8) {
                return (EventContext.Builder) getContextsFieldBuilder().getBuilder(i8);
            }

            public List<EventContext.Builder> getContextsBuilderList() {
                return getContextsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public int getContextsCount() {
                C5213g1 c5213g1 = this.contextsBuilder_;
                return c5213g1 == null ? this.contexts_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public List<EventContext> getContextsList() {
                C5213g1 c5213g1 = this.contextsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.contexts_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public EventContextOrBuilder getContextsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                return c5213g1 == null ? this.contexts_.get(i8) : (EventContextOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public List<? extends EventContextOrBuilder> getContextsOrBuilderList() {
                C5213g1 c5213g1 = this.contextsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.contexts_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_EventStream_descriptor;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public AsyncInterface getInterface() {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    return (AsyncInterface) c5228l1.getMessage();
                }
                AsyncInterface asyncInterface = this.interface_;
                return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
            }

            public AsyncInterface.Builder getInterfaceBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AsyncInterface.Builder) getInterfaceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public AsyncInterfaceOrBuilder getInterfaceOrBuilder() {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    return (AsyncInterfaceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                AsyncInterface asyncInterface = this.interface_;
                return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public String getOperationSyncId() {
                Object obj = this.operationSyncId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operationSyncId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public AbstractC5235o getOperationSyncIdBytes() {
                Object obj = this.operationSyncId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operationSyncId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public EventParam getParam() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (EventParam) c5228l1.getMessage();
                }
                EventParam eventParam = this.param_;
                return eventParam == null ? EventParam.getDefaultInstance() : eventParam;
            }

            public EventParam.Builder getParamBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (EventParam.Builder) getParamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public EventParamOrBuilder getParamOrBuilder() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (EventParamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                EventParam eventParam = this.param_;
                return eventParam == null ? EventParam.getDefaultInstance() : eventParam;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public C5240p1 getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.payload_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getPayloadBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (C5240p1.b) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public InterfaceC5243q1 getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.payload_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public String getStreamId() {
                Object obj = this.streamId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.streamId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public AbstractC5235o getStreamIdBytes() {
                Object obj = this.streamId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.streamId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public boolean hasBeginAt() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public boolean hasInterface() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // maum.m2u.map.Map.EventStreamOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_EventStream_fieldAccessorTable.ensureFieldAccessorsInitialized(EventStream.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBeginAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 64) == 0 || (w1Var2 = this.beginAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.beginAt_ = w1Var;
                } else {
                    getBeginAtBuilder().mergeFrom(w1Var);
                }
                if (this.beginAt_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeInterface(AsyncInterface asyncInterface) {
                AsyncInterface asyncInterface2;
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(asyncInterface);
                } else if ((this.bitField0_ & 1) == 0 || (asyncInterface2 = this.interface_) == null || asyncInterface2 == AsyncInterface.getDefaultInstance()) {
                    this.interface_ = asyncInterface;
                } else {
                    getInterfaceBuilder().mergeFrom(asyncInterface);
                }
                if (this.interface_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeParam(EventParam eventParam) {
                EventParam eventParam2;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(eventParam);
                } else if ((this.bitField0_ & 16) == 0 || (eventParam2 = this.param_) == null || eventParam2 == EventParam.getDefaultInstance()) {
                    this.param_ = eventParam;
                } else {
                    getParamBuilder().mergeFrom(eventParam);
                }
                if (this.param_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 32) == 0 || (c5240p12 = this.payload_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.payload_ = c5240p1;
                } else {
                    getPayloadBuilder().mergeFrom(c5240p1);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder removeContexts(int i8) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    ensureContextsIsMutable();
                    this.contexts_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setBeginAt(w1 w1Var) {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.beginAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setContexts(int i8, EventContext eventContext) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    eventContext.getClass();
                    ensureContextsIsMutable();
                    this.contexts_.set(i8, eventContext);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, eventContext);
                }
                return this;
            }

            public Builder setInterface(AsyncInterface asyncInterface) {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 == null) {
                    asyncInterface.getClass();
                    this.interface_ = asyncInterface;
                } else {
                    c5228l1.setMessage(asyncInterface);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperationSyncId(String str) {
                str.getClass();
                this.operationSyncId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOperationSyncIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operationSyncId_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setParam(EventParam eventParam) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    eventParam.getClass();
                    this.param_ = eventParam;
                } else {
                    c5228l1.setMessage(eventParam);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPayload(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.payload_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStreamIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.streamId_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.streamId_ = "";
                this.operationSyncId_ = "";
                this.contexts_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public EventStream build() {
                EventStream eventStreamBuildPartial = buildPartial();
                if (eventStreamBuildPartial.isInitialized()) {
                    return eventStreamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) eventStreamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public EventStream buildPartial() {
                EventStream eventStream = new EventStream(this, null);
                buildPartialRepeatedFields(eventStream);
                if (this.bitField0_ != 0) {
                    buildPartial0(eventStream);
                }
                onBuilt();
                return eventStream;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public EventStream getDefaultInstanceForType() {
                return EventStream.getDefaultInstance();
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

            public EventContext.Builder addContextsBuilder(int i8) {
                return (EventContext.Builder) getContextsFieldBuilder().addBuilder(i8, EventContext.getDefaultInstance());
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
                this.interface_ = null;
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.interfaceBuilder_ = null;
                }
                this.streamId_ = "";
                this.operationSyncId_ = "";
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    this.contexts_ = Collections.emptyList();
                } else {
                    this.contexts_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -9;
                this.param_ = null;
                C5228l1 c5228l12 = this.paramBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.paramBuilder_ = null;
                }
                this.payload_ = null;
                C5228l1 c5228l13 = this.payloadBuilder_;
                if (c5228l13 != null) {
                    c5228l13.dispose();
                    this.payloadBuilder_ = null;
                }
                this.beginAt_ = null;
                C5228l1 c5228l14 = this.beginAtBuilder_;
                if (c5228l14 != null) {
                    c5228l14.dispose();
                    this.beginAtBuilder_ = null;
                }
                return this;
            }

            public Builder addContexts(int i8, EventContext eventContext) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    eventContext.getClass();
                    ensureContextsIsMutable();
                    this.contexts_.add(i8, eventContext);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, eventContext);
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
                if (h02 instanceof EventStream) {
                    return mergeFrom((EventStream) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setBeginAt(w1.b bVar) {
                C5228l1 c5228l1 = this.beginAtBuilder_;
                if (c5228l1 == null) {
                    this.beginAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setContexts(int i8, EventContext.Builder builder) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    ensureContextsIsMutable();
                    this.contexts_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder setInterface(AsyncInterface.Builder builder) {
                C5228l1 c5228l1 = this.interfaceBuilder_;
                if (c5228l1 == null) {
                    this.interface_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setParam(EventParam.Builder builder) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    this.param_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPayload(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.streamId_ = "";
                this.operationSyncId_ = "";
                this.contexts_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(EventStream eventStream) {
                if (eventStream == EventStream.getDefaultInstance()) {
                    return this;
                }
                if (eventStream.hasInterface()) {
                    mergeInterface(eventStream.getInterface());
                }
                if (!eventStream.getStreamId().isEmpty()) {
                    this.streamId_ = eventStream.streamId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!eventStream.getOperationSyncId().isEmpty()) {
                    this.operationSyncId_ = eventStream.operationSyncId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (this.contextsBuilder_ == null) {
                    if (!eventStream.contexts_.isEmpty()) {
                        if (this.contexts_.isEmpty()) {
                            this.contexts_ = eventStream.contexts_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureContextsIsMutable();
                            this.contexts_.addAll(eventStream.contexts_);
                        }
                        onChanged();
                    }
                } else if (!eventStream.contexts_.isEmpty()) {
                    if (!this.contextsBuilder_.isEmpty()) {
                        this.contextsBuilder_.addAllMessages(eventStream.contexts_);
                    } else {
                        this.contextsBuilder_.dispose();
                        this.contextsBuilder_ = null;
                        this.contexts_ = eventStream.contexts_;
                        this.bitField0_ &= -9;
                        this.contextsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getContextsFieldBuilder() : null;
                    }
                }
                if (eventStream.hasParam()) {
                    mergeParam(eventStream.getParam());
                }
                if (eventStream.hasPayload()) {
                    mergePayload(eventStream.getPayload());
                }
                if (eventStream.hasBeginAt()) {
                    mergeBeginAt(eventStream.getBeginAt());
                }
                mergeUnknownFields(eventStream.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addContexts(EventContext.Builder builder) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    ensureContextsIsMutable();
                    this.contexts_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addContexts(int i8, EventContext.Builder builder) {
                C5213g1 c5213g1 = this.contextsBuilder_;
                if (c5213g1 == null) {
                    ensureContextsIsMutable();
                    this.contexts_.add(i8, builder.build());
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
                                if (tag == 10) {
                                    rVar.readMessage(getInterfaceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.streamId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.operationSyncId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 90) {
                                    EventContext eventContext = (EventContext) rVar.readMessage(EventContext.parser(), m8);
                                    C5213g1 c5213g1 = this.contextsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureContextsIsMutable();
                                        this.contexts_.add(eventContext);
                                    } else {
                                        c5213g1.addMessage(eventContext);
                                    }
                                } else if (tag == 98) {
                                    rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 16;
                                } else if (tag == 794) {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 32;
                                } else if (tag != 802) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getBeginAtFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 64;
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

        public static final class EventContext extends AbstractC5209f0 implements EventContextOrBuilder {
            public static final int DEVICE_FIELD_NUMBER = 1;
            public static final int LOCATION_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int testContextCase_;
            private Object testContext_;
            private static final EventContext DEFAULT_INSTANCE = new EventContext();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.EventStream.EventContext.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public EventContext parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = EventContext.newBuilder();
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

            public static final class Builder extends AbstractC5209f0.b implements EventContextOrBuilder {
                private int bitField0_;
                private C5228l1 deviceBuilder_;
                private C5228l1 locationBuilder_;
                private int testContextCase_;
                private Object testContext_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(EventContext eventContext) {
                }

                private void buildPartialOneofs(EventContext eventContext) {
                    C5228l1 c5228l1;
                    C5228l1 c5228l12;
                    eventContext.testContextCase_ = this.testContextCase_;
                    eventContext.testContext_ = this.testContext_;
                    if (this.testContextCase_ == 1 && (c5228l12 = this.deviceBuilder_) != null) {
                        eventContext.testContext_ = c5228l12.build();
                    }
                    if (this.testContextCase_ != 2 || (c5228l1 = this.locationBuilder_) == null) {
                        return;
                    }
                    eventContext.testContext_ = c5228l1.build();
                }

                public static final C5269x.b getDescriptor() {
                    return Map.internal_static_maum_m2u_map_EventStream_EventContext_descriptor;
                }

                private C5228l1 getDeviceFieldBuilder() {
                    if (this.deviceBuilder_ == null) {
                        if (this.testContextCase_ != 1) {
                            this.testContext_ = DeviceOuterClass.Device.getDefaultInstance();
                        }
                        this.deviceBuilder_ = new C5228l1((DeviceOuterClass.Device) this.testContext_, getParentForChildren(), isClean());
                        this.testContext_ = null;
                    }
                    this.testContextCase_ = 1;
                    onChanged();
                    return this.deviceBuilder_;
                }

                private C5228l1 getLocationFieldBuilder() {
                    if (this.locationBuilder_ == null) {
                        if (this.testContextCase_ != 2) {
                            this.testContext_ = LocationOuterClass.Location.getDefaultInstance();
                        }
                        this.locationBuilder_ = new C5228l1((LocationOuterClass.Location) this.testContext_, getParentForChildren(), isClean());
                        this.testContext_ = null;
                    }
                    this.testContextCase_ = 2;
                    onChanged();
                    return this.locationBuilder_;
                }

                public Builder clearDevice() {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    if (c5228l1 != null) {
                        if (this.testContextCase_ == 1) {
                            this.testContextCase_ = 0;
                            this.testContext_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testContextCase_ == 1) {
                        this.testContextCase_ = 0;
                        this.testContext_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearLocation() {
                    C5228l1 c5228l1 = this.locationBuilder_;
                    if (c5228l1 != null) {
                        if (this.testContextCase_ == 2) {
                            this.testContextCase_ = 0;
                            this.testContext_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testContextCase_ == 2) {
                        this.testContextCase_ = 0;
                        this.testContext_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearTestContext() {
                    this.testContextCase_ = 0;
                    this.testContext_ = null;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return Map.internal_static_maum_m2u_map_EventStream_EventContext_descriptor;
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public DeviceOuterClass.Device getDevice() {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    return c5228l1 == null ? this.testContextCase_ == 1 ? (DeviceOuterClass.Device) this.testContext_ : DeviceOuterClass.Device.getDefaultInstance() : this.testContextCase_ == 1 ? (DeviceOuterClass.Device) c5228l1.getMessage() : DeviceOuterClass.Device.getDefaultInstance();
                }

                public DeviceOuterClass.Device.Builder getDeviceBuilder() {
                    return (DeviceOuterClass.Device.Builder) getDeviceFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testContextCase_;
                    return (i8 != 1 || (c5228l1 = this.deviceBuilder_) == null) ? i8 == 1 ? (DeviceOuterClass.Device) this.testContext_ : DeviceOuterClass.Device.getDefaultInstance() : (DeviceOuterClass.DeviceOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public LocationOuterClass.Location getLocation() {
                    C5228l1 c5228l1 = this.locationBuilder_;
                    return c5228l1 == null ? this.testContextCase_ == 2 ? (LocationOuterClass.Location) this.testContext_ : LocationOuterClass.Location.getDefaultInstance() : this.testContextCase_ == 2 ? (LocationOuterClass.Location) c5228l1.getMessage() : LocationOuterClass.Location.getDefaultInstance();
                }

                public LocationOuterClass.Location.Builder getLocationBuilder() {
                    return (LocationOuterClass.Location.Builder) getLocationFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public LocationOuterClass.LocationOrBuilder getLocationOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testContextCase_;
                    return (i8 != 2 || (c5228l1 = this.locationBuilder_) == null) ? i8 == 2 ? (LocationOuterClass.Location) this.testContext_ : LocationOuterClass.Location.getDefaultInstance() : (LocationOuterClass.LocationOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public TestContextCase getTestContextCase() {
                    return TestContextCase.forNumber(this.testContextCase_);
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public boolean hasDevice() {
                    return this.testContextCase_ == 1;
                }

                @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
                public boolean hasLocation() {
                    return this.testContextCase_ == 2;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return Map.internal_static_maum_m2u_map_EventStream_EventContext_fieldAccessorTable.ensureFieldAccessorsInitialized(EventContext.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeDevice(DeviceOuterClass.Device device) {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    if (c5228l1 == null) {
                        if (this.testContextCase_ != 1 || this.testContext_ == DeviceOuterClass.Device.getDefaultInstance()) {
                            this.testContext_ = device;
                        } else {
                            this.testContext_ = DeviceOuterClass.Device.newBuilder((DeviceOuterClass.Device) this.testContext_).mergeFrom(device).buildPartial();
                        }
                        onChanged();
                    } else if (this.testContextCase_ == 1) {
                        c5228l1.mergeFrom(device);
                    } else {
                        c5228l1.setMessage(device);
                    }
                    this.testContextCase_ = 1;
                    return this;
                }

                public Builder mergeLocation(LocationOuterClass.Location location) {
                    C5228l1 c5228l1 = this.locationBuilder_;
                    if (c5228l1 == null) {
                        if (this.testContextCase_ != 2 || this.testContext_ == LocationOuterClass.Location.getDefaultInstance()) {
                            this.testContext_ = location;
                        } else {
                            this.testContext_ = LocationOuterClass.Location.newBuilder((LocationOuterClass.Location) this.testContext_).mergeFrom(location).buildPartial();
                        }
                        onChanged();
                    } else if (this.testContextCase_ == 2) {
                        c5228l1.mergeFrom(location);
                    } else {
                        c5228l1.setMessage(location);
                    }
                    this.testContextCase_ = 2;
                    return this;
                }

                public Builder setDevice(DeviceOuterClass.Device device) {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    if (c5228l1 == null) {
                        device.getClass();
                        this.testContext_ = device;
                        onChanged();
                    } else {
                        c5228l1.setMessage(device);
                    }
                    this.testContextCase_ = 1;
                    return this;
                }

                public Builder setLocation(LocationOuterClass.Location location) {
                    C5228l1 c5228l1 = this.locationBuilder_;
                    if (c5228l1 == null) {
                        location.getClass();
                        this.testContext_ = location;
                        onChanged();
                    } else {
                        c5228l1.setMessage(location);
                    }
                    this.testContextCase_ = 2;
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.testContextCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public EventContext build() {
                    EventContext eventContextBuildPartial = buildPartial();
                    if (eventContextBuildPartial.isInitialized()) {
                        return eventContextBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) eventContextBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public EventContext buildPartial() {
                    EventContext eventContext = new EventContext(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(eventContext);
                    }
                    buildPartialOneofs(eventContext);
                    onBuilt();
                    return eventContext;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public EventContext getDefaultInstanceForType() {
                    return EventContext.getDefaultInstance();
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
                    this.testContextCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.clear();
                    }
                    C5228l1 c5228l12 = this.locationBuilder_;
                    if (c5228l12 != null) {
                        c5228l12.clear();
                    }
                    this.testContextCase_ = 0;
                    this.testContext_ = null;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof EventContext) {
                        return mergeFrom((EventContext) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setDevice(DeviceOuterClass.Device.Builder builder) {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    if (c5228l1 == null) {
                        this.testContext_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testContextCase_ = 1;
                    return this;
                }

                public Builder setLocation(LocationOuterClass.Location.Builder builder) {
                    C5228l1 c5228l1 = this.locationBuilder_;
                    if (c5228l1 == null) {
                        this.testContext_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testContextCase_ = 2;
                    return this;
                }

                public Builder mergeFrom(EventContext eventContext) {
                    if (eventContext == EventContext.getDefaultInstance()) {
                        return this;
                    }
                    int i8 = AnonymousClass1.$SwitchMap$maum$m2u$map$Map$EventStream$EventContext$TestContextCase[eventContext.getTestContextCase().ordinal()];
                    if (i8 == 1) {
                        mergeDevice(eventContext.getDevice());
                    } else if (i8 == 2) {
                        mergeLocation(eventContext.getLocation());
                    }
                    mergeUnknownFields(eventContext.getUnknownFields());
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
                                        rVar.readMessage(getDeviceFieldBuilder().getBuilder(), m8);
                                        this.testContextCase_ = 1;
                                    } else if (tag != 18) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getLocationFieldBuilder().getBuilder(), m8);
                                        this.testContextCase_ = 2;
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

            public enum TestContextCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
                DEVICE(1),
                LOCATION(2),
                TESTCONTEXT_NOT_SET(0);

                private final int value;

                TestContextCase(int i8) {
                    this.value = i8;
                }

                public static TestContextCase forNumber(int i8) {
                    if (i8 == 0) {
                        return TESTCONTEXT_NOT_SET;
                    }
                    if (i8 == 1) {
                        return DEVICE;
                    }
                    if (i8 != 2) {
                        return null;
                    }
                    return LOCATION;
                }

                @Override // com.google.protobuf.AbstractC5227l0.c
                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static TestContextCase valueOf(int i8) {
                    return forNumber(i8);
                }
            }

            /* synthetic */ EventContext(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static EventContext getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_EventStream_EventContext_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EventContext parseDelimitedFrom(InputStream inputStream) {
                return (EventContext) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventContext parseFrom(ByteBuffer byteBuffer) {
                return (EventContext) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EventContext)) {
                    return super.equals(obj);
                }
                EventContext eventContext = (EventContext) obj;
                if (!getTestContextCase().equals(eventContext.getTestContextCase())) {
                    return false;
                }
                int i8 = this.testContextCase_;
                if (i8 != 1) {
                    if (i8 == 2 && !getLocation().equals(eventContext.getLocation())) {
                        return false;
                    }
                } else if (!getDevice().equals(eventContext.getDevice())) {
                    return false;
                }
                return getUnknownFields().equals(eventContext.getUnknownFields());
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public DeviceOuterClass.Device getDevice() {
                return this.testContextCase_ == 1 ? (DeviceOuterClass.Device) this.testContext_ : DeviceOuterClass.Device.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
                return this.testContextCase_ == 1 ? (DeviceOuterClass.Device) this.testContext_ : DeviceOuterClass.Device.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public LocationOuterClass.Location getLocation() {
                return this.testContextCase_ == 2 ? (LocationOuterClass.Location) this.testContext_ : LocationOuterClass.Location.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public LocationOuterClass.LocationOrBuilder getLocationOrBuilder() {
                return this.testContextCase_ == 2 ? (LocationOuterClass.Location) this.testContext_ : LocationOuterClass.Location.getDefaultInstance();
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
                int iComputeMessageSize = this.testContextCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (DeviceOuterClass.Device) this.testContext_) : 0;
                if (this.testContextCase_ == 2) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (LocationOuterClass.Location) this.testContext_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public TestContextCase getTestContextCase() {
                return TestContextCase.forNumber(this.testContextCase_);
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public boolean hasDevice() {
                return this.testContextCase_ == 1;
            }

            @Override // maum.m2u.map.Map.EventStream.EventContextOrBuilder
            public boolean hasLocation() {
                return this.testContextCase_ == 2;
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
                int i10 = this.testContextCase_;
                if (i10 != 1) {
                    if (i10 == 2) {
                        i8 = ((iHashCode2 * 37) + 2) * 53;
                        iHashCode = getLocation().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i8 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getDevice().hashCode();
                iHashCode2 = i8 + iHashCode;
                int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode32;
                return iHashCode32;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_EventStream_EventContext_fieldAccessorTable.ensureFieldAccessorsInitialized(EventContext.class, Builder.class);
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
                return new EventContext();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (this.testContextCase_ == 1) {
                    abstractC5248t.writeMessage(1, (DeviceOuterClass.Device) this.testContext_);
                }
                if (this.testContextCase_ == 2) {
                    abstractC5248t.writeMessage(2, (LocationOuterClass.Location) this.testContext_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private EventContext(AbstractC5209f0.b bVar) {
                super(bVar);
                this.testContextCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(EventContext eventContext) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventContext);
            }

            public static EventContext parseFrom(ByteBuffer byteBuffer, M m8) {
                return (EventContext) PARSER.parseFrom(byteBuffer, m8);
            }

            public static EventContext parseDelimitedFrom(InputStream inputStream, M m8) {
                return (EventContext) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static EventContext parseFrom(AbstractC5235o abstractC5235o) {
                return (EventContext) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public EventContext getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static EventContext parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (EventContext) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EventContext() {
                this.testContextCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EventContext parseFrom(byte[] bArr) {
                return (EventContext) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static EventContext parseFrom(byte[] bArr, M m8) {
                return (EventContext) PARSER.parseFrom(bArr, m8);
            }

            public static EventContext parseFrom(InputStream inputStream) {
                return (EventContext) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static EventContext parseFrom(InputStream inputStream, M m8) {
                return (EventContext) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static EventContext parseFrom(r rVar) {
                return (EventContext) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static EventContext parseFrom(r rVar, M m8) {
                return (EventContext) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface EventContextOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ java.util.Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            DeviceOuterClass.Device getDevice();

            DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            LocationOuterClass.Location getLocation();

            LocationOuterClass.LocationOrBuilder getLocationOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            EventContext.TestContextCase getTestContextCase();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            boolean hasDevice();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            boolean hasLocation();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        public static final class EventParam extends AbstractC5209f0 implements EventParamOrBuilder {
            public static final int DIALOG_AGENT_FORWARDER_PARAM_FIELD_NUMBER = 6;
            public static final int EMPTY_PARAM_FIELD_NUMBER = 1000;
            public static final int GESTURE_PARAM_FIELD_NUMBER = 4;
            public static final int IMAGE_RECOGNITION_PARAM_FIELD_NUMBER = 2;
            public static final int KEYBOARD_PARAM_FIELD_NUMBER = 5;
            public static final int SPEECH_RECOGNITION_PARAM_FIELD_NUMBER = 1;
            public static final int VIDEO_PARAM_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int testParamCase_;
            private Object testParam_;
            private static final EventParam DEFAULT_INSTANCE = new EventParam();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.EventStream.EventParam.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public EventParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = EventParam.newBuilder();
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

            public static final class Builder extends AbstractC5209f0.b implements EventParamOrBuilder {
                private int bitField0_;
                private C5228l1 dialogAgentForwarderParamBuilder_;
                private C5228l1 emptyParamBuilder_;
                private C5228l1 gestureParamBuilder_;
                private C5228l1 imageRecognitionParamBuilder_;
                private C5228l1 keyboardParamBuilder_;
                private C5228l1 speechRecognitionParamBuilder_;
                private int testParamCase_;
                private Object testParam_;
                private C5228l1 videoParamBuilder_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(EventParam eventParam) {
                }

                private void buildPartialOneofs(EventParam eventParam) {
                    C5228l1 c5228l1;
                    C5228l1 c5228l12;
                    C5228l1 c5228l13;
                    C5228l1 c5228l14;
                    C5228l1 c5228l15;
                    C5228l1 c5228l16;
                    C5228l1 c5228l17;
                    eventParam.testParamCase_ = this.testParamCase_;
                    eventParam.testParam_ = this.testParam_;
                    if (this.testParamCase_ == 1 && (c5228l17 = this.speechRecognitionParamBuilder_) != null) {
                        eventParam.testParam_ = c5228l17.build();
                    }
                    if (this.testParamCase_ == 2 && (c5228l16 = this.imageRecognitionParamBuilder_) != null) {
                        eventParam.testParam_ = c5228l16.build();
                    }
                    if (this.testParamCase_ == 3 && (c5228l15 = this.videoParamBuilder_) != null) {
                        eventParam.testParam_ = c5228l15.build();
                    }
                    if (this.testParamCase_ == 4 && (c5228l14 = this.gestureParamBuilder_) != null) {
                        eventParam.testParam_ = c5228l14.build();
                    }
                    if (this.testParamCase_ == 5 && (c5228l13 = this.keyboardParamBuilder_) != null) {
                        eventParam.testParam_ = c5228l13.build();
                    }
                    if (this.testParamCase_ == 6 && (c5228l12 = this.dialogAgentForwarderParamBuilder_) != null) {
                        eventParam.testParam_ = c5228l12.build();
                    }
                    if (this.testParamCase_ != 1000 || (c5228l1 = this.emptyParamBuilder_) == null) {
                        return;
                    }
                    eventParam.testParam_ = c5228l1.build();
                }

                public static final C5269x.b getDescriptor() {
                    return Map.internal_static_maum_m2u_map_EventStream_EventParam_descriptor;
                }

                private C5228l1 getDialogAgentForwarderParamFieldBuilder() {
                    if (this.dialogAgentForwarderParamBuilder_ == null) {
                        if (this.testParamCase_ != 6) {
                            this.testParam_ = EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
                        }
                        this.dialogAgentForwarderParamBuilder_ = new C5228l1((EventOuterClass.DialogAgentForwarderParam) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 6;
                    onChanged();
                    return this.dialogAgentForwarderParamBuilder_;
                }

                private C5228l1 getEmptyParamFieldBuilder() {
                    if (this.emptyParamBuilder_ == null) {
                        if (this.testParamCase_ != 1000) {
                            this.testParam_ = F.getDefaultInstance();
                        }
                        this.emptyParamBuilder_ = new C5228l1((F) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 1000;
                    onChanged();
                    return this.emptyParamBuilder_;
                }

                private C5228l1 getGestureParamFieldBuilder() {
                    if (this.gestureParamBuilder_ == null) {
                        if (this.testParamCase_ != 4) {
                            this.testParam_ = GestureParam.getDefaultInstance();
                        }
                        this.gestureParamBuilder_ = new C5228l1((GestureParam) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 4;
                    onChanged();
                    return this.gestureParamBuilder_;
                }

                private C5228l1 getImageRecognitionParamFieldBuilder() {
                    if (this.imageRecognitionParamBuilder_ == null) {
                        if (this.testParamCase_ != 2) {
                            this.testParam_ = AbstractC6551a.c.getDefaultInstance();
                        }
                        this.imageRecognitionParamBuilder_ = new C5228l1((AbstractC6551a.c) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 2;
                    onChanged();
                    return this.imageRecognitionParamBuilder_;
                }

                private C5228l1 getKeyboardParamFieldBuilder() {
                    if (this.keyboardParamBuilder_ == null) {
                        if (this.testParamCase_ != 5) {
                            this.testParam_ = KeyboardParam.getDefaultInstance();
                        }
                        this.keyboardParamBuilder_ = new C5228l1((KeyboardParam) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 5;
                    onChanged();
                    return this.keyboardParamBuilder_;
                }

                private C5228l1 getSpeechRecognitionParamFieldBuilder() {
                    if (this.speechRecognitionParamBuilder_ == null) {
                        if (this.testParamCase_ != 1) {
                            this.testParam_ = AbstractC6650a.b.getDefaultInstance();
                        }
                        this.speechRecognitionParamBuilder_ = new C5228l1((AbstractC6650a.b) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 1;
                    onChanged();
                    return this.speechRecognitionParamBuilder_;
                }

                private C5228l1 getVideoParamFieldBuilder() {
                    if (this.videoParamBuilder_ == null) {
                        if (this.testParamCase_ != 3) {
                            this.testParam_ = VideoParam.getDefaultInstance();
                        }
                        this.videoParamBuilder_ = new C5228l1((VideoParam) this.testParam_, getParentForChildren(), isClean());
                        this.testParam_ = null;
                    }
                    this.testParamCase_ = 3;
                    onChanged();
                    return this.videoParamBuilder_;
                }

                public Builder clearDialogAgentForwarderParam() {
                    C5228l1 c5228l1 = this.dialogAgentForwarderParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 6) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 6) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearEmptyParam() {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 1000) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 1000) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearGestureParam() {
                    C5228l1 c5228l1 = this.gestureParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 4) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 4) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearImageRecognitionParam() {
                    C5228l1 c5228l1 = this.imageRecognitionParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 2) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 2) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearKeyboardParam() {
                    C5228l1 c5228l1 = this.keyboardParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 5) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 5) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearSpeechRecognitionParam() {
                    C5228l1 c5228l1 = this.speechRecognitionParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 1) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 1) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                public Builder clearTestParam() {
                    this.testParamCase_ = 0;
                    this.testParam_ = null;
                    onChanged();
                    return this;
                }

                public Builder clearVideoParam() {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 != null) {
                        if (this.testParamCase_ == 3) {
                            this.testParamCase_ = 0;
                            this.testParam_ = null;
                        }
                        c5228l1.clear();
                    } else if (this.testParamCase_ == 3) {
                        this.testParamCase_ = 0;
                        this.testParam_ = null;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return Map.internal_static_maum_m2u_map_EventStream_EventParam_descriptor;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public EventOuterClass.DialogAgentForwarderParam getDialogAgentForwarderParam() {
                    C5228l1 c5228l1 = this.dialogAgentForwarderParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 6 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : this.testParamCase_ == 6 ? (EventOuterClass.DialogAgentForwarderParam) c5228l1.getMessage() : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
                }

                public EventOuterClass.DialogAgentForwarderParam.Builder getDialogAgentForwarderParamBuilder() {
                    return (EventOuterClass.DialogAgentForwarderParam.Builder) getDialogAgentForwarderParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public EventOuterClass.DialogAgentForwarderParamOrBuilder getDialogAgentForwarderParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 6 || (c5228l1 = this.dialogAgentForwarderParamBuilder_) == null) ? i8 == 6 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance() : (EventOuterClass.DialogAgentForwarderParamOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public F getEmptyParam() {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 1000 ? (F) this.testParam_ : F.getDefaultInstance() : this.testParamCase_ == 1000 ? (F) c5228l1.getMessage() : F.getDefaultInstance();
                }

                public F.b getEmptyParamBuilder() {
                    return (F.b) getEmptyParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public G getEmptyParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 1000 || (c5228l1 = this.emptyParamBuilder_) == null) ? i8 == 1000 ? (F) this.testParam_ : F.getDefaultInstance() : (G) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public GestureParam getGestureParam() {
                    C5228l1 c5228l1 = this.gestureParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 4 ? (GestureParam) this.testParam_ : GestureParam.getDefaultInstance() : this.testParamCase_ == 4 ? (GestureParam) c5228l1.getMessage() : GestureParam.getDefaultInstance();
                }

                public GestureParam.Builder getGestureParamBuilder() {
                    return (GestureParam.Builder) getGestureParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public GestureParamOrBuilder getGestureParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 4 || (c5228l1 = this.gestureParamBuilder_) == null) ? i8 == 4 ? (GestureParam) this.testParam_ : GestureParam.getDefaultInstance() : (GestureParamOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public AbstractC6551a.c getImageRecognitionParam() {
                    C5228l1 c5228l1 = this.imageRecognitionParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 2 ? (AbstractC6551a.c) this.testParam_ : AbstractC6551a.c.getDefaultInstance() : this.testParamCase_ == 2 ? (AbstractC6551a.c) c5228l1.getMessage() : AbstractC6551a.c.getDefaultInstance();
                }

                public AbstractC6551a.c.b getImageRecognitionParamBuilder() {
                    return (AbstractC6551a.c.b) getImageRecognitionParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public AbstractC6551a.d getImageRecognitionParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 2 || (c5228l1 = this.imageRecognitionParamBuilder_) == null) ? i8 == 2 ? (AbstractC6551a.c) this.testParam_ : AbstractC6551a.c.getDefaultInstance() : (AbstractC6551a.d) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public KeyboardParam getKeyboardParam() {
                    C5228l1 c5228l1 = this.keyboardParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 5 ? (KeyboardParam) this.testParam_ : KeyboardParam.getDefaultInstance() : this.testParamCase_ == 5 ? (KeyboardParam) c5228l1.getMessage() : KeyboardParam.getDefaultInstance();
                }

                public KeyboardParam.Builder getKeyboardParamBuilder() {
                    return (KeyboardParam.Builder) getKeyboardParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public KeyboardParamOrBuilder getKeyboardParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 5 || (c5228l1 = this.keyboardParamBuilder_) == null) ? i8 == 5 ? (KeyboardParam) this.testParam_ : KeyboardParam.getDefaultInstance() : (KeyboardParamOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public AbstractC6650a.b getSpeechRecognitionParam() {
                    C5228l1 c5228l1 = this.speechRecognitionParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 1 ? (AbstractC6650a.b) this.testParam_ : AbstractC6650a.b.getDefaultInstance() : this.testParamCase_ == 1 ? (AbstractC6650a.b) c5228l1.getMessage() : AbstractC6650a.b.getDefaultInstance();
                }

                public AbstractC6650a.b.C0441b getSpeechRecognitionParamBuilder() {
                    return (AbstractC6650a.b.C0441b) getSpeechRecognitionParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public AbstractC6650a.c getSpeechRecognitionParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 1 || (c5228l1 = this.speechRecognitionParamBuilder_) == null) ? i8 == 1 ? (AbstractC6650a.b) this.testParam_ : AbstractC6650a.b.getDefaultInstance() : (AbstractC6650a.c) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public TestParamCase getTestParamCase() {
                    return TestParamCase.forNumber(this.testParamCase_);
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public VideoParam getVideoParam() {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    return c5228l1 == null ? this.testParamCase_ == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance() : this.testParamCase_ == 3 ? (VideoParam) c5228l1.getMessage() : VideoParam.getDefaultInstance();
                }

                public VideoParam.Builder getVideoParamBuilder() {
                    return (VideoParam.Builder) getVideoParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public VideoParamOrBuilder getVideoParamOrBuilder() {
                    C5228l1 c5228l1;
                    int i8 = this.testParamCase_;
                    return (i8 != 3 || (c5228l1 = this.videoParamBuilder_) == null) ? i8 == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance() : (VideoParamOrBuilder) c5228l1.getMessageOrBuilder();
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasDialogAgentForwarderParam() {
                    return this.testParamCase_ == 6;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasEmptyParam() {
                    return this.testParamCase_ == 1000;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasGestureParam() {
                    return this.testParamCase_ == 4;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasImageRecognitionParam() {
                    return this.testParamCase_ == 2;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasKeyboardParam() {
                    return this.testParamCase_ == 5;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasSpeechRecognitionParam() {
                    return this.testParamCase_ == 1;
                }

                @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
                public boolean hasVideoParam() {
                    return this.testParamCase_ == 3;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return Map.internal_static_maum_m2u_map_EventStream_EventParam_fieldAccessorTable.ensureFieldAccessorsInitialized(EventParam.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeDialogAgentForwarderParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                    C5228l1 c5228l1 = this.dialogAgentForwarderParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 6 || this.testParam_ == EventOuterClass.DialogAgentForwarderParam.getDefaultInstance()) {
                            this.testParam_ = dialogAgentForwarderParam;
                        } else {
                            this.testParam_ = EventOuterClass.DialogAgentForwarderParam.newBuilder((EventOuterClass.DialogAgentForwarderParam) this.testParam_).mergeFrom(dialogAgentForwarderParam).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 6) {
                        c5228l1.mergeFrom(dialogAgentForwarderParam);
                    } else {
                        c5228l1.setMessage(dialogAgentForwarderParam);
                    }
                    this.testParamCase_ = 6;
                    return this;
                }

                public Builder mergeEmptyParam(F f8) {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 1000 || this.testParam_ == F.getDefaultInstance()) {
                            this.testParam_ = f8;
                        } else {
                            this.testParam_ = F.newBuilder((F) this.testParam_).mergeFrom(f8).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 1000) {
                        c5228l1.mergeFrom(f8);
                    } else {
                        c5228l1.setMessage(f8);
                    }
                    this.testParamCase_ = 1000;
                    return this;
                }

                public Builder mergeGestureParam(GestureParam gestureParam) {
                    C5228l1 c5228l1 = this.gestureParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 4 || this.testParam_ == GestureParam.getDefaultInstance()) {
                            this.testParam_ = gestureParam;
                        } else {
                            this.testParam_ = GestureParam.newBuilder((GestureParam) this.testParam_).mergeFrom(gestureParam).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 4) {
                        c5228l1.mergeFrom(gestureParam);
                    } else {
                        c5228l1.setMessage(gestureParam);
                    }
                    this.testParamCase_ = 4;
                    return this;
                }

                public Builder mergeImageRecognitionParam(AbstractC6551a.c cVar) {
                    C5228l1 c5228l1 = this.imageRecognitionParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 2 || this.testParam_ == AbstractC6551a.c.getDefaultInstance()) {
                            this.testParam_ = cVar;
                        } else {
                            this.testParam_ = AbstractC6551a.c.newBuilder((AbstractC6551a.c) this.testParam_).mergeFrom(cVar).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 2) {
                        c5228l1.mergeFrom(cVar);
                    } else {
                        c5228l1.setMessage(cVar);
                    }
                    this.testParamCase_ = 2;
                    return this;
                }

                public Builder mergeKeyboardParam(KeyboardParam keyboardParam) {
                    C5228l1 c5228l1 = this.keyboardParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 5 || this.testParam_ == KeyboardParam.getDefaultInstance()) {
                            this.testParam_ = keyboardParam;
                        } else {
                            this.testParam_ = KeyboardParam.newBuilder((KeyboardParam) this.testParam_).mergeFrom(keyboardParam).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 5) {
                        c5228l1.mergeFrom(keyboardParam);
                    } else {
                        c5228l1.setMessage(keyboardParam);
                    }
                    this.testParamCase_ = 5;
                    return this;
                }

                public Builder mergeSpeechRecognitionParam(AbstractC6650a.b bVar) {
                    C5228l1 c5228l1 = this.speechRecognitionParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 1 || this.testParam_ == AbstractC6650a.b.getDefaultInstance()) {
                            this.testParam_ = bVar;
                        } else {
                            this.testParam_ = AbstractC6650a.b.newBuilder((AbstractC6650a.b) this.testParam_).mergeFrom(bVar).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 1) {
                        c5228l1.mergeFrom(bVar);
                    } else {
                        c5228l1.setMessage(bVar);
                    }
                    this.testParamCase_ = 1;
                    return this;
                }

                public Builder mergeVideoParam(VideoParam videoParam) {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 == null) {
                        if (this.testParamCase_ != 3 || this.testParam_ == VideoParam.getDefaultInstance()) {
                            this.testParam_ = videoParam;
                        } else {
                            this.testParam_ = VideoParam.newBuilder((VideoParam) this.testParam_).mergeFrom(videoParam).buildPartial();
                        }
                        onChanged();
                    } else if (this.testParamCase_ == 3) {
                        c5228l1.mergeFrom(videoParam);
                    } else {
                        c5228l1.setMessage(videoParam);
                    }
                    this.testParamCase_ = 3;
                    return this;
                }

                public Builder setDialogAgentForwarderParam(EventOuterClass.DialogAgentForwarderParam dialogAgentForwarderParam) {
                    C5228l1 c5228l1 = this.dialogAgentForwarderParamBuilder_;
                    if (c5228l1 == null) {
                        dialogAgentForwarderParam.getClass();
                        this.testParam_ = dialogAgentForwarderParam;
                        onChanged();
                    } else {
                        c5228l1.setMessage(dialogAgentForwarderParam);
                    }
                    this.testParamCase_ = 6;
                    return this;
                }

                public Builder setEmptyParam(F f8) {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 == null) {
                        f8.getClass();
                        this.testParam_ = f8;
                        onChanged();
                    } else {
                        c5228l1.setMessage(f8);
                    }
                    this.testParamCase_ = 1000;
                    return this;
                }

                public Builder setGestureParam(GestureParam gestureParam) {
                    C5228l1 c5228l1 = this.gestureParamBuilder_;
                    if (c5228l1 == null) {
                        gestureParam.getClass();
                        this.testParam_ = gestureParam;
                        onChanged();
                    } else {
                        c5228l1.setMessage(gestureParam);
                    }
                    this.testParamCase_ = 4;
                    return this;
                }

                public Builder setImageRecognitionParam(AbstractC6551a.c cVar) {
                    C5228l1 c5228l1 = this.imageRecognitionParamBuilder_;
                    if (c5228l1 == null) {
                        cVar.getClass();
                        this.testParam_ = cVar;
                        onChanged();
                    } else {
                        c5228l1.setMessage(cVar);
                    }
                    this.testParamCase_ = 2;
                    return this;
                }

                public Builder setKeyboardParam(KeyboardParam keyboardParam) {
                    C5228l1 c5228l1 = this.keyboardParamBuilder_;
                    if (c5228l1 == null) {
                        keyboardParam.getClass();
                        this.testParam_ = keyboardParam;
                        onChanged();
                    } else {
                        c5228l1.setMessage(keyboardParam);
                    }
                    this.testParamCase_ = 5;
                    return this;
                }

                public Builder setSpeechRecognitionParam(AbstractC6650a.b bVar) {
                    C5228l1 c5228l1 = this.speechRecognitionParamBuilder_;
                    if (c5228l1 == null) {
                        bVar.getClass();
                        this.testParam_ = bVar;
                        onChanged();
                    } else {
                        c5228l1.setMessage(bVar);
                    }
                    this.testParamCase_ = 1;
                    return this;
                }

                public Builder setVideoParam(VideoParam videoParam) {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 == null) {
                        videoParam.getClass();
                        this.testParam_ = videoParam;
                        onChanged();
                    } else {
                        c5228l1.setMessage(videoParam);
                    }
                    this.testParamCase_ = 3;
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.testParamCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public EventParam build() {
                    EventParam eventParamBuildPartial = buildPartial();
                    if (eventParamBuildPartial.isInitialized()) {
                        return eventParamBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) eventParamBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public EventParam buildPartial() {
                    EventParam eventParam = new EventParam(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(eventParam);
                    }
                    buildPartialOneofs(eventParam);
                    onBuilt();
                    return eventParam;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public EventParam getDefaultInstanceForType() {
                    return EventParam.getDefaultInstance();
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
                    this.testParamCase_ = 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    C5228l1 c5228l1 = this.speechRecognitionParamBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.clear();
                    }
                    C5228l1 c5228l12 = this.imageRecognitionParamBuilder_;
                    if (c5228l12 != null) {
                        c5228l12.clear();
                    }
                    C5228l1 c5228l13 = this.videoParamBuilder_;
                    if (c5228l13 != null) {
                        c5228l13.clear();
                    }
                    C5228l1 c5228l14 = this.gestureParamBuilder_;
                    if (c5228l14 != null) {
                        c5228l14.clear();
                    }
                    C5228l1 c5228l15 = this.keyboardParamBuilder_;
                    if (c5228l15 != null) {
                        c5228l15.clear();
                    }
                    C5228l1 c5228l16 = this.dialogAgentForwarderParamBuilder_;
                    if (c5228l16 != null) {
                        c5228l16.clear();
                    }
                    C5228l1 c5228l17 = this.emptyParamBuilder_;
                    if (c5228l17 != null) {
                        c5228l17.clear();
                    }
                    this.testParamCase_ = 0;
                    this.testParam_ = null;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof EventParam) {
                        return mergeFrom((EventParam) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setDialogAgentForwarderParam(EventOuterClass.DialogAgentForwarderParam.Builder builder) {
                    C5228l1 c5228l1 = this.dialogAgentForwarderParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testParamCase_ = 6;
                    return this;
                }

                public Builder setEmptyParam(F.b bVar) {
                    C5228l1 c5228l1 = this.emptyParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = bVar.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.testParamCase_ = 1000;
                    return this;
                }

                public Builder setGestureParam(GestureParam.Builder builder) {
                    C5228l1 c5228l1 = this.gestureParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testParamCase_ = 4;
                    return this;
                }

                public Builder setImageRecognitionParam(AbstractC6551a.c.b bVar) {
                    C5228l1 c5228l1 = this.imageRecognitionParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = bVar.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.testParamCase_ = 2;
                    return this;
                }

                public Builder setKeyboardParam(KeyboardParam.Builder builder) {
                    C5228l1 c5228l1 = this.keyboardParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testParamCase_ = 5;
                    return this;
                }

                public Builder setSpeechRecognitionParam(AbstractC6650a.b.C0441b c0441b) {
                    C5228l1 c5228l1 = this.speechRecognitionParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = c0441b.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(c0441b.build());
                    }
                    this.testParamCase_ = 1;
                    return this;
                }

                public Builder setVideoParam(VideoParam.Builder builder) {
                    C5228l1 c5228l1 = this.videoParamBuilder_;
                    if (c5228l1 == null) {
                        this.testParam_ = builder.build();
                        onChanged();
                    } else {
                        c5228l1.setMessage(builder.build());
                    }
                    this.testParamCase_ = 3;
                    return this;
                }

                public Builder mergeFrom(EventParam eventParam) {
                    if (eventParam == EventParam.getDefaultInstance()) {
                        return this;
                    }
                    switch (AnonymousClass1.$SwitchMap$maum$m2u$map$Map$EventStream$EventParam$TestParamCase[eventParam.getTestParamCase().ordinal()]) {
                        case 1:
                            mergeSpeechRecognitionParam(eventParam.getSpeechRecognitionParam());
                            break;
                        case 2:
                            mergeImageRecognitionParam(eventParam.getImageRecognitionParam());
                            break;
                        case 3:
                            mergeVideoParam(eventParam.getVideoParam());
                            break;
                        case 4:
                            mergeGestureParam(eventParam.getGestureParam());
                            break;
                        case 5:
                            mergeKeyboardParam(eventParam.getKeyboardParam());
                            break;
                        case 6:
                            mergeDialogAgentForwarderParam(eventParam.getDialogAgentForwarderParam());
                            break;
                        case 7:
                            mergeEmptyParam(eventParam.getEmptyParam());
                            break;
                    }
                    mergeUnknownFields(eventParam.getUnknownFields());
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
                                        rVar.readMessage(getSpeechRecognitionParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 1;
                                    } else if (tag == 18) {
                                        rVar.readMessage(getImageRecognitionParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 2;
                                    } else if (tag == 26) {
                                        rVar.readMessage(getVideoParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 3;
                                    } else if (tag == 34) {
                                        rVar.readMessage(getGestureParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 4;
                                    } else if (tag == 42) {
                                        rVar.readMessage(getKeyboardParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 5;
                                    } else if (tag == 50) {
                                        rVar.readMessage(getDialogAgentForwarderParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 6;
                                    } else if (tag != 8002) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getEmptyParamFieldBuilder().getBuilder(), m8);
                                        this.testParamCase_ = 1000;
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

            public enum TestParamCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
                SPEECH_RECOGNITION_PARAM(1),
                IMAGE_RECOGNITION_PARAM(2),
                VIDEO_PARAM(3),
                GESTURE_PARAM(4),
                KEYBOARD_PARAM(5),
                DIALOG_AGENT_FORWARDER_PARAM(6),
                EMPTY_PARAM(1000),
                TESTPARAM_NOT_SET(0);

                private final int value;

                TestParamCase(int i8) {
                    this.value = i8;
                }

                public static TestParamCase forNumber(int i8) {
                    if (i8 == 1000) {
                        return EMPTY_PARAM;
                    }
                    switch (i8) {
                        case 0:
                            return TESTPARAM_NOT_SET;
                        case 1:
                            return SPEECH_RECOGNITION_PARAM;
                        case 2:
                            return IMAGE_RECOGNITION_PARAM;
                        case 3:
                            return VIDEO_PARAM;
                        case 4:
                            return GESTURE_PARAM;
                        case 5:
                            return KEYBOARD_PARAM;
                        case 6:
                            return DIALOG_AGENT_FORWARDER_PARAM;
                        default:
                            return null;
                    }
                }

                @Override // com.google.protobuf.AbstractC5227l0.c
                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static TestParamCase valueOf(int i8) {
                    return forNumber(i8);
                }
            }

            /* synthetic */ EventParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static EventParam getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_EventStream_EventParam_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EventParam parseDelimitedFrom(InputStream inputStream) {
                return (EventParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventParam parseFrom(ByteBuffer byteBuffer) {
                return (EventParam) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EventParam)) {
                    return super.equals(obj);
                }
                EventParam eventParam = (EventParam) obj;
                if (!getTestParamCase().equals(eventParam.getTestParamCase())) {
                    return false;
                }
                int i8 = this.testParamCase_;
                if (i8 != 1000) {
                    switch (i8) {
                        case 1:
                            if (!getSpeechRecognitionParam().equals(eventParam.getSpeechRecognitionParam())) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!getImageRecognitionParam().equals(eventParam.getImageRecognitionParam())) {
                                return false;
                            }
                            break;
                        case 3:
                            if (!getVideoParam().equals(eventParam.getVideoParam())) {
                                return false;
                            }
                            break;
                        case 4:
                            if (!getGestureParam().equals(eventParam.getGestureParam())) {
                                return false;
                            }
                            break;
                        case 5:
                            if (!getKeyboardParam().equals(eventParam.getKeyboardParam())) {
                                return false;
                            }
                            break;
                        case 6:
                            if (!getDialogAgentForwarderParam().equals(eventParam.getDialogAgentForwarderParam())) {
                                return false;
                            }
                            break;
                    }
                } else if (!getEmptyParam().equals(eventParam.getEmptyParam())) {
                    return false;
                }
                return getUnknownFields().equals(eventParam.getUnknownFields());
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public EventOuterClass.DialogAgentForwarderParam getDialogAgentForwarderParam() {
                return this.testParamCase_ == 6 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public EventOuterClass.DialogAgentForwarderParamOrBuilder getDialogAgentForwarderParamOrBuilder() {
                return this.testParamCase_ == 6 ? (EventOuterClass.DialogAgentForwarderParam) this.testParam_ : EventOuterClass.DialogAgentForwarderParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public F getEmptyParam() {
                return this.testParamCase_ == 1000 ? (F) this.testParam_ : F.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public G getEmptyParamOrBuilder() {
                return this.testParamCase_ == 1000 ? (F) this.testParam_ : F.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public GestureParam getGestureParam() {
                return this.testParamCase_ == 4 ? (GestureParam) this.testParam_ : GestureParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public GestureParamOrBuilder getGestureParamOrBuilder() {
                return this.testParamCase_ == 4 ? (GestureParam) this.testParam_ : GestureParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public AbstractC6551a.c getImageRecognitionParam() {
                return this.testParamCase_ == 2 ? (AbstractC6551a.c) this.testParam_ : AbstractC6551a.c.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public AbstractC6551a.d getImageRecognitionParamOrBuilder() {
                return this.testParamCase_ == 2 ? (AbstractC6551a.c) this.testParam_ : AbstractC6551a.c.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public KeyboardParam getKeyboardParam() {
                return this.testParamCase_ == 5 ? (KeyboardParam) this.testParam_ : KeyboardParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public KeyboardParamOrBuilder getKeyboardParamOrBuilder() {
                return this.testParamCase_ == 5 ? (KeyboardParam) this.testParam_ : KeyboardParam.getDefaultInstance();
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
                int iComputeMessageSize = this.testParamCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (AbstractC6650a.b) this.testParam_) : 0;
                if (this.testParamCase_ == 2) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (AbstractC6551a.c) this.testParam_);
                }
                if (this.testParamCase_ == 3) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(3, (VideoParam) this.testParam_);
                }
                if (this.testParamCase_ == 4) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(4, (GestureParam) this.testParam_);
                }
                if (this.testParamCase_ == 5) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(5, (KeyboardParam) this.testParam_);
                }
                if (this.testParamCase_ == 6) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(6, (EventOuterClass.DialogAgentForwarderParam) this.testParam_);
                }
                if (this.testParamCase_ == 1000) {
                    iComputeMessageSize += AbstractC5248t.computeMessageSize(1000, (F) this.testParam_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public AbstractC6650a.b getSpeechRecognitionParam() {
                return this.testParamCase_ == 1 ? (AbstractC6650a.b) this.testParam_ : AbstractC6650a.b.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public AbstractC6650a.c getSpeechRecognitionParamOrBuilder() {
                return this.testParamCase_ == 1 ? (AbstractC6650a.b) this.testParam_ : AbstractC6650a.b.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public TestParamCase getTestParamCase() {
                return TestParamCase.forNumber(this.testParamCase_);
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public VideoParam getVideoParam() {
                return this.testParamCase_ == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public VideoParamOrBuilder getVideoParamOrBuilder() {
                return this.testParamCase_ == 3 ? (VideoParam) this.testParam_ : VideoParam.getDefaultInstance();
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasDialogAgentForwarderParam() {
                return this.testParamCase_ == 6;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasEmptyParam() {
                return this.testParamCase_ == 1000;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasGestureParam() {
                return this.testParamCase_ == 4;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasImageRecognitionParam() {
                return this.testParamCase_ == 2;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasKeyboardParam() {
                return this.testParamCase_ == 5;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasSpeechRecognitionParam() {
                return this.testParamCase_ == 1;
            }

            @Override // maum.m2u.map.Map.EventStream.EventParamOrBuilder
            public boolean hasVideoParam() {
                return this.testParamCase_ == 3;
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
                int i10 = this.testParamCase_;
                if (i10 != 1000) {
                    switch (i10) {
                        case 1:
                            i8 = ((iHashCode2 * 37) + 1) * 53;
                            iHashCode = getSpeechRecognitionParam().hashCode();
                            break;
                        case 2:
                            i8 = ((iHashCode2 * 37) + 2) * 53;
                            iHashCode = getImageRecognitionParam().hashCode();
                            break;
                        case 3:
                            i8 = ((iHashCode2 * 37) + 3) * 53;
                            iHashCode = getVideoParam().hashCode();
                            break;
                        case 4:
                            i8 = ((iHashCode2 * 37) + 4) * 53;
                            iHashCode = getGestureParam().hashCode();
                            break;
                        case 5:
                            i8 = ((iHashCode2 * 37) + 5) * 53;
                            iHashCode = getKeyboardParam().hashCode();
                            break;
                        case 6:
                            i8 = ((iHashCode2 * 37) + 6) * 53;
                            iHashCode = getDialogAgentForwarderParam().hashCode();
                            break;
                    }
                } else {
                    i8 = ((iHashCode2 * 37) + 1000) * 53;
                    iHashCode = getEmptyParam().hashCode();
                }
                iHashCode2 = i8 + iHashCode;
                int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_EventStream_EventParam_fieldAccessorTable.ensureFieldAccessorsInitialized(EventParam.class, Builder.class);
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
                return new EventParam();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (this.testParamCase_ == 1) {
                    abstractC5248t.writeMessage(1, (AbstractC6650a.b) this.testParam_);
                }
                if (this.testParamCase_ == 2) {
                    abstractC5248t.writeMessage(2, (AbstractC6551a.c) this.testParam_);
                }
                if (this.testParamCase_ == 3) {
                    abstractC5248t.writeMessage(3, (VideoParam) this.testParam_);
                }
                if (this.testParamCase_ == 4) {
                    abstractC5248t.writeMessage(4, (GestureParam) this.testParam_);
                }
                if (this.testParamCase_ == 5) {
                    abstractC5248t.writeMessage(5, (KeyboardParam) this.testParam_);
                }
                if (this.testParamCase_ == 6) {
                    abstractC5248t.writeMessage(6, (EventOuterClass.DialogAgentForwarderParam) this.testParam_);
                }
                if (this.testParamCase_ == 1000) {
                    abstractC5248t.writeMessage(1000, (F) this.testParam_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private EventParam(AbstractC5209f0.b bVar) {
                super(bVar);
                this.testParamCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(EventParam eventParam) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventParam);
            }

            public static EventParam parseFrom(ByteBuffer byteBuffer, M m8) {
                return (EventParam) PARSER.parseFrom(byteBuffer, m8);
            }

            public static EventParam parseDelimitedFrom(InputStream inputStream, M m8) {
                return (EventParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static EventParam parseFrom(AbstractC5235o abstractC5235o) {
                return (EventParam) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public EventParam getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static EventParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (EventParam) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EventParam() {
                this.testParamCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EventParam parseFrom(byte[] bArr) {
                return (EventParam) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static EventParam parseFrom(byte[] bArr, M m8) {
                return (EventParam) PARSER.parseFrom(bArr, m8);
            }

            public static EventParam parseFrom(InputStream inputStream) {
                return (EventParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static EventParam parseFrom(InputStream inputStream, M m8) {
                return (EventParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static EventParam parseFrom(r rVar) {
                return (EventParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static EventParam parseFrom(r rVar, M m8) {
                return (EventParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface EventParamOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ java.util.Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            EventOuterClass.DialogAgentForwarderParam getDialogAgentForwarderParam();

            EventOuterClass.DialogAgentForwarderParamOrBuilder getDialogAgentForwarderParamOrBuilder();

            F getEmptyParam();

            G getEmptyParamOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            GestureParam getGestureParam();

            GestureParamOrBuilder getGestureParamOrBuilder();

            AbstractC6551a.c getImageRecognitionParam();

            AbstractC6551a.d getImageRecognitionParamOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            KeyboardParam getKeyboardParam();

            KeyboardParamOrBuilder getKeyboardParamOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            AbstractC6650a.b getSpeechRecognitionParam();

            AbstractC6650a.c getSpeechRecognitionParamOrBuilder();

            EventParam.TestParamCase getTestParamCase();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            VideoParam getVideoParam();

            VideoParamOrBuilder getVideoParamOrBuilder();

            boolean hasDialogAgentForwarderParam();

            boolean hasEmptyParam();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            boolean hasGestureParam();

            boolean hasImageRecognitionParam();

            boolean hasKeyboardParam();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            boolean hasSpeechRecognitionParam();

            boolean hasVideoParam();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ EventStream(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$7876(EventStream eventStream, int i8) {
            int i9 = i8 | eventStream.bitField0_;
            eventStream.bitField0_ = i9;
            return i9;
        }

        public static EventStream getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_EventStream_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventStream parseDelimitedFrom(InputStream inputStream) {
            return (EventStream) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventStream parseFrom(ByteBuffer byteBuffer) {
            return (EventStream) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventStream)) {
                return super.equals(obj);
            }
            EventStream eventStream = (EventStream) obj;
            if (hasInterface() != eventStream.hasInterface()) {
                return false;
            }
            if ((hasInterface() && !getInterface().equals(eventStream.getInterface())) || !getStreamId().equals(eventStream.getStreamId()) || !getOperationSyncId().equals(eventStream.getOperationSyncId()) || !getContextsList().equals(eventStream.getContextsList()) || hasParam() != eventStream.hasParam()) {
                return false;
            }
            if ((hasParam() && !getParam().equals(eventStream.getParam())) || hasPayload() != eventStream.hasPayload()) {
                return false;
            }
            if ((!hasPayload() || getPayload().equals(eventStream.getPayload())) && hasBeginAt() == eventStream.hasBeginAt()) {
                return (!hasBeginAt() || getBeginAt().equals(eventStream.getBeginAt())) && getUnknownFields().equals(eventStream.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public w1 getBeginAt() {
            w1 w1Var = this.beginAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public x1 getBeginAtOrBuilder() {
            w1 w1Var = this.beginAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public EventContext getContexts(int i8) {
            return this.contexts_.get(i8);
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public int getContextsCount() {
            return this.contexts_.size();
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public List<EventContext> getContextsList() {
            return this.contexts_;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public EventContextOrBuilder getContextsOrBuilder(int i8) {
            return this.contexts_.get(i8);
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public List<? extends EventContextOrBuilder> getContextsOrBuilderList() {
            return this.contexts_;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public AsyncInterface getInterface() {
            AsyncInterface asyncInterface = this.interface_;
            return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public AsyncInterfaceOrBuilder getInterfaceOrBuilder() {
            AsyncInterface asyncInterface = this.interface_;
            return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public String getOperationSyncId() {
            Object obj = this.operationSyncId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operationSyncId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public AbstractC5235o getOperationSyncIdBytes() {
            Object obj = this.operationSyncId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operationSyncId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public EventParam getParam() {
            EventParam eventParam = this.param_;
            return eventParam == null ? EventParam.getDefaultInstance() : eventParam;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public EventParamOrBuilder getParamOrBuilder() {
            EventParam eventParam = this.param_;
            return eventParam == null ? EventParam.getDefaultInstance() : eventParam;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public C5240p1 getPayload() {
            C5240p1 c5240p1 = this.payload_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public InterfaceC5243q1 getPayloadOrBuilder() {
            C5240p1 c5240p1 = this.payload_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getInterface()) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(2, this.streamId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operationSyncId_)) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(3, this.operationSyncId_);
            }
            for (int i9 = 0; i9 < this.contexts_.size(); i9++) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(11, this.contexts_.get(i9));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(12, getParam());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(99, getPayload());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(100, getBeginAt());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public String getStreamId() {
            Object obj = this.streamId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.streamId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public AbstractC5235o getStreamIdBytes() {
            Object obj = this.streamId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.streamId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public boolean hasBeginAt() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public boolean hasInterface() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public boolean hasParam() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // maum.m2u.map.Map.EventStreamOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasInterface()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInterface().hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 2) * 53) + getStreamId().hashCode()) * 37) + 3) * 53) + getOperationSyncId().hashCode();
            if (getContextsCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 11) * 53) + getContextsList().hashCode();
            }
            if (hasParam()) {
                iHashCode2 = (((iHashCode2 * 37) + 12) * 53) + getParam().hashCode();
            }
            if (hasPayload()) {
                iHashCode2 = (((iHashCode2 * 37) + 99) * 53) + getPayload().hashCode();
            }
            if (hasBeginAt()) {
                iHashCode2 = (((iHashCode2 * 37) + 100) * 53) + getBeginAt().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_EventStream_fieldAccessorTable.ensureFieldAccessorsInitialized(EventStream.class, Builder.class);
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
            return new EventStream();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getInterface());
            }
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.streamId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operationSyncId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.operationSyncId_);
            }
            for (int i8 = 0; i8 < this.contexts_.size(); i8++) {
                abstractC5248t.writeMessage(11, this.contexts_.get(i8));
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(12, getParam());
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC5248t.writeMessage(99, getPayload());
            }
            if ((this.bitField0_ & 8) != 0) {
                abstractC5248t.writeMessage(100, getBeginAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private EventStream(AbstractC5209f0.b bVar) {
            super(bVar);
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(EventStream eventStream) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventStream);
        }

        public static EventStream parseFrom(ByteBuffer byteBuffer, M m8) {
            return (EventStream) PARSER.parseFrom(byteBuffer, m8);
        }

        public static EventStream parseDelimitedFrom(InputStream inputStream, M m8) {
            return (EventStream) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static EventStream parseFrom(AbstractC5235o abstractC5235o) {
            return (EventStream) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public EventStream getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static EventStream parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (EventStream) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventStream parseFrom(byte[] bArr) {
            return (EventStream) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private EventStream() {
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.contexts_ = Collections.emptyList();
        }

        public static EventStream parseFrom(byte[] bArr, M m8) {
            return (EventStream) PARSER.parseFrom(bArr, m8);
        }

        public static EventStream parseFrom(InputStream inputStream) {
            return (EventStream) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static EventStream parseFrom(InputStream inputStream, M m8) {
            return (EventStream) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static EventStream parseFrom(r rVar) {
            return (EventStream) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static EventStream parseFrom(r rVar, M m8) {
            return (EventStream) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface EventStreamOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        w1 getBeginAt();

        x1 getBeginAtOrBuilder();

        EventStream.EventContext getContexts(int i8);

        int getContextsCount();

        List<EventStream.EventContext> getContextsList();

        EventStream.EventContextOrBuilder getContextsOrBuilder(int i8);

        List<? extends EventStream.EventContextOrBuilder> getContextsOrBuilderList();

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

        AsyncInterface getInterface();

        AsyncInterfaceOrBuilder getInterfaceOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperationSyncId();

        AbstractC5235o getOperationSyncIdBytes();

        EventStream.EventParam getParam();

        EventStream.EventParamOrBuilder getParamOrBuilder();

        C5240p1 getPayload();

        InterfaceC5243q1 getPayloadOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getStreamId();

        AbstractC5235o getStreamIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasBeginAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasInterface();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasParam();

        boolean hasPayload();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class GestureParam extends AbstractC5209f0 implements GestureParamOrBuilder {
        private static final GestureParam DEFAULT_INSTANCE = new GestureParam();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.GestureParam.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public GestureParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = GestureParam.newBuilder();
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
        public static final int TODO_FIELD_NUMBER = 99999;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object todo_;

        public static final class Builder extends AbstractC5209f0.b implements GestureParamOrBuilder {
            private int bitField0_;
            private Object todo_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(GestureParam gestureParam) {
                if ((this.bitField0_ & 1) != 0) {
                    gestureParam.todo_ = this.todo_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_GestureParam_descriptor;
            }

            public Builder clearTodo() {
                this.todo_ = GestureParam.getDefaultInstance().getTodo();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_GestureParam_descriptor;
            }

            @Override // maum.m2u.map.Map.GestureParamOrBuilder
            public String getTodo() {
                Object obj = this.todo_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.todo_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.GestureParamOrBuilder
            public AbstractC5235o getTodoBytes() {
                Object obj = this.todo_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.todo_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_GestureParam_fieldAccessorTable.ensureFieldAccessorsInitialized(GestureParam.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setTodo(String str) {
                str.getClass();
                this.todo_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTodoBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.todo_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.todo_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GestureParam build() {
                GestureParam gestureParamBuildPartial = buildPartial();
                if (gestureParamBuildPartial.isInitialized()) {
                    return gestureParamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) gestureParamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GestureParam buildPartial() {
                GestureParam gestureParam = new GestureParam(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(gestureParam);
                }
                onBuilt();
                return gestureParam;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public GestureParam getDefaultInstanceForType() {
                return GestureParam.getDefaultInstance();
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
                this.todo_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.todo_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof GestureParam) {
                    return mergeFrom((GestureParam) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(GestureParam gestureParam) {
                if (gestureParam == GestureParam.getDefaultInstance()) {
                    return this;
                }
                if (!gestureParam.getTodo().isEmpty()) {
                    this.todo_ = gestureParam.todo_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(gestureParam.getUnknownFields());
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
                                if (tag != 799994) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.todo_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
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

        /* synthetic */ GestureParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static GestureParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_GestureParam_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GestureParam parseDelimitedFrom(InputStream inputStream) {
            return (GestureParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GestureParam parseFrom(ByteBuffer byteBuffer) {
            return (GestureParam) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GestureParam)) {
                return super.equals(obj);
            }
            GestureParam gestureParam = (GestureParam) obj;
            return getTodo().equals(gestureParam.getTodo()) && getUnknownFields().equals(gestureParam.getUnknownFields());
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
            int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.todo_) ? AbstractC5209f0.computeStringSize(99999, this.todo_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // maum.m2u.map.Map.GestureParamOrBuilder
        public String getTodo() {
            Object obj = this.todo_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.todo_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.GestureParamOrBuilder
        public AbstractC5235o getTodoBytes() {
            Object obj = this.todo_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.todo_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 99999) * 53) + getTodo().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_GestureParam_fieldAccessorTable.ensureFieldAccessorsInitialized(GestureParam.class, Builder.class);
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
            return new GestureParam();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.todo_)) {
                AbstractC5209f0.writeString(abstractC5248t, 99999, this.todo_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private GestureParam(AbstractC5209f0.b bVar) {
            super(bVar);
            this.todo_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GestureParam gestureParam) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gestureParam);
        }

        public static GestureParam parseFrom(ByteBuffer byteBuffer, M m8) {
            return (GestureParam) PARSER.parseFrom(byteBuffer, m8);
        }

        public static GestureParam parseDelimitedFrom(InputStream inputStream, M m8) {
            return (GestureParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static GestureParam parseFrom(AbstractC5235o abstractC5235o) {
            return (GestureParam) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public GestureParam getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static GestureParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (GestureParam) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GestureParam() {
            this.todo_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.todo_ = "";
        }

        public static GestureParam parseFrom(byte[] bArr) {
            return (GestureParam) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static GestureParam parseFrom(byte[] bArr, M m8) {
            return (GestureParam) PARSER.parseFrom(bArr, m8);
        }

        public static GestureParam parseFrom(InputStream inputStream) {
            return (GestureParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static GestureParam parseFrom(InputStream inputStream, M m8) {
            return (GestureParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static GestureParam parseFrom(r rVar) {
            return (GestureParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static GestureParam parseFrom(r rVar, M m8) {
            return (GestureParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface GestureParamOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

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

        String getTodo();

        AbstractC5235o getTodoBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class KeyboardParam extends AbstractC5209f0 implements KeyboardParamOrBuilder {
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int TYPED_LENGTH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private B duration_;
        private byte memoizedIsInitialized;
        private int typedLength_;
        private static final KeyboardParam DEFAULT_INSTANCE = new KeyboardParam();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.KeyboardParam.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public KeyboardParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = KeyboardParam.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements KeyboardParamOrBuilder {
            private int bitField0_;
            private C5228l1 durationBuilder_;
            private B duration_;
            private int typedLength_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(KeyboardParam keyboardParam) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    keyboardParam.typedLength_ = this.typedLength_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.durationBuilder_;
                    keyboardParam.duration_ = c5228l1 == null ? this.duration_ : (B) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                KeyboardParam.access$20976(keyboardParam, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_KeyboardParam_descriptor;
            }

            private C5228l1 getDurationFieldBuilder() {
                if (this.durationBuilder_ == null) {
                    this.durationBuilder_ = new C5228l1(getDuration(), getParentForChildren(), isClean());
                    this.duration_ = null;
                }
                return this.durationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getDurationFieldBuilder();
                }
            }

            public Builder clearDuration() {
                this.bitField0_ &= -3;
                this.duration_ = null;
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.durationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTypedLength() {
                this.bitField0_ &= -2;
                this.typedLength_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_KeyboardParam_descriptor;
            }

            @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
            public B getDuration() {
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 != null) {
                    return (B) c5228l1.getMessage();
                }
                B b9 = this.duration_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            public B.b getDurationBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (B.b) getDurationFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
            public C getDurationOrBuilder() {
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 != null) {
                    return (C) c5228l1.getMessageOrBuilder();
                }
                B b9 = this.duration_;
                return b9 == null ? B.getDefaultInstance() : b9;
            }

            @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
            public int getTypedLength() {
                return this.typedLength_;
            }

            @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
            public boolean hasDuration() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_KeyboardParam_fieldAccessorTable.ensureFieldAccessorsInitialized(KeyboardParam.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDuration(B b9) {
                B b10;
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(b9);
                } else if ((this.bitField0_ & 2) == 0 || (b10 = this.duration_) == null || b10 == B.getDefaultInstance()) {
                    this.duration_ = b9;
                } else {
                    getDurationBuilder().mergeFrom(b9);
                }
                if (this.duration_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setDuration(B b9) {
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 == null) {
                    b9.getClass();
                    this.duration_ = b9;
                } else {
                    c5228l1.setMessage(b9);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTypedLength(int i8) {
                this.typedLength_ = i8;
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
            public KeyboardParam build() {
                KeyboardParam keyboardParamBuildPartial = buildPartial();
                if (keyboardParamBuildPartial.isInitialized()) {
                    return keyboardParamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) keyboardParamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public KeyboardParam buildPartial() {
                KeyboardParam keyboardParam = new KeyboardParam(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(keyboardParam);
                }
                onBuilt();
                return keyboardParam;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public KeyboardParam getDefaultInstanceForType() {
                return KeyboardParam.getDefaultInstance();
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
                this.typedLength_ = 0;
                this.duration_ = null;
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.durationBuilder_ = null;
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
                if (h02 instanceof KeyboardParam) {
                    return mergeFrom((KeyboardParam) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setDuration(B.b bVar) {
                C5228l1 c5228l1 = this.durationBuilder_;
                if (c5228l1 == null) {
                    this.duration_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(KeyboardParam keyboardParam) {
                if (keyboardParam == KeyboardParam.getDefaultInstance()) {
                    return this;
                }
                if (keyboardParam.getTypedLength() != 0) {
                    setTypedLength(keyboardParam.getTypedLength());
                }
                if (keyboardParam.hasDuration()) {
                    mergeDuration(keyboardParam.getDuration());
                }
                mergeUnknownFields(keyboardParam.getUnknownFields());
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
                                if (tag == 8) {
                                    this.typedLength_ = rVar.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getDurationFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ KeyboardParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$20976(KeyboardParam keyboardParam, int i8) {
            int i9 = i8 | keyboardParam.bitField0_;
            keyboardParam.bitField0_ = i9;
            return i9;
        }

        public static KeyboardParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_KeyboardParam_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static KeyboardParam parseDelimitedFrom(InputStream inputStream) {
            return (KeyboardParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static KeyboardParam parseFrom(ByteBuffer byteBuffer) {
            return (KeyboardParam) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyboardParam)) {
                return super.equals(obj);
            }
            KeyboardParam keyboardParam = (KeyboardParam) obj;
            if (getTypedLength() == keyboardParam.getTypedLength() && hasDuration() == keyboardParam.hasDuration()) {
                return (!hasDuration() || getDuration().equals(keyboardParam.getDuration())) && getUnknownFields().equals(keyboardParam.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
        public B getDuration() {
            B b9 = this.duration_;
            return b9 == null ? B.getDefaultInstance() : b9;
        }

        @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
        public C getDurationOrBuilder() {
            B b9 = this.duration_;
            return b9 == null ? B.getDefaultInstance() : b9;
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
            int i9 = this.typedLength_;
            int iComputeInt32Size = i9 != 0 ? AbstractC5248t.computeInt32Size(1, i9) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeInt32Size += AbstractC5248t.computeMessageSize(2, getDuration());
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
        public int getTypedLength() {
            return this.typedLength_;
        }

        @Override // maum.m2u.map.Map.KeyboardParamOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTypedLength();
            if (hasDuration()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDuration().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_KeyboardParam_fieldAccessorTable.ensureFieldAccessorsInitialized(KeyboardParam.class, Builder.class);
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
            return new KeyboardParam();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            int i8 = this.typedLength_;
            if (i8 != 0) {
                abstractC5248t.writeInt32(1, i8);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getDuration());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private KeyboardParam(AbstractC5209f0.b bVar) {
            super(bVar);
            this.typedLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(KeyboardParam keyboardParam) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(keyboardParam);
        }

        public static KeyboardParam parseFrom(ByteBuffer byteBuffer, M m8) {
            return (KeyboardParam) PARSER.parseFrom(byteBuffer, m8);
        }

        public static KeyboardParam parseDelimitedFrom(InputStream inputStream, M m8) {
            return (KeyboardParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static KeyboardParam parseFrom(AbstractC5235o abstractC5235o) {
            return (KeyboardParam) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public KeyboardParam getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static KeyboardParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (KeyboardParam) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private KeyboardParam() {
            this.typedLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KeyboardParam parseFrom(byte[] bArr) {
            return (KeyboardParam) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static KeyboardParam parseFrom(byte[] bArr, M m8) {
            return (KeyboardParam) PARSER.parseFrom(bArr, m8);
        }

        public static KeyboardParam parseFrom(InputStream inputStream) {
            return (KeyboardParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static KeyboardParam parseFrom(InputStream inputStream, M m8) {
            return (KeyboardParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static KeyboardParam parseFrom(r rVar) {
            return (KeyboardParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static KeyboardParam parseFrom(r rVar, M m8) {
            return (KeyboardParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface KeyboardParamOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        B getDuration();

        C getDurationOrBuilder();

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

        int getTypedLength();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasDuration();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class MapDirective extends AbstractC5209f0 implements MapDirectiveOrBuilder {
        public static final int BYTES_FIELD_NUMBER = 11;
        public static final int DIRECTIVE_FIELD_NUMBER = 1;
        public static final int EXCEPTION_FIELD_NUMBER = 99;
        public static final int META_FIELD_NUMBER = 21;
        public static final int STREAM_BREAK_FIELD_NUMBER = 3;
        public static final int STREAM_END_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int testDirectiveCase_;
        private Object testDirective_;
        private static final MapDirective DEFAULT_INSTANCE = new MapDirective();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.MapDirective.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public MapDirective parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = MapDirective.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements MapDirectiveOrBuilder {
            private int bitField0_;
            private C5228l1 directiveBuilder_;
            private C5228l1 exceptionBuilder_;
            private C5228l1 metaBuilder_;
            private C5228l1 streamBreakBuilder_;
            private C5228l1 streamEndBuilder_;
            private int testDirectiveCase_;
            private Object testDirective_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(MapDirective mapDirective) {
            }

            private void buildPartialOneofs(MapDirective mapDirective) {
                C5228l1 c5228l1;
                C5228l1 c5228l12;
                C5228l1 c5228l13;
                C5228l1 c5228l14;
                C5228l1 c5228l15;
                mapDirective.testDirectiveCase_ = this.testDirectiveCase_;
                mapDirective.testDirective_ = this.testDirective_;
                if (this.testDirectiveCase_ == 1 && (c5228l15 = this.directiveBuilder_) != null) {
                    mapDirective.testDirective_ = c5228l15.build();
                }
                if (this.testDirectiveCase_ == 2 && (c5228l14 = this.streamEndBuilder_) != null) {
                    mapDirective.testDirective_ = c5228l14.build();
                }
                if (this.testDirectiveCase_ == 3 && (c5228l13 = this.streamBreakBuilder_) != null) {
                    mapDirective.testDirective_ = c5228l13.build();
                }
                if (this.testDirectiveCase_ == 21 && (c5228l12 = this.metaBuilder_) != null) {
                    mapDirective.testDirective_ = c5228l12.build();
                }
                if (this.testDirectiveCase_ != 99 || (c5228l1 = this.exceptionBuilder_) == null) {
                    return;
                }
                mapDirective.testDirective_ = c5228l1.build();
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_MapDirective_descriptor;
            }

            private C5228l1 getDirectiveFieldBuilder() {
                if (this.directiveBuilder_ == null) {
                    if (this.testDirectiveCase_ != 1) {
                        this.testDirective_ = DirectiveStream.getDefaultInstance();
                    }
                    this.directiveBuilder_ = new C5228l1((DirectiveStream) this.testDirective_, getParentForChildren(), isClean());
                    this.testDirective_ = null;
                }
                this.testDirectiveCase_ = 1;
                onChanged();
                return this.directiveBuilder_;
            }

            private C5228l1 getExceptionFieldBuilder() {
                if (this.exceptionBuilder_ == null) {
                    if (this.testDirectiveCase_ != 99) {
                        this.testDirective_ = MapException.getDefaultInstance();
                    }
                    this.exceptionBuilder_ = new C5228l1((MapException) this.testDirective_, getParentForChildren(), isClean());
                    this.testDirective_ = null;
                }
                this.testDirectiveCase_ = 99;
                onChanged();
                return this.exceptionBuilder_;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    if (this.testDirectiveCase_ != 21) {
                        this.testDirective_ = StreamMeta.getDefaultInstance();
                    }
                    this.metaBuilder_ = new C5228l1((StreamMeta) this.testDirective_, getParentForChildren(), isClean());
                    this.testDirective_ = null;
                }
                this.testDirectiveCase_ = 21;
                onChanged();
                return this.metaBuilder_;
            }

            private C5228l1 getStreamBreakFieldBuilder() {
                if (this.streamBreakBuilder_ == null) {
                    if (this.testDirectiveCase_ != 3) {
                        this.testDirective_ = StreamBreak.getDefaultInstance();
                    }
                    this.streamBreakBuilder_ = new C5228l1((StreamBreak) this.testDirective_, getParentForChildren(), isClean());
                    this.testDirective_ = null;
                }
                this.testDirectiveCase_ = 3;
                onChanged();
                return this.streamBreakBuilder_;
            }

            private C5228l1 getStreamEndFieldBuilder() {
                if (this.streamEndBuilder_ == null) {
                    if (this.testDirectiveCase_ != 2) {
                        this.testDirective_ = StreamEnd.getDefaultInstance();
                    }
                    this.streamEndBuilder_ = new C5228l1((StreamEnd) this.testDirective_, getParentForChildren(), isClean());
                    this.testDirective_ = null;
                }
                this.testDirectiveCase_ = 2;
                onChanged();
                return this.streamEndBuilder_;
            }

            public Builder clearBytes() {
                if (this.testDirectiveCase_ == 11) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearDirective() {
                C5228l1 c5228l1 = this.directiveBuilder_;
                if (c5228l1 != null) {
                    if (this.testDirectiveCase_ == 1) {
                        this.testDirectiveCase_ = 0;
                        this.testDirective_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testDirectiveCase_ == 1) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearException() {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 != null) {
                    if (this.testDirectiveCase_ == 99) {
                        this.testDirectiveCase_ = 0;
                        this.testDirective_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testDirectiveCase_ == 99) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    if (this.testDirectiveCase_ == 21) {
                        this.testDirectiveCase_ = 0;
                        this.testDirective_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testDirectiveCase_ == 21) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearStreamBreak() {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 != null) {
                    if (this.testDirectiveCase_ == 3) {
                        this.testDirectiveCase_ = 0;
                        this.testDirective_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testDirectiveCase_ == 3) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearStreamEnd() {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 != null) {
                    if (this.testDirectiveCase_ == 2) {
                        this.testDirectiveCase_ = 0;
                        this.testDirective_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testDirectiveCase_ == 2) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTestDirective() {
                this.testDirectiveCase_ = 0;
                this.testDirective_ = null;
                onChanged();
                return this;
            }

            public Builder clearText() {
                if (this.testDirectiveCase_ == 12) {
                    this.testDirectiveCase_ = 0;
                    this.testDirective_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public AbstractC5235o getBytes() {
                return this.testDirectiveCase_ == 11 ? (AbstractC5235o) this.testDirective_ : AbstractC5235o.EMPTY;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_MapDirective_descriptor;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public DirectiveStream getDirective() {
                C5228l1 c5228l1 = this.directiveBuilder_;
                return c5228l1 == null ? this.testDirectiveCase_ == 1 ? (DirectiveStream) this.testDirective_ : DirectiveStream.getDefaultInstance() : this.testDirectiveCase_ == 1 ? (DirectiveStream) c5228l1.getMessage() : DirectiveStream.getDefaultInstance();
            }

            public DirectiveStream.Builder getDirectiveBuilder() {
                return (DirectiveStream.Builder) getDirectiveFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public DirectiveStreamOrBuilder getDirectiveOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testDirectiveCase_;
                return (i8 != 1 || (c5228l1 = this.directiveBuilder_) == null) ? i8 == 1 ? (DirectiveStream) this.testDirective_ : DirectiveStream.getDefaultInstance() : (DirectiveStreamOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public MapException getException() {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                return c5228l1 == null ? this.testDirectiveCase_ == 99 ? (MapException) this.testDirective_ : MapException.getDefaultInstance() : this.testDirectiveCase_ == 99 ? (MapException) c5228l1.getMessage() : MapException.getDefaultInstance();
            }

            public MapException.Builder getExceptionBuilder() {
                return (MapException.Builder) getExceptionFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public MapExceptionOrBuilder getExceptionOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testDirectiveCase_;
                return (i8 != 99 || (c5228l1 = this.exceptionBuilder_) == null) ? i8 == 99 ? (MapException) this.testDirective_ : MapException.getDefaultInstance() : (MapExceptionOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public StreamMeta getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                return c5228l1 == null ? this.testDirectiveCase_ == 21 ? (StreamMeta) this.testDirective_ : StreamMeta.getDefaultInstance() : this.testDirectiveCase_ == 21 ? (StreamMeta) c5228l1.getMessage() : StreamMeta.getDefaultInstance();
            }

            public StreamMeta.Builder getMetaBuilder() {
                return (StreamMeta.Builder) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public StreamMetaOrBuilder getMetaOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testDirectiveCase_;
                return (i8 != 21 || (c5228l1 = this.metaBuilder_) == null) ? i8 == 21 ? (StreamMeta) this.testDirective_ : StreamMeta.getDefaultInstance() : (StreamMetaOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public StreamBreak getStreamBreak() {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                return c5228l1 == null ? this.testDirectiveCase_ == 3 ? (StreamBreak) this.testDirective_ : StreamBreak.getDefaultInstance() : this.testDirectiveCase_ == 3 ? (StreamBreak) c5228l1.getMessage() : StreamBreak.getDefaultInstance();
            }

            public StreamBreak.Builder getStreamBreakBuilder() {
                return (StreamBreak.Builder) getStreamBreakFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public StreamBreakOrBuilder getStreamBreakOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testDirectiveCase_;
                return (i8 != 3 || (c5228l1 = this.streamBreakBuilder_) == null) ? i8 == 3 ? (StreamBreak) this.testDirective_ : StreamBreak.getDefaultInstance() : (StreamBreakOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public StreamEnd getStreamEnd() {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                return c5228l1 == null ? this.testDirectiveCase_ == 2 ? (StreamEnd) this.testDirective_ : StreamEnd.getDefaultInstance() : this.testDirectiveCase_ == 2 ? (StreamEnd) c5228l1.getMessage() : StreamEnd.getDefaultInstance();
            }

            public StreamEnd.Builder getStreamEndBuilder() {
                return (StreamEnd.Builder) getStreamEndFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public StreamEndOrBuilder getStreamEndOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testDirectiveCase_;
                return (i8 != 2 || (c5228l1 = this.streamEndBuilder_) == null) ? i8 == 2 ? (StreamEnd) this.testDirective_ : StreamEnd.getDefaultInstance() : (StreamEndOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public TestDirectiveCase getTestDirectiveCase() {
                return TestDirectiveCase.forNumber(this.testDirectiveCase_);
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public String getText() {
                String str = this.testDirectiveCase_ == 12 ? this.testDirective_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
                if (this.testDirectiveCase_ == 12) {
                    this.testDirective_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public AbstractC5235o getTextBytes() {
                String str = this.testDirectiveCase_ == 12 ? this.testDirective_ : "";
                if (!(str instanceof String)) {
                    return (AbstractC5235o) str;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
                if (this.testDirectiveCase_ == 12) {
                    this.testDirective_ = abstractC5235oCopyFromUtf8;
                }
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasBytes() {
                return this.testDirectiveCase_ == 11;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasDirective() {
                return this.testDirectiveCase_ == 1;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasException() {
                return this.testDirectiveCase_ == 99;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasMeta() {
                return this.testDirectiveCase_ == 21;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasStreamBreak() {
                return this.testDirectiveCase_ == 3;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasStreamEnd() {
                return this.testDirectiveCase_ == 2;
            }

            @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
            public boolean hasText() {
                return this.testDirectiveCase_ == 12;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_MapDirective_fieldAccessorTable.ensureFieldAccessorsInitialized(MapDirective.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDirective(DirectiveStream directiveStream) {
                C5228l1 c5228l1 = this.directiveBuilder_;
                if (c5228l1 == null) {
                    if (this.testDirectiveCase_ != 1 || this.testDirective_ == DirectiveStream.getDefaultInstance()) {
                        this.testDirective_ = directiveStream;
                    } else {
                        this.testDirective_ = DirectiveStream.newBuilder((DirectiveStream) this.testDirective_).mergeFrom(directiveStream).buildPartial();
                    }
                    onChanged();
                } else if (this.testDirectiveCase_ == 1) {
                    c5228l1.mergeFrom(directiveStream);
                } else {
                    c5228l1.setMessage(directiveStream);
                }
                this.testDirectiveCase_ = 1;
                return this;
            }

            public Builder mergeException(MapException mapException) {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 == null) {
                    if (this.testDirectiveCase_ != 99 || this.testDirective_ == MapException.getDefaultInstance()) {
                        this.testDirective_ = mapException;
                    } else {
                        this.testDirective_ = MapException.newBuilder((MapException) this.testDirective_).mergeFrom(mapException).buildPartial();
                    }
                    onChanged();
                } else if (this.testDirectiveCase_ == 99) {
                    c5228l1.mergeFrom(mapException);
                } else {
                    c5228l1.setMessage(mapException);
                }
                this.testDirectiveCase_ = 99;
                return this;
            }

            public Builder mergeMeta(StreamMeta streamMeta) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    if (this.testDirectiveCase_ != 21 || this.testDirective_ == StreamMeta.getDefaultInstance()) {
                        this.testDirective_ = streamMeta;
                    } else {
                        this.testDirective_ = StreamMeta.newBuilder((StreamMeta) this.testDirective_).mergeFrom(streamMeta).buildPartial();
                    }
                    onChanged();
                } else if (this.testDirectiveCase_ == 21) {
                    c5228l1.mergeFrom(streamMeta);
                } else {
                    c5228l1.setMessage(streamMeta);
                }
                this.testDirectiveCase_ = 21;
                return this;
            }

            public Builder mergeStreamBreak(StreamBreak streamBreak) {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 == null) {
                    if (this.testDirectiveCase_ != 3 || this.testDirective_ == StreamBreak.getDefaultInstance()) {
                        this.testDirective_ = streamBreak;
                    } else {
                        this.testDirective_ = StreamBreak.newBuilder((StreamBreak) this.testDirective_).mergeFrom(streamBreak).buildPartial();
                    }
                    onChanged();
                } else if (this.testDirectiveCase_ == 3) {
                    c5228l1.mergeFrom(streamBreak);
                } else {
                    c5228l1.setMessage(streamBreak);
                }
                this.testDirectiveCase_ = 3;
                return this;
            }

            public Builder mergeStreamEnd(StreamEnd streamEnd) {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 == null) {
                    if (this.testDirectiveCase_ != 2 || this.testDirective_ == StreamEnd.getDefaultInstance()) {
                        this.testDirective_ = streamEnd;
                    } else {
                        this.testDirective_ = StreamEnd.newBuilder((StreamEnd) this.testDirective_).mergeFrom(streamEnd).buildPartial();
                    }
                    onChanged();
                } else if (this.testDirectiveCase_ == 2) {
                    c5228l1.mergeFrom(streamEnd);
                } else {
                    c5228l1.setMessage(streamEnd);
                }
                this.testDirectiveCase_ = 2;
                return this;
            }

            public Builder setBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                this.testDirectiveCase_ = 11;
                this.testDirective_ = abstractC5235o;
                onChanged();
                return this;
            }

            public Builder setDirective(DirectiveStream directiveStream) {
                C5228l1 c5228l1 = this.directiveBuilder_;
                if (c5228l1 == null) {
                    directiveStream.getClass();
                    this.testDirective_ = directiveStream;
                    onChanged();
                } else {
                    c5228l1.setMessage(directiveStream);
                }
                this.testDirectiveCase_ = 1;
                return this;
            }

            public Builder setException(MapException mapException) {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 == null) {
                    mapException.getClass();
                    this.testDirective_ = mapException;
                    onChanged();
                } else {
                    c5228l1.setMessage(mapException);
                }
                this.testDirectiveCase_ = 99;
                return this;
            }

            public Builder setMeta(StreamMeta streamMeta) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    streamMeta.getClass();
                    this.testDirective_ = streamMeta;
                    onChanged();
                } else {
                    c5228l1.setMessage(streamMeta);
                }
                this.testDirectiveCase_ = 21;
                return this;
            }

            public Builder setStreamBreak(StreamBreak streamBreak) {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 == null) {
                    streamBreak.getClass();
                    this.testDirective_ = streamBreak;
                    onChanged();
                } else {
                    c5228l1.setMessage(streamBreak);
                }
                this.testDirectiveCase_ = 3;
                return this;
            }

            public Builder setStreamEnd(StreamEnd streamEnd) {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 == null) {
                    streamEnd.getClass();
                    this.testDirective_ = streamEnd;
                    onChanged();
                } else {
                    c5228l1.setMessage(streamEnd);
                }
                this.testDirectiveCase_ = 2;
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.testDirectiveCase_ = 12;
                this.testDirective_ = str;
                onChanged();
                return this;
            }

            public Builder setTextBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.testDirectiveCase_ = 12;
                this.testDirective_ = abstractC5235o;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.testDirectiveCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MapDirective build() {
                MapDirective mapDirectiveBuildPartial = buildPartial();
                if (mapDirectiveBuildPartial.isInitialized()) {
                    return mapDirectiveBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) mapDirectiveBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MapDirective buildPartial() {
                MapDirective mapDirective = new MapDirective(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(mapDirective);
                }
                buildPartialOneofs(mapDirective);
                onBuilt();
                return mapDirective;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MapDirective getDefaultInstanceForType() {
                return MapDirective.getDefaultInstance();
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
                this.testDirectiveCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5228l1 c5228l1 = this.directiveBuilder_;
                if (c5228l1 != null) {
                    c5228l1.clear();
                }
                C5228l1 c5228l12 = this.streamEndBuilder_;
                if (c5228l12 != null) {
                    c5228l12.clear();
                }
                C5228l1 c5228l13 = this.streamBreakBuilder_;
                if (c5228l13 != null) {
                    c5228l13.clear();
                }
                C5228l1 c5228l14 = this.metaBuilder_;
                if (c5228l14 != null) {
                    c5228l14.clear();
                }
                C5228l1 c5228l15 = this.exceptionBuilder_;
                if (c5228l15 != null) {
                    c5228l15.clear();
                }
                this.testDirectiveCase_ = 0;
                this.testDirective_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof MapDirective) {
                    return mergeFrom((MapDirective) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setDirective(DirectiveStream.Builder builder) {
                C5228l1 c5228l1 = this.directiveBuilder_;
                if (c5228l1 == null) {
                    this.testDirective_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testDirectiveCase_ = 1;
                return this;
            }

            public Builder setException(MapException.Builder builder) {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 == null) {
                    this.testDirective_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testDirectiveCase_ = 99;
                return this;
            }

            public Builder setMeta(StreamMeta.Builder builder) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    this.testDirective_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testDirectiveCase_ = 21;
                return this;
            }

            public Builder setStreamBreak(StreamBreak.Builder builder) {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 == null) {
                    this.testDirective_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testDirectiveCase_ = 3;
                return this;
            }

            public Builder setStreamEnd(StreamEnd.Builder builder) {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 == null) {
                    this.testDirective_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testDirectiveCase_ = 2;
                return this;
            }

            public Builder mergeFrom(MapDirective mapDirective) {
                if (mapDirective == MapDirective.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass1.$SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[mapDirective.getTestDirectiveCase().ordinal()]) {
                    case 1:
                        mergeDirective(mapDirective.getDirective());
                        break;
                    case 2:
                        mergeStreamEnd(mapDirective.getStreamEnd());
                        break;
                    case 3:
                        mergeStreamBreak(mapDirective.getStreamBreak());
                        break;
                    case 4:
                        setBytes(mapDirective.getBytes());
                        break;
                    case 5:
                        this.testDirectiveCase_ = 12;
                        this.testDirective_ = mapDirective.testDirective_;
                        onChanged();
                        break;
                    case 6:
                        mergeMeta(mapDirective.getMeta());
                        break;
                    case 7:
                        mergeException(mapDirective.getException());
                        break;
                }
                mergeUnknownFields(mapDirective.getUnknownFields());
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
                                    rVar.readMessage(getDirectiveFieldBuilder().getBuilder(), m8);
                                    this.testDirectiveCase_ = 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getStreamEndFieldBuilder().getBuilder(), m8);
                                    this.testDirectiveCase_ = 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getStreamBreakFieldBuilder().getBuilder(), m8);
                                    this.testDirectiveCase_ = 3;
                                } else if (tag == 90) {
                                    this.testDirective_ = rVar.readBytes();
                                    this.testDirectiveCase_ = 11;
                                } else if (tag == 98) {
                                    String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                    this.testDirectiveCase_ = 12;
                                    this.testDirective_ = stringRequireUtf8;
                                } else if (tag == 170) {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.testDirectiveCase_ = 21;
                                } else if (tag != 794) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getExceptionFieldBuilder().getBuilder(), m8);
                                    this.testDirectiveCase_ = 99;
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

        public enum TestDirectiveCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
            DIRECTIVE(1),
            STREAM_END(2),
            STREAM_BREAK(3),
            BYTES(11),
            TEXT(12),
            META(21),
            EXCEPTION(99),
            TESTDIRECTIVE_NOT_SET(0);

            private final int value;

            TestDirectiveCase(int i8) {
                this.value = i8;
            }

            public static TestDirectiveCase forNumber(int i8) {
                if (i8 == 0) {
                    return TESTDIRECTIVE_NOT_SET;
                }
                if (i8 == 1) {
                    return DIRECTIVE;
                }
                if (i8 == 2) {
                    return STREAM_END;
                }
                if (i8 == 3) {
                    return STREAM_BREAK;
                }
                if (i8 == 11) {
                    return BYTES;
                }
                if (i8 == 12) {
                    return TEXT;
                }
                if (i8 == 21) {
                    return META;
                }
                if (i8 != 99) {
                    return null;
                }
                return EXCEPTION;
            }

            @Override // com.google.protobuf.AbstractC5227l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TestDirectiveCase valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* synthetic */ MapDirective(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static MapDirective getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_MapDirective_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MapDirective parseDelimitedFrom(InputStream inputStream) {
            return (MapDirective) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MapDirective parseFrom(ByteBuffer byteBuffer) {
            return (MapDirective) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDirective)) {
                return super.equals(obj);
            }
            MapDirective mapDirective = (MapDirective) obj;
            if (!getTestDirectiveCase().equals(mapDirective.getTestDirectiveCase())) {
                return false;
            }
            int i8 = this.testDirectiveCase_;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 11) {
                            if (i8 != 12) {
                                if (i8 != 21) {
                                    if (i8 == 99 && !getException().equals(mapDirective.getException())) {
                                        return false;
                                    }
                                } else if (!getMeta().equals(mapDirective.getMeta())) {
                                    return false;
                                }
                            } else if (!getText().equals(mapDirective.getText())) {
                                return false;
                            }
                        } else if (!getBytes().equals(mapDirective.getBytes())) {
                            return false;
                        }
                    } else if (!getStreamBreak().equals(mapDirective.getStreamBreak())) {
                        return false;
                    }
                } else if (!getStreamEnd().equals(mapDirective.getStreamEnd())) {
                    return false;
                }
            } else if (!getDirective().equals(mapDirective.getDirective())) {
                return false;
            }
            return getUnknownFields().equals(mapDirective.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public AbstractC5235o getBytes() {
            return this.testDirectiveCase_ == 11 ? (AbstractC5235o) this.testDirective_ : AbstractC5235o.EMPTY;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public DirectiveStream getDirective() {
            return this.testDirectiveCase_ == 1 ? (DirectiveStream) this.testDirective_ : DirectiveStream.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public DirectiveStreamOrBuilder getDirectiveOrBuilder() {
            return this.testDirectiveCase_ == 1 ? (DirectiveStream) this.testDirective_ : DirectiveStream.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public MapException getException() {
            return this.testDirectiveCase_ == 99 ? (MapException) this.testDirective_ : MapException.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public MapExceptionOrBuilder getExceptionOrBuilder() {
            return this.testDirectiveCase_ == 99 ? (MapException) this.testDirective_ : MapException.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public StreamMeta getMeta() {
            return this.testDirectiveCase_ == 21 ? (StreamMeta) this.testDirective_ : StreamMeta.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public StreamMetaOrBuilder getMetaOrBuilder() {
            return this.testDirectiveCase_ == 21 ? (StreamMeta) this.testDirective_ : StreamMeta.getDefaultInstance();
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
            int iComputeMessageSize = this.testDirectiveCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (DirectiveStream) this.testDirective_) : 0;
            if (this.testDirectiveCase_ == 2) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (StreamEnd) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 3) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(3, (StreamBreak) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 11) {
                iComputeMessageSize += AbstractC5248t.computeBytesSize(11, (AbstractC5235o) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 12) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(12, this.testDirective_);
            }
            if (this.testDirectiveCase_ == 21) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(21, (StreamMeta) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 99) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(99, (MapException) this.testDirective_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public StreamBreak getStreamBreak() {
            return this.testDirectiveCase_ == 3 ? (StreamBreak) this.testDirective_ : StreamBreak.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public StreamBreakOrBuilder getStreamBreakOrBuilder() {
            return this.testDirectiveCase_ == 3 ? (StreamBreak) this.testDirective_ : StreamBreak.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public StreamEnd getStreamEnd() {
            return this.testDirectiveCase_ == 2 ? (StreamEnd) this.testDirective_ : StreamEnd.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public StreamEndOrBuilder getStreamEndOrBuilder() {
            return this.testDirectiveCase_ == 2 ? (StreamEnd) this.testDirective_ : StreamEnd.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public TestDirectiveCase getTestDirectiveCase() {
            return TestDirectiveCase.forNumber(this.testDirectiveCase_);
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public String getText() {
            String str = this.testDirectiveCase_ == 12 ? this.testDirective_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
            if (this.testDirectiveCase_ == 12) {
                this.testDirective_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public AbstractC5235o getTextBytes() {
            String str = this.testDirectiveCase_ == 12 ? this.testDirective_ : "";
            if (!(str instanceof String)) {
                return (AbstractC5235o) str;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
            if (this.testDirectiveCase_ == 12) {
                this.testDirective_ = abstractC5235oCopyFromUtf8;
            }
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasBytes() {
            return this.testDirectiveCase_ == 11;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasDirective() {
            return this.testDirectiveCase_ == 1;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasException() {
            return this.testDirectiveCase_ == 99;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasMeta() {
            return this.testDirectiveCase_ == 21;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasStreamBreak() {
            return this.testDirectiveCase_ == 3;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasStreamEnd() {
            return this.testDirectiveCase_ == 2;
        }

        @Override // maum.m2u.map.Map.MapDirectiveOrBuilder
        public boolean hasText() {
            return this.testDirectiveCase_ == 12;
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
            int i10 = this.testDirectiveCase_;
            if (i10 == 1) {
                i8 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getDirective().hashCode();
            } else if (i10 == 2) {
                i8 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getStreamEnd().hashCode();
            } else if (i10 == 3) {
                i8 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = getStreamBreak().hashCode();
            } else if (i10 == 11) {
                i8 = ((iHashCode2 * 37) + 11) * 53;
                iHashCode = getBytes().hashCode();
            } else if (i10 == 12) {
                i8 = ((iHashCode2 * 37) + 12) * 53;
                iHashCode = getText().hashCode();
            } else {
                if (i10 != 21) {
                    if (i10 == 99) {
                        i8 = ((iHashCode2 * 37) + 99) * 53;
                        iHashCode = getException().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i8 = ((iHashCode2 * 37) + 21) * 53;
                iHashCode = getMeta().hashCode();
            }
            iHashCode2 = i8 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_MapDirective_fieldAccessorTable.ensureFieldAccessorsInitialized(MapDirective.class, Builder.class);
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
            return new MapDirective();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.testDirectiveCase_ == 1) {
                abstractC5248t.writeMessage(1, (DirectiveStream) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 2) {
                abstractC5248t.writeMessage(2, (StreamEnd) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 3) {
                abstractC5248t.writeMessage(3, (StreamBreak) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 11) {
                abstractC5248t.writeBytes(11, (AbstractC5235o) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 12) {
                AbstractC5209f0.writeString(abstractC5248t, 12, this.testDirective_);
            }
            if (this.testDirectiveCase_ == 21) {
                abstractC5248t.writeMessage(21, (StreamMeta) this.testDirective_);
            }
            if (this.testDirectiveCase_ == 99) {
                abstractC5248t.writeMessage(99, (MapException) this.testDirective_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private MapDirective(AbstractC5209f0.b bVar) {
            super(bVar);
            this.testDirectiveCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(MapDirective mapDirective) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mapDirective);
        }

        public static MapDirective parseFrom(ByteBuffer byteBuffer, M m8) {
            return (MapDirective) PARSER.parseFrom(byteBuffer, m8);
        }

        public static MapDirective parseDelimitedFrom(InputStream inputStream, M m8) {
            return (MapDirective) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static MapDirective parseFrom(AbstractC5235o abstractC5235o) {
            return (MapDirective) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public MapDirective getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static MapDirective parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (MapDirective) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MapDirective() {
            this.testDirectiveCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MapDirective parseFrom(byte[] bArr) {
            return (MapDirective) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static MapDirective parseFrom(byte[] bArr, M m8) {
            return (MapDirective) PARSER.parseFrom(bArr, m8);
        }

        public static MapDirective parseFrom(InputStream inputStream) {
            return (MapDirective) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static MapDirective parseFrom(InputStream inputStream, M m8) {
            return (MapDirective) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static MapDirective parseFrom(r rVar) {
            return (MapDirective) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static MapDirective parseFrom(r rVar, M m8) {
            return (MapDirective) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface MapDirectiveOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        AbstractC5235o getBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        DirectiveStream getDirective();

        DirectiveStreamOrBuilder getDirectiveOrBuilder();

        MapException getException();

        MapExceptionOrBuilder getExceptionOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        StreamMeta getMeta();

        StreamMetaOrBuilder getMetaOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        StreamBreak getStreamBreak();

        StreamBreakOrBuilder getStreamBreakOrBuilder();

        StreamEnd getStreamEnd();

        StreamEndOrBuilder getStreamEndOrBuilder();

        MapDirective.TestDirectiveCase getTestDirectiveCase();

        String getText();

        AbstractC5235o getTextBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasBytes();

        boolean hasDirective();

        boolean hasException();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasStreamBreak();

        boolean hasStreamEnd();

        boolean hasText();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class MapEvent extends AbstractC5209f0 implements MapEventOrBuilder {
        public static final int BYTES_FIELD_NUMBER = 11;
        public static final int EVENT_FIELD_NUMBER = 1;
        public static final int EXCEPTION_FIELD_NUMBER = 99;
        public static final int META_FIELD_NUMBER = 21;
        public static final int STREAM_BREAK_FIELD_NUMBER = 3;
        public static final int STREAM_END_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int testEventCase_;
        private Object testEvent_;
        private static final MapEvent DEFAULT_INSTANCE = new MapEvent();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.MapEvent.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public MapEvent parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = MapEvent.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements MapEventOrBuilder {
            private int bitField0_;
            private C5228l1 eventBuilder_;
            private C5228l1 exceptionBuilder_;
            private C5228l1 metaBuilder_;
            private C5228l1 streamBreakBuilder_;
            private C5228l1 streamEndBuilder_;
            private int testEventCase_;
            private Object testEvent_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(MapEvent mapEvent) {
            }

            private void buildPartialOneofs(MapEvent mapEvent) {
                C5228l1 c5228l1;
                C5228l1 c5228l12;
                C5228l1 c5228l13;
                C5228l1 c5228l14;
                C5228l1 c5228l15;
                mapEvent.testEventCase_ = this.testEventCase_;
                mapEvent.testEvent_ = this.testEvent_;
                if (this.testEventCase_ == 1 && (c5228l15 = this.eventBuilder_) != null) {
                    mapEvent.testEvent_ = c5228l15.build();
                }
                if (this.testEventCase_ == 2 && (c5228l14 = this.streamEndBuilder_) != null) {
                    mapEvent.testEvent_ = c5228l14.build();
                }
                if (this.testEventCase_ == 3 && (c5228l13 = this.streamBreakBuilder_) != null) {
                    mapEvent.testEvent_ = c5228l13.build();
                }
                if (this.testEventCase_ == 21 && (c5228l12 = this.metaBuilder_) != null) {
                    mapEvent.testEvent_ = c5228l12.build();
                }
                if (this.testEventCase_ != 99 || (c5228l1 = this.exceptionBuilder_) == null) {
                    return;
                }
                mapEvent.testEvent_ = c5228l1.build();
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_MapEvent_descriptor;
            }

            private C5228l1 getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    if (this.testEventCase_ != 1) {
                        this.testEvent_ = EventStream.getDefaultInstance();
                    }
                    this.eventBuilder_ = new C5228l1((EventStream) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 1;
                onChanged();
                return this.eventBuilder_;
            }

            private C5228l1 getExceptionFieldBuilder() {
                if (this.exceptionBuilder_ == null) {
                    if (this.testEventCase_ != 99) {
                        this.testEvent_ = MapException.getDefaultInstance();
                    }
                    this.exceptionBuilder_ = new C5228l1((MapException) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 99;
                onChanged();
                return this.exceptionBuilder_;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    if (this.testEventCase_ != 21) {
                        this.testEvent_ = StreamMeta.getDefaultInstance();
                    }
                    this.metaBuilder_ = new C5228l1((StreamMeta) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 21;
                onChanged();
                return this.metaBuilder_;
            }

            private C5228l1 getStreamBreakFieldBuilder() {
                if (this.streamBreakBuilder_ == null) {
                    if (this.testEventCase_ != 3) {
                        this.testEvent_ = StreamBreak.getDefaultInstance();
                    }
                    this.streamBreakBuilder_ = new C5228l1((StreamBreak) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 3;
                onChanged();
                return this.streamBreakBuilder_;
            }

            private C5228l1 getStreamEndFieldBuilder() {
                if (this.streamEndBuilder_ == null) {
                    if (this.testEventCase_ != 2) {
                        this.testEvent_ = StreamEnd.getDefaultInstance();
                    }
                    this.streamEndBuilder_ = new C5228l1((StreamEnd) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 2;
                onChanged();
                return this.streamEndBuilder_;
            }

            public Builder clearBytes() {
                if (this.testEventCase_ == 11) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearEvent() {
                C5228l1 c5228l1 = this.eventBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 1) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 1) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearException() {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 99) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 99) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 21) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 21) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearStreamBreak() {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 3) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 3) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearStreamEnd() {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 2) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 2) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTestEvent() {
                this.testEventCase_ = 0;
                this.testEvent_ = null;
                onChanged();
                return this;
            }

            public Builder clearText() {
                if (this.testEventCase_ == 12) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public AbstractC5235o getBytes() {
                return this.testEventCase_ == 11 ? (AbstractC5235o) this.testEvent_ : AbstractC5235o.EMPTY;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_MapEvent_descriptor;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public EventStream getEvent() {
                C5228l1 c5228l1 = this.eventBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 1 ? (EventStream) this.testEvent_ : EventStream.getDefaultInstance() : this.testEventCase_ == 1 ? (EventStream) c5228l1.getMessage() : EventStream.getDefaultInstance();
            }

            public EventStream.Builder getEventBuilder() {
                return (EventStream.Builder) getEventFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public EventStreamOrBuilder getEventOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 1 || (c5228l1 = this.eventBuilder_) == null) ? i8 == 1 ? (EventStream) this.testEvent_ : EventStream.getDefaultInstance() : (EventStreamOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public MapException getException() {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 99 ? (MapException) this.testEvent_ : MapException.getDefaultInstance() : this.testEventCase_ == 99 ? (MapException) c5228l1.getMessage() : MapException.getDefaultInstance();
            }

            public MapException.Builder getExceptionBuilder() {
                return (MapException.Builder) getExceptionFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public MapExceptionOrBuilder getExceptionOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 99 || (c5228l1 = this.exceptionBuilder_) == null) ? i8 == 99 ? (MapException) this.testEvent_ : MapException.getDefaultInstance() : (MapExceptionOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public StreamMeta getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 21 ? (StreamMeta) this.testEvent_ : StreamMeta.getDefaultInstance() : this.testEventCase_ == 21 ? (StreamMeta) c5228l1.getMessage() : StreamMeta.getDefaultInstance();
            }

            public StreamMeta.Builder getMetaBuilder() {
                return (StreamMeta.Builder) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public StreamMetaOrBuilder getMetaOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 21 || (c5228l1 = this.metaBuilder_) == null) ? i8 == 21 ? (StreamMeta) this.testEvent_ : StreamMeta.getDefaultInstance() : (StreamMetaOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public StreamBreak getStreamBreak() {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 3 ? (StreamBreak) this.testEvent_ : StreamBreak.getDefaultInstance() : this.testEventCase_ == 3 ? (StreamBreak) c5228l1.getMessage() : StreamBreak.getDefaultInstance();
            }

            public StreamBreak.Builder getStreamBreakBuilder() {
                return (StreamBreak.Builder) getStreamBreakFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public StreamBreakOrBuilder getStreamBreakOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 3 || (c5228l1 = this.streamBreakBuilder_) == null) ? i8 == 3 ? (StreamBreak) this.testEvent_ : StreamBreak.getDefaultInstance() : (StreamBreakOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public StreamEnd getStreamEnd() {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 2 ? (StreamEnd) this.testEvent_ : StreamEnd.getDefaultInstance() : this.testEventCase_ == 2 ? (StreamEnd) c5228l1.getMessage() : StreamEnd.getDefaultInstance();
            }

            public StreamEnd.Builder getStreamEndBuilder() {
                return (StreamEnd.Builder) getStreamEndFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public StreamEndOrBuilder getStreamEndOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 2 || (c5228l1 = this.streamEndBuilder_) == null) ? i8 == 2 ? (StreamEnd) this.testEvent_ : StreamEnd.getDefaultInstance() : (StreamEndOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public TestEventCase getTestEventCase() {
                return TestEventCase.forNumber(this.testEventCase_);
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public String getText() {
                String str = this.testEventCase_ == 12 ? this.testEvent_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
                if (this.testEventCase_ == 12) {
                    this.testEvent_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public AbstractC5235o getTextBytes() {
                String str = this.testEventCase_ == 12 ? this.testEvent_ : "";
                if (!(str instanceof String)) {
                    return (AbstractC5235o) str;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
                if (this.testEventCase_ == 12) {
                    this.testEvent_ = abstractC5235oCopyFromUtf8;
                }
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasBytes() {
                return this.testEventCase_ == 11;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasEvent() {
                return this.testEventCase_ == 1;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasException() {
                return this.testEventCase_ == 99;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasMeta() {
                return this.testEventCase_ == 21;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasStreamBreak() {
                return this.testEventCase_ == 3;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasStreamEnd() {
                return this.testEventCase_ == 2;
            }

            @Override // maum.m2u.map.Map.MapEventOrBuilder
            public boolean hasText() {
                return this.testEventCase_ == 12;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_MapEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(MapEvent.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEvent(EventStream eventStream) {
                C5228l1 c5228l1 = this.eventBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 1 || this.testEvent_ == EventStream.getDefaultInstance()) {
                        this.testEvent_ = eventStream;
                    } else {
                        this.testEvent_ = EventStream.newBuilder((EventStream) this.testEvent_).mergeFrom(eventStream).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 1) {
                    c5228l1.mergeFrom(eventStream);
                } else {
                    c5228l1.setMessage(eventStream);
                }
                this.testEventCase_ = 1;
                return this;
            }

            public Builder mergeException(MapException mapException) {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 99 || this.testEvent_ == MapException.getDefaultInstance()) {
                        this.testEvent_ = mapException;
                    } else {
                        this.testEvent_ = MapException.newBuilder((MapException) this.testEvent_).mergeFrom(mapException).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 99) {
                    c5228l1.mergeFrom(mapException);
                } else {
                    c5228l1.setMessage(mapException);
                }
                this.testEventCase_ = 99;
                return this;
            }

            public Builder mergeMeta(StreamMeta streamMeta) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 21 || this.testEvent_ == StreamMeta.getDefaultInstance()) {
                        this.testEvent_ = streamMeta;
                    } else {
                        this.testEvent_ = StreamMeta.newBuilder((StreamMeta) this.testEvent_).mergeFrom(streamMeta).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 21) {
                    c5228l1.mergeFrom(streamMeta);
                } else {
                    c5228l1.setMessage(streamMeta);
                }
                this.testEventCase_ = 21;
                return this;
            }

            public Builder mergeStreamBreak(StreamBreak streamBreak) {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 3 || this.testEvent_ == StreamBreak.getDefaultInstance()) {
                        this.testEvent_ = streamBreak;
                    } else {
                        this.testEvent_ = StreamBreak.newBuilder((StreamBreak) this.testEvent_).mergeFrom(streamBreak).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 3) {
                    c5228l1.mergeFrom(streamBreak);
                } else {
                    c5228l1.setMessage(streamBreak);
                }
                this.testEventCase_ = 3;
                return this;
            }

            public Builder mergeStreamEnd(StreamEnd streamEnd) {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 2 || this.testEvent_ == StreamEnd.getDefaultInstance()) {
                        this.testEvent_ = streamEnd;
                    } else {
                        this.testEvent_ = StreamEnd.newBuilder((StreamEnd) this.testEvent_).mergeFrom(streamEnd).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 2) {
                    c5228l1.mergeFrom(streamEnd);
                } else {
                    c5228l1.setMessage(streamEnd);
                }
                this.testEventCase_ = 2;
                return this;
            }

            public Builder setBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                this.testEventCase_ = 11;
                this.testEvent_ = abstractC5235o;
                onChanged();
                return this;
            }

            public Builder setEvent(EventStream eventStream) {
                C5228l1 c5228l1 = this.eventBuilder_;
                if (c5228l1 == null) {
                    eventStream.getClass();
                    this.testEvent_ = eventStream;
                    onChanged();
                } else {
                    c5228l1.setMessage(eventStream);
                }
                this.testEventCase_ = 1;
                return this;
            }

            public Builder setException(MapException mapException) {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 == null) {
                    mapException.getClass();
                    this.testEvent_ = mapException;
                    onChanged();
                } else {
                    c5228l1.setMessage(mapException);
                }
                this.testEventCase_ = 99;
                return this;
            }

            public Builder setMeta(StreamMeta streamMeta) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    streamMeta.getClass();
                    this.testEvent_ = streamMeta;
                    onChanged();
                } else {
                    c5228l1.setMessage(streamMeta);
                }
                this.testEventCase_ = 21;
                return this;
            }

            public Builder setStreamBreak(StreamBreak streamBreak) {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 == null) {
                    streamBreak.getClass();
                    this.testEvent_ = streamBreak;
                    onChanged();
                } else {
                    c5228l1.setMessage(streamBreak);
                }
                this.testEventCase_ = 3;
                return this;
            }

            public Builder setStreamEnd(StreamEnd streamEnd) {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 == null) {
                    streamEnd.getClass();
                    this.testEvent_ = streamEnd;
                    onChanged();
                } else {
                    c5228l1.setMessage(streamEnd);
                }
                this.testEventCase_ = 2;
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.testEventCase_ = 12;
                this.testEvent_ = str;
                onChanged();
                return this;
            }

            public Builder setTextBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.testEventCase_ = 12;
                this.testEvent_ = abstractC5235o;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.testEventCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MapEvent build() {
                MapEvent mapEventBuildPartial = buildPartial();
                if (mapEventBuildPartial.isInitialized()) {
                    return mapEventBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) mapEventBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MapEvent buildPartial() {
                MapEvent mapEvent = new MapEvent(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(mapEvent);
                }
                buildPartialOneofs(mapEvent);
                onBuilt();
                return mapEvent;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MapEvent getDefaultInstanceForType() {
                return MapEvent.getDefaultInstance();
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
                this.testEventCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5228l1 c5228l1 = this.eventBuilder_;
                if (c5228l1 != null) {
                    c5228l1.clear();
                }
                C5228l1 c5228l12 = this.streamEndBuilder_;
                if (c5228l12 != null) {
                    c5228l12.clear();
                }
                C5228l1 c5228l13 = this.streamBreakBuilder_;
                if (c5228l13 != null) {
                    c5228l13.clear();
                }
                C5228l1 c5228l14 = this.metaBuilder_;
                if (c5228l14 != null) {
                    c5228l14.clear();
                }
                C5228l1 c5228l15 = this.exceptionBuilder_;
                if (c5228l15 != null) {
                    c5228l15.clear();
                }
                this.testEventCase_ = 0;
                this.testEvent_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof MapEvent) {
                    return mergeFrom((MapEvent) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setEvent(EventStream.Builder builder) {
                C5228l1 c5228l1 = this.eventBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 1;
                return this;
            }

            public Builder setException(MapException.Builder builder) {
                C5228l1 c5228l1 = this.exceptionBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 99;
                return this;
            }

            public Builder setMeta(StreamMeta.Builder builder) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 21;
                return this;
            }

            public Builder setStreamBreak(StreamBreak.Builder builder) {
                C5228l1 c5228l1 = this.streamBreakBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 3;
                return this;
            }

            public Builder setStreamEnd(StreamEnd.Builder builder) {
                C5228l1 c5228l1 = this.streamEndBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 2;
                return this;
            }

            public Builder mergeFrom(MapEvent mapEvent) {
                if (mapEvent == MapEvent.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass1.$SwitchMap$maum$m2u$map$Map$MapEvent$TestEventCase[mapEvent.getTestEventCase().ordinal()]) {
                    case 1:
                        mergeEvent(mapEvent.getEvent());
                        break;
                    case 2:
                        mergeStreamEnd(mapEvent.getStreamEnd());
                        break;
                    case 3:
                        mergeStreamBreak(mapEvent.getStreamBreak());
                        break;
                    case 4:
                        setBytes(mapEvent.getBytes());
                        break;
                    case 5:
                        this.testEventCase_ = 12;
                        this.testEvent_ = mapEvent.testEvent_;
                        onChanged();
                        break;
                    case 6:
                        mergeMeta(mapEvent.getMeta());
                        break;
                    case 7:
                        mergeException(mapEvent.getException());
                        break;
                }
                mergeUnknownFields(mapEvent.getUnknownFields());
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
                                    rVar.readMessage(getEventFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getStreamEndFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getStreamBreakFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 3;
                                } else if (tag == 90) {
                                    this.testEvent_ = rVar.readBytes();
                                    this.testEventCase_ = 11;
                                } else if (tag == 98) {
                                    String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                    this.testEventCase_ = 12;
                                    this.testEvent_ = stringRequireUtf8;
                                } else if (tag == 170) {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 21;
                                } else if (tag != 794) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getExceptionFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 99;
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

        public enum TestEventCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
            EVENT(1),
            STREAM_END(2),
            STREAM_BREAK(3),
            BYTES(11),
            TEXT(12),
            META(21),
            EXCEPTION(99),
            TESTEVENT_NOT_SET(0);

            private final int value;

            TestEventCase(int i8) {
                this.value = i8;
            }

            public static TestEventCase forNumber(int i8) {
                if (i8 == 0) {
                    return TESTEVENT_NOT_SET;
                }
                if (i8 == 1) {
                    return EVENT;
                }
                if (i8 == 2) {
                    return STREAM_END;
                }
                if (i8 == 3) {
                    return STREAM_BREAK;
                }
                if (i8 == 11) {
                    return BYTES;
                }
                if (i8 == 12) {
                    return TEXT;
                }
                if (i8 == 21) {
                    return META;
                }
                if (i8 != 99) {
                    return null;
                }
                return EXCEPTION;
            }

            @Override // com.google.protobuf.AbstractC5227l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TestEventCase valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* synthetic */ MapEvent(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static MapEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_MapEvent_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MapEvent parseDelimitedFrom(InputStream inputStream) {
            return (MapEvent) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MapEvent parseFrom(ByteBuffer byteBuffer) {
            return (MapEvent) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapEvent)) {
                return super.equals(obj);
            }
            MapEvent mapEvent = (MapEvent) obj;
            if (!getTestEventCase().equals(mapEvent.getTestEventCase())) {
                return false;
            }
            int i8 = this.testEventCase_;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 11) {
                            if (i8 != 12) {
                                if (i8 != 21) {
                                    if (i8 == 99 && !getException().equals(mapEvent.getException())) {
                                        return false;
                                    }
                                } else if (!getMeta().equals(mapEvent.getMeta())) {
                                    return false;
                                }
                            } else if (!getText().equals(mapEvent.getText())) {
                                return false;
                            }
                        } else if (!getBytes().equals(mapEvent.getBytes())) {
                            return false;
                        }
                    } else if (!getStreamBreak().equals(mapEvent.getStreamBreak())) {
                        return false;
                    }
                } else if (!getStreamEnd().equals(mapEvent.getStreamEnd())) {
                    return false;
                }
            } else if (!getEvent().equals(mapEvent.getEvent())) {
                return false;
            }
            return getUnknownFields().equals(mapEvent.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public AbstractC5235o getBytes() {
            return this.testEventCase_ == 11 ? (AbstractC5235o) this.testEvent_ : AbstractC5235o.EMPTY;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public EventStream getEvent() {
            return this.testEventCase_ == 1 ? (EventStream) this.testEvent_ : EventStream.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public EventStreamOrBuilder getEventOrBuilder() {
            return this.testEventCase_ == 1 ? (EventStream) this.testEvent_ : EventStream.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public MapException getException() {
            return this.testEventCase_ == 99 ? (MapException) this.testEvent_ : MapException.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public MapExceptionOrBuilder getExceptionOrBuilder() {
            return this.testEventCase_ == 99 ? (MapException) this.testEvent_ : MapException.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public StreamMeta getMeta() {
            return this.testEventCase_ == 21 ? (StreamMeta) this.testEvent_ : StreamMeta.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public StreamMetaOrBuilder getMetaOrBuilder() {
            return this.testEventCase_ == 21 ? (StreamMeta) this.testEvent_ : StreamMeta.getDefaultInstance();
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
            int iComputeMessageSize = this.testEventCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (EventStream) this.testEvent_) : 0;
            if (this.testEventCase_ == 2) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (StreamEnd) this.testEvent_);
            }
            if (this.testEventCase_ == 3) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(3, (StreamBreak) this.testEvent_);
            }
            if (this.testEventCase_ == 11) {
                iComputeMessageSize += AbstractC5248t.computeBytesSize(11, (AbstractC5235o) this.testEvent_);
            }
            if (this.testEventCase_ == 12) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(12, this.testEvent_);
            }
            if (this.testEventCase_ == 21) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(21, (StreamMeta) this.testEvent_);
            }
            if (this.testEventCase_ == 99) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(99, (MapException) this.testEvent_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public StreamBreak getStreamBreak() {
            return this.testEventCase_ == 3 ? (StreamBreak) this.testEvent_ : StreamBreak.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public StreamBreakOrBuilder getStreamBreakOrBuilder() {
            return this.testEventCase_ == 3 ? (StreamBreak) this.testEvent_ : StreamBreak.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public StreamEnd getStreamEnd() {
            return this.testEventCase_ == 2 ? (StreamEnd) this.testEvent_ : StreamEnd.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public StreamEndOrBuilder getStreamEndOrBuilder() {
            return this.testEventCase_ == 2 ? (StreamEnd) this.testEvent_ : StreamEnd.getDefaultInstance();
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public TestEventCase getTestEventCase() {
            return TestEventCase.forNumber(this.testEventCase_);
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public String getText() {
            String str = this.testEventCase_ == 12 ? this.testEvent_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
            if (this.testEventCase_ == 12) {
                this.testEvent_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public AbstractC5235o getTextBytes() {
            String str = this.testEventCase_ == 12 ? this.testEvent_ : "";
            if (!(str instanceof String)) {
                return (AbstractC5235o) str;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
            if (this.testEventCase_ == 12) {
                this.testEvent_ = abstractC5235oCopyFromUtf8;
            }
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasBytes() {
            return this.testEventCase_ == 11;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasEvent() {
            return this.testEventCase_ == 1;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasException() {
            return this.testEventCase_ == 99;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasMeta() {
            return this.testEventCase_ == 21;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasStreamBreak() {
            return this.testEventCase_ == 3;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasStreamEnd() {
            return this.testEventCase_ == 2;
        }

        @Override // maum.m2u.map.Map.MapEventOrBuilder
        public boolean hasText() {
            return this.testEventCase_ == 12;
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
            int i10 = this.testEventCase_;
            if (i10 == 1) {
                i8 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getEvent().hashCode();
            } else if (i10 == 2) {
                i8 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getStreamEnd().hashCode();
            } else if (i10 == 3) {
                i8 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = getStreamBreak().hashCode();
            } else if (i10 == 11) {
                i8 = ((iHashCode2 * 37) + 11) * 53;
                iHashCode = getBytes().hashCode();
            } else if (i10 == 12) {
                i8 = ((iHashCode2 * 37) + 12) * 53;
                iHashCode = getText().hashCode();
            } else {
                if (i10 != 21) {
                    if (i10 == 99) {
                        i8 = ((iHashCode2 * 37) + 99) * 53;
                        iHashCode = getException().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i8 = ((iHashCode2 * 37) + 21) * 53;
                iHashCode = getMeta().hashCode();
            }
            iHashCode2 = i8 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_MapEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(MapEvent.class, Builder.class);
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
            return new MapEvent();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.testEventCase_ == 1) {
                abstractC5248t.writeMessage(1, (EventStream) this.testEvent_);
            }
            if (this.testEventCase_ == 2) {
                abstractC5248t.writeMessage(2, (StreamEnd) this.testEvent_);
            }
            if (this.testEventCase_ == 3) {
                abstractC5248t.writeMessage(3, (StreamBreak) this.testEvent_);
            }
            if (this.testEventCase_ == 11) {
                abstractC5248t.writeBytes(11, (AbstractC5235o) this.testEvent_);
            }
            if (this.testEventCase_ == 12) {
                AbstractC5209f0.writeString(abstractC5248t, 12, this.testEvent_);
            }
            if (this.testEventCase_ == 21) {
                abstractC5248t.writeMessage(21, (StreamMeta) this.testEvent_);
            }
            if (this.testEventCase_ == 99) {
                abstractC5248t.writeMessage(99, (MapException) this.testEvent_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private MapEvent(AbstractC5209f0.b bVar) {
            super(bVar);
            this.testEventCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(MapEvent mapEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mapEvent);
        }

        public static MapEvent parseFrom(ByteBuffer byteBuffer, M m8) {
            return (MapEvent) PARSER.parseFrom(byteBuffer, m8);
        }

        public static MapEvent parseDelimitedFrom(InputStream inputStream, M m8) {
            return (MapEvent) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static MapEvent parseFrom(AbstractC5235o abstractC5235o) {
            return (MapEvent) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public MapEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static MapEvent parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (MapEvent) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MapEvent() {
            this.testEventCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MapEvent parseFrom(byte[] bArr) {
            return (MapEvent) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static MapEvent parseFrom(byte[] bArr, M m8) {
            return (MapEvent) PARSER.parseFrom(bArr, m8);
        }

        public static MapEvent parseFrom(InputStream inputStream) {
            return (MapEvent) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static MapEvent parseFrom(InputStream inputStream, M m8) {
            return (MapEvent) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static MapEvent parseFrom(r rVar) {
            return (MapEvent) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static MapEvent parseFrom(r rVar, M m8) {
            return (MapEvent) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface MapEventOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        AbstractC5235o getBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        EventStream getEvent();

        EventStreamOrBuilder getEventOrBuilder();

        MapException getException();

        MapExceptionOrBuilder getExceptionOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        StreamMeta getMeta();

        StreamMetaOrBuilder getMetaOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        StreamBreak getStreamBreak();

        StreamBreakOrBuilder getStreamBreakOrBuilder();

        StreamEnd getStreamEnd();

        StreamEndOrBuilder getStreamEndOrBuilder();

        MapEvent.TestEventCase getTestEventCase();

        String getText();

        AbstractC5235o getTextBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasBytes();

        boolean hasEvent();

        boolean hasException();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasStreamBreak();

        boolean hasStreamEnd();

        boolean hasText();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class MapException extends AbstractC5209f0 implements MapExceptionOrBuilder {
        public static final int CALLED_INTERFACE_FIELD_NUMBER = 103;
        public static final int EXCEPTION_ID_FIELD_NUMBER = 1;
        public static final int EX_INDEX_FIELD_NUMBER = 22;
        public static final int EX_MESSAGE_FIELD_NUMBER = 21;
        public static final int OPERATION_SYNC_ID_FIELD_NUMBER = 102;
        public static final int PAYLOAD_FIELD_NUMBER = 99;
        public static final int STATUS_CODE_FIELD_NUMBER = 10;
        public static final int STREAM_ID_FIELD_NUMBER = 101;
        public static final int THROWN_AT_FIELD_NUMBER = 100;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private AsyncInterface calledInterface_;
        private int exIndex_;
        private volatile Object exMessage_;
        private volatile Object exceptionId_;
        private byte memoizedIsInitialized;
        private volatile Object operationSyncId_;
        private C5240p1 payload_;
        private int statusCode_;
        private volatile Object streamId_;
        private w1 thrownAt_;
        private static final MapException DEFAULT_INSTANCE = new MapException();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.MapException.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public MapException parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = MapException.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements MapExceptionOrBuilder {
            private int bitField0_;
            private C5228l1 calledInterfaceBuilder_;
            private AsyncInterface calledInterface_;
            private int exIndex_;
            private Object exMessage_;
            private Object exceptionId_;
            private Object operationSyncId_;
            private C5228l1 payloadBuilder_;
            private C5240p1 payload_;
            private int statusCode_;
            private Object streamId_;
            private C5228l1 thrownAtBuilder_;
            private w1 thrownAt_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(MapException mapException) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    mapException.exceptionId_ = this.exceptionId_;
                }
                if ((i9 & 2) != 0) {
                    mapException.statusCode_ = this.statusCode_;
                }
                if ((i9 & 4) != 0) {
                    mapException.exMessage_ = this.exMessage_;
                }
                if ((i9 & 8) != 0) {
                    mapException.exIndex_ = this.exIndex_;
                }
                if ((i9 & 16) != 0) {
                    C5228l1 c5228l1 = this.payloadBuilder_;
                    mapException.payload_ = c5228l1 == null ? this.payload_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 32) != 0) {
                    C5228l1 c5228l12 = this.thrownAtBuilder_;
                    mapException.thrownAt_ = c5228l12 == null ? this.thrownAt_ : (w1) c5228l12.build();
                    i8 |= 2;
                }
                if ((i9 & 64) != 0) {
                    mapException.streamId_ = this.streamId_;
                }
                if ((i9 & 128) != 0) {
                    mapException.operationSyncId_ = this.operationSyncId_;
                }
                if ((i9 & 256) != 0) {
                    C5228l1 c5228l13 = this.calledInterfaceBuilder_;
                    mapException.calledInterface_ = c5228l13 == null ? this.calledInterface_ : (AsyncInterface) c5228l13.build();
                    i8 |= 4;
                }
                MapException.access$12776(mapException, i8);
            }

            private C5228l1 getCalledInterfaceFieldBuilder() {
                if (this.calledInterfaceBuilder_ == null) {
                    this.calledInterfaceBuilder_ = new C5228l1(getCalledInterface(), getParentForChildren(), isClean());
                    this.calledInterface_ = null;
                }
                return this.calledInterfaceBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_MapException_descriptor;
            }

            private C5228l1 getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new C5228l1(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private C5228l1 getThrownAtFieldBuilder() {
                if (this.thrownAtBuilder_ == null) {
                    this.thrownAtBuilder_ = new C5228l1(getThrownAt(), getParentForChildren(), isClean());
                    this.thrownAt_ = null;
                }
                return this.thrownAtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getPayloadFieldBuilder();
                    getThrownAtFieldBuilder();
                    getCalledInterfaceFieldBuilder();
                }
            }

            public Builder clearCalledInterface() {
                this.bitField0_ &= -257;
                this.calledInterface_ = null;
                C5228l1 c5228l1 = this.calledInterfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.calledInterfaceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearExIndex() {
                this.bitField0_ &= -9;
                this.exIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExMessage() {
                this.exMessage_ = MapException.getDefaultInstance().getExMessage();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearExceptionId() {
                this.exceptionId_ = MapException.getDefaultInstance().getExceptionId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearOperationSyncId() {
                this.operationSyncId_ = MapException.getDefaultInstance().getOperationSyncId();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearPayload() {
                this.bitField0_ &= -17;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusCode() {
                this.bitField0_ &= -3;
                this.statusCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStreamId() {
                this.streamId_ = MapException.getDefaultInstance().getStreamId();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearThrownAt() {
                this.bitField0_ &= -33;
                this.thrownAt_ = null;
                C5228l1 c5228l1 = this.thrownAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.thrownAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public AsyncInterface getCalledInterface() {
                C5228l1 c5228l1 = this.calledInterfaceBuilder_;
                if (c5228l1 != null) {
                    return (AsyncInterface) c5228l1.getMessage();
                }
                AsyncInterface asyncInterface = this.calledInterface_;
                return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
            }

            public AsyncInterface.Builder getCalledInterfaceBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (AsyncInterface.Builder) getCalledInterfaceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public AsyncInterfaceOrBuilder getCalledInterfaceOrBuilder() {
                C5228l1 c5228l1 = this.calledInterfaceBuilder_;
                if (c5228l1 != null) {
                    return (AsyncInterfaceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                AsyncInterface asyncInterface = this.calledInterface_;
                return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_MapException_descriptor;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public int getExIndex() {
                return this.exIndex_;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public String getExMessage() {
                Object obj = this.exMessage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.exMessage_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public AbstractC5235o getExMessageBytes() {
                Object obj = this.exMessage_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.exMessage_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public String getExceptionId() {
                Object obj = this.exceptionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.exceptionId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public AbstractC5235o getExceptionIdBytes() {
                Object obj = this.exceptionId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.exceptionId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public String getOperationSyncId() {
                Object obj = this.operationSyncId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operationSyncId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public AbstractC5235o getOperationSyncIdBytes() {
                Object obj = this.operationSyncId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operationSyncId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public C5240p1 getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.payload_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getPayloadBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (C5240p1.b) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public InterfaceC5243q1 getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.payload_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public StatusCode getStatusCode() {
                StatusCode statusCodeForNumber = StatusCode.forNumber(this.statusCode_);
                return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public int getStatusCodeValue() {
                return this.statusCode_;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public String getStreamId() {
                Object obj = this.streamId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.streamId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public AbstractC5235o getStreamIdBytes() {
                Object obj = this.streamId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.streamId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public w1 getThrownAt() {
                C5228l1 c5228l1 = this.thrownAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.thrownAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getThrownAtBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (w1.b) getThrownAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public x1 getThrownAtOrBuilder() {
                C5228l1 c5228l1 = this.thrownAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.thrownAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public boolean hasCalledInterface() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // maum.m2u.map.Map.MapExceptionOrBuilder
            public boolean hasThrownAt() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_MapException_fieldAccessorTable.ensureFieldAccessorsInitialized(MapException.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCalledInterface(AsyncInterface asyncInterface) {
                AsyncInterface asyncInterface2;
                C5228l1 c5228l1 = this.calledInterfaceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(asyncInterface);
                } else if ((this.bitField0_ & 256) == 0 || (asyncInterface2 = this.calledInterface_) == null || asyncInterface2 == AsyncInterface.getDefaultInstance()) {
                    this.calledInterface_ = asyncInterface;
                } else {
                    getCalledInterfaceBuilder().mergeFrom(asyncInterface);
                }
                if (this.calledInterface_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 16) == 0 || (c5240p12 = this.payload_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.payload_ = c5240p1;
                } else {
                    getPayloadBuilder().mergeFrom(c5240p1);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeThrownAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.thrownAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 32) == 0 || (w1Var2 = this.thrownAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.thrownAt_ = w1Var;
                } else {
                    getThrownAtBuilder().mergeFrom(w1Var);
                }
                if (this.thrownAt_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder setCalledInterface(AsyncInterface asyncInterface) {
                C5228l1 c5228l1 = this.calledInterfaceBuilder_;
                if (c5228l1 == null) {
                    asyncInterface.getClass();
                    this.calledInterface_ = asyncInterface;
                } else {
                    c5228l1.setMessage(asyncInterface);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setExIndex(int i8) {
                this.exIndex_ = i8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setExMessage(String str) {
                str.getClass();
                this.exMessage_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setExMessageBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.exMessage_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setExceptionId(String str) {
                str.getClass();
                this.exceptionId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setExceptionIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.exceptionId_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperationSyncId(String str) {
                str.getClass();
                this.operationSyncId_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setOperationSyncIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operationSyncId_ = abstractC5235o;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPayload(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.payload_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStatusCode(StatusCode statusCode) {
                statusCode.getClass();
                this.bitField0_ |= 2;
                this.statusCode_ = statusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatusCodeValue(int i8) {
                this.statusCode_ = i8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStreamIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.streamId_ = abstractC5235o;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setThrownAt(w1 w1Var) {
                C5228l1 c5228l1 = this.thrownAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.thrownAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.exceptionId_ = "";
                this.statusCode_ = 0;
                this.exMessage_ = "";
                this.streamId_ = "";
                this.operationSyncId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MapException build() {
                MapException mapExceptionBuildPartial = buildPartial();
                if (mapExceptionBuildPartial.isInitialized()) {
                    return mapExceptionBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) mapExceptionBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MapException buildPartial() {
                MapException mapException = new MapException(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(mapException);
                }
                onBuilt();
                return mapException;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MapException getDefaultInstanceForType() {
                return MapException.getDefaultInstance();
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
                this.exceptionId_ = "";
                this.statusCode_ = 0;
                this.exMessage_ = "";
                this.exIndex_ = 0;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                this.thrownAt_ = null;
                C5228l1 c5228l12 = this.thrownAtBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.thrownAtBuilder_ = null;
                }
                this.streamId_ = "";
                this.operationSyncId_ = "";
                this.calledInterface_ = null;
                C5228l1 c5228l13 = this.calledInterfaceBuilder_;
                if (c5228l13 != null) {
                    c5228l13.dispose();
                    this.calledInterfaceBuilder_ = null;
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
                if (h02 instanceof MapException) {
                    return mergeFrom((MapException) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setCalledInterface(AsyncInterface.Builder builder) {
                C5228l1 c5228l1 = this.calledInterfaceBuilder_;
                if (c5228l1 == null) {
                    this.calledInterface_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPayload(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setThrownAt(w1.b bVar) {
                C5228l1 c5228l1 = this.thrownAtBuilder_;
                if (c5228l1 == null) {
                    this.thrownAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.exceptionId_ = "";
                this.statusCode_ = 0;
                this.exMessage_ = "";
                this.streamId_ = "";
                this.operationSyncId_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MapException mapException) {
                if (mapException == MapException.getDefaultInstance()) {
                    return this;
                }
                if (!mapException.getExceptionId().isEmpty()) {
                    this.exceptionId_ = mapException.exceptionId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (mapException.statusCode_ != 0) {
                    setStatusCodeValue(mapException.getStatusCodeValue());
                }
                if (!mapException.getExMessage().isEmpty()) {
                    this.exMessage_ = mapException.exMessage_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (mapException.getExIndex() != 0) {
                    setExIndex(mapException.getExIndex());
                }
                if (mapException.hasPayload()) {
                    mergePayload(mapException.getPayload());
                }
                if (mapException.hasThrownAt()) {
                    mergeThrownAt(mapException.getThrownAt());
                }
                if (!mapException.getStreamId().isEmpty()) {
                    this.streamId_ = mapException.streamId_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (!mapException.getOperationSyncId().isEmpty()) {
                    this.operationSyncId_ = mapException.operationSyncId_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (mapException.hasCalledInterface()) {
                    mergeCalledInterface(mapException.getCalledInterface());
                }
                mergeUnknownFields(mapException.getUnknownFields());
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
                                    this.exceptionId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 80) {
                                    this.statusCode_ = rVar.readEnum();
                                    this.bitField0_ |= 2;
                                } else if (tag == 170) {
                                    this.exMessage_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 176) {
                                    this.exIndex_ = rVar.readInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 794) {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 16;
                                } else if (tag == 802) {
                                    rVar.readMessage(getThrownAtFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 32;
                                } else if (tag == 810) {
                                    this.streamId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                } else if (tag == 818) {
                                    this.operationSyncId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 128;
                                } else if (tag != 826) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getCalledInterfaceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 256;
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

        public enum StatusCode implements InterfaceC5204d1 {
            STATUS_NOT_SPECIFIED(0),
            GRPC_STT_ERROR(GRPC_STT_ERROR_VALUE),
            GRPC_IDR_ERROR(GRPC_IDR_ERROR_VALUE),
            GRPC_TTS_ERROR(GRPC_TTS_ERROR_VALUE),
            GRPC_AUTH_SIGN_IN_ERROR(GRPC_AUTH_SIGN_IN_ERROR_VALUE),
            GRPC_AUTH_SIGN_OUT_ERROR(GRPC_AUTH_SIGN_OUT_ERROR_VALUE),
            GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR(GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR_VALUE),
            GRPC_AUTH_IS_VALID_ERROR(GRPC_AUTH_IS_VALID_ERROR_VALUE),
            GRPC_AUTH_GET_USER_INFO_ERROR(GRPC_AUTH_GET_USER_INFO_ERROR_VALUE),
            GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR(GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR_VALUE),
            GRPC_AUTH_GET_USER_SETTINGS_ERROR(GRPC_AUTH_GET_USER_SETTINGS_ERROR_VALUE),
            GRPC_ROUTER_OPEN_ERROR(GRPC_ROUTER_OPEN_ERROR_VALUE),
            GRPC_ROUTER_TALK_ERROR(512),
            GRPC_ROUTER_EVENT_ERROR(GRPC_ROUTER_EVENT_ERROR_VALUE),
            GRPC_ROUTER_CLOSE_ERROR(GRPC_ROUTER_CLOSE_ERROR_VALUE),
            GRPC_ROUTER_FEEDBACK_ERROR(GRPC_ROUTER_FEEDBACK_ERROR_VALUE),
            GRPC_STT_TRANSCRIPT_NULL_ERROR(GRPC_STT_TRANSCRIPT_NULL_ERROR_VALUE),
            AUTH_IS_VAILD_FAILED(AUTH_IS_VAILD_FAILED_VALUE),
            AUTH_INVALID_AUTH_TOKEN(AUTH_INVALID_AUTH_TOKEN_VALUE),
            AUTH_FAILED(AUTH_FAILED_VALUE),
            AUTH_INVALID_HEADER(AUTH_INVALID_HEADER_VALUE),
            AUTH_CHECK_AUTH_FAILED(AUTH_CHECK_AUTH_FAILED_VALUE),
            MAP_NO_STREAM_PARAM(MAP_NO_STREAM_PARAM_VALUE),
            MAP_IF_NOT_FOUND(MAP_IF_NOT_FOUND_VALUE),
            MAP_IF_STREAMING_NOT_MATCH(MAP_IF_STREAMING_NOT_MATCH_VALUE),
            MAP_IF_DUPLICATED_STREAMING(MAP_IF_DUPLICATED_STREAMING_VALUE),
            MAP_EVENT_CASE_NOT_SET(MAP_EVENT_CASE_NOT_SET_VALUE),
            MAP_CURRENTLY_HAS_NO_STREAM(MAP_CURRENTLY_HAS_NO_STREAM_VALUE),
            MAP_STREAM_ID_NOT_MATCH(MAP_STREAM_ID_NOT_MATCH_VALUE),
            MAP_PAYLOAD_ERROR(MAP_PAYLOAD_ERROR_VALUE),
            MAP_CLASS_NOT_FOUND(MAP_CLASS_NOT_FOUND_VALUE),
            ROUTER_SESSION_NOT_FOUND(ROUTER_SESSION_NOT_FOUND_VALUE),
            ROUTER_SESSION_INVALID(ROUTER_SESSION_INVALID_VALUE),
            ROUTER_CHATBOT_NOT_FOUND(ROUTER_CHATBOT_NOT_FOUND_VALUE),
            ROUTER_DA_NOT_FOUND(ROUTER_DA_NOT_FOUND_VALUE),
            ROUTER_DA_ERROR(ROUTER_DA_ERROR_VALUE),
            ROUTER_ITF_NOT_FOUND(ROUTER_ITF_NOT_FOUND_VALUE),
            ROUTER_ITF_ERROR(ROUTER_ITF_ERROR_VALUE),
            MAP_TOTAL_SESSION_COUNT_EXCEEDED(MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE),
            MAP_SYSTEM_MAINTENANCE(MAP_SYSTEM_MAINTENANCE_VALUE),
            UNRECOGNIZED(-1);

            public static final int AUTH_CHECK_AUTH_FAILED_VALUE = 305;
            public static final int AUTH_FAILED_VALUE = 303;
            public static final int AUTH_INVALID_AUTH_TOKEN_VALUE = 302;
            public static final int AUTH_INVALID_HEADER_VALUE = 304;
            public static final int AUTH_IS_VAILD_FAILED_VALUE = 301;
            public static final int GRPC_AUTH_GET_USER_INFO_ERROR_VALUE = 508;
            public static final int GRPC_AUTH_GET_USER_SETTINGS_ERROR_VALUE = 510;
            public static final int GRPC_AUTH_IS_VALID_ERROR_VALUE = 507;
            public static final int GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR_VALUE = 506;
            public static final int GRPC_AUTH_SIGN_IN_ERROR_VALUE = 504;
            public static final int GRPC_AUTH_SIGN_OUT_ERROR_VALUE = 505;
            public static final int GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR_VALUE = 509;
            public static final int GRPC_IDR_ERROR_VALUE = 502;
            public static final int GRPC_ROUTER_CLOSE_ERROR_VALUE = 514;
            public static final int GRPC_ROUTER_EVENT_ERROR_VALUE = 513;
            public static final int GRPC_ROUTER_FEEDBACK_ERROR_VALUE = 515;
            public static final int GRPC_ROUTER_OPEN_ERROR_VALUE = 511;
            public static final int GRPC_ROUTER_TALK_ERROR_VALUE = 512;
            public static final int GRPC_STT_ERROR_VALUE = 501;
            public static final int GRPC_STT_TRANSCRIPT_NULL_ERROR_VALUE = 516;
            public static final int GRPC_TTS_ERROR_VALUE = 503;
            public static final int MAP_CLASS_NOT_FOUND_VALUE = 318;
            public static final int MAP_CURRENTLY_HAS_NO_STREAM_VALUE = 315;
            public static final int MAP_EVENT_CASE_NOT_SET_VALUE = 314;
            public static final int MAP_IF_DUPLICATED_STREAMING_VALUE = 313;
            public static final int MAP_IF_NOT_FOUND_VALUE = 311;
            public static final int MAP_IF_STREAMING_NOT_MATCH_VALUE = 312;
            public static final int MAP_NO_STREAM_PARAM_VALUE = 310;
            public static final int MAP_PAYLOAD_ERROR_VALUE = 317;
            public static final int MAP_STREAM_ID_NOT_MATCH_VALUE = 316;
            public static final int MAP_SYSTEM_MAINTENANCE_VALUE = 409;
            public static final int MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE = 408;
            public static final int ROUTER_CHATBOT_NOT_FOUND_VALUE = 403;
            public static final int ROUTER_DA_ERROR_VALUE = 405;
            public static final int ROUTER_DA_NOT_FOUND_VALUE = 404;
            public static final int ROUTER_ITF_ERROR_VALUE = 407;
            public static final int ROUTER_ITF_NOT_FOUND_VALUE = 406;
            public static final int ROUTER_SESSION_INVALID_VALUE = 402;
            public static final int ROUTER_SESSION_NOT_FOUND_VALUE = 401;
            public static final int STATUS_NOT_SPECIFIED_VALUE = 0;
            private final int value;
            private static final AbstractC5227l0.d internalValueMap = new AbstractC5227l0.d() { // from class: maum.m2u.map.Map.MapException.StatusCode.1
                @Override // com.google.protobuf.AbstractC5227l0.d
                public StatusCode findValueByNumber(int i8) {
                    return StatusCode.forNumber(i8);
                }
            };
            private static final StatusCode[] VALUES = values();

            StatusCode(int i8) {
                this.value = i8;
            }

            public static StatusCode forNumber(int i8) {
                if (i8 == 0) {
                    return STATUS_NOT_SPECIFIED;
                }
                switch (i8) {
                    case AUTH_IS_VAILD_FAILED_VALUE:
                        return AUTH_IS_VAILD_FAILED;
                    case AUTH_INVALID_AUTH_TOKEN_VALUE:
                        return AUTH_INVALID_AUTH_TOKEN;
                    case AUTH_FAILED_VALUE:
                        return AUTH_FAILED;
                    case AUTH_INVALID_HEADER_VALUE:
                        return AUTH_INVALID_HEADER;
                    case AUTH_CHECK_AUTH_FAILED_VALUE:
                        return AUTH_CHECK_AUTH_FAILED;
                    default:
                        switch (i8) {
                            case MAP_NO_STREAM_PARAM_VALUE:
                                return MAP_NO_STREAM_PARAM;
                            case MAP_IF_NOT_FOUND_VALUE:
                                return MAP_IF_NOT_FOUND;
                            case MAP_IF_STREAMING_NOT_MATCH_VALUE:
                                return MAP_IF_STREAMING_NOT_MATCH;
                            case MAP_IF_DUPLICATED_STREAMING_VALUE:
                                return MAP_IF_DUPLICATED_STREAMING;
                            case MAP_EVENT_CASE_NOT_SET_VALUE:
                                return MAP_EVENT_CASE_NOT_SET;
                            case MAP_CURRENTLY_HAS_NO_STREAM_VALUE:
                                return MAP_CURRENTLY_HAS_NO_STREAM;
                            case MAP_STREAM_ID_NOT_MATCH_VALUE:
                                return MAP_STREAM_ID_NOT_MATCH;
                            case MAP_PAYLOAD_ERROR_VALUE:
                                return MAP_PAYLOAD_ERROR;
                            case MAP_CLASS_NOT_FOUND_VALUE:
                                return MAP_CLASS_NOT_FOUND;
                            default:
                                switch (i8) {
                                    case ROUTER_SESSION_NOT_FOUND_VALUE:
                                        return ROUTER_SESSION_NOT_FOUND;
                                    case ROUTER_SESSION_INVALID_VALUE:
                                        return ROUTER_SESSION_INVALID;
                                    case ROUTER_CHATBOT_NOT_FOUND_VALUE:
                                        return ROUTER_CHATBOT_NOT_FOUND;
                                    case ROUTER_DA_NOT_FOUND_VALUE:
                                        return ROUTER_DA_NOT_FOUND;
                                    case ROUTER_DA_ERROR_VALUE:
                                        return ROUTER_DA_ERROR;
                                    case ROUTER_ITF_NOT_FOUND_VALUE:
                                        return ROUTER_ITF_NOT_FOUND;
                                    case ROUTER_ITF_ERROR_VALUE:
                                        return ROUTER_ITF_ERROR;
                                    case MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE:
                                        return MAP_TOTAL_SESSION_COUNT_EXCEEDED;
                                    case MAP_SYSTEM_MAINTENANCE_VALUE:
                                        return MAP_SYSTEM_MAINTENANCE;
                                    default:
                                        switch (i8) {
                                            case GRPC_STT_ERROR_VALUE:
                                                return GRPC_STT_ERROR;
                                            case GRPC_IDR_ERROR_VALUE:
                                                return GRPC_IDR_ERROR;
                                            case GRPC_TTS_ERROR_VALUE:
                                                return GRPC_TTS_ERROR;
                                            case GRPC_AUTH_SIGN_IN_ERROR_VALUE:
                                                return GRPC_AUTH_SIGN_IN_ERROR;
                                            case GRPC_AUTH_SIGN_OUT_ERROR_VALUE:
                                                return GRPC_AUTH_SIGN_OUT_ERROR;
                                            case GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR_VALUE:
                                                return GRPC_AUTH_MULTIFACTOR_VERIFY_ERROR;
                                            case GRPC_AUTH_IS_VALID_ERROR_VALUE:
                                                return GRPC_AUTH_IS_VALID_ERROR;
                                            case GRPC_AUTH_GET_USER_INFO_ERROR_VALUE:
                                                return GRPC_AUTH_GET_USER_INFO_ERROR;
                                            case GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR_VALUE:
                                                return GRPC_AUTH_UPDATE_USER_SETTINGS_ERROR;
                                            case GRPC_AUTH_GET_USER_SETTINGS_ERROR_VALUE:
                                                return GRPC_AUTH_GET_USER_SETTINGS_ERROR;
                                            case GRPC_ROUTER_OPEN_ERROR_VALUE:
                                                return GRPC_ROUTER_OPEN_ERROR;
                                            case 512:
                                                return GRPC_ROUTER_TALK_ERROR;
                                            case GRPC_ROUTER_EVENT_ERROR_VALUE:
                                                return GRPC_ROUTER_EVENT_ERROR;
                                            case GRPC_ROUTER_CLOSE_ERROR_VALUE:
                                                return GRPC_ROUTER_CLOSE_ERROR;
                                            case GRPC_ROUTER_FEEDBACK_ERROR_VALUE:
                                                return GRPC_ROUTER_FEEDBACK_ERROR;
                                            case GRPC_STT_TRANSCRIPT_NULL_ERROR_VALUE:
                                                return GRPC_STT_TRANSCRIPT_NULL_ERROR;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
            }

            public static final C5269x.e getDescriptor() {
                return MapException.getDescriptor().getEnumTypes().get(0);
            }

            public static AbstractC5227l0.d internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static StatusCode valueOf(int i8) {
                return forNumber(i8);
            }

            public static StatusCode valueOf(C5269x.f fVar) {
                if (fVar.getType() == getDescriptor()) {
                    if (fVar.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        /* synthetic */ MapException(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$12776(MapException mapException, int i8) {
            int i9 = i8 | mapException.bitField0_;
            mapException.bitField0_ = i9;
            return i9;
        }

        public static MapException getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_MapException_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MapException parseDelimitedFrom(InputStream inputStream) {
            return (MapException) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MapException parseFrom(ByteBuffer byteBuffer) {
            return (MapException) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapException)) {
                return super.equals(obj);
            }
            MapException mapException = (MapException) obj;
            if (!getExceptionId().equals(mapException.getExceptionId()) || this.statusCode_ != mapException.statusCode_ || !getExMessage().equals(mapException.getExMessage()) || getExIndex() != mapException.getExIndex() || hasPayload() != mapException.hasPayload()) {
                return false;
            }
            if ((hasPayload() && !getPayload().equals(mapException.getPayload())) || hasThrownAt() != mapException.hasThrownAt()) {
                return false;
            }
            if ((!hasThrownAt() || getThrownAt().equals(mapException.getThrownAt())) && getStreamId().equals(mapException.getStreamId()) && getOperationSyncId().equals(mapException.getOperationSyncId()) && hasCalledInterface() == mapException.hasCalledInterface()) {
                return (!hasCalledInterface() || getCalledInterface().equals(mapException.getCalledInterface())) && getUnknownFields().equals(mapException.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public AsyncInterface getCalledInterface() {
            AsyncInterface asyncInterface = this.calledInterface_;
            return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public AsyncInterfaceOrBuilder getCalledInterfaceOrBuilder() {
            AsyncInterface asyncInterface = this.calledInterface_;
            return asyncInterface == null ? AsyncInterface.getDefaultInstance() : asyncInterface;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public int getExIndex() {
            return this.exIndex_;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public String getExMessage() {
            Object obj = this.exMessage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.exMessage_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public AbstractC5235o getExMessageBytes() {
            Object obj = this.exMessage_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.exMessage_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public String getExceptionId() {
            Object obj = this.exceptionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.exceptionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public AbstractC5235o getExceptionIdBytes() {
            Object obj = this.exceptionId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.exceptionId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public String getOperationSyncId() {
            Object obj = this.operationSyncId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operationSyncId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public AbstractC5235o getOperationSyncIdBytes() {
            Object obj = this.operationSyncId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operationSyncId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public C5240p1 getPayload() {
            C5240p1 c5240p1 = this.payload_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public InterfaceC5243q1 getPayloadOrBuilder() {
            C5240p1 c5240p1 = this.payload_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.exceptionId_) ? AbstractC5209f0.computeStringSize(1, this.exceptionId_) : 0;
            if (this.statusCode_ != StatusCode.STATUS_NOT_SPECIFIED.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(10, this.statusCode_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.exMessage_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(21, this.exMessage_);
            }
            int i9 = this.exIndex_;
            if (i9 != 0) {
                iComputeStringSize += AbstractC5248t.computeInt32Size(22, i9);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(99, getPayload());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(100, getThrownAt());
            }
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(101, this.streamId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operationSyncId_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(102, this.operationSyncId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(CALLED_INTERFACE_FIELD_NUMBER, getCalledInterface());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public StatusCode getStatusCode() {
            StatusCode statusCodeForNumber = StatusCode.forNumber(this.statusCode_);
            return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public int getStatusCodeValue() {
            return this.statusCode_;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public String getStreamId() {
            Object obj = this.streamId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.streamId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public AbstractC5235o getStreamIdBytes() {
            Object obj = this.streamId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.streamId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public w1 getThrownAt() {
            w1 w1Var = this.thrownAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public x1 getThrownAtOrBuilder() {
            w1 w1Var = this.thrownAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public boolean hasCalledInterface() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.map.Map.MapExceptionOrBuilder
        public boolean hasThrownAt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getExceptionId().hashCode()) * 37) + 10) * 53) + this.statusCode_) * 37) + 21) * 53) + getExMessage().hashCode()) * 37) + 22) * 53) + getExIndex();
            if (hasPayload()) {
                iHashCode = (((iHashCode * 37) + 99) * 53) + getPayload().hashCode();
            }
            if (hasThrownAt()) {
                iHashCode = (((iHashCode * 37) + 100) * 53) + getThrownAt().hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 101) * 53) + getStreamId().hashCode()) * 37) + 102) * 53) + getOperationSyncId().hashCode();
            if (hasCalledInterface()) {
                iHashCode2 = (((iHashCode2 * 37) + CALLED_INTERFACE_FIELD_NUMBER) * 53) + getCalledInterface().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_MapException_fieldAccessorTable.ensureFieldAccessorsInitialized(MapException.class, Builder.class);
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
            return new MapException();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.exceptionId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.exceptionId_);
            }
            if (this.statusCode_ != StatusCode.STATUS_NOT_SPECIFIED.getNumber()) {
                abstractC5248t.writeEnum(10, this.statusCode_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.exMessage_)) {
                AbstractC5209f0.writeString(abstractC5248t, 21, this.exMessage_);
            }
            int i8 = this.exIndex_;
            if (i8 != 0) {
                abstractC5248t.writeInt32(22, i8);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(99, getPayload());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(100, getThrownAt());
            }
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 101, this.streamId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operationSyncId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 102, this.operationSyncId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC5248t.writeMessage(CALLED_INTERFACE_FIELD_NUMBER, getCalledInterface());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private MapException(AbstractC5209f0.b bVar) {
            super(bVar);
            this.exceptionId_ = "";
            this.statusCode_ = 0;
            this.exMessage_ = "";
            this.exIndex_ = 0;
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(MapException mapException) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mapException);
        }

        public static MapException parseFrom(ByteBuffer byteBuffer, M m8) {
            return (MapException) PARSER.parseFrom(byteBuffer, m8);
        }

        public static MapException parseDelimitedFrom(InputStream inputStream, M m8) {
            return (MapException) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static MapException parseFrom(AbstractC5235o abstractC5235o) {
            return (MapException) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public MapException getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static MapException parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (MapException) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MapException parseFrom(byte[] bArr) {
            return (MapException) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static MapException parseFrom(byte[] bArr, M m8) {
            return (MapException) PARSER.parseFrom(bArr, m8);
        }

        public static MapException parseFrom(InputStream inputStream) {
            return (MapException) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static MapException parseFrom(InputStream inputStream, M m8) {
            return (MapException) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        private MapException() {
            this.exceptionId_ = "";
            this.statusCode_ = 0;
            this.exMessage_ = "";
            this.exIndex_ = 0;
            this.streamId_ = "";
            this.operationSyncId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.exceptionId_ = "";
            this.statusCode_ = 0;
            this.exMessage_ = "";
            this.streamId_ = "";
            this.operationSyncId_ = "";
        }

        public static MapException parseFrom(r rVar) {
            return (MapException) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static MapException parseFrom(r rVar, M m8) {
            return (MapException) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface MapExceptionOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        AsyncInterface getCalledInterface();

        AsyncInterfaceOrBuilder getCalledInterfaceOrBuilder();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        int getExIndex();

        String getExMessage();

        AbstractC5235o getExMessageBytes();

        String getExceptionId();

        AbstractC5235o getExceptionIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperationSyncId();

        AbstractC5235o getOperationSyncIdBytes();

        C5240p1 getPayload();

        InterfaceC5243q1 getPayloadOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        MapException.StatusCode getStatusCode();

        int getStatusCodeValue();

        String getStreamId();

        AbstractC5235o getStreamIdBytes();

        w1 getThrownAt();

        x1 getThrownAtOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasCalledInterface();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasPayload();

        boolean hasThrownAt();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class MaumToYouIdentifier extends AbstractC5209f0 implements MaumToYouIdentifierOrBuilder {
        public static final int LICENSED_TO_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object licensedTo_;
        private byte memoizedIsInitialized;
        private volatile Object uuid_;
        private volatile Object version_;
        private static final MaumToYouIdentifier DEFAULT_INSTANCE = new MaumToYouIdentifier();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.MaumToYouIdentifier.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public MaumToYouIdentifier parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = MaumToYouIdentifier.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements MaumToYouIdentifierOrBuilder {
            private int bitField0_;
            private Object licensedTo_;
            private Object uuid_;
            private Object version_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(MaumToYouIdentifier maumToYouIdentifier) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    maumToYouIdentifier.uuid_ = this.uuid_;
                }
                if ((i8 & 2) != 0) {
                    maumToYouIdentifier.version_ = this.version_;
                }
                if ((i8 & 4) != 0) {
                    maumToYouIdentifier.licensedTo_ = this.licensedTo_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_MaumToYouIdentifier_descriptor;
            }

            public Builder clearLicensedTo() {
                this.licensedTo_ = MaumToYouIdentifier.getDefaultInstance().getLicensedTo();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.uuid_ = MaumToYouIdentifier.getDefaultInstance().getUuid();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = MaumToYouIdentifier.getDefaultInstance().getVersion();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_MaumToYouIdentifier_descriptor;
            }

            @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
            public String getLicensedTo() {
                Object obj = this.licensedTo_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.licensedTo_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
            public AbstractC5235o getLicensedToBytes() {
                Object obj = this.licensedTo_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.licensedTo_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
            public String getUuid() {
                Object obj = this.uuid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
            public AbstractC5235o getUuidBytes() {
                Object obj = this.uuid_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.uuid_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
            public String getVersion() {
                Object obj = this.version_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.version_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
            public AbstractC5235o getVersionBytes() {
                Object obj = this.version_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.version_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_MaumToYouIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MaumToYouIdentifier.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLicensedTo(String str) {
                str.getClass();
                this.licensedTo_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLicensedToBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.licensedTo_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUuid(String str) {
                str.getClass();
                this.uuid_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUuidBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.uuid_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVersion(String str) {
                str.getClass();
                this.version_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVersionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.version_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.uuid_ = "";
                this.version_ = "";
                this.licensedTo_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MaumToYouIdentifier build() {
                MaumToYouIdentifier maumToYouIdentifierBuildPartial = buildPartial();
                if (maumToYouIdentifierBuildPartial.isInitialized()) {
                    return maumToYouIdentifierBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) maumToYouIdentifierBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MaumToYouIdentifier buildPartial() {
                MaumToYouIdentifier maumToYouIdentifier = new MaumToYouIdentifier(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(maumToYouIdentifier);
                }
                onBuilt();
                return maumToYouIdentifier;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MaumToYouIdentifier getDefaultInstanceForType() {
                return MaumToYouIdentifier.getDefaultInstance();
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
                this.uuid_ = "";
                this.version_ = "";
                this.licensedTo_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.uuid_ = "";
                this.version_ = "";
                this.licensedTo_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof MaumToYouIdentifier) {
                    return mergeFrom((MaumToYouIdentifier) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(MaumToYouIdentifier maumToYouIdentifier) {
                if (maumToYouIdentifier == MaumToYouIdentifier.getDefaultInstance()) {
                    return this;
                }
                if (!maumToYouIdentifier.getUuid().isEmpty()) {
                    this.uuid_ = maumToYouIdentifier.uuid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!maumToYouIdentifier.getVersion().isEmpty()) {
                    this.version_ = maumToYouIdentifier.version_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!maumToYouIdentifier.getLicensedTo().isEmpty()) {
                    this.licensedTo_ = maumToYouIdentifier.licensedTo_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(maumToYouIdentifier.getUnknownFields());
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
                                    this.uuid_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.version_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.licensedTo_ = rVar.readStringRequireUtf8();
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

        /* synthetic */ MaumToYouIdentifier(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static MaumToYouIdentifier getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_MaumToYouIdentifier_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MaumToYouIdentifier parseDelimitedFrom(InputStream inputStream) {
            return (MaumToYouIdentifier) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MaumToYouIdentifier parseFrom(ByteBuffer byteBuffer) {
            return (MaumToYouIdentifier) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MaumToYouIdentifier)) {
                return super.equals(obj);
            }
            MaumToYouIdentifier maumToYouIdentifier = (MaumToYouIdentifier) obj;
            return getUuid().equals(maumToYouIdentifier.getUuid()) && getVersion().equals(maumToYouIdentifier.getVersion()) && getLicensedTo().equals(maumToYouIdentifier.getLicensedTo()) && getUnknownFields().equals(maumToYouIdentifier.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
        public String getLicensedTo() {
            Object obj = this.licensedTo_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.licensedTo_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
        public AbstractC5235o getLicensedToBytes() {
            Object obj = this.licensedTo_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.licensedTo_ = abstractC5235oCopyFromUtf8;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.uuid_) ? AbstractC5209f0.computeStringSize(1, this.uuid_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.version_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.version_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.licensedTo_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.licensedTo_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.uuid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
        public AbstractC5235o getUuidBytes() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.uuid_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.MaumToYouIdentifierOrBuilder
        public AbstractC5235o getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.version_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUuid().hashCode()) * 37) + 2) * 53) + getVersion().hashCode()) * 37) + 3) * 53) + getLicensedTo().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_MaumToYouIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MaumToYouIdentifier.class, Builder.class);
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
            return new MaumToYouIdentifier();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.uuid_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.uuid_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.version_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.version_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.licensedTo_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.licensedTo_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private MaumToYouIdentifier(AbstractC5209f0.b bVar) {
            super(bVar);
            this.uuid_ = "";
            this.version_ = "";
            this.licensedTo_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(MaumToYouIdentifier maumToYouIdentifier) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(maumToYouIdentifier);
        }

        public static MaumToYouIdentifier parseFrom(ByteBuffer byteBuffer, M m8) {
            return (MaumToYouIdentifier) PARSER.parseFrom(byteBuffer, m8);
        }

        public static MaumToYouIdentifier parseDelimitedFrom(InputStream inputStream, M m8) {
            return (MaumToYouIdentifier) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static MaumToYouIdentifier parseFrom(AbstractC5235o abstractC5235o) {
            return (MaumToYouIdentifier) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public MaumToYouIdentifier getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static MaumToYouIdentifier parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (MaumToYouIdentifier) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MaumToYouIdentifier parseFrom(byte[] bArr) {
            return (MaumToYouIdentifier) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static MaumToYouIdentifier parseFrom(byte[] bArr, M m8) {
            return (MaumToYouIdentifier) PARSER.parseFrom(bArr, m8);
        }

        private MaumToYouIdentifier() {
            this.uuid_ = "";
            this.version_ = "";
            this.licensedTo_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.uuid_ = "";
            this.version_ = "";
            this.licensedTo_ = "";
        }

        public static MaumToYouIdentifier parseFrom(InputStream inputStream) {
            return (MaumToYouIdentifier) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static MaumToYouIdentifier parseFrom(InputStream inputStream, M m8) {
            return (MaumToYouIdentifier) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static MaumToYouIdentifier parseFrom(r rVar) {
            return (MaumToYouIdentifier) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static MaumToYouIdentifier parseFrom(r rVar, M m8) {
            return (MaumToYouIdentifier) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface MaumToYouIdentifierOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

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

        String getLicensedTo();

        AbstractC5235o getLicensedToBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUuid();

        AbstractC5235o getUuidBytes();

        String getVersion();

        AbstractC5235o getVersionBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class PingRequest extends AbstractC5209f0 implements PingRequestOrBuilder {
        public static final int DEVICE_FIELD_NUMBER = 1;
        public static final int PING_AT_FIELD_NUMBER = 101;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeviceOuterClass.Device device_;
        private byte memoizedIsInitialized;
        private w1 pingAt_;
        private static final PingRequest DEFAULT_INSTANCE = new PingRequest();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.PingRequest.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public PingRequest parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = PingRequest.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements PingRequestOrBuilder {
            private int bitField0_;
            private C5228l1 deviceBuilder_;
            private DeviceOuterClass.Device device_;
            private C5228l1 pingAtBuilder_;
            private w1 pingAt_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(PingRequest pingRequest) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    pingRequest.device_ = c5228l1 == null ? this.device_ : (DeviceOuterClass.Device) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l12 = this.pingAtBuilder_;
                    pingRequest.pingAt_ = c5228l12 == null ? this.pingAt_ : (w1) c5228l12.build();
                    i8 |= 2;
                }
                PingRequest.access$876(pingRequest, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_PingRequest_descriptor;
            }

            private C5228l1 getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new C5228l1(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private C5228l1 getPingAtFieldBuilder() {
                if (this.pingAtBuilder_ == null) {
                    this.pingAtBuilder_ = new C5228l1(getPingAt(), getParentForChildren(), isClean());
                    this.pingAt_ = null;
                }
                return this.pingAtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getDeviceFieldBuilder();
                    getPingAtFieldBuilder();
                }
            }

            public Builder clearDevice() {
                this.bitField0_ &= -2;
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPingAt() {
                this.bitField0_ &= -3;
                this.pingAt_ = null;
                C5228l1 c5228l1 = this.pingAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.pingAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_PingRequest_descriptor;
            }

            @Override // maum.m2u.map.Map.PingRequestOrBuilder
            public DeviceOuterClass.Device getDevice() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.Device) c5228l1.getMessage();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            public DeviceOuterClass.Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DeviceOuterClass.Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.PingRequestOrBuilder
            public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.DeviceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            @Override // maum.m2u.map.Map.PingRequestOrBuilder
            public w1 getPingAt() {
                C5228l1 c5228l1 = this.pingAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.pingAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getPingAtBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (w1.b) getPingAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.PingRequestOrBuilder
            public x1 getPingAtOrBuilder() {
                C5228l1 c5228l1 = this.pingAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.pingAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.map.Map.PingRequestOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // maum.m2u.map.Map.PingRequestOrBuilder
            public boolean hasPingAt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_PingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PingRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(DeviceOuterClass.Device device) {
                DeviceOuterClass.Device device2;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(device);
                } else if ((this.bitField0_ & 1) == 0 || (device2 = this.device_) == null || device2 == DeviceOuterClass.Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergePingAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.pingAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 2) == 0 || (w1Var2 = this.pingAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.pingAt_ = w1Var;
                } else {
                    getPingAtBuilder().mergeFrom(w1Var);
                }
                if (this.pingAt_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device device) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    c5228l1.setMessage(device);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPingAt(w1 w1Var) {
                C5228l1 c5228l1 = this.pingAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.pingAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
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
            public PingRequest build() {
                PingRequest pingRequestBuildPartial = buildPartial();
                if (pingRequestBuildPartial.isInitialized()) {
                    return pingRequestBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) pingRequestBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public PingRequest buildPartial() {
                PingRequest pingRequest = new PingRequest(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(pingRequest);
                }
                onBuilt();
                return pingRequest;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public PingRequest getDefaultInstanceForType() {
                return PingRequest.getDefaultInstance();
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
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                this.pingAt_ = null;
                C5228l1 c5228l12 = this.pingAtBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.pingAtBuilder_ = null;
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
                if (h02 instanceof PingRequest) {
                    return mergeFrom((PingRequest) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device.Builder builder) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    this.device_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPingAt(w1.b bVar) {
                C5228l1 c5228l1 = this.pingAtBuilder_;
                if (c5228l1 == null) {
                    this.pingAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(PingRequest pingRequest) {
                if (pingRequest == PingRequest.getDefaultInstance()) {
                    return this;
                }
                if (pingRequest.hasDevice()) {
                    mergeDevice(pingRequest.getDevice());
                }
                if (pingRequest.hasPingAt()) {
                    mergePingAt(pingRequest.getPingAt());
                }
                mergeUnknownFields(pingRequest.getUnknownFields());
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
                                    rVar.readMessage(getDeviceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag != 810) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPingAtFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ PingRequest(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$876(PingRequest pingRequest, int i8) {
            int i9 = i8 | pingRequest.bitField0_;
            pingRequest.bitField0_ = i9;
            return i9;
        }

        public static PingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_PingRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PingRequest parseDelimitedFrom(InputStream inputStream) {
            return (PingRequest) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PingRequest parseFrom(ByteBuffer byteBuffer) {
            return (PingRequest) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PingRequest)) {
                return super.equals(obj);
            }
            PingRequest pingRequest = (PingRequest) obj;
            if (hasDevice() != pingRequest.hasDevice()) {
                return false;
            }
            if ((!hasDevice() || getDevice().equals(pingRequest.getDevice())) && hasPingAt() == pingRequest.hasPingAt()) {
                return (!hasPingAt() || getPingAt().equals(pingRequest.getPingAt())) && getUnknownFields().equals(pingRequest.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.PingRequestOrBuilder
        public DeviceOuterClass.Device getDevice() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // maum.m2u.map.Map.PingRequestOrBuilder
        public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.PingRequestOrBuilder
        public w1 getPingAt() {
            w1 w1Var = this.pingAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.PingRequestOrBuilder
        public x1 getPingAtOrBuilder() {
            w1 w1Var = this.pingAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getDevice()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(101, getPingAt());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.PingRequestOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.map.Map.PingRequestOrBuilder
        public boolean hasPingAt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDevice()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDevice().hashCode();
            }
            if (hasPingAt()) {
                iHashCode = (((iHashCode * 37) + 101) * 53) + getPingAt().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_PingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PingRequest.class, Builder.class);
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
            return new PingRequest();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getDevice());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(101, getPingAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private PingRequest(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(PingRequest pingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pingRequest);
        }

        public static PingRequest parseFrom(ByteBuffer byteBuffer, M m8) {
            return (PingRequest) PARSER.parseFrom(byteBuffer, m8);
        }

        public static PingRequest parseDelimitedFrom(InputStream inputStream, M m8) {
            return (PingRequest) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static PingRequest parseFrom(AbstractC5235o abstractC5235o) {
            return (PingRequest) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public PingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        private PingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PingRequest parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (PingRequest) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PingRequest parseFrom(byte[] bArr) {
            return (PingRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static PingRequest parseFrom(byte[] bArr, M m8) {
            return (PingRequest) PARSER.parseFrom(bArr, m8);
        }

        public static PingRequest parseFrom(InputStream inputStream) {
            return (PingRequest) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static PingRequest parseFrom(InputStream inputStream, M m8) {
            return (PingRequest) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static PingRequest parseFrom(r rVar) {
            return (PingRequest) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static PingRequest parseFrom(r rVar, M m8) {
            return (PingRequest) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface PingRequestOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        DeviceOuterClass.Device getDevice();

        DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        w1 getPingAt();

        x1 getPingAtOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasDevice();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasPingAt();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class PongResponse extends AbstractC5209f0 implements PongResponseOrBuilder {
        public static final int CLIENT_STATE_FIELD_NUMBER = 1;
        public static final int DIR_STATE_FIELD_NUMBER = 11;
        public static final int M2U_ID_FIELD_NUMBER = 2;
        public static final int PONG_AT_FIELD_NUMBER = 100;
        public static final int REQUIRE_EVENT_STREAM_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 99;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int clientState_;
        private DirectiveState dirState_;
        private MaumToYouIdentifier m2UId_;
        private byte memoizedIsInitialized;
        private w1 pongAt_;
        private boolean requireEventStream_;
        private volatile Object version_;
        private static final PongResponse DEFAULT_INSTANCE = new PongResponse();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.PongResponse.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public PongResponse parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = PongResponse.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements PongResponseOrBuilder {
            private int bitField0_;
            private int clientState_;
            private C5228l1 dirStateBuilder_;
            private DirectiveState dirState_;
            private C5228l1 m2UIdBuilder_;
            private MaumToYouIdentifier m2UId_;
            private C5228l1 pongAtBuilder_;
            private w1 pongAt_;
            private boolean requireEventStream_;
            private Object version_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(PongResponse pongResponse) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    pongResponse.clientState_ = this.clientState_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.m2UIdBuilder_;
                    pongResponse.m2UId_ = c5228l1 == null ? this.m2UId_ : (MaumToYouIdentifier) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 4) != 0) {
                    pongResponse.requireEventStream_ = this.requireEventStream_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.dirStateBuilder_;
                    pongResponse.dirState_ = c5228l12 == null ? this.dirState_ : (DirectiveState) c5228l12.build();
                    i8 |= 2;
                }
                if ((i9 & 16) != 0) {
                    pongResponse.version_ = this.version_;
                }
                if ((i9 & 32) != 0) {
                    C5228l1 c5228l13 = this.pongAtBuilder_;
                    pongResponse.pongAt_ = c5228l13 == null ? this.pongAt_ : (w1) c5228l13.build();
                    i8 |= 4;
                }
                PongResponse.access$2176(pongResponse, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_PongResponse_descriptor;
            }

            private C5228l1 getDirStateFieldBuilder() {
                if (this.dirStateBuilder_ == null) {
                    this.dirStateBuilder_ = new C5228l1(getDirState(), getParentForChildren(), isClean());
                    this.dirState_ = null;
                }
                return this.dirStateBuilder_;
            }

            private C5228l1 getM2UIdFieldBuilder() {
                if (this.m2UIdBuilder_ == null) {
                    this.m2UIdBuilder_ = new C5228l1(getM2UId(), getParentForChildren(), isClean());
                    this.m2UId_ = null;
                }
                return this.m2UIdBuilder_;
            }

            private C5228l1 getPongAtFieldBuilder() {
                if (this.pongAtBuilder_ == null) {
                    this.pongAtBuilder_ = new C5228l1(getPongAt(), getParentForChildren(), isClean());
                    this.pongAt_ = null;
                }
                return this.pongAtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getM2UIdFieldBuilder();
                    getDirStateFieldBuilder();
                    getPongAtFieldBuilder();
                }
            }

            public Builder clearClientState() {
                this.bitField0_ &= -2;
                this.clientState_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDirState() {
                this.bitField0_ &= -9;
                this.dirState_ = null;
                C5228l1 c5228l1 = this.dirStateBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.dirStateBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearM2UId() {
                this.bitField0_ &= -3;
                this.m2UId_ = null;
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.m2UIdBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPongAt() {
                this.bitField0_ &= -33;
                this.pongAt_ = null;
                C5228l1 c5228l1 = this.pongAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.pongAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRequireEventStream() {
                this.bitField0_ &= -5;
                this.requireEventStream_ = false;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = PongResponse.getDefaultInstance().getVersion();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public PongClientState getClientState() {
                PongClientState pongClientStateForNumber = PongClientState.forNumber(this.clientState_);
                return pongClientStateForNumber == null ? PongClientState.UNRECOGNIZED : pongClientStateForNumber;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public int getClientStateValue() {
                return this.clientState_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_PongResponse_descriptor;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public DirectiveState getDirState() {
                C5228l1 c5228l1 = this.dirStateBuilder_;
                if (c5228l1 != null) {
                    return (DirectiveState) c5228l1.getMessage();
                }
                DirectiveState directiveState = this.dirState_;
                return directiveState == null ? DirectiveState.getDefaultInstance() : directiveState;
            }

            public DirectiveState.Builder getDirStateBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DirectiveState.Builder) getDirStateFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public DirectiveStateOrBuilder getDirStateOrBuilder() {
                C5228l1 c5228l1 = this.dirStateBuilder_;
                if (c5228l1 != null) {
                    return (DirectiveStateOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DirectiveState directiveState = this.dirState_;
                return directiveState == null ? DirectiveState.getDefaultInstance() : directiveState;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public MaumToYouIdentifier getM2UId() {
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 != null) {
                    return (MaumToYouIdentifier) c5228l1.getMessage();
                }
                MaumToYouIdentifier maumToYouIdentifier = this.m2UId_;
                return maumToYouIdentifier == null ? MaumToYouIdentifier.getDefaultInstance() : maumToYouIdentifier;
            }

            public MaumToYouIdentifier.Builder getM2UIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (MaumToYouIdentifier.Builder) getM2UIdFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public MaumToYouIdentifierOrBuilder getM2UIdOrBuilder() {
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 != null) {
                    return (MaumToYouIdentifierOrBuilder) c5228l1.getMessageOrBuilder();
                }
                MaumToYouIdentifier maumToYouIdentifier = this.m2UId_;
                return maumToYouIdentifier == null ? MaumToYouIdentifier.getDefaultInstance() : maumToYouIdentifier;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public w1 getPongAt() {
                C5228l1 c5228l1 = this.pongAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.pongAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getPongAtBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (w1.b) getPongAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public x1 getPongAtOrBuilder() {
                C5228l1 c5228l1 = this.pongAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.pongAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public boolean getRequireEventStream() {
                return this.requireEventStream_;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public String getVersion() {
                Object obj = this.version_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.version_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public AbstractC5235o getVersionBytes() {
                Object obj = this.version_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.version_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public boolean hasDirState() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public boolean hasM2UId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // maum.m2u.map.Map.PongResponseOrBuilder
            public boolean hasPongAt() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_PongResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PongResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDirState(DirectiveState directiveState) {
                DirectiveState directiveState2;
                C5228l1 c5228l1 = this.dirStateBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(directiveState);
                } else if ((this.bitField0_ & 8) == 0 || (directiveState2 = this.dirState_) == null || directiveState2 == DirectiveState.getDefaultInstance()) {
                    this.dirState_ = directiveState;
                } else {
                    getDirStateBuilder().mergeFrom(directiveState);
                }
                if (this.dirState_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeM2UId(MaumToYouIdentifier maumToYouIdentifier) {
                MaumToYouIdentifier maumToYouIdentifier2;
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(maumToYouIdentifier);
                } else if ((this.bitField0_ & 2) == 0 || (maumToYouIdentifier2 = this.m2UId_) == null || maumToYouIdentifier2 == MaumToYouIdentifier.getDefaultInstance()) {
                    this.m2UId_ = maumToYouIdentifier;
                } else {
                    getM2UIdBuilder().mergeFrom(maumToYouIdentifier);
                }
                if (this.m2UId_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergePongAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.pongAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 32) == 0 || (w1Var2 = this.pongAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.pongAt_ = w1Var;
                } else {
                    getPongAtBuilder().mergeFrom(w1Var);
                }
                if (this.pongAt_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder setClientState(PongClientState pongClientState) {
                pongClientState.getClass();
                this.bitField0_ |= 1;
                this.clientState_ = pongClientState.getNumber();
                onChanged();
                return this;
            }

            public Builder setClientStateValue(int i8) {
                this.clientState_ = i8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDirState(DirectiveState directiveState) {
                C5228l1 c5228l1 = this.dirStateBuilder_;
                if (c5228l1 == null) {
                    directiveState.getClass();
                    this.dirState_ = directiveState;
                } else {
                    c5228l1.setMessage(directiveState);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setM2UId(MaumToYouIdentifier maumToYouIdentifier) {
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 == null) {
                    maumToYouIdentifier.getClass();
                    this.m2UId_ = maumToYouIdentifier;
                } else {
                    c5228l1.setMessage(maumToYouIdentifier);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPongAt(w1 w1Var) {
                C5228l1 c5228l1 = this.pongAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.pongAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setRequireEventStream(boolean z8) {
                this.requireEventStream_ = z8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVersion(String str) {
                str.getClass();
                this.version_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVersionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.version_ = abstractC5235o;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.clientState_ = 0;
                this.version_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public PongResponse build() {
                PongResponse pongResponseBuildPartial = buildPartial();
                if (pongResponseBuildPartial.isInitialized()) {
                    return pongResponseBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) pongResponseBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public PongResponse buildPartial() {
                PongResponse pongResponse = new PongResponse(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(pongResponse);
                }
                onBuilt();
                return pongResponse;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public PongResponse getDefaultInstanceForType() {
                return PongResponse.getDefaultInstance();
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
                this.clientState_ = 0;
                this.m2UId_ = null;
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.m2UIdBuilder_ = null;
                }
                this.requireEventStream_ = false;
                this.dirState_ = null;
                C5228l1 c5228l12 = this.dirStateBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.dirStateBuilder_ = null;
                }
                this.version_ = "";
                this.pongAt_ = null;
                C5228l1 c5228l13 = this.pongAtBuilder_;
                if (c5228l13 != null) {
                    c5228l13.dispose();
                    this.pongAtBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.clientState_ = 0;
                this.version_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof PongResponse) {
                    return mergeFrom((PongResponse) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setDirState(DirectiveState.Builder builder) {
                C5228l1 c5228l1 = this.dirStateBuilder_;
                if (c5228l1 == null) {
                    this.dirState_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setM2UId(MaumToYouIdentifier.Builder builder) {
                C5228l1 c5228l1 = this.m2UIdBuilder_;
                if (c5228l1 == null) {
                    this.m2UId_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPongAt(w1.b bVar) {
                C5228l1 c5228l1 = this.pongAtBuilder_;
                if (c5228l1 == null) {
                    this.pongAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder mergeFrom(PongResponse pongResponse) {
                if (pongResponse == PongResponse.getDefaultInstance()) {
                    return this;
                }
                if (pongResponse.clientState_ != 0) {
                    setClientStateValue(pongResponse.getClientStateValue());
                }
                if (pongResponse.hasM2UId()) {
                    mergeM2UId(pongResponse.getM2UId());
                }
                if (pongResponse.getRequireEventStream()) {
                    setRequireEventStream(pongResponse.getRequireEventStream());
                }
                if (pongResponse.hasDirState()) {
                    mergeDirState(pongResponse.getDirState());
                }
                if (!pongResponse.getVersion().isEmpty()) {
                    this.version_ = pongResponse.version_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (pongResponse.hasPongAt()) {
                    mergePongAt(pongResponse.getPongAt());
                }
                mergeUnknownFields(pongResponse.getUnknownFields());
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
                                if (tag == 8) {
                                    this.clientState_ = rVar.readEnum();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getM2UIdFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.requireEventStream_ = rVar.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 90) {
                                    rVar.readMessage(getDirStateFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                } else if (tag == 794) {
                                    this.version_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                } else if (tag != 802) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPongAtFieldBuilder().getBuilder(), m8);
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

        public enum PongClientState implements InterfaceC5204d1 {
            PONG_CLIENT_CONTINUE(0),
            PONG_NEW_CLIENT_FOUND(1),
            PONG_IDLE_CLIENT_RESTART(2),
            PONG_ACCESS_DENIED(3),
            UNRECOGNIZED(-1);

            public static final int PONG_ACCESS_DENIED_VALUE = 3;
            public static final int PONG_CLIENT_CONTINUE_VALUE = 0;
            public static final int PONG_IDLE_CLIENT_RESTART_VALUE = 2;
            public static final int PONG_NEW_CLIENT_FOUND_VALUE = 1;
            private final int value;
            private static final AbstractC5227l0.d internalValueMap = new AbstractC5227l0.d() { // from class: maum.m2u.map.Map.PongResponse.PongClientState.1
                @Override // com.google.protobuf.AbstractC5227l0.d
                public PongClientState findValueByNumber(int i8) {
                    return PongClientState.forNumber(i8);
                }
            };
            private static final PongClientState[] VALUES = values();

            PongClientState(int i8) {
                this.value = i8;
            }

            public static PongClientState forNumber(int i8) {
                if (i8 == 0) {
                    return PONG_CLIENT_CONTINUE;
                }
                if (i8 == 1) {
                    return PONG_NEW_CLIENT_FOUND;
                }
                if (i8 == 2) {
                    return PONG_IDLE_CLIENT_RESTART;
                }
                if (i8 != 3) {
                    return null;
                }
                return PONG_ACCESS_DENIED;
            }

            public static final C5269x.e getDescriptor() {
                return PongResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static AbstractC5227l0.d internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static PongClientState valueOf(int i8) {
                return forNumber(i8);
            }

            public static PongClientState valueOf(C5269x.f fVar) {
                if (fVar.getType() == getDescriptor()) {
                    if (fVar.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        /* synthetic */ PongResponse(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$2176(PongResponse pongResponse, int i8) {
            int i9 = i8 | pongResponse.bitField0_;
            pongResponse.bitField0_ = i9;
            return i9;
        }

        public static PongResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_PongResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PongResponse parseDelimitedFrom(InputStream inputStream) {
            return (PongResponse) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PongResponse parseFrom(ByteBuffer byteBuffer) {
            return (PongResponse) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PongResponse)) {
                return super.equals(obj);
            }
            PongResponse pongResponse = (PongResponse) obj;
            if (this.clientState_ != pongResponse.clientState_ || hasM2UId() != pongResponse.hasM2UId()) {
                return false;
            }
            if ((hasM2UId() && !getM2UId().equals(pongResponse.getM2UId())) || getRequireEventStream() != pongResponse.getRequireEventStream() || hasDirState() != pongResponse.hasDirState()) {
                return false;
            }
            if ((!hasDirState() || getDirState().equals(pongResponse.getDirState())) && getVersion().equals(pongResponse.getVersion()) && hasPongAt() == pongResponse.hasPongAt()) {
                return (!hasPongAt() || getPongAt().equals(pongResponse.getPongAt())) && getUnknownFields().equals(pongResponse.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public PongClientState getClientState() {
            PongClientState pongClientStateForNumber = PongClientState.forNumber(this.clientState_);
            return pongClientStateForNumber == null ? PongClientState.UNRECOGNIZED : pongClientStateForNumber;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public int getClientStateValue() {
            return this.clientState_;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public DirectiveState getDirState() {
            DirectiveState directiveState = this.dirState_;
            return directiveState == null ? DirectiveState.getDefaultInstance() : directiveState;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public DirectiveStateOrBuilder getDirStateOrBuilder() {
            DirectiveState directiveState = this.dirState_;
            return directiveState == null ? DirectiveState.getDefaultInstance() : directiveState;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public MaumToYouIdentifier getM2UId() {
            MaumToYouIdentifier maumToYouIdentifier = this.m2UId_;
            return maumToYouIdentifier == null ? MaumToYouIdentifier.getDefaultInstance() : maumToYouIdentifier;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public MaumToYouIdentifierOrBuilder getM2UIdOrBuilder() {
            MaumToYouIdentifier maumToYouIdentifier = this.m2UId_;
            return maumToYouIdentifier == null ? MaumToYouIdentifier.getDefaultInstance() : maumToYouIdentifier;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public w1 getPongAt() {
            w1 w1Var = this.pongAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public x1 getPongAtOrBuilder() {
            w1 w1Var = this.pongAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public boolean getRequireEventStream() {
            return this.requireEventStream_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeEnumSize = this.clientState_ != PongClientState.PONG_CLIENT_CONTINUE.getNumber() ? AbstractC5248t.computeEnumSize(1, this.clientState_) : 0;
            if ((this.bitField0_ & 1) != 0) {
                iComputeEnumSize += AbstractC5248t.computeMessageSize(2, getM2UId());
            }
            boolean z8 = this.requireEventStream_;
            if (z8) {
                iComputeEnumSize += AbstractC5248t.computeBoolSize(3, z8);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += AbstractC5248t.computeMessageSize(11, getDirState());
            }
            if (!AbstractC5209f0.isStringEmpty(this.version_)) {
                iComputeEnumSize += AbstractC5209f0.computeStringSize(99, this.version_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += AbstractC5248t.computeMessageSize(100, getPongAt());
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public AbstractC5235o getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.version_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public boolean hasDirState() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public boolean hasM2UId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.map.Map.PongResponseOrBuilder
        public boolean hasPongAt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.clientState_;
            if (hasM2UId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getM2UId().hashCode();
            }
            int iHashBoolean = (((iHashCode * 37) + 3) * 53) + AbstractC5227l0.hashBoolean(getRequireEventStream());
            if (hasDirState()) {
                iHashBoolean = (((iHashBoolean * 37) + 11) * 53) + getDirState().hashCode();
            }
            int iHashCode2 = (((iHashBoolean * 37) + 99) * 53) + getVersion().hashCode();
            if (hasPongAt()) {
                iHashCode2 = (((iHashCode2 * 37) + 100) * 53) + getPongAt().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_PongResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PongResponse.class, Builder.class);
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
            return new PongResponse();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.clientState_ != PongClientState.PONG_CLIENT_CONTINUE.getNumber()) {
                abstractC5248t.writeEnum(1, this.clientState_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getM2UId());
            }
            boolean z8 = this.requireEventStream_;
            if (z8) {
                abstractC5248t.writeBool(3, z8);
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(11, getDirState());
            }
            if (!AbstractC5209f0.isStringEmpty(this.version_)) {
                AbstractC5209f0.writeString(abstractC5248t, 99, this.version_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC5248t.writeMessage(100, getPongAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private PongResponse(AbstractC5209f0.b bVar) {
            super(bVar);
            this.clientState_ = 0;
            this.requireEventStream_ = false;
            this.version_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(PongResponse pongResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pongResponse);
        }

        public static PongResponse parseFrom(ByteBuffer byteBuffer, M m8) {
            return (PongResponse) PARSER.parseFrom(byteBuffer, m8);
        }

        public static PongResponse parseDelimitedFrom(InputStream inputStream, M m8) {
            return (PongResponse) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static PongResponse parseFrom(AbstractC5235o abstractC5235o) {
            return (PongResponse) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public PongResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static PongResponse parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (PongResponse) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PongResponse parseFrom(byte[] bArr) {
            return (PongResponse) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static PongResponse parseFrom(byte[] bArr, M m8) {
            return (PongResponse) PARSER.parseFrom(bArr, m8);
        }

        private PongResponse() {
            this.clientState_ = 0;
            this.requireEventStream_ = false;
            this.version_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.clientState_ = 0;
            this.version_ = "";
        }

        public static PongResponse parseFrom(InputStream inputStream) {
            return (PongResponse) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static PongResponse parseFrom(InputStream inputStream, M m8) {
            return (PongResponse) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static PongResponse parseFrom(r rVar) {
            return (PongResponse) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static PongResponse parseFrom(r rVar, M m8) {
            return (PongResponse) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface PongResponseOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        PongResponse.PongClientState getClientState();

        int getClientStateValue();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        DirectiveState getDirState();

        DirectiveStateOrBuilder getDirStateOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        MaumToYouIdentifier getM2UId();

        MaumToYouIdentifierOrBuilder getM2UIdOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        w1 getPongAt();

        x1 getPongAtOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        boolean getRequireEventStream();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getVersion();

        AbstractC5235o getVersionBytes();

        boolean hasDirState();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasM2UId();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasPongAt();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class StreamBreak extends AbstractC5209f0 implements StreamBreakOrBuilder {
        public static final int BREAKER_FIELD_NUMBER = 2;
        public static final int BROKEN_AT_FIELD_NUMBER = 100;
        private static final StreamBreak DEFAULT_INSTANCE = new StreamBreak();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.StreamBreak.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public StreamBreak parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = StreamBreak.newBuilder();
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
        public static final int REASON_FIELD_NUMBER = 1;
        public static final int STREAM_ID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int breaker_;
        private w1 brokenAt_;
        private byte memoizedIsInitialized;
        private volatile Object reason_;
        private volatile Object streamId_;

        public static final class Builder extends AbstractC5209f0.b implements StreamBreakOrBuilder {
            private int bitField0_;
            private int breaker_;
            private C5228l1 brokenAtBuilder_;
            private w1 brokenAt_;
            private Object reason_;
            private Object streamId_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(StreamBreak streamBreak) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    streamBreak.reason_ = this.reason_;
                }
                if ((i9 & 2) != 0) {
                    streamBreak.breaker_ = this.breaker_;
                }
                if ((i9 & 4) != 0) {
                    streamBreak.streamId_ = this.streamId_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.brokenAtBuilder_;
                    streamBreak.brokenAt_ = c5228l1 == null ? this.brokenAt_ : (w1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                StreamBreak.access$16276(streamBreak, i8);
            }

            private C5228l1 getBrokenAtFieldBuilder() {
                if (this.brokenAtBuilder_ == null) {
                    this.brokenAtBuilder_ = new C5228l1(getBrokenAt(), getParentForChildren(), isClean());
                    this.brokenAt_ = null;
                }
                return this.brokenAtBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_StreamBreak_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getBrokenAtFieldBuilder();
                }
            }

            public Builder clearBreaker() {
                this.bitField0_ &= -3;
                this.breaker_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBrokenAt() {
                this.bitField0_ &= -9;
                this.brokenAt_ = null;
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.brokenAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearReason() {
                this.reason_ = StreamBreak.getDefaultInstance().getReason();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStreamId() {
                this.streamId_ = StreamBreak.getDefaultInstance().getStreamId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public StreamBreaker getBreaker() {
                StreamBreaker streamBreakerForNumber = StreamBreaker.forNumber(this.breaker_);
                return streamBreakerForNumber == null ? StreamBreaker.UNRECOGNIZED : streamBreakerForNumber;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public int getBreakerValue() {
                return this.breaker_;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public w1 getBrokenAt() {
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.brokenAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getBrokenAtBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (w1.b) getBrokenAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public x1 getBrokenAtOrBuilder() {
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.brokenAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_StreamBreak_descriptor;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public String getReason() {
                Object obj = this.reason_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.reason_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public AbstractC5235o getReasonBytes() {
                Object obj = this.reason_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.reason_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public String getStreamId() {
                Object obj = this.streamId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.streamId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public AbstractC5235o getStreamIdBytes() {
                Object obj = this.streamId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.streamId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.StreamBreakOrBuilder
            public boolean hasBrokenAt() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_StreamBreak_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamBreak.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBrokenAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 8) == 0 || (w1Var2 = this.brokenAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.brokenAt_ = w1Var;
                } else {
                    getBrokenAtBuilder().mergeFrom(w1Var);
                }
                if (this.brokenAt_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setBreaker(StreamBreaker streamBreaker) {
                streamBreaker.getClass();
                this.bitField0_ |= 2;
                this.breaker_ = streamBreaker.getNumber();
                onChanged();
                return this;
            }

            public Builder setBreakerValue(int i8) {
                this.breaker_ = i8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setBrokenAt(w1 w1Var) {
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.brokenAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setReason(String str) {
                str.getClass();
                this.reason_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReasonBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.reason_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStreamIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.streamId_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.reason_ = "";
                this.breaker_ = 0;
                this.streamId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public StreamBreak build() {
                StreamBreak streamBreakBuildPartial = buildPartial();
                if (streamBreakBuildPartial.isInitialized()) {
                    return streamBreakBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) streamBreakBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public StreamBreak buildPartial() {
                StreamBreak streamBreak = new StreamBreak(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(streamBreak);
                }
                onBuilt();
                return streamBreak;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public StreamBreak getDefaultInstanceForType() {
                return StreamBreak.getDefaultInstance();
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
                this.reason_ = "";
                this.breaker_ = 0;
                this.streamId_ = "";
                this.brokenAt_ = null;
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.brokenAtBuilder_ = null;
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
                if (h02 instanceof StreamBreak) {
                    return mergeFrom((StreamBreak) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setBrokenAt(w1.b bVar) {
                C5228l1 c5228l1 = this.brokenAtBuilder_;
                if (c5228l1 == null) {
                    this.brokenAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.reason_ = "";
                this.breaker_ = 0;
                this.streamId_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(StreamBreak streamBreak) {
                if (streamBreak == StreamBreak.getDefaultInstance()) {
                    return this;
                }
                if (!streamBreak.getReason().isEmpty()) {
                    this.reason_ = streamBreak.reason_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (streamBreak.breaker_ != 0) {
                    setBreakerValue(streamBreak.getBreakerValue());
                }
                if (!streamBreak.getStreamId().isEmpty()) {
                    this.streamId_ = streamBreak.streamId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (streamBreak.hasBrokenAt()) {
                    mergeBrokenAt(streamBreak.getBrokenAt());
                }
                mergeUnknownFields(streamBreak.getUnknownFields());
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
                                    this.reason_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.breaker_ = rVar.readEnum();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.streamId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 802) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getBrokenAtFieldBuilder().getBuilder(), m8);
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

        public enum StreamBreaker implements InterfaceC5204d1 {
            BREAK_BY_UNSPECIFIED(0),
            BREAK_BY_USER(1),
            BREAK_BY_SYSTEM(2),
            BREAK_BY_LOGICAL(3),
            BREAK_BY_EXCEPTION(4),
            UNRECOGNIZED(-1);

            public static final int BREAK_BY_EXCEPTION_VALUE = 4;
            public static final int BREAK_BY_LOGICAL_VALUE = 3;
            public static final int BREAK_BY_SYSTEM_VALUE = 2;
            public static final int BREAK_BY_UNSPECIFIED_VALUE = 0;
            public static final int BREAK_BY_USER_VALUE = 1;
            private final int value;
            private static final AbstractC5227l0.d internalValueMap = new AbstractC5227l0.d() { // from class: maum.m2u.map.Map.StreamBreak.StreamBreaker.1
                @Override // com.google.protobuf.AbstractC5227l0.d
                public StreamBreaker findValueByNumber(int i8) {
                    return StreamBreaker.forNumber(i8);
                }
            };
            private static final StreamBreaker[] VALUES = values();

            StreamBreaker(int i8) {
                this.value = i8;
            }

            public static StreamBreaker forNumber(int i8) {
                if (i8 == 0) {
                    return BREAK_BY_UNSPECIFIED;
                }
                if (i8 == 1) {
                    return BREAK_BY_USER;
                }
                if (i8 == 2) {
                    return BREAK_BY_SYSTEM;
                }
                if (i8 == 3) {
                    return BREAK_BY_LOGICAL;
                }
                if (i8 != 4) {
                    return null;
                }
                return BREAK_BY_EXCEPTION;
            }

            public static final C5269x.e getDescriptor() {
                return StreamBreak.getDescriptor().getEnumTypes().get(0);
            }

            public static AbstractC5227l0.d internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static StreamBreaker valueOf(int i8) {
                return forNumber(i8);
            }

            public static StreamBreaker valueOf(C5269x.f fVar) {
                if (fVar.getType() == getDescriptor()) {
                    if (fVar.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        /* synthetic */ StreamBreak(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$16276(StreamBreak streamBreak, int i8) {
            int i9 = i8 | streamBreak.bitField0_;
            streamBreak.bitField0_ = i9;
            return i9;
        }

        public static StreamBreak getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_StreamBreak_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StreamBreak parseDelimitedFrom(InputStream inputStream) {
            return (StreamBreak) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StreamBreak parseFrom(ByteBuffer byteBuffer) {
            return (StreamBreak) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StreamBreak)) {
                return super.equals(obj);
            }
            StreamBreak streamBreak = (StreamBreak) obj;
            if (getReason().equals(streamBreak.getReason()) && this.breaker_ == streamBreak.breaker_ && getStreamId().equals(streamBreak.getStreamId()) && hasBrokenAt() == streamBreak.hasBrokenAt()) {
                return (!hasBrokenAt() || getBrokenAt().equals(streamBreak.getBrokenAt())) && getUnknownFields().equals(streamBreak.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public StreamBreaker getBreaker() {
            StreamBreaker streamBreakerForNumber = StreamBreaker.forNumber(this.breaker_);
            return streamBreakerForNumber == null ? StreamBreaker.UNRECOGNIZED : streamBreakerForNumber;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public int getBreakerValue() {
            return this.breaker_;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public w1 getBrokenAt() {
            w1 w1Var = this.brokenAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public x1 getBrokenAtOrBuilder() {
            w1 w1Var = this.brokenAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public String getReason() {
            Object obj = this.reason_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.reason_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.reason_) ? AbstractC5209f0.computeStringSize(1, this.reason_) : 0;
            if (this.breaker_ != StreamBreaker.BREAK_BY_UNSPECIFIED.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(2, this.breaker_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.streamId_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(100, getBrokenAt());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public String getStreamId() {
            Object obj = this.streamId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.streamId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public AbstractC5235o getStreamIdBytes() {
            Object obj = this.streamId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.streamId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.StreamBreakOrBuilder
        public boolean hasBrokenAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getReason().hashCode()) * 37) + 2) * 53) + this.breaker_) * 37) + 3) * 53) + getStreamId().hashCode();
            if (hasBrokenAt()) {
                iHashCode = (((iHashCode * 37) + 100) * 53) + getBrokenAt().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_StreamBreak_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamBreak.class, Builder.class);
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
            return new StreamBreak();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.reason_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.reason_);
            }
            if (this.breaker_ != StreamBreaker.BREAK_BY_UNSPECIFIED.getNumber()) {
                abstractC5248t.writeEnum(2, this.breaker_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.streamId_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(100, getBrokenAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private StreamBreak(AbstractC5209f0.b bVar) {
            super(bVar);
            this.reason_ = "";
            this.breaker_ = 0;
            this.streamId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(StreamBreak streamBreak) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamBreak);
        }

        public static StreamBreak parseFrom(ByteBuffer byteBuffer, M m8) {
            return (StreamBreak) PARSER.parseFrom(byteBuffer, m8);
        }

        public static StreamBreak parseDelimitedFrom(InputStream inputStream, M m8) {
            return (StreamBreak) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static StreamBreak parseFrom(AbstractC5235o abstractC5235o) {
            return (StreamBreak) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public StreamBreak getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static StreamBreak parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (StreamBreak) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StreamBreak parseFrom(byte[] bArr) {
            return (StreamBreak) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static StreamBreak parseFrom(byte[] bArr, M m8) {
            return (StreamBreak) PARSER.parseFrom(bArr, m8);
        }

        private StreamBreak() {
            this.reason_ = "";
            this.breaker_ = 0;
            this.streamId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.reason_ = "";
            this.breaker_ = 0;
            this.streamId_ = "";
        }

        public static StreamBreak parseFrom(InputStream inputStream) {
            return (StreamBreak) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static StreamBreak parseFrom(InputStream inputStream, M m8) {
            return (StreamBreak) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static StreamBreak parseFrom(r rVar) {
            return (StreamBreak) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static StreamBreak parseFrom(r rVar, M m8) {
            return (StreamBreak) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface StreamBreakOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        StreamBreak.StreamBreaker getBreaker();

        int getBreakerValue();

        w1 getBrokenAt();

        x1 getBrokenAtOrBuilder();

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

        String getReason();

        AbstractC5235o getReasonBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getStreamId();

        AbstractC5235o getStreamIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasBrokenAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class StreamEnd extends AbstractC5209f0 implements StreamEndOrBuilder {
        public static final int END_AT_FIELD_NUMBER = 2;
        public static final int STREAM_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private w1 endAt_;
        private byte memoizedIsInitialized;
        private volatile Object streamId_;
        private static final StreamEnd DEFAULT_INSTANCE = new StreamEnd();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.StreamEnd.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public StreamEnd parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = StreamEnd.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements StreamEndOrBuilder {
            private int bitField0_;
            private C5228l1 endAtBuilder_;
            private w1 endAt_;
            private Object streamId_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(StreamEnd streamEnd) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    streamEnd.streamId_ = this.streamId_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.endAtBuilder_;
                    streamEnd.endAt_ = c5228l1 == null ? this.endAt_ : (w1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                StreamEnd.access$15076(streamEnd, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_StreamEnd_descriptor;
            }

            private C5228l1 getEndAtFieldBuilder() {
                if (this.endAtBuilder_ == null) {
                    this.endAtBuilder_ = new C5228l1(getEndAt(), getParentForChildren(), isClean());
                    this.endAt_ = null;
                }
                return this.endAtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getEndAtFieldBuilder();
                }
            }

            public Builder clearEndAt() {
                this.bitField0_ &= -3;
                this.endAt_ = null;
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.endAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStreamId() {
                this.streamId_ = StreamEnd.getDefaultInstance().getStreamId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_StreamEnd_descriptor;
            }

            @Override // maum.m2u.map.Map.StreamEndOrBuilder
            public w1 getEndAt() {
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.endAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getEndAtBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (w1.b) getEndAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.StreamEndOrBuilder
            public x1 getEndAtOrBuilder() {
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.endAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.map.Map.StreamEndOrBuilder
            public String getStreamId() {
                Object obj = this.streamId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.streamId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.StreamEndOrBuilder
            public AbstractC5235o getStreamIdBytes() {
                Object obj = this.streamId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.streamId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.StreamEndOrBuilder
            public boolean hasEndAt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_StreamEnd_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamEnd.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEndAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 2) == 0 || (w1Var2 = this.endAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.endAt_ = w1Var;
                } else {
                    getEndAtBuilder().mergeFrom(w1Var);
                }
                if (this.endAt_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setEndAt(w1 w1Var) {
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.endAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStreamId(String str) {
                str.getClass();
                this.streamId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStreamIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.streamId_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.streamId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public StreamEnd build() {
                StreamEnd streamEndBuildPartial = buildPartial();
                if (streamEndBuildPartial.isInitialized()) {
                    return streamEndBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) streamEndBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public StreamEnd buildPartial() {
                StreamEnd streamEnd = new StreamEnd(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(streamEnd);
                }
                onBuilt();
                return streamEnd;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public StreamEnd getDefaultInstanceForType() {
                return StreamEnd.getDefaultInstance();
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
                this.streamId_ = "";
                this.endAt_ = null;
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.endAtBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.streamId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof StreamEnd) {
                    return mergeFrom((StreamEnd) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setEndAt(w1.b bVar) {
                C5228l1 c5228l1 = this.endAtBuilder_;
                if (c5228l1 == null) {
                    this.endAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(StreamEnd streamEnd) {
                if (streamEnd == StreamEnd.getDefaultInstance()) {
                    return this;
                }
                if (!streamEnd.getStreamId().isEmpty()) {
                    this.streamId_ = streamEnd.streamId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (streamEnd.hasEndAt()) {
                    mergeEndAt(streamEnd.getEndAt());
                }
                mergeUnknownFields(streamEnd.getUnknownFields());
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
                                    this.streamId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getEndAtFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ StreamEnd(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$15076(StreamEnd streamEnd, int i8) {
            int i9 = i8 | streamEnd.bitField0_;
            streamEnd.bitField0_ = i9;
            return i9;
        }

        public static StreamEnd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_StreamEnd_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StreamEnd parseDelimitedFrom(InputStream inputStream) {
            return (StreamEnd) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StreamEnd parseFrom(ByteBuffer byteBuffer) {
            return (StreamEnd) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StreamEnd)) {
                return super.equals(obj);
            }
            StreamEnd streamEnd = (StreamEnd) obj;
            if (getStreamId().equals(streamEnd.getStreamId()) && hasEndAt() == streamEnd.hasEndAt()) {
                return (!hasEndAt() || getEndAt().equals(streamEnd.getEndAt())) && getUnknownFields().equals(streamEnd.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.StreamEndOrBuilder
        public w1 getEndAt() {
            w1 w1Var = this.endAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Map.StreamEndOrBuilder
        public x1 getEndAtOrBuilder() {
            w1 w1Var = this.endAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.streamId_) ? AbstractC5209f0.computeStringSize(1, this.streamId_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, getEndAt());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.StreamEndOrBuilder
        public String getStreamId() {
            Object obj = this.streamId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.streamId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.StreamEndOrBuilder
        public AbstractC5235o getStreamIdBytes() {
            Object obj = this.streamId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.streamId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.StreamEndOrBuilder
        public boolean hasEndAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getStreamId().hashCode();
            if (hasEndAt()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEndAt().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_StreamEnd_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamEnd.class, Builder.class);
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
            return new StreamEnd();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.streamId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.streamId_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getEndAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private StreamEnd(AbstractC5209f0.b bVar) {
            super(bVar);
            this.streamId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(StreamEnd streamEnd) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamEnd);
        }

        public static StreamEnd parseFrom(ByteBuffer byteBuffer, M m8) {
            return (StreamEnd) PARSER.parseFrom(byteBuffer, m8);
        }

        public static StreamEnd parseDelimitedFrom(InputStream inputStream, M m8) {
            return (StreamEnd) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static StreamEnd parseFrom(AbstractC5235o abstractC5235o) {
            return (StreamEnd) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public StreamEnd getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static StreamEnd parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (StreamEnd) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private StreamEnd() {
            this.streamId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.streamId_ = "";
        }

        public static StreamEnd parseFrom(byte[] bArr) {
            return (StreamEnd) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static StreamEnd parseFrom(byte[] bArr, M m8) {
            return (StreamEnd) PARSER.parseFrom(bArr, m8);
        }

        public static StreamEnd parseFrom(InputStream inputStream) {
            return (StreamEnd) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static StreamEnd parseFrom(InputStream inputStream, M m8) {
            return (StreamEnd) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static StreamEnd parseFrom(r rVar) {
            return (StreamEnd) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static StreamEnd parseFrom(r rVar, M m8) {
            return (StreamEnd) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface StreamEndOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        w1 getEndAt();

        x1 getEndAtOrBuilder();

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

        String getStreamId();

        AbstractC5235o getStreamIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasEndAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class StreamMeta extends AbstractC5209f0 implements StreamMetaOrBuilder {
        public static final int META_FIELD_NUMBER = 11;
        public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object objectType_;
        private static final StreamMeta DEFAULT_INSTANCE = new StreamMeta();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.StreamMeta.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public StreamMeta parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = StreamMeta.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements StreamMetaOrBuilder {
            private int bitField0_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object objectType_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(StreamMeta streamMeta) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    streamMeta.objectType_ = this.objectType_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    streamMeta.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                StreamMeta.access$14076(streamMeta, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_StreamMeta_descriptor;
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
                this.bitField0_ &= -3;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearObjectType() {
                this.objectType_ = StreamMeta.getDefaultInstance().getObjectType();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_StreamMeta_descriptor;
            }

            @Override // maum.m2u.map.Map.StreamMetaOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Map.StreamMetaOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Map.StreamMetaOrBuilder
            public String getObjectType() {
                Object obj = this.objectType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.objectType_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.StreamMetaOrBuilder
            public AbstractC5235o getObjectTypeBytes() {
                Object obj = this.objectType_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.objectType_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.StreamMetaOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_StreamMeta_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamMeta.class, Builder.class);
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
                } else if ((this.bitField0_ & 2) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 2;
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setObjectType(String str) {
                str.getClass();
                this.objectType_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setObjectTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.objectType_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.objectType_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public StreamMeta build() {
                StreamMeta streamMetaBuildPartial = buildPartial();
                if (streamMetaBuildPartial.isInitialized()) {
                    return streamMetaBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) streamMetaBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public StreamMeta buildPartial() {
                StreamMeta streamMeta = new StreamMeta(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(streamMeta);
                }
                onBuilt();
                return streamMeta;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public StreamMeta getDefaultInstanceForType() {
                return StreamMeta.getDefaultInstance();
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
                this.objectType_ = "";
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
                this.objectType_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof StreamMeta) {
                    return mergeFrom((StreamMeta) h02);
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(StreamMeta streamMeta) {
                if (streamMeta == StreamMeta.getDefaultInstance()) {
                    return this;
                }
                if (!streamMeta.getObjectType().isEmpty()) {
                    this.objectType_ = streamMeta.objectType_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (streamMeta.hasMeta()) {
                    mergeMeta(streamMeta.getMeta());
                }
                mergeUnknownFields(streamMeta.getUnknownFields());
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
                                    this.objectType_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 90) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ StreamMeta(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$14076(StreamMeta streamMeta, int i8) {
            int i9 = i8 | streamMeta.bitField0_;
            streamMeta.bitField0_ = i9;
            return i9;
        }

        public static StreamMeta getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_StreamMeta_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StreamMeta parseDelimitedFrom(InputStream inputStream) {
            return (StreamMeta) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StreamMeta parseFrom(ByteBuffer byteBuffer) {
            return (StreamMeta) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StreamMeta)) {
                return super.equals(obj);
            }
            StreamMeta streamMeta = (StreamMeta) obj;
            if (getObjectType().equals(streamMeta.getObjectType()) && hasMeta() == streamMeta.hasMeta()) {
                return (!hasMeta() || getMeta().equals(streamMeta.getMeta())) && getUnknownFields().equals(streamMeta.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Map.StreamMetaOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Map.StreamMetaOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Map.StreamMetaOrBuilder
        public String getObjectType() {
            Object obj = this.objectType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.objectType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.StreamMetaOrBuilder
        public AbstractC5235o getObjectTypeBytes() {
            Object obj = this.objectType_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.objectType_ = abstractC5235oCopyFromUtf8;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.objectType_) ? AbstractC5209f0.computeStringSize(1, this.objectType_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(11, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.StreamMetaOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getObjectType().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_StreamMeta_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamMeta.class, Builder.class);
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
            return new StreamMeta();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.objectType_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.objectType_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(11, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private StreamMeta(AbstractC5209f0.b bVar) {
            super(bVar);
            this.objectType_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(StreamMeta streamMeta) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamMeta);
        }

        public static StreamMeta parseFrom(ByteBuffer byteBuffer, M m8) {
            return (StreamMeta) PARSER.parseFrom(byteBuffer, m8);
        }

        public static StreamMeta parseDelimitedFrom(InputStream inputStream, M m8) {
            return (StreamMeta) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static StreamMeta parseFrom(AbstractC5235o abstractC5235o) {
            return (StreamMeta) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public StreamMeta getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static StreamMeta parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (StreamMeta) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private StreamMeta() {
            this.objectType_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.objectType_ = "";
        }

        public static StreamMeta parseFrom(byte[] bArr) {
            return (StreamMeta) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static StreamMeta parseFrom(byte[] bArr, M m8) {
            return (StreamMeta) PARSER.parseFrom(bArr, m8);
        }

        public static StreamMeta parseFrom(InputStream inputStream) {
            return (StreamMeta) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static StreamMeta parseFrom(InputStream inputStream, M m8) {
            return (StreamMeta) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static StreamMeta parseFrom(r rVar) {
            return (StreamMeta) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static StreamMeta parseFrom(r rVar, M m8) {
            return (StreamMeta) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface StreamMetaOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

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

        String getObjectType();

        AbstractC5235o getObjectTypeBytes();

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

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class VideoParam extends AbstractC5209f0 implements VideoParamOrBuilder {
        public static final int CODEC_FIELD_NUMBER = 2;
        private static final VideoParam DEFAULT_INSTANCE = new VideoParam();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Map.VideoParam.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public VideoParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = VideoParam.newBuilder();
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
        public static final int TODO_FIELD_NUMBER = 99999;
        public static final int VIDEO_FORMAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object codec_;
        private byte memoizedIsInitialized;
        private volatile Object todo_;
        private volatile Object videoFormat_;

        public static final class Builder extends AbstractC5209f0.b implements VideoParamOrBuilder {
            private int bitField0_;
            private Object codec_;
            private Object todo_;
            private Object videoFormat_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(VideoParam videoParam) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    videoParam.videoFormat_ = this.videoFormat_;
                }
                if ((i8 & 2) != 0) {
                    videoParam.codec_ = this.codec_;
                }
                if ((i8 & 4) != 0) {
                    videoParam.todo_ = this.todo_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Map.internal_static_maum_m2u_map_VideoParam_descriptor;
            }

            public Builder clearCodec() {
                this.codec_ = VideoParam.getDefaultInstance().getCodec();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTodo() {
                this.todo_ = VideoParam.getDefaultInstance().getTodo();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearVideoFormat() {
                this.videoFormat_ = VideoParam.getDefaultInstance().getVideoFormat();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Map.VideoParamOrBuilder
            public String getCodec() {
                Object obj = this.codec_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.codec_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.VideoParamOrBuilder
            public AbstractC5235o getCodecBytes() {
                Object obj = this.codec_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.codec_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Map.internal_static_maum_m2u_map_VideoParam_descriptor;
            }

            @Override // maum.m2u.map.Map.VideoParamOrBuilder
            public String getTodo() {
                Object obj = this.todo_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.todo_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.VideoParamOrBuilder
            public AbstractC5235o getTodoBytes() {
                Object obj = this.todo_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.todo_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Map.VideoParamOrBuilder
            public String getVideoFormat() {
                Object obj = this.videoFormat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.videoFormat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Map.VideoParamOrBuilder
            public AbstractC5235o getVideoFormatBytes() {
                Object obj = this.videoFormat_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.videoFormat_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Map.internal_static_maum_m2u_map_VideoParam_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoParam.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCodec(String str) {
                str.getClass();
                this.codec_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCodecBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.codec_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTodo(String str) {
                str.getClass();
                this.todo_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTodoBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.todo_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVideoFormat(String str) {
                str.getClass();
                this.videoFormat_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVideoFormatBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.videoFormat_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.videoFormat_ = "";
                this.codec_ = "";
                this.todo_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public VideoParam build() {
                VideoParam videoParamBuildPartial = buildPartial();
                if (videoParamBuildPartial.isInitialized()) {
                    return videoParamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) videoParamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public VideoParam buildPartial() {
                VideoParam videoParam = new VideoParam(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(videoParam);
                }
                onBuilt();
                return videoParam;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public VideoParam getDefaultInstanceForType() {
                return VideoParam.getDefaultInstance();
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
                this.videoFormat_ = "";
                this.codec_ = "";
                this.todo_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.videoFormat_ = "";
                this.codec_ = "";
                this.todo_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof VideoParam) {
                    return mergeFrom((VideoParam) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(VideoParam videoParam) {
                if (videoParam == VideoParam.getDefaultInstance()) {
                    return this;
                }
                if (!videoParam.getVideoFormat().isEmpty()) {
                    this.videoFormat_ = videoParam.videoFormat_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!videoParam.getCodec().isEmpty()) {
                    this.codec_ = videoParam.codec_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!videoParam.getTodo().isEmpty()) {
                    this.todo_ = videoParam.todo_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(videoParam.getUnknownFields());
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
                                    this.videoFormat_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.codec_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag != 799994) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.todo_ = rVar.readStringRequireUtf8();
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

        /* synthetic */ VideoParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static VideoParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Map.internal_static_maum_m2u_map_VideoParam_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoParam parseDelimitedFrom(InputStream inputStream) {
            return (VideoParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoParam parseFrom(ByteBuffer byteBuffer) {
            return (VideoParam) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoParam)) {
                return super.equals(obj);
            }
            VideoParam videoParam = (VideoParam) obj;
            return getVideoFormat().equals(videoParam.getVideoFormat()) && getCodec().equals(videoParam.getCodec()) && getTodo().equals(videoParam.getTodo()) && getUnknownFields().equals(videoParam.getUnknownFields());
        }

        @Override // maum.m2u.map.Map.VideoParamOrBuilder
        public String getCodec() {
            Object obj = this.codec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.codec_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.VideoParamOrBuilder
        public AbstractC5235o getCodecBytes() {
            Object obj = this.codec_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.codec_ = abstractC5235oCopyFromUtf8;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.videoFormat_) ? AbstractC5209f0.computeStringSize(1, this.videoFormat_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.codec_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.codec_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.todo_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(99999, this.todo_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Map.VideoParamOrBuilder
        public String getTodo() {
            Object obj = this.todo_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.todo_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.VideoParamOrBuilder
        public AbstractC5235o getTodoBytes() {
            Object obj = this.todo_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.todo_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Map.VideoParamOrBuilder
        public String getVideoFormat() {
            Object obj = this.videoFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.videoFormat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Map.VideoParamOrBuilder
        public AbstractC5235o getVideoFormatBytes() {
            Object obj = this.videoFormat_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.videoFormat_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVideoFormat().hashCode()) * 37) + 2) * 53) + getCodec().hashCode()) * 37) + 99999) * 53) + getTodo().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Map.internal_static_maum_m2u_map_VideoParam_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoParam.class, Builder.class);
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
            return new VideoParam();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.videoFormat_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.videoFormat_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.codec_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.codec_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.todo_)) {
                AbstractC5209f0.writeString(abstractC5248t, 99999, this.todo_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private VideoParam(AbstractC5209f0.b bVar) {
            super(bVar);
            this.videoFormat_ = "";
            this.codec_ = "";
            this.todo_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(VideoParam videoParam) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoParam);
        }

        public static VideoParam parseFrom(ByteBuffer byteBuffer, M m8) {
            return (VideoParam) PARSER.parseFrom(byteBuffer, m8);
        }

        public static VideoParam parseDelimitedFrom(InputStream inputStream, M m8) {
            return (VideoParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static VideoParam parseFrom(AbstractC5235o abstractC5235o) {
            return (VideoParam) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public VideoParam getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static VideoParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (VideoParam) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VideoParam parseFrom(byte[] bArr) {
            return (VideoParam) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static VideoParam parseFrom(byte[] bArr, M m8) {
            return (VideoParam) PARSER.parseFrom(bArr, m8);
        }

        private VideoParam() {
            this.videoFormat_ = "";
            this.codec_ = "";
            this.todo_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.videoFormat_ = "";
            this.codec_ = "";
            this.todo_ = "";
        }

        public static VideoParam parseFrom(InputStream inputStream) {
            return (VideoParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static VideoParam parseFrom(InputStream inputStream, M m8) {
            return (VideoParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static VideoParam parseFrom(r rVar) {
            return (VideoParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static VideoParam parseFrom(r rVar, M m8) {
            return (VideoParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface VideoParamOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        String getCodec();

        AbstractC5235o getCodecBytes();

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

        String getTodo();

        AbstractC5235o getTodoBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getVideoFormat();

        AbstractC5235o getVideoFormatBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_map_PingRequest_descriptor = bVar;
        internal_static_maum_m2u_map_PingRequest_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Device", "PingAt"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_map_PongResponse_descriptor = bVar2;
        internal_static_maum_m2u_map_PongResponse_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"ClientState", "M2UId", "RequireEventStream", "DirState", "Version", "PongAt"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_map_MaumToYouIdentifier_descriptor = bVar3;
        internal_static_maum_m2u_map_MaumToYouIdentifier_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"Uuid", "Version", "LicensedTo"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(3);
        internal_static_maum_m2u_map_DirectiveState_descriptor = bVar4;
        internal_static_maum_m2u_map_DirectiveState_fieldAccessorTable = new AbstractC5209f0.g(bVar4, new String[]{"Pending", "PendingCount", "Discarded", "DiscardedCount"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(4);
        internal_static_maum_m2u_map_MapEvent_descriptor = bVar5;
        internal_static_maum_m2u_map_MapEvent_fieldAccessorTable = new AbstractC5209f0.g(bVar5, new String[]{"Event", "StreamEnd", "StreamBreak", "Bytes", "Text", "Meta", "Exception", "TestEvent"});
        C5269x.b bVar6 = getDescriptor().getMessageTypes().get(5);
        internal_static_maum_m2u_map_EventStream_descriptor = bVar6;
        internal_static_maum_m2u_map_EventStream_fieldAccessorTable = new AbstractC5209f0.g(bVar6, new String[]{"Interface", "StreamId", "OperationSyncId", "Contexts", "Param", "Payload", "BeginAt"});
        C5269x.b bVar7 = bVar6.getNestedTypes().get(0);
        internal_static_maum_m2u_map_EventStream_EventContext_descriptor = bVar7;
        internal_static_maum_m2u_map_EventStream_EventContext_fieldAccessorTable = new AbstractC5209f0.g(bVar7, new String[]{"Device", "Location", "TestContext"});
        C5269x.b bVar8 = bVar6.getNestedTypes().get(1);
        internal_static_maum_m2u_map_EventStream_EventParam_descriptor = bVar8;
        internal_static_maum_m2u_map_EventStream_EventParam_fieldAccessorTable = new AbstractC5209f0.g(bVar8, new String[]{"SpeechRecognitionParam", "ImageRecognitionParam", "VideoParam", "GestureParam", "KeyboardParam", "DialogAgentForwarderParam", "EmptyParam", "TestParam"});
        C5269x.b bVar9 = getDescriptor().getMessageTypes().get(6);
        internal_static_maum_m2u_map_MapDirective_descriptor = bVar9;
        internal_static_maum_m2u_map_MapDirective_fieldAccessorTable = new AbstractC5209f0.g(bVar9, new String[]{"Directive", "StreamEnd", "StreamBreak", "Bytes", "Text", "Meta", "Exception", "TestDirective"});
        C5269x.b bVar10 = getDescriptor().getMessageTypes().get(7);
        internal_static_maum_m2u_map_DirectiveStream_descriptor = bVar10;
        internal_static_maum_m2u_map_DirectiveStream_fieldAccessorTable = new AbstractC5209f0.g(bVar10, new String[]{"Interface", "StreamId", "OperationSyncId", "Param", "Payload", "BeginAt"});
        C5269x.b bVar11 = bVar10.getNestedTypes().get(0);
        internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_descriptor = bVar11;
        internal_static_maum_m2u_map_DirectiveStream_DirectiveParam_fieldAccessorTable = new AbstractC5209f0.g(bVar11, new String[]{"DaForwardParam", "SpeechSynthesizerParam", "VideoParam", "EmptyParam", "TestParam"});
        C5269x.b bVar12 = getDescriptor().getMessageTypes().get(8);
        internal_static_maum_m2u_map_MapException_descriptor = bVar12;
        internal_static_maum_m2u_map_MapException_fieldAccessorTable = new AbstractC5209f0.g(bVar12, new String[]{"ExceptionId", "StatusCode", "ExMessage", "ExIndex", "Payload", "ThrownAt", "StreamId", "OperationSyncId", "CalledInterface"});
        C5269x.b bVar13 = getDescriptor().getMessageTypes().get(9);
        internal_static_maum_m2u_map_StreamMeta_descriptor = bVar13;
        internal_static_maum_m2u_map_StreamMeta_fieldAccessorTable = new AbstractC5209f0.g(bVar13, new String[]{"ObjectType", "Meta"});
        C5269x.b bVar14 = getDescriptor().getMessageTypes().get(10);
        internal_static_maum_m2u_map_StreamEnd_descriptor = bVar14;
        internal_static_maum_m2u_map_StreamEnd_fieldAccessorTable = new AbstractC5209f0.g(bVar14, new String[]{"StreamId", "EndAt"});
        C5269x.b bVar15 = getDescriptor().getMessageTypes().get(11);
        internal_static_maum_m2u_map_StreamBreak_descriptor = bVar15;
        internal_static_maum_m2u_map_StreamBreak_fieldAccessorTable = new AbstractC5209f0.g(bVar15, new String[]{"Reason", "Breaker", "StreamId", "BrokenAt"});
        C5269x.b bVar16 = getDescriptor().getMessageTypes().get(12);
        internal_static_maum_m2u_map_AsyncInterface_descriptor = bVar16;
        internal_static_maum_m2u_map_AsyncInterface_fieldAccessorTable = new AbstractC5209f0.g(bVar16, new String[]{"Interface", "Operation", "Type", "Streaming"});
        C5269x.b bVar17 = getDescriptor().getMessageTypes().get(13);
        internal_static_maum_m2u_map_AsyncInterfaceList_descriptor = bVar17;
        internal_static_maum_m2u_map_AsyncInterfaceList_fieldAccessorTable = new AbstractC5209f0.g(bVar17, new String[]{"Interfaces"});
        C5269x.b bVar18 = getDescriptor().getMessageTypes().get(14);
        internal_static_maum_m2u_map_VideoParam_descriptor = bVar18;
        internal_static_maum_m2u_map_VideoParam_fieldAccessorTable = new AbstractC5209f0.g(bVar18, new String[]{"VideoFormat", "Codec", "Todo"});
        C5269x.b bVar19 = getDescriptor().getMessageTypes().get(15);
        internal_static_maum_m2u_map_GestureParam_descriptor = bVar19;
        internal_static_maum_m2u_map_GestureParam_fieldAccessorTable = new AbstractC5209f0.g(bVar19, new String[]{"Todo"});
        C5269x.b bVar20 = getDescriptor().getMessageTypes().get(16);
        internal_static_maum_m2u_map_KeyboardParam_descriptor = bVar20;
        internal_static_maum_m2u_map_KeyboardParam_fieldAccessorTable = new AbstractC5209f0.g(bVar20, new String[]{"TypedLength", "Duration"});
        y1.getDescriptor();
        D.getDescriptor();
        AbstractC5245r1.getDescriptor();
        H.getDescriptor();
        AbstractC6650a.getDescriptor();
        a.getDescriptor();
        AbstractC6551a.getDescriptor();
        DeviceOuterClass.getDescriptor();
        LocationOuterClass.getDescriptor();
        EventOuterClass.getDescriptor();
    }

    private Map() {
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
