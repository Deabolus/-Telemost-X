package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class nr4 implements z4k {
    public final k45 a;
    public final Handler b;
    public long c;
    public long d;
    public long e;
    public final /* synthetic */ or4 f;

    public nr4(or4 or4Var, k45 k45Var, b5k b5kVar) {
        mqd.z(k45Var, "clock");
        mqd.z(b5kVar, "profileRemovedDispatcher");
        this.f = or4Var;
        this.a = k45Var;
        this.b = new Handler(or4Var.a);
        this.d = -1L;
        b5kVar.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public final void a(long j, jkp jkpVar) {
        boolean z;
        or4 or4Var = this.f;
        ueg uegVar = or4Var.c;
        idj idjVar = or4Var.e;
        atl.s(or4Var.a, Looper.myLooper(), null);
        ex4 ex4Var = or4Var.k;
        q9j q9jVar = or4Var.b;
        jb4 jb4VarE = ex4Var.e(q9jVar.a);
        long j2 = jkpVar.a;
        fem femVar = or4Var.h;
        femVar.getClass();
        mqd.z(jb4VarE, "curSeenMarker");
        Long l = jb4VarE.a;
        if (l != null) {
            long jLongValue = l.longValue();
            long j3 = jb4VarE.b;
            if (lqd.X(femVar.a)) {
                boolean z2 = j > j3;
                boolean z3 = j == j3 && j2 > jLongValue;
                if (z2 || z3) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (j2 > jLongValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (!z) {
            idjVar.c(j2);
            return;
        }
        Long l2 = (Long) h6i.M(or4Var.l.a, true, false, new uk1(q9jVar.a, j2, 13));
        if (l2 != null) {
            veg vegVarV = uegVar.V();
            try {
                vegVarV.E1(q9jVar.a, jkpVar.a, l2.longValue());
                idjVar.c(j2);
                if (uegVar.m(q9jVar.a).N) {
                    b7j b7jVar = or4Var.d;
                    String str = q9jVar.b;
                    SeenMarkerEntity seenMarkerEntity = new SeenMarkerEntity(str, l2.longValue(), jkpVar.a, j);
                    b7jVar.getClass();
                    atl.s(b7jVar.d, Looper.myLooper(), null);
                    if (b7jVar.g) {
                        mqd.u(str);
                        b7jVar.a(str, seenMarkerEntity);
                    }
                    ulf ulfVar = b7jVar.f;
                    mqd.u(str);
                    ulfVar.E(seenMarkerEntity, str);
                    or4.b(or4Var, j2);
                }
                vegVarV.O();
                vegVarV.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vd1.v(vegVarV, th);
                    throw th2;
                }
            }
        }
    }

    public final void b(jkp jkpVar, boolean z) {
        mqd.z(jkpVar, "ref");
        long j = jkpVar.a;
        or4 or4Var = this.f;
        q9j q9jVar = or4Var.b;
        ueg uegVar = or4Var.c;
        Looper looper = or4Var.a;
        atl.s(looper, Looper.myLooper(), null);
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.e >= 350 && j > this.d) {
            Handler handler = this.b;
            handler.removeCallbacksAndMessages(null);
            if (z) {
                atl.s(looper, Looper.myLooper(), null);
                this.d = -1L;
                a(((Number) h6i.M(uegVar.b.A().a, true, false, new pr(q9jVar.a, 27))).longValue(), jkpVar);
            } else {
                atl.s(looper, Looper.myLooper(), null);
                long j2 = jElapsedRealtime - this.c;
                long j3 = j2 < 600 ? 600 - j2 : 600L;
                this.c = jElapsedRealtime;
                this.d = j;
                handler.postDelayed(new mr4(0, ((Number) h6i.M(uegVar.b.A().a, true, false, new pr(q9jVar.a, 27))).longValue(), this, jkpVar), j3);
            }
        }
    }

    @Override // defpackage.z4k
    public final void e() {
        this.b.removeCallbacksAndMessages(null);
        this.c = 0L;
        this.d = -1L;
        this.e = 0L;
    }
}
