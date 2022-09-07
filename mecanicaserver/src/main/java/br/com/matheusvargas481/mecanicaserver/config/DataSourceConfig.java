package br.com.matheusvargas481.mecanicaserver.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
//@ComponentScan("br.com.matheusvargas481.mecanicaserver.config")
public class DataSourceConfig {
    @Bean
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://localhost:6033/mecanica_db")
                .username("root")
                .password("root")
                .build();
    }
}

