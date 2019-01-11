import org.apache.calcite.config.CalciteConnectionConfig;
import org.apache.calcite.jdbc.CalciteSchema;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.calcite.sql.SqlIdentifier;
import org.apache.calcite.sql.validate.SqlMoniker;
import org.apache.calcite.sql.validate.SqlNameMatcher;
import org.apache.calcite.sql.validate.SqlValidatorCatalogReader;
import org.apache.calcite.sql.validate.SqlValidatorTable;

import java.util.List;

class MySqlValidatorCatalogReader implements SqlValidatorCatalogReader {
    public SqlValidatorTable getTable(List<String> list) {

        return null;
    }

    public RelDataType getNamedType(SqlIdentifier sqlIdentifier) {
        return null;
    }

    public List<SqlMoniker> getAllSchemaObjectNames(List<String> list) {
        return null;
    }

    public List<List<String>> getSchemaPaths() {
        return null;
    }

    public RelDataTypeField field(RelDataType relDataType, String s) {
        return null;
    }

    public SqlNameMatcher nameMatcher() {
        return null;
    }

    public boolean matches(String s, String s1) {
        return false;
    }

    public RelDataType createTypeFromProjection(RelDataType relDataType, List<String> list) {
        return null;
    }

    public boolean isCaseSensitive() {
        return false;
    }

    public CalciteSchema getRootSchema() {
        return null;
    }

    public CalciteConnectionConfig getConfig() {
        return null;
    }

    public <C> C unwrap(Class<C> aClass) {
        return null;
    }
}
