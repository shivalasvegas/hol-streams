package com.speedment.example.domainmodel.sakila.sakila.sakila.film_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.film_list.FilmList;
import com.speedment.example.domainmodel.sakila.sakila.sakila.film_list.FilmListImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.film_list.FilmList}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmListSqlAdapter implements SqlAdapter<FilmList> {
    
    private final TableIdentifier<FilmList> tableIdentifier;
    
    protected GeneratedFilmListSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_list");
    }
    
    protected FilmList apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setFid(         getInt(resultSet, 1 + offset))
            .setTitle(       resultSet.getString(2 + offset))
            .setDescription( resultSet.getString(3 + offset))
            .setCategory(    resultSet.getString(4 + offset))
            .setPrice(       resultSet.getBigDecimal(5 + offset))
            .setLength(      getInt(resultSet, 6 + offset))
            .setRating(      resultSet.getString(7 + offset))
            .setActors(      resultSet.getString(8 + offset))
            ;
    }
    
    protected FilmListImpl createEntity() {
        return new FilmListImpl();
    }
    
    @Override
    public TableIdentifier<FilmList> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, FilmList> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, FilmList> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}