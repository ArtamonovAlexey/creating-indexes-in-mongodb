package ru.artamonov.creatingindexesinmongo.config;

import liquibase.Contexts;
import liquibase.Liquibase;
import liquibase.database.DatabaseFactory;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.ext.mongodb.database.MongoLiquibaseDatabase;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoLiquibaseConfig {

    private final String databaseUrl = "mongodb://ds-pr-paym-mongo-test-1.ds.paym.local:27017,ds-pr-paym-mongo-test-2.ds.paym.local:27017,ds-pr-paym-mongo-arbiter-test-3.ds.paym.local:27017,m1-pr-paym-mongo-test-1.m1.paym.local:27017,m1-pr-paym-mongo-test-2.m1.paym.local:27017/operations?authSource=admin";

    private final String databaseUrl2 = "mongodb://localhost:27017/test2";

    @Bean
    public void loadChangeLog() {
        MongoLiquibaseDatabase database = getDatabase();

        Liquibase liquibase = new Liquibase("db.migration/db.changelog.master.xml", new ClassLoaderResourceAccessor(), database);
        try {
            liquibase.update("");
        } catch (LiquibaseException e) {
            e.printStackTrace();
        }
    }

    private MongoLiquibaseDatabase getDatabase() {
        MongoLiquibaseDatabase database = null;

        try {
            database = (MongoLiquibaseDatabase) DatabaseFactory.getInstance().openDatabase(databaseUrl2, null, null, null, null);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }

        return database;
    }

}
