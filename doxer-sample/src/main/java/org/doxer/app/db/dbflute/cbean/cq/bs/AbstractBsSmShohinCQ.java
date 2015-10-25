package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of SM_SHOHIN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSmShohinCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSmShohinCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "SM_SHOHIN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinId The value of smShohinId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_Equal(Long smShohinId) {
        doSetSmShohinId_Equal(smShohinId);
    }

    protected void doSetSmShohinId_Equal(Long smShohinId) {
        regSmShohinId(CK_EQ, smShohinId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinId The value of smShohinId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_NotEqual(Long smShohinId) {
        doSetSmShohinId_NotEqual(smShohinId);
    }

    protected void doSetSmShohinId_NotEqual(Long smShohinId) {
        regSmShohinId(CK_NES, smShohinId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinId The value of smShohinId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_GreaterThan(Long smShohinId) {
        regSmShohinId(CK_GT, smShohinId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinId The value of smShohinId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_LessThan(Long smShohinId) {
        regSmShohinId(CK_LT, smShohinId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinId The value of smShohinId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_GreaterEqual(Long smShohinId) {
        regSmShohinId(CK_GE, smShohinId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinId The value of smShohinId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSmShohinId_LessEqual(Long smShohinId) {
        regSmShohinId(CK_LE, smShohinId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of smShohinId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of smShohinId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSmShohinId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSmShohinId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of smShohinId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of smShohinId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSmShohinId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSmShohinId(), "SM_SHOHIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinIdList The collection of smShohinId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSmShohinId_InScope(Collection<Long> smShohinIdList) {
        doSetSmShohinId_InScope(smShohinIdList);
    }

    protected void doSetSmShohinId_InScope(Collection<Long> smShohinIdList) {
        regINS(CK_INS, cTL(smShohinIdList), xgetCValueSmShohinId(), "SM_SHOHIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param smShohinIdList The collection of smShohinId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSmShohinId_NotInScope(Collection<Long> smShohinIdList) {
        doSetSmShohinId_NotInScope(smShohinIdList);
    }

    protected void doSetSmShohinId_NotInScope(Collection<Long> smShohinIdList) {
        regINS(CK_NINS, cTL(smShohinIdList), xgetCValueSmShohinId(), "SM_SHOHIN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select sm_shohin_id from ST_SHHN_KNY_MS where ...)} <br>
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsStShhnKnyMs</span>(msCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     msCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StShhnKnyMsList for 'exists'. (NotNull)
     */
    public void existsStShhnKnyMs(SubQuery<StShhnKnyMsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSmShohinId_ExistsReferrer_StShhnKnyMsList(cb.query());
        registerExistsReferrer(cb.query(), "SM_SHOHIN_ID", "sm_shohin_id", pp, "stShhnKnyMsList");
    }
    public abstract String keepSmShohinId_ExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select sm_shohin_id from ST_SHHN_KNY_MS where ...)} <br>
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsStShhnKnyMs</span>(msCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     msCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SmShohinId_NotExistsReferrer_StShhnKnyMsList for 'not exists'. (NotNull)
     */
    public void notExistsStShhnKnyMs(SubQuery<StShhnKnyMsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSmShohinId_NotExistsReferrer_StShhnKnyMsList(cb.query());
        registerNotExistsReferrer(cb.query(), "SM_SHOHIN_ID", "sm_shohin_id", pp, "stShhnKnyMsList");
    }
    public abstract String keepSmShohinId_NotExistsReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);

    public void xsderiveStShhnKnyMsList(String fn, SubQuery<StShhnKnyMsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSmShohinId_SpecifyDerivedReferrer_StShhnKnyMsList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SM_SHOHIN_ID", "sm_shohin_id", pp, "stShhnKnyMsList", al, op);
    }
    public abstract String keepSmShohinId_SpecifyDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ST_SHHN_KNY_MS where ...)} <br>
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedStShhnKnyMs()</span>.<span style="color: #CC4747">max</span>(msCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     msCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     msCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<StShhnKnyMsCB> derivedStShhnKnyMs() {
        return xcreateQDRFunctionStShhnKnyMsList();
    }
    protected HpQDRFunction<StShhnKnyMsCB> xcreateQDRFunctionStShhnKnyMsList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveStShhnKnyMsList(fn, sq, rd, vl, op));
    }
    public void xqderiveStShhnKnyMsList(String fn, SubQuery<StShhnKnyMsCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSmShohinId_QueryDerivedReferrer_StShhnKnyMsList(cb.query()); String prpp = keepSmShohinId_QueryDerivedReferrer_StShhnKnyMsListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SM_SHOHIN_ID", "sm_shohin_id", sqpp, "stShhnKnyMsList", rd, vl, prpp, op);
    }
    public abstract String keepSmShohinId_QueryDerivedReferrer_StShhnKnyMsList(StShhnKnyMsCQ sq);
    public abstract String keepSmShohinId_QueryDerivedReferrer_StShhnKnyMsListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setSmShohinId_IsNull() { regSmShohinId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setSmShohinId_IsNotNull() { regSmShohinId(CK_ISNN, DOBJ); }

    protected void regSmShohinId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSmShohinId(), "SM_SHOHIN_ID"); }
    protected abstract ConditionValue xgetCValueSmShohinId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_Equal(String shohinNo) {
        doSetShohinNo_Equal(fRES(shohinNo));
    }

    protected void doSetShohinNo_Equal(String shohinNo) {
        regShohinNo(CK_EQ, shohinNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_NotEqual(String shohinNo) {
        doSetShohinNo_NotEqual(fRES(shohinNo));
    }

    protected void doSetShohinNo_NotEqual(String shohinNo) {
        regShohinNo(CK_NES, shohinNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_GreaterThan(String shohinNo) {
        regShohinNo(CK_GT, fRES(shohinNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_LessThan(String shohinNo) {
        regShohinNo(CK_LT, fRES(shohinNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_GreaterEqual(String shohinNo) {
        regShohinNo(CK_GE, fRES(shohinNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_LessEqual(String shohinNo) {
        regShohinNo(CK_LE, fRES(shohinNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNoList The collection of shohinNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_InScope(Collection<String> shohinNoList) {
        doSetShohinNo_InScope(shohinNoList);
    }

    protected void doSetShohinNo_InScope(Collection<String> shohinNoList) {
        regINS(CK_INS, cTL(shohinNoList), xgetCValueShohinNo(), "SHOHIN_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNoList The collection of shohinNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinNo_NotInScope(Collection<String> shohinNoList) {
        doSetShohinNo_NotInScope(shohinNoList);
    }

    protected void doSetShohinNo_NotInScope(Collection<String> shohinNoList) {
        regINS(CK_NINS, cTL(shohinNoList), xgetCValueShohinNo(), "SHOHIN_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setShohinNo_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shohinNo The value of shohinNo as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShohinNo_LikeSearch(String shohinNo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShohinNo_LikeSearch(shohinNo, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setShohinNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shohinNo The value of shohinNo as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShohinNo_LikeSearch(String shohinNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shohinNo), xgetCValueShohinNo(), "SHOHIN_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShohinNo_NotLikeSearch(String shohinNo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShohinNo_NotLikeSearch(shohinNo, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @param shohinNo The value of shohinNo as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShohinNo_NotLikeSearch(String shohinNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shohinNo), xgetCValueShohinNo(), "SHOHIN_NO", likeSearchOption);
    }

    protected void regShohinNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShohinNo(), "SHOHIN_NO"); }
    protected abstract ConditionValue xgetCValueShohinNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_Equal(String shohinMei) {
        doSetShohinMei_Equal(fRES(shohinMei));
    }

    protected void doSetShohinMei_Equal(String shohinMei) {
        regShohinMei(CK_EQ, shohinMei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_NotEqual(String shohinMei) {
        doSetShohinMei_NotEqual(fRES(shohinMei));
    }

    protected void doSetShohinMei_NotEqual(String shohinMei) {
        regShohinMei(CK_NES, shohinMei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_GreaterThan(String shohinMei) {
        regShohinMei(CK_GT, fRES(shohinMei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_LessThan(String shohinMei) {
        regShohinMei(CK_LT, fRES(shohinMei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_GreaterEqual(String shohinMei) {
        regShohinMei(CK_GE, fRES(shohinMei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_LessEqual(String shohinMei) {
        regShohinMei(CK_LE, fRES(shohinMei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMeiList The collection of shohinMei as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_InScope(Collection<String> shohinMeiList) {
        doSetShohinMei_InScope(shohinMeiList);
    }

    protected void doSetShohinMei_InScope(Collection<String> shohinMeiList) {
        regINS(CK_INS, cTL(shohinMeiList), xgetCValueShohinMei(), "SHOHIN_MEI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMeiList The collection of shohinMei as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMei_NotInScope(Collection<String> shohinMeiList) {
        doSetShohinMei_NotInScope(shohinMeiList);
    }

    protected void doSetShohinMei_NotInScope(Collection<String> shohinMeiList) {
        regINS(CK_NINS, cTL(shohinMeiList), xgetCValueShohinMei(), "SHOHIN_MEI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setShohinMei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shohinMei The value of shohinMei as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShohinMei_LikeSearch(String shohinMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShohinMei_LikeSearch(shohinMei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setShohinMei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shohinMei The value of shohinMei as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShohinMei_LikeSearch(String shohinMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shohinMei), xgetCValueShohinMei(), "SHOHIN_MEI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShohinMei_NotLikeSearch(String shohinMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShohinMei_NotLikeSearch(shohinMei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @param shohinMei The value of shohinMei as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShohinMei_NotLikeSearch(String shohinMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shohinMei), xgetCValueShohinMei(), "SHOHIN_MEI", likeSearchOption);
    }

    protected void regShohinMei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShohinMei(), "SHOHIN_MEI"); }
    protected abstract ConditionValue xgetCValueShohinMei();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_Equal(String shohinMeiEn) {
        doSetShohinMeiEn_Equal(fRES(shohinMeiEn));
    }

    protected void doSetShohinMeiEn_Equal(String shohinMeiEn) {
        regShohinMeiEn(CK_EQ, shohinMeiEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_NotEqual(String shohinMeiEn) {
        doSetShohinMeiEn_NotEqual(fRES(shohinMeiEn));
    }

    protected void doSetShohinMeiEn_NotEqual(String shohinMeiEn) {
        regShohinMeiEn(CK_NES, shohinMeiEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_GreaterThan(String shohinMeiEn) {
        regShohinMeiEn(CK_GT, fRES(shohinMeiEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_LessThan(String shohinMeiEn) {
        regShohinMeiEn(CK_LT, fRES(shohinMeiEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_GreaterEqual(String shohinMeiEn) {
        regShohinMeiEn(CK_GE, fRES(shohinMeiEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_LessEqual(String shohinMeiEn) {
        regShohinMeiEn(CK_LE, fRES(shohinMeiEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEnList The collection of shohinMeiEn as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_InScope(Collection<String> shohinMeiEnList) {
        doSetShohinMeiEn_InScope(shohinMeiEnList);
    }

    protected void doSetShohinMeiEn_InScope(Collection<String> shohinMeiEnList) {
        regINS(CK_INS, cTL(shohinMeiEnList), xgetCValueShohinMeiEn(), "SHOHIN_MEI_EN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEnList The collection of shohinMeiEn as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinMeiEn_NotInScope(Collection<String> shohinMeiEnList) {
        doSetShohinMeiEn_NotInScope(shohinMeiEnList);
    }

    protected void doSetShohinMeiEn_NotInScope(Collection<String> shohinMeiEnList) {
        regINS(CK_NINS, cTL(shohinMeiEnList), xgetCValueShohinMeiEn(), "SHOHIN_MEI_EN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setShohinMeiEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shohinMeiEn The value of shohinMeiEn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShohinMeiEn_LikeSearch(String shohinMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShohinMeiEn_LikeSearch(shohinMeiEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setShohinMeiEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shohinMeiEn The value of shohinMeiEn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShohinMeiEn_LikeSearch(String shohinMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shohinMeiEn), xgetCValueShohinMeiEn(), "SHOHIN_MEI_EN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShohinMeiEn_NotLikeSearch(String shohinMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShohinMeiEn_NotLikeSearch(shohinMeiEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @param shohinMeiEn The value of shohinMeiEn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShohinMeiEn_NotLikeSearch(String shohinMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shohinMeiEn), xgetCValueShohinMeiEn(), "SHOHIN_MEI_EN", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     */
    public void setShohinMeiEn_IsNull() { regShohinMeiEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     */
    public void setShohinMeiEn_IsNullOrEmpty() { regShohinMeiEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     */
    public void setShohinMeiEn_IsNotNull() { regShohinMeiEn(CK_ISNN, DOBJ); }

    protected void regShohinMeiEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShohinMeiEn(), "SHOHIN_MEI_EN"); }
    protected abstract ConditionValue xgetCValueShohinMeiEn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPrice The value of shohinPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShohinPrice_Equal(Integer shohinPrice) {
        doSetShohinPrice_Equal(shohinPrice);
    }

    protected void doSetShohinPrice_Equal(Integer shohinPrice) {
        regShohinPrice(CK_EQ, shohinPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPrice The value of shohinPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShohinPrice_NotEqual(Integer shohinPrice) {
        doSetShohinPrice_NotEqual(shohinPrice);
    }

    protected void doSetShohinPrice_NotEqual(Integer shohinPrice) {
        regShohinPrice(CK_NES, shohinPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPrice The value of shohinPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShohinPrice_GreaterThan(Integer shohinPrice) {
        regShohinPrice(CK_GT, shohinPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPrice The value of shohinPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShohinPrice_LessThan(Integer shohinPrice) {
        regShohinPrice(CK_LT, shohinPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPrice The value of shohinPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShohinPrice_GreaterEqual(Integer shohinPrice) {
        regShohinPrice(CK_GE, shohinPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPrice The value of shohinPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShohinPrice_LessEqual(Integer shohinPrice) {
        regShohinPrice(CK_LE, shohinPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of shohinPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of shohinPrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setShohinPrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setShohinPrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of shohinPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of shohinPrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setShohinPrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShohinPrice(), "SHOHIN_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPriceList The collection of shohinPrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinPrice_InScope(Collection<Integer> shohinPriceList) {
        doSetShohinPrice_InScope(shohinPriceList);
    }

    protected void doSetShohinPrice_InScope(Collection<Integer> shohinPriceList) {
        regINS(CK_INS, cTL(shohinPriceList), xgetCValueShohinPrice(), "SHOHIN_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @param shohinPriceList The collection of shohinPrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setShohinPrice_NotInScope(Collection<Integer> shohinPriceList) {
        doSetShohinPrice_NotInScope(shohinPriceList);
    }

    protected void doSetShohinPrice_NotInScope(Collection<Integer> shohinPriceList) {
        regINS(CK_NINS, cTL(shohinPriceList), xgetCValueShohinPrice(), "SHOHIN_PRICE");
    }

    protected void regShohinPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShohinPrice(), "SHOHIN_PRICE"); }
    protected abstract ConditionValue xgetCValueShohinPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_Equal(String regUserId) {
        doSetRegUserId_Equal(fRES(regUserId));
    }

    protected void doSetRegUserId_Equal(String regUserId) {
        regRegUserId(CK_EQ, regUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_NotEqual(String regUserId) {
        doSetRegUserId_NotEqual(fRES(regUserId));
    }

    protected void doSetRegUserId_NotEqual(String regUserId) {
        regRegUserId(CK_NES, regUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_GreaterThan(String regUserId) {
        regRegUserId(CK_GT, fRES(regUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_LessThan(String regUserId) {
        regRegUserId(CK_LT, fRES(regUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_GreaterEqual(String regUserId) {
        regRegUserId(CK_GE, fRES(regUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_LessEqual(String regUserId) {
        regRegUserId(CK_LE, fRES(regUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_InScope(Collection<String> regUserIdList) {
        doSetRegUserId_InScope(regUserIdList);
    }

    protected void doSetRegUserId_InScope(Collection<String> regUserIdList) {
        regINS(CK_INS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegUserId_NotInScope(Collection<String> regUserIdList) {
        doSetRegUserId_NotInScope(regUserIdList);
    }

    protected void doSetRegUserId_NotInScope(Collection<String> regUserIdList) {
        regINS(CK_NINS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regUserId The value of regUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_LikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_LikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regUserId The value of regUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegUserId_LikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_NotLikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_NotLikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegUserId_NotLikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    protected void regRegUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegUserId(), "REG_USER_ID"); }
    protected abstract ConditionValue xgetCValueRegUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_Equal(java.time.LocalDateTime regTm) {
        regRegTm(CK_EQ,  regTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_GreaterThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_GT,  regTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_LessThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_LT,  regTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_GreaterEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_GE,  regTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_LessEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_LE, regTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REG_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegTm(), nm, op);
    }

    protected void regRegTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegTm(), "REG_TM"); }
    protected abstract ConditionValue xgetCValueRegTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_Equal(String regFuncCd) {
        doSetRegFuncCd_Equal(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_Equal(String regFuncCd) {
        regRegFuncCd(CK_EQ, regFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_NotEqual(String regFuncCd) {
        doSetRegFuncCd_NotEqual(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_NotEqual(String regFuncCd) {
        regRegFuncCd(CK_NES, regFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_GreaterThan(String regFuncCd) {
        regRegFuncCd(CK_GT, fRES(regFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_LessThan(String regFuncCd) {
        regRegFuncCd(CK_LT, fRES(regFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_GreaterEqual(String regFuncCd) {
        regRegFuncCd(CK_GE, fRES(regFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_LessEqual(String regFuncCd) {
        regRegFuncCd(CK_LE, fRES(regFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_InScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_InScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_InScope(Collection<String> regFuncCdList) {
        regINS(CK_INS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_NotInScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        regINS(CK_NINS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_LikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_LikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegFuncCd_LikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_NotLikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_NotLikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegFuncCd_NotLikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    protected void regRegFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegFuncCd(), "REG_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueRegFuncCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_Equal(String updUserId) {
        doSetUpdUserId_Equal(fRES(updUserId));
    }

    protected void doSetUpdUserId_Equal(String updUserId) {
        regUpdUserId(CK_EQ, updUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_NotEqual(String updUserId) {
        doSetUpdUserId_NotEqual(fRES(updUserId));
    }

    protected void doSetUpdUserId_NotEqual(String updUserId) {
        regUpdUserId(CK_NES, updUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_GreaterThan(String updUserId) {
        regUpdUserId(CK_GT, fRES(updUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_LessThan(String updUserId) {
        regUpdUserId(CK_LT, fRES(updUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_GreaterEqual(String updUserId) {
        regUpdUserId(CK_GE, fRES(updUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_LessEqual(String updUserId) {
        regUpdUserId(CK_LE, fRES(updUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_InScope(Collection<String> updUserIdList) {
        doSetUpdUserId_InScope(updUserIdList);
    }

    protected void doSetUpdUserId_InScope(Collection<String> updUserIdList) {
        regINS(CK_INS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdUserId_NotInScope(Collection<String> updUserIdList) {
        doSetUpdUserId_NotInScope(updUserIdList);
    }

    protected void doSetUpdUserId_NotInScope(Collection<String> updUserIdList) {
        regINS(CK_NINS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updUserId The value of updUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_LikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_LikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updUserId The value of updUserId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdUserId_LikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_NotLikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_NotLikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdUserId_NotLikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    protected void regUpdUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUserId(), "UPD_USER_ID"); }
    protected abstract ConditionValue xgetCValueUpdUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_Equal(java.time.LocalDateTime updTm) {
        regUpdTm(CK_EQ,  updTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_GreaterThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GT,  updTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_LessThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LT,  updTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_GreaterEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GE,  updTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_LessEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LE, updTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPD_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdTm(), nm, op);
    }

    protected void regUpdTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdTm(), "UPD_TM"); }
    protected abstract ConditionValue xgetCValueUpdTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_Equal(String updFuncCd) {
        doSetUpdFuncCd_Equal(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_Equal(String updFuncCd) {
        regUpdFuncCd(CK_EQ, updFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_NotEqual(String updFuncCd) {
        doSetUpdFuncCd_NotEqual(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_NotEqual(String updFuncCd) {
        regUpdFuncCd(CK_NES, updFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_GreaterThan(String updFuncCd) {
        regUpdFuncCd(CK_GT, fRES(updFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_LessThan(String updFuncCd) {
        regUpdFuncCd(CK_LT, fRES(updFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_GreaterEqual(String updFuncCd) {
        regUpdFuncCd(CK_GE, fRES(updFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_LessEqual(String updFuncCd) {
        regUpdFuncCd(CK_LE, fRES(updFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_InScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        regINS(CK_INS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_NotInScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        regINS(CK_NINS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_LikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_LikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdFuncCd_LikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_NotLikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_NotLikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdFuncCd_NotLikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    protected void regUpdFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdFuncCd(), "UPD_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueUpdFuncCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SmShohinCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SmShohinCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SmShohinCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SmShohinCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SmShohinCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SmShohinCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SmShohinCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SmShohinCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SmShohinCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SmShohinCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SmShohinCB&gt;() {
     *     public void query(SmShohinCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SmShohinCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SmShohinCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SmShohinCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SmShohinCQ sq);

    protected SmShohinCB xcreateScalarConditionCB() {
        SmShohinCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SmShohinCB xcreateScalarConditionPartitionByCB() {
        SmShohinCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SmShohinCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SmShohinCB cb = new SmShohinCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SM_SHOHIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SmShohinCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SmShohinCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SmShohinCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SmShohinCB cb = new SmShohinCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SM_SHOHIN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SmShohinCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SmShohinCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SmShohinCB cb = new SmShohinCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SmShohinCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected SmShohinCB newMyCB() {
        return new SmShohinCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SmShohinCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
