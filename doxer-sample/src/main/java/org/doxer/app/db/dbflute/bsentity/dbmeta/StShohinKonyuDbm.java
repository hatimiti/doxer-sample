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
 * The DB meta of ST_SHOHIN_KONYU. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class StShohinKonyuDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final StShohinKonyuDbm _instance = new StShohinKonyuDbm();
    private StShohinKonyuDbm() {}
    public static StShohinKonyuDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getStShohinKonyuId(), (et, vl) -> ((StShohinKonyu)et).setStShohinKonyuId(ctl(vl)), "stShohinKonyuId");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getKonyuCmShainId(), (et, vl) -> ((StShohinKonyu)et).setKonyuCmShainId(ctl(vl)), "konyuCmShainId");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getKonyuYmd(), (et, vl) -> ((StShohinKonyu)et).setKonyuYmd((String)vl), "konyuYmd");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getKonyuTm(), (et, vl) -> ((StShohinKonyu)et).setKonyuTm((String)vl), "konyuTm");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getKonyuPrice(), (et, vl) -> ((StShohinKonyu)et).setKonyuPrice(cti(vl)), "konyuPrice");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getKonyuTax(), (et, vl) -> ((StShohinKonyu)et).setKonyuTax(cti(vl)), "konyuTax");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getRegUserId(), (et, vl) -> ((StShohinKonyu)et).setRegUserId((String)vl), "regUserId");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getRegTm(), (et, vl) -> ((StShohinKonyu)et).setRegTm(ctldt(vl)), "regTm");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getRegFuncCd(), (et, vl) -> ((StShohinKonyu)et).setRegFuncCd((String)vl), "regFuncCd");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getUpdUserId(), (et, vl) -> ((StShohinKonyu)et).setUpdUserId((String)vl), "updUserId");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getUpdTm(), (et, vl) -> ((StShohinKonyu)et).setUpdTm(ctldt(vl)), "updTm");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getUpdFuncCd(), (et, vl) -> ((StShohinKonyu)et).setUpdFuncCd((String)vl), "updFuncCd");
        setupEpg(_epgMap, et -> ((StShohinKonyu)et).getVersionNo(), (et, vl) -> ((StShohinKonyu)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((StShohinKonyu)et).getCmShain(), (et, vl) -> ((StShohinKonyu)et).setCmShain((OptionalEntity<CmShain>)vl), "cmShain");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ST_SHOHIN_KONYU";
    protected final String _tableDispName = "ST_SHOHIN_KONYU";
    protected final String _tablePropertyName = "stShohinKonyu";
    protected final TableSqlName _tableSqlName = new TableSqlName("ST_SHOHIN_KONYU", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStShohinKonyuId = cci("ST_SHOHIN_KONYU_ID", "ST_SHOHIN_KONYU_ID", null, null, Long.class, "stShohinKonyuId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_ABF66E19_1F0B_41C7_BF5F_2B45BFFE0EB7", false, null, null, null, "stShhnKnyMsList", null, false);
    protected final ColumnInfo _columnKonyuCmShainId = cci("KONYU_CM_SHAIN_ID", "KONYU_CM_SHAIN_ID", null, null, Long.class, "konyuCmShainId", null, false, false, true, "DECIMAL", 12, 0, null, false, null, null, "cmShain", null, null, false);
    protected final ColumnInfo _columnKonyuYmd = cci("KONYU_YMD", "KONYU_YMD", null, null, String.class, "konyuYmd", null, false, false, false, "CHAR", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKonyuTm = cci("KONYU_TM", "KONYU_TM", null, null, String.class, "konyuTm", null, false, false, false, "CHAR", 4, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKonyuPrice = cci("KONYU_PRICE", "KONYU_PRICE", null, null, Integer.class, "konyuPrice", null, false, false, true, "DECIMAL", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKonyuTax = cci("KONYU_TAX", "KONYU_TAX", null, null, Integer.class, "konyuTax", null, false, false, true, "DECIMAL", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegUserId = cci("REG_USER_ID", "REG_USER_ID", null, null, String.class, "regUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegTm = cci("REG_TM", "REG_TM", null, null, java.time.LocalDateTime.class, "regTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegFuncCd = cci("REG_FUNC_CD", "REG_FUNC_CD", null, null, String.class, "regFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUserId = cci("UPD_USER_ID", "UPD_USER_ID", null, null, String.class, "updUserId", null, false, false, true, "VARCHAR", 10, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdTm = cci("UPD_TM", "UPD_TM", null, null, java.time.LocalDateTime.class, "updTm", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdFuncCd = cci("UPD_FUNC_CD", "UPD_FUNC_CD", null, null, String.class, "updFuncCd", null, false, false, true, "VARCHAR", 9, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "DECIMAL", 9, 0, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * ST_SHOHIN_KONYU_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStShohinKonyuId() { return _columnStShohinKonyuId; }
    /**
     * KONYU_CM_SHAIN_ID: {NotNull, DECIMAL(12), FK to cm_shain}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuCmShainId() { return _columnKonyuCmShainId; }
    /**
     * KONYU_YMD: {CHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuYmd() { return _columnKonyuYmd; }
    /**
     * KONYU_TM: {CHAR(4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuTm() { return _columnKonyuTm; }
    /**
     * KONYU_PRICE: {NotNull, DECIMAL(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKonyuPrice() { return _columnKonyuPrice; }
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
        ls.add(columnStShohinKonyuId());
        ls.add(columnKonyuCmShainId());
        ls.add(columnKonyuYmd());
        ls.add(columnKonyuTm());
        ls.add(columnKonyuPrice());
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
    protected UniqueInfo cpui() { return hpcpui(columnStShohinKonyuId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * CM_SHAIN by my KONYU_CM_SHAIN_ID, named 'cmShain'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCmShain() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnKonyuCmShainId(), CmShainDbm.getInstance().columnCmShainId());
        return cfi("FK_ST_SHOHIN_KONYU_CM_SHAIN", "cmShain", this, CmShainDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "stShohinKonyuList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * ST_SHHN_KNY_MS by ST_SHOHIN_KONYU_ID, named 'stShhnKnyMsList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerStShhnKnyMsList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStShohinKonyuId(), StShhnKnyMsDbm.getInstance().columnStShohinKonyuId());
        return cri("FK_ST_SHHN_KNY_MS_ST_SHOHIN_KONYU", "stShhnKnyMsList", this, StShhnKnyMsDbm.getInstance(), mp, false, "stShohinKonyu");
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
    public String getEntityTypeName() { return "org.doxer.app.db.dbflute.exentity.StShohinKonyu"; }
    public String getConditionBeanTypeName() { return "org.doxer.app.db.dbflute.cbean.StShohinKonyuCB"; }
    public String getBehaviorTypeName() { return "org.doxer.app.db.dbflute.exbhv.StShohinKonyuBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<StShohinKonyu> getEntityType() { return StShohinKonyu.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public StShohinKonyu newEntity() { return new StShohinKonyu(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((StShohinKonyu)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((StShohinKonyu)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
