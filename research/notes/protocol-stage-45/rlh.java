package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.RateLimit;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.AddresseeType;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class rlh extends vx6 {
    public long e;
    public long f;
    public long g;
    public final /* synthetic */ hl4 h;
    public final /* synthetic */ slh i;
    public final /* synthetic */ PlainMessage j;
    public final /* synthetic */ ygi k;
    public final /* synthetic */ String l;
    public final /* synthetic */ qlh m;
    public final /* synthetic */ wf n;

    public rlh(hl4 hl4Var, slh slhVar, PlainMessage plainMessage, ygi ygiVar, String str, qlh qlhVar, wf wfVar) {
        this.h = hl4Var;
        this.i = slhVar;
        this.j = plainMessage;
        this.k = ygiVar;
        this.l = str;
        this.m = qlhVar;
        this.n = wfVar;
    }

    public final ClientMessage L() {
        ((r7j) this.i.f.get()).getClass();
        this.e = SystemClock.elapsedRealtime();
        return new ClientMessage(null, null, null, this.j, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this.k.j ? 3 : 0, false, 201326583, null);
    }

    public final boolean R(PostMessageResponse postMessageResponse) {
        boolean z;
        hl4 hl4Var = this.h;
        long j = hl4Var.b;
        jl4 jl4Var = hl4Var.a;
        slh slhVar = this.i;
        it4 it4Var = slhVar.c;
        x20 x20Var = slhVar.g;
        gkp gkpVar = slhVar.a;
        mqd.z(postMessageResponse, "response");
        int i = postMessageResponse.status;
        boolean z2 = i == 19 || i == 20;
        RateLimit rateLimit = postMessageResponse.rateLimit;
        long j2 = rateLimit != null ? rateLimit.waitFor : 0L;
        slhVar.e.a(j2);
        int i2 = postMessageResponse.status;
        boolean z3 = z2;
        boolean z4 = i2 == 23;
        boolean z5 = i2 == 8;
        long j3 = j2;
        qlh qlhVar = this.m;
        String str = this.l;
        if (z4) {
            Object obj = slhVar.j.get(Integer.valueOf(i2));
            mqd.u(obj);
            hl4Var.a(((Number) obj).intValue());
            x20Var.m("send_msg_error", RtmErrorEvent.ErrorLevel.ERROR, xgf.k0(new ypi[]{new ypi("reason", "rate_limit"), new ypi("messageId", str), new ypi("chatId", gkpVar.a.b), new ypi("waitFor", Long.valueOf(j3)), new ypi("status", Integer.valueOf(postMessageResponse.status))}));
            slhVar.g.d("rate limiter msg sent", "chat_id", gkpVar.a.b, "wait_for", Long.valueOf(j3));
            qlhVar.a();
            return true;
        }
        if (z5) {
            String str2 = hl4Var.c.a;
            mqd.z(str2, "messageId");
            jl4Var.b(new y2f(str2, 0L, null, null));
            jl4.a(jl4Var, j, o8g.FAILURE);
            hl4Var.d.b();
            x20Var.m("send_msg_error", RtmErrorEvent.ErrorLevel.ERROR, xgf.k0(new ypi[]{new ypi("reason", "duplicate"), new ypi("messageId", str), new ypi("chatId", gkpVar.a.b), new ypi("waitFor", Long.valueOf(j3)), new ypi("status", Integer.valueOf(postMessageResponse.status))}));
            slhVar.g.d("duplicate msg sent", "chat_id", gkpVar.a.b, "wait_for", Long.valueOf(j3));
            qlhVar.a();
            return true;
        }
        if (z3) {
            slhVar.d.a(i2, this.n.a);
            it4Var.getClass();
            mqd.z(str, "payloadId");
            atl.s(it4Var.c, Looper.myLooper(), null);
            it4Var.z.remove(str);
            qlhVar.a();
            hl4Var.a(2);
            return true;
        }
        String str3 = gkpVar.a.b;
        it4Var.getClass();
        mqd.z(str, "payloadId");
        mqd.z(str3, "chatId");
        atl.s(it4Var.c, Looper.myLooper(), null);
        HashMap map = it4Var.z;
        Integer num = (Integer) map.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue < 2) {
            map.put(str, Integer.valueOf(iIntValue + 1));
            z = false;
        } else {
            it4Var.f.a(i2, str, str3);
            z = true;
        }
        if (z) {
            qlhVar.a();
            jl4.a(jl4Var, j, o8g.FAILURE);
        }
        return z;
    }

    public final void S(PostMessageResponse postMessageResponse) {
        boolean z;
        hl4 hl4Var;
        rt4 rt4Var;
        mqd.z(postMessageResponse, "response");
        slh slhVar = this.i;
        ((r7j) slhVar.f.get()).a(this.e, "time2ack_plain");
        slhVar.g.i("msg time 2 ack", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - this.e), "response_diff", Long.valueOf(this.f - this.e), "parse_diff", Long.valueOf(this.g - this.e));
        RateLimit rateLimit = postMessageResponse.rateLimit;
        slhVar.e.a(rateLimit != null ? rateLimit.waitFor : 0L);
        it4 it4Var = slhVar.c;
        it4Var.getClass();
        String str = this.l;
        mqd.z(str, "payloadId");
        atl.s(it4Var.c, Looper.myLooper(), null);
        it4Var.z.remove(str);
        i5g i5gVar = it4Var.f;
        atl.s(i5gVar.c, Looper.myLooper(), null);
        i5gVar.b.remove(str);
        uyh uyhVar = i5gVar.a;
        uyhVar.getClass();
        ArrayList arrayList = uyhVar.a;
        uyhVar.b++;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    uyh.a(uyhVar);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                this.m.a();
                ShortMessageInfo shortMessageInfo = postMessageResponse.messageInfo;
                hl4 hl4Var2 = this.h;
                ygi ygiVar = hl4Var2.c;
                jl4 jl4Var = hl4Var2.a;
                r8g r8gVar = jl4Var.j;
                if (shortMessageInfo != null) {
                    String str2 = ygiVar.a;
                    mqd.z(str2, "messageId");
                    x20 x20Var = r8gVar.a;
                    q9j q9jVar = jl4Var.b;
                    String str3 = q9jVar.b;
                    ueg uegVar = jl4Var.c;
                    long j = q9jVar.a;
                    uegVar.getClass();
                    qp0 qp0Var = uegVar.b;
                    ebg ebgVarC = qp0Var.c();
                    ebgVarC.getClass();
                    int iIntValue = ((Number) h6i.M(ebgVarC.a, true, false, new mh2(j, str2, 17))).intValue();
                    if (iIntValue > 1) {
                        x20Var.reportEvent("tech_illegal_state_messageId_not_unique", xgf.k0(new ypi[]{new ypi("chat id", str3), new ypi("count", Integer.valueOf(iIntValue))}));
                    }
                    ebg ebgVarC2 = qp0Var.c();
                    ebgVarC2.getClass();
                    if (((Boolean) h6i.M(ebgVarC2.a, true, false, new mh2(j, str2, 14))).booleanValue()) {
                        rt4 rt4VarL = uegVar.L(j, new ServerMessageRef(shortMessageInfo.timestamp, null, 2, null));
                        try {
                            if (!rt4VarL.moveToNext() || mqd.s(rt4VarL.t0(), str2)) {
                                rt4Var = rt4VarL;
                            } else {
                                rt4Var = rt4VarL;
                                try {
                                    x20Var.reportEvent("tech_illegal_state_timestamp_not_unique", xgf.k0(new ypi[]{new ypi("chat id", str3), new ypi("messageId1", rt4VarL.t0()), new ypi("messageId2", str2), new ypi("count", Integer.valueOf(rt4Var.getCount()))}));
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        vd1.v(rt4Var, th2);
                                        throw th3;
                                    }
                                }
                            }
                            rt4Var.close();
                        } catch (Throwable th4) {
                            th = th4;
                            rt4Var = rt4VarL;
                        }
                    } else {
                        r8gVar = r8gVar;
                        uegVar = uegVar;
                    }
                    veg vegVarV = uegVar.V();
                    try {
                        boolean zJ = vegVarV.J(j, str2, shortMessageInfo);
                        vegVarV.O();
                        vegVarV.close();
                        MessageData messageData = ygiVar.b;
                        if ((zJ && (messageData instanceof MediaMessageData)) || (messageData instanceof ImageMessageData) || (messageData instanceof GalleryMessageData)) {
                            ((MediaMessageData) messageData).a(new dl4(jl4Var, shortMessageInfo));
                        }
                        sc4 sc4Var = jl4Var.A;
                        String str4 = sc4Var.Q;
                        String str5 = sc4Var.e;
                        long j2 = shortMessageInfo.seqNo;
                        boolean z3 = ygiVar.i;
                        boolean z4 = jl4Var.B;
                        mqd.z(str3, "chatId");
                        mqd.z(str4, "chatType");
                        Map mapB = ygiVar.h.b();
                        ypi ypiVar = new ypi("chat id", str3);
                        ypi ypiVar2 = new ypi("chat type", str4);
                        ypi ypiVar3 = new ypi("addressee id", str5);
                        ypi ypiVar4 = new ypi("n", Long.valueOf(j2));
                        ypi ypiVar5 = new ypi("important", Boolean.valueOf(z3));
                        ypi ypiVar6 = new ypi("muted", Boolean.valueOf(ygiVar.j));
                        AddresseeType.b.getClass();
                        r8gVar.a.reportEvent("msg sent", xgf.p0(mapB, xgf.k0(new ypi[]{ypiVar, ypiVar2, ypiVar3, ypiVar4, ypiVar5, ypiVar6, new ypi("addressee type", (z4 ? AddresseeType.CONTACT : AddresseeType.OTHER).a)})));
                        hl4Var = hl4Var2;
                        jl4.a(jl4Var, hl4Var.b, o8g.SUCCESS);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            vd1.v(vegVarV, th5);
                            throw th6;
                        }
                    }
                } else {
                    hl4Var = hl4Var2;
                }
                hl4Var.d.b();
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    uyh.a(uyhVar);
                }
                throw new NoSuchElementException();
            }
            int i3 = i + 1;
            h5g h5gVar = (h5g) arrayList.get(i);
            atl.s(h5gVar.c.c, Looper.myLooper(), null);
            if (str.equals(h5gVar.a)) {
                k5g k5gVar = h5gVar.b;
                atl.s((Looper) k5gVar.d.b, Looper.myLooper(), null);
                k5gVar.b.post(new j5g(k5gVar, 0));
            }
            i = i3;
        }
    }

    public final void b0(int i) {
        hl4 hl4Var = this.h;
        tlm tlmVar = hl4Var.a.m;
        slm slmVarA0 = tlmVar.b.a0(hl4Var.b);
        if (slmVarA0 != null) {
            slmVarA0.f = Math.max(slmVarA0.f, Math.max(i, 0));
        }
    }

    public final void i() {
        this.g = SystemClock.elapsedRealtime();
    }

    public final void w() {
        this.f = SystemClock.elapsedRealtime();
    }
}
