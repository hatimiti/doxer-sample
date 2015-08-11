package org.doxer.app.db.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.doxer.app.db.dbflute.exbhv.*;
import org.doxer.app.db.dbflute.bsbhv.loader.*;
import org.doxer.app.db.dbflute.exentity.*;
import org.doxer.app.db.dbflute.bsentity.dbmeta.*;
import org.doxer.app.db.dbflute.cbean.*;

/**
 * The behavior of SM_SHOHIN as TABLE. <br>
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
public abstract class BsSmShohinBhv extends AbstractBehaviorWritable<SmShohin, SmShohinCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public SmShohinDbm asDBMeta() { return SmShohinDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "SM_SHOHIN"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SmShohinCB newConditionBean() { return new SmShohinCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<SmShohinCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">smShohin</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">smShohin</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">smShohin</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">smShohin</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SmShohin> selectEntity(CBCall<SmShohinCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<SmShohin> facadeSelectEntity(SmShohinCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SmShohin> OptionalEntity<ENTITY> doSelectOptionalEntity(SmShohinCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SmShohin <span style="color: #553000">smShohin</span> = <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">smShohin</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SmShohin selectEntityWithDeletedCheck(CBCall<SmShohinCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param smShohinId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SmShohin> selectByPK(Long smShohinId) {
        return facadeSelectByPK(smShohinId);
    }

    protected OptionalEntity<SmShohin> facadeSelectByPK(Long smShohinId) {
        return doSelectOptionalByPK(smShohinId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SmShohin> ENTITY doSelectByPK(Long smShohinId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(smShohinId), tp);
    }

    protected <ENTITY extends SmShohin> OptionalEntity<ENTITY> doSelectOptionalByPK(Long smShohinId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(smShohinId, tp), smShohinId);
    }

    protected SmShohinCB xprepareCBAsPK(Long smShohinId) {
        assertObjectNotNull("smShohinId", smShohinId);
        return newConditionBean().acceptPK(smShohinId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param shohinNo : UQ, NotNull, VARCHAR(20). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SmShohin> selectByUniqueOf(String shohinNo) {
        return facadeSelectByUniqueOf(shohinNo);
    }

    protected OptionalEntity<SmShohin> facadeSelectByUniqueOf(String shohinNo) {
        return doSelectByUniqueOf(shohinNo, typeOfSelectedEntity());
    }

    protected <ENTITY extends SmShohin> OptionalEntity<ENTITY> doSelectByUniqueOf(String shohinNo, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(shohinNo), tp), shohinNo);
    }

    protected SmShohinCB xprepareCBAsUniqueOf(String shohinNo) {
        assertObjectNotNull("shohinNo", shohinNo);
        return newConditionBean().acceptUniqueOf(shohinNo);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;SmShohin&gt; <span style="color: #553000">smShohinList</span> = <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (SmShohin <span style="color: #553000">smShohin</span> : <span style="color: #553000">smShohinList</span>) {
     *     ... = <span style="color: #553000">smShohin</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SmShohin> selectList(CBCall<SmShohinCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;SmShohin&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SmShohin smShohin : <span style="color: #553000">page</span>) {
     *     ... = smShohin.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SmShohin> selectPage(CBCall<SmShohinCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @param entityLambda The handler of entity row of SmShohin. (NotNull)
     */
    public void selectCursor(CBCall<SmShohinCB> cbLambda, EntityRowHandler<SmShohin> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SmShohinCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param smShohinList The entity list of smShohin. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SmShohin> smShohinList, ReferrerLoaderHandler<LoaderOfSmShohin> loaderLambda) {
        xassLRArg(smShohinList, loaderLambda);
        loaderLambda.handle(new LoaderOfSmShohin().ready(smShohinList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param smShohin The entity of smShohin. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SmShohin smShohin, ReferrerLoaderHandler<LoaderOfSmShohin> loaderLambda) {
        xassLRArg(smShohin, loaderLambda);
        loaderLambda.handle(new LoaderOfSmShohin().ready(xnewLRAryLs(smShohin), _behaviorSelector));
    }

    /**
     * Load referrer of stShhnKnyMsList by the set-upper of referrer. <br>
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'.
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">loadStShhnKnyMs</span>(<span style="color: #553000">smShohinList</span>, <span style="color: #553000">msCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">msCB</span>.setupSelect...
     *     <span style="color: #553000">msCB</span>.query().set...
     *     <span style="color: #553000">msCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (SmShohin smShohin : <span style="color: #553000">smShohinList</span>) {
     *     ... = smShohin.<span style="color: #CC4747">getStShhnKnyMsList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSmShohinId_InScope(pkList);
     * cb.query().addOrderBy_SmShohinId_Asc();
     * </pre>
     * @param smShohinList The entity list of smShohin. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<StShhnKnyMs> loadStShhnKnyMs(List<SmShohin> smShohinList, ReferrerConditionSetupper<StShhnKnyMsCB> refCBLambda) {
        xassLRArg(smShohinList, refCBLambda);
        return doLoadStShhnKnyMs(smShohinList, new LoadReferrerOption<StShhnKnyMsCB, StShhnKnyMs>().xinit(refCBLambda));
    }

    /**
     * Load referrer of stShhnKnyMsList by the set-upper of referrer. <br>
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'.
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">loadStShhnKnyMs</span>(<span style="color: #553000">smShohin</span>, <span style="color: #553000">msCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">msCB</span>.setupSelect...
     *     <span style="color: #553000">msCB</span>.query().set...
     *     <span style="color: #553000">msCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">smShohin</span>.<span style="color: #CC4747">getStShhnKnyMsList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSmShohinId_InScope(pkList);
     * cb.query().addOrderBy_SmShohinId_Asc();
     * </pre>
     * @param smShohin The entity of smShohin. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<StShhnKnyMs> loadStShhnKnyMs(SmShohin smShohin, ReferrerConditionSetupper<StShhnKnyMsCB> refCBLambda) {
        xassLRArg(smShohin, refCBLambda);
        return doLoadStShhnKnyMs(xnewLRLs(smShohin), new LoadReferrerOption<StShhnKnyMsCB, StShhnKnyMs>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<StShhnKnyMs> doLoadStShhnKnyMs(List<SmShohin> smShohinList, LoadReferrerOption<StShhnKnyMsCB, StShhnKnyMs> option) {
        return helpLoadReferrerInternally(smShohinList, option, "stShhnKnyMsList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key smShohinId.
     * @param smShohinList The list of smShohin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSmShohinIdList(List<SmShohin> smShohinList)
    { return helpExtractListInternally(smShohinList, "smShohinId"); }

    /**
     * Extract the value list of (single) unique key shohinNo.
     * @param smShohinList The list of smShohin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractShohinNoList(List<SmShohin> smShohinList)
    { return helpExtractListInternally(smShohinList, "shohinNo"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * smShohin.setFoo...(value);
     * smShohin.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//smShohin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//smShohin.set...;</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">insert</span>(smShohin);
     * ... = smShohin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param smShohin The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SmShohin smShohin) {
        doInsert(smShohin, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * smShohin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * smShohin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//smShohin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//smShohin.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * smShohin.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">update</span>(smShohin);
     * </pre>
     * @param smShohin The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SmShohin smShohin) {
        doUpdate(smShohin, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * smShohin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * smShohin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//smShohin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//smShohin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//smShohin.setVersionNo(value);</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(smShohin);
     * </pre>
     * @param smShohin The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SmShohin smShohin) {
        doUpdateNonstrict(smShohin, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param smShohin The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SmShohin smShohin) {
        doInsertOrUpdate(smShohin, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param smShohin The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SmShohin smShohin) {
        doInsertOrUpdateNonstrict(smShohin, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * smShohin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * smShohin.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">delete</span>(smShohin);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param smShohin The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SmShohin smShohin) {
        doDelete(smShohin, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * smShohin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//smShohin.setVersionNo(value);</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(smShohin);
     * </pre>
     * @param smShohin The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SmShohin smShohin) {
        doDeleteNonstrict(smShohin, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     *     smShohin.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         smShohin.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     smShohinList.add(smShohin);
     * }
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">batchInsert</span>(smShohinList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SmShohin> smShohinList) {
        return doBatchInsert(smShohinList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     *     smShohin.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         smShohin.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         smShohin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//smShohin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     smShohinList.add(smShohin);
     * }
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">batchUpdate</span>(smShohinList);
     * </pre>
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SmShohin> smShohinList) {
        return doBatchUpdate(smShohinList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     *     smShohin.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         smShohin.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         smShohin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//smShohin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     smShohinList.add(smShohin);
     * }
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">batchUpdate</span>(smShohinList);
     * </pre>
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SmShohin> smShohinList) {
        return doBatchUpdateNonstrict(smShohinList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SmShohin> smShohinList) {
        return doBatchDelete(smShohinList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SmShohin> smShohinList) {
        return doBatchDeleteNonstrict(smShohinList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;SmShohin, SmShohinCB&gt;() {
     *     public ConditionBean setup(SmShohin entity, SmShohinCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<SmShohin, SmShohinCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//smShohin.setPK...(value);</span>
     * smShohin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//smShohin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//smShohin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//smShohin.setVersionNo(value);</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">queryUpdate</span>(smShohin, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param smShohin The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SmShohin smShohin, CBCall<SmShohinCB> cbLambda) {
        return doQueryUpdate(smShohin, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">queryDelete</span>(smShohin, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<SmShohinCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * smShohin.setFoo...(value);
     * smShohin.setBar...(value);
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">varyingInsert</span>(smShohin, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = smShohin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param smShohin The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SmShohin smShohin, WritableOptionCall<SmShohinCB, InsertOption<SmShohinCB>> opLambda) {
        doInsert(smShohin, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * smShohin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * smShohin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * smShohin.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(smShohin, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param smShohin The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SmShohin smShohin, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> opLambda) {
        doUpdate(smShohin, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * smShohin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * smShohin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//smShohin.setVersionNo(value);</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(smShohin, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param smShohin The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SmShohin smShohin, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> opLambda) {
        doUpdateNonstrict(smShohin, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param smShohin The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SmShohin smShohin, WritableOptionCall<SmShohinCB, InsertOption<SmShohinCB>> insertOpLambda, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> updateOpLambda) {
        doInsertOrUpdate(smShohin, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param smShohin The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SmShohin smShohin, WritableOptionCall<SmShohinCB, InsertOption<SmShohinCB>> insertOpLambda, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(smShohin, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param smShohin The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SmShohin smShohin, WritableOptionCall<SmShohinCB, DeleteOption<SmShohinCB>> opLambda) {
        doDelete(smShohin, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param smShohin The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SmShohin smShohin, WritableOptionCall<SmShohinCB, DeleteOption<SmShohinCB>> opLambda) {
        doDeleteNonstrict(smShohin, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SmShohin> smShohinList, WritableOptionCall<SmShohinCB, InsertOption<SmShohinCB>> opLambda) {
        return doBatchInsert(smShohinList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SmShohin> smShohinList, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> opLambda) {
        return doBatchUpdate(smShohinList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SmShohin> smShohinList, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> opLambda) {
        return doBatchUpdateNonstrict(smShohinList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SmShohin> smShohinList, WritableOptionCall<SmShohinCB, DeleteOption<SmShohinCB>> opLambda) {
        return doBatchDelete(smShohinList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param smShohinList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SmShohin> smShohinList, WritableOptionCall<SmShohinCB, DeleteOption<SmShohinCB>> opLambda) {
        return doBatchDeleteNonstrict(smShohinList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<SmShohin, SmShohinCB> manyArgLambda, WritableOptionCall<SmShohinCB, InsertOption<SmShohinCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SmShohin smShohin = <span style="color: #70226C">new</span> SmShohin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//smShohin.setPK...(value);</span>
     * smShohin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//smShohin.setVersionNo(value);</span>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(smShohin, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param smShohin The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SmShohin smShohin, CBCall<SmShohinCB> cbLambda, WritableOptionCall<SmShohinCB, UpdateOption<SmShohinCB>> opLambda) {
        return doQueryUpdate(smShohin, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">smShohinBhv</span>.<span style="color: #CC4747">queryDelete</span>(smShohin, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SmShohin. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<SmShohinCB> cbLambda, WritableOptionCall<SmShohinCB, DeleteOption<SmShohinCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * smShohinBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * smShohinBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * smShohinBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * smShohinBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * smShohinBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * smShohinBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * smShohinBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * smShohinBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * smShohinBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * smShohinBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * smShohinBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * smShohinBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * smShohinBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * smShohinBhv.outideSql().removeBlockComment().selectList()
     * smShohinBhv.outideSql().removeLineComment().selectList()
     * smShohinBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<SmShohinBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SmShohin> typeOfSelectedEntity() { return SmShohin.class; }
    protected Class<SmShohin> typeOfHandlingEntity() { return SmShohin.class; }
    protected Class<SmShohinCB> typeOfHandlingConditionBean() { return SmShohinCB.class; }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    @javax.annotation.Resource(name="behaviorCommandInvoker")
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        super.setBehaviorCommandInvoker(behaviorCommandInvoker);
    }

    @Override
    @javax.annotation.Resource(name="behaviorSelector")
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        super.setBehaviorSelector(behaviorSelector);
    }

    @Override
    @javax.annotation.Resource(name="commonColumnAutoSetupper")
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        super.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
    }
}
