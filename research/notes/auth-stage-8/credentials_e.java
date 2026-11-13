package com.yandex.passport.internal.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.account.g;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = null;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        CREATOR = new g(5);
    }

    public e(String r2, String r3) {
        mqd.z(r2, "encryptedId");
        mqd.z(r3, "encryptedSecret");
        this.a = r2;
        this.b = r3;
        this.c = com.yandex.passport.internal.util.b.c(r2);
        this.d = com.yandex.passport.internal.util.b.c(r3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r6 = (e) r5;
        if (mqd.s(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (mqd.s(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Credentials(encryptedId=");
        r0.append(this.a);
        r0.append(", encryptedSecret=");
        return wqh.k(r0, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        mqd.z(r1, "dest");
        r1.writeString(this.a);
        r1.writeString(this.b);
    }
}
