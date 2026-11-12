package defpackage;

import android.content.res.Configuration;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.a;
import io.sentry.android.replay.capture.b;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.f;
import io.sentry.android.replay.i;
import io.sentry.e;
import io.sentry.j0;
import io.sentry.k5;
import io.sentry.k6;
import io.sentry.protocol.g;
import io.sentry.rrweb.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class mr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mr4(int i, long j, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g gVar = null;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                nr4 nr4Var = (nr4) obj2;
                nr4Var.d = -1L;
                nr4Var.a(j, (jkp) obj);
                return;
            case 1:
                ((m4d) obj2).a.edit().putLong((String) obj, j).apply();
                return;
            case 2:
                q8a q8aVar = (q8a) ((sar) obj2).b;
                int i2 = z2r.a;
                t8a t8aVar = q8aVar.a;
                be7 be7Var = t8aVar.r;
                b30 b30VarW = be7Var.W();
                be7Var.X(b30VarW, 26, new px1(b30VarW, obj, j));
                if (t8aVar.P == obj) {
                    t8aVar.m.e(26, new ax7(24));
                    return;
                }
                return;
            case 3:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                if (appComponentsBreadcrumbsIntegration.b != null) {
                    int i3 = appComponentsBreadcrumbsIntegration.a.getResources().getConfiguration().orientation;
                    if (i3 == 1) {
                        gVar = g.PORTRAIT;
                    } else if (i3 == 2) {
                        gVar = g.LANDSCAPE;
                    }
                    String lowerCase = gVar != null ? gVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    e eVar = new e(j);
                    eVar.e = "navigation";
                    eVar.g = "device.orientation";
                    eVar.e(lowerCase, "position");
                    eVar.i = k5.INFO;
                    j0 j0Var = new j0();
                    j0Var.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.b.c(eVar, j0Var);
                    return;
                }
                return;
            default:
                f fVar = (f) obj2;
                d70 d70Var = (d70) obj;
                i iVar = ((c) fVar).h;
                if (iVar != null) {
                    d70Var.invoke(iVar, Long.valueOf(j));
                }
                long jD = fVar.y.d() - fVar.w.getSessionReplay().i;
                i iVar2 = ((c) fVar).h;
                String strV = iVar2 != null ? iVar2.v(jD) : null;
                b bVar = ((c) fVar).m;
                y5e y5eVar = c.v[3];
                bVar.getClass();
                mqd.z(y5eVar, "property");
                Object andSet = bVar.b.getAndSet(strV);
                if (!mqd.s(andSet, strV)) {
                    a aVar = new a(andSet, strV, bVar.d, 3);
                    c cVar = bVar.c;
                    k6 k6Var = cVar.a;
                    if (k6Var.getThreadChecker().a()) {
                        cVar.e.submit((Runnable) new io.sentry.android.replay.util.e(new com.yandex.passport.internal.ui.autologin.e(aVar, 11), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            aVar.invoke();
                        } catch (Throwable th) {
                            k6Var.getLogger().d(k5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                    break;
                }
                ArrayList arrayList = fVar.A;
                vuk vukVar = new vuk();
                dc5.f0(arrayList, new af0(jD, fVar, vukVar, 2));
                if (vukVar.a) {
                    int i4 = 0;
                    for (Object obj3 : arrayList) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            f3r.W();
                            throw null;
                        }
                        io.sentry.android.replay.capture.i iVar3 = (io.sentry.android.replay.capture.i) obj3;
                        iVar3.a.t = i4;
                        List<m> list = iVar3.b.b;
                        if (list != null) {
                            for (m mVar : list) {
                                if (mVar instanceof m) {
                                    mVar.d = i4;
                                }
                            }
                        }
                        i4 = i5;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ mr4(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.a = 3;
        this.c = appComponentsBreadcrumbsIntegration;
        this.b = j;
        this.d = configuration;
    }
}
