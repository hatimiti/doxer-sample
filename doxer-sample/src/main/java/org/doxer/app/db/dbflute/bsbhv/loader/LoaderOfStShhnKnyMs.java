package org.doxer.app.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The referrer loader of ST_SHHN_KNY_MS as TABLE. <br>
 * <pre>
 * [primary key]
 *     ST_SHHN_KNY_MS_ID
 *
 * [column]
 *     ST_SHHN_KNY_MS_ID, ST_SHOHIN_KONYU_ID, SM_SHOHIN_ID, KONYU_SU, KONYU_UNIT_PRICE, KONYU_TAX, REG_USER_ID, REG_TM, REG_FUNC_CD, UPD_USER_ID, UPD_TM, UPD_FUNC_CD, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ST_SHHN_KNY_MS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     ST_SHOHIN_KONYU, SM_SHOHIN
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     stShohinKonyu, smShohin
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfStShhnKnyMs {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<StShhnKnyMs> _selectedList;
    protected BehaviorSelector _selector;
    protected StShhnKnyMsBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfStShhnKnyMs ready(List<StShhnKnyMs> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected StShhnKnyMsBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(StShhnKnyMsBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfStShohinKonyu _foreignStShohinKonyuLoader;
    public LoaderOfStShohinKonyu pulloutStShohinKonyu() {
        if (_foreignStShohinKonyuLoader == null)
        { _foreignStShohinKonyuLoader = new LoaderOfStShohinKonyu().ready(myBhv().pulloutStShohinKonyu(_selectedList), _selector); }
        return _foreignStShohinKonyuLoader;
    }

    protected LoaderOfSmShohin _foreignSmShohinLoader;
    public LoaderOfSmShohin pulloutSmShohin() {
        if (_foreignSmShohinLoader == null)
        { _foreignSmShohinLoader = new LoaderOfSmShohin().ready(myBhv().pulloutSmShohin(_selectedList), _selector); }
        return _foreignSmShohinLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<StShhnKnyMs> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
