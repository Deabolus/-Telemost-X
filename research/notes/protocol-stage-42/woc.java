package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.yandex.messaging.core.net.entities.MiniappsBucket;
import com.yandex.messaging.core.net.entities.PinnedChatsBucket;
import com.yandex.messaging.core.net.entities.PreferencesBucket;
import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import com.yandex.messaging.core.net.entities.UserStatusPresetBucket;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.PinnedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class woc implements peo {
    public static final long O;
    public final k4k A;
    public final ike B;
    public final ike C;
    public final ike D;
    public final z3f E;
    public final x20 F;
    public final vq0 G;
    public final ike H;
    public final vcj I;
    public final k45 J;
    public final SharedPreferences K;
    public final kn2 L;
    public lnn M;
    public boolean N;
    public final eoc a;
    public final wep b;
    public final ueg c;
    public final zmc d;
    public final dj4 e;
    public final do4 f;
    public final ike g;
    public final uqg h;
    public final qp0 i;
    public final kx4 j;
    public final anh k;
    public final keo l;
    public final Looper m;
    public final ne6 n;
    public final ayo o;
    public final eaa p;
    public final n2s q;
    public final oo6 r;
    public final qe1 s;
    public final wxr t;
    public final p4b u;
    public final koc v;
    public final odj w;
    public final gpg x;
    public final hqq y;
    public final mwk z;

    static {
        e0f e0fVar = s19.b;
        O = s19.n(y62.T(7, x19.h));
    }

    public woc(eoc eocVar, wep wepVar, ueg uegVar, zmc zmcVar, dj4 dj4Var, do4 do4Var, ike ikeVar, uqg uqgVar, qp0 qp0Var, kx4 kx4Var, anh anhVar, keo keoVar, Looper looper, ne6 ne6Var, ayo ayoVar, eaa eaaVar, n2s n2sVar, oo6 oo6Var, qe1 qe1Var, wxr wxrVar, p4b p4bVar, koc kocVar, odj odjVar, gpg gpgVar, hqq hqqVar, mwk mwkVar, k4k k4kVar, ike ikeVar2, ike ikeVar3, ike ikeVar4, z3f z3fVar, x20 x20Var, vq0 vq0Var, ike ikeVar5, vcj vcjVar, k45 k45Var, SharedPreferences sharedPreferences) {
        mqd.z(eocVar, "historyLoader");
        mqd.z(wepVar, "threadsHistoryLoader");
        mqd.z(uegVar, "cacheStorage");
        mqd.z(zmcVar, "hiddenPrivateChatsBucketManager");
        mqd.z(dj4Var, "mutingsController");
        mqd.z(do4Var, "chatScopeHolder");
        mqd.z(ikeVar, "stickersController");
        mqd.z(uqgVar, "missedUsersResolver");
        mqd.z(qp0Var, "appDatabase");
        mqd.z(kx4Var, "chatsLoader");
        mqd.z(anhVar, "noSchemeObjectsVersionRepository");
        mqd.z(keoVar, "syncVersionCalculator");
        mqd.z(looper, "logicLooper");
        mqd.z(ne6Var, "dispatchers");
        mqd.z(ayoVar, "telemostController");
        mqd.z(eaaVar, "experimentsController");
        mqd.z(n2sVar, "workspaceVersionHandler");
        mqd.z(oo6Var, "customStatusesController");
        mqd.z(qe1Var, "authorizedApiCalls");
        mqd.z(wxrVar, "whoamiLoader");
        mqd.z(p4bVar, "foldersRepository");
        mqd.z(kocVar, "syncMetricsReporter");
        mqd.z(odjVar, "personalPreferencesController");
        mqd.z(gpgVar, "migrationEnvironmentController");
        mqd.z(hqqVar, "userCredentials");
        mqd.z(mwkVar, "registrationController");
        mqd.z(k4kVar, "profileMainCoroutineScope");
        mqd.z(ikeVar2, "recreateProfileOnMismatchGuidFeatureToggle");
        mqd.z(ikeVar3, "improvedHistorySyncFeatureToggle");
        mqd.z(ikeVar4, "skipMeetingsInHistorySyncFeatureToggle");
        mqd.z(z3fVar, "localizationActualizer");
        mqd.z(x20Var, "analytics");
        mqd.z(vq0Var, "appForegroundStatusProvider");
        mqd.z(ikeVar5, "usersLocalizationFeatureToggle");
        mqd.z(vcjVar, "personalDiscoverySyncer");
        mqd.z(k45Var, "clock");
        mqd.z(sharedPreferences, "profilePreferences");
        this.a = eocVar;
        this.b = wepVar;
        this.c = uegVar;
        this.d = zmcVar;
        this.e = dj4Var;
        this.f = do4Var;
        this.g = ikeVar;
        this.h = uqgVar;
        this.i = qp0Var;
        this.j = kx4Var;
        this.k = anhVar;
        this.l = keoVar;
        this.m = looper;
        this.n = ne6Var;
        this.o = ayoVar;
        this.p = eaaVar;
        this.q = n2sVar;
        this.r = oo6Var;
        this.s = qe1Var;
        this.t = wxrVar;
        this.u = p4bVar;
        this.v = kocVar;
        this.w = odjVar;
        this.x = gpgVar;
        this.y = hqqVar;
        this.z = mwkVar;
        this.A = k4kVar;
        this.B = ikeVar2;
        this.C = ikeVar3;
        this.D = ikeVar4;
        this.E = z3fVar;
        this.F = x20Var;
        this.G = vq0Var;
        this.H = ikeVar5;
        this.I = vcjVar;
        this.J = k45Var;
        this.K = sharedPreferences;
        tic ticVar = ne6Var.f;
        c7o c7oVarA = wlm.a();
        ticVar.getClass();
        this.L = f34.d(m51.I(ticVar, c7oVarA));
        this.N = true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    public static final long a(woc wocVar, List list) {
        long jLongValue;
        long jLongValue2;
        Long lValueOf;
        Long lValueOf2;
        Iterator it = list.iterator();
        Long l = null;
        if (it.hasNext()) {
            ChatHistoryResponse.OutMessage[] outMessageArr = ((ChatHistoryResponse) it.next()).messages;
            if (outMessageArr == null) {
                jLongValue = 0;
            } else {
                if (outMessageArr.length != 0) {
                    lValueOf2 = Long.valueOf(outMessageArr[0].serverMessage.serverMessageInfo.timestamp);
                    int length = outMessageArr.length - 1;
                    if (1 <= length) {
                        int i = 1;
                        while (true) {
                            Long lValueOf3 = Long.valueOf(outMessageArr[i].serverMessage.serverMessageInfo.timestamp);
                            if (lValueOf2.compareTo(lValueOf3) < 0) {
                                lValueOf2 = lValueOf3;
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    lValueOf2 = null;
                }
                if (lValueOf2 != null) {
                    jLongValue = lValueOf2.longValue();
                } else {
                    jLongValue = 0;
                }
            }
            Long lValueOf4 = Long.valueOf(jLongValue);
            while (it.hasNext()) {
                ChatHistoryResponse.OutMessage[] outMessageArr2 = ((ChatHistoryResponse) it.next()).messages;
                if (outMessageArr2 == null) {
                    jLongValue2 = 0;
                } else {
                    if (outMessageArr2.length != 0) {
                        lValueOf = Long.valueOf(outMessageArr2[0].serverMessage.serverMessageInfo.timestamp);
                        int length2 = outMessageArr2.length - 1;
                        if (1 <= length2) {
                            int i2 = 1;
                            while (true) {
                                Long lValueOf5 = Long.valueOf(outMessageArr2[i2].serverMessage.serverMessageInfo.timestamp);
                                if (lValueOf.compareTo(lValueOf5) < 0) {
                                    lValueOf = lValueOf5;
                                }
                                if (i2 == length2) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jLongValue2 = lValueOf.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                }
                Long lValueOf6 = Long.valueOf(jLongValue2);
                if (lValueOf4.compareTo(lValueOf6) < 0) {
                    lValueOf4 = lValueOf6;
                }
            }
            l = lValueOf4;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final long b(woc wocVar, List list) {
        Long l;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ChatRole chatRole = ((ChatHistoryResponse) it.next()).myRole;
            Long lValueOf = Long.valueOf(chatRole != null ? chatRole.version : 0L);
            while (it.hasNext()) {
                ChatRole chatRole2 = ((ChatHistoryResponse) it.next()).myRole;
                Long lValueOf2 = Long.valueOf(chatRole2 != null ? chatRole2.version : 0L);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.yandex.messaging.core.net.entities.BucketsData, com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse[], com.yandex.messaging.core.net.entities.proto.HistoryResponse, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public static final Object d(woc wocVar, long j, HistoryResponse historyResponse, BucketsData bucketsData, ArrayList arrayList, kc6 kc6Var) {
        moc mocVar;
        ArrayList arrayList2;
        HistoryResponse historyResponse2;
        List list;
        boolean z;
        ArrayList arrayList3;
        ChatHistoryResponse[] chatHistoryResponseArr;
        BucketsData bucketsData2;
        long j2;
        Iterator it;
        LinkedHashMap linkedHashMap;
        PinnedMessageInfo pinnedMessageInfo;
        ChatRole chatRole;
        Long l;
        List list2;
        boolean z2;
        ?? r14;
        boolean z3;
        boolean z4;
        Serializable serializable;
        yuk yukVar;
        ChatData[] chatDataArr;
        long j3;
        HistoryResponse historyResponse3;
        String str;
        anh anhVar;
        int i;
        boolean z5;
        koc kocVar = wocVar.v;
        if (kc6Var instanceof moc) {
            mocVar = (moc) kc6Var;
            int i2 = mocVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mocVar.p = i2 - Integer.MIN_VALUE;
            } else {
                mocVar = new moc(wocVar, kc6Var);
            }
        } else {
            mocVar = new moc(wocVar, kc6Var);
        }
        moc mocVar2 = mocVar;
        Object obj = mocVar2.n;
        Serializable serializable2 = xe6.a;
        int i3 = mocVar2.p;
        if (i3 != 0) {
            if (i3 == 1) {
                long j4 = mocVar2.d;
                list = mocVar2.j;
                ArrayList arrayList4 = mocVar2.i;
                arrayList2 = mocVar2.h;
                ChatHistoryResponse[] chatHistoryResponseArr2 = mocVar2.g;
                BucketsData bucketsData3 = mocVar2.f;
                HistoryResponse historyResponse4 = mocVar2.e;
                nzn.U(obj);
                arrayList3 = arrayList4;
                chatHistoryResponseArr = chatHistoryResponseArr2;
                bucketsData2 = bucketsData3;
                j2 = j4;
                historyResponse2 = historyResponse4;
                z = true;
            } else if (i3 == 2) {
                boolean z6 = mocVar2.m;
                j3 = mocVar2.d;
                yuk yukVar2 = mocVar2.l;
                ChatData[] chatDataArr2 = mocVar2.k;
                List list3 = mocVar2.j;
                historyResponse3 = mocVar2.e;
                nzn.U(obj);
                serializable = serializable2;
                list2 = list3;
                z4 = false;
                z3 = true;
                z2 = z6;
                yukVar = yukVar2;
                chatDataArr = chatDataArr2;
                r14 = 0;
                mocVar2.e = r14;
                mocVar2.f = r14;
                mocVar2.g = r14;
                mocVar2.h = r14;
                mocVar2.i = r14;
                mocVar2.j = list2;
                mocVar2.k = chatDataArr;
                mocVar2.l = yukVar;
                mocVar2.d = j3;
                mocVar2.m = z2;
                mocVar2.p = 3;
                str = r14;
                if (wocVar.k(historyResponse3, mocVar2) == serializable) {
                    return serializable;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yukVar = mocVar2.l;
                chatDataArr = mocVar2.k;
                list2 = mocVar2.j;
                nzn.U(obj);
                z4 = false;
                z3 = true;
                kocVar = kocVar;
                str = 0;
            }
            kocVar.a("chats_missed_users_calculated");
            anhVar = wocVar.k;
            i = anhVar.a.getInt("no_scheme_objects_version", -1);
            if (i <= 10) {
                z5 = z3;
            } else {
                z5 = z4;
            }
            atl.t(str, z5);
            if (i != 10) {
                SharedPreferences.Editor editorEdit = anhVar.a.edit();
                editorEdit.putInt("no_scheme_objects_version", 10);
                editorEdit.apply();
            }
            return new loc(yukVar.a, chatDataArr.length, list2.size());
        }
        nzn.U(obj);
        atl.s(wocVar.m, Looper.myLooper(), null);
        ChatHistoryResponse[] chatHistoryResponseArr3 = historyResponse.chats;
        if (chatHistoryResponseArr3 == null) {
            chatHistoryResponseArr3 = new ChatHistoryResponse[0];
        }
        ChatHistoryResponse[] chatHistoryResponseArr4 = chatHistoryResponseArr3;
        arrayList2 = new ArrayList();
        for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr4) {
            ChatRole chatRole2 = chatHistoryResponse.myRole;
            if (chatRole2 != null && chatRole2.role == 3) {
                arrayList2.add(chatHistoryResponse);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr4) {
            ChatRole chatRole3 = chatHistoryResponse2.myRole;
            if (chatRole3 == null || chatRole3.role != 3) {
                arrayList5.add(chatHistoryResponse2);
            }
        }
        int iE0 = ygf.e0(ac5.Y(arrayList, 10));
        if (iE0 < 16) {
            iE0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iE0);
        for (Object obj2 : arrayList) {
            linkedHashMap2.put(((xb4) obj2).a, obj2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ChatHistoryResponse chatHistoryResponse3 = (ChatHistoryResponse) next;
            xb4 xb4Var = (xb4) linkedHashMap2.get(chatHistoryResponse3.chatId);
            if (xb4Var != null) {
                it = it2;
                if (mqd.s(chatHistoryResponse3.chatId, xb4Var.a)) {
                    ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse3.messages;
                    if (outMessageArr == null || outMessageArr.length == 0) {
                        ChatInfoFromTransport chatInfoFromTransport = chatHistoryResponse3.chatInfo;
                        linkedHashMap = linkedHashMap2;
                        if (chatInfoFromTransport == null || Long.valueOf(chatInfoFromTransport.participantsCount).equals(xb4Var.i)) {
                            if (chatHistoryResponse3.partnerInfo != null) {
                                ChatNamespaces chatNamespaces = ChatNamespaces.a;
                                String str2 = chatHistoryResponse3.chatId;
                                mqd.y(str2, "chatId");
                                chatNamespaces.getClass();
                                if (!ChatNamespaces.b(str2)) {
                                    pinnedMessageInfo = chatHistoryResponse3.pinnedMessageInfo;
                                    if ((pinnedMessageInfo != null || Long.valueOf(pinnedMessageInfo.timestamp).equals(xb4Var.k)) && (((chatRole = chatHistoryResponse3.myRole) == null || Long.valueOf(chatRole.version).equals(xb4Var.l)) && xb4Var.j == chatHistoryResponse3.approvedByMe && xb4Var.h == chatHistoryResponse3.lastEditTimestamp && xb4Var.d == chatHistoryResponse3.otherSeenMarker && xb4Var.c == chatHistoryResponse3.ownerLastSeenSequenceNumber && xb4Var.b == chatHistoryResponse3.ownerSeenMarker)) {
                                        l = xb4Var.g;
                                        long j5 = chatHistoryResponse3.minMessageTimestamp;
                                        if (l == null && l.longValue() == j5) {
                                        }
                                    }
                                }
                            } else {
                                pinnedMessageInfo = chatHistoryResponse3.pinnedMessageInfo;
                                if (pinnedMessageInfo != null) {
                                    l = xb4Var.g;
                                    long j6 = chatHistoryResponse3.minMessageTimestamp;
                                    if (l == null) {
                                    }
                                } else {
                                    l = xb4Var.g;
                                    long j7 = chatHistoryResponse3.minMessageTimestamp;
                                    if (l == null) {
                                    }
                                }
                            }
                        }
                        it2 = it;
                        linkedHashMap2 = linkedHashMap;
                    }
                    arrayList6.add(next);
                    it2 = it;
                    linkedHashMap2 = linkedHashMap;
                } else if (!atl.u()) {
                    atl.y("Trying to compare chat history with different ids");
                }
            } else {
                it = it2;
            }
            linkedHashMap = linkedHashMap2;
            arrayList6.add(next);
            it2 = it;
            linkedHashMap2 = linkedHashMap;
        }
        kocVar.a("chats_calculated");
        mocVar2.e = historyResponse;
        mocVar2.f = bucketsData;
        mocVar2.g = chatHistoryResponseArr4;
        mocVar2.h = arrayList2;
        mocVar2.i = arrayList5;
        mocVar2.j = arrayList6;
        mocVar2.d = j;
        mocVar2.p = 1;
        Serializable serializableJ = wocVar.j(arrayList5, arrayList, mocVar2);
        if (serializableJ == serializable2) {
            return serializable2;
        }
        historyResponse2 = historyResponse;
        list = arrayList6;
        z = true;
        arrayList3 = arrayList5;
        obj = serializableJ;
        chatHistoryResponseArr = chatHistoryResponseArr4;
        bucketsData2 = bucketsData;
        j2 = j;
        ChatData[] chatDataArr3 = (ChatData[]) obj;
        kocVar.a("chats_missed_loaded");
        ie6 ie6Var = ((kc6) mocVar2).b;
        mqd.u(ie6Var);
        as1.v(ie6Var);
        kocVar.a("chats_coroutine_check");
        ChatHistoryResponse[] chatHistoryResponseArr5 = chatHistoryResponseArr;
        yuk yukVar3 = new yuk();
        yukVar3.a = j2;
        boolean zA = wocVar.G.a();
        kocVar.a("chats_db_started");
        ueg uegVar = wocVar.c;
        list2 = list;
        z2 = zA;
        r14 = 0;
        z3 = true;
        z4 = false;
        noc nocVar = new noc(wocVar, yukVar3, chatHistoryResponseArr5, list2, arrayList2, chatDataArr3, j2, z2, bucketsData2, historyResponse2, arrayList3, null);
        mocVar2.e = historyResponse2;
        mocVar2.f = null;
        mocVar2.g = null;
        mocVar2.h = null;
        mocVar2.i = null;
        mocVar2.j = list2;
        mocVar2.k = chatDataArr3;
        mocVar2.l = yukVar3;
        mocVar2.d = j2;
        mocVar2.m = z2;
        mocVar2.p = 2;
        serializable = serializable2;
        if (uegVar.W(nocVar, mocVar2) == serializable) {
            return serializable;
        }
        yukVar = yukVar3;
        chatDataArr = chatDataArr3;
        j3 = j2;
        historyResponse3 = historyResponse2;
        mocVar2.e = r14;
        mocVar2.f = r14;
        mocVar2.g = r14;
        mocVar2.h = r14;
        mocVar2.i = r14;
        mocVar2.j = list2;
        mocVar2.k = chatDataArr;
        mocVar2.l = yukVar;
        mocVar2.d = j3;
        mocVar2.m = z2;
        mocVar2.p = 3;
        str = r14;
        if (wocVar.k(historyResponse3, mocVar2) == serializable) {
            return serializable;
        }
        kocVar.a("chats_missed_users_calculated");
        anhVar = wocVar.k;
        i = anhVar.a.getInt("no_scheme_objects_version", -1);
        if (i <= 10) {
            z5 = z3;
        } else {
            z5 = z4;
        }
        atl.t(str, z5);
        if (i != 10) {
            SharedPreferences.Editor editorEdit2 = anhVar.a.edit();
            editorEdit2.putInt("no_scheme_objects_version", 10);
            editorEdit2.apply();
        }
        return new loc(yukVar.a, chatDataArr.length, list2.size());
    }

    /* JADX WARN: Code duplicated, block: B:105:0x020a A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:122:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd A[Catch: all -> 0x0107, LOOP:0: B:39:0x00fb->B:40:0x00fd, LOOP_END, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0120 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:52:0x013b A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0172 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x017a A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0192 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ba A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:32:0x00dc, B:35:0x00ed, B:38:0x00f2, B:40:0x00fd, B:43:0x010b, B:44:0x011a, B:46:0x0120, B:48:0x012d, B:49:0x0131, B:50:0x0135, B:52:0x013b, B:54:0x0147, B:56:0x0151, B:57:0x0154, B:58:0x0158, B:60:0x0166, B:62:0x0172, B:65:0x017a, B:66:0x017d, B:67:0x0180, B:68:0x018c, B:70:0x0192, B:72:0x01a3, B:74:0x01a7, B:76:0x01ab, B:79:0x01b1, B:81:0x01ba, B:84:0x01c2, B:85:0x01c5, B:87:0x01c9, B:89:0x01d1, B:91:0x01d5, B:93:0x01d9, B:95:0x01dd, B:96:0x01e6, B:98:0x01ef, B:99:0x01f2, B:102:0x01fe, B:103:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x0220, B:110:0x0224), top: B:119:0x00dc }] */
    public static final Object e(woc wocVar, ChatHistoryResponse[] chatHistoryResponseArr, ArrayList arrayList, HistoryResponse historyResponse, kc6 kc6Var) {
        ooc oocVar;
        ChatHistoryResponse[] chatHistoryResponseArr2;
        Map map;
        HistoryResponse historyResponse2;
        Set set;
        ChatHistoryResponse[] chatHistoryResponseArr3;
        HistoryResponse historyResponse3;
        Map map2;
        boolean zA;
        veg vegVarV;
        fcq fcqVar;
        Iterator it;
        xr6 xr6VarG;
        idj idjVar;
        ArrayList arrayList2;
        int i;
        Set setQ1;
        ArrayList<String> arrayList3;
        ArrayList<ChatHistoryResponse> arrayList4;
        int i2;
        long jMax;
        ServerMessage serverMessage;
        String str;
        xr6 xr6VarG2;
        it4 it4VarG;
        ChatHistoryResponse.OutMessage[] outMessageArr;
        ChatHistoryResponse.OutMessage outMessage;
        ServerMessage serverMessage2;
        ClientMessage clientMessage;
        PlainMessage plainMessage;
        ServerMessageInfo serverMessageInfo;
        ReducedUserInfo reducedUserInfo;
        xb4 xb4Var;
        boolean zC;
        xr6 xr6VarG3;
        idj idjVar2;
        do4 do4Var = wocVar.f;
        koc kocVar = wocVar.v;
        if (kc6Var instanceof ooc) {
            oocVar = (ooc) kc6Var;
            int i3 = oocVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oocVar.j = i3 - Integer.MIN_VALUE;
            } else {
                oocVar = new ooc(wocVar, kc6Var);
            }
        } else {
            oocVar = new ooc(wocVar, kc6Var);
        }
        Object objN = oocVar.h;
        xe6 xe6Var = xe6.a;
        int i4 = oocVar.j;
        if (i4 == 0) {
            nzn.U(objN);
            int iE0 = ygf.e0(ac5.Y(arrayList, 10));
            if (iE0 < 16) {
                iE0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iE0);
            for (Object obj : arrayList) {
                linkedHashMap.put(((xb4) obj).a, obj);
            }
            bfp bfpVarP = wocVar.i.P();
            chatHistoryResponseArr2 = chatHistoryResponseArr;
            oocVar.d = chatHistoryResponseArr2;
            oocVar.e = historyResponse;
            oocVar.f = linkedHashMap;
            oocVar.j = 1;
            objN = h6i.N(bfpVarP.a, true, new p6p(12), oocVar);
            if (objN != xe6Var) {
                map = linkedHashMap;
                historyResponse2 = historyResponse;
            }
            return xe6Var;
        }
        if (i4 == 1) {
            Map map3 = oocVar.f;
            historyResponse2 = oocVar.e;
            ChatHistoryResponse[] chatHistoryResponseArr4 = oocVar.d;
            nzn.U(objN);
            map = map3;
            chatHistoryResponseArr2 = chatHistoryResponseArr4;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = oocVar.g;
            map2 = oocVar.f;
            historyResponse3 = oocVar.e;
            chatHistoryResponseArr3 = oocVar.d;
            nzn.U(objN);
        }
        zA = wocVar.G.a();
        vegVarV = wocVar.c.V();
        try {
            vegVarV.f0();
            l(vegVarV, historyResponse3.users, chatHistoryResponseArr3);
            fcqVar = fcq.a;
            if (chatHistoryResponseArr3 != null && chatHistoryResponseArr3.length != 0) {
                arrayList2 = new ArrayList(chatHistoryResponseArr3.length);
                for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr3) {
                    arrayList2.add(chatHistoryResponse.chatId);
                }
                setQ1 = zb5.q1(arrayList2);
                arrayList3 = new ArrayList();
                for (Object obj2 : set) {
                    if (!setQ1.contains((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                for (String str2 : arrayList3) {
                    xr6VarG3 = do4Var.g(str2);
                    if (xr6VarG3 == null && (idjVar2 = (idj) xr6VarG3.N.get()) != null) {
                        idjVar2.c(Long.MAX_VALUE);
                    }
                    vegVarV.v(str2, false);
                }
                kocVar.a("threads_deleted");
                arrayList4 = new ArrayList();
                for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr3) {
                    xb4Var = (xb4) map2.get(chatHistoryResponse2.chatId);
                    if (xb4Var != null) {
                        zC = m51.C(chatHistoryResponse2, xb4Var);
                    } else {
                        zC = true;
                    }
                    if (zC) {
                        arrayList4.add(chatHistoryResponse2);
                    }
                }
                kocVar.a("threads_calculated");
                jMax = 0;
                for (ChatHistoryResponse chatHistoryResponse3 : arrayList4) {
                    String str3 = chatHistoryResponse3.chatId;
                    mqd.y(str3, "chatId");
                    serverMessage = chatHistoryResponse3.threadParentMessage;
                    if (serverMessage != null || (serverMessageInfo = serverMessage.serverMessageInfo) == null || (reducedUserInfo = serverMessageInfo.from) == null || (str = reducedUserInfo.displayName) == null) {
                        str = "";
                    }
                    vegVarV.R(str3, str);
                    xr6VarG2 = do4Var.g(str3);
                    if (xr6VarG2 != null) {
                        it4VarG = xr6VarG2.g();
                    } else {
                        it4VarG = null;
                    }
                    if (it4VarG != null) {
                        it4VarG.j(vegVarV, chatHistoryResponse3, zA);
                    }
                    outMessageArr = chatHistoryResponse3.messages;
                    if (outMessageArr == null && (outMessage = (ChatHistoryResponse.OutMessage) tt0.E0(0, outMessageArr)) != null && (serverMessage2 = outMessage.serverMessage) != null && (clientMessage = serverMessage2.clientMessage) != null && (plainMessage = clientMessage.plain) != null) {
                        jMax = Math.max(jMax, plainMessage.getTimestamp());
                    }
                }
                kocVar.a("threads_updated");
                if (jMax > 0) {
                    vegVarV.D(jMax);
                }
                vegVarV.O();
                vegVarV.close();
                kocVar.a("threads_db_updated");
                return fcqVar;
            }
            it = set.iterator();
            while (it.hasNext()) {
                xr6VarG = do4Var.g((String) it.next());
                if (xr6VarG == null && (idjVar = (idj) xr6VarG.N.get()) != null) {
                    idjVar.c(Long.MAX_VALUE);
                }
            }
            vegVarV.l();
            kocVar.a("threads_cleared");
            vegVarV.close();
            return fcqVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vd1.v(vegVarV, th);
                throw th2;
            }
        }
        Set setQ2 = zb5.q1((Iterable) objN);
        oocVar.d = chatHistoryResponseArr2;
        oocVar.e = historyResponse2;
        oocVar.f = map;
        oocVar.g = setQ2;
        oocVar.j = 2;
        if (f3n.h(oocVar) != xe6Var) {
            set = setQ2;
            chatHistoryResponseArr3 = chatHistoryResponseArr2;
            historyResponse3 = historyResponse2;
            map2 = map;
            zA = wocVar.G.a();
            vegVarV = wocVar.c.V();
            vegVarV.f0();
            l(vegVarV, historyResponse3.users, chatHistoryResponseArr3);
            fcqVar = fcq.a;
            if (chatHistoryResponseArr3 != null) {
                arrayList2 = new ArrayList(chatHistoryResponseArr3.length);
                while (i < r12) {
                    arrayList2.add(chatHistoryResponse.chatId);
                }
                setQ1 = zb5.q1(arrayList2);
                arrayList3 = new ArrayList();
                while (r5.hasNext()) {
                    if (!setQ1.contains((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                while (r5.hasNext()) {
                    xr6VarG3 = do4Var.g(str2);
                    if (xr6VarG3 == null) {
                    }
                    vegVarV.v(str2, false);
                }
                kocVar.a("threads_deleted");
                arrayList4 = new ArrayList();
                while (i2 < r7) {
                    xb4Var = (xb4) map2.get(chatHistoryResponse2.chatId);
                    if (xb4Var != null) {
                        zC = m51.C(chatHistoryResponse2, xb4Var);
                    } else {
                        zC = true;
                    }
                    if (zC) {
                        arrayList4.add(chatHistoryResponse2);
                    }
                }
                kocVar.a("threads_calculated");
                jMax = 0;
                while (r4.hasNext()) {
                    String str4 = chatHistoryResponse3.chatId;
                    mqd.y(str4, "chatId");
                    serverMessage = chatHistoryResponse3.threadParentMessage;
                    if (serverMessage != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    vegVarV.R(str4, str);
                    xr6VarG2 = do4Var.g(str4);
                    if (xr6VarG2 != null) {
                        it4VarG = xr6VarG2.g();
                    } else {
                        it4VarG = null;
                    }
                    if (it4VarG != null) {
                        it4VarG.j(vegVarV, chatHistoryResponse3, zA);
                    }
                    outMessageArr = chatHistoryResponse3.messages;
                    if (outMessageArr == null) {
                    }
                }
                kocVar.a("threads_updated");
                if (jMax > 0) {
                    vegVarV.D(jMax);
                }
                vegVarV.O();
                vegVarV.close();
                kocVar.a("threads_db_updated");
                return fcqVar;
            }
            it = set.iterator();
            while (it.hasNext()) {
                xr6VarG = do4Var.g((String) it.next());
                if (xr6VarG == null) {
                }
            }
            vegVarV.l();
            kocVar.a("threads_cleared");
            vegVarV.close();
            return fcqVar;
        }
        return xe6Var;
    }

    public static final Object f(woc wocVar, hlc hlcVar, d5b d5bVar) {
        Object objS = wlm.s(new toc(wocVar, hlcVar, null), d5bVar);
        return objS == xe6.a ? objS : fcq.a;
    }

    public static final void g(woc wocVar, veg vegVar, BucketsData bucketsData) {
        oo6 oo6Var = wocVar.r;
        Bucket bucketA = bucketsData.a(StickerPacksBucket.class);
        if (bucketA != null) {
            StickerPacksBucket stickerPacksBucket = (StickerPacksBucket) bucketA;
            fvn fvnVar = (fvn) wocVar.g.get();
            if (fvnVar != null) {
                fvnVar.c(stickerPacksBucket);
            }
        }
        Bucket bucketA2 = bucketsData.a(RestrictionsBucket.class);
        if (bucketA2 != null) {
            vegVar.C1((RestrictionsBucket) bucketA2);
        }
        Bucket bucketA3 = bucketsData.a(PrivacyBucket.class);
        if (bucketA3 != null) {
            vegVar.x1((PrivacyBucket) bucketA3);
        }
        Bucket bucketA4 = bucketsData.a(ChatMutingsBucket.class);
        if (bucketA4 != null) {
            atl.s(wocVar.e.c, Looper.myLooper(), null);
            vegVar.t0((ChatMutingsBucket) bucketA4);
        }
        Bucket bucketA5 = bucketsData.a(PinnedChatsBucket.class);
        if (bucketA5 != null) {
            vegVar.w1((PinnedChatsBucket) bucketA5);
        }
        Bucket bucketA6 = bucketsData.a(MiniappsBucket.class);
        if (bucketA6 != null) {
            vegVar.e1((MiniappsBucket) bucketA6);
        }
        Bucket bucketA7 = bucketsData.a(HiddenPrivateChatsBucket.class);
        if (bucketA7 != null) {
            wocVar.d.e(vegVar, (HiddenPrivateChatsBucket) bucketA7);
        }
        if (bucketsData.a(UserStatusPresetBucket.class) == null && ((po6) oo6Var.b.get()).d) {
            qo6 qo6Var = oo6Var.a;
            qo6Var.f = true;
            fde.v(qo6Var.e, "IS_CUSTOM_STATUSES_ENABLED", true);
        }
        Bucket bucketA8 = bucketsData.a(UserStatusPresetBucket.class);
        if (bucketA8 != null) {
            UserStatusPresetBucket userStatusPresetBucket = (UserStatusPresetBucket) bucketA8;
            if (((po6) oo6Var.b.get()).d) {
                qo6 qo6Var2 = oo6Var.a;
                qo6Var2.f = true;
                SharedPreferences.Editor editorEdit = qo6Var2.e.edit();
                editorEdit.putBoolean("IS_CUSTOM_STATUSES_ENABLED", true);
                editorEdit.apply();
                vegVar.D0(userStatusPresetBucket);
            }
        }
        Bucket bucketA9 = bucketsData.a(FoldersBucket.class);
        if (bucketA9 != null) {
            wocVar.u.a((FoldersBucket) bucketA9, vegVar);
        }
        Bucket bucketA10 = bucketsData.a(PreferencesBucket.class);
        if (bucketA10 != null) {
            PreferencesBucket preferencesBucket = (PreferencesBucket) bucketA10;
            odj odjVar = wocVar.w;
            if (((b2p) odjVar.b.get()).c) {
                odjVar.a.getClass();
                vegVar.v1(preferencesBucket);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object h(woc wocVar, HistoryResponse historyResponse, kc6 kc6Var) {
        uoc uocVar;
        veg vegVarV;
        veg vegVar;
        veg vegVar2;
        HistoryResponse historyResponse2;
        veg vegVar3;
        Throwable th;
        veg vegVar4;
        List list;
        veg vegVar5;
        int length;
        woc wocVar2 = wocVar;
        if (kc6Var instanceof uoc) {
            uocVar = (uoc) kc6Var;
            int i = uocVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                uocVar.j = i - Integer.MIN_VALUE;
            } else {
                uocVar = new uoc(wocVar2, kc6Var);
            }
        } else {
            uocVar = new uoc(wocVar2, kc6Var);
        }
        Object obj = uocVar.h;
        xe6 xe6Var = xe6.a;
        int i2 = uocVar.j;
        int i3 = 1;
        if (i2 == 0) {
            nzn.U(obj);
            vegVarV = wocVar2.c.V();
            try {
                gdj gdjVarX = wocVar2.i.x();
                uocVar.d = historyResponse;
                uocVar.e = vegVarV;
                uocVar.f = vegVarV;
                uocVar.g = vegVarV;
                uocVar.j = 1;
                Object objN = h6i.N(gdjVarX.a, true, new a0i(28), uocVar);
                if (objN == xe6Var) {
                    return xe6Var;
                }
                vegVar = vegVarV;
                vegVar2 = vegVar;
                obj = objN;
                historyResponse2 = historyResponse;
                vegVar3 = vegVar2;
            } catch (Throwable th2) {
                th = th2;
                vegVar3 = vegVarV;
                th = th;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vegVar = uocVar.g;
            vegVar2 = uocVar.f;
            vegVar3 = uocVar.e;
            historyResponse2 = uocVar.d;
            try {
                nzn.U(obj);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                try {
                    throw th;
                } catch (Throwable th4) {
                    vd1.v(vegVar3, th);
                    throw th4;
                }
            }
        }
        try {
            List list2 = (List) obj;
            ChatHistoryResponse[] chatHistoryResponseArr = historyResponse2.chats;
            if (chatHistoryResponseArr != null) {
                try {
                    int length2 = chatHistoryResponseArr.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        ChatHistoryResponse chatHistoryResponse = chatHistoryResponseArr[i4];
                        long[] jArr = chatHistoryResponse.personalMentions;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (mqd.s(((hdj) obj2).b, chatHistoryResponse.chatId)) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(ac5.Y(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new Long(((hdj) it.next()).c));
                        }
                        qc9 qc9VarN = qc9.a;
                        if (jArr != null && (length = jArr.length) != 0) {
                            if (length != i3) {
                                qc9VarN = new LinkedHashSet(ygf.e0(jArr.length));
                                for (long j : jArr) {
                                    qc9VarN.add(Long.valueOf(j));
                                }
                            } else {
                                qc9VarN = hum.n(Long.valueOf(jArr[0]));
                            }
                        }
                        if (qc9VarN.equals(zb5.q1(arrayList2))) {
                            list = list2;
                            vegVar5 = vegVar3;
                        } else {
                            do4 do4Var = wocVar2.f;
                            String str = chatHistoryResponse.chatId;
                            mqd.y(str, "chatId");
                            xr6 xr6VarG = do4Var.g(str);
                            if (xr6VarG == null) {
                                list = list2;
                                vegVar5 = vegVar3;
                            } else {
                                try {
                                    idj idjVar = (idj) xr6VarG.N.get();
                                    mqd.y(idjVar, "personalMentionsRepository(...)");
                                    idjVar.c(Long.MAX_VALUE);
                                    if (jArr != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        int length3 = jArr.length;
                                        int i5 = 0;
                                        while (i5 < length3) {
                                            vegVar4 = vegVar3;
                                            try {
                                                long j2 = jArr[i5];
                                                List list3 = list2;
                                                if (j2 > chatHistoryResponse.ownerSeenMarker) {
                                                    arrayList3.add(new Long(j2));
                                                }
                                                i5++;
                                                vegVar3 = vegVar4;
                                                list2 = list3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                vegVar3 = vegVar4;
                                                throw th;
                                            }
                                        }
                                        list = list2;
                                        vegVar5 = vegVar3;
                                        if (arrayList3.isEmpty()) {
                                            arrayList3 = null;
                                        }
                                        if (arrayList3 != null) {
                                            idjVar.a(zb5.q1(arrayList3));
                                        }
                                    } else {
                                        list = list2;
                                        vegVar5 = vegVar3;
                                    }
                                    vegVar.g.a(xr6VarG.a.a);
                                } catch (Throwable th6) {
                                    th = th6;
                                    vegVar4 = vegVar3;
                                }
                            }
                        }
                        i4++;
                        wocVar2 = wocVar;
                        vegVar3 = vegVar5;
                        list2 = list;
                        i3 = 1;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th = th;
                    throw th;
                }
            }
            veg vegVar6 = vegVar3;
            try {
                vegVar2.O();
                vd1.v(vegVar6, null);
                return fcq.a;
            } catch (Throwable th8) {
                th = th8;
                vegVarV = vegVar6;
                vegVar3 = vegVarV;
                th = th;
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:61:0x01bf, B:63:0x01c4, B:65:0x01cc, B:68:0x01d3, B:70:0x01e1, B:73:0x01e9, B:74:0x01ec), top: B:89:0x01bf }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e9 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:61:0x01bf, B:63:0x01c4, B:65:0x01cc, B:68:0x01d3, B:70:0x01e1, B:73:0x01e9, B:74:0x01ec), top: B:89:0x01bf }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:83:0x021a  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020e, code lost:
    
        if (f3n.h(r10) == r1) goto L77;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x020e -> B:78:0x0211). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.woc r21, com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse[] r22, java.util.List r23, java.util.List r24, com.yandex.messaging.core.net.entities.ChatData[] r25, long r26, boolean r28, boolean r29, kc6 r30) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woc.i(woc, com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse[], java.util.List, java.util.List, com.yandex.messaging.core.net.entities.ChatData[], long, boolean, boolean, kc6):java.lang.Object");
    }

    public static void l(veg vegVar, ReducedUserInfo[] reducedUserInfoArr, ChatHistoryResponse[] chatHistoryResponseArr) {
        LinkedHashSet linkedHashSet;
        if (reducedUserInfoArr != null) {
            List listG1 = tt0.g1(reducedUserInfoArr);
            Iterator it = listG1.iterator();
            while (it.hasNext()) {
                vegVar.G1((ReducedUserInfo) it.next(), 0);
            }
            linkedHashSet = new LinkedHashSet();
            Iterator it2 = listG1.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(((ReducedUserInfo) it2.next()).userId);
            }
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        if (chatHistoryResponseArr != null) {
            ArrayList<ReducedUserInfo> arrayList = new ArrayList();
            for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr) {
                ReducedUserInfo reducedUserInfo = chatHistoryResponse.partnerInfo;
                if (reducedUserInfo != null) {
                    arrayList.add(reducedUserInfo);
                }
            }
            for (ReducedUserInfo reducedUserInfo2 : arrayList) {
                if (linkedHashSet.add(reducedUserInfo2.userId)) {
                    vegVar.G1(reducedUserInfo2, 0);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    public final Serializable j(ArrayList arrayList, List list, kc6 kc6Var) {
        poc pocVar;
        if (kc6Var instanceof poc) {
            pocVar = (poc) kc6Var;
            int i = pocVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pocVar.f = i - Integer.MIN_VALUE;
            } else {
                pocVar = new poc(this, kc6Var);
            }
        } else {
            pocVar = new poc(this, kc6Var);
        }
        Object objA = pocVar.d;
        xe6 xe6Var = xe6.a;
        int i2 = pocVar.f;
        if (i2 == 0) {
            nzn.U(objA);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                ChatHistoryResponse chatHistoryResponse = (ChatHistoryResponse) obj;
                if (chatHistoryResponse.chatInfo == null && chatHistoryResponse.privateChatInfo == null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(ac5.Y(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ChatHistoryResponse) it.next()).chatId);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (!ChatFlags.a(((xb4) obj2).f, 64L)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(ac5.Y(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((xb4) it2.next()).a);
            }
            LinkedHashSet linkedHashSetA1 = zb5.a1(arrayList3, zb5.q1(arrayList5));
            if (linkedHashSetA1.isEmpty()) {
                return new ChatData[0];
            }
            this.v.a("chats_missed_calculated");
            pocVar.f = 1;
            objA = this.j.a(linkedHashSetA1, pocVar);
            if (objA == xe6Var) {
                return xe6Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nzn.U(objA);
        }
        ?? r13 = (ChatData[]) objA;
        return r13 == 0 ? new ChatData[0] : r13;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object k(HistoryResponse historyResponse, kc6 kc6Var) {
        qoc qocVar;
        ctm ctmVar;
        ctm ctmVar2;
        ctm ctmVar3;
        ArrayList arrayList;
        String strB;
        ctm ctmVarC;
        if (kc6Var instanceof qoc) {
            qocVar = (qoc) kc6Var;
            int i = qocVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                qocVar.i = i - Integer.MIN_VALUE;
            } else {
                qocVar = new qoc(this, kc6Var);
            }
        } else {
            qocVar = new qoc(this, kc6Var);
        }
        Object obj = qocVar.g;
        xe6 xe6Var = xe6.a;
        int i2 = qocVar.i;
        if (i2 == 0) {
            nzn.U(obj);
            ctmVar = new ctm();
            if (((g1r) this.H.get()).c) {
                z3f z3fVar = this.E;
                z3fVar.getClass();
                mqd.z(historyResponse, "historyResponse");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ReducedUserInfo[] reducedUserInfoArr = historyResponse.users;
                if (reducedUserInfoArr != null) {
                    for (ReducedUserInfo reducedUserInfo : reducedUserInfoArr) {
                        mqd.u(reducedUserInfo);
                        z3fVar.a(reducedUserInfo, linkedHashSet);
                    }
                }
                ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
                if (chatHistoryResponseArr != null) {
                    for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr) {
                        mqd.u(chatHistoryResponse);
                        ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse.messages;
                        if (outMessageArr != null) {
                            for (ChatHistoryResponse.OutMessage outMessage : outMessageArr) {
                                ServerMessage serverMessage = outMessage.serverMessage;
                                mqd.y(serverMessage, "serverMessage");
                                z3fVar.b(serverMessage, linkedHashSet);
                            }
                        }
                        ReducedUserInfo reducedUserInfo2 = chatHistoryResponse.partnerInfo;
                        if (reducedUserInfo2 != null) {
                            z3fVar.a(reducedUserInfo2, linkedHashSet);
                        }
                        ServerMessage serverMessage2 = chatHistoryResponse.threadParentMessage;
                        if (serverMessage2 != null) {
                            z3fVar.b(serverMessage2, linkedHashSet);
                        }
                    }
                }
                ctmVar.addAll(linkedHashSet);
            }
            ChatHistoryResponse[] chatHistoryResponseArr2 = historyResponse.chats;
            if (chatHistoryResponseArr2 == null) {
                chatHistoryResponseArr2 = new ChatHistoryResponse[0];
            }
            List<ChatHistoryResponse> listX0 = tt0.x0(chatHistoryResponseArr2);
            ArrayList arrayList2 = new ArrayList();
            for (ChatHistoryResponse chatHistoryResponse2 : listX0) {
                ReducedUserInfo reducedUserInfo3 = chatHistoryResponse2.partnerInfo;
                if (reducedUserInfo3 == null || (strB = reducedUserInfo3.userId) == null) {
                    String str = chatHistoryResponse2.chatId;
                    mqd.y(str, "chatId");
                    strB = this.c.b(str);
                }
                if (strB != null) {
                    arrayList2.add(strB);
                }
            }
            if (!arrayList2.isEmpty()) {
                w0r w0rVarB = this.i.b();
                List listU0 = zb5.u0(arrayList2);
                qocVar.d = ctmVar;
                qocVar.e = ctmVar;
                qocVar.f = arrayList2;
                qocVar.i = 1;
                w0rVarB.getClass();
                Object objA = w0r.a(w0rVarB, listU0, qocVar);
                if (objA == xe6Var) {
                    return xe6Var;
                }
                ctmVar2 = ctmVar;
                ctmVar3 = ctmVar2;
                obj = objA;
                arrayList = arrayList2;
            }
            ctmVarC = hum.c(ctmVar);
            if (!ctmVarC.a.isEmpty()) {
                this.h.a(zb5.l1(ctmVarC));
            }
            return fcq.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList = qocVar.f;
        ctmVar3 = qocVar.e;
        ctmVar2 = qocVar.d;
        nzn.U(obj);
        ctmVar3.addAll(zb5.Q0(arrayList, zb5.q1((Iterable) obj)));
        ctmVar = ctmVar2;
        ctmVarC = hum.c(ctmVar);
        if (!ctmVarC.a.isEmpty()) {
            this.h.a(zb5.l1(ctmVarC));
        }
        return fcq.a;
    }
}
