package id.co.ogya.jwt;

//import javax.sql.DataSource;
//
//
//import org.postgresql.ds.PGSimpleDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//@Configuration
//@ComponentScan(basePackages = "id.co.ogya.*")
public class JdbcConfig {
	
//	@Autowired
//	private Environment env;
//	
//	@Bean
//	public DataSource psqlDataSource() {
//		PGSimpleDataSource dataSource = new  PGSimpleDataSource();
//		dataSource.setServerName(env.getProperty("postgres.server"));
//		dataSource.setDatabaseName(env.getProperty("postgres.databaseName"));
//		int portNumber = Integer.parseInt(env.getProperty("postgres.port"));
//		dataSource.setPortNumber(portNumber);
//		dataSource.setUser(env.getProperty("postgres.user"));
//		dataSource.setPassword(env.getProperty("postgres.password"));
//		return dataSource;
//		
//	}
//	
//	@Bean
//	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		jdbcTemplate.setResultsMapCaseInsensitive(true);
//		return jdbcTemplate;
//	}

}
