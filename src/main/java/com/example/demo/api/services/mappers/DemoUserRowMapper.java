package com.example.demo.api.services.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.api.services.beans.DemoUser;

public class DemoUserRowMapper implements RowMapper<DemoUser> {

	@Override
    public DemoUser mapRow(ResultSet rs, int rowNum) throws SQLException 
    {
		DemoUser user = new DemoUser();
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));
        user.setUserName(rs.getString("userName"));
        user.setDescription(rs.getString("description"));
 
        return user;
    }
}
