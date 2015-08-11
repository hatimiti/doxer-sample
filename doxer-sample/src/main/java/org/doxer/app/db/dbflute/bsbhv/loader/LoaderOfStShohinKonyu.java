package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The referrer loader of ST_SHOHIN_KONYU as TABLE. <br>
 * <pre>
 * [primary key]
 *     ST_SHOHIN_KONYU_ID
 *
 * [column]
 *     ST_SHOHIN_KONYU_ID, KONYU_CM_SHAIN_ID, KONYU_YMD, KONYU_TM, KONYU_PRICE, KONYU_TAX, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ST_SHOHIN_KONYU_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CM_SHAIN
 *
 * [referrer table]
 *     ST_SHHN_KNY_MS
 *
 * [foreign property]
 *     cmShain
 *
 * [referrer property]
 *     stShhnKnyMsList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfStShohinKonyu {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<StShohinKonyu> _selectedList;
    protected BehaviorSelector _selector;
    protected StShohinKonyuBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfStShohinKonyu ready(List<StShohinKonyu> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected StShohinKonyuBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(StShohinKonyuBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<StShhnKnyMs> _referrerStShhnKnyMs;

    /**
     * Load referrer of stShhnKnyMsList by the set-upper of referrer. <br>
     * ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsList'.
     * <pre>
     * <span style="color: #0000C0">stShohinKonyuBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">stShohinKonyuList</span>, <span style="color: #553000">konyuLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">konyuLoader</span>.<span style="color: #CC4747">loadStShhnKnyMs</span>(<span style="color: #553000">msCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">msCB</span>.setupSelect...
     *         <span style="color: #553000">msCB</span>.query().set...
     *         <span style="color: #553000">msCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">msLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    msLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (StShohinKonyu stShohinKonyu : <span style="color: #553000">stShohinKonyuList</span>) {
     *     ... = stShohinKonyu.<span style="color: #CC4747">getStShhnKnyMsList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStShohinKonyuId_InScope(pkList);
     * cb.query().addOrderBy_StShohinKonyuId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfStShhnKnyMs> loadStShhnKnyMs(ReferrerConditionSetupper<StShhnKnyMsCB> refCBLambda) {
        myBhv().loadStShhnKnyMs(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerStShhnKnyMs = refLs);
        return hd -> hd.handle(new LoaderOfStShhnKnyMs().ready(_referrerStShhnKnyMs, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCmShain _foreignCmShainLoader;
    public LoaderOfCmShain pulloutCmShain() {
        if (_foreignCmShainLoader == null)
        { _foreignCmShainLoader = new LoaderOfCmShain().ready(myBhv().pulloutCmShain(_selectedList), _selector); }
        return _foreignCmShainLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<StShohinKonyu> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
