package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The referrer loader of SM_SHOHIN as TABLE. <br>
 * <pre>
 * [primary key]
 *     SM_SHOHIN_ID
 *
 * [column]
 *     SM_SHOHIN_ID, SHOHIN_NO, SHOHIN_MEI, SHOHIN_MEI_EN, SHOHIN_PRICE, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SM_SHOHIN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     ST_SHHN_KNY_MS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     stShhnKnyMsList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSmShohin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SmShohin> _selectedList;
    protected BehaviorSelector _selector;
    protected SmShohinBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSmShohin ready(List<SmShohin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SmShohinBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SmShohinBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<StShhnKnyMs> _referrerStShhnKnyMs;

    /**
     * Load referrer of stShhnKnyMsList by the set-upper of referrer. <br>
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'.
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">smShohinList</span>, <span style="color: #553000">shohinLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shohinLoader</span>.<span style="color: #CC4747">loadStShhnKnyMs</span>(<span style="color: #553000">msCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">msCB</span>.setupSelect...
     *         <span style="color: #553000">msCB</span>.query().set...
     *         <span style="color: #553000">msCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">msLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    msLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (SmShohin smShohin : <span style="color: #553000">smShohinList</span>) {
     *     ... = smShohin.<span style="color: #CC4747">getStShhnKnyMsList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSmShohinId_InScope(pkList);
     * cb.query().addOrderBy_SmShohinId_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SmShohin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
