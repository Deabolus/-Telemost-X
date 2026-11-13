package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public abstract class lfg {
    public static final jfg a;
    public static final efg b;
    public static final hfg c;
    public static final kfg d;
    public static final ffg e;
    public static final ifg f;
    public static final /* synthetic */ lfg[] g;

    static {
        jfg jfgVar = new jfg();
        a = jfgVar;
        efg efgVar = new efg();
        b = efgVar;
        hfg hfgVar = new hfg();
        c = hfgVar;
        kfg kfgVar = new kfg();
        d = kfgVar;
        ffg ffgVar = new ffg();
        e = ffgVar;
        ifg ifgVar = new ifg();
        f = ifgVar;
        lfg[] lfgVarArr = {jfgVar, efgVar, hfgVar, kfgVar, ffgVar, ifgVar};
        g = lfgVarArr;
        oyg.B(lfgVarArr);
    }

    public static lfg valueOf(String str) {
        return (lfg) Enum.valueOf(lfg.class, str);
    }

    public static lfg[] values() {
        return (lfg[]) g.clone();
    }

    public abstract g91 b();

    public String c() {
        return "https://passport.yandex.ru";
    }

    public abstract Object d(gfg gfgVar);

    public abstract boolean e();

    public abstract String h();
}
