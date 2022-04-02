
package com.mycompany.projetobanco;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {
    public static void main(String[] args) {
        Connection config = new Connection();
        
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        
        List listaPokemon01 = template.queryForList("select * from pokemon");
        System.out.println(listaPokemon01);
    }
        
}
