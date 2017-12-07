package day7;

import org.junit.jupiter.api.Test;

import static day7.Day7.calculateA;
import static day7.Day7.calculateB;
import static day7.Day7.setInputData;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day7Test {

    @Test
    void test1a() {
        String input="pbga (66)\n" +
                "xhth (57)\n" +
                "ebii (61)\n" +
                "havc (66)\n" +
                "ktlj (57)\n" +
                "fwft (72) -> ktlj, cntj, xhth\n" +
                "qoyq (66)\n" +
                "padx (45) -> pbga, havc, qoyq\n" +
                "tknk (41) -> ugml, padx, fwft\n" +
                "jptl (61)\n" +
                "ugml (68) -> gyxo, ebii, jptl\n" +
                "gyxo (61)\n" +
                "cntj (57)";
        setInputData(input);
        assertEquals("tknk", calculateA());
    }
    @Test
    void test1b() {
        String input="pbga (66)\n" +
                "xhth (57)\n" +
                "ebii (61)\n" +
                "havc (66)\n" +
                "ktlj (57)\n" +
                "fwft (72) -> ktlj, cntj, xhth\n" +
                "qoyq (66)\n" +
                "padx (45) -> pbga, havc, qoyq\n" +
                "tknk (41) -> ugml, padx, fwft\n" +
                "jptl (61)\n" +
                "ugml (68) -> gyxo, ebii, jptl\n" +
                "gyxo (61)\n" +
                "cntj (57)";
        setInputData(input);
        assertEquals(60, calculateB());
    }

    @Test
    void puzzle() {
        String input="llyhqfe (21)\n" +
                "vpbdpfm (74) -> ndegtj, wnwxs\n" +
                "dosteiu (262) -> vliyv, rfxmk, nulxd, tckql\n" +
                "leqnli (222) -> wuttw, nckca\n" +
                "cgztcyz (59) -> zbtmpkc, lleaucw, zxvjkqv, tqjyoj\n" +
                "dqfti (67)\n" +
                "vsjhe (34) -> zpbbgqh, menyi, ksasli, uahdbi, ccfiz, kdwmlx\n" +
                "ntzuhe (98)\n" +
                "mpjrzt (53)\n" +
                "dnzll (23)\n" +
                "ensyb (18) -> usvzfi, uxxtnll, phrkfo, vntjo\n" +
                "airqzst (39)\n" +
                "hfzvg (26)\n" +
                "wpojcme (79)\n" +
                "xggisxm (37)\n" +
                "jkqcelt (35)\n" +
                "apjsu (299) -> rgylin, yrmfcs\n" +
                "odoni (18)\n" +
                "gzatvf (27)\n" +
                "azkpaf (81)\n" +
                "dnyaj (76)\n" +
                "chfcnsc (70)\n" +
                "wjdkcjo (29) -> jdntuc, htaxf, edpqtnn\n" +
                "bejkc (194) -> lqjnh, xkfwmh\n" +
                "lfapaod (97)\n" +
                "eidqfh (24)\n" +
                "haeyms (23) -> akxrge, qgqrmeu, nsnhdll, ydyvay\n" +
                "ialdd (67)\n" +
                "otqufza (116) -> dvasofv, mxdxz\n" +
                "jbopt (91)\n" +
                "mkxsdn (46)\n" +
                "vkcim (63)\n" +
                "ypokgio (14)\n" +
                "wiihwvv (55) -> mivrqpc, hdqgdm, muulq, tveyfha\n" +
                "rvdldy (47)\n" +
                "xzsfek (87)\n" +
                "shkfwm (26) -> yjpzyzx, vdnvw, nsbyncu, wpafb\n" +
                "jdryrup (43)\n" +
                "zqxhle (53)\n" +
                "xaaqdv (21) -> kxkwc, mpwnd\n" +
                "lfmlqs (79)\n" +
                "mcctaf (37)\n" +
                "qewiy (18)\n" +
                "lfzvi (240) -> gxmqlu, sfteyu\n" +
                "zbtmpkc (94)\n" +
                "jaathmh (33)\n" +
                "sjwxyqb (55)\n" +
                "wxvsp (187) -> umiohmp, zeauj\n" +
                "opghigg (97) -> dletgs, bcgqdc\n" +
                "kabjov (239) -> eulcspz, nxttce\n" +
                "jivdw (14)\n" +
                "nckca (6)\n" +
                "nfeok (203) -> apqan, ywtywz, inoyp\n" +
                "ejyegf (71)\n" +
                "ccmfbok (82) -> jbopt, cteuws, rrsxb, atfjks\n" +
                "qizkjh (350) -> mxsacj, liiwwfa\n" +
                "tdfirdf (62)\n" +
                "jwboky (54)\n" +
                "ksnnnc (638) -> iuuzow, eiyvtz, dlxcy, ltfbsgc\n" +
                "mhbiyxk (15396) -> ehpfjr, zqgeod, hiccoc\n" +
                "bzenp (37)\n" +
                "uymhfo (37) -> wiihwvv, jgpsybl, zpxuxph\n" +
                "vewathl (261) -> bzbxoa, ntzbt, jsizfuj, ikrlxqw\n" +
                "bvqhn (82)\n" +
                "jqtxjrm (1199) -> aqkclfk, eipaxu, hzvctd, zpohg\n" +
                "kfuwkh (52)\n" +
                "aamghal (79)\n" +
                "jqywsxa (74)\n" +
                "ehpfjr (42) -> sdxwhvp, itdxbrj, cgztcyz, awylric\n" +
                "gxmyk (166)\n" +
                "beknji (29)\n" +
                "ahvdop (50)\n" +
                "fpuhllh (8)\n" +
                "cadtows (49)\n" +
                "shbrz (874) -> hcywj, pkgyjn, hwxxvlb\n" +
                "tebvlpn (106) -> kfuwkh, nkuhc\n" +
                "jexcm (33)\n" +
                "gwplv (33)\n" +
                "nsckvp (49)\n" +
                "ghaxmrh (10881) -> hhosv, ximzx, ztphu\n" +
                "gkwamq (54)\n" +
                "vonve (204) -> scxkq, ubsbx\n" +
                "hmlil (63)\n" +
                "rpmzw (97)\n" +
                "fzkqz (75) -> xxyjm, yjqgw, ejyegf\n" +
                "dfwamci (36)\n" +
                "bzbxoa (42)\n" +
                "qlmbqwi (58)\n" +
                "ivygtzl (1708) -> vjfsl, xfvhi, sbhfnav\n" +
                "vliyv (20)\n" +
                "mecsrr (81)\n" +
                "uskdpcu (388) -> nktkgz, xcuud\n" +
                "vwktc (60)\n" +
                "fkpjukc (42)\n" +
                "nsnhdll (70)\n" +
                "dpgggti (8)\n" +
                "nxmxgax (70)\n" +
                "vwntogi (64)\n" +
                "jshekxk (42)\n" +
                "ncxhv (184) -> ddxiiha, hcvuc, tebvlpn, kkjen, wjkalv\n" +
                "urpzfa (58)\n" +
                "ocrgjl (2738) -> qogmb, qxirdyg, aovhss\n" +
                "gtxvgr (58)\n" +
                "psqgnhx (20)\n" +
                "vkoor (69)\n" +
                "mzpeoz (50)\n" +
                "sbebrkf (12)\n" +
                "zupsoqc (20)\n" +
                "eiyvtz (65) -> modakko, mlydcn\n" +
                "jdvuj (8)\n" +
                "bytizsx (61)\n" +
                "dhamym (17)\n" +
                "zldebh (76)\n" +
                "esmltj (21)\n" +
                "tihzzf (701) -> wyeoaxt, hrkhlaq, vyccl, jezmn, nmmrik\n" +
                "rmriv (27)\n" +
                "byiqom (88)\n" +
                "mnkamc (1717) -> idhjov, pyurvrc, ahpitb\n" +
                "fvtofr (44) -> jexcm, jokgw, slmnzei\n" +
                "ppkpq (41)\n" +
                "kxkwc (57)\n" +
                "epnvhbn (21)\n" +
                "tusmlk (295) -> ialdd, kipiwwk\n" +
                "lwqscns (14) -> zgyryw, oiooued\n" +
                "zbmsz (35)\n" +
                "czmmh (44)\n" +
                "fmwid (1567) -> dhbxpw, xkzrkzh, wxvsp, zqyrggw\n" +
                "sviwi (15)\n" +
                "nodqkan (89)\n" +
                "qddbmn (72)\n" +
                "kiphte (353) -> kfiggar, rncuf\n" +
                "jyajecr (14)\n" +
                "clqwflm (17)\n" +
                "kkjen (36) -> rftaqhw, hxtejel\n" +
                "iokwnq (25)\n" +
                "yelgho (38) -> uiagqs, dzrflyr, tdfirdf\n" +
                "rgocso (41)\n" +
                "mdsywgy (70)\n" +
                "knhvwhl (298)\n" +
                "zpxuxph (399)\n" +
                "dhbxpw (19) -> itfnye, yghucrl, ekvkidl\n" +
                "rxeqfsj (24)\n" +
                "sjzapjt (85) -> opndzmu, ilexb, tqddro\n" +
                "nbybi (7) -> vwntogi, mhvzqc\n" +
                "bnkbyp (73) -> hagkc, arfsqdz, wbzmjq, eisjz\n" +
                "jezmn (40) -> nsmlghl, lakhmm\n" +
                "iwlxpz (18)\n" +
                "vjfsl (87) -> gccvp, wkble, ilshxl, jqywsxa\n" +
                "ztphu (983) -> picliob, wcblyq, ollvgn\n" +
                "euwfw (12)\n" +
                "rccvm (363) -> mutyu, kqltwau\n" +
                "hifms (54)\n" +
                "byldgs (79)\n" +
                "forycux (37)\n" +
                "xwwjzx (39)\n" +
                "qvqzuic (6)\n" +
                "uylrp (7179) -> apqwz, nsqaxp, yffumkx\n" +
                "jblzpyq (45)\n" +
                "peexz (96)\n" +
                "ldcaht (98)\n" +
                "wwggl (157) -> ssxpawm, brjzpkm, woionr\n" +
                "yyhkwha (179) -> yiehfd, jkqcelt, fuvikt\n" +
                "rjtdc (44)\n" +
                "wnwxs (83)\n" +
                "msigvaq (96)\n" +
                "ojrggba (69)\n" +
                "pvctv (3341) -> gkwamq, sattu\n" +
                "ctrdahm (24)\n" +
                "xfvhi (283) -> zkphtd, qmncedz, lsdkm, iokwnq\n" +
                "gkrtbv (30)\n" +
                "aovhss (185) -> wevhizp, lmnews\n" +
                "tfpbait (45)\n" +
                "mkeen (102) -> jttgtsg, phkcge, zxyrq, telnuq\n" +
                "efbrhl (31)\n" +
                "wjkalv (54) -> eloku, xwwjzx, etyja, vghvcv\n" +
                "ndois (317) -> csuoxe, jwboky\n" +
                "vfpwu (712) -> tusmlk, vewathl, jxfbflh, lcefyg, bnkbyp\n" +
                "zdkgm (13) -> xpkyf, eaqhut\n" +
                "rhpxizt (449) -> lcnqmai, cpjkn, ccfbpoc\n" +
                "dmhfz (66) -> ojrui, bkuazfi, yedrd\n" +
                "bpbwn (97)\n" +
                "cdglv (1515) -> pbimnll, rcyjnsi, sfnsx, hfdoqqt\n" +
                "kfcaozk (27)\n" +
                "lqjnh (38)\n" +
                "qhjui (47)\n" +
                "ntzbt (42)\n" +
                "atfjks (91)\n" +
                "kfiggar (24)\n" +
                "qeoyu (42) -> liukun, tdvorom, knhvwhl, ombds\n" +
                "tlnuq (76)\n" +
                "zpedug (76)\n" +
                "arrok (230) -> ypokgio, qonkb\n" +
                "wvvmksv (21)\n" +
                "scxkq (33)\n" +
                "iuuzow (117) -> unlwjj, ayfcyul\n" +
                "bkuazfi (55)\n" +
                "hrkhlaq (66) -> mwavu, jbtqs\n" +
                "nbtsze (80)\n" +
                "darmn (96)\n" +
                "kaugsh (378) -> fhzkakn, epdzg, ogsxfk, rzoojpm, dabvuui\n" +
                "elhxdco (220) -> wmmrhf, tcxkqku\n" +
                "mgnux (46)\n" +
                "yzhwurz (136) -> pksyw, osrkwa\n" +
                "muulq (86)\n" +
                "ayfcyul (43)\n" +
                "uryery (39)\n" +
                "xipivez (33)\n" +
                "ubsbx (33)\n" +
                "tcxkqku (21)\n" +
                "dhqjni (17)\n" +
                "nokkziw (73)\n" +
                "yzjiby (79) -> numbey, jqtxjrm, ybkdekt, ciwpis, smkqg\n" +
                "ybjghed (91)\n" +
                "axleb (81)\n" +
                "jfoztzy (37)\n" +
                "rjoszhu (92)\n" +
                "vimazqc (93)\n" +
                "svhcnju (24)\n" +
                "mwssex (55)\n" +
                "wfmmajk (177) -> kfcaozk, pmfbr\n" +
                "hxjopp (228) -> nsckvp, cadtows\n" +
                "bieswf (51)\n" +
                "dabvuui (38) -> nxmxgax, xmtosc, chfcnsc\n" +
                "apqan (38)\n" +
                "livac (240)\n" +
                "kcotwhf (1006) -> jbztwms, pfpmube, bgeec, hhawhzk\n" +
                "mxdxz (44)\n" +
                "hhosv (40) -> klnemf, vrzsj, bacazl, gzepcax, onqop, afkeosv, zvlafea\n" +
                "eytppcy (309) -> ltifq, ehxjsgn\n" +
                "kyzjusc (37)\n" +
                "gmsmnlz (36)\n" +
                "mncyztp (1990) -> fsmzfjp, kndrzyc, svvirl\n" +
                "bnkfzle (261) -> bvqhn, edihrrv\n" +
                "jakfuqo (317) -> sxfxnp, tdrdp\n" +
                "uxqiqg (95) -> xwyggz, oxtvu, zwtaqj, cxvse\n" +
                "tftwygl (29)\n" +
                "ytaus (47)\n" +
                "uxxtnll (81)\n" +
                "yghucrl (66)\n" +
                "tnxoqxw (93)\n" +
                "emkyoy (354) -> rddeecm, dugvnav\n" +
                "hmorsv (64)\n" +
                "jwidjq (217) -> qfyor, bpsyylv\n" +
                "keily (231) -> ueywo, xlpqnhm\n" +
                "umiohmp (15)\n" +
                "kiuayw (24)\n" +
                "enuzo (63)\n" +
                "noejr (83)\n" +
                "tveyfha (86)\n" +
                "ohmvcr (98)\n" +
                "xfzxw (67)\n" +
                "modakko (69)\n" +
                "cwemvgf (85) -> iebsger, mtoqh, ciabx, puzwwgx\n" +
                "wmmrhf (21)\n" +
                "vxghl (48) -> umgqr, cbvwcv\n" +
                "cnvghq (33) -> byiqom, ehljn\n" +
                "iemkgdl (79)\n" +
                "gpucfv (270) -> bscob, leyohju\n" +
                "mlydcn (69)\n" +
                "gsgexgb (90) -> cwemvgf, cukbzsw, iaiqz, gveadp, rccvm\n" +
                "iybrmf (27)\n" +
                "frruz (7530) -> pkrxt, ifwkgxo, abpry, dydso, fjjuj, sgfbfq\n" +
                "xxvlxs (37)\n" +
                "uqttm (33)\n" +
                "eryxwj (90) -> vxtwg, bmtjkw\n" +
                "bsdxw (29)\n" +
                "ffxkad (91)\n" +
                "ciwpis (1215) -> elhxdco, ccmod, etuteik, jaxkva\n" +
                "zzxzeuo (62)\n" +
                "qycoh (66)\n" +
                "suprw (34) -> vpbdpfm, kacamw, dwdczlx, mrqaryt, rjnzfa\n" +
                "efpvvp (7686) -> mncyztp, tleviy, uuftjqx, vsjhe, mmutg, wzvjkiu\n" +
                "bpsyylv (17)\n" +
                "thmnm (80)\n" +
                "rvpbx (256) -> zwxlf, ojrggba\n" +
                "ndegtj (83)\n" +
                "ksasli (331) -> cyxtnfe, xrtkqi\n" +
                "vyfbsgv (81) -> rwxfhk, kihifp, ndois, kupmpp, eytppcy, bnkfzle, fycnyn\n" +
                "kjyufi (37)\n" +
                "ykxkv (299) -> ijzgy, dsbxavd\n" +
                "wnfcsap (32)\n" +
                "icoti (69)\n" +
                "akowch (67)\n" +
                "xlpqnhm (59)\n" +
                "yzrfzv (73)\n" +
                "jmmbca (91)\n" +
                "mfacoz (23)\n" +
                "bcgqdc (77)\n" +
                "ohbfa (79)\n" +
                "numbey (1861) -> lwqscns, arlrk, klqvgm\n" +
                "kfgyus (42)\n" +
                "dlfay (16) -> zksnaz, miocbjk\n" +
                "dwdczlx (162) -> cmdcov, pbhsevc\n" +
                "liiwwfa (22)\n" +
                "ikrlxqw (42)\n" +
                "fwbang (99684) -> lvxnl, aspplbw, uylrp, yzjiby\n" +
                "ryzfgj (44) -> lrbozkj, mpjrzt\n" +
                "zrjtxfa (9314) -> iixjr, vfpwu, ivygtzl, vgwfukr\n" +
                "mkxatmb (91)\n" +
                "zxmsme (66) -> lgjbhwy, jugycbw, dnzll\n" +
                "hxtejel (87)\n" +
                "rsblo (385)\n" +
                "rqbgxlt (24)\n" +
                "rbbhhe (91)\n" +
                "kcbag (36)\n" +
                "fdorzyx (49)\n" +
                "lcnqmai (12)\n" +
                "dvpmg (1474) -> uagszs, otqufza, mjmpkq\n" +
                "lakhmm (99)\n" +
                "zxyrq (18)\n" +
                "fthgkl (55) -> ekuibos, zmtszz, peexz\n" +
                "onqop (60) -> bnryi, kjyufi, kyzjusc, elukq\n" +
                "tismupk (86)\n" +
                "hhrqbn (75)\n" +
                "cycky (75)\n" +
                "xksjes (103)\n" +
                "ufhjnc (106) -> rbbhhe, ybjghed\n" +
                "aqkclfk (88) -> nodqkan, tahov\n" +
                "fuehgn (175) -> dnliq, dhqjni, ruszodn, cjagg\n" +
                "afkeosv (181) -> qfwtxzq, aowuj, trkvrk\n" +
                "brdkwc (45)\n" +
                "yedrd (55)\n" +
                "wyeoaxt (104) -> inlzx, akowch\n" +
                "owfrl (1516) -> rsblo, hfytix, ggwwhvf, ykxkv\n" +
                "gosjs (24)\n" +
                "mxsacj (22)\n" +
                "osrkwa (32)\n" +
                "drffb (15)\n" +
                "zsucroj (76)\n" +
                "ermgcbt (78)\n" +
                "jpjehc (37)\n" +
                "vdnvw (58)\n" +
                "holcy (66) -> frruz, hbzxaji, mhbiyxk, zrjtxfa, efpvvp, acmrndk, trrkrqa\n" +
                "gjbijgl (64)\n" +
                "lphqgek (21) -> qdpnoic, qvjiwvb, qxoly\n" +
                "uhsdpj (72) -> rslnx, bmaoav\n" +
                "akxrge (70)\n" +
                "yerckb (255) -> dpgggti, ssysjwe\n" +
                "eipaxu (150) -> qlmbqwi, fsuglk\n" +
                "pbhsevc (39)\n" +
                "pfmordc (36)\n" +
                "rdjfp (1393) -> dmhfz, wfmmajk, utoogeb\n" +
                "tpbbd (91)\n" +
                "dexwo (223) -> fqjdoe, ovpyq\n" +
                "hwinqpr (27)\n" +
                "mqgmc (150) -> vkoor, hvdwvo\n" +
                "qrhweil (99)\n" +
                "krdsv (24)\n" +
                "dydso (1002) -> evbilqr, glbaxl, yzhwurz, usubx, uxxyr, gremk\n" +
                "wowirye (47)\n" +
                "eaqhut (70)\n" +
                "ilshxl (74)\n" +
                "yqsfolo (11) -> vrdrc, utqxez\n" +
                "qniem (85) -> qdnuduv, zsseyik, xxardqs, xafip, uhsdpj, xxehapc, pmwosk\n" +
                "ojbyg (21)\n" +
                "vkwcj (96)\n" +
                "rtvpznv (257) -> emxviup, dfwamci, pfmordc, ikcjmxi\n" +
                "abpry (1005) -> uxqiqg, adxplm, xlbjv\n" +
                "nhtetdw (29)\n" +
                "zstbuv (60)\n" +
                "zmtszz (96)\n" +
                "nfccf (26) -> zpqpd, skbxo, hzkvyoj, fhivbs\n" +
                "krkeek (52)\n" +
                "owgbqb (30)\n" +
                "tekug (77)\n" +
                "jaxkva (138) -> zzxzeuo, npxeql\n" +
                "hqqxg (43)\n" +
                "ungfmbw (61)\n" +
                "edpqtnn (96)\n" +
                "ydyvay (70)\n" +
                "niopwq (42)\n" +
                "jgpsybl (317) -> ppkpq, fezoee\n" +
                "oyypq (142) -> iwxgwc, qyovvxb\n" +
                "inlzx (67)\n" +
                "edihrrv (82)\n" +
                "qsloy (44)\n" +
                "yffumkx (9) -> jakfuqo, ouxsgm, keily, pshyy\n" +
                "fhivbs (92)\n" +
                "fkprhv (31)\n" +
                "rhgyz (38)\n" +
                "eiyxgk (76)\n" +
                "pzemz (76)\n" +
                "lcefyg (353) -> twvjddq, rhgyz\n" +
                "vrpyfgm (88)\n" +
                "hfytix (81) -> cjctf, fckcu, ztcqm, pzemz\n" +
                "voiqnou (147) -> czmmh, rjtdc\n" +
                "ozwdh (96)\n" +
                "ekhsrgq (25)\n" +
                "xmtosc (70)\n" +
                "yfrewb (77)\n" +
                "qfyor (17)\n" +
                "ijuod (93) -> ldcaht, ruuhrmf, dfbabey, bbdfr\n" +
                "pknpuej (91) -> livac, vxghl, qcccxc, mxprsl\n" +
                "gwvsbo (76)\n" +
                "fqjdoe (39)\n" +
                "gqahoa (57)\n" +
                "vykav (89) -> dfhtf, yopex, ypzxdhs\n" +
                "picliob (97) -> bzenp, jfoztzy\n" +
                "fhzkakn (107) -> wowirye, aseilg, jmutqq\n" +
                "umgqr (96)\n" +
                "qmlguo (96)\n" +
                "gosak (27)\n" +
                "nvatz (63)\n" +
                "zsgnve (39)\n" +
                "fyvjfxi (58)\n" +
                "oxtvu (76)\n" +
                "hoewyjx (47)\n" +
                "qykdedu (63)\n" +
                "tocrk (88) -> nzyls, qlgljuh\n" +
                "ssnoqt (24)\n" +
                "mhvzqc (64)\n" +
                "arfsqdz (89)\n" +
                "vrzsj (127) -> tetfdv, ornacig, yrdbx\n" +
                "tszune (40)\n" +
                "jcuhfsd (80) -> sordz, zmfhyr\n" +
                "dqaov (96)\n" +
                "jeafpic (32)\n" +
                "tdvorom (246) -> hfzvg, dapey\n" +
                "dldcoc (149) -> gwvsbo, eadjn\n" +
                "ngxtfx (91)\n" +
                "oiooued (60)\n" +
                "nmhmw (979) -> krdsv, kiuayw, rovftl\n" +
                "yqmbbyr (24)\n" +
                "zvlafea (140) -> wtjoxu, dxszgsr\n" +
                "uiagqs (62)\n" +
                "lhpjahj (86)\n" +
                "uagszs (36) -> cflribm, dsukkg\n" +
                "umqlwls (202)\n" +
                "pazby (45)\n" +
                "mqayze (55)\n" +
                "nzeqmqi (12216) -> nmhmw, pknpuej, rfkvap\n" +
                "hfdoqqt (128) -> sevcqp, bieswf\n" +
                "ejmfnnu (43)\n" +
                "hupmm (76)\n" +
                "wnahs (18)\n" +
                "oomve (87)\n" +
                "hdfsofm (75)\n" +
                "qonkb (14)\n" +
                "cnlny (278)\n" +
                "ogsxfk (140) -> iybrmf, xixiloi, hwinqpr, jdmrbxc\n" +
                "nafdo (23)\n" +
                "jsizfuj (42)\n" +
                "mwavu (86)\n" +
                "ciabx (96)\n" +
                "ljwcd (16) -> nokkziw, cjgpfb, yzrfzv\n" +
                "etyja (39)\n" +
                "hcrzxz (78)\n" +
                "xwyyfr (256) -> jyajecr, jivdw\n" +
                "lrbozkj (53)\n" +
                "oibnbf (15)\n" +
                "bbdfr (98)\n" +
                "zwzgp (14)\n" +
                "svvirl (62)\n" +
                "tlkrx (23)\n" +
                "kndrzyc (62)\n" +
                "euenhl (53)\n" +
                "ipvrlll (86)\n" +
                "ggwwhvf (160) -> hhrqbn, zvazn, hdfsofm\n" +
                "sofrg (281)\n" +
                "jyovf (29)\n" +
                "agobkww (69)\n" +
                "gzepcax (50) -> wpojcme, pprspr\n" +
                "cxvse (76)\n" +
                "rftaqhw (87)\n" +
                "yzbmyaw (86)\n" +
                "jjbmtij (54)\n" +
                "whuozum (35) -> suftfkn, gtxvgr, igxdio\n" +
                "jxfbflh (229) -> xkyocjn, ahvdop, ewlsf, jejwwxj\n" +
                "woionr (15)\n" +
                "pkgyjn (76) -> urpzfa, fyvjfxi\n" +
                "pwydnik (63)\n" +
                "chhli (46)\n" +
                "gdvcou (189) -> jdglmn, mgnux\n" +
                "cbvwcv (96)\n" +
                "gtiqar (29)\n" +
                "txcwm (29)\n" +
                "fvojv (116) -> rycpngd, hifms\n" +
                "dzxjy (96)\n" +
                "niznnko (44)\n" +
                "jmutqq (47)\n" +
                "sevcqp (51)\n" +
                "pmfbr (27)\n" +
                "shoxg (7)\n" +
                "ltfbsgc (109) -> rvdldy, qhjui\n" +
                "ltifq (58)\n" +
                "jxzyg (37)\n" +
                "jttgtsg (18)\n" +
                "zwtaqj (76)\n" +
                "mwussz (143) -> etotvx, lbmvl, xlavrvm, rmriv\n" +
                "zwlok (143) -> zvtgd, shoxg\n" +
                "hcywj (102) -> brdkwc, tfpbait\n" +
                "kbuslbp (81)\n" +
                "smunvi (172) -> zqxhle, euenhl\n" +
                "qlgljuh (26)\n" +
                "gwcqtcr (73)\n" +
                "kacamw (170) -> bexrple, wetutqh\n" +
                "dvkbqm (20)\n" +
                "eaerpmi (1342) -> rjoszhu, migwxez, izydgv\n" +
                "ealilsq (50)\n" +
                "eisjz (89)\n" +
                "rihil (12)\n" +
                "ysabu (24)\n" +
                "ombds (178) -> wlrihpy, vwktc\n" +
                "sueftvh (81)\n" +
                "mrqaryt (80) -> thmnm, kligtj\n" +
                "xkyocjn (50)\n" +
                "prywl (43)\n" +
                "fonky (47)\n" +
                "bhddwe (64)\n" +
                "mtoqh (96)\n" +
                "pksyw (32)\n" +
                "jndnfa (45)\n" +
                "guqul (222) -> oonfc, irpjsbf\n" +
                "nkuhc (52)\n" +
                "apqwz (934) -> gjvcdp, fnuzrye, zwlok\n" +
                "ojrui (55)\n" +
                "tckql (20)\n" +
                "umsilqj (32)\n" +
                "xswwe (212) -> ffxkad, ngxtfx\n" +
                "hwtztim (187) -> idaqt, jshekxk\n" +
                "nuzxo (83)\n" +
                "itfnye (66)\n" +
                "qcedbm (2484) -> bkipqaq, xmcqygt, fvtofr, zjksxbk\n" +
                "jutbah (55)\n" +
                "scntyh (5)\n" +
                "liukun (70) -> oftcgd, eiyxgk, sqbfin\n" +
                "vqxwlkh (8119) -> kcotwhf, ksnnnc, shbrz, jtxdihn, yixpr\n" +
                "ywqtog (136) -> epelgzz, lpvwee\n" +
                "oftcgd (76)\n" +
                "rdzvcb (184) -> clqwflm, dhamym, qkmkjm\n" +
                "tqjyoj (94)\n" +
                "pprdw (42) -> tpbbd, mkxatmb\n" +
                "bgmypwk (22)\n" +
                "hznriv (96)\n" +
                "tleviy (973) -> rtvpznv, gbpxwcx, kiphte\n" +
                "csuoxe (54)\n" +
                "pqqcnkr (39)\n" +
                "hcqrrju (100) -> xfzxw, zwyhf\n" +
                "amccpoz (254) -> zsaen, jfkvg\n" +
                "wbzmjq (89)\n" +
                "xpkyf (70)\n" +
                "hnofc (85)\n" +
                "dsukkg (84)\n" +
                "qfifp (6)\n" +
                "qmncedz (25)\n" +
                "dyrik (37)\n" +
                "iaiqz (445) -> sgjywom, alwbi\n" +
                "xpjzc (86) -> qrhweil, vsgqkho\n" +
                "agagr (81)\n" +
                "fpkktd (25)\n" +
                "mjmpkq (44) -> nbtsze, hwlgay\n" +
                "kwhtsv (26)\n" +
                "awljibm (5)\n" +
                "hssykro (81)\n" +
                "vyccl (80) -> aamghal, tkwmbxl\n" +
                "nelgvnr (2052) -> jwidjq, mwussz, nkuwwiy, opghigg\n" +
                "zbhioc (20)\n" +
                "zqgeod (1323) -> sbnod, rtxzoap, zdkgm\n" +
                "rgqjtw (243)\n" +
                "vaxouij (343)\n" +
                "jsrpud (57)\n" +
                "wetutqh (35)\n" +
                "lsdkm (25)\n" +
                "sdttg (27)\n" +
                "arlrk (40) -> xlsmzu, hoewyjx\n" +
                "ybkdekt (1234) -> vaxouij, fthgkl, kabjov\n" +
                "sebno (279) -> qfifp, ghxvqb, qvqzuic, wfazzy\n" +
                "keidsd (73) -> hqqxg, ejmfnnu, prywl\n" +
                "uevcnw (39)\n" +
                "zvazn (75)\n" +
                "xdjola (63)\n" +
                "miocbjk (75)\n" +
                "ghxvqb (6)\n" +
                "ywtywz (38)\n" +
                "vtpoo (89) -> vskibye, nelgvnr, qcedbm, owfrl, vyfbsgv\n" +
                "jlfukd (57) -> tnxoqxw, vimazqc\n" +
                "vkxyhk (41)\n" +
                "dlxcy (203)\n" +
                "kosbvn (19)\n" +
                "wfazzy (6)\n" +
                "uufonho (46)\n" +
                "kdwmlx (357)\n" +
                "lokmiua (2132) -> hdrab, eftrvo, hbnnhyi, avnxndg, tihzzf, nbvtfz, qniem\n" +
                "dugvnav (46)\n" +
                "xxardqs (216) -> llyhqfe, ojbyg\n" +
                "wkble (74)\n" +
                "lpvwee (67)\n" +
                "pkrxt (1524) -> drwpdaj, ojcinc, hqetmky\n" +
                "zjksxbk (143)\n" +
                "iebsger (96)\n" +
                "ofwijoe (60)\n" +
                "qyovvxb (41)\n" +
                "igxdio (58)\n" +
                "xkzrkzh (148) -> nafdo, tlkrx, gclbhxw\n" +
                "ruszodn (17)\n" +
                "dnliq (17)\n" +
                "qcccxc (114) -> ibiuha, byykf\n" +
                "bscob (28)\n" +
                "mivrqpc (86)\n" +
                "yiehfd (35)\n" +
                "hbnnhyi (1055) -> ptnjpp, hqcxvkr, aqlvute, yqsfolo\n" +
                "jpexkf (86)\n" +
                "hagkc (89)\n" +
                "hlscl (214) -> jblzpyq, jndnfa, twvfw, pazby\n" +
                "irrca (56)\n" +
                "sgjywom (12)\n" +
                "epdzg (248)\n" +
                "yixpr (1141) -> pjlhta, xksjes, icfxlu\n" +
                "yjtsmy (85)\n" +
                "inwmb (53046) -> ghaxmrh, vqxwlkh, nzeqmqi, lokmiua, znypga, vtpoo\n" +
                "etuteik (262)\n" +
                "wbtqez (87)\n" +
                "lmnews (26)\n" +
                "zoovdc (75)\n" +
                "smkqg (44) -> vyzukfk, nfeok, apjsu, vbjlbhq, wjdkcjo, ztstgc, olvxzb\n" +
                "telnuq (18)\n" +
                "jdmrbxc (27)\n" +
                "rrsxb (91)\n" +
                "tetfdv (27)\n" +
                "cpjkn (12)\n" +
                "gveadp (429) -> zbhioc, psqgnhx\n" +
                "zxvjkqv (94)\n" +
                "mmvszx (12)\n" +
                "xkfwmh (38)\n" +
                "vyzukfk (255) -> efbrhl, tqdfypr\n" +
                "gbpxwcx (77) -> azkpaf, axleb, ngwafk, sueftvh\n" +
                "blcnplx (32)\n" +
                "trkvrk (9)\n" +
                "nxttce (52)\n" +
                "rzoojpm (234) -> kbguoiu, yvjjec\n" +
                "idhjov (49) -> mcctaf, jpjehc\n" +
                "ctnucjw (105) -> ohmvcr, ntzuhe\n" +
                "tdrdp (16)\n" +
                "qkmkjm (17)\n" +
                "bacazl (82) -> enuzo, hmlil\n" +
                "lgjbhwy (23)\n" +
                "etotvx (27)\n" +
                "pfkbcg (228) -> xkvtxav, oibnbf\n" +
                "fjlqp (30)\n" +
                "nsbyncu (58)\n" +
                "xnackkp (33)\n" +
                "sxfxnp (16)\n" +
                "hhawhzk (89) -> dserbhu, ckfagrp\n" +
                "dsbxavd (43)\n" +
                "mtbszl (12)\n" +
                "bkipqaq (71) -> ctrdahm, sptjz, svhcnju\n" +
                "sndkiv (73)\n" +
                "idaqt (42)\n" +
                "sxcfr (98) -> ungfmbw, ynjccf, bytizsx\n" +
                "gtutcoq (154) -> zqmizps, vxdcv, nmshjlp\n" +
                "efxxl (69)\n" +
                "npxeql (62)\n" +
                "ljelubc (437) -> gwxgtm, umfqiru\n" +
                "hzbtbe (46)\n" +
                "bjvncf (49)\n" +
                "hwxxvlb (48) -> qddbmn, vomiow\n" +
                "sfteyu (19)\n" +
                "sbhfnav (255) -> jeafpic, ywecj, wnfcsap, cvgzkp\n" +
                "bmaoav (93)\n" +
                "fnuzrye (125) -> vlqcuq, jdvuj, mykvbt, fpuhllh\n" +
                "vsgqkho (99)\n" +
                "vkbgz (63)\n" +
                "rcyjnsi (206) -> rihil, usfvqn\n" +
                "hdqgdm (86)\n" +
                "unaqbx (23)\n" +
                "umyrtu (33)\n" +
                "sordz (47)\n" +
                "byykf (63)\n" +
                "qggexrc (33)\n" +
                "rovftl (24)\n" +
                "qdnuduv (120) -> icoti, efxxl\n" +
                "qogmb (81) -> rnyqcj, hcrzxz\n" +
                "dfbabey (98)\n" +
                "vdmkp (38)\n" +
                "kacpu (90) -> hrbfs, vdmkp\n" +
                "jcegjy (92) -> xoaxcg, mecsrr\n" +
                "xrtkqi (13)\n" +
                "cosllh (38) -> hzfwp, gjbijgl\n" +
                "jfkvg (15)\n" +
                "ifwkgxo (1752) -> pbrcoyl, ryzfgj, luswq\n" +
                "grcsr (64)\n" +
                "dzrflyr (62)\n" +
                "hjtwqe (748) -> mkeen, zowbv, lphqgek, jcuhfsd, qymfgaf\n" +
                "yjqgw (71)\n" +
                "idiorl (24)\n" +
                "usvzfi (81)\n" +
                "acmrndk (13437) -> cdglv, gsgexgb, fmwid\n" +
                "vijilqr (271)\n" +
                "dxszgsr (34)\n" +
                "ehljn (88)\n" +
                "yutfxcu (72) -> wobno, mwmfw\n" +
                "ngwafk (81)\n" +
                "eijlg (51) -> dzxjy, msigvaq\n" +
                "pkchh (24)\n" +
                "izydgv (56) -> odoni, wnahs\n" +
                "wobno (93)\n" +
                "idfxtqr (96)\n" +
                "hqetmky (127) -> gwplv, umyrtu, uqttm\n" +
                "fvjrau (166) -> qsloy, niznnko\n" +
                "ehxjsgn (58)\n" +
                "hqcxvkr (37) -> oeyrk, ipvrlll\n" +
                "vaztjkc (75)\n" +
                "ynnfzdz (54)\n" +
                "vrdrc (99)\n" +
                "hdrtnjm (273) -> drffb, sviwi\n" +
                "ywecj (32)\n" +
                "iixjr (99) -> hlscl, xswwe, gtutcoq, qizkjh, nfccf, rvpbx, extmwcb\n" +
                "fuvikt (35)\n" +
                "kipiwwk (67)\n" +
                "lakzkpk (84) -> rpmzw, lfapaod\n" +
                "extmwcb (142) -> vkcim, ihramd, kwkdq, hjwjw\n" +
                "pmwosk (118) -> leefit, mdsywgy\n" +
                "ruuhrmf (98)\n" +
                "tqdfypr (31)\n" +
                "itdxbrj (366) -> fjebkm, mfacoz, unaqbx\n" +
                "kfgmuj (54) -> ljelubc, jlewu, rhpxizt, pjujpa, ijuod, xauyij, bbrdet\n" +
                "jtxdihn (45) -> sofrg, vgdtk, sxcfr, rmivzpg, gdvcou\n" +
                "yzulmo (33)\n" +
                "uuamcdc (1954) -> qycoh, jhbov\n" +
                "ochjr (68) -> xhujxe, fonky, olyohzo\n" +
                "nbvtfz (807) -> hwtztim, yerckb, nyszg, vijilqr\n" +
                "imtvzmm (40)\n" +
                "tshcqcu (33)\n" +
                "ovsgve (83)\n" +
                "ueywo (59)\n" +
                "gxmqlu (19)\n" +
                "tahov (89)\n" +
                "elukq (37)\n" +
                "zadsb (87)\n" +
                "bgeec (53) -> tftwygl, txcwm\n" +
                "yjpzyzx (58)\n" +
                "xlbjv (288) -> jxzyg, dyrik, cdanu\n" +
                "zsaen (15)\n" +
                "qywtwbt (124) -> esmltj, qsppfv\n" +
                "dwbirs (5)\n" +
                "oonfc (16)\n" +
                "pyurvrc (49) -> xwidhe, xxvlxs\n" +
                "zksnaz (75)\n" +
                "xhujxe (47)\n" +
                "wctphrv (19)\n" +
                "otadcxu (2028) -> bsdxw, beknji\n" +
                "hzkvyoj (92)\n" +
                "zeauj (15)\n" +
                "zayxe (2822) -> ochjr, cnvghq, whuozum\n" +
                "aqlvute (27) -> absogx, jmmbca\n" +
                "ilexb (72)\n" +
                "vrdtrmn (69)\n" +
                "dfhtf (79)\n" +
                "sbnod (153)\n" +
                "lwyirb (77)\n" +
                "hwlgay (80)\n" +
                "sfnapsi (55)\n" +
                "cflribm (84)\n" +
                "cjgpfb (73)\n" +
                "menyi (185) -> lhpjahj, yzbmyaw\n" +
                "ubkmjag (78)\n" +
                "fycnyn (313) -> lwuvg, irrca\n" +
                "rzixiwv (10)\n" +
                "qtvcuqk (85)\n" +
                "alwbi (12)\n" +
                "sqbfin (76)\n" +
                "hcvuc (78) -> yzulmo, xnackkp, qggexrc, wjdhaf\n" +
                "ccmod (13) -> ovsgve, noejr, nuzxo\n" +
                "rslnx (93)\n" +
                "opndzmu (72)\n" +
                "mxprsl (84) -> uivazm, ennkek, krkeek\n" +
                "zowbv (28) -> sndkiv, gwcqtcr\n" +
                "pjujpa (433) -> rgyaijv, kwhtsv\n" +
                "rnyqcj (78)\n" +
                "zwxlf (69)\n" +
                "ccfiz (231) -> pwydnik, vkbgz\n" +
                "zqyrggw (61) -> qqbgbeo, ubkmjag\n" +
                "puzwwgx (96)\n" +
                "xwidhe (37)\n" +
                "asmikyo (24)\n" +
                "hdrab (1083) -> umqlwls, tuldcdj, keidsd, wwggl\n" +
                "ximzx (146) -> ywqtog, bejkc, vonve, wmdgia, ggeae\n" +
                "hzfwp (64)\n" +
                "wmdgia (14) -> bhddwe, zrzgp, hmorsv, grcsr\n" +
                "pfpmube (73) -> wctphrv, kosbvn\n" +
                "eadjn (76)\n" +
                "txplq (24)\n" +
                "qsppfv (21)\n" +
                "qxoly (51)\n" +
                "sardhwu (77) -> iemkgdl, byldgs\n" +
                "vlqcuq (8)\n" +
                "eloku (39)\n" +
                "ypzxdhs (79)\n" +
                "fsmzfjp (62)\n" +
                "zqmizps (80)\n" +
                "qqpnt (1108) -> hxjopp, gpucfv, vykav\n" +
                "aowuj (9)\n" +
                "xlsmzu (47)\n" +
                "jokgw (33)\n" +
                "epelgzz (67)\n" +
                "cjctf (76)\n" +
                "qgqrmeu (70)\n" +
                "eulcspz (52)\n" +
                "sattu (54)\n" +
                "vgdtk (101) -> ggffqux, jlinuge, hvinb\n" +
                "brjzpkm (15)\n" +
                "yvlwtb (114) -> wbtqez, zadsb\n" +
                "ssysjwe (8)\n" +
                "ptnjpp (135) -> forycux, xggisxm\n" +
                "adxplm (295) -> nfxyjl, lksgoz\n" +
                "qvjiwvb (51)\n" +
                "lleaucw (94)\n" +
                "absogx (91)\n" +
                "zflsryn (239) -> fkprhv, blloue\n" +
                "inoyp (38)\n" +
                "luswq (102) -> yhlyk, mmvszx, euwfw, sbebrkf\n" +
                "rncuf (24)\n" +
                "jdntuc (96)\n" +
                "gremk (86) -> gqahoa, jsrpud\n" +
                "mutyu (53)\n" +
                "yhlyk (12)\n" +
                "ewlsf (50)\n" +
                "xixiloi (27)\n" +
                "woiwqf (5)\n" +
                "fckcu (76)\n" +
                "ddxiiha (16) -> bpbwn, uuxhyt\n" +
                "nmmrik (73) -> jutbah, sjwxyqb, mqayze\n" +
                "ssxpawm (15)\n" +
                "rksykyt (77) -> ohbfa, lfmlqs\n" +
                "zwyhf (67)\n" +
                "jhbov (66)\n" +
                "tqddro (72)\n" +
                "aafpxpx (30)\n" +
                "zsseyik (248) -> awljibm, woiwqf\n" +
                "vxdcv (80)\n" +
                "ovpyq (39)\n" +
                "znypga (14031) -> emkyoy, uskdpcu, ccmfbok\n" +
                "gwxgtm (24)\n" +
                "ztstgc (125) -> jqwbc, darmn\n" +
                "usubx (100) -> mzpeoz, ealilsq\n" +
                "klqvgm (56) -> zsgnve, pqqcnkr\n" +
                "uuxhyt (97)\n" +
                "yjxneui (76)\n" +
                "awylric (393) -> wvvmksv, epnvhbn\n" +
                "wtjoxu (34)\n" +
                "ztcqm (76)\n" +
                "wjdhaf (33)\n" +
                "hrase (25)\n" +
                "llcpsj (178) -> mwssex, sfnapsi\n" +
                "hrbfs (38)\n" +
                "vomiow (72)\n" +
                "uumrue (29)\n" +
                "xxyjm (71)\n" +
                "yrdbx (27)\n" +
                "dserbhu (11)\n" +
                "trrkrqa (48) -> awytebt, ocrgjl, zayxe, pvctv, sdovaq, kfgmuj\n" +
                "xoaxcg (81)\n" +
                "sdxwhvp (192) -> agagr, hssykro, kbuslbp\n" +
                "beqez (142) -> mtbszl, dytsvc\n" +
                "kihifp (117) -> tekug, lsxwznl, lwyirb, yfrewb\n" +
                "fwlyuh (70) -> zbmsz, btldlkh\n" +
                "cvgzkp (32)\n" +
                "migwxez (72) -> rzixiwv, bwekmvc\n" +
                "jqwbc (96)\n" +
                "ihramd (63)\n" +
                "bwekmvc (10)\n" +
                "oeyrk (86)\n" +
                "ccfbpoc (12)\n" +
                "bexrple (35)\n" +
                "rtxzoap (153)\n" +
                "bvwnlaw (88)\n" +
                "pbimnll (136) -> pkbitw, ytaus\n" +
                "zciuy (63)\n" +
                "zvtgd (7)\n" +
                "uuftjqx (1414) -> guqul, jcegjy, fvjrau\n" +
                "qymfgaf (66) -> gzatvf, sdttg, gosak, pcacjm\n" +
                "esbnpk (43)\n" +
                "ekuibos (96)\n" +
                "azyccec (67)\n" +
                "vghvcv (39)\n" +
                "icfxlu (31) -> asmikyo, gosjs, fafrerl\n" +
                "cmdcov (39)\n" +
                "rjnzfa (192) -> eidqfh, yqmbbyr\n" +
                "qxirdyg (121) -> mwhopi, jyovf, nhtetdw, tmvjt\n" +
                "wlrihpy (60)\n" +
                "nyszg (95) -> bvwnlaw, vrpyfgm\n" +
                "hiccoc (1118) -> osbsdhc, dlfay, fsomlm, cosllh\n" +
                "ixiqnn (138) -> vthnh, cycky\n" +
                "uahdbi (313) -> bgmypwk, rzxyny\n" +
                "ahpitb (25) -> yyoptv, qihhif\n" +
                "zrzgp (64)\n" +
                "xxehapc (120) -> vrdtrmn, agobkww\n" +
                "kwkdq (63)\n" +
                "prhgge (49)\n" +
                "ornacig (27)\n" +
                "wuttw (6)\n" +
                "sjbalvv (186) -> uufonho, chhli\n" +
                "xauyij (427) -> uumrue, gtiqar\n" +
                "thahonu (208) -> eacnma, fpkktd\n" +
                "vgwfukr (1921) -> hcqrrju, ckqwb, leqnli, xavfse\n" +
                "pshyy (97) -> qykdedu, zciuy, nvatz, xdjola\n" +
                "tkwmbxl (79)\n" +
                "phkcge (18)\n" +
                "szrnpdw (27)\n" +
                "fafrerl (24)\n" +
                "aryqw (118) -> ysabu, pkchh\n" +
                "twvfw (45)\n" +
                "yopex (79)\n" +
                "sptjz (24)\n" +
                "mwmfw (93)\n" +
                "suftfkn (58)\n" +
                "fjjuj (1782) -> fwlyuh, tocrk, eryxwj\n" +
                "jbztwms (111)\n" +
                "ollvgn (15) -> ermgcbt, kjikhxm\n" +
                "pcacjm (27)\n" +
                "nldrlb (55)\n" +
                "yyoptv (49)\n" +
                "qfwtxzq (9)\n" +
                "xavfse (42) -> hznriv, vkwcj\n" +
                "pbrcoyl (40) -> nldrlb, wnhseb\n" +
                "dytsvc (12)\n" +
                "wpafb (58)\n" +
                "aspplbw (4922) -> eaerpmi, hjtwqe, fikvmjg, kaugsh\n" +
                "mpwnd (57)\n" +
                "xmcqygt (65) -> uryery, tlkive\n" +
                "wevkksz (49)\n" +
                "ikcjmxi (36)\n" +
                "ojcinc (106) -> fjlqp, owgbqb, aafpxpx, gkrtbv\n" +
                "jbtqs (86)\n" +
                "lksgoz (52)\n" +
                "tntqpl (202) -> jdryrup, esbnpk\n" +
                "zpbbgqh (53) -> zpedug, hupmm, yjxneui, zldebh\n" +
                "rgylin (9)\n" +
                "jdglmn (46)\n" +
                "pkbitw (47)\n" +
                "rfxmk (20)\n" +
                "mykvbt (8)\n" +
                "twvjddq (38)\n" +
                "slmnzei (33)\n" +
                "zpqpd (92)\n" +
                "lvxnl (3990) -> qeoyu, uymhfo, suprw, ncxhv, drrbwlp, kzwamsk\n" +
                "fikvmjg (70) -> arrok, thahonu, pfkbcg, yutfxcu, shkfwm, clsve\n" +
                "ekvkidl (66)\n" +
                "iwxgwc (41)\n" +
                "cbwsr (55)\n" +
                "kqltwau (53)\n" +
                "jlewu (320) -> zphlpeu, kcxfwz, cbwsr\n" +
                "bnryi (37)\n" +
                "dletgs (77)\n" +
                "jlinuge (60)\n" +
                "ennkek (52)\n" +
                "rzxyny (22)\n" +
                "uivazm (52)\n" +
                "hgoesez (214) -> umsilqj, blcnplx\n" +
                "xkvtxav (15)\n" +
                "clsve (138) -> ofwijoe, zstbuv\n" +
                "leefit (70)\n" +
                "ymwqj (301)\n" +
                "klnemf (76) -> xipivez, tshcqcu, jaathmh, vpzylgj\n" +
                "qdpnoic (51)\n" +
                "fsuglk (58)\n" +
                "dvasofv (44)\n" +
                "cjagg (17)\n" +
                "kcxfwz (55)\n" +
                "kjikhxm (78)\n" +
                "nulxd (20)\n" +
                "zgyryw (60)\n" +
                "nktkgz (29)\n" +
                "pprspr (79)\n" +
                "wzvjkiu (2006) -> yjtsmy, gjpjta\n" +
                "usfvqn (12)\n" +
                "utoogeb (183) -> idiorl, txplq\n" +
                "gclbhxw (23)\n" +
                "fsomlm (74) -> hzbtbe, mkxsdn\n" +
                "pxjgtg (219) -> uevcnw, airqzst\n" +
                "nfxyjl (52)\n" +
                "htaxf (96)\n" +
                "ouxsgm (241) -> ynnfzdz, jjbmtij\n" +
                "cdanu (37)\n" +
                "zpohg (230) -> qewiy, iwlxpz\n" +
                "nmshjlp (80)\n" +
                "uxxyr (26) -> oomve, xzsfek\n" +
                "wcblyq (171)\n" +
                "qqbgbeo (78)\n" +
                "ibiuha (63)\n" +
                "ippnuw (342)\n" +
                "jusoe (27)\n" +
                "eftrvo (919) -> rgqjtw, fuehgn, eijlg, jlfukd\n" +
                "rgyaijv (26)\n" +
                "fezoee (41)\n" +
                "zmfhyr (47)\n" +
                "mxltn (14)\n" +
                "rfkvap (655) -> zxmsme, nbybi, xaaqdv\n" +
                "umfqiru (24)\n" +
                "syeyppr (20)\n" +
                "tuldcdj (152) -> ekhsrgq, hrase\n" +
                "skbxo (92)\n" +
                "lwuvg (56)\n" +
                "hzvctd (256) -> dwbirs, scntyh\n" +
                "cteuws (91)\n" +
                "gjpjta (85)\n" +
                "ijzgy (43)\n" +
                "rddeecm (46)\n" +
                "hvinb (60)\n" +
                "gsrui (49)\n" +
                "vxtwg (25)\n" +
                "vthnh (75)\n" +
                "olyohzo (47)\n" +
                "btldlkh (35)\n" +
                "lbmvl (27)\n" +
                "gjvcdp (23) -> azyccec, dqfti\n" +
                "spnzn (70) -> ixiqnn, llcpsj, ufhjnc, fzkqz, mqgmc, tntqpl, yvlwtb\n" +
                "fjebkm (23)\n" +
                "kupmpp (41) -> qmlguo, dqaov, ozwdh, idfxtqr\n" +
                "awytebt (2553) -> oyypq, pprdw, fvojv, yelgho\n" +
                "rycpngd (54)\n" +
                "vpzylgj (33)\n" +
                "osbsdhc (166)\n" +
                "bdplsy (20)\n" +
                "wnhseb (55)\n" +
                "emxviup (36)\n" +
                "azqje (72) -> holcy, fwbang, inwmb\n" +
                "blloue (31)\n" +
                "gccvp (74)\n" +
                "sfnsx (83) -> prhgge, bjvncf, wevkksz\n" +
                "nylej (42)\n" +
                "zkphtd (25)\n" +
                "drwpdaj (58) -> nylej, fkpjukc, niopwq, kfgyus\n" +
                "olvxzb (89) -> tlnuq, zsucroj, dnyaj\n" +
                "pjlhta (63) -> zupsoqc, dvkbqm\n" +
                "xafip (176) -> rgocso, vkxyhk\n" +
                "qihhif (49)\n" +
                "ggffqux (60)\n" +
                "bbrdet (445) -> bdplsy, syeyppr\n" +
                "vbjlbhq (219) -> gsrui, fdorzyx\n" +
                "mwhopi (29)\n" +
                "eacnma (25)\n" +
                "drrbwlp (59) -> ljwcd, voiqnou, rdzvcb, sardhwu, rksykyt\n" +
                "dapey (26)\n" +
                "rmivzpg (227) -> szrnpdw, jusoe\n" +
                "ckfagrp (11)\n" +
                "nkuwwiy (79) -> jpexkf, tismupk\n" +
                "jejwwxj (50)\n" +
                "cukbzsw (441) -> mxltn, zwzgp\n" +
                "eobbt (229) -> rxeqfsj, rqbgxlt, ssnoqt\n" +
                "ggeae (270)\n" +
                "xdfnmvr (147) -> vaztjkc, zoovdc\n" +
                "fmcwdv (85)\n" +
                "yvjjec (7)\n" +
                "kzwamsk (325) -> sebno, haeyms, hdrtnjm\n" +
                "hvdwvo (69)\n" +
                "bmtjkw (25)\n" +
                "rwxfhk (353) -> gmsmnlz, kcbag\n" +
                "ynjccf (61)\n" +
                "zxozp (42) -> hnofc, fmcwdv, qtvcuqk\n" +
                "xcuud (29)\n" +
                "xwyggz (76)\n" +
                "glbaxl (120) -> imtvzmm, tszune\n" +
                "unlwjj (43)\n" +
                "hjwjw (63)\n" +
                "jugycbw (23)\n" +
                "cyxtnfe (13)\n" +
                "phrkfo (81)\n" +
                "mmutg (1040) -> yyhkwha, xwyyfr, xpjzc, amccpoz\n" +
                "vntjo (81)\n" +
                "tlkive (39)\n" +
                "kbguoiu (7)\n" +
                "nsqaxp (575) -> kacpu, gxmyk, aryqw, qywtwbt, beqez\n" +
                "tmvjt (29)\n" +
                "vskibye (1388) -> sjbalvv, hgoesez, lfzvi, lakzkpk, smunvi, cnlny\n" +
                "sgfbfq (95) -> eobbt, ymwqj, sjzapjt, dldcoc, dexwo, ctnucjw, zflsryn\n" +
                "aseilg (47)\n" +
                "hbzxaji (6140) -> otadcxu, dvpmg, qqpnt, mnkamc, spnzn, uuamcdc, rdjfp\n" +
                "xlavrvm (27)\n" +
                "wevhizp (26)\n" +
                "yrmfcs (9)\n" +
                "nsmlghl (99)\n" +
                "sdovaq (2558) -> zxozp, pxjgtg, xdfnmvr\n" +
                "irpjsbf (16)\n" +
                "evbilqr (200)\n" +
                "avnxndg (865) -> ippnuw, ensyb, dosteiu\n" +
                "utqxez (99)\n" +
                "leyohju (28)\n" +
                "nzyls (26)\n" +
                "lsxwznl (77)\n" +
                "zphlpeu (55)\n" +
                "ckqwb (234)\n" +
                "kligtj (80)";
        setInputData(input);
        System.out.println("Result Day7(a): "+calculateA());
        System.out.println("Result Day7(b): "+calculateB());
    }
}
