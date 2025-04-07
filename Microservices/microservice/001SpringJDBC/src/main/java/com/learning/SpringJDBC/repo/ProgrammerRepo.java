package com.learning.SpringJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learning.SpringJDBC.model.Programmer;

@Repository
public class ProgrammerRepo {
	
	
	private final JdbcTemplate jdbctemp;
	@Autowired
	public ProgrammerRepo(JdbcTemplate jdbctemp) {
		this.jdbctemp=jdbctemp;
	}
	
	public List<Programmer> getAllProgrammers(){
		String sql="select * from programmer";
		RowMapper<Programmer> mapper=new RowMapper<Programmer>() {
			
			@Override
			public Programmer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Programmer programmer=new Programmer();
				programmer.setProgammerId(rs.getString(1));
				programmer.setProgammerName(rs.getString(2));
				programmer.setProgammerLanguage(rs.getString(3));
				
				return programmer;
			}
		};
		System.out.println("before executing the query");
		List<Programmer> programmers=jdbctemp.query(sql, mapper);
		
		
		return programmers;
	}
	public void addProgrammer(Programmer programmer) {
		String sql="insert into programmer (pid,pname,planguage) values(?,?,?)";
		System.out.println("Inside addProgrammer "+programmer);
		String pid=programmer.getProgammerId();
		String pName=programmer.getProgammerId();
		String pLanguage=programmer.getProgammerId();
		int rows=jdbctemp.update(sql, pid,pName,pLanguage);
		System.out.println("rows effected "+rows);
	}
	public void message() {
		System.out.println("message");
	}

}
