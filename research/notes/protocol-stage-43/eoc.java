package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatDataFilter;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public class eoc {
    public static final /* synthetic */ y5e[] g = {new o8h(0, eoc.class, "currentRequest", "getCurrentRequest()Lcom/yandex/messaging/Cancelable;")};
    public final ueg a;
    public final ike b;
    public final ike c;
    public final v97 d;
    public final ike e;
    public final rym f;

    public eoc(ueg uegVar, ike ikeVar, ike ikeVar2, v97 v97Var, ike ikeVar3) {
        mqd.z(uegVar, "cacheStorage");
        mqd.z(ikeVar, "socketConnection");
        mqd.z(ikeVar2, "performanceStatAccumulator");
        mqd.z(v97Var, "debugFeatures");
        mqd.z(ikeVar3, "fastStartupSyncRetryFeatureToggle");
        this.a = uegVar;
        this.b = ikeVar;
        this.c = ikeVar2;
        this.d = v97Var;
        this.e = ikeVar3;
        this.f = new rym(7);
    }

    public HistoryRequest a(long j) {
        HistoryRequest historyRequest = new HistoryRequest();
        long jF = this.a.f();
        historyRequest.limit = 1L;
        if (jF != 0) {
            historyRequest.minTimestamp = Math.max(0L, jF - HistoryRequest.a);
            ChatDataFilter chatDataFilter = new ChatDataFilter();
            chatDataFilter.setMinVersion(Long.valueOf(Math.max(1L, j)));
            historyRequest.filter = chatDataFilter;
        }
        return historyRequest;
    }

    public String b() {
        return "time2history";
    }

    public final void c(cw3 cw3Var) {
        this.f.B(this, g[0], cw3Var);
    }
}
