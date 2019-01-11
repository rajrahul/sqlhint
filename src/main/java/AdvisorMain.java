import org.apache.calcite.sql.SqlOperatorTable;
import org.apache.calcite.sql.advise.SqlAdvisor;
import org.apache.calcite.sql.fun.SqlStdOperatorTable;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParserUtil;
import org.apache.calcite.sql.type.SqlTypeFactoryImpl;
import org.apache.calcite.sql.validate.SqlConformanceEnum;
import org.apache.calcite.sql.validate.SqlMoniker;
import org.apache.calcite.sql.validate.SqlValidatorUtil;
import org.apache.calcite.sql.validate.SqlValidatorWithHints;

import java.util.List;

public class AdvisorMain {
    public static void main(String[] args) {
        SqlOperatorTable sot;

        SqlValidatorWithHints validator = SqlValidatorUtil.newValidator(
                new SqlStdOperatorTable(),
                new MySqlValidatorCatalogReader(),
                new SqlTypeFactoryImpl(new MyRelDataTypeSystemImpl()),
                SqlConformanceEnum.STRICT_2003);

        SqlAdvisor advisor = new SqlAdvisor(validator, SqlParser.Config.DEFAULT);
        String sql = "select * FROM s^";
        SqlParserUtil.StringAndPos sap = SqlParserUtil.findPos(sql);
        System.out.println(sap.cursor);
        List<SqlMoniker> results = advisor.getCompletionHints(sql, sap.cursor, new String[]{null});

        System.out.println(results);
        System.out.println("---------------");
    }

}
