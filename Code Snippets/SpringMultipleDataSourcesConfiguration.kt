// MyAppDataSourceConfiguration.kt

@Configuration
@EnableJpaRepositories(
    basePackages = ["com.example.repositories"],
    entityManagerFactoryRef = "customEntityManagerFactory",
    transactionManagerRef = "customTransactionManager"
)
class MyAppDataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    fun myAppDataSourceProperties(): DataSourceProperties = DataSourceProperties()

    @Bean
    @Primary
    fun myAppDataSource(): DataSource =
        myAppDataSourceProperties()
            .initializeDataSourceBuilder()
            .type(HikariDataSource::class.java)
            .build()

    @Bean
    @Primary
    fun myAppEntityManagerFactory(
        builder: EntityManagerFactoryBuilder
    ): LocalContainerEntityManagerFactoryBean =
        builder
            .dataSource(myAppDataSource())
            .packages("com.example.entities")
            .persistenceUnit("postgres")
            .build()

    @Bean
    @Primary
    fun myAppTransactionManager(
        entityManagerFactory: EntityManagerFactory
    ): PlatformTransactionManager = JpaTransactionManager(entityManagerFactory)
}

// ExternalDataSourceConfiguration.kt

@Configuration
class ExternalDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.external.datasource")
    fun externalDataSourceProperties(): DataSourceProperties = DataSourceProperties()

    @Bean("externalDataSource")
    @ConfigurationProperties("spring.external.datasource")
    fun externalDataSource(): DataSource =
        externalDataSourceProperties()
            .initializeDataSourceBuilder()
            .type(HikariDataSource::class.java)
            .build()

    // Using JdbcTemplate to handle external data source operations
    @Bean("externalJdbcTemplate")
    fun externalJdbcTemplate(): JdbcTemplate? = JdbcTemplate(externalDataSource())

    // OR

    // Using entity manager factory to handle external data source operations
    @Bean("externalEntityManagerFactory")
    fun externalEntityManagerFactory(
        builder: EntityManagerFactoryBuilder,
        @Qualifier("externalDataSource") dataSource: DataSource
    ): LocalContainerEntityManagerFactoryBean? =
        builder
            .dataSource(externalDataSource())
            .packages("com.external.entities")
            .persistenceUnit("external")
            .build()
}
