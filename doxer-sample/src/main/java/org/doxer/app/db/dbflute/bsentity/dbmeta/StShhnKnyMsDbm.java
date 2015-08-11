package org.doxer.app.db.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.exentity.*;

/**
 * The DB meta of ST_SHHN_KNY_MS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class StShhnKnyMsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final StShhnKnyMsDbm _instance = new StShhnKnyMsDbm();
    private StShhnKnyMsDbm() {}
    public static StShhnKnyMsDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getStShhnKnyMsId(), (et, vl) -> ((StShhnKnyMs)et).setStShhnKnyMsId(ctl(vl)), "stShhnKnyMsId");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getStShohinKonyuId(), (et, vl) -> ((StShhnKnyMs)et).setStShohinKonyuId(ctl(vl)), "stShohinKonyuId");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getSmShohinId(), (et, vl) -> ((StShhnKnyMs)et).setSmShohinId(ctl(vl)), "smShohinId");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getKonyuSu(), (et, vl) -> ((StShhnKnyMs)et).setKonyuSu(cti(vl)), "konyuSu");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getKonyuUnitPrice(), (et, vl) -> ((StShhnKnyMs)et).setKonyuUnitPrice(cti(vl)), "konyuUnitPrice");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getKonyuTax(), (et, vl) -> ((StShhnKnyMs)et).setKonyuTax(cti(vl)), "konyuTax");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getRegUserId(), (et, vl) -> ((StShhnKnyMs)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getRegTm(), (et, vl) -> ((StShhnKnyMs)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getRegFuncCd(), (et, vl) -> ((StShhnKnyMs)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getUpdUserId(), (et, vl) -> ((StShhnKnyMs)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getUpdTm(), (et, vl) -> ((StShhnKnyMs)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getUpdFuncCd(), (et, vl) -> ((StShhnKnyMs)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((StShhnKnyMs)et).getVersionNo(), (et, vl) -> ((StShhnKnyMs)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((StShhnKnyMs)et).getStShohinKonyu(), (et, vl) -> ((StShhnKnyMs)et).setStShohinKonyu((OptionalEntity<StShohinKonyu>)vl), "stShohinKonyu");
        setupEfpg(_efpgMap, et -> ((StShhnKnyMs)et).getSmShohin(), (et, vl) -> ((StShhnKnyMs)et).setSmShohin((OptionalEntity<SmShohin>)vl), "smShohin");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ST_SHHN_KNY_MS";
    protected final String _tableDispName = "ST_SHHN_KNY_MS";
    protected final String _tablePropertyName = "stShhnKnyMs";
    protected final TableSqlName _tableSqlName = new TableSqlName("ST_SHHN_KNY_MS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStShhnKnyMsId = cci("ST_SHHN_KNY_MS_ID", "ST_SHHN_KNY_MS_ID", null, null, Long.class, "stShhnKnyMsId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_60E3AB04_40DC_451D_9149_0FD974B8F3A7", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStShohinKonyuId = cci("ST_SHOHIN_KONYU_ID", "ST_SHOHIN_KONYU_ID", null, null, Long.class, "stShohinKonyuId", null, false, false, true, "DECIMAL", 12, 0, null, false, null, null, "stShohinKonyu", null, null, false);
    protected final ColumnInfo _columnSmShohinId = cci("SM_SHOHIN_ID", "SM_SHOHIN_ID", null, null, Long.class, "smShohinId", null, false, false, true, "DECIMAL", 12, 0, null, false, null, null, "smShohin", null, null, false);
    protected final ColumnInfo _columnKonyuSu = cci("KONYU_SU", "KONYU_SU", null, null, Integer.class, "konyuSu", null, false, false, true, "DECIMAL", 4, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKonyuUnitPrice = cci("KONYU_UNIT_PRICE", "KONYU_UNIT_PRICE", null, null, Integer.class, "konyuUnitPrice", null, false, false, true, "DECIMAL", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKonyuTax = cci("KONYU_TAX", "KONYU_TAX", null, null, Integer.class, "konyuTax", null, false, false, true, "DECIMAL", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * ST_SHHN_KNY_MS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStShhnKnyMsId() { return _columnStShhnKnyMsId; }
    /**
     * ST_SHOHIN_KONYU_ID: {UQ+, NotNull, DECIMAL(12), FK to st_shohin_konyu}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStShohinKonyuId() { return _columnStShohinKonyuId; }
    /**
     * SM_SHOHIN_ID: {+UQ, NotNull, DECIMAL(12), FK to sm_shohin}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSmShohinId() { return _columnSmShohinId; }
    /**
     * KONYU_SU: {NotNull, DECIMAL(4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuSu() { return _columnKonyuSu; }
    /**
     * KONYU_UNIT_PRICE: {NotNull, DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuUnitPrice() { return _columnKonyuUnitPrice; }
    /**
     * KONYU_TAX: {NotNull, DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuTax() { return _columnKonyuTax; }
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
        ls.add(columnStShhnKnyMsId());
        ls.add(columnStShohinKonyuId());
        ls.add(columnSmShohinId());
        ls.add(columnKonyuSu());
        ls.add(columnKonyuUnitPrice());
        ls.add(columnKonyuTax());
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
    protected UniqueInfo cpui() { return hpcpui(columnStShhnKnyMsId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnStShohinKonyuId());
        ls.add(columnSmShohinId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ST_SHOHIN_KONYU by my ST_SHOHIN_KONYU_ID, named 'stShohinKonyu'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignStShohinKonyu() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStShohinKonyuId(), StShohinKonyuDbm.getInstance().columnStShohinKonyuId());
        return cfi("FK_ST_SHHN_KNY_MS_ST_SHOHIN_KONYU", "stShohinKonyu", this, StShohinKonyuDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "stShhnKnyMsList", false);
    }
    /**
     * SM_SHOHIN by my SM_SHOHIN_ID, named 'smShohin'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSmShohin() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSmShohinId(), SmShohinDbm.getInstance().columnSmShohinId());
        return cfi("FK_ST_SHHN_KNY_MS_SM_SHOHIN", "smShohin", this, SmShohinDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "stShhnKnyMsList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.StShhnKnyMs"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.StShhnKnyMsCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.StShhnKnyMsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<StShhnKnyMs> getEntityType() { return StShhnKnyMs.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public StShhnKnyMs newEntity() { return new StShhnKnyMs(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((StShhnKnyMs)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((StShhnKnyMs)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
