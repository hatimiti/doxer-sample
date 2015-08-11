package org.doxer.app.db.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import org.doxer.app.db.dbflute.allcommon.DBFluteConfig;
import org.doxer.app.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.doxer.app.db.dbflute.allcommon.ImplementedInvokerAssistant;
import org.doxer.app.db.dbflute.allcommon.ImplementedSqlClauseCreator;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;
import org.doxer.app.db.dbflute.cbean.nss.*;

/**
 * The base condition-bean of ST_SHHN_KNY_MS.
 * @author DBFlute(AutoGenerator)
 */
public class BsStShhnKnyMsCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StShhnKnyMsCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsStShhnKnyMsCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "ST_SHHN_KNY_MS";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param stShhnKnyMsId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public StShhnKnyMsCB acceptPK(Long stShhnKnyMsId) {
        assertObjectNotNull("stShhnKnyMsId", stShhnKnyMsId);
        BsStShhnKnyMsCB cb = this;
        cb.query().setStShhnKnyMsId_Equal(stShhnKnyMsId);
        return (StShhnKnyMsCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param stShohinKonyuId : UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu. (NotNull)
     * @param smShohinId : +UQ, NotNull, DECIMAL(12), FK to sm_shohin. (NotNull)
     * @return this. (NotNull)
     */
    public StShhnKnyMsCB acceptUniqueOf(Long stShohinKonyuId, Long smShohinId) {
        assertObjectNotNull("stShohinKonyuId", stShohinKonyuId);assertObjectNotNull("smShohinId", smShohinId);
        BsStShhnKnyMsCB cb = this;
        cb.query().setStShohinKonyuId_Equal(stShohinKonyuId);cb.query().setSmShohinId_Equal(smShohinId);
        return (StShhnKnyMsCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StShhnKnyMsId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StShhnKnyMsId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public StShhnKnyMsCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public StShhnKnyMsCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected StShhnKnyMsCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected StShhnKnyMsCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected StShhnKnyMsCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        StShhnKnyMsCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected StShhnKnyMsCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new StShhnKnyMsCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<StShhnKnyMsCB> unionCBLambda) {
        final StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final StShhnKnyMsCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<StShhnKnyMsCB> unionCBLambda) {
        final StShhnKnyMsCB cb = new StShhnKnyMsCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final StShhnKnyMsCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected StShohinKonyuNss _nssStShohinKonyu;
    public StShohinKonyuNss xdfgetNssStShohinKonyu() {
        if (_nssStShohinKonyu == null) { _nssStShohinKonyu = new StShohinKonyuNss(null); }
        return _nssStShohinKonyu;
    }
    /**
     * Set up relation columns to select clause. <br>
     * ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'.
     * <pre>
     * <span style="color: #0000C0">stShhnKnyMsBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_StShohinKonyu()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">stShhnKnyMs</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">stShhnKnyMs</span>.<span style="color: #CC4747">getStShohinKonyu()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public StShohinKonyuNss setupSelect_StShohinKonyu() {
        assertSetupSelectPurpose("stShohinKonyu");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStShohinKonyuId();
        }
        doSetupSelect(() -> query().queryStShohinKonyu());
        if (_nssStShohinKonyu == null || !_nssStShohinKonyu.hasConditionQuery())
        { _nssStShohinKonyu = new StShohinKonyuNss(query().queryStShohinKonyu()); }
        return _nssStShohinKonyu;
    }

    /**
     * Set up relation columns to select clause. <br>
     * SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'.
     * <pre>
     * <span style="color: #0000C0">stShhnKnyMsBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_SmShohin()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">stShhnKnyMs</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">stShhnKnyMs</span>.<span style="color: #CC4747">getSmShohin()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_SmShohin() {
        assertSetupSelectPurpose("smShohin");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSmShohinId();
        }
        doSetupSelect(() -> query().querySmShohin());
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<StShhnKnyMsCQ> {
        protected StShohinKonyuCB.HpSpecification _stShohinKonyu;
        protected SmShohinCB.HpSpecification _smShohin;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<StShhnKnyMsCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStShhnKnyMsId() { return doColumn("ST_SHHN_KNY_MS_ID"); }
        /**
         * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStShohinKonyuId() { return doColumn("ST_SHOHIN_KONYU_ID"); }
        /**
         * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSmShohinId() { return doColumn("SM_SHOHIN_ID"); }
        /**
         * KONYU_SU: {NotNull, DECIMAL(4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKonyuSu() { return doColumn("KONYU_SU"); }
        /**
         * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKonyuUnitPrice() { return doColumn("KONYU_UNIT_PRICE"); }
        /**
         * KONYU_TAX: {NotNull, DECIMAL(9)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKonyuTax() { return doColumn("KONYU_TAX"); }
        /**
         * REG_USER_ID: {NotNull, VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegUserId() { return doColumn("REG_USER_ID"); }
        /**
         * REG_TM: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegTm() { return doColumn("REG_TM"); }
        /**
         * REG_FUNC_CD: {NotNull, VARCHAR(9)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegFuncCd() { return doColumn("REG_FUNC_CD"); }
        /**
         * UPD_USER_ID: {NotNull, VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdUserId() { return doColumn("UPD_USER_ID"); }
        /**
         * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdTm() { return doColumn("UPD_TM"); }
        /**
         * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdFuncCd() { return doColumn("UPD_FUNC_CD"); }
        /**
         * VERSION_NO: {NotNull, DECIMAL(9)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnStShhnKnyMsId(); // PK
            if (qyCall().qy().hasConditionQueryStShohinKonyu()
                    || qyCall().qy().xgetReferrerQuery() instanceof StShohinKonyuCQ) {
                columnStShohinKonyuId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQuerySmShohin()
                    || qyCall().qy().xgetReferrerQuery() instanceof SmShohinCQ) {
                columnSmShohinId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "ST_SHHN_KNY_MS"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public StShohinKonyuCB.HpSpecification specifyStShohinKonyu() {
            assertRelation("stShohinKonyu");
            if (_stShohinKonyu == null) {
                _stShohinKonyu = new StShohinKonyuCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryStShohinKonyu()
                                    , () -> _qyCall.qy().queryStShohinKonyu())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _stShohinKonyu.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryStShohinKonyu()
                      , () -> xsyncQyCall().qy().queryStShohinKonyu()));
                }
            }
            return _stShohinKonyu;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SmShohinCB.HpSpecification specifySmShohin() {
            assertRelation("smShohin");
            if (_smShohin == null) {
                _smShohin = new SmShohinCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQuerySmShohin()
                                    , () -> _qyCall.qy().querySmShohin())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _smShohin.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySmShohin()
                      , () -> xsyncQyCall().qy().querySmShohin()));
                }
            }
            return _smShohin;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<StShhnKnyMsCB, StShhnKnyMsCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<StShhnKnyMsCB> sq, StShhnKnyMsCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public StShhnKnyMsCB dreamCruiseCB() {
        StShhnKnyMsCB cb = new StShhnKnyMsCB();
        cb.xsetupForDreamCruise((StShhnKnyMsCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<StShhnKnyMsCB> columnQuery(final SpecifyQuery<StShhnKnyMsCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected StShhnKnyMsCB xcreateColumnQueryCB() {
        StShhnKnyMsCB cb = new StShhnKnyMsCB();
        cb.xsetupForColumnQuery((StShhnKnyMsCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<StShhnKnyMsCB> orCBLambda) {
        xorSQ((StShhnKnyMsCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<StShhnKnyMsCB> andCBLambda) {
        xorSQAP((StShhnKnyMsCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final StShhnKnyMsCB cb;
        if (mainCB != null) {
            cb = (StShhnKnyMsCB)mainCB;
        } else {
            cb = new StShhnKnyMsCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return StShhnKnyMsCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return StShhnKnyMsCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
