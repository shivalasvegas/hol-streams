package com.speedment.example.domainmodel.sakila.sakila.sakila.sales_by_store.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.sales_by_store.SalesByStore;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.sales_by_store.SalesByStore}-interface
 * representing entities of the {@code sales_by_store}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSalesByStore {
    
    /**
     * This Field corresponds to the {@link SalesByStore} field that can be
     * obtained using the {@link SalesByStore#getStore()} method.
     */
    StringField<SalesByStore, String> STORE = StringField.create(
        Identifier.STORE,
        o -> OptionalUtil.unwrap(o.getStore()),
        SalesByStore::setStore,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SalesByStore} field that can be
     * obtained using the {@link SalesByStore#getManager()} method.
     */
    StringField<SalesByStore, String> MANAGER = StringField.create(
        Identifier.MANAGER,
        o -> OptionalUtil.unwrap(o.getManager()),
        SalesByStore::setManager,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SalesByStore} field that can be
     * obtained using the {@link SalesByStore#getTotalSales()} method.
     */
    ComparableField<SalesByStore, BigDecimal, BigDecimal> TOTAL_SALES = ComparableField.create(
        Identifier.TOTAL_SALES,
        o -> OptionalUtil.unwrap(o.getTotalSales()),
        SalesByStore::setTotalSales,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the store of this SalesByStore. The store field corresponds to
     * the database column sakila.sakila.sales_by_store.store.
     * 
     * @return the store of this SalesByStore
     */
    Optional<String> getStore();
    
    /**
     * Returns the manager of this SalesByStore. The manager field corresponds
     * to the database column sakila.sakila.sales_by_store.manager.
     * 
     * @return the manager of this SalesByStore
     */
    Optional<String> getManager();
    
    /**
     * Returns the totalSales of this SalesByStore. The totalSales field
     * corresponds to the database column
     * sakila.sakila.sales_by_store.total_sales.
     * 
     * @return the totalSales of this SalesByStore
     */
    Optional<BigDecimal> getTotalSales();
    
    /**
     * Sets the store of this SalesByStore. The store field corresponds to the
     * database column sakila.sakila.sales_by_store.store.
     * 
     * @param store to set of this SalesByStore
     * @return      this SalesByStore instance
     */
    SalesByStore setStore(String store);
    
    /**
     * Sets the manager of this SalesByStore. The manager field corresponds to
     * the database column sakila.sakila.sales_by_store.manager.
     * 
     * @param manager to set of this SalesByStore
     * @return        this SalesByStore instance
     */
    SalesByStore setManager(String manager);
    
    /**
     * Sets the totalSales of this SalesByStore. The totalSales field
     * corresponds to the database column
     * sakila.sakila.sales_by_store.total_sales.
     * 
     * @param totalSales to set of this SalesByStore
     * @return           this SalesByStore instance
     */
    SalesByStore setTotalSales(BigDecimal totalSales);
    
    enum Identifier implements ColumnIdentifier<SalesByStore> {
        
        STORE       ("store"),
        MANAGER     ("manager"),
        TOTAL_SALES ("total_sales");
        
        private final String columnId;
        private final TableIdentifier<SalesByStore> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "sakila";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "sales_by_store";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<SalesByStore> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}