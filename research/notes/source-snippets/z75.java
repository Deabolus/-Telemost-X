package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.SeenMarker;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingCallingMessage;
import com.yandex.messaging.internal.entities.PushData;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class z75 {
    public final x20 a;
    public final vq0 b;
    public final y9a c;
    public final ne6 d;

    public z75(x20 x20Var, vq0 vq0Var, y9a y9aVar, ne6 ne6Var) {
        mqd.z(x20Var, "analytics");
        mqd.z(vq0Var, "appForegroundStatusProvider");
        mqd.z(y9aVar, "experimentConfig");
        mqd.z(ne6Var, "dispatchers");
        this.a = x20Var;
        this.b = vq0Var;
        this.c = y9aVar;
        this.d = ne6Var;
    }

    public static LinkedHashMap g(PushData pushData) {
        String str;
        ServerMessageInfo serverMessageInfo;
        ReducedUserInfo reducedUserInfo;
        ypi ypiVar = new ypi("chat id", pushData.chatId);
        ServerMessage serverMessage = pushData.serverMessage;
        String strConcat = null;
        LinkedHashMap linkedHashMapN0 = xgf.n0(new ypi[]{ypiVar, new ypi("addressee id", (serverMessage == null || (serverMessageInfo = serverMessage.serverMessageInfo) == null || (reducedUserInfo = serverMessageInfo.from) == null) ? null : reducedUserInfo.userId), new ypi("recipient_id", pushData.recipientUserId)});
        ServerMessage serverMessage2 = pushData.serverMessage;
        if (serverMessage2 != null) {
            ClientMessage clientMessage = serverMessage2.clientMessage;
            mqd.y(clientMessage, "clientMessage");
            ClientMessage clientMessage2 = serverMessage2.clientMessage;
            mqd.y(clientMessage2, "clientMessage");
            if (clientMessage2.plain != null) {
                strConcat = "Plain";
            } else if (clientMessage2.seenMarker != null) {
                strConcat = "SeenMarker";
            } else if (clientMessage2.typing != null) {
                strConcat = "Typing";
            } else if (clientMessage2.systemMessage != null) {
                strConcat = "SystemMessage";
            } else if (clientMessage2.heartbeat != null) {
                strConcat = "Heartbeat";
            } else if (clientMessage2.stateSync != null) {
                strConcat = "StateSync";
            } else if (clientMessage2.callingMessage != null) {
                strConcat = "CallingMessage";
            } else {
                MeetingCallingMessage meetingCallingMessage = clientMessage2.meetingCallingMessage;
                if (meetingCallingMessage != null) {
                    if (meetingCallingMessage.getIncomingCall() != null) {
                        str = "IncomingCall";
                    } else if (meetingCallingMessage.getRingingEnded() != null) {
                        str = "RingingEnded";
                    } else if (meetingCallingMessage.getRinging() != null) {
                        str = "Ringing";
                    } else if (meetingCallingMessage.getOutgoingRingingEnded() != null) {
                        str = "OutgoingRingingEnded";
                    } else if (meetingCallingMessage.getEndRinging() != null) {
                        str = "EndRinging";
                    } else if (meetingCallingMessage.getNotifyRinging() != null) {
                        str = "NotifyRinging";
                    } else if (meetingCallingMessage.getEndOutgoingRinging() != null) {
                        str = "EndOutgoingRinging";
                    } else {
                        if (!atl.u()) {
                            atl.y("Unknown MeetingCallingMessage for logger");
                        }
                        str = "Unknown";
                    }
                    strConcat = "MeetingCallingMessage/".concat(str);
                } else if (clientMessage2.pin != null) {
                    strConcat = "Pin";
                } else if (clientMessage2.reaction != null) {
                    strConcat = "Reaction";
                }
            }
            linkedHashMapN0.put("message_type", strConcat);
            linkedHashMapN0.put("is_message_silent", Boolean.valueOf(clientMessage.isSilent));
            linkedHashMapN0.put("notification_behaviour", Integer.valueOf(clientMessage.notificationBehaviour));
            PlainMessage plainMessage = clientMessage.plain;
            if (plainMessage != null) {
                linkedHashMapN0.put("plain_message_ts", Long.valueOf(plainMessage.getTimestamp()));
            }
            SeenMarker seenMarker = clientMessage.seenMarker;
            if (seenMarker != null) {
                linkedHashMapN0.put("seen_marker_ts", Long.valueOf(seenMarker.getTimestamp()));
            }
        }
        return linkedHashMapN0;
    }

    public final String a() {
        y9a y9aVar = this.c;
        mqd.z(y9aVar, "<this>");
        i82 i82Var = tcg.Q;
        mqd.y(i82Var, "BLOCKING_COROUTINE_PUSH_HANDLING");
        return y9aVar.a(i82Var) ? "blocking_coroutine" : "legacy";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, kc6 kc6Var) {
        w75 w75Var;
        String str2;
        ypi[] ypiVarArr;
        ypi[] ypiVarArr2;
        if (kc6Var instanceof w75) {
            w75Var = (w75) kc6Var;
            int i = w75Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                w75Var.j = i - Integer.MIN_VALUE;
            } else {
                w75Var = new w75(this, kc6Var);
            }
        } else {
            w75Var = new w75(this, kc6Var);
        }
        Object obj = w75Var.h;
        xe6 xe6Var = xe6.a;
        int i2 = w75Var.j;
        int i3 = 1;
        if (i2 == 0) {
            nzn.U(obj);
            ypi[] ypiVarArr3 = new ypi[3];
            ypiVarArr3[0] = new ypi("reason", str);
            w75Var.d = ypiVarArr3;
            w75Var.e = ypiVarArr3;
            str2 = "app_running_status";
            w75Var.f = "app_running_status";
            w75Var.g = 1;
            w75Var.j = 1;
            Object objQ = lo7.Q(this.d.d, new j3(this, null, 24), w75Var);
            if (objQ == xe6Var) {
                return xe6Var;
            }
            ypiVarArr = ypiVarArr3;
            obj = objQ;
            ypiVarArr2 = ypiVarArr;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = w75Var.g;
            str2 = w75Var.f;
            ypiVarArr = w75Var.e;
            ypiVarArr2 = w75Var.d;
            nzn.U(obj);
        }
        ypiVarArr[i3] = new ypi(str2, obj);
        ypiVarArr2[2] = new ypi("push_handling_strategy", a());
        Map mapK0 = xgf.k0(ypiVarArr2);
        this.a.m("tech_multiaccount_push_routing_failed", RtmErrorEvent.ErrorLevel.INFO, mapK0);
        return fcq.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, PushData pushData, aek aekVar, int i, kc6 kc6Var) {
        x75 x75Var;
        ypi[] ypiVarArr;
        PushData pushData2;
        String str2;
        int i2;
        ypi[] ypiVarArr2;
        if (kc6Var instanceof x75) {
            x75Var = (x75) kc6Var;
            int i3 = x75Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x75Var.l = i3 - Integer.MIN_VALUE;
            } else {
                x75Var = new x75(this, kc6Var);
            }
        } else {
            x75Var = new x75(this, kc6Var);
        }
        Object obj = x75Var.j;
        xe6 xe6Var = xe6.a;
        int i4 = x75Var.l;
        if (i4 == 0) {
            nzn.U(obj);
            ypi[] ypiVarArr3 = new ypi[6];
            ypiVarArr3[0] = new ypi("transit_id", aekVar.a);
            ypiVarArr3[1] = new ypi("reason", str);
            x75Var.d = pushData;
            x75Var.e = ypiVarArr3;
            x75Var.f = ypiVarArr3;
            x75Var.g = "app_running_status";
            x75Var.h = i;
            x75Var.i = 2;
            x75Var.l = 1;
            Object objQ = lo7.Q(this.d.d, new j3(this, null, 24), x75Var);
            if (objQ == xe6Var) {
                return xe6Var;
            }
            ypiVarArr = ypiVarArr3;
            obj = objQ;
            pushData2 = pushData;
            str2 = "app_running_status";
            i2 = 2;
            ypiVarArr2 = ypiVarArr;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = x75Var.i;
            i = x75Var.h;
            str2 = x75Var.g;
            ypiVarArr2 = x75Var.f;
            ypiVarArr = x75Var.e;
            pushData2 = x75Var.d;
            nzn.U(obj);
        }
        ypiVarArr2[i2] = new ypi(str2, obj);
        ypiVarArr[3] = new ypi("app_background_restricted", Boolean.valueOf(this.b.b()));
        ypiVarArr[4] = new ypi("connection_status", new Integer(i));
        ypiVarArr[5] = new ypi("push_handling_strategy", a());
        LinkedHashMap linkedHashMapN0 = xgf.n0(ypiVarArr);
        linkedHashMapN0.putAll(g(pushData2));
        this.a.m("push_error", RtmErrorEvent.ErrorLevel.INFO, linkedHashMapN0);
        return fcq.a;
    }

    public final void d(aek aekVar) {
        Map mapK0 = xgf.k0(new ypi[]{new ypi("transit_id", aekVar.a), new ypi("reason", "push_message_is_invalid"), new ypi("app_background_restricted", Boolean.valueOf(this.b.b())), new ypi("push_handling_strategy", a())});
        this.a.m("push_error", RtmErrorEvent.ErrorLevel.INFO, mapK0);
    }

    public final void e(String str, Exception exc) {
        RtmErrorEvent.ErrorLevel errorLevel = RtmErrorEvent.ErrorLevel.INFO;
        Map mapK0 = xgf.k0(new ypi[]{new ypi("reason", str), new ypi("exception", exc), new ypi("app_background_restricted", Boolean.valueOf(this.b.b())), new ypi("push_handling_strategy", a())});
        x20 x20Var = this.a;
        x20Var.m("push_error", errorLevel, mapK0);
        x20Var.reportError(str, exc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(PushData pushData, aek aekVar, int i, kc6 kc6Var) {
        y75 y75Var;
        ypi[] ypiVarArr;
        PushData pushData2;
        String str;
        ypi[] ypiVarArr2;
        if (kc6Var instanceof y75) {
            y75Var = (y75) kc6Var;
            int i2 = y75Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y75Var.l = i2 - Integer.MIN_VALUE;
            } else {
                y75Var = new y75(this, kc6Var);
            }
        } else {
            y75Var = new y75(this, kc6Var);
        }
        Object obj = y75Var.j;
        xe6 xe6Var = xe6.a;
        int i3 = y75Var.l;
        int i4 = 1;
        if (i3 == 0) {
            nzn.U(obj);
            ypi[] ypiVarArr3 = new ypi[5];
            ypiVarArr3[0] = new ypi("transit_id", aekVar.a);
            y75Var.d = pushData;
            y75Var.e = ypiVarArr3;
            y75Var.f = ypiVarArr3;
            y75Var.g = "app_running_status";
            y75Var.h = i;
            y75Var.i = 1;
            y75Var.l = 1;
            Object objQ = lo7.Q(this.d.d, new j3(this, null, 24), y75Var);
            if (objQ == xe6Var) {
                return xe6Var;
            }
            ypiVarArr = ypiVarArr3;
            obj = objQ;
            pushData2 = pushData;
            str = "app_running_status";
            ypiVarArr2 = ypiVarArr;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = y75Var.i;
            i = y75Var.h;
            str = y75Var.g;
            ypiVarArr2 = y75Var.f;
            ypiVarArr = y75Var.e;
            pushData2 = y75Var.d;
            nzn.U(obj);
        }
        ypiVarArr2[i4] = new ypi(str, obj);
        ypiVarArr[2] = new ypi("app_background_restricted", Boolean.valueOf(this.b.b()));
        ypiVarArr[3] = new ypi("connection_status", new Integer(i));
        ypiVarArr[4] = new ypi("push_handling_strategy", a());
        LinkedHashMap linkedHashMapN0 = xgf.n0(ypiVarArr);
        linkedHashMapN0.putAll(g(pushData2));
        this.a.m("push_received", RtmErrorEvent.ErrorLevel.INFO, linkedHashMapN0);
        return fcq.a;
    }
}
