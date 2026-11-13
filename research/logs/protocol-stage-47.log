package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClearUserHistory;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.Heartbeat;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class f25 extends vx6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f25(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    public /* bridge */ /* synthetic */ int J(Object obj) {
        switch (this.e) {
            case 1:
                a0((PostMessageResponse) obj);
                return 0;
            default:
                return super.J(obj);
        }
    }

    public final ClientMessage L() {
        switch (this.e) {
            case 0:
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ClearUserHistory(((g25) this.f).a.b), null, null, null, null, null, null, null, false, 0, false, 268304383, null);
            default:
                h6e h6eVar = (h6e) this.f;
                h6eVar.getClass();
                Heartbeat heartbeat = new Heartbeat();
                h6eVar.d.getClass();
                heartbeat.type = 2;
                return new ClientMessage(null, heartbeat, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435453, null);
        }
    }

    public void S(PostMessageResponse postMessageResponse) {
        switch (this.e) {
            case 0:
                mqd.z(postMessageResponse, "response");
                ShortMessageInfo shortMessageInfo = postMessageResponse.messageInfo;
                if (!atl.u() && shortMessageInfo == null) {
                    atl.y("timestamp should be defined for correct clearing chat's messages");
                }
                if (shortMessageInfo != null) {
                    g25 g25Var = (g25) this.f;
                    long j = shortMessageInfo.timestamp;
                    long j2 = shortMessageInfo.seqNo;
                    q9j q9jVar = g25Var.a;
                    long j3 = q9jVar.a;
                    veg vegVarV = g25Var.c.V();
                    try {
                        mqd.z(vegVarV, "$this$doWithTransaction");
                        vegVarV.a(q9jVar.a, j);
                        vegVarV.E1(j3, j, j2);
                        vegVarV.O();
                        vegVarV.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            vd1.v(vegVarV, th);
                            throw th2;
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public int a0(PostMessageResponse postMessageResponse) {
        switch (this.e) {
            case 1:
                mqd.z(postMessageResponse, "response");
                h6e h6eVar = (h6e) this.f;
                w5i w5iVar = (w5i) h6eVar.g.get();
                int i = postMessageResponse.status;
                w5iVar.g(i, i == 1);
                if (postMessageResponse.status != 1) {
                    ((amc) h6eVar.c.get()).j = false;
                }
                return 0;
            default:
                return super.a0(postMessageResponse);
        }
    }
}
