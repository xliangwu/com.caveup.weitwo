package com.caveup.weitwo.biz.mybatis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * @author java中的boolean和jdbc中的char之间转换;true-Y;false-N
 */
public class BooleanTypeHandler implements TypeHandler<Boolean> {

    public Boolean getResult(ResultSet rs, String columnName) throws SQLException {
        String str = rs.getString(columnName);
        Boolean rt = Boolean.FALSE;
        if (str.equalsIgnoreCase("Y")) {
            rt = Boolean.TRUE;
        }
        return rt;
    }

    public Boolean getResult(ResultSet rs, int columnIndex) throws SQLException {
        String str = rs.getString(columnIndex);
        Boolean rt = Boolean.FALSE;
        if (str.equalsIgnoreCase("Y")) {
            rt = Boolean.TRUE;
        }
        return rt;
    }

    public Boolean getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String str = cs.getString(columnIndex);
        Boolean rt = Boolean.FALSE;
        if (str.equalsIgnoreCase("Y")) {
            rt = Boolean.TRUE;
        }
        return rt;
    }

    public void setParameter(PreparedStatement ps, int columnIndex, Boolean booleanValue, JdbcType jdbcType)
            throws SQLException {
        String value = (Boolean) booleanValue == true ? "Y" : "N";
        ps.setString(columnIndex, value);
    }

}
