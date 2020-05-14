package hotelmanage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

public class DataSourceProperties {
    @Bean(name="product")
    @Qualifier("product")
    public DataSource productDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name="room")
    @Qualifier("room")
    public DataSource roomDataSource(){
        return DataSourceBuilder.create().build();
    }
}
