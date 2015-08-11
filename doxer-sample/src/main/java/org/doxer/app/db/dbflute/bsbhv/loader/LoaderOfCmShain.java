package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The referrer loader of CM_SHAIN as TABLE. <br>
 * <pre>
 * [primary key]
 *     CM_SHAIN_ID
 *
 * [column]
 *     CM_SHAIN_ID, CM_KAISHA_ID, SHAIN_SEI, SHAIN_MEI, SHAIN_SEI_EN, SHAIN_MEI_EN, LOGIN_CD, PASSWORD, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CM_SHAIN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CM_KAISHA
 *
 * [referrer table]
 *     ST_SHOHIN_KONYU
 *
 * [foreign property]
 *     cmKaisha
 *
 * [referrer property]
 *     stShohinKonyuList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCmShain {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CmShain> _selectedList;
    protected BehaviorSelector _selector;
    protected CmShainBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCmShain ready(List<CmShain> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CmShainBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CmShainBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<StShohinKonyu> _referrerStShohinKonyu;

    /**
     * Load referrer of stShohinKonyuList by the set-upper of referrer. <br>
     * ST_SHOHIN_KONYU by KONYU_CM_SHAIN_ID, named 'stShohinKonyuList'.
     * <pre>
     * <span style="color: #0000C0">cmShainBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cmShainList</span>, <span style="color: #553000">shainLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shainLoader</span>.<span style="color: #CC4747">loadStShohinKonyu</span>(<span style="color: #553000">konyuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">konyuCB</span>.setupSelect...
     *         <span style="color: #553000">konyuCB</span>.query().set...
     *         <span style="color: #553000">konyuCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">konyuLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    konyuLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CmShain cmShain : <span style="color: #553000">cmShainList</span>) {
     *     ... = cmShain.<span style="color: #CC4747">getStShohinKonyuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setKonyuCmShainId_InScope(pkList);
     * cb.query().addOrderBy_KonyuCmShainId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfStShohinKonyu> loadStShohinKonyu(ReferrerConditionSetupper<StShohinKonyuCB> refCBLambda) {
        myBhv().loadStShohinKonyu(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerStShohinKonyu = refLs);
        return hd -> hd.handle(new LoaderOfStShohinKonyu().ready(_referrerStShohinKonyu, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCmKaisha _foreignCmKaishaLoader;
    public LoaderOfCmKaisha pulloutCmKaisha() {
        if (_foreignCmKaishaLoader == null)
        { _foreignCmKaishaLoader = new LoaderOfCmKaisha().ready(myBhv().pulloutCmKaisha(_selectedList), _selector); }
        return _foreignCmKaishaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CmShain> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
