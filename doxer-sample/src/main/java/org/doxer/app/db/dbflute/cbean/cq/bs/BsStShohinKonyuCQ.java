package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.doxer.app.db.dbflute.cbean.cq.ciq.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The base condition-query of ST_SHOHIN_KONYU.
 * @author DBFlute(AutoGenerator)
 */
public class BsStShohinKonyuCQ extends AbstractBsStShohinKonyuCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StShohinKonyuCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsStShohinKonyuCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ST_SHOHIN_KONYU) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public StShohinKonyuCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected StShohinKonyuCIQ xcreateCIQ() {
        StShohinKonyuCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected StShohinKonyuCIQ xnewCIQ() {
        return new StShohinKonyuCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ST_SHOHIN_KONYU on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public StShohinKonyuCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        StShohinKonyuCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stShohinKonyuId;
    public ConditionValue xdfgetStShohinKonyuId()
    { if (_stShohinKonyuId == null) { _stShohinKonyuId = nCV(); }
      return _stShohinKonyuId; }
    protected ConditionValue xgetCValueStShohinKonyuId() { return xdfgetStShohinKonyuId(); }

    public Map<String, StShhnKnyMsCQ> xdfgetStShohinKonyuId_ExistsReferrer_StShhnKnyMsList() { return xgetSQueMap("stShohinKonyuId_ExistsReferrer_StShhnKnyMsList"); }
    public String keepStShohinKonyuId_ExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("stShohinKonyuId_ExistsReferrer_StShhnKnyMsList", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetStShohinKonyuId_NotExistsReferrer_StShhnKnyMsList() { return xgetSQueMap("stShohinKonyuId_NotExistsReferrer_StShhnKnyMsList"); }
    public String keepStShohinKonyuId_NotExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("stShohinKonyuId_NotExistsReferrer_StShhnKnyMsList", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetStShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList() { return xgetSQueMap("stShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList"); }
    public String keepStShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("stShohinKonyuId_SpecifyDerivedReferrer_StShhnKnyMsList", sq); }

    public Map<String, StShhnKnyMsCQ> xdfgetStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList() { return xgetSQueMap("stShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList"); }
    public String keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq) { return xkeepSQue("stShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList", sq); }
    public Map<String, Object> xdfgetStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsListParameter() { return xgetSQuePmMap("stShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList"); }
    public String keepStShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsListParameter(Object pm) { return xkeepSQuePm("stShohinKonyuId_QueryDerivedReferrer_StShhnKnyMsList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_StShohinKonyuId_Asc() { regOBA("ST_SHOHIN_KONYU_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_StShohinKonyuId_Desc() { regOBD("ST_SHOHIN_KONYU_ID"); return this; }

    protected ConditionValue _konyuCmShainId;
    public ConditionValue xdfgetKonyuCmShainId()
    { if (_konyuCmShainId == null) { _konyuCmShainId = nCV(); }
      return _konyuCmShainId; }
    protected ConditionValue xgetCValueKonyuCmShainId() { return xdfgetKonyuCmShainId(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuCmShainId_Asc() { regOBA("KONYU_CM_SHAIN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuCmShainId_Desc() { regOBD("KONYU_CM_SHAIN_ID"); return this; }

    protected ConditionValue _konyuYmd;
    public ConditionValue xdfgetKonyuYmd()
    { if (_konyuYmd == null) { _konyuYmd = nCV(); }
      return _konyuYmd; }
    protected ConditionValue xgetCValueKonyuYmd() { return xdfgetKonyuYmd(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_YMD: {CHAR(8)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuYmd_Asc() { regOBA("KONYU_YMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_YMD: {CHAR(8)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuYmd_Desc() { regOBD("KONYU_YMD"); return this; }

    protected ConditionValue _konyuTm;
    public ConditionValue xdfgetKonyuTm()
    { if (_konyuTm == null) { _konyuTm = nCV(); }
      return _konyuTm; }
    protected ConditionValue xgetCValueKonyuTm() { return xdfgetKonyuTm(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_TM: {CHAR(4)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuTm_Asc() { regOBA("KONYU_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_TM: {CHAR(4)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuTm_Desc() { regOBD("KONYU_TM"); return this; }

    protected ConditionValue _konyuPrice;
    public ConditionValue xdfgetKonyuPrice()
    { if (_konyuPrice == null) { _konyuPrice = nCV(); }
      return _konyuPrice; }
    protected ConditionValue xgetCValueKonyuPrice() { return xdfgetKonyuPrice(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuPrice_Asc() { regOBA("KONYU_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuPrice_Desc() { regOBD("KONYU_PRICE"); return this; }

    protected ConditionValue _konyuTax;
    public ConditionValue xdfgetKonyuTax()
    { if (_konyuTax == null) { _konyuTax = nCV(); }
      return _konyuTax; }
    protected ConditionValue xgetCValueKonyuTax() { return xdfgetKonyuTax(); }

    /** 
     * Add order-by as ascend. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuTax_Asc() { regOBA("KONYU_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_KonyuTax_Desc() { regOBD("KONYU_TAX"); return this; }

    protected ConditionValue _regUserId;
    public ConditionValue xdfgetRegUserId()
    { if (_regUserId == null) { _regUserId = nCV(); }
      return _regUserId; }
    protected ConditionValue xgetCValueRegUserId() { return xdfgetRegUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_RegUserId_Asc() { regOBA("REG_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_RegUserId_Desc() { regOBD("REG_USER_ID"); return this; }

    protected ConditionValue _regTm;
    public ConditionValue xdfgetRegTm()
    { if (_regTm == null) { _regTm = nCV(); }
      return _regTm; }
    protected ConditionValue xgetCValueRegTm() { return xdfgetRegTm(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_RegTm_Asc() { regOBA("REG_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_RegTm_Desc() { regOBD("REG_TM"); return this; }

    protected ConditionValue _regFuncCd;
    public ConditionValue xdfgetRegFuncCd()
    { if (_regFuncCd == null) { _regFuncCd = nCV(); }
      return _regFuncCd; }
    protected ConditionValue xgetCValueRegFuncCd() { return xdfgetRegFuncCd(); }

    /** 
     * Add order-by as ascend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_RegFuncCd_Asc() { regOBA("REG_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_RegFuncCd_Desc() { regOBD("REG_FUNC_CD"); return this; }

    protected ConditionValue _updUserId;
    public ConditionValue xdfgetUpdUserId()
    { if (_updUserId == null) { _updUserId = nCV(); }
      return _updUserId; }
    protected ConditionValue xgetCValueUpdUserId() { return xdfgetUpdUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_UpdUserId_Asc() { regOBA("UPD_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_UpdUserId_Desc() { regOBD("UPD_USER_ID"); return this; }

    protected ConditionValue _updTm;
    public ConditionValue xdfgetUpdTm()
    { if (_updTm == null) { _updTm = nCV(); }
      return _updTm; }
    protected ConditionValue xgetCValueUpdTm() { return xdfgetUpdTm(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_UpdTm_Asc() { regOBA("UPD_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_UpdTm_Desc() { regOBD("UPD_TM"); return this; }

    protected ConditionValue _updFuncCd;
    public ConditionValue xdfgetUpdFuncCd()
    { if (_updFuncCd == null) { _updFuncCd = nCV(); }
      return _updFuncCd; }
    protected ConditionValue xgetCValueUpdFuncCd() { return xdfgetUpdFuncCd(); }

    /** 
     * Add order-by as ascend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_UpdFuncCd_Asc() { regOBA("UPD_FUNC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_UpdFuncCd_Desc() { regOBD("UPD_FUNC_CD"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsStShohinKonyuCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        StShohinKonyuCQ bq = (StShohinKonyuCQ)bqs;
        StShohinKonyuCQ uq = (StShohinKonyuCQ)uqs;
        if (bq.hasConditionQueryCmShain()) {
            uq.queryCmShain().reflectRelationOnUnionQuery(bq.queryCmShain(), uq.queryCmShain());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * CM_SHAIN by my KONYU_CM_SHAIN_ID, named 'cmShain'.
     * @return The instance of condition-query. (NotNull)
     */
    public CmShainCQ queryCmShain() {
        return xdfgetConditionQueryCmShain();
    }
    public CmShainCQ xdfgetConditionQueryCmShain() {
        String prop = "cmShain";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCmShain()); xsetupOuterJoinCmShain(); }
        return xgetQueRlMap(prop);
    }
    protected CmShainCQ xcreateQueryCmShain() {
        String nrp = xresolveNRP("ST_SHOHIN_KONYU", "cmShain"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CmShainCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cmShain", nrp);
    }
    protected void xsetupOuterJoinCmShain() { xregOutJo("cmShain"); }
    public boolean hasConditionQueryCmShain() { return xhasQueRlMap("cmShain"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, StShohinKonyuCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(StShohinKonyuCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, StShohinKonyuCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(StShohinKonyuCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, StShohinKonyuCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(StShohinKonyuCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, StShohinKonyuCQ> _myselfExistsMap;
    public Map<String, StShohinKonyuCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(StShohinKonyuCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, StShohinKonyuCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(StShohinKonyuCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return StShohinKonyuCB.class.getName(); }
    protected String xCQ() { return StShohinKonyuCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
