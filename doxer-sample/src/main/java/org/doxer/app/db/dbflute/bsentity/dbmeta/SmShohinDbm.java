package org.doxer.app.db.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The DB meta of SM_SHOHIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SmShohinDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SmShohinDbm _instance = new SmShohinDbm();
    private SmShohinDbm() {}
    public static SmShohinDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((SmShohin)et).getSmShohinId(), (et, vl) -> ((SmShohin)et).setSmShohinId(ctl(vl)), "smShohinId");
        setupEpg(_epgMap, et -> ((SmShohin)et).getShohinNo(), (et, vl) -> ((SmShohin)et).setShohinNo((String)vl), "shohinNo");
        setupEpg(_epgMap, et -> ((SmShohin)et).getShohinMei(), (et, vl) -> ((SmShohin)et).setShohinMei((String)vl), "shohinMei");
        setupEpg(_epgMap, et -> ((SmShohin)et).getShohinMeiEn(), (et, vl) -> ((SmShohin)et).setShohinMeiEn((String)vl), "shohinMeiEn");
        setupEpg(_epgMap, et -> ((SmShohin)et).getShohinPrice(), (et, vl) -> ((SmShohin)et).setShohinPrice(cti(vl)), "shohinPrice");
        setupEpg(_epgMap, et -> ((SmShohin)et).getRegUserId(), (et, vl) -> ((SmShohin)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((SmShohin)et).getRegTm(), (et, vl) -> ((SmShohin)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((SmShohin)et).getRegFuncCd(), (et, vl) -> ((SmShohin)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((SmShohin)et).getUpdUserId(), (et, vl) -> ((SmShohin)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((SmShohin)et).getUpdTm(), (et, vl) -> ((SmShohin)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((SmShohin)et).getUpdFuncCd(), (et, vl) -> ((SmShohin)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((SmShohin)et).getVersionNo(), (et, vl) -> ((SmShohin)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SM_SHOHIN";
    protected final String _tableDispName = "SM_SHOHIN";
    protected final String _tablePropertyName = "smShohin";
    protected final TableSqlName _tableSqlName = new TableSqlName("SM_SHOHIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSmShohinId = cci("SM_SHOHIN_ID", "SM_SHOHIN_ID", null, null, Long.class, "smShohinId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_F31C8085_D91C_44C1_8582_F1CC8BB4B22E", false, null, null, null, "stShhnKnyMsList", null, false);
    protected final ColumnInfo _columnShohinNo = cci("SHOHIN_NO", "SHOHIN_NO", null, null, String.class, "shohinNo", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShohinMei = cci("SHOHIN_MEI", "SHOHIN_MEI", null, null, String.class, "shohinMei", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShohinMeiEn = cci("SHOHIN_MEI_EN", "SHOHIN_MEI_EN", null, null, String.class, "shohinMeiEn", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShohinPrice = cci("SHOHIN_PRICE", "SHOHIN_PRICE", null, null, Integer.class, "shohinPrice", null, false, false, true, "DECIMAL", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * SM_SHOHIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSmShohinId() { return _columnSmShohinId; }
    /**
     * SHOHIN_NO: {UQ, NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShohinNo() { return _columnShohinNo; }
    /**
     * SHOHIN_MEI: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShohinMei() { return _columnShohinMei; }
    /**
     * SHOHIN_MEI_EN: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShohinMeiEn() { return _columnShohinMeiEn; }
    /**
     * SHOHIN_PRICE: {NotNull, DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShohinPrice() { return _columnShohinPrice; }
    /**
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegUserId() { return _columnRegUserId; }
    /**
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegTm() { return _columnRegTm; }
    /**
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegFuncCd() { return _columnRegFuncCd; }
    /**
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUserId() { return _columnUpdUserId; }
    /**
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdTm() { return _columnUpdTm; }
    /**
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdFuncCd() { return _columnUpdFuncCd; }
    /**
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSmShohinId());
        ls.add(columnShohinNo());
        ls.add(columnShohinMei());
        ls.add(columnShohinMeiEn());
        ls.add(columnShohinPrice());
        ls.add(columnRegUserId());
        ls.add(columnRegTm());
        ls.add(columnRegFuncCd());
        ls.add(columnUpdUserId());
        ls.add(columnUpdTm());
        ls.add(columnUpdFuncCd());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSmShohinId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnShohinNo()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * ST_SHHN_KNY_MS by SM_SHOHIN_ID, named 'stShhnKnyMsList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerStShhnKnyMsList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSmShohinId(), StShhnKnyMsDbm.getInstance().columnSmShohinId());
        return cri("FK_ST_SHHN_KNY_MS_SM_SHOHIN", "stShhnKnyMsList", this, StShhnKnyMsDbm.getInstance(), mp, false, "smShohin");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegUserId(), columnRegTm(), columnRegFuncCd(), columnUpdUserId(), columnUpdTm(), columnUpdFuncCd(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegUserId(), columnRegTm(), columnRegFuncCd(), columnUpdUserId(), columnUpdTm(), columnUpdFuncCd(), columnVersionNo()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdUserId(), columnUpdTm(), columnUpdFuncCd()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.SmShohin"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.SmShohinCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.SmShohinBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SmShohin> getEntityType() { return SmShohin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SmShohin newEntity() { return new SmShohin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SmShohin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SmShohin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
